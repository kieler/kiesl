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
package de.cau.cs.kieler.kiesl.klighd;

import org.eclipse.elk.graph.ElkLabel;

import de.cau.cs.kieler.klighd.labels.management.AbstractKlighdLabelManager;
import de.cau.cs.kieler.klighd.labels.management.LabelManagementUtil;
import de.cau.cs.kieler.klighd.microlayout.Bounds;
import de.cau.cs.kieler.klighd.microlayout.PlacementUtil;

/**
 * Removes the arguments of method calls.
 */
public class MethodCallLabelManager extends AbstractKlighdLabelManager {

    @Override
    public Result doResizeLabel(ElkLabel label, double targetWidth) {
        if (getMode() == Mode.TARGET_WIDTH) {
            // Check if the label is too long
            Bounds textBounds = PlacementUtil.estimateTextSize(
                    LabelManagementUtil.fontDataFor(label), label.getText());
            
            if (textBounds.getWidth() <= targetWidth) {
                return Result.unmodified();
            }
        }
        
        StringBuilder newLabel = new StringBuilder();

        boolean foundMethodCall = false;
        boolean previousCharWasCharacterOrDigit = false;
        int openParentheses = 0;

        for (char c : label.getText().toCharArray()) {
            if (c == ')') {
                // If there's only one pair of parentheses open, simply append the closing one
                if (openParentheses == 0) {
                    newLabel.append(c);
                } else if (openParentheses > 0) {
                    openParentheses--;
                }

                previousCharWasCharacterOrDigit = false;

            } else if (c == '(') {
                // If no parentheses are currently open and if the previous character was a method
                // name character,
                // we open a new set of parentheses
                if (openParentheses == 0) {
                    if (previousCharWasCharacterOrDigit) {
                        foundMethodCall = true;
                        openParentheses++;
                        newLabel.append("(...)");
                    } else {
                        newLabel.append(c);
                    }
                } else {
                    openParentheses++;
                }

                previousCharWasCharacterOrDigit = false;

            } else {
                previousCharWasCharacterOrDigit = Character.isLetterOrDigit(c);

                if (openParentheses == 0) {
                    newLabel.append(c);
                }
            }
        }
        
        if (foundMethodCall) {
            return Result.modified(newLabel.toString());
        } else {
            return Result.unmodified();
        }
    }
}
