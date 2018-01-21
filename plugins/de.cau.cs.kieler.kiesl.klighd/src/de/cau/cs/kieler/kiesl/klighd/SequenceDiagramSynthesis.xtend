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

import com.google.common.base.Strings
import com.google.inject.Inject
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KGridPlacementData
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.krendering.LineStyle

/**
 * Synthesis that transforms KieSL sequence diagrams into KLighD graphs laid out with ELK's sequence diagram
 * layout algorithm.
 */
public class SequenceDiagramSynthesis extends AbstractDiagramSynthesis<Interaction> {
    
    @Inject extension KColorExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KLabelExtensions
    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    
    /**
     * Entry point.
     */
    override transform(Interaction interaction) {
        // The root of the diagram
        val kroot = createNode();
        
        // The main interaction node and its lifelines
        val kinteraction = createInteractionNode(interaction);
        kroot.children += kinteraction;
        
        interaction.lifelines.forEach[ ll |
            kinteraction.children += createLifelineNode(ll);
        ];
        
        return kroot;
    }
    
    /**
     * Creates a node to represent the given interaction.
     */
    private def KNode create kinteraction : interaction.createNode() createInteractionNode(Interaction interaction) {
        kinteraction.associateWith(interaction);
        
        // TODO Configure layout options
        
        if (Strings.isNullOrEmpty(interaction.caption)) {
            // Give the interaction a simple invisible rectangle
            kinteraction.addRectangle() => [ rect |
                rect.foregroundInvisible = true;
                rect.backgroundInvisible = true;
            ]
            
        } else {
            // Add a proper surrounding rectangle with a caption
            kinteraction.addRectangle() => [ container |
                container.foreground = "#c0c0c0".color;
                container.background = "white".color;
                
                container.setGridPlacement(1)
                    .from(LEFT, 0, 0, TOP, 0, 0)
                    .to(RIGHT, 0, 0, BOTTOM, 0, 0);
                
                val captionCell = container.addGridBox(0, 0,
                    createKPosition(LEFT, 0, 0, TOP, 0, 0),
                    createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0));
                (captionCell.placementData as KGridPlacementData).flexibleHeight = false;
                
                // This polygon will contain the interaction's name
                captionCell.addPolygon() => [ poly |
                    // We need the 0.5 offset to keep the polygon's lines exactly on the
                    // surrounding rectangle's lines
                    poly.points += createKPosition(LEFT, 0.5f, 0, TOP, 0.5f, 0);
                    poly.points += createKPosition(RIGHT, 0, 0, TOP, 0.5f, 0);
                    poly.points += createKPosition(RIGHT, 0, 0, BOTTOM, 10, 0);
                    poly.points += createKPosition(RIGHT, 10, 0, BOTTOM, 0, 0);
                    poly.points += createKPosition(LEFT, 0.5f, 0, BOTTOM, 0, 0);
                    
                    poly.foreground = "#c0c0c0".color;
                    poly.setBackgroundGradient("white".color, "#f2f2f2".color, 90);
                    
                    poly.setPointPlacementData(LEFT, 0, 0, TOP, 0, 0, H_LEFT, V_TOP, 10, 0, 0, 0);
                    
                    // This text will contain the interaction's name
                    poly.addText(interaction.caption.trim()) => [text |
                        text.foreground = "#666666".color;
                        text.fontSize = 12;
                        
                        text.setSurroundingSpaceGrid(10, 0, 8, 0);
                    ];
                ];
                
                val contentCell = container.addGridBox(0, 0,
                    createKPosition(LEFT, 10, 0, TOP, 10, 0),
                    createKPosition(RIGHT, 10, 0, BOTTOM, 10, 0));
                contentCell.addChildArea();
            ];
        }
    }

    /**
     * Creates a node to represent the given lifeline
     */
    private def KNode create klifeline : lifeline.createNode() createLifelineNode(Lifeline lifeline) {
        klifeline.associateWith(lifeline);
        
        // TODO Configure layout options
        
        // Define the lifeline's rendering
        klifeline.addRectangle() => [ container |
            container.foregroundInvisible = true;
            container.backgroundInvisible = true;
            
            // The lifeline itself
            container.addPolyline() => [ line |
                line.foreground = "#666666".color;
                line.lineStyle = LineStyle.DASH;
                
                line.points += createKPosition(LEFT, 0, 0.5f, TOP, 4, 0);
                line.points += createKPosition(LEFT, 0, 0.5f, BOTTOM, 0, 0);
            ];
            
            // The lifeline's header
            container.addRectangle() => [ captionRect |
                captionRect.foreground = "#c0c0c0".color;
                captionRect.setBackgroundGradient("white".color, "#f2f2f2".color, 90);
                
                captionRect.setPointPlacementData(LEFT, 0, 0.5f, TOP, 0, 0, H_CENTRAL, V_TOP, 0, 20, 0, 0);
                
                // Guard against null captions here
                val actualCaption =
                    if (Strings.isNullOrEmpty(lifeline.caption)) {
                        "";
                    } else {
                        lifeline.caption.trim();
                    };
                
                captionRect.addText(actualCaption) => [ text |
                    text.fontSize = 12;
                    text.setSurroundingSpaceGrid(10, 0, 8, 0);
                ];
            ];
        ];
    }    
        
}