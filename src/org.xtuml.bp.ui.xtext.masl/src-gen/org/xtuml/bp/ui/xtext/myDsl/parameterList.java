/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.ui.xtext.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.parameterList#getP <em>P</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getparameterList()
 * @model
 * @generated
 */
public interface parameterList extends EObject
{
  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference list.
   * The list contents are of type {@link org.xtuml.bp.ui.xtext.myDsl.parameterDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference list.
   * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getparameterList_P()
   * @model containment="true"
   * @generated
   */
  EList<parameterDefinition> getP();

} // parameterList