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
 * The thesis style uses the color theme of a certain dissertation thesis.
 */
class ThesisStyle extends BasicStyle {
    
    override protected initInteractionTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND, "white")
            .define(FOREGROUND, "#2c2c2c")
            .define(CAPTION_BACKGROUND, "#e6e6e6")
            .define(CAPTION_TEXT, "#676767");
    }
    
    override protected initLifelineTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND, "white")
            .define(FOREGROUND, "#2c2c2c")
            .define(CAPTION_BACKGROUND, "#dde3e8")
            .define(CAPTION_TEXT, "#2c2c2c")
            .define(LIFELINE, "#2c2c2c");
    }
    
    override protected EntityColorTheme initLifelineDestructionTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND, "white")
            .define(FOREGROUND, "#2c2c2c");
    }
    
    override protected initCombinedFragmentTheme() {
        return new EntityColorTheme()
            .define(FOREGROUND, "#2c2c2c")
            .define(CAPTION_BACKGROUND, "#505361")
            .define(CAPTION_TEXT, "white");
    }
    
    override protected EntityColorTheme initMessageTheme() {
        return new EntityColorTheme()
            .define(FOREGROUND, "#2c2c2c")
            .define(CAPTION_TEXT, "#2c2c2c")
            .define(CAPTION_FOREGROUND, "#2c2c2c")
            .define(CAPTION_BACKGROUND, "white");
    }
    
    override protected EntityColorTheme initLostFoundDummyTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND, "#dde3e8")
            .define(FOREGROUND, "#505361");
    }
    
    override protected EntityColorTheme initExecutionTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND_START, "#dde3e8")
            .define(BACKGROUND_END, "#dde3e8")
            .define(FOREGROUND, "#2c2c2c");
    }
    
    override protected EntityColorTheme initNoteTheme() {
        return new EntityColorTheme()
            .define(BACKGROUND, "#e6e6e6")
            .define(FOREGROUND, "#676767")
            .define(CAPTION_TEXT, "#676767");
    }
    
}