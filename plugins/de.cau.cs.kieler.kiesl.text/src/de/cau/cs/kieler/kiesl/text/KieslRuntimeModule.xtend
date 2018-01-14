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
package de.cau.cs.kieler.kiesl.text

import de.cau.cs.kieler.kiesl.text.conversion.KieslValueConverters
import de.cau.cs.kieler.kiesl.text.formatting2.KieslFormatter
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.formatting2.IFormatter2

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class KieslRuntimeModule extends AbstractKieslRuntimeModule {
    
    override Class<? extends IValueConverterService> bindIValueConverterService() {
        return KieslValueConverters;
    }
    
}
