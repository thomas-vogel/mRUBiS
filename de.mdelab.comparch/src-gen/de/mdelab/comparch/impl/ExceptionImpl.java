/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.MethodSpecification;
import de.mdelab.comparch.ProvidedInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.ExceptionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ExceptionImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ExceptionImpl#getStackTrace <em>Stack Trace</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ExceptionImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ExceptionImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionImpl extends ArchitecturalElementImpl implements de.mdelab.comparch.Exception {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStackTrace() <em>Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTrace()
	 * @generated
	 * @ordered
	 */
	protected static final String STACK_TRACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackTrace() <em>Stack Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTrace()
	 * @generated
	 * @ordered
	 */
	protected String stackTrace = STACK_TRACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected MethodSpecification method;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.EXCEPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.EXCEPTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.EXCEPTION__MESSAGE, oldMessage,
					message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStackTrace() {
		return stackTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStackTrace(String newStackTrace) {
		String oldStackTrace = stackTrace;
		stackTrace = newStackTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.EXCEPTION__STACK_TRACE, oldStackTrace,
					stackTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterface getInterface() {
		if (eContainerFeatureID() != ComparchPackage.EXCEPTION__INTERFACE)
			return null;
		return (ProvidedInterface) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(ProvidedInterface newInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInterface, ComparchPackage.EXCEPTION__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(ProvidedInterface newInterface) {
		if (newInterface != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.EXCEPTION__INTERFACE && newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject) newInterface).eInverseAdd(this,
						ComparchPackage.PROVIDED_INTERFACE__EXCEPTIONS, ProvidedInterface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.EXCEPTION__INTERFACE, newInterface,
					newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodSpecification getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject) method;
			method = (MethodSpecification) eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComparchPackage.EXCEPTION__METHOD,
							oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodSpecification basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(MethodSpecification newMethod, NotificationChain msgs) {
		MethodSpecification oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ComparchPackage.EXCEPTION__METHOD, oldMethod, newMethod);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(MethodSpecification newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject) method).eInverseRemove(this, ComparchPackage.METHOD_SPECIFICATION__EXCEPTIONS,
						MethodSpecification.class, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject) newMethod).eInverseAdd(this, ComparchPackage.METHOD_SPECIFICATION__EXCEPTIONS,
						MethodSpecification.class, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.EXCEPTION__METHOD, newMethod,
					newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComparchPackage.EXCEPTION__INTERFACE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetInterface((ProvidedInterface) otherEnd, msgs);
		case ComparchPackage.EXCEPTION__METHOD:
			if (method != null)
				msgs = ((InternalEObject) method).eInverseRemove(this, ComparchPackage.METHOD_SPECIFICATION__EXCEPTIONS,
						MethodSpecification.class, msgs);
			return basicSetMethod((MethodSpecification) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComparchPackage.EXCEPTION__INTERFACE:
			return basicSetInterface(null, msgs);
		case ComparchPackage.EXCEPTION__METHOD:
			return basicSetMethod(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ComparchPackage.EXCEPTION__INTERFACE:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.PROVIDED_INTERFACE__EXCEPTIONS,
					ProvidedInterface.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComparchPackage.EXCEPTION__TYPE:
			return getType();
		case ComparchPackage.EXCEPTION__MESSAGE:
			return getMessage();
		case ComparchPackage.EXCEPTION__STACK_TRACE:
			return getStackTrace();
		case ComparchPackage.EXCEPTION__INTERFACE:
			return getInterface();
		case ComparchPackage.EXCEPTION__METHOD:
			if (resolve)
				return getMethod();
			return basicGetMethod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComparchPackage.EXCEPTION__TYPE:
			setType((String) newValue);
			return;
		case ComparchPackage.EXCEPTION__MESSAGE:
			setMessage((String) newValue);
			return;
		case ComparchPackage.EXCEPTION__STACK_TRACE:
			setStackTrace((String) newValue);
			return;
		case ComparchPackage.EXCEPTION__INTERFACE:
			setInterface((ProvidedInterface) newValue);
			return;
		case ComparchPackage.EXCEPTION__METHOD:
			setMethod((MethodSpecification) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ComparchPackage.EXCEPTION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ComparchPackage.EXCEPTION__MESSAGE:
			setMessage(MESSAGE_EDEFAULT);
			return;
		case ComparchPackage.EXCEPTION__STACK_TRACE:
			setStackTrace(STACK_TRACE_EDEFAULT);
			return;
		case ComparchPackage.EXCEPTION__INTERFACE:
			setInterface((ProvidedInterface) null);
			return;
		case ComparchPackage.EXCEPTION__METHOD:
			setMethod((MethodSpecification) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ComparchPackage.EXCEPTION__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ComparchPackage.EXCEPTION__MESSAGE:
			return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
		case ComparchPackage.EXCEPTION__STACK_TRACE:
			return STACK_TRACE_EDEFAULT == null ? stackTrace != null : !STACK_TRACE_EDEFAULT.equals(stackTrace);
		case ComparchPackage.EXCEPTION__INTERFACE:
			return getInterface() != null;
		case ComparchPackage.EXCEPTION__METHOD:
			return method != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", message: ");
		result.append(message);
		result.append(", stackTrace: ");
		result.append(stackTrace);
		result.append(')');
		return result.toString();
	}

} //ExceptionImpl
