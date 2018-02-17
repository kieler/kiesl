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
import de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline
import de.cau.cs.kieler.kiesl.text.kiesl.LifelineDestructionEvent
import de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage
import de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage
import de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage
import de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType
import de.cau.cs.kieler.klighd.actions.FocusAndContextAction
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KGridPlacementData
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KRenderingUtil
import de.cau.cs.kieler.klighd.krendering.LineCap
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.labels.decoration.LabelDecorationConfigurator
import de.cau.cs.kieler.klighd.labels.decoration.RectangleDecorator
import java.awt.Color
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
        entityThemeMap.put(Entity.LIFELINE_DESTRUCTION, initLifelineDestructionTheme());
        entityThemeMap.put(Entity.FRAGMENT, initCombinedFragmentTheme());
        entityThemeMap.put(Entity.EXECUTION, initExecutionTheme());
        entityThemeMap.put(Entity.MESSAGE, initMessageTheme());
        entityThemeMap.put(Entity.LOST_FOUND_DUMMY, initLostFoundDummyTheme());
        entityThemeMap.put(Entity.NOTE, initNoteTheme());
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Rendering
    
    @Inject extension KContainerRenderingExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KNodeExtensions
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
            renderFragmentLikeThingWithCaption(
                kinteraction, interaction.caption, entityThemeMap.get(Entity.INTERACTION), true);
        }
    }
    
    /**
     * Renders boxes for interactions, fragments, and similar things. Depending on whether or not we're rendering
     * the surrounding interaction, we use different settings. For instance, the surrounding interaction gets a
     * visible background as well as a larger caption font size.
     */
    private def renderFragmentLikeThingWithCaption(KNode kthing, String caption, EntityColorTheme theme,
        boolean isSurroundingInteraction) {
            
        // Some values depend on whether we have a large caption or not
        val cornerSize = if (isSurroundingInteraction) 10 else 5;
        val textPaddingHorizontal = if (isSurroundingInteraction) 10 else 5;
        val textPaddingVertical = if (isSurroundingInteraction) 8 else 3;
        val captionFontSize = if (isSurroundingInteraction) 12 else 10;
            
        kthing.addRectangle() => [
            foreground = theme.color(ThemeColor.FOREGROUND);
            if (isSurroundingInteraction) {
                configureBackground(it, theme, ThemeColor.BACKGROUND, 90);
            } else {
                backgroundInvisible = true;
            }
            
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
                points += createKPosition(RIGHT, 0, 0, BOTTOM, cornerSize, 0);
                points += createKPosition(RIGHT, cornerSize, 0, BOTTOM, 0, 0);
                points += createKPosition(LEFT, 0.5f, 0, BOTTOM, 0, 0);
                
                foreground = theme.color(ThemeColor.FOREGROUND);
                configureBackground(it, theme, ThemeColor.CAPTION_BACKGROUND, 90);
                
                setPointPlacementData(LEFT, 0, 0, TOP, 0, 0, H_LEFT, V_TOP, 10, 0, 0, 0);
                
                // This text will contain the interaction's name
                addText(caption.trim()) => [
                    foreground = theme.color(ThemeColor.CAPTION_TEXT);
                    fontSize = captionFontSize;
                    
                    setSurroundingSpaceGrid(textPaddingHorizontal, 0, textPaddingVertical, 0);
                ];
            ];
            
//            if (isSurroundingInteraction) {
//                val contentCell = addGridBox(0, 0,
//                    createKPosition(LEFT, 10, 0, TOP, 10, 0),
//                    createKPosition(RIGHT, 10, 0, BOTTOM, 10, 0));
//                contentCell.addChildArea();
//            }
        ];
        
    }
    
    public override renderLifeline(KNode klifeline, Lifeline lifeline) {
        val theme = entityThemeMap.get(Entity.LIFELINE);
        klifeline.addRectangle() => [
            foregroundInvisible = true;
            backgroundInvisible = true;
            
            setGridPlacement(1)
                .from(LEFT, 0, 0, TOP, 0, 0)
                .to(RIGHT, 0, 0, BOTTOM, 0, 0);
            
            // The lifeline's header
            addRectangle() => [
                foreground = theme.color(ThemeColor.FOREGROUND);
                configureBackground(it, theme, ThemeColor.CAPTION_BACKGROUND, 90);
                
                setGridPlacementData(it, 0, 0,
                    createKPosition(LEFT, 0, 0, TOP, 0, 0),
                    createKPosition(RIGHT, 0, 0, BOTTOM, 0, 0));
                (placementData as KGridPlacementData).flexibleHeight = false;
                
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
            
            // The lifeline itself, inside a rectangle
            addPolyline() => [
                foreground = theme.color(ThemeColor.LIFELINE);
                lineStyle = LineStyle.DASH;
                
                points += createKPosition(LEFT, 0, 0.5f, TOP, 1, 0);
                points += createKPosition(LEFT, 0, 0.5f, BOTTOM, 0, 0);
            ];
        ];
    }
    
    public override renderLifelineDestruction(KNode kdestroy, LifelineDestructionEvent destroy) {
        kdestroy.setNodeSize(15, 15);
        
        val theme = entityThemeMap.get(Entity.LIFELINE_DESTRUCTION);
        kdestroy.addRectangle() => [
            foregroundInvisible = true;
            configureBackground(it, theme, ThemeColor.BACKGROUND, 90);
            
            addPolyline() => [
                foreground = theme.color(ThemeColor.FOREGROUND);
                from(LEFT, 0, 0, TOP, 0, 0)
                to(RIGHT, 0, 0, BOTTOM, 0, 0);
            ];
            addPolyline() => [
                foreground = theme.color(ThemeColor.FOREGROUND);
                from(RIGHT, 0, 0, TOP, 0, 0)
                to(LEFT, 0, 0, BOTTOM, 0, 0);
            ];
        ];
    }
    
    public override renderCombinedFragment(KNode kfragment, CombinedFragment fragment) {
        renderFragmentLikeThingWithCaption(
                kfragment, fragment.type.literal, entityThemeMap.get(Entity.FRAGMENT), false);
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
    
    override renderLostOrFoundMessage(KEdge kmessage, KLabel klabel, KNode kdummy, LostOrFoundMessage message) {
        renderMessage(kmessage, klabel, LineStyle.SOLID, false);
        
        // Render the dummy as well
        val theme = entityThemeMap.get(Entity.LOST_FOUND_DUMMY);
        kdummy.addEllipse() => [
            foreground = theme.color(ThemeColor.FOREGROUND);
            configureBackground(it, theme, ThemeColor.BACKGROUND, 90);
        ]
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
    
    override setupLabelDecorationConfigurator(LabelDecorationConfigurator configurator) {
        val theme = entityThemeMap.get(Entity.MESSAGE);
        
        configurator.withLabelTextRenderingProvider([ container, label | createTextRendering(container, label) ])
        
        val backgroundProvider = RectangleDecorator.create().withBackground(
            theme.color(ThemeColor.CAPTION_BACKGROUND).toAwtColor(220));
        configurator.addDecoratorRenderingProvider(backgroundProvider);
        
        // The line decorator produced too much visual clutter in our sequence diagrams
//        configurator.addDecoratorRenderingProvider(
//            LinesDecorator.create()
//                .withColor(theme.color(ThemeColor.CAPTION_FOREGROUND).toAwtColor(220))
//                .withBrackets(false));
    }
    
    private def KRendering createTextRendering(KContainerRendering container, KLabel label) {
        val theme = entityThemeMap.get(Entity.MESSAGE);
        
        val rendering = KRenderingFactory.eINSTANCE.createKText() => [ text |
            text.foreground = theme.color(ThemeColor.CAPTION_TEXT);
            text.fontSize = 10;
            text.addSingleClickAction(FocusAndContextAction.ID);
        ];
        
        container.children += rendering;
        return rendering;
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
    
    /**
     * Turns a KColor into a regular AWT Color.
     */
    private def Color toAwtColor(KColor kcolor, int alpha) {
        return new Color(kcolor.red, kcolor.green, kcolor.blue, alpha);
    }
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Color Themes
    
    /**
     * The different components of a diagram that we can provide colors for.
     */
    protected static enum Entity {
        INTERACTION,
        LIFELINE,
        LIFELINE_DESTRUCTION,
        FRAGMENT,
        EXECUTION,
        MESSAGE,
        LOST_FOUND_DUMMY,
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
        CAPTION_FOREGROUND,
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
     * Returns the entity theme to be used for lifelines.
     */
    protected def EntityColorTheme initLifelineDestructionTheme() {
        return new EntityColorTheme()
            .define(ThemeColor.BACKGROUND, "white")
            .define(ThemeColor.FOREGROUND, "black");
    }
    
    /**
     * Returns the entity theme to be used for interactions.
     */
    protected def EntityColorTheme initCombinedFragmentTheme() {
        return new EntityColorTheme()
            .define(ThemeColor.FOREGROUND, "black")
            .define(ThemeColor.CAPTION_BACKGROUND, "white")
            .define(ThemeColor.CAPTION_TEXT, "black");
    }
    
    /**
     * Returns the entity theme to be used for messages and their captions.
     */
    protected def EntityColorTheme initMessageTheme() {
        return new EntityColorTheme()
            .define(ThemeColor.FOREGROUND, "black")
            .define(ThemeColor.CAPTION_TEXT, "black")
            .define(ThemeColor.CAPTION_FOREGROUND, "black")
            .define(ThemeColor.CAPTION_BACKGROUND, "white");
    }
    
    /**
     * Returns the entity theme to be used for messages and their captions.
     */
    protected def EntityColorTheme initLostFoundDummyTheme() {
        return new EntityColorTheme()
            .define(ThemeColor.BACKGROUND, "white")
            .define(ThemeColor.FOREGROUND, "black");
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