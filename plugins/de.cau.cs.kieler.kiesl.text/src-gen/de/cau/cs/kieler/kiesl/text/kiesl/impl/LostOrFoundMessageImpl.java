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

import de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage;
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline;
import de.cau.cs.kieler.kiesl.text.kiesl.LostOrFound;
import de.cau.cs.kieler.kiesl.text.kiesl.LostOrFoundMessage;
import de.cau.cs.kieler.kiesl.text.kiesl.OneParticipantMessageType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lost Or Found Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl#getLostOrFound <em>Lost Or Found</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl#isStartEndExec <em>Start End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl#isStartExec <em>Start Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl#isEndExec <em>End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl#getEndExecCount <em>End Exec Count</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.LostOrFoundMessageImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LostOrFoundMessageImpl extends ElementImpl implements LostOrFoundMessage
{
  /**
   * The cached value of the '{@link #getLifeline() <em>Lifeline</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLifeline()
   * @generated
   * @ordered
   */
  protected Lifeline lifeline;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final OneParticipantMessageType TYPE_EDEFAULT = OneParticipantMessageType.ASYNC;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected OneParticipantMessageType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getLostOrFound() <em>Lost Or Found</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLostOrFound()
   * @generated
   * @ordered
   */
  protected static final LostOrFound LOST_OR_FOUND_EDEFAULT = LostOrFound.LOST;

  /**
   * The cached value of the '{@link #getLostOrFound() <em>Lost Or Found</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLostOrFound()
   * @generated
   * @ordered
   */
  protected LostOrFound lostOrFound = LOST_OR_FOUND_EDEFAULT;

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
   * The default value of the '{@link #isStartEndExec() <em>Start End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartEndExec()
   * @generated
   * @ordered
   */
  protected static final boolean START_END_EXEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStartEndExec() <em>Start End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartEndExec()
   * @generated
   * @ordered
   */
  protected boolean startEndExec = START_END_EXEC_EDEFAULT;

  /**
   * The default value of the '{@link #isStartExec() <em>Start Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartExec()
   * @generated
   * @ordered
   */
  protected static final boolean START_EXEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStartExec() <em>Start Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartExec()
   * @generated
   * @ordered
   */
  protected boolean startExec = START_EXEC_EDEFAULT;

  /**
   * The default value of the '{@link #isEndExec() <em>End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEndExec()
   * @generated
   * @ordered
   */
  protected static final boolean END_EXEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEndExec() <em>End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEndExec()
   * @generated
   * @ordered
   */
  protected boolean endExec = END_EXEC_EDEFAULT;

  /**
   * The default value of the '{@link #getEndExecCount() <em>End Exec Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndExecCount()
   * @generated
   * @ordered
   */
  protected static final int END_EXEC_COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEndExecCount() <em>End Exec Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndExecCount()
   * @generated
   * @ordered
   */
  protected int endExecCount = END_EXEC_COUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected static final String NOTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected String note = NOTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LostOrFoundMessageImpl()
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
    return KieslPackage.Literals.LOST_OR_FOUND_MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lifeline getLifeline()
  {
    if (lifeline != null && lifeline.eIsProxy())
    {
      InternalEObject oldLifeline = (InternalEObject)lifeline;
      lifeline = (Lifeline)eResolveProxy(oldLifeline);
      if (lifeline != oldLifeline)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, KieslPackage.LOST_OR_FOUND_MESSAGE__LIFELINE, oldLifeline, lifeline));
      }
    }
    return lifeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lifeline basicGetLifeline()
  {
    return lifeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLifeline(Lifeline newLifeline)
  {
    Lifeline oldLifeline = lifeline;
    lifeline = newLifeline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.LOST_OR_FOUND_MESSAGE__LIFELINE, oldLifeline, lifeline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OneParticipantMessageType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(OneParticipantMessageType newType)
  {
    OneParticipantMessageType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.LOST_OR_FOUND_MESSAGE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LostOrFound getLostOrFound()
  {
    return lostOrFound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLostOrFound(LostOrFound newLostOrFound)
  {
    LostOrFound oldLostOrFound = lostOrFound;
    lostOrFound = newLostOrFound == null ? LOST_OR_FOUND_EDEFAULT : newLostOrFound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.LOST_OR_FOUND_MESSAGE__LOST_OR_FOUND, oldLostOrFound, lostOrFound));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.LOST_OR_FOUND_MESSAGE__CAPTION, oldCaption, caption));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStartEndExec()
  {
    return startEndExec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartEndExec(boolean newStartEndExec)
  {
    boolean oldStartEndExec = startEndExec;
    startEndExec = newStartEndExec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.LOST_OR_FOUND_MESSAGE__START_END_EXEC, oldStartEndExec, startEndExec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStartExec()
  {
    return startExec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartExec(boolean newStartExec)
  {
    boolean oldStartExec = startExec;
    startExec = newStartExec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.LOST_OR_FOUND_MESSAGE__START_EXEC, oldStartExec, startExec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEndExec()
  {
    return endExec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndExec(boolean newEndExec)
  {
    boolean oldEndExec = endExec;
    endExec = newEndExec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.LOST_OR_FOUND_MESSAGE__END_EXEC, oldEndExec, endExec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEndExecCount()
  {
    return endExecCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndExecCount(int newEndExecCount)
  {
    int oldEndExecCount = endExecCount;
    endExecCount = newEndExecCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.LOST_OR_FOUND_MESSAGE__END_EXEC_COUNT, oldEndExecCount, endExecCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNote()
  {
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNote(String newNote)
  {
    String oldNote = note;
    note = newNote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.LOST_OR_FOUND_MESSAGE__NOTE, oldNote, note));
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
      case KieslPackage.LOST_OR_FOUND_MESSAGE__LIFELINE:
        if (resolve) return getLifeline();
        return basicGetLifeline();
      case KieslPackage.LOST_OR_FOUND_MESSAGE__TYPE:
        return getType();
      case KieslPackage.LOST_OR_FOUND_MESSAGE__LOST_OR_FOUND:
        return getLostOrFound();
      case KieslPackage.LOST_OR_FOUND_MESSAGE__CAPTION:
        return getCaption();
      case KieslPackage.LOST_OR_FOUND_MESSAGE__START_END_EXEC:
        return isStartEndExec();
      case KieslPackage.LOST_OR_FOUND_MESSAGE__START_EXEC:
        return isStartExec();
      case KieslPackage.LOST_OR_FOUND_MESSAGE__END_EXEC:
        return isEndExec();
      case KieslPackage.LOST_OR_FOUND_MESSAGE__END_EXEC_COUNT:
        return getEndExecCount();
      case KieslPackage.LOST_OR_FOUND_MESSAGE__NOTE:
        return getNote();
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
      case KieslPackage.LOST_OR_FOUND_MESSAGE__LIFELINE:
        setLifeline((Lifeline)newValue);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__TYPE:
        setType((OneParticipantMessageType)newValue);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__LOST_OR_FOUND:
        setLostOrFound((LostOrFound)newValue);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__CAPTION:
        setCaption((String)newValue);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__START_END_EXEC:
        setStartEndExec((Boolean)newValue);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__START_EXEC:
        setStartExec((Boolean)newValue);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__END_EXEC:
        setEndExec((Boolean)newValue);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__END_EXEC_COUNT:
        setEndExecCount((Integer)newValue);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__NOTE:
        setNote((String)newValue);
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
      case KieslPackage.LOST_OR_FOUND_MESSAGE__LIFELINE:
        setLifeline((Lifeline)null);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__LOST_OR_FOUND:
        setLostOrFound(LOST_OR_FOUND_EDEFAULT);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__CAPTION:
        setCaption(CAPTION_EDEFAULT);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__START_END_EXEC:
        setStartEndExec(START_END_EXEC_EDEFAULT);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__START_EXEC:
        setStartExec(START_EXEC_EDEFAULT);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__END_EXEC:
        setEndExec(END_EXEC_EDEFAULT);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__END_EXEC_COUNT:
        setEndExecCount(END_EXEC_COUNT_EDEFAULT);
        return;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__NOTE:
        setNote(NOTE_EDEFAULT);
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
      case KieslPackage.LOST_OR_FOUND_MESSAGE__LIFELINE:
        return lifeline != null;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__TYPE:
        return type != TYPE_EDEFAULT;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__LOST_OR_FOUND:
        return lostOrFound != LOST_OR_FOUND_EDEFAULT;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__CAPTION:
        return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
      case KieslPackage.LOST_OR_FOUND_MESSAGE__START_END_EXEC:
        return startEndExec != START_END_EXEC_EDEFAULT;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__START_EXEC:
        return startExec != START_EXEC_EDEFAULT;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__END_EXEC:
        return endExec != END_EXEC_EDEFAULT;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__END_EXEC_COUNT:
        return endExecCount != END_EXEC_COUNT_EDEFAULT;
      case KieslPackage.LOST_OR_FOUND_MESSAGE__NOTE:
        return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
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
    result.append(", lostOrFound: ");
    result.append(lostOrFound);
    result.append(", caption: ");
    result.append(caption);
    result.append(", startEndExec: ");
    result.append(startEndExec);
    result.append(", startExec: ");
    result.append(startExec);
    result.append(", endExec: ");
    result.append(endExec);
    result.append(", endExecCount: ");
    result.append(endExecCount);
    result.append(", note: ");
    result.append(note);
    result.append(')');
    return result.toString();
  }

} //LostOrFoundMessageImpl
