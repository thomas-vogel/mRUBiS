/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.Impact;
import de.mdelab.comparch.Issue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.IssueImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.IssueImpl#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.IssueImpl#getUtilityDrop <em>Utility Drop</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.IssueImpl#getAssignedAdaptationStrategies <em>Assigned Adaptation Strategies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends AnnotationImpl implements Issue {
	/**
	 * The cached value of the '{@link #getImpacts() <em>Impacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Impact> impacts;

	/**
	 * The default value of the '{@link #getUtilityDrop() <em>Utility Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilityDrop()
	 * @generated
	 * @ordered
	 */
	protected static final double UTILITY_DROP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUtilityDrop() <em>Utility Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilityDrop()
	 * @generated
	 * @ordered
	 */
	protected double utilityDrop = UTILITY_DROP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignedAdaptationStrategies() <em>Assigned Adaptation Strategies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedAdaptationStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<AdaptationStrategy> assignedAdaptationStrategies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotations getAnnotations() {
		if (eContainerFeatureID() != ComparchPackage.ISSUE__ANNOTATIONS)
			return null;
		return (Annotations) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(Annotations newAnnotations, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAnnotations, ComparchPackage.ISSUE__ANNOTATIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(Annotations newAnnotations) {
		if (newAnnotations != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.ISSUE__ANNOTATIONS && newAnnotations != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotations))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, ComparchPackage.ANNOTATIONS__ISSUES,
						Annotations.class, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.ISSUE__ANNOTATIONS, newAnnotations,
					newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Impact> getImpacts() {
		if (impacts == null) {
			impacts = new EObjectContainmentWithInverseEList<Impact>(Impact.class, this, ComparchPackage.ISSUE__IMPACTS,
					ComparchPackage.IMPACT__ISSUE);
		}
		return impacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUtilityDrop() {
		return utilityDrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilityDrop(double newUtilityDrop) {
		double oldUtilityDrop = utilityDrop;
		utilityDrop = newUtilityDrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.ISSUE__UTILITY_DROP, oldUtilityDrop,
					utilityDrop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdaptationStrategy> getAssignedAdaptationStrategies() {
		if (assignedAdaptationStrategies == null) {
			assignedAdaptationStrategies = new EObjectWithInverseResolvingEList.ManyInverse<AdaptationStrategy>(
					AdaptationStrategy.class, this, ComparchPackage.ISSUE__ASSIGNED_ADAPTATION_STRATEGIES,
					ComparchPackage.ADAPTATION_STRATEGY__ASSIGNED_ISSUES);
		}
		return assignedAdaptationStrategies;
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
		case ComparchPackage.ISSUE__ANNOTATIONS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAnnotations((Annotations) otherEnd, msgs);
		case ComparchPackage.ISSUE__IMPACTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getImpacts()).basicAdd(otherEnd, msgs);
		case ComparchPackage.ISSUE__ASSIGNED_ADAPTATION_STRATEGIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssignedAdaptationStrategies())
					.basicAdd(otherEnd, msgs);
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
		case ComparchPackage.ISSUE__ANNOTATIONS:
			return basicSetAnnotations(null, msgs);
		case ComparchPackage.ISSUE__IMPACTS:
			return ((InternalEList<?>) getImpacts()).basicRemove(otherEnd, msgs);
		case ComparchPackage.ISSUE__ASSIGNED_ADAPTATION_STRATEGIES:
			return ((InternalEList<?>) getAssignedAdaptationStrategies()).basicRemove(otherEnd, msgs);
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
		case ComparchPackage.ISSUE__ANNOTATIONS:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.ANNOTATIONS__ISSUES, Annotations.class,
					msgs);
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
		case ComparchPackage.ISSUE__ANNOTATIONS:
			return getAnnotations();
		case ComparchPackage.ISSUE__IMPACTS:
			return getImpacts();
		case ComparchPackage.ISSUE__UTILITY_DROP:
			return getUtilityDrop();
		case ComparchPackage.ISSUE__ASSIGNED_ADAPTATION_STRATEGIES:
			return getAssignedAdaptationStrategies();
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
		case ComparchPackage.ISSUE__ANNOTATIONS:
			setAnnotations((Annotations) newValue);
			return;
		case ComparchPackage.ISSUE__IMPACTS:
			getImpacts().clear();
			getImpacts().addAll((Collection<? extends Impact>) newValue);
			return;
		case ComparchPackage.ISSUE__UTILITY_DROP:
			setUtilityDrop((Double) newValue);
			return;
		case ComparchPackage.ISSUE__ASSIGNED_ADAPTATION_STRATEGIES:
			getAssignedAdaptationStrategies().clear();
			getAssignedAdaptationStrategies().addAll((Collection<? extends AdaptationStrategy>) newValue);
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
		case ComparchPackage.ISSUE__ANNOTATIONS:
			setAnnotations((Annotations) null);
			return;
		case ComparchPackage.ISSUE__IMPACTS:
			getImpacts().clear();
			return;
		case ComparchPackage.ISSUE__UTILITY_DROP:
			setUtilityDrop(UTILITY_DROP_EDEFAULT);
			return;
		case ComparchPackage.ISSUE__ASSIGNED_ADAPTATION_STRATEGIES:
			getAssignedAdaptationStrategies().clear();
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
		case ComparchPackage.ISSUE__ANNOTATIONS:
			return getAnnotations() != null;
		case ComparchPackage.ISSUE__IMPACTS:
			return impacts != null && !impacts.isEmpty();
		case ComparchPackage.ISSUE__UTILITY_DROP:
			return utilityDrop != UTILITY_DROP_EDEFAULT;
		case ComparchPackage.ISSUE__ASSIGNED_ADAPTATION_STRATEGIES:
			return assignedAdaptationStrategies != null && !assignedAdaptationStrategies.isEmpty();
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
		result.append(" (utilityDrop: ");
		result.append(utilityDrop);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
