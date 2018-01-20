/**
 */
package de.mdelab.comparch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.Impact#getIssue <em>Issue</em>}</li>
 *   <li>{@link de.mdelab.comparch.Impact#getArchitecturalElement <em>Architectural Element</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getImpact()
 * @model
 * @generated
 */
public interface Impact extends Annotation {
	/**
	 * Returns the value of the '<em><b>Issue</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Issue#getImpacts <em>Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' container reference.
	 * @see #setIssue(Issue)
	 * @see de.mdelab.comparch.ComparchPackage#getImpact_Issue()
	 * @see de.mdelab.comparch.Issue#getImpacts
	 * @model opposite="impacts" required="true" transient="false"
	 * @generated
	 */
	Issue getIssue();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Impact#getIssue <em>Issue</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' container reference.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(Issue value);

	/**
	 * Returns the value of the '<em><b>Architectural Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ArchitecturalElement#getIssueImpacts <em>Issue Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Element</em>' reference.
	 * @see #setArchitecturalElement(ArchitecturalElement)
	 * @see de.mdelab.comparch.ComparchPackage#getImpact_ArchitecturalElement()
	 * @see de.mdelab.comparch.ArchitecturalElement#getIssueImpacts
	 * @model opposite="issueImpacts" required="true"
	 * @generated
	 */
	ArchitecturalElement getArchitecturalElement();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Impact#getArchitecturalElement <em>Architectural Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architectural Element</em>' reference.
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	void setArchitecturalElement(ArchitecturalElement value);

} // Impact
