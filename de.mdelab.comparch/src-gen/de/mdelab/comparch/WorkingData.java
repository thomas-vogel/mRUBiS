/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Working Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.WorkingData#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.mdelab.comparch.WorkingData#getValue <em>Value</em>}</li>
 *   <li>{@link de.mdelab.comparch.WorkingData#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.mdelab.comparch.WorkingData#getConcernedElements <em>Concerned Elements</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getWorkingData()
 * @model
 * @generated
 */
public interface WorkingData extends Annotation {
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
	 * @see de.mdelab.comparch.ComparchPackage#getWorkingData_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.WorkingData#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

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
	 * @see de.mdelab.comparch.ComparchPackage#getWorkingData_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.WorkingData#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Annotations#getWorkingdata <em>Workingdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' container reference.
	 * @see #setAnnotations(Annotations)
	 * @see de.mdelab.comparch.ComparchPackage#getWorkingData_Annotations()
	 * @see de.mdelab.comparch.Annotations#getWorkingdata
	 * @model opposite="workingdata" required="true" transient="false"
	 * @generated
	 */
	Annotations getAnnotations();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.WorkingData#getAnnotations <em>Annotations</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' container reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(Annotations value);

	/**
	 * Returns the value of the '<em><b>Concerned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.ConcernedElement}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ConcernedElement#getWorkingdata <em>Workingdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerned Elements</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getWorkingData_ConcernedElements()
	 * @see de.mdelab.comparch.ConcernedElement#getWorkingdata
	 * @model opposite="workingdata" containment="true"
	 * @generated
	 */
	EList<ConcernedElement> getConcernedElements();

} // WorkingData
