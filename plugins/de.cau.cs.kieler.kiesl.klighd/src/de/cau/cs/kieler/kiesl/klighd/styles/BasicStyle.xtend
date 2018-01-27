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
import de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage
import de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage
import de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage
import de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KGridPlacementData
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KRenderingUtil
import de.cau.cs.kieler.klighd.krendering.LineCap
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import java.util.EnumMap
import java.util.Map

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
        entityThemeMap.put(Entity.INTERACTION, initInteractionTheme());
        entityThemeMap.put(Entity.LIFELINE, initLifelineTheme());
        entityThemeMap.put(Entity.EXECUTION, initExecutionTheme());
        entityThemeMap.put(Entity.MESSAGE, initMessageTheme());
        entityThemeMap.put(Entity.NOTE, initNoteTheme());
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Rendering
    
    @Inject extension KContainerRenderingExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KLabelExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KRenderingExtensions
    private static KRenderingFactory renderingFactory = KRenderingFactory::eINSTANCE
    
    public override renderInteraction(KNode kinteraction, Interaction interaction) {
        if (Strings.isNullOrEmpty(interaction.caption)) {
            // Give the interaction a simple invisible rectangle
            kinteraction.addRectangle() => [
                foregroundInvisible = true;
                backgroundInvisible = true;
            ]
            
        } else {
            // Add a proper surrounding rectangle with a caption
            val theme = entityThemeMap.get(Entity.INTERACTION);
            kinteraction.addRectangle() => [
                foreground = theme.color(ThemeColor.FOREGROUND);
                configureBackground(it, theme, ThemeColor.BACKGROUND, 90);
                
                setGridPlacement(1)
                    .from(LEFT, 0, 0, TOP, 0, 0)
                    .to(RIGHT, 0, 0, BOTTOM, 0, 0);
                
                val captionCell = addGridBox(0, 0,
                    createKPosition(LEFT, 0, 0, TOP, 0, 0),
                    createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0));
                (captionCell.placementData as KGridPlacementData).flexibleHeight = false;
                
                // This polygon will contain the interaction's name
                captionCell.addPolygon() => [
                    // We need the 0.5 offset to keep the polygon's lines exactly on the
                    // surrounding rectangle's lines
                    points += createKPosition(LEFT, 0.5f, 0, TOP, 0.5f, 0);
                    points += createKPosition(RIGHT, 0, 0, TOP, 0.5f, 0);
                    points += createKPosition(RIGHT, 0, 0, BOTTOM, 10, 0);
                    points += createKPosition(RIGHT, 10, 0, BOTTOM, 0, 0);
                    points += createKPosition(LEFT, 0.5f, 0, BOTTOM, 0, 0);
                    
                    foreground = theme.color(ThemeColor.FOREGROUND);
                    configureBackground(it, theme, ThemeColor.CAPTION_BACKGROUND, 90);
                    
                    setPointPlacementData(LEFT, 0, 0, TOP, 0, 0, H_LEFT, V_TOP, 10, 0, 0, 0);
                    
                    // This text will contain the interaction's name
                    addText(interaction.caption.trim()) => [
                        foreground = theme.color(ThemeColor.CAPTION_TEXT);
                        fontSize = 12;
                        
                        setSurroundingSpaceGrid(10, 0, 8, 0);
                    ];
                ];
                
                val contentCell = addGridBox(0, 0,
                    createKPosition(LEFT, 10, 0, TOP, 10, 0),
                    createKPosition(RIGHT, 10, 0, BOTTOM, 10, 0));
                contentCell.addChildArea();
            ];
        }
    }
    
    public override renderLifeline(KNode klifeline, Lifeline lifeline) {
        val theme = entityThemeMap.get(Entity.LIFELINE);
        klifeline.addRectangle() => [
            foregroundInvisible = true;
            backgroundInvisible = true;
            
            // The lifeline itself
            addPolyline() => [
                foreground = theme.color(ThemeColor.LIFELINE);
                lineStyle = LineStyle.DASH;
                
                points += createKPosition(LEFT, 0, 0.5f, TOP, 4, 0);
                points += createKPosition(LEFT, 0, 0.5f, BOTTOM, 0, 0);
            ];
            
            // The lifeline's header
            addRectangle() => [
                foreground = theme.color(ThemeColor.FOREGROUND);
                configureBackground(it, theme, ThemeColor.CAPTION_BACKGROUND, 90);
                
                setPointPlacementData(LEFT, 0, 0.5f, TOP, 0, 0, H_CENTRAL, V_TOP, 0, 20, 0, 0);
                
                // Guard against null captions here
                val actualCaption =
                    if (Strings.isNullOrEmpty(lifeline.caption)) {
                        "";
                    } else {
                        lifeline.caption.trim();
                    };
                
                addText(actualCaption) => [
                    foreground = theme.color(ThemeColor.CAPTION_TEXT);
                    fontSize = 12;
                    setSurroundingSpaceGrid(10, 0, 8, 0);
                ];
            ];
        ];
    }
    
    override renderRegularMessage(KEdge kmessage, KLabel klabel, RegularMessage message) {
        val lineStyle = switch (message.type) {
            case RESPONSE,
            case CREATE:
                LineStyle.DASH
            default:
                LineStyle.SOLID
        };
        
        val filledArrow = message.type == TwoParticipantsMessageType.SYNC;
        
        renderMessage(kmessage, klabel, lineStyle, filledArrow);
    }
    
    override renderLostOrFoundMessage(KEdge kmessage, KLabel klabel, LostOrFoundMessage message) {
        renderMessage(kmessage, klabel, LineStyle.SOLID, false);
    }
    
    override renderSelfMessage(KEdge kmessage, KLabel klabel, SelfMessage message) {
        renderMessage(kmessage, klabel, LineStyle.SOLID, false);
    }
    
    private def renderMessage(KEdge kmessage, KLabel klabel, LineStyle theLineStyle, boolean filledArrow) {
        val theme = entityThemeMap.get(Entity.MESSAGE);
        
        kmessage.addRoundedBendsPolyline(5f, 1f) => [
            foreground = theme.color(ThemeColor.FOREGROUND);
            lineStyle = theLineStyle;
            
            if (filledArrow) {
                addArrowDecorator();
            } else {
                addPolyline(1f) => [
                    foreground = theme.color(ThemeColor.FOREGROUND);
                    lineCap = LineCap.CAP_ROUND;
                    
                    points += createKPosition(LEFT, 0, 0, TOP, 0, 0);
                    points += createKPosition(RIGHT, 0, 0, TOP, 0, 0.5f);
                    points += createKPosition(LEFT, 0, 0, BOTTOM, 0, 0);
                    setDecoratorPlacementData(8, 6, -4, 1.0f, true);
                ];
            }
        ];
        
        if (klabel !== null) {
            klabel.data += renderingFactory.createKText() => [
                foreground = theme.color(ThemeColor.CAPTION_TEXT);
                fontSize = 10;
            ]
        }
    }
    
    override renderExecution(KNode kexecution) {
        val theme = entityThemeMap.get(Entity.EXECUTION);
        
        kexecution.addRectangle() => [
            foreground = theme.color(ThemeColor.FOREGROUND);
            configureBackground(it, theme, ThemeColor.BACKGROUND, 90);
        ]
    }
    
    override renderNote(KNode knote, String text) {
        val theme = entityThemeMap.get(Entity.NOTE);
        
        knote.addRectangle() => [
            foreground = theme.color(ThemeColor.FOREGROUND);
            configureBackground(it, theme, ThemeColor.BACKGROUND, 90);
            
            addText(text) => [
                foreground = theme.color(ThemeColor.CAPTION_TEXT);
                fontSize = 8;
                setSurroundingSpaceGrid(5, 0, 3, 0);
            ];
        ];
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Utilities
    
    /**
     * If the theme defines the given color, a solid background is defined on the rendering. Otherwise, we check
     * whether the given color has a gradient version. If so, and if the theme defines both gradient colors, we
     * define a gradient background.
     */
    private def void configureBackground(KRendering krendering, EntityColorTheme colorTheme,
        ThemeColor basicThemeColor, float angle) {
        
        // Check if the theme defines the basic color
        if (colorTheme.isDefined(basicThemeColor)) {
            krendering.background = colorTheme.color(basicThemeColor);
            
        } else {
            // Check whether the gradient colors exist
            val gradientColors = basicThemeColor.toGradientPair();
            if (gradientColors !== null
                && colorTheme.isDefined(gradientColors.key)
                && colorTheme.isDefined(gradientColors.value)) {
                
                krendering.setBackgroundGradient(
                    colorTheme.color(gradientColors.key),
                    colorTheme.color(gradientColors.value),
                    angle);
            }
        }
    }
    
    /**
     * Turns a basic theme color into its gradient version, if there is one.
     */
    def Pair<ThemeColor, ThemeColor> toGradientPair(ThemeColor themeColor) {
        return switch (themeColor) {
            case BACKGROUND:
                ThemeColor.BACKGROUND_START -> ThemeColor.BACKGROUND_END
            case CAPTION_BACKGROUND:
                ThemeColor.CAPTION_BACKGROUND_START -> ThemeColor.CAPTION_BACKGROUND_END
            default:
                null
        };
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Color Themes
    
    /**
     * The different components of a diagram that we can provide colors for.
     */
    protected static enum Entity {
        INTERACTION,
        LIFELINE,
        EXECUTION,
        MESSAGE,
        NOTE;
    }
    
    /**
     * The different colors we theme.
     */
    protected static enum ThemeColor {
        FOREGROUND,
        BACKGROUND,
        BACKGROUND_START,
        BACKGROUND_END,
        CAPTION_BACKGROUND,
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
        
        /**
         * Checks whether the theme defines the given color.
         */
        protected def boolean isDefined(ThemeColor c) {
            return colorMap.containsKey(c);
        }
        
    }
    
    /**
     * Returns the entity theme to be used for interactions.
     */
    protected def EntityColorTheme initInteractionTheme() {
        return new EntityColorTheme()
            .define(ThemeColor.BACKGROUND, "white")
            .define(ThemeColor.FOREGROUND, "black")
            .define(ThemeColor.CAPTION_BACKGROUND, "white")
            .define(ThemeColor.CAPTION_TEXT, "black");
    }
    
    /**
     * Returns the entity theme to be used for lifelines.
     */
    protected def EntityColorTheme initLifelineTheme() {
        return new EntityColorTheme()
            .define(ThemeColor.BACKGROUND, "white")
            .define(ThemeColor.FOREGROUND, "black")
            .define(ThemeColor.CAPTION_BACKGROUND, "white")
            .define(ThemeColor.CAPTION_TEXT, "black")
            .define(ThemeColor.LIFELINE, "black");
    }
    
    /**
     * Returns the entity theme to be used for messages and their captions.
     */
    protected def EntityColorTheme initMessageTheme() {
        return new EntityColorTheme()
            .define(ThemeColor.FOREGROUND, "black")
            .define(ThemeColor.CAPTION_TEXT, "black");
    }
    
    /**
     * Returns the entity theme to be used for executions.
     */
    protected def EntityColorTheme initExecutionTheme() {
        return new EntityColorTheme()
            .define(ThemeColor.BACKGROUND, "white")
            .define(ThemeColor.FOREGROUND, "black");
    }
    
    /**
     * Returns the entity theme to be used for interactions.
     */
    protected def EntityColorTheme initNoteTheme() {
        return new EntityColorTheme()
            .define(ThemeColor.BACKGROUND, "white")
            .define(ThemeColor.FOREGROUND, "black")
            .define(ThemeColor.CAPTION_TEXT, "black");
    }
    
}