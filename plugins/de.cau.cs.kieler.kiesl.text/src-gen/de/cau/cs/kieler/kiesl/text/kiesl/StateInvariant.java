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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getInvariant <em>Invariant</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getStateInvariant()
 * @model
 * @generated
 */
public interface StateInvariant extends Element
{
  /**
   * Returns the value of the '<em><b>Lifeline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lifeline</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lifeline</em>' reference.
   * @see #setLifeline(Lifeline)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getStateInvariant_Lifeline()
   * @model
   * @generated
   */
  Lifeline getLifeline();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getLifeline <em>Lifeline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lifeline</em>' reference.
   * @see #getLifeline()
   * @generated
   */
  void setLifeline(Lifeline value);

  /**
   * Returns the value of the '<em><b>Invariant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invariant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invariant</em>' attribute.
   * @see #setInvariant(String)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getStateInvariant_Invariant()
   * @model
   * @generated
   */
  String getInvariant();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getInvariant <em>Invariant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invariant</em>' attribute.
   * @see #getInvariant()
   * @generated
   */
  void setInvariant(String value);

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
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getStateInvariant_Note()
   * @model
   * @generated
   */
  String getNote();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getNote <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' attribute.
   * @see #getNote()
   * @generated
   */
  void setNote(String value);

} // StateInvariant
