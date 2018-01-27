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

import static de.cau.cs.kieler.kiesl.klighd.styles.BasicStyle.ThemeColor.*;

/**
 * The stylish theme. It's stylish.
 */
class StylishStyle extends BasicStyle {
    
    override protected initInteractionTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND, "white")
            .define(FOREGROUND, "#c0c0c0")
            .define(CAPTION_BACKGROUND_START, "white")
            .define(CAPTION_BACKGROUND_END, "#f2f2f2")
            .define(CAPTION_TEXT, "#666666");
    }
    
    override protected initLifelineTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND, "white")
            .define(FOREGROUND, "#c0c0c0")
            .define(CAPTION_BACKGROUND_START, "white")
            .define(CAPTION_BACKGROUND_END, "#f2f2f2")
            .define(CAPTION_TEXT, "black")
            .define(LIFELINE, "#666666");
    }
    
    override protected EntityColorTheme initLifelineDestructionTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND, "white")
            .define(FOREGROUND, "#666666");
    }
    
    override protected initCombinedFragmentTheme() {
        return new EntityColorTheme()
            .define(FOREGROUND, "#c0c0c0")
            .define(CAPTION_BACKGROUND_START, "white")
            .define(CAPTION_BACKGROUND_END, "#f2f2f2")
            .define(CAPTION_TEXT, "#666666");
    }
    
    override protected EntityColorTheme initMessageTheme() {
        return new EntityColorTheme()
            .define(FOREGROUND, "#666666")
            .define(CAPTION_TEXT, "black");
    }
    
    override protected EntityColorTheme initLostFoundDummyTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND, "#fafafa")
            .define(FOREGROUND, "#666666");
    }
    
    override protected EntityColorTheme initExecutionTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND_START, "white")
            .define(BACKGROUND_END, "#f2f2f2")
            .define(FOREGROUND, "#c0c0c0");
    }
    
    override protected EntityColorTheme initNoteTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND, "#fafafa")
            .define(FOREGROUND, "#c0c0c0")
            .define(CAPTION_TEXT, "#666666");
    }
    
}