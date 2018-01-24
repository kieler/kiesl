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

import de.cau.cs.kieler.kiesl.text.kiesl.Interaction;
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline;
import de.cau.cs.kieler.klighd.kgraph.KNode;

/**
 * A style knows how to add renderings to KGraph elements for them to look cool in a sequence
 * diagram.
 */
public interface IStyle {
    
    /**
     * Adds rendering information to the given node which represents the given interaction.
     */
    void render(KNode kinteraction, Interaction interaction);
    
    /**
     * Adds rendering information to the given node which represents the given lifeline.
     */
    void render(KNode klifeline, Lifeline lifeline);
    
}
