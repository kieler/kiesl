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
package de.cau.cs.kieler.kiesl.text.ide

import com.google.inject.Guice
import de.cau.cs.kieler.kiesl.text.KieslRuntimeModule
import de.cau.cs.kieler.kiesl.text.KieslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class KieslIdeSetup extends KieslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new KieslRuntimeModule, new KieslIdeModule))
	}
	
}
