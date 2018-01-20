/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.ConcernedElement;
import de.mdelab.comparch.Impact;
import de.mdelab.comparch.InputParameter;
import de.mdelab.comparch.MonitoredProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architectural Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.ArchitecturalElementImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ArchitecturalElementImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ArchitecturalElementImpl#getMonitoredProperties <em>Monitored Properties</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ArchitecturalElementImpl#getIssueImpacts <em>Issue Impacts</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ArchitecturalElementImpl#getStrategyInputs <em>Strategy Inputs</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ArchitecturalElementImpl#getWorkingDataElements <em>Working Data Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArchitecturalElementImpl extends MinimalEObjectImpl.Container implements ArchitecturalElement {
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
	 * The default value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final double CRITICALITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected double criticality = CRITICALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMonitoredProperties() <em>Monitored Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MonitoredProperty> monitoredProperties;

	/**
	 * The cached value of the '{@link #getIssueImpacts() <em>Issue Impacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueImpacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Impact> issueImpacts;

	/**
	 * The cached value of the '{@link #getStrategyInputs() <em>Strategy Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputParameter> strategyInputs;

	/**
	 * The cached value of the '{@link #getWorkingDataElements() <em>Working Data Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDataElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcernedElement> workingDataElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.ARCHITECTURAL_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.ARCHITECTURAL_ELEMENT__UID, oldUid,
					uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticality(double newCriticality) {
		double oldCriticality = criticality;
		criticality = newCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.ARCHITECTURAL_ELEMENT__CRITICALITY,
					oldCriticality, criticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MonitoredProperty> getMonitoredProperties() {
		if (monitoredProperties == null) {
			monitoredProperties = new EObjectContainmentWithInverseEList<MonitoredProperty>(MonitoredProperty.class,
					this, ComparchPackage.ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES,
					ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT);
		}
		return monitoredProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Impact> getIssueImpacts() {
		if (issueImpacts == null) {
			issueImpacts = new EObjectWithInverseResolvingEList<Impact>(Impact.class, this,
					ComparchPackage.ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS,
					ComparchPackage.IMPACT__ARCHITECTURAL_ELEMENT);
		}
		return issueImpacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputParameter> getStrategyInputs() {
		if (strategyInputs == null) {
			strategyInputs = new EObjectWithInverseResolvingEList<InputParameter>(InputParameter.class, this,
					ComparchPackage.ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS,
					ComparchPackage.INPUT_PARAMETER__ARCHITECTURAL_ELEMENT);
		}
		return strategyInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcernedElement> getWorkingDataElements() {
		if (workingDataElements == null) {
			workingDataElements = new EObjectWithInverseResolvingEList<ConcernedElement>(ConcernedElement.class, this,
					ComparchPackage.ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS,
					ComparchPackage.CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT);
		}
		return workingDataElements;
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
		case ComparchPackage.ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMonitoredProperties()).basicAdd(otherEnd,
					msgs);
		case ComparchPackage.ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIssueImpacts()).basicAdd(otherEnd, msgs);
		case ComparchPackage.ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStrategyInputs()).basicAdd(otherEnd, msgs);
		case ComparchPackage.ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getWorkingDataElements()).basicAdd(otherEnd,
					msgs);
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
		case ComparchPackage.ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES:
			return ((InternalEList<?>) getMonitoredProperties()).basicRemove(otherEnd, msgs);
		case ComparchPackage.ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS:
			return ((InternalEList<?>) getIssueImpacts()).basicRemove(otherEnd, msgs);
		case ComparchPackage.ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS:
			return ((InternalEList<?>) getStrategyInputs()).basicRemove(otherEnd, msgs);
		case ComparchPackage.ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS:
			return ((InternalEList<?>) getWorkingDataElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComparchPackage.ARCHITECTURAL_ELEMENT__UID:
			return getUid();
		case ComparchPackage.ARCHITECTURAL_ELEMENT__CRITICALITY:
			return getCriticality();
		case ComparchPackage.ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES:
			return getMonitoredProperties();
		case ComparchPackage.ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS:
			return getIssueImpacts();
		case ComparchPackage.ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS:
			return getStrategyInputs();
		case ComparchPackage.ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS:
			return getWorkingDataElements();
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
		case ComparchPackage.ARCHITECTURAL_ELEMENT__UID:
			setUid((String) newValue);
			return;
		case ComparchPackage.ARCHITECTURAL_ELEMENT__CRITICALITY:
			setCriticality((Double) newValue);
			return;
		case ComparchPackage.ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES:
			getMonitoredProperties().clear();
			getMonitoredProperties().addAll((Collection<? extends MonitoredProperty>) newValue);
			return;
		case ComparchPackage.ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS:
			getIssueImpacts().clear();
			getIssueImpacts().addAll((Collection<? extends Impact>) newValue);
			return;
		case ComparchPackage.ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS:
			getStrategyInputs().clear();
			getStrategyInputs().addAll((Collection<? extends InputParameter>) newValue);
			return;
		case ComparchPackage.ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS:
			getWorkingDataElements().clear();
			getWorkingDataElements().addAll((Collection<? extends ConcernedElement>) newValue);
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
		case ComparchPackage.ARCHITECTURAL_ELEMENT__UID:
			setUid(UID_EDEFAULT);
			return;
		case ComparchPackage.ARCHITECTURAL_ELEMENT__CRITICALITY:
			setCriticality(CRITICALITY_EDEFAULT);
			return;
		case ComparchPackage.ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES:
			getMonitoredProperties().clear();
			return;
		case ComparchPackage.ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS:
			getIssueImpacts().clear();
			return;
		case ComparchPackage.ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS:
			getStrategyInputs().clear();
			return;
		case ComparchPackage.ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS:
			getWorkingDataElements().clear();
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
		case ComparchPackage.ARCHITECTURAL_ELEMENT__UID:
			return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
		case ComparchPackage.ARCHITECTURAL_ELEMENT__CRITICALITY:
			return criticality != CRITICALITY_EDEFAULT;
		case ComparchPackage.ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES:
			return monitoredProperties != null && !monitoredProperties.isEmpty();
		case ComparchPackage.ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS:
			return issueImpacts != null && !issueImpacts.isEmpty();
		case ComparchPackage.ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS:
			return strategyInputs != null && !strategyInputs.isEmpty();
		case ComparchPackage.ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS:
			return workingDataElements != null && !workingDataElements.isEmpty();
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
		result.append(", criticality: ");
		result.append(criticality);
		result.append(')');
		return result.toString();
	}

} //ArchitecturalElementImpl
