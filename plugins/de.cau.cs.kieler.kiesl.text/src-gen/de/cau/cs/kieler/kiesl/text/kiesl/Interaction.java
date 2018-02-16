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
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.Interaction#getNote <em>Note</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.Interaction#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.Interaction#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends CommunicationParticipant
{
  /**
   * Returns the value of the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Note</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' attribute.
   * @see #setNote(String)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getInteraction_Note()
   * @model
   * @generated
   */
  String getNote();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.Interaction#getNote <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' attribute.
   * @see #getNote()
   * @generated
   */
  void setNote(String value);

  /**
   * Returns the value of the '<em><b>Lifelines</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kiesl.text.kiesl.Lifeline}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lifelines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lifelines</em>' containment reference list.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getInteraction_Lifelines()
   * @model containment="true"
   * @generated
   */
  EList<Lifeline> getLifelines();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kiesl.text.kiesl.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getInteraction_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // Interaction
