/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Parameter;
import de.mdelab.comparch.ParameterType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.ParameterTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ParameterTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ParameterTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ParameterTypeImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ParameterTypeImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterTypeImpl extends ArchitecturalElementImpl implements ParameterType {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.PARAMETER_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.PARAMETER_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.PARAMETER_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.PARAMETER_TYPE__DEFAULT_VALUE,
					oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getComponentType() {
		if (eContainerFeatureID() != ComparchPackage.PARAMETER_TYPE__COMPONENT_TYPE)
			return null;
		return (ComponentType) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentType(ComponentType newComponentType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newComponentType, ComparchPackage.PARAMETER_TYPE__COMPONENT_TYPE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(ComponentType newComponentType) {
		if (newComponentType != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.PARAMETER_TYPE__COMPONENT_TYPE
						&& newComponentType != null)) {
			if (EcoreUtil.isAncestor(this, newComponentType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponentType != null)
				msgs = ((InternalEObject) newComponentType).eInverseAdd(this,
						ComparchPackage.COMPONENT_TYPE__PARAMETER_TYPES, ComponentType.class, msgs);
			msgs = basicSetComponentType(newComponentType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.PARAMETER_TYPE__COMPONENT_TYPE,
					newComponentType, newComponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<Parameter>(Parameter.class, this,
					ComparchPackage.PARAMETER_TYPE__INSTANCES, ComparchPackage.PARAMETER__TYPE);
		}
		return instances;
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
		case ComparchPackage.PARAMETER_TYPE__COMPONENT_TYPE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetComponentType((ComponentType) otherEnd, msgs);
		case ComparchPackage.PARAMETER_TYPE__INSTANCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInstances()).basicAdd(otherEnd, msgs);
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
		case ComparchPackage.PARAMETER_TYPE__COMPONENT_TYPE:
			return basicSetComponentType(null, msgs);
		case ComparchPackage.PARAMETER_TYPE__INSTANCES:
			return ((InternalEList<?>) getInstances()).basicRemove(otherEnd, msgs);
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
		case ComparchPackage.PARAMETER_TYPE__COMPONENT_TYPE:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.COMPONENT_TYPE__PARAMETER_TYPES,
					ComponentType.class, msgs);
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
		case ComparchPackage.PARAMETER_TYPE__NAME:
			return getName();
		case ComparchPackage.PARAMETER_TYPE__TYPE:
			return getType();
		case ComparchPackage.PARAMETER_TYPE__DEFAULT_VALUE:
			return getDefaultValue();
		case ComparchPackage.PARAMETER_TYPE__COMPONENT_TYPE:
			return getComponentType();
		case ComparchPackage.PARAMETER_TYPE__INSTANCES:
			return getInstances();
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
		case ComparchPackage.PARAMETER_TYPE__NAME:
			setName((String) newValue);
			return;
		case ComparchPackage.PARAMETER_TYPE__TYPE:
			setType((String) newValue);
			return;
		case ComparchPackage.PARAMETER_TYPE__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
			return;
		case ComparchPackage.PARAMETER_TYPE__COMPONENT_TYPE:
			setComponentType((ComponentType) newValue);
			return;
		case ComparchPackage.PARAMETER_TYPE__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends Parameter>) newValue);
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
		case ComparchPackage.PARAMETER_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ComparchPackage.PARAMETER_TYPE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ComparchPackage.PARAMETER_TYPE__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case ComparchPackage.PARAMETER_TYPE__COMPONENT_TYPE:
			setComponentType((ComponentType) null);
			return;
		case ComparchPackage.PARAMETER_TYPE__INSTANCES:
			getInstances().clear();
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
		case ComparchPackage.PARAMETER_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ComparchPackage.PARAMETER_TYPE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ComparchPackage.PARAMETER_TYPE__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
		case ComparchPackage.PARAMETER_TYPE__COMPONENT_TYPE:
			return getComponentType() != null;
		case ComparchPackage.PARAMETER_TYPE__INSTANCES:
			return instances != null && !instances.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //ParameterTypeImpl
