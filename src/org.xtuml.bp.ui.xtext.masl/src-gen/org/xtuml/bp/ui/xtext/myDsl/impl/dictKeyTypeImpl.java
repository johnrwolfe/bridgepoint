/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.ui.xtext.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtuml.bp.ui.xtext.myDsl.MyDslPackage;
import org.xtuml.bp.ui.xtext.myDsl.dictKeyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>dict Key Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.impl.dictKeyTypeImpl#getN <em>N</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.impl.dictKeyTypeImpl#getI <em>I</em>}</li>
 * </ul>
 *
 * @generated
 */
public class dictKeyTypeImpl extends collectionTypeRefImpl implements dictKeyType
{
  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final String N_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected String n = N_EDEFAULT;

  /**
   * The default value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected static final String I_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected String i = I_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected dictKeyTypeImpl()
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
    return MyDslPackage.Literals.DICT_KEY_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN(String newN)
  {
    String oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DICT_KEY_TYPE__N, oldN, n));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(String newI)
  {
    String oldI = i;
    i = newI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DICT_KEY_TYPE__I, oldI, i));
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
      case MyDslPackage.DICT_KEY_TYPE__N:
        return getN();
      case MyDslPackage.DICT_KEY_TYPE__I:
        return getI();
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
      case MyDslPackage.DICT_KEY_TYPE__N:
        setN((String)newValue);
        return;
      case MyDslPackage.DICT_KEY_TYPE__I:
        setI((String)newValue);
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
      case MyDslPackage.DICT_KEY_TYPE__N:
        setN(N_EDEFAULT);
        return;
      case MyDslPackage.DICT_KEY_TYPE__I:
        setI(I_EDEFAULT);
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
      case MyDslPackage.DICT_KEY_TYPE__N:
        return N_EDEFAULT == null ? n != null : !N_EDEFAULT.equals(n);
      case MyDslPackage.DICT_KEY_TYPE__I:
        return I_EDEFAULT == null ? i != null : !I_EDEFAULT.equals(i);
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
    result.append(" (n: ");
    result.append(n);
    result.append(", i: ");
    result.append(i);
    result.append(')');
    return result.toString();
  }

} //dictKeyTypeImpl