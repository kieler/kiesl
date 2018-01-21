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

import static de.cau.cs.kieler.kiesl.klighd.themes.Style.StyleColor.*

/**
 * The stylish theme. It's stylish.
 */
class StylishStyle extends Style {
    
    override protected initInteraction() {
        return new EntityStyle()
            .define(BACKGROUND, "white")
            .define(FOREGROUND, "#c0c0c0")
            .define(CAPTION_BACKGROUND_START, "white")
            .define(CAPTION_BACKGROUND_END, "#f2f2f2")
            .define(CAPTION_TEXT, "#666666");
    }
    
    override protected initLifeline() {
        return new EntityStyle()
            .define(BACKGROUND, "white")
            .define(FOREGROUND, "#c0c0c0")
            .define(CAPTION_BACKGROUND_START, "white")
            .define(CAPTION_BACKGROUND_END, "#f2f2f2")
            .define(CAPTION_TEXT, "black")
            .define(LIFELINE, "#666666");
    }
    
}