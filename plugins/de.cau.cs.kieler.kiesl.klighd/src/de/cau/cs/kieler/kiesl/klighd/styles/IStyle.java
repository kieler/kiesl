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
package de.cau.cs.kieler.kiesl.klighd.styles;

import de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment;
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction;
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline;
import de.cau.cs.kieler.kiesl.text.kiesl.LifelineDestructionEvent;
import de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage;
import de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage;
import de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage;
import de.cau.cs.kieler.klighd.kgraph.KEdge;
import de.cau.cs.kieler.klighd.kgraph.KLabel;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.labels.decoration.LabelDecorationConfigurator;

/**
 * A style knows how to add renderings to KGraph elements for them to look cool in a sequence
 * diagram.
 */
public interface IStyle {
    
    /**
     * Adds rendering information to the given node which represents the given interaction.
     */
    void renderInteraction(KNode kinteraction, Interaction interaction);
    
    /**
     * Adds rendering information to the given node which represents the given lifeline.
     */
    void renderLifeline(KNode klifeline, Lifeline lifeline);
    
    /**
     * Adds rendering information to the given node which represents the given lifeline
     * destruction event.
     */
    void renderLifelineDestruction(KNode kdestroy, LifelineDestructionEvent destroy);
    
    /**
     * Adds rendering information to the given node which represents the given combined fragment.
     */
    void renderCombinedFragment(KNode kfragment, CombinedFragment fragment);
    
    /**
     * Adds rendering information to the given edge and its label which represents the given
     * message.
     */
    void renderRegularMessage(KEdge kmessage, KLabel klabel, RegularMessage message);
    
    /**
     * Adds rendering information to the given edge and its label which represents the given
     * message. The dummy node that represents the lost target or the found source is rendered
     * as well.
     */
    void renderLostOrFoundMessage(KEdge kmessage, KLabel klabel, KNode kdummy,
            LostOrFoundMessage message);
    
    /**
     * Adds rendering information to the given edge and its label which represents the given
     * message.
     */
    void renderSelfMessage(KEdge kmessage, KLabel klabel, SelfMessage message);
    
    /**
     * Adds rendering information to the given node which represents an execution.
     */
    void renderExecution(KNode kexecution);
    
    /**
     * Adds rendering information to the given node which represents a note with the given text.
     */
    void renderNote(KNode knote, KLabel klabel);
    
    /**
     * Configures the configurator for proper label rendering.
     */
    void setupLabelDecorationConfigurator(LabelDecorationConfigurator configurator);
    
}
