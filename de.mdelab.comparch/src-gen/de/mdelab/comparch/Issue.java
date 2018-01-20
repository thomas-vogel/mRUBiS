/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.Issue#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.mdelab.comparch.Issue#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link de.mdelab.comparch.Issue#getUtilityDrop <em>Utility Drop</em>}</li>
 *   <li>{@link de.mdelab.comparch.Issue#getAssignedAdaptationStrategies <em>Assigned Adaptation Strategies</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends Annotation {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Annotations#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' container reference.
	 * @see #setAnnotations(Annotations)
	 * @see de.mdelab.comparch.ComparchPackage#getIssue_Annotations()
	 * @see de.mdelab.comparch.Annotations#getIssues
	 * @model opposite="issues" required="true" transient="false"
	 * @generated
	 */
	Annotations getAnnotations();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Issue#getAnnotations <em>Annotations</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' container reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(Annotations value);

	/**
	 * Returns the value of the '<em><b>Impacts</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.Impact}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Impact#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impacts</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getIssue_Impacts()
	 * @see de.mdelab.comparch.Impact#getIssue
	 * @model opposite="issue" containment="true" required="true"
	 * @generated
	 */
	EList<Impact> getImpacts();

	/**
	 * Returns the value of the '<em><b>Utility Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utility Drop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utility Drop</em>' attribute.
	 * @see #setUtilityDrop(double)
	 * @see de.mdelab.comparch.ComparchPackage#getIssue_UtilityDrop()
	 * @model
	 * @generated
	 */
	double getUtilityDrop();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Issue#getUtilityDrop <em>Utility Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utility Drop</em>' attribute.
	 * @see #getUtilityDrop()
	 * @generated
	 */
	void setUtilityDrop(double value);

	/**
	 * Returns the value of the '<em><b>Assigned Adaptation Strategies</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.AdaptationStrategy}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.AdaptationStrategy#getAssignedIssues <em>Assigned Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Adaptation Strategies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Adaptation Strategies</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getIssue_AssignedAdaptationStrategies()
	 * @see de.mdelab.comparch.AdaptationStrategy#getAssignedIssues
	 * @model opposite="assignedIssues"
	 * @generated
	 */
	EList<AdaptationStrategy> getAssignedAdaptationStrategies();

} // Issue
