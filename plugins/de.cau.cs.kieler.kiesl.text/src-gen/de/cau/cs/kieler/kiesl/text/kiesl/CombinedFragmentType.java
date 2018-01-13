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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Combined Fragment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.kiesl.text.kiesl.KieslPackage#getCombinedFragmentType()
 * @model
 * @generated
 */
public enum CombinedFragmentType implements Enumerator
{
  /**
   * The '<em><b>SEQ</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SEQ_VALUE
   * @generated
   * @ordered
   */
  SEQ(0, "SEQ", "seq"),

  /**
   * The '<em><b>ALT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALT_VALUE
   * @generated
   * @ordered
   */
  ALT(1, "ALT", "alt"),

  /**
   * The '<em><b>OPT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OPT_VALUE
   * @generated
   * @ordered
   */
  OPT(2, "OPT", "opt"),

  /**
   * The '<em><b>BREAK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BREAK_VALUE
   * @generated
   * @ordered
   */
  BREAK(3, "BREAK", "break"),

  /**
   * The '<em><b>PAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PAR_VALUE
   * @generated
   * @ordered
   */
  PAR(4, "PAR", "par"),

  /**
   * The '<em><b>STRICT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRICT_VALUE
   * @generated
   * @ordered
   */
  STRICT(5, "STRICT", "strict"),

  /**
   * The '<em><b>LOOP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOOP_VALUE
   * @generated
   * @ordered
   */
  LOOP(6, "LOOP", "loop"),

  /**
   * The '<em><b>CRITICAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CRITICAL_VALUE
   * @generated
   * @ordered
   */
  CRITICAL(7, "CRITICAL", "critical"),

  /**
   * The '<em><b>NEG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEG_VALUE
   * @generated
   * @ordered
   */
  NEG(8, "NEG", "neg"),

  /**
   * The '<em><b>ASSERT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSERT_VALUE
   * @generated
   * @ordered
   */
  ASSERT(9, "ASSERT", "assert"),

  /**
   * The '<em><b>IGNORE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IGNORE_VALUE
   * @generated
   * @ordered
   */
  IGNORE(10, "IGNORE", "ignore"),

  /**
   * The '<em><b>CONSIDER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONSIDER_VALUE
   * @generated
   * @ordered
   */
  CONSIDER(11, "CONSIDER", "consider");

  /**
   * The '<em><b>SEQ</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SEQ</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SEQ
   * @model literal="seq"
   * @generated
   * @ordered
   */
  public static final int SEQ_VALUE = 0;

  /**
   * The '<em><b>ALT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALT
   * @model literal="alt"
   * @generated
   * @ordered
   */
  public static final int ALT_VALUE = 1;

  /**
   * The '<em><b>OPT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OPT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OPT
   * @model literal="opt"
   * @generated
   * @ordered
   */
  public static final int OPT_VALUE = 2;

  /**
   * The '<em><b>BREAK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BREAK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BREAK
   * @model literal="break"
   * @generated
   * @ordered
   */
  public static final int BREAK_VALUE = 3;

  /**
   * The '<em><b>PAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PAR
   * @model literal="par"
   * @generated
   * @ordered
   */
  public static final int PAR_VALUE = 4;

  /**
   * The '<em><b>STRICT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRICT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRICT
   * @model literal="strict"
   * @generated
   * @ordered
   */
  public static final int STRICT_VALUE = 5;

  /**
   * The '<em><b>LOOP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LOOP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOOP
   * @model literal="loop"
   * @generated
   * @ordered
   */
  public static final int LOOP_VALUE = 6;

  /**
   * The '<em><b>CRITICAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CRITICAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CRITICAL
   * @model literal="critical"
   * @generated
   * @ordered
   */
  public static final int CRITICAL_VALUE = 7;

  /**
   * The '<em><b>NEG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NEG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEG
   * @model literal="neg"
   * @generated
   * @ordered
   */
  public static final int NEG_VALUE = 8;

  /**
   * The '<em><b>ASSERT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASSERT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSERT
   * @model literal="assert"
   * @generated
   * @ordered
   */
  public static final int ASSERT_VALUE = 9;

  /**
   * The '<em><b>IGNORE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>IGNORE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IGNORE
   * @model literal="ignore"
   * @generated
   * @ordered
   */
  public static final int IGNORE_VALUE = 10;

  /**
   * The '<em><b>CONSIDER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONSIDER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONSIDER
   * @model literal="consider"
   * @generated
   * @ordered
   */
  public static final int CONSIDER_VALUE = 11;

  /**
   * An array of all the '<em><b>Combined Fragment Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final CombinedFragmentType[] VALUES_ARRAY =
    new CombinedFragmentType[]
    {
      SEQ,
      ALT,
      OPT,
      BREAK,
      PAR,
      STRICT,
      LOOP,
      CRITICAL,
      NEG,
      ASSERT,
      IGNORE,
      CONSIDER,
    };

  /**
   * A public read-only list of all the '<em><b>Combined Fragment Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<CombinedFragmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Combined Fragment Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CombinedFragmentType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CombinedFragmentType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Combined Fragment Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CombinedFragmentType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      CombinedFragmentType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Combined Fragment Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static CombinedFragmentType get(int value)
  {
    switch (value)
    {
      case SEQ_VALUE: return SEQ;
      case ALT_VALUE: return ALT;
      case OPT_VALUE: return OPT;
      case BREAK_VALUE: return BREAK;
      case PAR_VALUE: return PAR;
      case STRICT_VALUE: return STRICT;
      case LOOP_VALUE: return LOOP;
      case CRITICAL_VALUE: return CRITICAL;
      case NEG_VALUE: return NEG;
      case ASSERT_VALUE: return ASSERT;
      case IGNORE_VALUE: return IGNORE;
      case CONSIDER_VALUE: return CONSIDER;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private CombinedFragmentType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //CombinedFragmentType
