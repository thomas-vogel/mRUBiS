/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.MethodSpecification#getSignature <em>Signature</em>}</li>
 *   <li>{@link de.mdelab.comparch.MethodSpecification#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link de.mdelab.comparch.MethodSpecification#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link de.mdelab.comparch.MethodSpecification#getPerformanceStats <em>Performance Stats</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getMethodSpecification()
 * @model
 * @generated
 */
public interface MethodSpecification extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see de.mdelab.comparch.ComparchPackage#getMethodSpecification_Signature()
	 * @model required="true"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.MethodSpecification#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.InterfaceType#getMethodSpecifications <em>Method Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' container reference.
	 * @see #setInterfaceType(InterfaceType)
	 * @see de.mdelab.comparch.ComparchPackage#getMethodSpecification_InterfaceType()
	 * @see de.mdelab.comparch.InterfaceType#getMethodSpecifications
	 * @model opposite="methodSpecifications" required="true" transient="false"
	 * @generated
	 */
	InterfaceType getInterfaceType();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.MethodSpecification#getInterfaceType <em>Interface Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' container reference.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(InterfaceType value);

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.Exception}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Exception#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getMethodSpecification_Exceptions()
	 * @see de.mdelab.comparch.Exception#getMethod
	 * @model opposite="method"
	 * @generated
	 */
	EList<de.mdelab.comparch.Exception> getExceptions();

	/**
	 * Returns the value of the '<em><b>Performance Stats</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.PerformanceStats}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.PerformanceStats#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance Stats</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Stats</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getMethodSpecification_PerformanceStats()
	 * @see de.mdelab.comparch.PerformanceStats#getMethod
	 * @model opposite="method"
	 * @generated
	 */
	EList<PerformanceStats> getPerformanceStats();

} // MethodSpecification
