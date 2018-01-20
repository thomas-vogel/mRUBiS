/**
 */
package de.mdelab.comparch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concerned Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.ConcernedElement#getWorkingdata <em>Workingdata</em>}</li>
 *   <li>{@link de.mdelab.comparch.ConcernedElement#getArchitecturalElement <em>Architectural Element</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getConcernedElement()
 * @model
 * @generated
 */
public interface ConcernedElement extends Annotation {
	/**
	 * Returns the value of the '<em><b>Workingdata</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.WorkingData#getConcernedElements <em>Concerned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workingdata</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workingdata</em>' container reference.
	 * @see #setWorkingdata(WorkingData)
	 * @see de.mdelab.comparch.ComparchPackage#getConcernedElement_Workingdata()
	 * @see de.mdelab.comparch.WorkingData#getConcernedElements
	 * @model opposite="concernedElements" required="true" transient="false"
	 * @generated
	 */
	WorkingData getWorkingdata();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ConcernedElement#getWorkingdata <em>Workingdata</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workingdata</em>' container reference.
	 * @see #getWorkingdata()
	 * @generated
	 */
	void setWorkingdata(WorkingData value);

	/**
	 * Returns the value of the '<em><b>Architectural Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ArchitecturalElement#getWorkingDataElements <em>Working Data Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Element</em>' reference.
	 * @see #setArchitecturalElement(ArchitecturalElement)
	 * @see de.mdelab.comparch.ComparchPackage#getConcernedElement_ArchitecturalElement()
	 * @see de.mdelab.comparch.ArchitecturalElement#getWorkingDataElements
	 * @model opposite="workingDataElements" required="true"
	 * @generated
	 */
	ArchitecturalElement getArchitecturalElement();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.ConcernedElement#getArchitecturalElement <em>Architectural Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Element</em>' reference.
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	void setArchitecturalElement(ArchitecturalElement value);

} // ConcernedElement
