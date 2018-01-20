/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architectural Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.ArchitecturalElement#getUid <em>Uid</em>}</li>
 *   <li>{@link de.mdelab.comparch.ArchitecturalElement#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link de.mdelab.comparch.ArchitecturalElement#getMonitoredProperties <em>Monitored Properties</em>}</li>
 *   <li>{@link de.mdelab.comparch.ArchitecturalElement#getIssueImpacts <em>Issue Impacts</em>}</li>
 *   <li>{@link de.mdelab.comparch.ArchitecturalElement#getStrategyInputs <em>Strategy Inputs</em>}</li>
 *   <li>{@link de.mdelab.comparch.ArchitecturalElement#getWorkingDataElements <em>Working Data Elements</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getArchitecturalElement()
 * @model abstract="true"
 * @generated
 */
public interface ArchitecturalElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see de.mdelab.comparch.ComparchPackage#getArchitecturalElement_Uid()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ArchitecturalElement#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criticality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality</em>' attribute.
	 * @see #setCriticality(double)
	 * @see de.mdelab.comparch.ComparchPackage#getArchitecturalElement_Criticality()
	 * @model
	 * @generated
	 */
	double getCriticality();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ArchitecturalElement#getCriticality <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' attribute.
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(double value);

	/**
	 * Returns the value of the '<em><b>Monitored Properties</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.MonitoredProperty}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.MonitoredProperty#getArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitored Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitored Properties</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getArchitecturalElement_MonitoredProperties()
	 * @see de.mdelab.comparch.MonitoredProperty#getArchitecturalElement
	 * @model opposite="architecturalElement" containment="true"
	 * @generated
	 */
	EList<MonitoredProperty> getMonitoredProperties();

	/**
	 * Returns the value of the '<em><b>Issue Impacts</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.Impact}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Impact#getArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Impacts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Impacts</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getArchitecturalElement_IssueImpacts()
	 * @see de.mdelab.comparch.Impact#getArchitecturalElement
	 * @model opposite="architecturalElement"
	 * @generated
	 */
	EList<Impact> getIssueImpacts();

	/**
	 * Returns the value of the '<em><b>Strategy Inputs</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.InputParameter}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.InputParameter#getArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Inputs</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getArchitecturalElement_StrategyInputs()
	 * @see de.mdelab.comparch.InputParameter#getArchitecturalElement
	 * @model opposite="architecturalElement"
	 * @generated
	 */
	EList<InputParameter> getStrategyInputs();

	/**
	 * Returns the value of the '<em><b>Working Data Elements</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.ConcernedElement}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ConcernedElement#getArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Data Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Data Elements</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getArchitecturalElement_WorkingDataElements()
	 * @see de.mdelab.comparch.ConcernedElement#getArchitecturalElement
	 * @model opposite="architecturalElement"
	 * @generated
	 */
	EList<ConcernedElement> getWorkingDataElements();

} // ArchitecturalElement
