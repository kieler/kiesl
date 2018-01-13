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

import de.cau.cs.kieler.kiesl.text.kiesl.CommunicationParticipant;
import de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage;
import de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage;
import de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#isSourceStartEndExec <em>Source Start End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#isSourceStartExec <em>Source Start Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#isSourceEndExec <em>Source End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#getSourceEndExecCount <em>Source End Exec Count</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#isTargetStartEndExec <em>Target Start End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#isTargetStartExec <em>Target Start Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#isTargetEndExec <em>Target End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#getTargetEndExecCount <em>Target End Exec Count</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#getSourceNote <em>Source Note</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.RegularMessageImpl#getTargetNote <em>Target Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegularMessageImpl extends ElementImpl implements RegularMessage
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected CommunicationParticipant source;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final TwoParticipantsMessageType TYPE_EDEFAULT = TwoParticipantsMessageType.ASYNC;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TwoParticipantsMessageType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaption()
   * @generated
   * @ordered
   */
  protected static final String CAPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaption()
   * @generated
   * @ordered
   */
  protected String caption = CAPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected CommunicationParticipant target;

  /**
   * The default value of the '{@link #isSourceStartEndExec() <em>Source Start End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSourceStartEndExec()
   * @generated
   * @ordered
   */
  protected static final boolean SOURCE_START_END_EXEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSourceStartEndExec() <em>Source Start End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSourceStartEndExec()
   * @generated
   * @ordered
   */
  protected boolean sourceStartEndExec = SOURCE_START_END_EXEC_EDEFAULT;

  /**
   * The default value of the '{@link #isSourceStartExec() <em>Source Start Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSourceStartExec()
   * @generated
   * @ordered
   */
  protected static final boolean SOURCE_START_EXEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSourceStartExec() <em>Source Start Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSourceStartExec()
   * @generated
   * @ordered
   */
  protected boolean sourceStartExec = SOURCE_START_EXEC_EDEFAULT;

  /**
   * The default value of the '{@link #isSourceEndExec() <em>Source End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSourceEndExec()
   * @generated
   * @ordered
   */
  protected static final boolean SOURCE_END_EXEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSourceEndExec() <em>Source End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSourceEndExec()
   * @generated
   * @ordered
   */
  protected boolean sourceEndExec = SOURCE_END_EXEC_EDEFAULT;

  /**
   * The default value of the '{@link #getSourceEndExecCount() <em>Source End Exec Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceEndExecCount()
   * @generated
   * @ordered
   */
  protected static final int SOURCE_END_EXEC_COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSourceEndExecCount() <em>Source End Exec Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceEndExecCount()
   * @generated
   * @ordered
   */
  protected int sourceEndExecCount = SOURCE_END_EXEC_COUNT_EDEFAULT;

  /**
   * The default value of the '{@link #isTargetStartEndExec() <em>Target Start End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTargetStartEndExec()
   * @generated
   * @ordered
   */
  protected static final boolean TARGET_START_END_EXEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTargetStartEndExec() <em>Target Start End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTargetStartEndExec()
   * @generated
   * @ordered
   */
  protected boolean targetStartEndExec = TARGET_START_END_EXEC_EDEFAULT;

  /**
   * The default value of the '{@link #isTargetStartExec() <em>Target Start Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTargetStartExec()
   * @generated
   * @ordered
   */
  protected static final boolean TARGET_START_EXEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTargetStartExec() <em>Target Start Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTargetStartExec()
   * @generated
   * @ordered
   */
  protected boolean targetStartExec = TARGET_START_EXEC_EDEFAULT;

  /**
   * The default value of the '{@link #isTargetEndExec() <em>Target End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTargetEndExec()
   * @generated
   * @ordered
   */
  protected static final boolean TARGET_END_EXEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTargetEndExec() <em>Target End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTargetEndExec()
   * @generated
   * @ordered
   */
  protected boolean targetEndExec = TARGET_END_EXEC_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetEndExecCount() <em>Target End Exec Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetEndExecCount()
   * @generated
   * @ordered
   */
  protected static final int TARGET_END_EXEC_COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTargetEndExecCount() <em>Target End Exec Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetEndExecCount()
   * @generated
   * @ordered
   */
  protected int targetEndExecCount = TARGET_END_EXEC_COUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getSourceNote() <em>Source Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceNote()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_NOTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceNote() <em>Source Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceNote()
   * @generated
   * @ordered
   */
  protected String sourceNote = SOURCE_NOTE_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetNote() <em>Target Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetNote()
   * @generated
   * @ordered
   */
  protected static final String TARGET_NOTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetNote() <em>Target Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetNote()
   * @generated
   * @ordered
   */
  protected String targetNote = TARGET_NOTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RegularMessageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KieslPackage.Literals.REGULAR_MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommunicationParticipant getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (CommunicationParticipant)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KieslPackage.REGULAR_MESSAGE__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommunicationParticipant basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(CommunicationParticipant newSource)
  {
    CommunicationParticipant oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TwoParticipantsMessageType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TwoParticipantsMessageType newType)
  {
    TwoParticipantsMessageType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCaption()
  {
    return caption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaption(String newCaption)
  {
    String oldCaption = caption;
    caption = newCaption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__CAPTION, oldCaption, caption));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommunicationParticipant getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (CommunicationParticipant)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KieslPackage.REGULAR_MESSAGE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommunicationParticipant basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(CommunicationParticipant newTarget)
  {
    CommunicationParticipant oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSourceStartEndExec()
  {
    return sourceStartEndExec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceStartEndExec(boolean newSourceStartEndExec)
  {
    boolean oldSourceStartEndExec = sourceStartEndExec;
    sourceStartEndExec = newSourceStartEndExec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__SOURCE_START_END_EXEC, oldSourceStartEndExec, sourceStartEndExec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSourceStartExec()
  {
    return sourceStartExec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceStartExec(boolean newSourceStartExec)
  {
    boolean oldSourceStartExec = sourceStartExec;
    sourceStartExec = newSourceStartExec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__SOURCE_START_EXEC, oldSourceStartExec, sourceStartExec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSourceEndExec()
  {
    return sourceEndExec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceEndExec(boolean newSourceEndExec)
  {
    boolean oldSourceEndExec = sourceEndExec;
    sourceEndExec = newSourceEndExec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__SOURCE_END_EXEC, oldSourceEndExec, sourceEndExec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSourceEndExecCount()
  {
    return sourceEndExecCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceEndExecCount(int newSourceEndExecCount)
  {
    int oldSourceEndExecCount = sourceEndExecCount;
    sourceEndExecCount = newSourceEndExecCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__SOURCE_END_EXEC_COUNT, oldSourceEndExecCount, sourceEndExecCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTargetStartEndExec()
  {
    return targetStartEndExec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetStartEndExec(boolean newTargetStartEndExec)
  {
    boolean oldTargetStartEndExec = targetStartEndExec;
    targetStartEndExec = newTargetStartEndExec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__TARGET_START_END_EXEC, oldTargetStartEndExec, targetStartEndExec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTargetStartExec()
  {
    return targetStartExec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetStartExec(boolean newTargetStartExec)
  {
    boolean oldTargetStartExec = targetStartExec;
    targetStartExec = newTargetStartExec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__TARGET_START_EXEC, oldTargetStartExec, targetStartExec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTargetEndExec()
  {
    return targetEndExec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetEndExec(boolean newTargetEndExec)
  {
    boolean oldTargetEndExec = targetEndExec;
    targetEndExec = newTargetEndExec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__TARGET_END_EXEC, oldTargetEndExec, targetEndExec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTargetEndExecCount()
  {
    return targetEndExecCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetEndExecCount(int newTargetEndExecCount)
  {
    int oldTargetEndExecCount = targetEndExecCount;
    targetEndExecCount = newTargetEndExecCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__TARGET_END_EXEC_COUNT, oldTargetEndExecCount, targetEndExecCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSourceNote()
  {
    return sourceNote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceNote(String newSourceNote)
  {
    String oldSourceNote = sourceNote;
    sourceNote = newSourceNote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__SOURCE_NOTE, oldSourceNote, sourceNote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetNote()
  {
    return targetNote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetNote(String newTargetNote)
  {
    String oldTargetNote = targetNote;
    targetNote = newTargetNote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.REGULAR_MESSAGE__TARGET_NOTE, oldTargetNote, targetNote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KieslPackage.REGULAR_MESSAGE__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case KieslPackage.REGULAR_MESSAGE__TYPE:
        return getType();
      case KieslPackage.REGULAR_MESSAGE__CAPTION:
        return getCaption();
      case KieslPackage.REGULAR_MESSAGE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case KieslPackage.REGULAR_MESSAGE__SOURCE_START_END_EXEC:
        return isSourceStartEndExec();
      case KieslPackage.REGULAR_MESSAGE__SOURCE_START_EXEC:
        return isSourceStartExec();
      case KieslPackage.REGULAR_MESSAGE__SOURCE_END_EXEC:
        return isSourceEndExec();
      case KieslPackage.REGULAR_MESSAGE__SOURCE_END_EXEC_COUNT:
        return getSourceEndExecCount();
      case KieslPackage.REGULAR_MESSAGE__TARGET_START_END_EXEC:
        return isTargetStartEndExec();
      case KieslPackage.REGULAR_MESSAGE__TARGET_START_EXEC:
        return isTargetStartExec();
      case KieslPackage.REGULAR_MESSAGE__TARGET_END_EXEC:
        return isTargetEndExec();
      case KieslPackage.REGULAR_MESSAGE__TARGET_END_EXEC_COUNT:
        return getTargetEndExecCount();
      case KieslPackage.REGULAR_MESSAGE__SOURCE_NOTE:
        return getSourceNote();
      case KieslPackage.REGULAR_MESSAGE__TARGET_NOTE:
        return getTargetNote();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KieslPackage.REGULAR_MESSAGE__SOURCE:
        setSource((CommunicationParticipant)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__TYPE:
        setType((TwoParticipantsMessageType)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__CAPTION:
        setCaption((String)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET:
        setTarget((CommunicationParticipant)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_START_END_EXEC:
        setSourceStartEndExec((Boolean)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_START_EXEC:
        setSourceStartExec((Boolean)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_END_EXEC:
        setSourceEndExec((Boolean)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_END_EXEC_COUNT:
        setSourceEndExecCount((Integer)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET_START_END_EXEC:
        setTargetStartEndExec((Boolean)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET_START_EXEC:
        setTargetStartExec((Boolean)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET_END_EXEC:
        setTargetEndExec((Boolean)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET_END_EXEC_COUNT:
        setTargetEndExecCount((Integer)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_NOTE:
        setSourceNote((String)newValue);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET_NOTE:
        setTargetNote((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KieslPackage.REGULAR_MESSAGE__SOURCE:
        setSource((CommunicationParticipant)null);
        return;
      case KieslPackage.REGULAR_MESSAGE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case KieslPackage.REGULAR_MESSAGE__CAPTION:
        setCaption(CAPTION_EDEFAULT);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET:
        setTarget((CommunicationParticipant)null);
        return;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_START_END_EXEC:
        setSourceStartEndExec(SOURCE_START_END_EXEC_EDEFAULT);
        return;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_START_EXEC:
        setSourceStartExec(SOURCE_START_EXEC_EDEFAULT);
        return;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_END_EXEC:
        setSourceEndExec(SOURCE_END_EXEC_EDEFAULT);
        return;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_END_EXEC_COUNT:
        setSourceEndExecCount(SOURCE_END_EXEC_COUNT_EDEFAULT);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET_START_END_EXEC:
        setTargetStartEndExec(TARGET_START_END_EXEC_EDEFAULT);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET_START_EXEC:
        setTargetStartExec(TARGET_START_EXEC_EDEFAULT);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET_END_EXEC:
        setTargetEndExec(TARGET_END_EXEC_EDEFAULT);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET_END_EXEC_COUNT:
        setTargetEndExecCount(TARGET_END_EXEC_COUNT_EDEFAULT);
        return;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_NOTE:
        setSourceNote(SOURCE_NOTE_EDEFAULT);
        return;
      case KieslPackage.REGULAR_MESSAGE__TARGET_NOTE:
        setTargetNote(TARGET_NOTE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KieslPackage.REGULAR_MESSAGE__SOURCE:
        return source != null;
      case KieslPackage.REGULAR_MESSAGE__TYPE:
        return type != TYPE_EDEFAULT;
      case KieslPackage.REGULAR_MESSAGE__CAPTION:
        return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
      case KieslPackage.REGULAR_MESSAGE__TARGET:
        return target != null;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_START_END_EXEC:
        return sourceStartEndExec != SOURCE_START_END_EXEC_EDEFAULT;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_START_EXEC:
        return sourceStartExec != SOURCE_START_EXEC_EDEFAULT;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_END_EXEC:
        return sourceEndExec != SOURCE_END_EXEC_EDEFAULT;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_END_EXEC_COUNT:
        return sourceEndExecCount != SOURCE_END_EXEC_COUNT_EDEFAULT;
      case KieslPackage.REGULAR_MESSAGE__TARGET_START_END_EXEC:
        return targetStartEndExec != TARGET_START_END_EXEC_EDEFAULT;
      case KieslPackage.REGULAR_MESSAGE__TARGET_START_EXEC:
        return targetStartExec != TARGET_START_EXEC_EDEFAULT;
      case KieslPackage.REGULAR_MESSAGE__TARGET_END_EXEC:
        return targetEndExec != TARGET_END_EXEC_EDEFAULT;
      case KieslPackage.REGULAR_MESSAGE__TARGET_END_EXEC_COUNT:
        return targetEndExecCount != TARGET_END_EXEC_COUNT_EDEFAULT;
      case KieslPackage.REGULAR_MESSAGE__SOURCE_NOTE:
        return SOURCE_NOTE_EDEFAULT == null ? sourceNote != null : !SOURCE_NOTE_EDEFAULT.equals(sourceNote);
      case KieslPackage.REGULAR_MESSAGE__TARGET_NOTE:
        return TARGET_NOTE_EDEFAULT == null ? targetNote != null : !TARGET_NOTE_EDEFAULT.equals(targetNote);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", caption: ");
    result.append(caption);
    result.append(", sourceStartEndExec: ");
    result.append(sourceStartEndExec);
    result.append(", sourceStartExec: ");
    result.append(sourceStartExec);
    result.append(", sourceEndExec: ");
    result.append(sourceEndExec);
    result.append(", sourceEndExecCount: ");
    result.append(sourceEndExecCount);
    result.append(", targetStartEndExec: ");
    result.append(targetStartEndExec);
    result.append(", targetStartExec: ");
    result.append(targetStartExec);
    result.append(", targetEndExec: ");
    result.append(targetEndExec);
    result.append(", targetEndExecCount: ");
    result.append(targetEndExecCount);
    result.append(", sourceNote: ");
    result.append(sourceNote);
    result.append(", targetNote: ");
    result.append(targetNote);
    result.append(')');
    return result.toString();
  }

} //RegularMessageImpl
