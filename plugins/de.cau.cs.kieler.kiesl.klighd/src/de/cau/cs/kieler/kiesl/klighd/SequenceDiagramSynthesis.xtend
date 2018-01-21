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
import de.cau.cs.kieler.kiesl.klighd.themes.Style
import de.cau.cs.kieler.kiesl.klighd.transform.SequenceDiagramTransformation
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.kiesl.klighd.themes.StylishStyle

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
        "Style", ImmutableList::of(
            STYLE_BORING,
            STYLE_STYLISH),
        STYLE_STYLISH);
    
    override getDisplayedSynthesisOptions() {
        return ImmutableList::of(STYLE);
    }
    
    /**
     * Container class for easy handling of synthesis options.
     */
    public static final class Options {
        public val SequenceDiagramSynthesis synthesis;
        public val Style style;
        
        new(SequenceDiagramSynthesis s) {
            synthesis = s;
            
            style = switch (s.getObjectValue(STYLE)) {
                case STYLE_BORING:
                    new StylishStyle()
                case STYLE_STYLISH:
                    new StylishStyle()
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