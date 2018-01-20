/**
 */
package de.mdelab.comparch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.PerformanceStats#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link de.mdelab.comparch.PerformanceStats#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link de.mdelab.comparch.PerformanceStats#getTotalTime <em>Total Time</em>}</li>
 *   <li>{@link de.mdelab.comparch.PerformanceStats#getInvocationCount <em>Invocation Count</em>}</li>
 *   <li>{@link de.mdelab.comparch.PerformanceStats#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.mdelab.comparch.PerformanceStats#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getPerformanceStats()
 * @model
 * @generated
 */
public interface PerformanceStats extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(long)
	 * @see de.mdelab.comparch.ComparchPackage#getPerformanceStats_MinTime()
	 * @model
	 * @generated
	 */
	long getMinTime();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.PerformanceStats#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(long value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(long)
	 * @see de.mdelab.comparch.ComparchPackage#getPerformanceStats_MaxTime()
	 * @model
	 * @generated
	 */
	long getMaxTime();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.PerformanceStats#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(long value);

	/**
	 * Returns the value of the '<em><b>Total Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Time</em>' attribute.
	 * @see #setTotalTime(long)
	 * @see de.mdelab.comparch.ComparchPackage#getPerformanceStats_TotalTime()
	 * @model
	 * @generated
	 */
	long getTotalTime();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.PerformanceStats#getTotalTime <em>Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Time</em>' attribute.
	 * @see #getTotalTime()
	 * @generated
	 */
	void setTotalTime(long value);

	/**
	 * Returns the value of the '<em><b>Invocation Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocation Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation Count</em>' attribute.
	 * @see #setInvocationCount(long)
	 * @see de.mdelab.comparch.ComparchPackage#getPerformanceStats_InvocationCount()
	 * @model
	 * @generated
	 */
	long getInvocationCount();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.PerformanceStats#getInvocationCount <em>Invocation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocation Count</em>' attribute.
	 * @see #getInvocationCount()
	 * @generated
	 */
	void setInvocationCount(long value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ProvidedInterface#getPerformanceStats <em>Performance Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(ProvidedInterface)
	 * @see de.mdelab.comparch.ComparchPackage#getPerformanceStats_Interface()
	 * @see de.mdelab.comparch.ProvidedInterface#getPerformanceStats
	 * @model opposite="performanceStats" required="true" transient="false"
	 * @generated
	 */
	ProvidedInterface getInterface();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.PerformanceStats#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(ProvidedInterface value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.MethodSpecification#getPerformanceStats <em>Performance Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(MethodSpecification)
	 * @see de.mdelab.comparch.ComparchPackage#getPerformanceStats_Method()
	 * @see de.mdelab.comparch.MethodSpecification#getPerformanceStats
	 * @model opposite="performanceStats" required="true"
	 * @generated
	 */
	MethodSpecification getMethod();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.PerformanceStats#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(MethodSpecification value);

} // PerformanceStats
