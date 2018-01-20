/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.comparch.ComponentType#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link de.mdelab.comparch.ComponentType#getRequiredInterfaceTypes <em>Required Interface Types</em>}</li>
 *   <li>{@link de.mdelab.comparch.ComponentType#getProvidedInterfaceTypes <em>Provided Interface Types</em>}</li>
 *   <li>{@link de.mdelab.comparch.ComponentType#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link de.mdelab.comparch.ComponentType#getInstances <em>Instances</em>}</li>
 *   <li>{@link de.mdelab.comparch.ComponentType#getReliability <em>Reliability</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends ArchitecturalElement {
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
	 * @see de.mdelab.comparch.ComparchPackage#getComponentType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ComponentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Architecture#getComponentTypes <em>Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' container reference.
	 * @see #setArchitecture(Architecture)
	 * @see de.mdelab.comparch.ComparchPackage#getComponentType_Architecture()
	 * @see de.mdelab.comparch.Architecture#getComponentTypes
	 * @model opposite="componentTypes" required="true" transient="false"
	 * @generated
	 */
	Architecture getArchitecture();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ComponentType#getArchitecture <em>Architecture</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' container reference.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(Architecture value);

	/**
	 * Returns the value of the '<em><b>Required Interface Types</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.InterfaceType}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.InterfaceType#getRequiringComponentTypes <em>Requiring Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interface Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interface Types</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getComponentType_RequiredInterfaceTypes()
	 * @see de.mdelab.comparch.InterfaceType#getRequiringComponentTypes
	 * @model opposite="requiringComponentTypes"
	 * @generated
	 */
	EList<InterfaceType> getRequiredInterfaceTypes();

	/**
	 * Returns the value of the '<em><b>Provided Interface Types</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.InterfaceType}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.InterfaceType#getProvidingComponentTypes <em>Providing Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interface Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interface Types</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getComponentType_ProvidedInterfaceTypes()
	 * @see de.mdelab.comparch.InterfaceType#getProvidingComponentTypes
	 * @model opposite="providingComponentTypes" required="true"
	 * @generated
	 */
	EList<InterfaceType> getProvidedInterfaceTypes();

	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.ParameterType}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ParameterType#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Types</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getComponentType_ParameterTypes()
	 * @see de.mdelab.comparch.ParameterType#getComponentType
	 * @model opposite="componentType" containment="true"
	 * @generated
	 */
	EList<ParameterType> getParameterTypes();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.Component}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getComponentType_Instances()
	 * @see de.mdelab.comparch.Component#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<Component> getInstances();

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability</em>' attribute.
	 * @see #setReliability(double)
	 * @see de.mdelab.comparch.ComparchPackage#getComponentType_Reliability()
	 * @model
	 * @generated
	 */
	double getReliability();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ComponentType#getReliability <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' attribute.
	 * @see #getReliability()
	 * @generated
	 */
	void setReliability(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Component instantiate();

} // ComponentType
