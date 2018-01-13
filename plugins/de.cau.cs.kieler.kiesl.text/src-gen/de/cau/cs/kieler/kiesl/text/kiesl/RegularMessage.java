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
 * A representation of the model object '<em><b>Regular Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getCaption <em>Caption</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTarget <em>Target</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceStartEndExec <em>Source Start End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceStartExec <em>Source Start Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceEndExec <em>Source End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSourceEndExecCount <em>Source End Exec Count</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetStartEndExec <em>Target Start End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetStartExec <em>Target Start Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetEndExec <em>Target End Exec</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTargetEndExecCount <em>Target End Exec Count</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSourceNote <em>Source Note</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTargetNote <em>Target Note</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage()
 * @model
 * @generated
 */
public interface RegularMessage extends Element
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(CommunicationParticipant)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_Source()
   * @model
   * @generated
   */
  CommunicationParticipant getSource();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(CommunicationParticipant value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType
   * @see #setType(TwoParticipantsMessageType)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_Type()
   * @model
   * @generated
   */
  TwoParticipantsMessageType getType();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see de.cau.cs.kieler.kiesl.text.kiesl.TwoParticipantsMessageType
   * @see #getType()
   * @generated
   */
  void setType(TwoParticipantsMessageType value);

  /**
   * Returns the value of the '<em><b>Caption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caption</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caption</em>' attribute.
   * @see #setCaption(String)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_Caption()
   * @model
   * @generated
   */
  String getCaption();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getCaption <em>Caption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caption</em>' attribute.
   * @see #getCaption()
   * @generated
   */
  void setCaption(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(CommunicationParticipant)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_Target()
   * @model
   * @generated
   */
  CommunicationParticipant getTarget();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(CommunicationParticipant value);

  /**
   * Returns the value of the '<em><b>Source Start End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Start End Exec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Start End Exec</em>' attribute.
   * @see #setSourceStartEndExec(boolean)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_SourceStartEndExec()
   * @model
   * @generated
   */
  boolean isSourceStartEndExec();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceStartEndExec <em>Source Start End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Start End Exec</em>' attribute.
   * @see #isSourceStartEndExec()
   * @generated
   */
  void setSourceStartEndExec(boolean value);

  /**
   * Returns the value of the '<em><b>Source Start Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Start Exec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Start Exec</em>' attribute.
   * @see #setSourceStartExec(boolean)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_SourceStartExec()
   * @model
   * @generated
   */
  boolean isSourceStartExec();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceStartExec <em>Source Start Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Start Exec</em>' attribute.
   * @see #isSourceStartExec()
   * @generated
   */
  void setSourceStartExec(boolean value);

  /**
   * Returns the value of the '<em><b>Source End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source End Exec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source End Exec</em>' attribute.
   * @see #setSourceEndExec(boolean)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_SourceEndExec()
   * @model
   * @generated
   */
  boolean isSourceEndExec();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isSourceEndExec <em>Source End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source End Exec</em>' attribute.
   * @see #isSourceEndExec()
   * @generated
   */
  void setSourceEndExec(boolean value);

  /**
   * Returns the value of the '<em><b>Source End Exec Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source End Exec Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source End Exec Count</em>' attribute.
   * @see #setSourceEndExecCount(int)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_SourceEndExecCount()
   * @model
   * @generated
   */
  int getSourceEndExecCount();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSourceEndExecCount <em>Source End Exec Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source End Exec Count</em>' attribute.
   * @see #getSourceEndExecCount()
   * @generated
   */
  void setSourceEndExecCount(int value);

  /**
   * Returns the value of the '<em><b>Target Start End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Start End Exec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Start End Exec</em>' attribute.
   * @see #setTargetStartEndExec(boolean)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_TargetStartEndExec()
   * @model
   * @generated
   */
  boolean isTargetStartEndExec();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetStartEndExec <em>Target Start End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Start End Exec</em>' attribute.
   * @see #isTargetStartEndExec()
   * @generated
   */
  void setTargetStartEndExec(boolean value);

  /**
   * Returns the value of the '<em><b>Target Start Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Start Exec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Start Exec</em>' attribute.
   * @see #setTargetStartExec(boolean)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_TargetStartExec()
   * @model
   * @generated
   */
  boolean isTargetStartExec();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetStartExec <em>Target Start Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Start Exec</em>' attribute.
   * @see #isTargetStartExec()
   * @generated
   */
  void setTargetStartExec(boolean value);

  /**
   * Returns the value of the '<em><b>Target End Exec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target End Exec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target End Exec</em>' attribute.
   * @see #setTargetEndExec(boolean)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_TargetEndExec()
   * @model
   * @generated
   */
  boolean isTargetEndExec();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#isTargetEndExec <em>Target End Exec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target End Exec</em>' attribute.
   * @see #isTargetEndExec()
   * @generated
   */
  void setTargetEndExec(boolean value);

  /**
   * Returns the value of the '<em><b>Target End Exec Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target End Exec Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target End Exec Count</em>' attribute.
   * @see #setTargetEndExecCount(int)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_TargetEndExecCount()
   * @model
   * @generated
   */
  int getTargetEndExecCount();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTargetEndExecCount <em>Target End Exec Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target End Exec Count</em>' attribute.
   * @see #getTargetEndExecCount()
   * @generated
   */
  void setTargetEndExecCount(int value);

  /**
   * Returns the value of the '<em><b>Source Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Note</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Note</em>' attribute.
   * @see #setSourceNote(String)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_SourceNote()
   * @model
   * @generated
   */
  String getSourceNote();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getSourceNote <em>Source Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Note</em>' attribute.
   * @see #getSourceNote()
   * @generated
   */
  void setSourceNote(String value);

  /**
   * Returns the value of the '<em><b>Target Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Note</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Note</em>' attribute.
   * @see #setTargetNote(String)
   * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getRegularMessage_TargetNote()
   * @model
   * @generated
   */
  String getTargetNote();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.kiesl.text.kiesl.RegularMessage#getTargetNote <em>Target Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Note</em>' attribute.
   * @see #getTargetNote()
   * @generated
   */
  void setTargetNote(String value);

} // RegularMessage
