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

import de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragment;
import de.cau.cs.kieler.kiesl.text.kiesl.CombinedFragmentType;
import de.cau.cs.kieler.kiesl.text.kiesl.CommunicationParticipant;
import de.cau.cs.kieler.kiesl.text.kiesl.Continuation;
import de.cau.cs.kieler.kiesl.text.kiesl.Element;
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction;
import de.cau.cs.kieler.kiesl.text.kiesl.InteractionUse;
import de.cau.cs.kieler.kiesl.text.kiesl.KieslFactory;
import de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage;
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline;
import de.cau.cs.kieler.kiesl.text.kiesl.LifelineDestructionEvent;
import de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound;
import de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage;
import de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType;
import de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage;
import de.cau.cs.kieler.kiesl.text.kiesl.Section;
import de.cau.cs.kieler.kiesl.text.kiesl.SelfMessage;
import de.cau.cs.kieler.kiesl.text.kiesl.StateInvariant;
import de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KieslPackageImpl extends EPackageImpl implements KieslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lifelineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass communicationParticipantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regularMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lostOrFoundMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selfMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lifelineDestructionEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactionUseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass combinedFragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass continuationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateInvariantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lostOrFoundEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum combinedFragmentTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum oneParticipantMessageTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum twoParticipantsMessageTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private KieslPackageImpl()
  {
    super(eNS_URI, KieslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link KieslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static KieslPackage init()
  {
    if (isInited) return (KieslPackage)EPackage.Registry.INSTANCE.getEPackage(KieslPackage.eNS_URI);

    // Obtain or create and register package
    KieslPackageImpl theKieslPackage = (KieslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KieslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KieslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theKieslPackage.createPackageContents();

    // Initialize created meta-data
    theKieslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theKieslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(KieslPackage.eNS_URI, theKieslPackage);
    return theKieslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteraction()
  {
    return interactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteraction_Lifelines()
  {
    return (EReference)interactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteraction_Elements()
  {
    return (EReference)interactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLifeline()
  {
    return lifelineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommunicationParticipant()
  {
    return communicationParticipantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommunicationParticipant_Caption()
  {
    return (EAttribute)communicationParticipantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommunicationParticipant_Name()
  {
    return (EAttribute)communicationParticipantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegularMessage()
  {
    return regularMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegularMessage_Source()
  {
    return (EReference)regularMessageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_Type()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_Caption()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegularMessage_Target()
  {
    return (EReference)regularMessageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_SourceStartEndExec()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_SourceStartExec()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_SourceEndExec()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_SourceEndExecCount()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_TargetStartEndExec()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_TargetStartExec()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_TargetEndExec()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_TargetEndExecCount()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_SourceNote()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegularMessage_TargetNote()
  {
    return (EAttribute)regularMessageEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLostOrFoundMessage()
  {
    return lostOrFoundMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLostOrFoundMessage_Lifeline()
  {
    return (EReference)lostOrFoundMessageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLostOrFoundMessage_Type()
  {
    return (EAttribute)lostOrFoundMessageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLostOrFoundMessage_LostOrFound()
  {
    return (EAttribute)lostOrFoundMessageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLostOrFoundMessage_Caption()
  {
    return (EAttribute)lostOrFoundMessageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLostOrFoundMessage_StartEndExec()
  {
    return (EAttribute)lostOrFoundMessageEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLostOrFoundMessage_StartExec()
  {
    return (EAttribute)lostOrFoundMessageEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLostOrFoundMessage_EndExec()
  {
    return (EAttribute)lostOrFoundMessageEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLostOrFoundMessage_EndExecCount()
  {
    return (EAttribute)lostOrFoundMessageEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLostOrFoundMessage_Note()
  {
    return (EAttribute)lostOrFoundMessageEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelfMessage()
  {
    return selfMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelfMessage_Lifeline()
  {
    return (EReference)selfMessageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelfMessage_Type()
  {
    return (EAttribute)selfMessageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelfMessage_Caption()
  {
    return (EAttribute)selfMessageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelfMessage_StartEndExec()
  {
    return (EAttribute)selfMessageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelfMessage_StartExec()
  {
    return (EAttribute)selfMessageEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelfMessage_EndExec()
  {
    return (EAttribute)selfMessageEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelfMessage_EndExecCount()
  {
    return (EAttribute)selfMessageEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelfMessage_Note()
  {
    return (EAttribute)selfMessageEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLifelineDestructionEvent()
  {
    return lifelineDestructionEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLifelineDestructionEvent_Lifeline()
  {
    return (EReference)lifelineDestructionEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractionUse()
  {
    return interactionUseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteractionUse_Caption()
  {
    return (EAttribute)interactionUseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractionUse_Lifelines()
  {
    return (EReference)interactionUseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCombinedFragment()
  {
    return combinedFragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCombinedFragment_Type()
  {
    return (EAttribute)combinedFragmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCombinedFragment_Sections()
  {
    return (EReference)combinedFragmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSection()
  {
    return sectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSection_Caption()
  {
    return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSection_Elements()
  {
    return (EReference)sectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContinuation()
  {
    return continuationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContinuation_Name()
  {
    return (EAttribute)continuationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContinuation_Lifelines()
  {
    return (EReference)continuationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContinuation_Note()
  {
    return (EAttribute)continuationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateInvariant()
  {
    return stateInvariantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateInvariant_Lifeline()
  {
    return (EReference)stateInvariantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateInvariant_Invariant()
  {
    return (EAttribute)stateInvariantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateInvariant_Note()
  {
    return (EAttribute)stateInvariantEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLostOrFound()
  {
    return lostOrFoundEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCombinedFragmentType()
  {
    return combinedFragmentTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOneParticipantMessageType()
  {
    return oneParticipantMessageTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTwoParticipantsMessageType()
  {
    return twoParticipantsMessageTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KieslFactory getKieslFactory()
  {
    return (KieslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    interactionEClass = createEClass(INTERACTION);
    createEReference(interactionEClass, INTERACTION__LIFELINES);
    createEReference(interactionEClass, INTERACTION__ELEMENTS);

    lifelineEClass = createEClass(LIFELINE);

    elementEClass = createEClass(ELEMENT);

    communicationParticipantEClass = createEClass(COMMUNICATION_PARTICIPANT);
    createEAttribute(communicationParticipantEClass, COMMUNICATION_PARTICIPANT__CAPTION);
    createEAttribute(communicationParticipantEClass, COMMUNICATION_PARTICIPANT__NAME);

    regularMessageEClass = createEClass(REGULAR_MESSAGE);
    createEReference(regularMessageEClass, REGULAR_MESSAGE__SOURCE);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__TYPE);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__CAPTION);
    createEReference(regularMessageEClass, REGULAR_MESSAGE__TARGET);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__SOURCE_START_END_EXEC);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__SOURCE_START_EXEC);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__SOURCE_END_EXEC);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__SOURCE_END_EXEC_COUNT);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__TARGET_START_END_EXEC);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__TARGET_START_EXEC);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__TARGET_END_EXEC);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__TARGET_END_EXEC_COUNT);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__SOURCE_NOTE);
    createEAttribute(regularMessageEClass, REGULAR_MESSAGE__TARGET_NOTE);

    lostOrFoundMessageEClass = createEClass(LOST_OR_FOUND_MESSAGE);
    createEReference(lostOrFoundMessageEClass, LOST_OR_FOUND_MESSAGE__LIFELINE);
    createEAttribute(lostOrFoundMessageEClass, LOST_OR_FOUND_MESSAGE__TYPE);
    createEAttribute(lostOrFoundMessageEClass, LOST_OR_FOUND_MESSAGE__LOST_OR_FOUND);
    createEAttribute(lostOrFoundMessageEClass, LOST_OR_FOUND_MESSAGE__CAPTION);
    createEAttribute(lostOrFoundMessageEClass, LOST_OR_FOUND_MESSAGE__START_END_EXEC);
    createEAttribute(lostOrFoundMessageEClass, LOST_OR_FOUND_MESSAGE__START_EXEC);
    createEAttribute(lostOrFoundMessageEClass, LOST_OR_FOUND_MESSAGE__END_EXEC);
    createEAttribute(lostOrFoundMessageEClass, LOST_OR_FOUND_MESSAGE__END_EXEC_COUNT);
    createEAttribute(lostOrFoundMessageEClass, LOST_OR_FOUND_MESSAGE__NOTE);

    selfMessageEClass = createEClass(SELF_MESSAGE);
    createEReference(selfMessageEClass, SELF_MESSAGE__LIFELINE);
    createEAttribute(selfMessageEClass, SELF_MESSAGE__TYPE);
    createEAttribute(selfMessageEClass, SELF_MESSAGE__CAPTION);
    createEAttribute(selfMessageEClass, SELF_MESSAGE__START_END_EXEC);
    createEAttribute(selfMessageEClass, SELF_MESSAGE__START_EXEC);
    createEAttribute(selfMessageEClass, SELF_MESSAGE__END_EXEC);
    createEAttribute(selfMessageEClass, SELF_MESSAGE__END_EXEC_COUNT);
    createEAttribute(selfMessageEClass, SELF_MESSAGE__NOTE);

    lifelineDestructionEventEClass = createEClass(LIFELINE_DESTRUCTION_EVENT);
    createEReference(lifelineDestructionEventEClass, LIFELINE_DESTRUCTION_EVENT__LIFELINE);

    interactionUseEClass = createEClass(INTERACTION_USE);
    createEAttribute(interactionUseEClass, INTERACTION_USE__CAPTION);
    createEReference(interactionUseEClass, INTERACTION_USE__LIFELINES);

    combinedFragmentEClass = createEClass(COMBINED_FRAGMENT);
    createEAttribute(combinedFragmentEClass, COMBINED_FRAGMENT__TYPE);
    createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__SECTIONS);

    sectionEClass = createEClass(SECTION);
    createEAttribute(sectionEClass, SECTION__CAPTION);
    createEReference(sectionEClass, SECTION__ELEMENTS);

    continuationEClass = createEClass(CONTINUATION);
    createEAttribute(continuationEClass, CONTINUATION__NAME);
    createEReference(continuationEClass, CONTINUATION__LIFELINES);
    createEAttribute(continuationEClass, CONTINUATION__NOTE);

    stateInvariantEClass = createEClass(STATE_INVARIANT);
    createEReference(stateInvariantEClass, STATE_INVARIANT__LIFELINE);
    createEAttribute(stateInvariantEClass, STATE_INVARIANT__INVARIANT);
    createEAttribute(stateInvariantEClass, STATE_INVARIANT__NOTE);

    // Create enums
    lostOrFoundEEnum = createEEnum(LOST_OR_FOUND);
    combinedFragmentTypeEEnum = createEEnum(COMBINED_FRAGMENT_TYPE);
    oneParticipantMessageTypeEEnum = createEEnum(ONE_PARTICIPANT_MESSAGE_TYPE);
    twoParticipantsMessageTypeEEnum = createEEnum(TWO_PARTICIPANTS_MESSAGE_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    interactionEClass.getESuperTypes().add(this.getCommunicationParticipant());
    lifelineEClass.getESuperTypes().add(this.getCommunicationParticipant());
    regularMessageEClass.getESuperTypes().add(this.getElement());
    lostOrFoundMessageEClass.getESuperTypes().add(this.getElement());
    selfMessageEClass.getESuperTypes().add(this.getElement());
    lifelineDestructionEventEClass.getESuperTypes().add(this.getElement());
    interactionUseEClass.getESuperTypes().add(this.getElement());
    combinedFragmentEClass.getESuperTypes().add(this.getElement());
    continuationEClass.getESuperTypes().add(this.getElement());
    stateInvariantEClass.getESuperTypes().add(this.getElement());

    // Initialize classes and features; add operations and parameters
    initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteraction_Lifelines(), this.getLifeline(), null, "lifelines", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteraction_Elements(), this.getElement(), null, "elements", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lifelineEClass, Lifeline.class, "Lifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(communicationParticipantEClass, CommunicationParticipant.class, "CommunicationParticipant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommunicationParticipant_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, CommunicationParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommunicationParticipant_Name(), ecorePackage.getEString(), "name", null, 0, 1, CommunicationParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regularMessageEClass, RegularMessage.class, "RegularMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRegularMessage_Source(), this.getCommunicationParticipant(), null, "source", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_Type(), this.getTwoParticipantsMessageType(), "type", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegularMessage_Target(), this.getCommunicationParticipant(), null, "target", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_SourceStartEndExec(), ecorePackage.getEBoolean(), "sourceStartEndExec", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_SourceStartExec(), ecorePackage.getEBoolean(), "sourceStartExec", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_SourceEndExec(), ecorePackage.getEBoolean(), "sourceEndExec", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_SourceEndExecCount(), ecorePackage.getEInt(), "sourceEndExecCount", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_TargetStartEndExec(), ecorePackage.getEBoolean(), "targetStartEndExec", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_TargetStartExec(), ecorePackage.getEBoolean(), "targetStartExec", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_TargetEndExec(), ecorePackage.getEBoolean(), "targetEndExec", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_TargetEndExecCount(), ecorePackage.getEInt(), "targetEndExecCount", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_SourceNote(), ecorePackage.getEString(), "sourceNote", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegularMessage_TargetNote(), ecorePackage.getEString(), "targetNote", null, 0, 1, RegularMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lostOrFoundMessageEClass, LostOrFoundMessage.class, "LostOrFoundMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLostOrFoundMessage_Lifeline(), this.getLifeline(), null, "lifeline", null, 0, 1, LostOrFoundMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLostOrFoundMessage_Type(), this.getOneParticipantMessageType(), "type", null, 0, 1, LostOrFoundMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLostOrFoundMessage_LostOrFound(), this.getLostOrFound(), "lostOrFound", null, 0, 1, LostOrFoundMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLostOrFoundMessage_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, LostOrFoundMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLostOrFoundMessage_StartEndExec(), ecorePackage.getEBoolean(), "startEndExec", null, 0, 1, LostOrFoundMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLostOrFoundMessage_StartExec(), ecorePackage.getEBoolean(), "startExec", null, 0, 1, LostOrFoundMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLostOrFoundMessage_EndExec(), ecorePackage.getEBoolean(), "endExec", null, 0, 1, LostOrFoundMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLostOrFoundMessage_EndExecCount(), ecorePackage.getEInt(), "endExecCount", null, 0, 1, LostOrFoundMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLostOrFoundMessage_Note(), ecorePackage.getEString(), "note", null, 0, 1, LostOrFoundMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selfMessageEClass, SelfMessage.class, "SelfMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelfMessage_Lifeline(), this.getLifeline(), null, "lifeline", null, 0, 1, SelfMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelfMessage_Type(), this.getOneParticipantMessageType(), "type", null, 0, 1, SelfMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelfMessage_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, SelfMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelfMessage_StartEndExec(), ecorePackage.getEBoolean(), "startEndExec", null, 0, 1, SelfMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelfMessage_StartExec(), ecorePackage.getEBoolean(), "startExec", null, 0, 1, SelfMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelfMessage_EndExec(), ecorePackage.getEBoolean(), "endExec", null, 0, 1, SelfMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelfMessage_EndExecCount(), ecorePackage.getEInt(), "endExecCount", null, 0, 1, SelfMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelfMessage_Note(), ecorePackage.getEString(), "note", null, 0, 1, SelfMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lifelineDestructionEventEClass, LifelineDestructionEvent.class, "LifelineDestructionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLifelineDestructionEvent_Lifeline(), this.getLifeline(), null, "lifeline", null, 0, 1, LifelineDestructionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactionUseEClass, InteractionUse.class, "InteractionUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteractionUse_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractionUse_Lifelines(), this.getLifeline(), null, "lifelines", null, 0, -1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(combinedFragmentEClass, CombinedFragment.class, "CombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCombinedFragment_Type(), this.getCombinedFragmentType(), "type", null, 0, 1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCombinedFragment_Sections(), this.getSection(), null, "sections", null, 0, -1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSection_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSection_Elements(), this.getElement(), null, "elements", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(continuationEClass, Continuation.class, "Continuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContinuation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Continuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContinuation_Lifelines(), this.getLifeline(), null, "lifelines", null, 0, -1, Continuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContinuation_Note(), ecorePackage.getEString(), "note", null, 0, 1, Continuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateInvariantEClass, StateInvariant.class, "StateInvariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateInvariant_Lifeline(), this.getLifeline(), null, "lifeline", null, 0, 1, StateInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateInvariant_Invariant(), ecorePackage.getEString(), "invariant", null, 0, 1, StateInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateInvariant_Note(), ecorePackage.getEString(), "note", null, 0, 1, StateInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(lostOrFoundEEnum, LostOrFound.class, "LostOrFound");
    addEEnumLiteral(lostOrFoundEEnum, LostOrFound.LOST);
    addEEnumLiteral(lostOrFoundEEnum, LostOrFound.FOUND);

    initEEnum(combinedFragmentTypeEEnum, CombinedFragmentType.class, "CombinedFragmentType");
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.SEQ);
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.ALT);
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.OPT);
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.BREAK);
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.PAR);
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.STRICT);
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.LOOP);
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.CRITICAL);
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.NEG);
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.ASSERT);
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.IGNORE);
    addEEnumLiteral(combinedFragmentTypeEEnum, CombinedFragmentType.CONSIDER);

    initEEnum(oneParticipantMessageTypeEEnum, OneParticipantMessageType.class, "OneParticipantMessageType");
    addEEnumLiteral(oneParticipantMessageTypeEEnum, OneParticipantMessageType.ASYNC);
    addEEnumLiteral(oneParticipantMessageTypeEEnum, OneParticipantMessageType.SYNC);
    addEEnumLiteral(oneParticipantMessageTypeEEnum, OneParticipantMessageType.RESPONSE);

    initEEnum(twoParticipantsMessageTypeEEnum, TwoParticipantsMessageType.class, "TwoParticipantsMessageType");
    addEEnumLiteral(twoParticipantsMessageTypeEEnum, TwoParticipantsMessageType.ASYNC);
    addEEnumLiteral(twoParticipantsMessageTypeEEnum, TwoParticipantsMessageType.SYNC);
    addEEnumLiteral(twoParticipantsMessageTypeEEnum, TwoParticipantsMessageType.RESPONSE);
    addEEnumLiteral(twoParticipantsMessageTypeEEnum, TwoParticipantsMessageType.CREATE);
    addEEnumLiteral(twoParticipantsMessageTypeEEnum, TwoParticipantsMessageType.DESTROY);

    // Create resource
    createResource(eNS_URI);
  }

} //KieslPackageImpl
