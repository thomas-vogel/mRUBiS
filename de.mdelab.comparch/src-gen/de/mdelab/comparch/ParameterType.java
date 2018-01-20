/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.ParameterType#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.comparch.ParameterType#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.comparch.ParameterType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.mdelab.comparch.ParameterType#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.mdelab.comparch.ParameterType#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getParameterType()
 * @model
 * @generated
 */
public interface ParameterType extends ArchitecturalElement {
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
	 * @see de.mdelab.comparch.ComparchPackage#getParameterType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ParameterType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.mdelab.comparch.ComparchPackage#getParameterType_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ParameterType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see de.mdelab.comparch.ComparchPackage#getParameterType_DefaultValue()
	 * @model required="true"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ParameterType#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ComponentType#getParameterTypes <em>Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' container reference.
	 * @see #setComponentType(ComponentType)
	 * @see de.mdelab.comparch.ComparchPackage#getParameterType_ComponentType()
	 * @see de.mdelab.comparch.ComponentType#getParameterTypes
	 * @model opposite="parameterTypes" required="true" transient="false"
	 * @generated
	 */
	ComponentType getComponentType();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ParameterType#getComponentType <em>Component Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' container reference.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.Parameter}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getParameterType_Instances()
	 * @see de.mdelab.comparch.Parameter#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<Parameter> getInstances();

} // ParameterType
