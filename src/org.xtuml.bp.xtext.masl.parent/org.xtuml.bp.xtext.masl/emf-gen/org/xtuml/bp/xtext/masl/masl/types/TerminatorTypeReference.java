/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.types;

import org.xtuml.bp.xtext.masl.masl.structure.TerminatorDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminator Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.TerminatorTypeReference#getTerminator <em>Terminator</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getTerminatorTypeReference()
 * @model
 * @generated
 */
public interface TerminatorTypeReference extends AbstractTypeReference {
	/**
	 * Returns the value of the '<em><b>Terminator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminator</em>' reference.
	 * @see #setTerminator(TerminatorDefinition)
	 * @see org.xtuml.bp.xtext.masl.masl.types.TypesPackage#getTerminatorTypeReference_Terminator()
	 * @model
	 * @generated
	 */
	TerminatorDefinition getTerminator();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.types.TerminatorTypeReference#getTerminator <em>Terminator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminator</em>' reference.
	 * @see #getTerminator()
	 * @generated
	 */
	void setTerminator(TerminatorDefinition value);

} // TerminatorTypeReference
