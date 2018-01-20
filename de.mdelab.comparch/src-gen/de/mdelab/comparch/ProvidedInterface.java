/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.ProvidedInterface#getComponent <em>Component</em>}</li>
 *   <li>{@link de.mdelab.comparch.ProvidedInterface#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.mdelab.comparch.ProvidedInterface#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link de.mdelab.comparch.ProvidedInterface#getPerformanceStats <em>Performance Stats</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getProvidedInterface()
 * @model
 * @generated
 */
public interface ProvidedInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Component#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' container reference.
	 * @see #setComponent(Component)
	 * @see de.mdelab.comparch.ComparchPackage#getProvidedInterface_Component()
	 * @see de.mdelab.comparch.Component#getProvidedInterfaces
	 * @model opposite="providedInterfaces" required="true" transient="false"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ProvidedInterface#getComponent <em>Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' container reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.Connector}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getProvidedInterface_Connectors()
	 * @see de.mdelab.comparch.Connector#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.Exception}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Exception#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getProvidedInterface_Exceptions()
	 * @see de.mdelab.comparch.Exception#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<de.mdelab.comparch.Exception> getExceptions();

	/**
	 * Returns the value of the '<em><b>Performance Stats</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.PerformanceStats}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.PerformanceStats#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance Stats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Stats</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getProvidedInterface_PerformanceStats()
	 * @see de.mdelab.comparch.PerformanceStats#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<PerformanceStats> getPerformanceStats();

} // ProvidedInterface
