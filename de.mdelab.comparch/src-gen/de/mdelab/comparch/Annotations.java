/**
 */
package de.mdelab.comparch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.Annotations#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link de.mdelab.comparch.Annotations#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.mdelab.comparch.Annotations#getAdaptationStrategies <em>Adaptation Strategies</em>}</li>
 *   <li>{@link de.mdelab.comparch.Annotations#getWorkingdata <em>Workingdata</em>}</li>
 *   <li>{@link de.mdelab.comparch.Annotations#getUid <em>Uid</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getAnnotations()
 * @model
 * @generated
 */
public interface Annotations extends EObject {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Architecture#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' container reference.
	 * @see #setArchitecture(Architecture)
	 * @see de.mdelab.comparch.ComparchPackage#getAnnotations_Architecture()
	 * @see de.mdelab.comparch.Architecture#getAnnotations
	 * @model opposite="annotations" required="true" transient="false"
	 * @generated
	 */
	Architecture getArchitecture();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Annotations#getArchitecture <em>Architecture</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' container reference.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(Architecture value);

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.Issue}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.Issue#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getAnnotations_Issues()
	 * @see de.mdelab.comparch.Issue#getAnnotations
	 * @model opposite="annotations" containment="true"
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Adaptation Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.AdaptationStrategy}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.AdaptationStrategy#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adaptation Strategies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adaptation Strategies</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getAnnotations_AdaptationStrategies()
	 * @see de.mdelab.comparch.AdaptationStrategy#getAnnotations
	 * @model opposite="annotations" containment="true"
	 * @generated
	 */
	EList<AdaptationStrategy> getAdaptationStrategies();

	/**
	 * Returns the value of the '<em><b>Workingdata</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.comparch.WorkingData}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.WorkingData#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workingdata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workingdata</em>' containment reference list.
	 * @see de.mdelab.comparch.ComparchPackage#getAnnotations_Workingdata()
	 * @see de.mdelab.comparch.WorkingData#getAnnotations
	 * @model opposite="annotations" containment="true"
	 * @generated
	 */
	EList<WorkingData> getWorkingdata();

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
	 * @see de.mdelab.comparch.ComparchPackage#getAnnotations_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Annotations#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

} // Annotations
