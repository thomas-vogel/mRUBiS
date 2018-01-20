/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitored Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.MonitoredProperty#getArchitecturalElement <em>Architectural Element</em>}</li>
 *   <li>{@link de.mdelab.comparch.MonitoredProperty#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.comparch.MonitoredProperty#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.comparch.MonitoredProperty#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.mdelab.comparch.MonitoredProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link de.mdelab.comparch.MonitoredProperty#getValue <em>Value</em>}</li>
 *   <li>{@link de.mdelab.comparch.MonitoredProperty#getRelatedArchitecturalElements <em>Related Architectural Elements</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getMonitoredProperty()
 * @model
 * @generated
 */
public interface MonitoredProperty extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Architectural Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ArchitecturalElement#getMonitoredProperties <em>Monitored Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Element</em>' container reference.
	 * @see #setArchitecturalElement(ArchitecturalElement)
	 * @see de.mdelab.comparch.ComparchPackage#getMonitoredProperty_ArchitecturalElement()
	 * @see de.mdelab.comparch.ArchitecturalElement#getMonitoredProperties
	 * @model opposite="monitoredProperties" required="true" transient="false"
	 * @generated
	 */
	ArchitecturalElement getArchitecturalElement();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.MonitoredProperty#getArchitecturalElement <em>Architectural Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Element</em>' container reference.
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	void setArchitecturalElement(ArchitecturalElement value);

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
	 * @see de.mdelab.comparch.ComparchPackage#getMonitoredProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.MonitoredProperty#getName <em>Name</em>}' attribute.
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
	 * @see de.mdelab.comparch.ComparchPackage#getMonitoredProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.MonitoredProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.mdelab.comparch.ComparchPackage#getMonitoredProperty_Unit()
	 * @model required="true"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.MonitoredProperty#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.mdelab.comparch.ComparchPackage#getMonitoredProperty_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.MonitoredProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.mdelab.comparch.ComparchPackage#getMonitoredProperty_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.MonitoredProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Related Architectural Elements</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.ArchitecturalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Architectural Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Architectural Elements</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getMonitoredProperty_RelatedArchitecturalElements()
	 * @model
	 * @generated
	 */
	EList<ArchitecturalElement> getRelatedArchitecturalElements();

} // MonitoredProperty
