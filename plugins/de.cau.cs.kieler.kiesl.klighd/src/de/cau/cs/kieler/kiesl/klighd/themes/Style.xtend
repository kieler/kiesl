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
package de.cau.cs.kieler.kiesl.klighd.themes

import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KRenderingUtil
import java.util.EnumMap
import java.util.Map

/**
 * A theme provides things such as colors and font sizes to be plugged in to the actual transformation.
 */
public abstract class Style {
    
    /**
     * The different components of a diagram that we can provide colors for.
     */
    public static enum Entity {
        INTERACTION,
        LIFELINE;
    }
    
    /**
     * The different colors we theme.
     */
    public static enum StyleColor {
        FOREGROUND,
        BACKGROUND,
        CAPTION_BACKGROUND_START,
        CAPTION_BACKGROUND_END,
        CAPTION_TEXT,
        LIFELINE;
    }
    
    /**
     * Provides the concrete data for a specific kind of entity.
     */
    public final static class EntityStyle {
        
        /** This map stores all of our color strings. */
        private val Map<StyleColor, String> colorMap = new EnumMap(StyleColor);
        
        /**
         * Returns the color for the given thing.
         * 
         * @param thing said thing.
         * @return the color to be used in the rendering model.
         */
        public def KColor color(StyleColor thing) {
            return KRenderingUtil.getColor(colorMap.get(thing));
        }
        
        /**
         * Sets the given color string as the one to be used for the given color.
         */
        protected def EntityStyle define(StyleColor c, String s) {
            colorMap.put(c, s);
            return this;
        }
        
    }
    
    
    /** Map of entities to their respective themes. */
    private val Map<Entity, EntityStyle> entityThemeMap = new EnumMap(Entity);
    
    new() {
        entityThemeMap.put(Entity.INTERACTION, initInteraction());
        entityThemeMap.put(Entity.LIFELINE, initLifeline());
    }
    
    /**
     * Returns the theme for entities.
     */
    public final def EntityStyle interaction() {
        return entityThemeMap.get(Entity.INTERACTION);
    }
    
    /**
     * Returns the entity theme to be used for interactions.
     */
    protected abstract def EntityStyle initInteraction();
    
    /**
     * Returns the theme for lifelines.
     */
    public final def EntityStyle lifeline() {
        return entityThemeMap.get(Entity.LIFELINE);
    }
    /**
     * Returns the entity theme to be used for lifelines.
     */
    protected abstract def EntityStyle initLifeline();
    
}