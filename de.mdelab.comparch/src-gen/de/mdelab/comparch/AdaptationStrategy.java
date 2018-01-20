/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.AdaptationStrategy#getUtilityIncrease <em>Utility Increase</em>}</li>
 *   <li>{@link de.mdelab.comparch.AdaptationStrategy#getCosts <em>Costs</em>}</li>
 *   <li>{@link de.mdelab.comparch.AdaptationStrategy#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.mdelab.comparch.AdaptationStrategy#getAssignedIssues <em>Assigned Issues</em>}</li>
 *   <li>{@link de.mdelab.comparch.AdaptationStrategy#getInputParameters <em>Input Parameters</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getAdaptationStrategy()
 * @model
 * @generated
 */
public interface AdaptationStrategy extends Annotation {
	/**
	 * Returns the value of the '<em><b>Utility Increase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utility Increase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utility Increase</em>' attribute.
	 * @see #setUtilityIncrease(double)
	 * @see de.mdelab.comparch.ComparchPackage#getAdaptationStrategy_UtilityIncrease()
	 * @model
	 * @generated
	 */
	double getUtilityIncrease();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.AdaptationStrategy#getUtilityIncrease <em>Utility Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utility Increase</em>' attribute.
	 * @see #getUtilityIncrease()
	 * @generated
	 */
	void setUtilityIncrease(double value);

	/**
	 * Returns the value of the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costs</em>' attribute.
	 * @see #setCosts(double)
	 * @see de.mdelab.comparch.ComparchPackage#getAdaptationStrategy_Costs()
	 * @model
	 * @generated
	 */
	double getCosts();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.AdaptationStrategy#getCosts <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Costs</em>' attribute.
	 * @see #getCosts()
	 * @generated
	 */
	void setCosts(double value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Annotations#getAdaptationStrategies <em>Adaptation Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' container reference.
	 * @see #setAnnotations(Annotations)
	 * @see de.mdelab.comparch.ComparchPackage#getAdaptationStrategy_Annotations()
	 * @see de.mdelab.comparch.Annotations#getAdaptationStrategies
	 * @model opposite="adaptationStrategies" required="true" transient="false"
	 * @generated
	 */
	Annotations getAnnotations();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.AdaptationStrategy#getAnnotations <em>Annotations</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' container reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(Annotations value);

	/**
	 * Returns the value of the '<em><b>Assigned Issues</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.comparch.Issue}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Issue#getAssignedAdaptationStrategies <em>Assigned Adaptation Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Issues</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Issues</em>' reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getAdaptationStrategy_AssignedIssues()
	 * @see de.mdelab.comparch.Issue#getAssignedAdaptationStrategies
	 * @model opposite="assignedAdaptationStrategies" required="true"
	 * @generated
	 */
	EList<Issue> getAssignedIssues();

	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.InputParameter}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.InputParameter#getAdaptationStrategy <em>Adaptation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getAdaptationStrategy_InputParameters()
	 * @see de.mdelab.comparch.InputParameter#getAdaptationStrategy
	 * @model opposite="adaptationStrategy" containment="true"
	 * @generated
	 */
	EList<InputParameter> getInputParameters();

} // AdaptationStrategy
