/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.Issue;
import de.mdelab.comparch.WorkingData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.AnnotationsImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.AnnotationsImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.AnnotationsImpl#getAdaptationStrategies <em>Adaptation Strategies</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.AnnotationsImpl#getWorkingdata <em>Workingdata</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.AnnotationsImpl#getUid <em>Uid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationsImpl extends MinimalEObjectImpl.Container implements Annotations {
	/**
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issues;

	/**
	 * The cached value of the '{@link #getAdaptationStrategies() <em>Adaptation Strategies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<AdaptationStrategy> adaptationStrategies;

	/**
	 * The cached value of the '{@link #getWorkingdata() <em>Workingdata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingdata()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkingData> workingdata;

	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.ANNOTATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture getArchitecture() {
		if (eContainerFeatureID() != ComparchPackage.ANNOTATIONS__ARCHITECTURE)
			return null;
		return (Architecture) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchitecture(Architecture newArchitecture, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newArchitecture, ComparchPackage.ANNOTATIONS__ARCHITECTURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(Architecture newArchitecture) {
		if (newArchitecture != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.ANNOTATIONS__ARCHITECTURE && newArchitecture != null)) {
			if (EcoreUtil.isAncestor(this, newArchitecture))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newArchitecture != null)
				msgs = ((InternalEObject) newArchitecture).eInverseAdd(this, ComparchPackage.ARCHITECTURE__ANNOTATIONS,
						Architecture.class, msgs);
			msgs = basicSetArchitecture(newArchitecture, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.ANNOTATIONS__ARCHITECTURE,
					newArchitecture, newArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getIssues() {
		if (issues == null) {
			issues = new EObjectContainmentWithInverseEList<Issue>(Issue.class, this,
					ComparchPackage.ANNOTATIONS__ISSUES, ComparchPackage.ISSUE__ANNOTATIONS);
		}
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdaptationStrategy> getAdaptationStrategies() {
		if (adaptationStrategies == null) {
			adaptationStrategies = new EObjectContainmentWithInverseEList<AdaptationStrategy>(AdaptationStrategy.class,
					this, ComparchPackage.ANNOTATIONS__ADAPTATION_STRATEGIES,
					ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS);
		}
		return adaptationStrategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkingData> getWorkingdata() {
		if (workingdata == null) {
			workingdata = new EObjectContainmentWithInverseEList<WorkingData>(WorkingData.class, this,
					ComparchPackage.ANNOTATIONS__WORKINGDATA, ComparchPackage.WORKING_DATA__ANNOTATIONS);
		}
		return workingdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.ANNOTATIONS__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComparchPackage.ANNOTATIONS__ARCHITECTURE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetArchitecture((Architecture) otherEnd, msgs);
		case ComparchPackage.ANNOTATIONS__ISSUES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIssues()).basicAdd(otherEnd, msgs);
		case ComparchPackage.ANNOTATIONS__ADAPTATION_STRATEGIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAdaptationStrategies()).basicAdd(otherEnd,
					msgs);
		case ComparchPackage.ANNOTATIONS__WORKINGDATA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getWorkingdata()).basicAdd(otherEnd, msgs);
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
		case ComparchPackage.ANNOTATIONS__ARCHITECTURE:
			return basicSetArchitecture(null, msgs);
		case ComparchPackage.ANNOTATIONS__ISSUES:
			return ((InternalEList<?>) getIssues()).basicRemove(otherEnd, msgs);
		case ComparchPackage.ANNOTATIONS__ADAPTATION_STRATEGIES:
			return ((InternalEList<?>) getAdaptationStrategies()).basicRemove(otherEnd, msgs);
		case ComparchPackage.ANNOTATIONS__WORKINGDATA:
			return ((InternalEList<?>) getWorkingdata()).basicRemove(otherEnd, msgs);
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
		case ComparchPackage.ANNOTATIONS__ARCHITECTURE:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.ARCHITECTURE__ANNOTATIONS,
					Architecture.class, msgs);
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
		case ComparchPackage.ANNOTATIONS__ARCHITECTURE:
			return getArchitecture();
		case ComparchPackage.ANNOTATIONS__ISSUES:
			return getIssues();
		case ComparchPackage.ANNOTATIONS__ADAPTATION_STRATEGIES:
			return getAdaptationStrategies();
		case ComparchPackage.ANNOTATIONS__WORKINGDATA:
			return getWorkingdata();
		case ComparchPackage.ANNOTATIONS__UID:
			return getUid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComparchPackage.ANNOTATIONS__ARCHITECTURE:
			setArchitecture((Architecture) newValue);
			return;
		case ComparchPackage.ANNOTATIONS__ISSUES:
			getIssues().clear();
			getIssues().addAll((Collection<? extends Issue>) newValue);
			return;
		case ComparchPackage.ANNOTATIONS__ADAPTATION_STRATEGIES:
			getAdaptationStrategies().clear();
			getAdaptationStrategies().addAll((Collection<? extends AdaptationStrategy>) newValue);
			return;
		case ComparchPackage.ANNOTATIONS__WORKINGDATA:
			getWorkingdata().clear();
			getWorkingdata().addAll((Collection<? extends WorkingData>) newValue);
			return;
		case ComparchPackage.ANNOTATIONS__UID:
			setUid((String) newValue);
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
		case ComparchPackage.ANNOTATIONS__ARCHITECTURE:
			setArchitecture((Architecture) null);
			return;
		case ComparchPackage.ANNOTATIONS__ISSUES:
			getIssues().clear();
			return;
		case ComparchPackage.ANNOTATIONS__ADAPTATION_STRATEGIES:
			getAdaptationStrategies().clear();
			return;
		case ComparchPackage.ANNOTATIONS__WORKINGDATA:
			getWorkingdata().clear();
			return;
		case ComparchPackage.ANNOTATIONS__UID:
			setUid(UID_EDEFAULT);
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
		case ComparchPackage.ANNOTATIONS__ARCHITECTURE:
			return getArchitecture() != null;
		case ComparchPackage.ANNOTATIONS__ISSUES:
			return issues != null && !issues.isEmpty();
		case ComparchPackage.ANNOTATIONS__ADAPTATION_STRATEGIES:
			return adaptationStrategies != null && !adaptationStrategies.isEmpty();
		case ComparchPackage.ANNOTATIONS__WORKINGDATA:
			return workingdata != null && !workingdata.isEmpty();
		case ComparchPackage.ANNOTATIONS__UID:
			return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(')');
		return result.toString();
	}

} //AnnotationsImpl
