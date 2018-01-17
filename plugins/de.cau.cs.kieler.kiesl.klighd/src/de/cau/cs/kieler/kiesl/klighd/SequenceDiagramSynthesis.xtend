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

import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction

/**
 * Synthesis that transforms KieSL sequence diagrams into KLighD graphs laid out with ELK's sequence diagram
 * layout algorithm.
 */
public class SequenceDiagramSynthesis extends AbstractDiagramSynthesis<Interaction> {
    
    /**
     * Entry point.
     */
    override transform(Interaction model) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
}