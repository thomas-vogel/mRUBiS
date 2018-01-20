/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.MethodSpecification;
import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.ProvidedInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.PerformanceStatsImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.PerformanceStatsImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.PerformanceStatsImpl#getTotalTime <em>Total Time</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.PerformanceStatsImpl#getInvocationCount <em>Invocation Count</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.PerformanceStatsImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.PerformanceStatsImpl#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceStatsImpl extends ArchitecturalElementImpl implements PerformanceStats {
	/**
	 * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final long MIN_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTime()
	 * @generated
	 * @ordered
	 */
	protected long minTime = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTime()
	 * @generated
	 * @ordered
	 */
	protected long maxTime = MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalTime() <em>Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalTime() <em>Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTime()
	 * @generated
	 * @ordered
	 */
	protected long totalTime = TOTAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvocationCount() <em>Invocation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocationCount()
	 * @generated
	 * @ordered
	 */
	protected static final long INVOCATION_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInvocationCount() <em>Invocation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocationCount()
	 * @generated
	 * @ordered
	 */
	protected long invocationCount = INVOCATION_COUNT_EDEFAULT;

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
	protected PerformanceStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.PERFORMANCE_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMinTime() {
		return minTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTime(long newMinTime) {
		long oldMinTime = minTime;
		minTime = newMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.PERFORMANCE_STATS__MIN_TIME,
					oldMinTime, minTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxTime() {
		return maxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTime(long newMaxTime) {
		long oldMaxTime = maxTime;
		maxTime = newMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.PERFORMANCE_STATS__MAX_TIME,
					oldMaxTime, maxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTotalTime() {
		return totalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalTime(long newTotalTime) {
		long oldTotalTime = totalTime;
		totalTime = newTotalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.PERFORMANCE_STATS__TOTAL_TIME,
					oldTotalTime, totalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getInvocationCount() {
		return invocationCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvocationCount(long newInvocationCount) {
		long oldInvocationCount = invocationCount;
		invocationCount = newInvocationCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.PERFORMANCE_STATS__INVOCATION_COUNT,
					oldInvocationCount, invocationCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterface getInterface() {
		if (eContainerFeatureID() != ComparchPackage.PERFORMANCE_STATS__INTERFACE)
			return null;
		return (ProvidedInterface) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(ProvidedInterface newInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInterface, ComparchPackage.PERFORMANCE_STATS__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(ProvidedInterface newInterface) {
		if (newInterface != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.PERFORMANCE_STATS__INTERFACE && newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject) newInterface).eInverseAdd(this,
						ComparchPackage.PROVIDED_INTERFACE__PERFORMANCE_STATS, ProvidedInterface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.PERFORMANCE_STATS__INTERFACE,
					newInterface, newInterface));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComparchPackage.PERFORMANCE_STATS__METHOD,
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
					ComparchPackage.PERFORMANCE_STATS__METHOD, oldMethod, newMethod);
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
				msgs = ((InternalEObject) method).eInverseRemove(this,
						ComparchPackage.METHOD_SPECIFICATION__PERFORMANCE_STATS, MethodSpecification.class, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject) newMethod).eInverseAdd(this,
						ComparchPackage.METHOD_SPECIFICATION__PERFORMANCE_STATS, MethodSpecification.class, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.PERFORMANCE_STATS__METHOD, newMethod,
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
		case ComparchPackage.PERFORMANCE_STATS__INTERFACE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetInterface((ProvidedInterface) otherEnd, msgs);
		case ComparchPackage.PERFORMANCE_STATS__METHOD:
			if (method != null)
				msgs = ((InternalEObject) method).eInverseRemove(this,
						ComparchPackage.METHOD_SPECIFICATION__PERFORMANCE_STATS, MethodSpecification.class, msgs);
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
		case ComparchPackage.PERFORMANCE_STATS__INTERFACE:
			return basicSetInterface(null, msgs);
		case ComparchPackage.PERFORMANCE_STATS__METHOD:
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
		case ComparchPackage.PERFORMANCE_STATS__INTERFACE:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.PROVIDED_INTERFACE__PERFORMANCE_STATS,
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
		case ComparchPackage.PERFORMANCE_STATS__MIN_TIME:
			return getMinTime();
		case ComparchPackage.PERFORMANCE_STATS__MAX_TIME:
			return getMaxTime();
		case ComparchPackage.PERFORMANCE_STATS__TOTAL_TIME:
			return getTotalTime();
		case ComparchPackage.PERFORMANCE_STATS__INVOCATION_COUNT:
			return getInvocationCount();
		case ComparchPackage.PERFORMANCE_STATS__INTERFACE:
			return getInterface();
		case ComparchPackage.PERFORMANCE_STATS__METHOD:
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
		case ComparchPackage.PERFORMANCE_STATS__MIN_TIME:
			setMinTime((Long) newValue);
			return;
		case ComparchPackage.PERFORMANCE_STATS__MAX_TIME:
			setMaxTime((Long) newValue);
			return;
		case ComparchPackage.PERFORMANCE_STATS__TOTAL_TIME:
			setTotalTime((Long) newValue);
			return;
		case ComparchPackage.PERFORMANCE_STATS__INVOCATION_COUNT:
			setInvocationCount((Long) newValue);
			return;
		case ComparchPackage.PERFORMANCE_STATS__INTERFACE:
			setInterface((ProvidedInterface) newValue);
			return;
		case ComparchPackage.PERFORMANCE_STATS__METHOD:
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
		case ComparchPackage.PERFORMANCE_STATS__MIN_TIME:
			setMinTime(MIN_TIME_EDEFAULT);
			return;
		case ComparchPackage.PERFORMANCE_STATS__MAX_TIME:
			setMaxTime(MAX_TIME_EDEFAULT);
			return;
		case ComparchPackage.PERFORMANCE_STATS__TOTAL_TIME:
			setTotalTime(TOTAL_TIME_EDEFAULT);
			return;
		case ComparchPackage.PERFORMANCE_STATS__INVOCATION_COUNT:
			setInvocationCount(INVOCATION_COUNT_EDEFAULT);
			return;
		case ComparchPackage.PERFORMANCE_STATS__INTERFACE:
			setInterface((ProvidedInterface) null);
			return;
		case ComparchPackage.PERFORMANCE_STATS__METHOD:
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
		case ComparchPackage.PERFORMANCE_STATS__MIN_TIME:
			return minTime != MIN_TIME_EDEFAULT;
		case ComparchPackage.PERFORMANCE_STATS__MAX_TIME:
			return maxTime != MAX_TIME_EDEFAULT;
		case ComparchPackage.PERFORMANCE_STATS__TOTAL_TIME:
			return totalTime != TOTAL_TIME_EDEFAULT;
		case ComparchPackage.PERFORMANCE_STATS__INVOCATION_COUNT:
			return invocationCount != INVOCATION_COUNT_EDEFAULT;
		case ComparchPackage.PERFORMANCE_STATS__INTERFACE:
			return getInterface() != null;
		case ComparchPackage.PERFORMANCE_STATS__METHOD:
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
		result.append(" (minTime: ");
		result.append(minTime);
		result.append(", maxTime: ");
		result.append(maxTime);
		result.append(", totalTime: ");
		result.append(totalTime);
		result.append(", invocationCount: ");
		result.append(invocationCount);
		result.append(')');
		return result.toString();
	}

} //PerformanceStatsImpl
