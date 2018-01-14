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
package de.cau.cs.kieler.kiesl.text.conversion

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.util.Strings

/**
 * We need a custom value converter for one of our rules.
 */
public class KieslValueConverters extends DefaultTerminalConverters {
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // INT_GREATER_ZERO_OR_ALL
    
    private val IValueConverter<Integer> intGreaterZeroOrAllValueConverter = new IntGreaterZeroOrAllValueConverter();
    
    @ValueConverter(rule = "INT_GREATER_ZERO_OR_ALL")
    public def IValueConverter<Integer> INT_GREATER_ZERO_OR_ALL() {
        return intGreaterZeroOrAllValueConverter;
    }
    
    private static class IntGreaterZeroOrAllValueConverter implements IValueConverter<Integer> {
        
        override toString(Integer value) throws ValueConverterException {
            if (value == -1) {
                return "all";
            } else {
                return value.toString();
            }
        }
        
        override toValue(String string, INode node) throws ValueConverterException {
            if (Strings.isEmpty(string)) {
                throw new ValueConverterException("Couldn't convert empty string to int", node, null);
            } else if ("all".equals(string.trim())) {
                return -1;
            }
            
            try {
                return Integer.parseInt(string);
            } catch (NumberFormatException e) {
                throw new ValueConverterException("Couldn't convert '" + string + "' to int", node, e);
            }
        }
        
    }
    
}