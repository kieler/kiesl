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
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getCombinedFragment()
 * @model
 * @generated
 */
public interface CombinedFragment extends Element
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragmentType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragmentType
   * @see #setType(CombinedFragmentType)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getCombinedFragment_Type()
   * @model
   * @generated
   */
  CombinedFragmentType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragmentType
   * @see #getType()
   * @generated
   */
  void setType(CombinedFragmentType value);

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.kiesl.text.kiesl.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getCombinedFragment_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

} // CombinedFragment
