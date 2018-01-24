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
package de.cau.cs.kieler.kiesl.klighd.styles

import com.google.common.base.Strings
import com.google.inject.Inject
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KGridPlacementData
import de.cau.cs.kieler.klighd.krendering.KRenderingUtil
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import java.util.EnumMap
import java.util.Map
import de.cau.cs.kieler.klighd.krendering.LineStyle

/**
 * The basic style has a basic style of rendering things that should be quite enough for a sequence diagram to
 * potentially look good. Subclasses can override the {@code initX()} methods to provide custom colors used by the
 * style.
 */
public class BasicStyle implements IStyle {
    
    /** Map of entities to the color themes that should be used to render them. */
    private val Map<Entity, EntityColorTheme> entityThemeMap = new EnumMap(Entity);
    
    /**
     * The constructor calls the {@code initX()} methods to initialize the colours to be used for rendering.
     */
    public new() {
        entityThemeMap.put(Entity.INTERACTION, initInteraction());
        entityThemeMap.put(Entity.LIFELINE, initLifeline());
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Rendering
    
    @Inject extension KContainerRenderingExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KNodeExtensions
    @Inject extension KRenderingExtensions
    
    public override render(KNode kinteraction, Interaction interaction) {
        if (Strings.isNullOrEmpty(interaction.caption)) {
            // Give the interaction a simple invisible rectangle
            kinteraction.addRectangle() => [ rect |
                rect.foregroundInvisible = true;
                rect.backgroundInvisible = true;
            ]
            
        } else {
            // Add a proper surrounding rectangle with a caption
            val theme = entityThemeMap.get(Entity.INTERACTION);
            kinteraction.addRectangle() => [ container |
                container.foreground = theme.color(ThemeColor.FOREGROUND);
                container.background = theme.color(ThemeColor.BACKGROUND);
                
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
                    
                    poly.foreground = theme.color(ThemeColor.FOREGROUND);
                    poly.setBackgroundGradient(
                        theme.color(ThemeColor.CAPTION_BACKGROUND_START),
                        theme.color(ThemeColor.CAPTION_BACKGROUND_END),
                        90);
                    
                    poly.setPointPlacementData(LEFT, 0, 0, TOP, 0, 0, H_LEFT, V_TOP, 10, 0, 0, 0);
                    
                    // This text will contain the interaction's name
                    poly.addText(interaction.caption.trim()) => [text |
                        text.foreground = theme.color(ThemeColor.CAPTION_TEXT);
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
    
    public override render(KNode klifeline, Lifeline lifeline) {
        val theme = entityThemeMap.get(Entity.LIFELINE);
        klifeline.addRectangle() => [ container |
            container.foregroundInvisible = true;
            container.backgroundInvisible = true;
            
            // The lifeline itself
            container.addPolyline() => [ line |
                line.foreground = theme.color(ThemeColor.LIFELINE);
                line.lineStyle = LineStyle.DASH;
                
                line.points += createKPosition(LEFT, 0, 0.5f, TOP, 4, 0);
                line.points += createKPosition(LEFT, 0, 0.5f, BOTTOM, 0, 0);
            ];
            
            // The lifeline's header
            container.addRectangle() => [ captionRect |
                captionRect.foreground = theme.color(ThemeColor.FOREGROUND);
                captionRect.setBackgroundGradient(
                        theme.color(ThemeColor.CAPTION_BACKGROUND_START),
                        theme.color(ThemeColor.CAPTION_BACKGROUND_END),
                        90);
                
                captionRect.setPointPlacementData(LEFT, 0, 0.5f, TOP, 0, 0, H_CENTRAL, V_TOP, 0, 20, 0, 0);
                
                // Guard against null captions here
                val actualCaption =
                    if (Strings.isNullOrEmpty(lifeline.caption)) {
                        "";
                    } else {
                        lifeline.caption.trim();
                    };
                
                captionRect.addText(actualCaption) => [ text |
                    text.foreground = theme.color(ThemeColor.CAPTION_TEXT);
                    text.fontSize = 12;
                    text.setSurroundingSpaceGrid(10, 0, 8, 0);
                ];
            ];
        ];
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Color Themes
    
    /**
     * The different components of a diagram that we can provide colors for.
     */
    protected static enum Entity {
        INTERACTION,
        LIFELINE;
    }
    
    /**
     * The different colors we theme.
     */
    protected static enum ThemeColor {
        FOREGROUND,
        BACKGROUND,
        CAPTION_BACKGROUND_START,
        CAPTION_BACKGROUND_END,
        CAPTION_TEXT,
        LIFELINE;
    }
    
    /**
     * A color theme for a specific kind of entity.
     */
    protected final static class EntityColorTheme {
        
        /** This map stores all of our color strings. */
        private val Map<ThemeColor, String> colorMap = new EnumMap(ThemeColor);
        
        /**
         * Returns the color for the given thing.
         * 
         * @param thing said thing.
         * @return the color to be used in the rendering model.
         */
        public def KColor color(ThemeColor thing) {
            return KRenderingUtil.getColor(colorMap.get(thing));
        }
        
        /**
         * Sets the given color string as the one to be used for the given color.
         */
        protected def EntityColorTheme define(ThemeColor c, String s) {
            colorMap.put(c, s);
            return this;
        }
        
    }
    
    /**
     * Returns the entity theme to be used for interactions.
     */
    protected def EntityColorTheme initInteraction() {
        return new EntityColorTheme()
            .define(ThemeColor.BACKGROUND, "white")
            .define(ThemeColor.FOREGROUND, "black")
            .define(ThemeColor.CAPTION_BACKGROUND_START, "white")
            .define(ThemeColor.CAPTION_BACKGROUND_END, "white")
            .define(ThemeColor.CAPTION_TEXT, "black");
    }
    
    /**
     * Returns the entity theme to be used for lifelines.
     */
    protected def EntityColorTheme initLifeline() {
        return new EntityColorTheme()
            .define(ThemeColor.BACKGROUND, "white")
            .define(ThemeColor.FOREGROUND, "black")
            .define(ThemeColor.CAPTION_BACKGROUND_START, "white")
            .define(ThemeColor.CAPTION_BACKGROUND_END, "white")
            .define(ThemeColor.CAPTION_TEXT, "black")
            .define(ThemeColor.LIFELINE, "black");
    }
    
}