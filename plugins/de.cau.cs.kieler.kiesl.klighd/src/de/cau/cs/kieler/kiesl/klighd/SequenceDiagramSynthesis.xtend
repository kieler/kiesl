/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kiesl.klighd

import com.google.common.collect.ImmutableList
import com.google.inject.Inject
import de.cau.cs.kieler.kiesl.klighd.styles.BasicStyle
import de.cau.cs.kieler.kiesl.klighd.styles.StylishStyle
import de.cau.cs.kieler.kiesl.klighd.transform.SequenceDiagramTransformation
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import org.eclipse.elk.alg.sequence.options.LabelSideSelection
import org.eclipse.elk.alg.sequence.options.LifelineSortingStrategy
import de.cau.cs.kieler.kiesl.klighd.styles.ThesisStyle
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.labels.management.ListLabelManager
import org.eclipse.elk.core.labels.LabelManagementOptions
import de.cau.cs.kieler.klighd.labels.management.TypeConditionLabelManager
import de.cau.cs.kieler.klighd.labels.management.TruncatingLabelManager
import de.cau.cs.kieler.klighd.labels.management.AbstractKlighdLabelManager

/**
 * Synthesis that transforms KieSL sequence diagrams into KLighD graphs laid out with ELK's sequence diagram
 * layout algorithm.
 */
public class SequenceDiagramSynthesis extends AbstractDiagramSynthesis<Interaction> {
    
    //////////////////////////////////////////////////////////////////////////////////////////////
    // Synthesis Options
    
    private static val STYLE_BORING = "Boring";
    private static val STYLE_STYLISH = "Stylish";
    private static val STYLE_THESIS = "Thesis";
    public static val SynthesisOption STYLE = SynthesisOption.createChoiceOption(
        "Style", ImmutableList.of(
            STYLE_BORING,
            STYLE_STYLISH,
            STYLE_THESIS),
        STYLE_STYLISH);
    
    private static val LLSORT_INTERACTIVE = "Declaration Order";
    private static val LLSORT_MESSAGE_ORDER = "Message Order";
    private static val LLSORT_SHORT_MESSAGE = "Short Messages";
    private static val SynthesisOption LLSORT = SynthesisOption.createChoiceOption(
        "Lifeline Order", ImmutableList.of(
            LLSORT_INTERACTIVE,
            LLSORT_MESSAGE_ORDER,
            LLSORT_SHORT_MESSAGE),
        LLSORT_INTERACTIVE);
    
    private static val LABELS_INLINE = "Inline";
    private static val LABELS_CONSISTENT = "Above";
    private static val LABELS_DIRECTIONAL = "Direction-dependent";
    private static val SynthesisOption LABELS = SynthesisOption.createChoiceOption(
        "Label Placement", ImmutableList.of(
            LABELS_INLINE,
            LABELS_CONSISTENT,
            LABELS_DIRECTIONAL
        ),
        LABELS_INLINE);
    
    private static val SynthesisOption LABEL_MANAGEMENT = SynthesisOption.createCheckOption("Label Management", false);
    
    
    override getDisplayedSynthesisOptions() {
        return ImmutableList.of(STYLE, LLSORT, LABELS, LABEL_MANAGEMENT);
    }
    
    // TODO Instantiate as needed in switch below
    @Inject BasicStyle styleBasic;
    @Inject StylishStyle styleStylish;
    @Inject ThesisStyle styleThesis;
    
    /**
     * Container class for easy handling of synthesis options.
     */
    public static final class Options {
        public val SequenceDiagramSynthesis synthesis;
        public val BasicStyle style;
        public val LifelineSortingStrategy llsort;
        public val LabelSideSelection labelSide;
        public val boolean inlineLabels;
        public val boolean labelManagement;
        
        new(SequenceDiagramSynthesis s) {
            synthesis = s;
            
            style = switch (s.getObjectValue(STYLE)) {
                case STYLE_BORING:
                    s.styleBasic
                case STYLE_STYLISH:
                    s.styleStylish
                case STYLE_THESIS:
                    s.styleThesis
            }
            
            llsort = switch (s.getObjectValue(LLSORT)) {
                case LLSORT_INTERACTIVE:
                    LifelineSortingStrategy.INTERACTIVE
                case LLSORT_MESSAGE_ORDER:
                    LifelineSortingStrategy.LAYER_BASED
                case LLSORT_SHORT_MESSAGE:
                    LifelineSortingStrategy.SHORT_MESSAGES
            }
            
            labelSide = switch (s.getObjectValue(LABELS)) {
                case LABELS_DIRECTIONAL:
                    LabelSideSelection.DIRECTION_UP
                default:
                    LabelSideSelection.ALWAYS_UP
            }
            
            inlineLabels = s.getObjectValue(LABELS) == LABELS_INLINE;
            labelManagement = s.getBooleanValue(LABEL_MANAGEMENT);
        }
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////
    // Transformation
    
    @Inject SequenceDiagramTransformation transformation;
    
    /**
     * Entry point.
     */
    override transform(Interaction interaction) {
        val options = new Options(this);
        val kmodel = transformation.transformModel(interaction, options);
        
        if (options.labelManagement) {
            configureLabelManagement(kmodel);
        }
        
        return kmodel;
    }
    
    /**
     * Installs label managers.
     */
    private def void configureLabelManagement(KNode kgraph) {
        val labelManagers = new ListLabelManager() => [
            // Label manager for comments
            addLabelManager(TypeConditionLabelManager.wrapForCommentLabels(new ListLabelManager() => [
                // We want both truncators to run
                withStopOnFirstHit(false);
                
                // The first label manager always removes all but the first 5 words. The second is just to ensure
                // that what remains doesn't enlarge the diagram.
                addLabelManager(new TruncatingLabelManager()
                    .truncateAfterFirstWords(5)
                    .setMode(AbstractKlighdLabelManager.Mode.ALWAYS_ON));
                addLabelManager(new TruncatingLabelManager());
            ]));
            
            // Label manager for messages
            addLabelManager(TypeConditionLabelManager.wrapForEdgeLabels(new TruncatingLabelManager()));
        ];
                
        kgraph.setLayoutOption(LabelManagementOptions.LABEL_MANAGER, labelManagers);
    }
        
}