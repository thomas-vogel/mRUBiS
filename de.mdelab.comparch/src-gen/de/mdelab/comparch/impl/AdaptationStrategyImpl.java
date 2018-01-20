/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.InputParameter;
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
 * An implementation of the model object '<em><b>Adaptation Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.AdaptationStrategyImpl#getUtilityIncrease <em>Utility Increase</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.AdaptationStrategyImpl#getCosts <em>Costs</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.AdaptationStrategyImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.AdaptationStrategyImpl#getAssignedIssues <em>Assigned Issues</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.AdaptationStrategyImpl#getInputParameters <em>Input Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdaptationStrategyImpl extends AnnotationImpl implements AdaptationStrategy {
	/**
	 * The default value of the '{@link #getUtilityIncrease() <em>Utility Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilityIncrease()
	 * @generated
	 * @ordered
	 */
	protected static final double UTILITY_INCREASE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUtilityIncrease() <em>Utility Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilityIncrease()
	 * @generated
	 * @ordered
	 */
	protected double utilityIncrease = UTILITY_INCREASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCosts() <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected static final double COSTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCosts() <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected double costs = COSTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignedIssues() <em>Assigned Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> assignedIssues;

	/**
	 * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<InputParameter> inputParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.ADAPTATION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUtilityIncrease() {
		return utilityIncrease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilityIncrease(double newUtilityIncrease) {
		double oldUtilityIncrease = utilityIncrease;
		utilityIncrease = newUtilityIncrease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.ADAPTATION_STRATEGY__UTILITY_INCREASE,
					oldUtilityIncrease, utilityIncrease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCosts() {
		return costs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCosts(double newCosts) {
		double oldCosts = costs;
		costs = newCosts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.ADAPTATION_STRATEGY__COSTS, oldCosts,
					costs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotations getAnnotations() {
		if (eContainerFeatureID() != ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS)
			return null;
		return (Annotations) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(Annotations newAnnotations, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAnnotations, ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(Annotations newAnnotations) {
		if (newAnnotations != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS
						&& newAnnotations != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotations))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this,
						ComparchPackage.ANNOTATIONS__ADAPTATION_STRATEGIES, Annotations.class, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS,
					newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getAssignedIssues() {
		if (assignedIssues == null) {
			assignedIssues = new EObjectWithInverseResolvingEList.ManyInverse<Issue>(Issue.class, this,
					ComparchPackage.ADAPTATION_STRATEGY__ASSIGNED_ISSUES,
					ComparchPackage.ISSUE__ASSIGNED_ADAPTATION_STRATEGIES);
		}
		return assignedIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputParameter> getInputParameters() {
		if (inputParameters == null) {
			inputParameters = new EObjectContainmentWithInverseEList<InputParameter>(InputParameter.class, this,
					ComparchPackage.ADAPTATION_STRATEGY__INPUT_PARAMETERS,
					ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY);
		}
		return inputParameters;
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
		case ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAnnotations((Annotations) otherEnd, msgs);
		case ComparchPackage.ADAPTATION_STRATEGY__ASSIGNED_ISSUES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssignedIssues()).basicAdd(otherEnd, msgs);
		case ComparchPackage.ADAPTATION_STRATEGY__INPUT_PARAMETERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputParameters()).basicAdd(otherEnd, msgs);
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
		case ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS:
			return basicSetAnnotations(null, msgs);
		case ComparchPackage.ADAPTATION_STRATEGY__ASSIGNED_ISSUES:
			return ((InternalEList<?>) getAssignedIssues()).basicRemove(otherEnd, msgs);
		case ComparchPackage.ADAPTATION_STRATEGY__INPUT_PARAMETERS:
			return ((InternalEList<?>) getInputParameters()).basicRemove(otherEnd, msgs);
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
		case ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.ANNOTATIONS__ADAPTATION_STRATEGIES,
					Annotations.class, msgs);
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
		case ComparchPackage.ADAPTATION_STRATEGY__UTILITY_INCREASE:
			return getUtilityIncrease();
		case ComparchPackage.ADAPTATION_STRATEGY__COSTS:
			return getCosts();
		case ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS:
			return getAnnotations();
		case ComparchPackage.ADAPTATION_STRATEGY__ASSIGNED_ISSUES:
			return getAssignedIssues();
		case ComparchPackage.ADAPTATION_STRATEGY__INPUT_PARAMETERS:
			return getInputParameters();
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
		case ComparchPackage.ADAPTATION_STRATEGY__UTILITY_INCREASE:
			setUtilityIncrease((Double) newValue);
			return;
		case ComparchPackage.ADAPTATION_STRATEGY__COSTS:
			setCosts((Double) newValue);
			return;
		case ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS:
			setAnnotations((Annotations) newValue);
			return;
		case ComparchPackage.ADAPTATION_STRATEGY__ASSIGNED_ISSUES:
			getAssignedIssues().clear();
			getAssignedIssues().addAll((Collection<? extends Issue>) newValue);
			return;
		case ComparchPackage.ADAPTATION_STRATEGY__INPUT_PARAMETERS:
			getInputParameters().clear();
			getInputParameters().addAll((Collection<? extends InputParameter>) newValue);
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
		case ComparchPackage.ADAPTATION_STRATEGY__UTILITY_INCREASE:
			setUtilityIncrease(UTILITY_INCREASE_EDEFAULT);
			return;
		case ComparchPackage.ADAPTATION_STRATEGY__COSTS:
			setCosts(COSTS_EDEFAULT);
			return;
		case ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS:
			setAnnotations((Annotations) null);
			return;
		case ComparchPackage.ADAPTATION_STRATEGY__ASSIGNED_ISSUES:
			getAssignedIssues().clear();
			return;
		case ComparchPackage.ADAPTATION_STRATEGY__INPUT_PARAMETERS:
			getInputParameters().clear();
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
		case ComparchPackage.ADAPTATION_STRATEGY__UTILITY_INCREASE:
			return utilityIncrease != UTILITY_INCREASE_EDEFAULT;
		case ComparchPackage.ADAPTATION_STRATEGY__COSTS:
			return costs != COSTS_EDEFAULT;
		case ComparchPackage.ADAPTATION_STRATEGY__ANNOTATIONS:
			return getAnnotations() != null;
		case ComparchPackage.ADAPTATION_STRATEGY__ASSIGNED_ISSUES:
			return assignedIssues != null && !assignedIssues.isEmpty();
		case ComparchPackage.ADAPTATION_STRATEGY__INPUT_PARAMETERS:
			return inputParameters != null && !inputParameters.isEmpty();
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
		result.append(" (utilityIncrease: ");
		result.append(utilityIncrease);
		result.append(", costs: ");
		result.append(costs);
		result.append(')');
		return result.toString();
	}

} //AdaptationStrategyImpl
