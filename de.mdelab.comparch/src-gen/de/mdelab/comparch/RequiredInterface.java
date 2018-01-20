/**
 */
package de.mdelab.comparch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.RequiredInterface#getComponent <em>Component</em>}</li>
 *   <li>{@link de.mdelab.comparch.RequiredInterface#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getRequiredInterface()
 * @model
 * @generated
 */
public interface RequiredInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Component#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see de.mdelab.comparch.ComparchPackage#getRequiredInterface_Component()
	 * @see de.mdelab.comparch.Component#getRequiredInterfaces
	 * @model opposite="requiredInterfaces" required="true" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.RequiredInterface#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference.
	 * @see #setConnector(Connector)
	 * @see de.mdelab.comparch.ComparchPackage#getRequiredInterface_Connector()
	 * @see de.mdelab.comparch.Connector#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.RequiredInterface#getConnector <em>Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' containment reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // RequiredInterface
