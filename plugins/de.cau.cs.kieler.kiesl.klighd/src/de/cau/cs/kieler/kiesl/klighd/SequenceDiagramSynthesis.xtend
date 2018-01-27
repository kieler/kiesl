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
import org.eclipse.elk.alg.sequence.options.LifelineSortingStrategy

/**
 * Synthesis that transforms KieSL sequence diagrams into KLighD graphs laid out with ELK's sequence diagram
 * layout algorithm.
 */
public class SequenceDiagramSynthesis extends AbstractDiagramSynthesis<Interaction> {
    
    //////////////////////////////////////////////////////////////////////////////////////////////
    // Synthesis Options
    
    private static val STYLE_BORING = "Boring";
    private static val STYLE_STYLISH = "Stylish";
    public static val SynthesisOption STYLE = SynthesisOption.createChoiceOption(
        "Style", ImmutableList.of(
            STYLE_BORING,
            STYLE_STYLISH),
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
    
    override getDisplayedSynthesisOptions() {
        return ImmutableList.of(STYLE, LLSORT);
    }
    
    // TODO Instantiate as needed in switch below
    @Inject BasicStyle styleBasic;
    @Inject StylishStyle styleStylish;
    
    /**
     * Container class for easy handling of synthesis options.
     */
    public static final class Options {
        public val SequenceDiagramSynthesis synthesis;
        public val BasicStyle style;
        public val LifelineSortingStrategy llsort;
        
        new(SequenceDiagramSynthesis s) {
            synthesis = s;
            
            style = switch (s.getObjectValue(STYLE)) {
                case STYLE_BORING:
                    s.styleBasic
                case STYLE_STYLISH:
                    s.styleStylish
            }
            
            llsort = switch (s.getObjectValue(LLSORT)) {
                case LLSORT_INTERACTIVE:
                    LifelineSortingStrategy.INTERACTIVE
                case LLSORT_MESSAGE_ORDER:
                    LifelineSortingStrategy.LAYER_BASED
                case LLSORT_SHORT_MESSAGE:
                    LifelineSortingStrategy.SHORT_MESSAGES
            }
        }
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////
    // Transformation
    
    @Inject SequenceDiagramTransformation transformation;
    
    /**
     * Entry point.
     */
    override transform(Interaction interaction) {
        return transformation.transformModel(interaction, new Options(this));
    }
        
}