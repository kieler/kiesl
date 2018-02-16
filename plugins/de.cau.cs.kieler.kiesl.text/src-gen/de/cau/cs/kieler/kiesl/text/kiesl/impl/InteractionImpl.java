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

import de.cau.cs.kieler.kiesl.text.kiesl.Element;
import de.cau.cs.kieler.kiesl.text.kiesl.Interaction;
import de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage;
import de.cau.cs.kieler.kiesl.text.kiesl.Lifeline;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionImpl#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.impl.InteractionImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionImpl extends CommunicationParticipantImpl implements Interaction
{
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
   * The cached value of the '{@link #getLifelines() <em>Lifelines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLifelines()
   * @generated
   * @ordered
   */
  protected EList<Lifeline> lifelines;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Element> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionImpl()
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
    return KieslPackage.Literals.INTERACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, KieslPackage.INTERACTION__NOTE, oldNote, note));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Lifeline> getLifelines()
  {
    if (lifelines == null)
    {
      lifelines = new EObjectContainmentEList<Lifeline>(Lifeline.class, this, KieslPackage.INTERACTION__LIFELINES);
    }
    return lifelines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Element>(Element.class, this, KieslPackage.INTERACTION__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KieslPackage.INTERACTION__LIFELINES:
        return ((InternalEList<?>)getLifelines()).basicRemove(otherEnd, msgs);
      case KieslPackage.INTERACTION__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case KieslPackage.INTERACTION__NOTE:
        return getNote();
      case KieslPackage.INTERACTION__LIFELINES:
        return getLifelines();
      case KieslPackage.INTERACTION__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KieslPackage.INTERACTION__NOTE:
        setNote((String)newValue);
        return;
      case KieslPackage.INTERACTION__LIFELINES:
        getLifelines().clear();
        getLifelines().addAll((Collection<? extends Lifeline>)newValue);
        return;
      case KieslPackage.INTERACTION__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Element>)newValue);
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
      case KieslPackage.INTERACTION__NOTE:
        setNote(NOTE_EDEFAULT);
        return;
      case KieslPackage.INTERACTION__LIFELINES:
        getLifelines().clear();
        return;
      case KieslPackage.INTERACTION__ELEMENTS:
        getElements().clear();
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
      case KieslPackage.INTERACTION__NOTE:
        return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
      case KieslPackage.INTERACTION__LIFELINES:
        return lifelines != null && !lifelines.isEmpty();
      case KieslPackage.INTERACTION__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (note: ");
    result.append(note);
    result.append(')');
    return result.toString();
  }

} //InteractionImpl
