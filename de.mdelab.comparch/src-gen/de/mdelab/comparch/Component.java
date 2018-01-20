/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.Component#getTenant <em>Tenant</em>}</li>
 *   <li>{@link de.mdelab.comparch.Component#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.comparch.Component#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.mdelab.comparch.Component#getState <em>State</em>}</li>
 *   <li>{@link de.mdelab.comparch.Component#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link de.mdelab.comparch.Component#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link de.mdelab.comparch.Component#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Tenant#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' container reference.
	 * @see #setTenant(Tenant)
	 * @see de.mdelab.comparch.ComparchPackage#getComponent_Tenant()
	 * @see de.mdelab.comparch.Tenant#getComponents
	 * @model opposite="components" required="true" transient="false"
	 * @generated
	 */
	Tenant getTenant();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Component#getTenant <em>Tenant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' container reference.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(Tenant value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ComponentType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see de.mdelab.comparch.ComparchPackage#getComponent_Type()
	 * @see de.mdelab.comparch.ComponentType#getInstances
	 * @model opposite="instances" required="true"
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Component#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.Parameter}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Parameter#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getComponent_Parameters()
	 * @see de.mdelab.comparch.Parameter#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link de.mdelab.comparch.ComponentState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see de.mdelab.comparch.ComponentState
	 * @see #setState(ComponentState)
	 * @see de.mdelab.comparch.ComparchPackage#getComponent_State()
	 * @model required="true"
	 * @generated
	 */
	ComponentState getState();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Component#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see de.mdelab.comparch.ComponentState
	 * @see #getState()
	 * @generated
	 */
	void setState(ComponentState value);

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.RequiredInterface}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.RequiredInterface#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getComponent_RequiredInterfaces()
	 * @see de.mdelab.comparch.RequiredInterface#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<RequiredInterface> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.ProvidedInterface}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ProvidedInterface#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getComponent_ProvidedInterfaces()
	 * @see de.mdelab.comparch.ProvidedInterface#getComponent
	 * @model opposite="component" containment="true" required="true"
	 * @generated
	 */
	EList<ProvidedInterface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.mdelab.comparch.ComparchPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Component
