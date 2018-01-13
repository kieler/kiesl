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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslFactory
 * @model kind="package"
 * @generated
 */
public interface KieslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kiesl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/Kiesl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kiesl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KieslPackage eINSTANCE = de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.CommunicationParticipantImpl <em>Communication Participant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.CommunicationParticipantImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getCommunicationParticipant()
   * @generated
   */
  int COMMUNICATION_PARTICIPANT = 3;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNICATION_PARTICIPANT__CAPTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNICATION_PARTICIPANT__NAME = 1;

  /**
   * The number of structural features of the '<em>Communication Participant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMUNICATION_PARTICIPANT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionImpl <em>Interaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getInteraction()
   * @generated
   */
  int INTERACTION = 0;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__CAPTION = COMMUNICATION_PARTICIPANT__CAPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__NAME = COMMUNICATION_PARTICIPANT__NAME;

  /**
   * The feature id for the '<em><b>Lifelines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__LIFELINES = COMMUNICATION_PARTICIPANT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION__ELEMENTS = COMMUNICATION_PARTICIPANT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_FEATURE_COUNT = COMMUNICATION_PARTICIPANT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LifelineImpl <em>Lifeline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.LifelineImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getLifeline()
   * @generated
   */
  int LIFELINE = 1;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFELINE__CAPTION = COMMUNICATION_PARTICIPANT__CAPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFELINE__NAME = COMMUNICATION_PARTICIPANT__NAME;

  /**
   * The number of structural features of the '<em>Lifeline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFELINE_FEATURE_COUNT = COMMUNICATION_PARTICIPANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.ElementImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl <em>Regular Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getRegularMessage()
   * @generated
   */
  int REGULAR_MESSAGE = 4;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__SOURCE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__TYPE = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__CAPTION = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__TARGET = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Source Start End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__SOURCE_START_END_EXEC = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Source Start Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__SOURCE_START_EXEC = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Source End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__SOURCE_END_EXEC = ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Source End Exec Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__SOURCE_END_EXEC_COUNT = ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Target Start End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__TARGET_START_END_EXEC = ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Target Start Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__TARGET_START_EXEC = ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Target End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__TARGET_END_EXEC = ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Target End Exec Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__TARGET_END_EXEC_COUNT = ELEMENT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Source Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__SOURCE_NOTE = ELEMENT_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Target Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE__TARGET_NOTE = ELEMENT_FEATURE_COUNT + 13;

  /**
   * The number of structural features of the '<em>Regular Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGULAR_MESSAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 14;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl <em>Lost Or Found Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getLostOrFoundMessage()
   * @generated
   */
  int LOST_OR_FOUND_MESSAGE = 5;

  /**
   * The feature id for the '<em><b>Lifeline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOST_OR_FOUND_MESSAGE__LIFELINE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOST_OR_FOUND_MESSAGE__TYPE = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lost Or Found</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOST_OR_FOUND_MESSAGE__LOST_OR_FOUND = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOST_OR_FOUND_MESSAGE__CAPTION = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Start End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOST_OR_FOUND_MESSAGE__START_END_EXEC = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Start Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOST_OR_FOUND_MESSAGE__START_EXEC = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOST_OR_FOUND_MESSAGE__END_EXEC = ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>End Exec Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOST_OR_FOUND_MESSAGE__END_EXEC_COUNT = ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOST_OR_FOUND_MESSAGE__NOTE = ELEMENT_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Lost Or Found Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOST_OR_FOUND_MESSAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.SelfMessageImpl <em>Self Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.SelfMessageImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getSelfMessage()
   * @generated
   */
  int SELF_MESSAGE = 6;

  /**
   * The feature id for the '<em><b>Lifeline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_MESSAGE__LIFELINE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_MESSAGE__TYPE = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_MESSAGE__CAPTION = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Start End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_MESSAGE__START_END_EXEC = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Start Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_MESSAGE__START_EXEC = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_MESSAGE__END_EXEC = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>End Exec Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_MESSAGE__END_EXEC_COUNT = ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_MESSAGE__NOTE = ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Self Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_MESSAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LifelineDestructionEventImpl <em>Lifeline Destruction Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.LifelineDestructionEventImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getLifelineDestructionEvent()
   * @generated
   */
  int LIFELINE_DESTRUCTION_EVENT = 7;

  /**
   * The feature id for the '<em><b>Lifeline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFELINE_DESTRUCTION_EVENT__LIFELINE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lifeline Destruction Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFELINE_DESTRUCTION_EVENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionUseImpl <em>Interaction Use</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionUseImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getInteractionUse()
   * @generated
   */
  int INTERACTION_USE = 8;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_USE__CAPTION = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lifelines</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_USE__LIFELINES = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Interaction Use</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERACTION_USE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.CombinedFragmentImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getCombinedFragment()
   * @generated
   */
  int COMBINED_FRAGMENT = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINED_FRAGMENT__TYPE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINED_FRAGMENT__SECTIONS = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Combined Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINED_FRAGMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.SectionImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getSection()
   * @generated
   */
  int SECTION = 10;

  /**
   * The feature id for the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__CAPTION = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.ContinuationImpl <em>Continuation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.ContinuationImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getContinuation()
   * @generated
   */
  int CONTINUATION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUATION__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lifelines</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUATION__LIFELINES = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUATION__NOTE = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Continuation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.StateInvariantImpl <em>State Invariant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.StateInvariantImpl
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getStateInvariant()
   * @generated
   */
  int STATE_INVARIANT = 12;

  /**
   * The feature id for the '<em><b>Lifeline</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_INVARIANT__LIFELINE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Invariant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_INVARIANT__INVARIANT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_INVARIANT__NOTE = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>State Invariant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_INVARIANT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound <em>Lost Or Found</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getLostOrFound()
   * @generated
   */
  int LOST_OR_FOUND = 13;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragmentType <em>Combined Fragment Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragmentType
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getCombinedFragmentType()
   * @generated
   */
  int COMBINED_FRAGMENT_TYPE = 14;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType <em>One Participant Message Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getOneParticipantMessageType()
   * @generated
   */
  int ONE_PARTICIPANT_MESSAGE_TYPE = 15;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType <em>Two Participants Message Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType
   * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getTwoParticipantsMessageType()
   * @generated
   */
  int TWO_PARTICIPANTS_MESSAGE_TYPE = 16;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.Interaction <em>Interaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Interaction
   * @generated
   */
  EClass getInteraction();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kiesl.text.kiesl.Interaction#getLifelines <em>Lifelines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lifelines</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Interaction#getLifelines()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Lifelines();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kiesl.text.kiesl.Interaction#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Interaction#getElements()
   * @see #getInteraction()
   * @generated
   */
  EReference getInteraction_Elements();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.Lifeline <em>Lifeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lifeline</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Lifeline
   * @generated
   */
  EClass getLifeline();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.CommunicationParticipant <em>Communication Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Communication Participant</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.CommunicationParticipant
   * @generated
   */
  EClass getCommunicationParticipant();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.CommunicationParticipant#getCaption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caption</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.CommunicationParticipant#getCaption()
   * @see #getCommunicationParticipant()
   * @generated
   */
  EAttribute getCommunicationParticipant_Caption();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.CommunicationParticipant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.CommunicationParticipant#getName()
   * @see #getCommunicationParticipant()
   * @generated
   */
  EAttribute getCommunicationParticipant_Name();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage <em>Regular Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regular Message</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage
   * @generated
   */
  EClass getRegularMessage();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSource()
   * @see #getRegularMessage()
   * @generated
   */
  EReference getRegularMessage_Source();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getType()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getCaption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caption</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getCaption()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_Caption();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTarget()
   * @see #getRegularMessage()
   * @generated
   */
  EReference getRegularMessage_Target();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceStartEndExec <em>Source Start End Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Start End Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceStartEndExec()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_SourceStartEndExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceStartExec <em>Source Start Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Start Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceStartExec()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_SourceStartExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceEndExec <em>Source End Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source End Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceEndExec()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_SourceEndExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSourceEndExecCount <em>Source End Exec Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source End Exec Count</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSourceEndExecCount()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_SourceEndExecCount();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetStartEndExec <em>Target Start End Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Start End Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetStartEndExec()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_TargetStartEndExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetStartExec <em>Target Start Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Start Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetStartExec()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_TargetStartExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetEndExec <em>Target End Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target End Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetEndExec()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_TargetEndExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTargetEndExecCount <em>Target End Exec Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target End Exec Count</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTargetEndExecCount()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_TargetEndExecCount();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSourceNote <em>Source Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source Note</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSourceNote()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_SourceNote();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTargetNote <em>Target Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Note</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTargetNote()
   * @see #getRegularMessage()
   * @generated
   */
  EAttribute getRegularMessage_TargetNote();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage <em>Lost Or Found Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lost Or Found Message</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage
   * @generated
   */
  EClass getLostOrFoundMessage();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getLifeline <em>Lifeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lifeline</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getLifeline()
   * @see #getLostOrFoundMessage()
   * @generated
   */
  EReference getLostOrFoundMessage_Lifeline();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getType()
   * @see #getLostOrFoundMessage()
   * @generated
   */
  EAttribute getLostOrFoundMessage_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getLostOrFound <em>Lost Or Found</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lost Or Found</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getLostOrFound()
   * @see #getLostOrFoundMessage()
   * @generated
   */
  EAttribute getLostOrFoundMessage_LostOrFound();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getCaption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caption</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getCaption()
   * @see #getLostOrFoundMessage()
   * @generated
   */
  EAttribute getLostOrFoundMessage_Caption();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isStartEndExec <em>Start End Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start End Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isStartEndExec()
   * @see #getLostOrFoundMessage()
   * @generated
   */
  EAttribute getLostOrFoundMessage_StartEndExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isStartExec <em>Start Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isStartExec()
   * @see #getLostOrFoundMessage()
   * @generated
   */
  EAttribute getLostOrFoundMessage_StartExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isEndExec <em>End Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#isEndExec()
   * @see #getLostOrFoundMessage()
   * @generated
   */
  EAttribute getLostOrFoundMessage_EndExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getEndExecCount <em>End Exec Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Exec Count</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getEndExecCount()
   * @see #getLostOrFoundMessage()
   * @generated
   */
  EAttribute getLostOrFoundMessage_EndExecCount();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage#getNote()
   * @see #getLostOrFoundMessage()
   * @generated
   */
  EAttribute getLostOrFoundMessage_Note();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage <em>Self Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Message</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage
   * @generated
   */
  EClass getSelfMessage();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#getLifeline <em>Lifeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lifeline</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#getLifeline()
   * @see #getSelfMessage()
   * @generated
   */
  EReference getSelfMessage_Lifeline();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#getType()
   * @see #getSelfMessage()
   * @generated
   */
  EAttribute getSelfMessage_Type();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#getCaption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caption</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#getCaption()
   * @see #getSelfMessage()
   * @generated
   */
  EAttribute getSelfMessage_Caption();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#isStartEndExec <em>Start End Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start End Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#isStartEndExec()
   * @see #getSelfMessage()
   * @generated
   */
  EAttribute getSelfMessage_StartEndExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#isStartExec <em>Start Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#isStartExec()
   * @see #getSelfMessage()
   * @generated
   */
  EAttribute getSelfMessage_StartExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#isEndExec <em>End Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Exec</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#isEndExec()
   * @see #getSelfMessage()
   * @generated
   */
  EAttribute getSelfMessage_EndExec();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#getEndExecCount <em>End Exec Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Exec Count</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#getEndExecCount()
   * @see #getSelfMessage()
   * @generated
   */
  EAttribute getSelfMessage_EndExecCount();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage#getNote()
   * @see #getSelfMessage()
   * @generated
   */
  EAttribute getSelfMessage_Note();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.LifelineDestructionEvent <em>Lifeline Destruction Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lifeline Destruction Event</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LifelineDestructionEvent
   * @generated
   */
  EClass getLifelineDestructionEvent();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.kiesl.text.kiesl.LifelineDestructionEvent#getLifeline <em>Lifeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lifeline</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LifelineDestructionEvent#getLifeline()
   * @see #getLifelineDestructionEvent()
   * @generated
   */
  EReference getLifelineDestructionEvent_Lifeline();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse <em>Interaction Use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Use</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse
   * @generated
   */
  EClass getInteractionUse();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse#getCaption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caption</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse#getCaption()
   * @see #getInteractionUse()
   * @generated
   */
  EAttribute getInteractionUse_Caption();

  /**
   * Returns the meta object for the reference list '{@link de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse#getLifelines <em>Lifelines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Lifelines</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse#getLifelines()
   * @see #getInteractionUse()
   * @generated
   */
  EReference getInteractionUse_Lifelines();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment <em>Combined Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Combined Fragment</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment
   * @generated
   */
  EClass getCombinedFragment();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment#getType()
   * @see #getCombinedFragment()
   * @generated
   */
  EAttribute getCombinedFragment_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment#getSections()
   * @see #getCombinedFragment()
   * @generated
   */
  EReference getCombinedFragment_Sections();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.Section#getCaption <em>Caption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Caption</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Section#getCaption()
   * @see #getSection()
   * @generated
   */
  EAttribute getSection_Caption();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.kiesl.text.kiesl.Section#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Section#getElements()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Elements();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.Continuation <em>Continuation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continuation</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Continuation
   * @generated
   */
  EClass getContinuation();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.Continuation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Continuation#getName()
   * @see #getContinuation()
   * @generated
   */
  EAttribute getContinuation_Name();

  /**
   * Returns the meta object for the reference list '{@link de.cau.cs.kieler.kiesl.text.kiesl.Continuation#getLifelines <em>Lifelines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Lifelines</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Continuation#getLifelines()
   * @see #getContinuation()
   * @generated
   */
  EReference getContinuation_Lifelines();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.Continuation#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.Continuation#getNote()
   * @see #getContinuation()
   * @generated
   */
  EAttribute getContinuation_Note();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant <em>State Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Invariant</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant
   * @generated
   */
  EClass getStateInvariant();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getLifeline <em>Lifeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Lifeline</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getLifeline()
   * @see #getStateInvariant()
   * @generated
   */
  EReference getStateInvariant_Lifeline();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getInvariant <em>Invariant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Invariant</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getInvariant()
   * @see #getStateInvariant()
   * @generated
   */
  EAttribute getStateInvariant_Invariant();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant#getNote()
   * @see #getStateInvariant()
   * @generated
   */
  EAttribute getStateInvariant_Note();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound <em>Lost Or Found</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Lost Or Found</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound
   * @generated
   */
  EEnum getLostOrFound();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragmentType <em>Combined Fragment Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Combined Fragment Type</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragmentType
   * @generated
   */
  EEnum getCombinedFragmentType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType <em>One Participant Message Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>One Participant Message Type</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType
   * @generated
   */
  EEnum getOneParticipantMessageType();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType <em>Two Participants Message Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Two Participants Message Type</em>'.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType
   * @generated
   */
  EEnum getTwoParticipantsMessageType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KieslFactory getKieslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionImpl <em>Interaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getInteraction()
     * @generated
     */
    EClass INTERACTION = eINSTANCE.getInteraction();

    /**
     * The meta object literal for the '<em><b>Lifelines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__LIFELINES = eINSTANCE.getInteraction_Lifelines();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION__ELEMENTS = eINSTANCE.getInteraction_Elements();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LifelineImpl <em>Lifeline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.LifelineImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getLifeline()
     * @generated
     */
    EClass LIFELINE = eINSTANCE.getLifeline();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.ElementImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.CommunicationParticipantImpl <em>Communication Participant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.CommunicationParticipantImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getCommunicationParticipant()
     * @generated
     */
    EClass COMMUNICATION_PARTICIPANT = eINSTANCE.getCommunicationParticipant();

    /**
     * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMUNICATION_PARTICIPANT__CAPTION = eINSTANCE.getCommunicationParticipant_Caption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMUNICATION_PARTICIPANT__NAME = eINSTANCE.getCommunicationParticipant_Name();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl <em>Regular Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getRegularMessage()
     * @generated
     */
    EClass REGULAR_MESSAGE = eINSTANCE.getRegularMessage();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGULAR_MESSAGE__SOURCE = eINSTANCE.getRegularMessage_Source();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__TYPE = eINSTANCE.getRegularMessage_Type();

    /**
     * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__CAPTION = eINSTANCE.getRegularMessage_Caption();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGULAR_MESSAGE__TARGET = eINSTANCE.getRegularMessage_Target();

    /**
     * The meta object literal for the '<em><b>Source Start End Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__SOURCE_START_END_EXEC = eINSTANCE.getRegularMessage_SourceStartEndExec();

    /**
     * The meta object literal for the '<em><b>Source Start Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__SOURCE_START_EXEC = eINSTANCE.getRegularMessage_SourceStartExec();

    /**
     * The meta object literal for the '<em><b>Source End Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__SOURCE_END_EXEC = eINSTANCE.getRegularMessage_SourceEndExec();

    /**
     * The meta object literal for the '<em><b>Source End Exec Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__SOURCE_END_EXEC_COUNT = eINSTANCE.getRegularMessage_SourceEndExecCount();

    /**
     * The meta object literal for the '<em><b>Target Start End Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__TARGET_START_END_EXEC = eINSTANCE.getRegularMessage_TargetStartEndExec();

    /**
     * The meta object literal for the '<em><b>Target Start Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__TARGET_START_EXEC = eINSTANCE.getRegularMessage_TargetStartExec();

    /**
     * The meta object literal for the '<em><b>Target End Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__TARGET_END_EXEC = eINSTANCE.getRegularMessage_TargetEndExec();

    /**
     * The meta object literal for the '<em><b>Target End Exec Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__TARGET_END_EXEC_COUNT = eINSTANCE.getRegularMessage_TargetEndExecCount();

    /**
     * The meta object literal for the '<em><b>Source Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__SOURCE_NOTE = eINSTANCE.getRegularMessage_SourceNote();

    /**
     * The meta object literal for the '<em><b>Target Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGULAR_MESSAGE__TARGET_NOTE = eINSTANCE.getRegularMessage_TargetNote();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl <em>Lost Or Found Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getLostOrFoundMessage()
     * @generated
     */
    EClass LOST_OR_FOUND_MESSAGE = eINSTANCE.getLostOrFoundMessage();

    /**
     * The meta object literal for the '<em><b>Lifeline</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOST_OR_FOUND_MESSAGE__LIFELINE = eINSTANCE.getLostOrFoundMessage_Lifeline();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOST_OR_FOUND_MESSAGE__TYPE = eINSTANCE.getLostOrFoundMessage_Type();

    /**
     * The meta object literal for the '<em><b>Lost Or Found</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOST_OR_FOUND_MESSAGE__LOST_OR_FOUND = eINSTANCE.getLostOrFoundMessage_LostOrFound();

    /**
     * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOST_OR_FOUND_MESSAGE__CAPTION = eINSTANCE.getLostOrFoundMessage_Caption();

    /**
     * The meta object literal for the '<em><b>Start End Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOST_OR_FOUND_MESSAGE__START_END_EXEC = eINSTANCE.getLostOrFoundMessage_StartEndExec();

    /**
     * The meta object literal for the '<em><b>Start Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOST_OR_FOUND_MESSAGE__START_EXEC = eINSTANCE.getLostOrFoundMessage_StartExec();

    /**
     * The meta object literal for the '<em><b>End Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOST_OR_FOUND_MESSAGE__END_EXEC = eINSTANCE.getLostOrFoundMessage_EndExec();

    /**
     * The meta object literal for the '<em><b>End Exec Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOST_OR_FOUND_MESSAGE__END_EXEC_COUNT = eINSTANCE.getLostOrFoundMessage_EndExecCount();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOST_OR_FOUND_MESSAGE__NOTE = eINSTANCE.getLostOrFoundMessage_Note();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.SelfMessageImpl <em>Self Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.SelfMessageImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getSelfMessage()
     * @generated
     */
    EClass SELF_MESSAGE = eINSTANCE.getSelfMessage();

    /**
     * The meta object literal for the '<em><b>Lifeline</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELF_MESSAGE__LIFELINE = eINSTANCE.getSelfMessage_Lifeline();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELF_MESSAGE__TYPE = eINSTANCE.getSelfMessage_Type();

    /**
     * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELF_MESSAGE__CAPTION = eINSTANCE.getSelfMessage_Caption();

    /**
     * The meta object literal for the '<em><b>Start End Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELF_MESSAGE__START_END_EXEC = eINSTANCE.getSelfMessage_StartEndExec();

    /**
     * The meta object literal for the '<em><b>Start Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELF_MESSAGE__START_EXEC = eINSTANCE.getSelfMessage_StartExec();

    /**
     * The meta object literal for the '<em><b>End Exec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELF_MESSAGE__END_EXEC = eINSTANCE.getSelfMessage_EndExec();

    /**
     * The meta object literal for the '<em><b>End Exec Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELF_MESSAGE__END_EXEC_COUNT = eINSTANCE.getSelfMessage_EndExecCount();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELF_MESSAGE__NOTE = eINSTANCE.getSelfMessage_Note();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LifelineDestructionEventImpl <em>Lifeline Destruction Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.LifelineDestructionEventImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getLifelineDestructionEvent()
     * @generated
     */
    EClass LIFELINE_DESTRUCTION_EVENT = eINSTANCE.getLifelineDestructionEvent();

    /**
     * The meta object literal for the '<em><b>Lifeline</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIFELINE_DESTRUCTION_EVENT__LIFELINE = eINSTANCE.getLifelineDestructionEvent_Lifeline();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionUseImpl <em>Interaction Use</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionUseImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getInteractionUse()
     * @generated
     */
    EClass INTERACTION_USE = eINSTANCE.getInteractionUse();

    /**
     * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERACTION_USE__CAPTION = eINSTANCE.getInteractionUse_Caption();

    /**
     * The meta object literal for the '<em><b>Lifelines</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERACTION_USE__LIFELINES = eINSTANCE.getInteractionUse_Lifelines();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.CombinedFragmentImpl <em>Combined Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.CombinedFragmentImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getCombinedFragment()
     * @generated
     */
    EClass COMBINED_FRAGMENT = eINSTANCE.getCombinedFragment();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMBINED_FRAGMENT__TYPE = eINSTANCE.getCombinedFragment_Type();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMBINED_FRAGMENT__SECTIONS = eINSTANCE.getCombinedFragment_Sections();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.SectionImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECTION__CAPTION = eINSTANCE.getSection_Caption();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__ELEMENTS = eINSTANCE.getSection_Elements();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.ContinuationImpl <em>Continuation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.ContinuationImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getContinuation()
     * @generated
     */
    EClass CONTINUATION = eINSTANCE.getContinuation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTINUATION__NAME = eINSTANCE.getContinuation_Name();

    /**
     * The meta object literal for the '<em><b>Lifelines</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTINUATION__LIFELINES = eINSTANCE.getContinuation_Lifelines();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTINUATION__NOTE = eINSTANCE.getContinuation_Note();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.StateInvariantImpl <em>State Invariant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.StateInvariantImpl
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getStateInvariant()
     * @generated
     */
    EClass STATE_INVARIANT = eINSTANCE.getStateInvariant();

    /**
     * The meta object literal for the '<em><b>Lifeline</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_INVARIANT__LIFELINE = eINSTANCE.getStateInvariant_Lifeline();

    /**
     * The meta object literal for the '<em><b>Invariant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_INVARIANT__INVARIANT = eINSTANCE.getStateInvariant_Invariant();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_INVARIANT__NOTE = eINSTANCE.getStateInvariant_Note();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound <em>Lost Or Found</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getLostOrFound()
     * @generated
     */
    EEnum LOST_OR_FOUND = eINSTANCE.getLostOrFound();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragmentType <em>Combined Fragment Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragmentType
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getCombinedFragmentType()
     * @generated
     */
    EEnum COMBINED_FRAGMENT_TYPE = eINSTANCE.getCombinedFragmentType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType <em>One Participant Message Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getOneParticipantMessageType()
     * @generated
     */
    EEnum ONE_PARTICIPANT_MESSAGE_TYPE = eINSTANCE.getOneParticipantMessageType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType <em>Two Participants Message Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType
     * @see de.cau.cs.kieler.kiesl.text.kiesl.impl.KieslPackageImpl#getTwoParticipantsMessageType()
     * @generated
     */
    EEnum TWO_PARTICIPANTS_MESSAGE_TYPE = eINSTANCE.getTwoParticipantsMessageType();

  }

} //KieslPackage
