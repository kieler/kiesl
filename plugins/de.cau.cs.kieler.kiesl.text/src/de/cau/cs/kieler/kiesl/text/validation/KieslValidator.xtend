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
package de.cau.cs.kieler.kiesl.text.validation


/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class KieslValidator extends AbstractKieslValidator {
    
    // TODO Check that a regular message has at least one involved lifeline
    // TODO Check that a regular message involves two different participants
    // TODO Check that executions are only started at lifelines, not at interactions
    // TODO Check whether a message wants to end more executions than there are
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					KieslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
}
