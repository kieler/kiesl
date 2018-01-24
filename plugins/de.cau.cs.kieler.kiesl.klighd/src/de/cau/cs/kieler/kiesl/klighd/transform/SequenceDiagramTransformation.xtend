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
package de.cau.cs.kieler.kiesl.klighd.transform

import com.google.inject.Inject
import de.cau.cs.kieler.kiesl.klighd.SequenceDiagramSynthesis.Options
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline
import de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import org.eclipse.elk.alg.sequence.options.NodeType
import org.eclipse.elk.alg.sequence.options.SequenceDiagramOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.FixedLayouterOptions

/**
 * Synthesis that transforms KieSL sequence diagrams into KLighD graphs laid out with ELK's sequence diagram
 * layout algorithm.
 */
public class SequenceDiagramTransformation {
    
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KNodeExtensions
    
    private var Options options;
    
    /**
     * Entry point.
     */
    public def transformModel(Interaction interaction, Options options) {
        this.options = options;
        
        // The root of the diagram
        val kroot = createNode();
        kroot.setProperty(CoreOptions.ALGORITHM, FixedLayouterOptions.ALGORITHM_ID);
        
        // The main interaction node and its lifelines
        val kinteraction = toNode(interaction);
        kroot.children += kinteraction;
        
        interaction.lifelines.forEach[ ll |
            kinteraction.children += toNode(ll);
        ];
        
        interaction.elements.forEach[ e |
            
        ];
        
        return kroot;
    }
    
    /**
     * Creates a node to represent the given interaction.
     */
    private def KNode create kinteraction : interaction.createNode() toNode(Interaction interaction) {
        options.synthesis.associateWith(kinteraction, interaction);
        
        // Configure layout options
        kinteraction.setProperty(CoreOptions.ALGORITHM, SequenceDiagramOptions.ALGORITHM_ID);
        kinteraction.setProperty(SequenceDiagramOptions.NODE_TYPE, NodeType.SURROUNDING_INTERACTION);
        kinteraction.setProperty(SequenceDiagramOptions.LIFELINE_SORTING_STRATEGY, options.llsort);
        
        // TODO Check which of these we may need as well
//        .addLayoutParam(SequenceDiagramOptions.SPACING_BORDER, 10f)
//        .addLayoutParam(SequenceDiagramOptions.MESSAGE_SPACING, 65f)
//        .addLayoutParam(SequenceDiagramOptions.LIFELINE_Y_POS, 50f)
//        .addLayoutParam(SequenceDiagramOptions.LIFELINE_HEADER_HEIGHT, 40f)
//        .addLayoutParam(SequenceDiagramOptions.AREA_HEADER_HEIGHT, 45f)
        
        options.style.render(kinteraction, interaction);
    }

    /**
     * Creates a node to represent the given lifeline
     */
    private def KNode create klifeline : lifeline.createNode() toNode(Lifeline lifeline) {
        options.synthesis.associateWith(klifeline, lifeline);
        
        // Configure layout options
        klifeline.setProperty(SequenceDiagramOptions.NODE_TYPE, NodeType.LIFELINE);
        
        // Define the lifeline's rendering
        options.style.render(klifeline, lifeline);
    }
    
    private def KEdge create kmessage : message.createEdge() toEdge(RegularMessage message) {
        options.synthesis.associateWith(kmessage, message);
        
        // TODO Make this work with gates as well
        if (!(message.source instanceof Lifeline && message.target instanceof Lifeline)) {
            return;
        }
        
        // Set the source and target lifelines
        kmessage.source = toNode(message.source as Lifeline);
        kmessage.target = toNode(message.target as Lifeline);
        
        // TODO Set the edge order for the layout algorithm to be able to infer said order based on y coordinates
        
        // TODO Check for and possibly create source note
        
        // TODO Check for and possibly create target note
        
        // TODO Check whether an execution should be started at the source lifeline, and possibly start one
        
        // TODO Check whether an execution should be started at the target lifeline, and possibly start one
        
        // TODO Add the message to the executions currently active on the source lifeline
        
        // TODO Add the message to the executions currently active on the target lifeline
        
        // TODO Check whether executions should be terminated at the source lifeline, and possibly terminate them
        
        // TODO Check whether executions should be terminated at the target lifeline, and possibly terminate them
        
        // TODO Add to any active sections in fragments
        
        // Configure the edge's rendering
        
    }
        
}
