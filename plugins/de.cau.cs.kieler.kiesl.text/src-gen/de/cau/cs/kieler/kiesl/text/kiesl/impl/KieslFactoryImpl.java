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
package de.cau.cs.kieler.kiesl.text.kiesl.impl;

import de.cau.cs.kieler.kiesl.text.kiesl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KieslFactoryImpl extends EFactoryImpl implements KieslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KieslFactory init()
  {
    try
    {
      KieslFactory theKieslFactory = (KieslFactory)EPackage.Registry.INSTANCE.getEFactory(KieslPackage.eNS_URI);
      if (theKieslFactory != null)
      {
        return theKieslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KieslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KieslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case KieslPackage.INTERACTION: return createInteraction();
      case KieslPackage.LIFELINE: return createLifeline();
      case KieslPackage.ELEMENT: return createElement();
      case KieslPackage.COMMUNICATION_PARTICIPANT: return createCommunicationParticipant();
      case KieslPackage.REGULAR_MESSAGE: return createRegularMessage();
      case KieslPackage.LOST_OR_FOUND_MESSAGE: return createLostOrFoundMessage();
      case KieslPackage.SELF_MESSAGE: return createSelfMessage();
      case KieslPackage.LIFELINE_DESTRUCTION_EVENT: return createLifelineDestructionEvent();
      case KieslPackage.INTERACTION_USE: return createInteractionUse();
      case KieslPackage.COMBINED_FRAGMENT: return createCombinedFragment();
      case KieslPackage.SECTION: return createSection();
      case KieslPackage.CONTINUATION: return createContinuation();
      case KieslPackage.STATE_INVARIANT: return createStateInvariant();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case KieslPackage.LOST_OR_FOUND:
        return createLostOrFoundFromString(eDataType, initialValue);
      case KieslPackage.COMBINED_FRAGMENT_TYPE:
        return createCombinedFragmentTypeFromString(eDataType, initialValue);
      case KieslPackage.ONE_PARTICIPANT_MESSAGE_TYPE:
        return createOneParticipantMessageTypeFromString(eDataType, initialValue);
      case KieslPackage.TWO_PARTICIPANTS_MESSAGE_TYPE:
        return createTwoParticipantsMessageTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case KieslPackage.LOST_OR_FOUND:
        return convertLostOrFoundToString(eDataType, instanceValue);
      case KieslPackage.COMBINED_FRAGMENT_TYPE:
        return convertCombinedFragmentTypeToString(eDataType, instanceValue);
      case KieslPackage.ONE_PARTICIPANT_MESSAGE_TYPE:
        return convertOneParticipantMessageTypeToString(eDataType, instanceValue);
      case KieslPackage.TWO_PARTICIPANTS_MESSAGE_TYPE:
        return convertTwoParticipantsMessageTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interaction createInteraction()
  {
    InteractionImpl interaction = new InteractionImpl();
    return interaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lifeline createLifeline()
  {
    LifelineImpl lifeline = new LifelineImpl();
    return lifeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommunicationParticipant createCommunicationParticipant()
  {
    CommunicationParticipantImpl communicationParticipant = new CommunicationParticipantImpl();
    return communicationParticipant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegularMessage createRegularMessage()
  {
    RegularMessageImpl regularMessage = new RegularMessageImpl();
    return regularMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LostOrFoundMessage createLostOrFoundMessage()
  {
    LostOrFoundMessageImpl lostOrFoundMessage = new LostOrFoundMessageImpl();
    return lostOrFoundMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfMessage createSelfMessage()
  {
    SelfMessageImpl selfMessage = new SelfMessageImpl();
    return selfMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LifelineDestructionEvent createLifelineDestructionEvent()
  {
    LifelineDestructionEventImpl lifelineDestructionEvent = new LifelineDestructionEventImpl();
    return lifelineDestructionEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractionUse createInteractionUse()
  {
    InteractionUseImpl interactionUse = new InteractionUseImpl();
    return interactionUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CombinedFragment createCombinedFragment()
  {
    CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
    return combinedFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Continuation createContinuation()
  {
    ContinuationImpl continuation = new ContinuationImpl();
    return continuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateInvariant createStateInvariant()
  {
    StateInvariantImpl stateInvariant = new StateInvariantImpl();
    return stateInvariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LostOrFound createLostOrFoundFromString(EDataType eDataType, String initialValue)
  {
    LostOrFound result = LostOrFound.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLostOrFoundToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CombinedFragmentType createCombinedFragmentTypeFromString(EDataType eDataType, String initialValue)
  {
    CombinedFragmentType result = CombinedFragmentType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCombinedFragmentTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneParticipantMessageType createOneParticipantMessageTypeFromString(EDataType eDataType, String initialValue)
  {
    OneParticipantMessageType result = OneParticipantMessageType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOneParticipantMessageTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TwoParticipantsMessageType createTwoParticipantsMessageTypeFromString(EDataType eDataType, String initialValue)
  {
    TwoParticipantsMessageType result = TwoParticipantsMessageType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTwoParticipantsMessageTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KieslPackage getKieslPackage()
  {
    return (KieslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KieslPackage getPackage()
  {
    return KieslPackage.eINSTANCE;
  }

} //KieslFactoryImpl
