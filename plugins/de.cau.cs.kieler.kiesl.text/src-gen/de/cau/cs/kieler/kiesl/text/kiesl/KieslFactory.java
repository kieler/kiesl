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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage
 * @generated
 */
public interface KieslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KieslFactory eINSTANCE = de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction</em>'.
   * @generated
   */
  Interaction createInteraction();

  /**
   * Returns a new object of class '<em>Lifeline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lifeline</em>'.
   * @generated
   */
  Lifeline createLifeline();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Communication Participant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Communication Participant</em>'.
   * @generated
   */
  CommunicationParticipant createCommunicationParticipant();

  /**
   * Returns a new object of class '<em>Regular Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regular Message</em>'.
   * @generated
   */
  RegularMessage createRegularMessage();

  /**
   * Returns a new object of class '<em>Lost Or Found Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lost Or Found Message</em>'.
   * @generated
   */
  LostOrFoundMessage createLostOrFoundMessage();

  /**
   * Returns a new object of class '<em>Self Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Self Message</em>'.
   * @generated
   */
  SelfMessage createSelfMessage();

  /**
   * Returns a new object of class '<em>Lifeline Destruction Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lifeline Destruction Event</em>'.
   * @generated
   */
  LifelineDestructionEvent createLifelineDestructionEvent();

  /**
   * Returns a new object of class '<em>Interaction Use</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction Use</em>'.
   * @generated
   */
  InteractionUse createInteractionUse();

  /**
   * Returns a new object of class '<em>Combined Fragment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Combined Fragment</em>'.
   * @generated
   */
  CombinedFragment createCombinedFragment();

  /**
   * Returns a new object of class '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Section</em>'.
   * @generated
   */
  Section createSection();

  /**
   * Returns a new object of class '<em>Continuation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continuation</em>'.
   * @generated
   */
  Continuation createContinuation();

  /**
   * Returns a new object of class '<em>State Invariant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Invariant</em>'.
   * @generated
   */
  StateInvariant createStateInvariant();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  KieslPackage getKieslPackage();

} //KieslFactory
