/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *  *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kiesl.text.kiesl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse#getCaption <em>Caption</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse#getLifelines <em>Lifelines</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getInteractionUse()
 * @model
 * @generated
 */
public interface InteractionUse extends Element
{
  /**
   * Returns the value of the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caption</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caption</em>' attribute.
   * @see #setCaption(String)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getInteractionUse_Caption()
   * @model
   * @generated
   */
  String getCaption();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse#getCaption <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caption</em>' attribute.
   * @see #getCaption()
   * @generated
   */
  void setCaption(String value);

  /**
   * Returns the value of the '<em><b>Lifelines</b></em>' reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kiesl.text.kiesl.Lifeline}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lifelines</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lifelines</em>' reference list.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getInteractionUse_Lifelines()
   * @model
   * @generated
   */
  EList<Lifeline> getLifelines();

} // InteractionUse
