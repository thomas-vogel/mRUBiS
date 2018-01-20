/**
 */
package de.mdelab.comparch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.Exception#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.comparch.Exception#getMessage <em>Message</em>}</li>
 *   <li>{@link de.mdelab.comparch.Exception#getStackTrace <em>Stack Trace</em>}</li>
 *   <li>{@link de.mdelab.comparch.Exception#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.mdelab.comparch.Exception#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see de.mdelab.comparch.ComparchPackage#getException()
 * @model
 * @generated
 */
public interface Exception extends ArchitecturalElement {
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
	 * @see de.mdelab.comparch.ComparchPackage#getException_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Exception#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see de.mdelab.comparch.ComparchPackage#getException_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Exception#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Stack Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack Trace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Trace</em>' attribute.
	 * @see #setStackTrace(String)
	 * @see de.mdelab.comparch.ComparchPackage#getException_StackTrace()
	 * @model
	 * @generated
	 */
	String getStackTrace();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Exception#getStackTrace <em>Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Trace</em>' attribute.
	 * @see #getStackTrace()
	 * @generated
	 */
	void setStackTrace(String value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.ProvidedInterface#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(ProvidedInterface)
	 * @see de.mdelab.comparch.ComparchPackage#getException_Interface()
	 * @see de.mdelab.comparch.ProvidedInterface#getExceptions
	 * @model opposite="exceptions" required="true" transient="false"
	 * @generated
	 */
	ProvidedInterface getInterface();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Exception#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(ProvidedInterface value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.comparch.MethodSpecification#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(MethodSpecification)
	 * @see de.mdelab.comparch.ComparchPackage#getException_Method()
	 * @see de.mdelab.comparch.MethodSpecification#getExceptions
	 * @model opposite="exceptions"
	 * @generated
	 */
	MethodSpecification getMethod();

	/**
	 * Sets the value of the '{@link de.mdelab.comparch.Exception#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(MethodSpecification value);

} // Exception
