/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Parameter;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.ComponentImpl#getTenant <em>Tenant</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ComponentImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ComponentImpl#getState <em>State</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ComponentImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ComponentImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ComponentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ArchitecturalElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType type;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentState STATE_EDEFAULT = ComponentState.UNDEPLOYED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ComponentState state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredInterface> requiredInterfaces;

	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedInterface> providedInterfaces;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tenant getTenant() {
		if (eContainerFeatureID() != ComparchPackage.COMPONENT__TENANT)
			return null;
		return (Tenant) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTenant(Tenant newTenant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTenant, ComparchPackage.COMPONENT__TENANT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenant(Tenant newTenant) {
		if (newTenant != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.COMPONENT__TENANT && newTenant != null)) {
			if (EcoreUtil.isAncestor(this, newTenant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTenant != null)
				msgs = ((InternalEObject) newTenant).eInverseAdd(this, ComparchPackage.TENANT__COMPONENTS, Tenant.class,
						msgs);
			msgs = basicSetTenant(newTenant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.COMPONENT__TENANT, newTenant,
					newTenant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (ComponentType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComparchPackage.COMPONENT__TYPE, oldType,
							type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ComponentType newType, NotificationChain msgs) {
		ComponentType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ComparchPackage.COMPONENT__TYPE, oldType, newType);
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
	public void setType(ComponentType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this, ComparchPackage.COMPONENT_TYPE__INSTANCES,
						ComponentType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this, ComparchPackage.COMPONENT_TYPE__INSTANCES,
						ComponentType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.COMPONENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this,
					ComparchPackage.COMPONENT__PARAMETERS, ComparchPackage.PARAMETER__COMPONENT);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ComponentState newState) {
		ComponentState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.COMPONENT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredInterface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectContainmentWithInverseEList<RequiredInterface>(RequiredInterface.class,
					this, ComparchPackage.COMPONENT__REQUIRED_INTERFACES,
					ComparchPackage.REQUIRED_INTERFACE__COMPONENT);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedInterface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectContainmentWithInverseEList<ProvidedInterface>(ProvidedInterface.class,
					this, ComparchPackage.COMPONENT__PROVIDED_INTERFACES,
					ComparchPackage.PROVIDED_INTERFACE__COMPONENT);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.COMPONENT__NAME, oldName, name));
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
		case ComparchPackage.COMPONENT__TENANT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTenant((Tenant) otherEnd, msgs);
		case ComparchPackage.COMPONENT__TYPE:
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this, ComparchPackage.COMPONENT_TYPE__INSTANCES,
						ComponentType.class, msgs);
			return basicSetType((ComponentType) otherEnd, msgs);
		case ComparchPackage.COMPONENT__PARAMETERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameters()).basicAdd(otherEnd, msgs);
		case ComparchPackage.COMPONENT__REQUIRED_INTERFACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiredInterfaces()).basicAdd(otherEnd,
					msgs);
		case ComparchPackage.COMPONENT__PROVIDED_INTERFACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvidedInterfaces()).basicAdd(otherEnd,
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
		case ComparchPackage.COMPONENT__TENANT:
			return basicSetTenant(null, msgs);
		case ComparchPackage.COMPONENT__TYPE:
			return basicSetType(null, msgs);
		case ComparchPackage.COMPONENT__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case ComparchPackage.COMPONENT__REQUIRED_INTERFACES:
			return ((InternalEList<?>) getRequiredInterfaces()).basicRemove(otherEnd, msgs);
		case ComparchPackage.COMPONENT__PROVIDED_INTERFACES:
			return ((InternalEList<?>) getProvidedInterfaces()).basicRemove(otherEnd, msgs);
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
		case ComparchPackage.COMPONENT__TENANT:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.TENANT__COMPONENTS, Tenant.class, msgs);
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
		case ComparchPackage.COMPONENT__TENANT:
			return getTenant();
		case ComparchPackage.COMPONENT__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case ComparchPackage.COMPONENT__PARAMETERS:
			return getParameters();
		case ComparchPackage.COMPONENT__STATE:
			return getState();
		case ComparchPackage.COMPONENT__REQUIRED_INTERFACES:
			return getRequiredInterfaces();
		case ComparchPackage.COMPONENT__PROVIDED_INTERFACES:
			return getProvidedInterfaces();
		case ComparchPackage.COMPONENT__NAME:
			return getName();
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
		case ComparchPackage.COMPONENT__TENANT:
			setTenant((Tenant) newValue);
			return;
		case ComparchPackage.COMPONENT__TYPE:
			setType((ComponentType) newValue);
			return;
		case ComparchPackage.COMPONENT__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case ComparchPackage.COMPONENT__STATE:
			setState((ComponentState) newValue);
			return;
		case ComparchPackage.COMPONENT__REQUIRED_INTERFACES:
			getRequiredInterfaces().clear();
			getRequiredInterfaces().addAll((Collection<? extends RequiredInterface>) newValue);
			return;
		case ComparchPackage.COMPONENT__PROVIDED_INTERFACES:
			getProvidedInterfaces().clear();
			getProvidedInterfaces().addAll((Collection<? extends ProvidedInterface>) newValue);
			return;
		case ComparchPackage.COMPONENT__NAME:
			setName((String) newValue);
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
		case ComparchPackage.COMPONENT__TENANT:
			setTenant((Tenant) null);
			return;
		case ComparchPackage.COMPONENT__TYPE:
			setType((ComponentType) null);
			return;
		case ComparchPackage.COMPONENT__PARAMETERS:
			getParameters().clear();
			return;
		case ComparchPackage.COMPONENT__STATE:
			setState(STATE_EDEFAULT);
			return;
		case ComparchPackage.COMPONENT__REQUIRED_INTERFACES:
			getRequiredInterfaces().clear();
			return;
		case ComparchPackage.COMPONENT__PROVIDED_INTERFACES:
			getProvidedInterfaces().clear();
			return;
		case ComparchPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
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
		case ComparchPackage.COMPONENT__TENANT:
			return getTenant() != null;
		case ComparchPackage.COMPONENT__TYPE:
			return type != null;
		case ComparchPackage.COMPONENT__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case ComparchPackage.COMPONENT__STATE:
			return state != STATE_EDEFAULT;
		case ComparchPackage.COMPONENT__REQUIRED_INTERFACES:
			return requiredInterfaces != null && !requiredInterfaces.isEmpty();
		case ComparchPackage.COMPONENT__PROVIDED_INTERFACES:
			return providedInterfaces != null && !providedInterfaces.isEmpty();
		case ComparchPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (state: ");
		result.append(state);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
