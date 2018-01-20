/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Interface;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.MethodSpecification;

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
 * An implementation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.InterfaceTypeImpl#getFqName <em>Fq Name</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.InterfaceTypeImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.InterfaceTypeImpl#getRequiringComponentTypes <em>Requiring Component Types</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.InterfaceTypeImpl#getProvidingComponentTypes <em>Providing Component Types</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.InterfaceTypeImpl#getMethodSpecifications <em>Method Specifications</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.InterfaceTypeImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceTypeImpl extends ArchitecturalElementImpl implements InterfaceType {
	/**
	 * The default value of the '{@link #getFqName() <em>Fq Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqName()
	 * @generated
	 * @ordered
	 */
	protected static final String FQ_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFqName() <em>Fq Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqName()
	 * @generated
	 * @ordered
	 */
	protected String fqName = FQ_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiringComponentTypes() <em>Requiring Component Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiringComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> requiringComponentTypes;

	/**
	 * The cached value of the '{@link #getProvidingComponentTypes() <em>Providing Component Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidingComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> providingComponentTypes;

	/**
	 * The cached value of the '{@link #getMethodSpecifications() <em>Method Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodSpecification> methodSpecifications;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.INTERFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFqName() {
		return fqName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFqName(String newFqName) {
		String oldFqName = fqName;
		fqName = newFqName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.INTERFACE_TYPE__FQ_NAME, oldFqName,
					fqName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture getArchitecture() {
		if (eContainerFeatureID() != ComparchPackage.INTERFACE_TYPE__ARCHITECTURE)
			return null;
		return (Architecture) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchitecture(Architecture newArchitecture, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newArchitecture, ComparchPackage.INTERFACE_TYPE__ARCHITECTURE,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(Architecture newArchitecture) {
		if (newArchitecture != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.INTERFACE_TYPE__ARCHITECTURE && newArchitecture != null)) {
			if (EcoreUtil.isAncestor(this, newArchitecture))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newArchitecture != null)
				msgs = ((InternalEObject) newArchitecture).eInverseAdd(this,
						ComparchPackage.ARCHITECTURE__INTERFACE_TYPES, Architecture.class, msgs);
			msgs = basicSetArchitecture(newArchitecture, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.INTERFACE_TYPE__ARCHITECTURE,
					newArchitecture, newArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getRequiringComponentTypes() {
		if (requiringComponentTypes == null) {
			requiringComponentTypes = new EObjectWithInverseResolvingEList.ManyInverse<ComponentType>(
					ComponentType.class, this, ComparchPackage.INTERFACE_TYPE__REQUIRING_COMPONENT_TYPES,
					ComparchPackage.COMPONENT_TYPE__REQUIRED_INTERFACE_TYPES);
		}
		return requiringComponentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getProvidingComponentTypes() {
		if (providingComponentTypes == null) {
			providingComponentTypes = new EObjectWithInverseResolvingEList.ManyInverse<ComponentType>(
					ComponentType.class, this, ComparchPackage.INTERFACE_TYPE__PROVIDING_COMPONENT_TYPES,
					ComparchPackage.COMPONENT_TYPE__PROVIDED_INTERFACE_TYPES);
		}
		return providingComponentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodSpecification> getMethodSpecifications() {
		if (methodSpecifications == null) {
			methodSpecifications = new EObjectContainmentWithInverseEList<MethodSpecification>(
					MethodSpecification.class, this, ComparchPackage.INTERFACE_TYPE__METHOD_SPECIFICATIONS,
					ComparchPackage.METHOD_SPECIFICATION__INTERFACE_TYPE);
		}
		return methodSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<Interface>(Interface.class, this,
					ComparchPackage.INTERFACE_TYPE__INSTANCES, ComparchPackage.INTERFACE__TYPE);
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
		case ComparchPackage.INTERFACE_TYPE__ARCHITECTURE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetArchitecture((Architecture) otherEnd, msgs);
		case ComparchPackage.INTERFACE_TYPE__REQUIRING_COMPONENT_TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiringComponentTypes()).basicAdd(otherEnd,
					msgs);
		case ComparchPackage.INTERFACE_TYPE__PROVIDING_COMPONENT_TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvidingComponentTypes()).basicAdd(otherEnd,
					msgs);
		case ComparchPackage.INTERFACE_TYPE__METHOD_SPECIFICATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMethodSpecifications()).basicAdd(otherEnd,
					msgs);
		case ComparchPackage.INTERFACE_TYPE__INSTANCES:
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
		case ComparchPackage.INTERFACE_TYPE__ARCHITECTURE:
			return basicSetArchitecture(null, msgs);
		case ComparchPackage.INTERFACE_TYPE__REQUIRING_COMPONENT_TYPES:
			return ((InternalEList<?>) getRequiringComponentTypes()).basicRemove(otherEnd, msgs);
		case ComparchPackage.INTERFACE_TYPE__PROVIDING_COMPONENT_TYPES:
			return ((InternalEList<?>) getProvidingComponentTypes()).basicRemove(otherEnd, msgs);
		case ComparchPackage.INTERFACE_TYPE__METHOD_SPECIFICATIONS:
			return ((InternalEList<?>) getMethodSpecifications()).basicRemove(otherEnd, msgs);
		case ComparchPackage.INTERFACE_TYPE__INSTANCES:
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
		case ComparchPackage.INTERFACE_TYPE__ARCHITECTURE:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.ARCHITECTURE__INTERFACE_TYPES,
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
		case ComparchPackage.INTERFACE_TYPE__FQ_NAME:
			return getFqName();
		case ComparchPackage.INTERFACE_TYPE__ARCHITECTURE:
			return getArchitecture();
		case ComparchPackage.INTERFACE_TYPE__REQUIRING_COMPONENT_TYPES:
			return getRequiringComponentTypes();
		case ComparchPackage.INTERFACE_TYPE__PROVIDING_COMPONENT_TYPES:
			return getProvidingComponentTypes();
		case ComparchPackage.INTERFACE_TYPE__METHOD_SPECIFICATIONS:
			return getMethodSpecifications();
		case ComparchPackage.INTERFACE_TYPE__INSTANCES:
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
		case ComparchPackage.INTERFACE_TYPE__FQ_NAME:
			setFqName((String) newValue);
			return;
		case ComparchPackage.INTERFACE_TYPE__ARCHITECTURE:
			setArchitecture((Architecture) newValue);
			return;
		case ComparchPackage.INTERFACE_TYPE__REQUIRING_COMPONENT_TYPES:
			getRequiringComponentTypes().clear();
			getRequiringComponentTypes().addAll((Collection<? extends ComponentType>) newValue);
			return;
		case ComparchPackage.INTERFACE_TYPE__PROVIDING_COMPONENT_TYPES:
			getProvidingComponentTypes().clear();
			getProvidingComponentTypes().addAll((Collection<? extends ComponentType>) newValue);
			return;
		case ComparchPackage.INTERFACE_TYPE__METHOD_SPECIFICATIONS:
			getMethodSpecifications().clear();
			getMethodSpecifications().addAll((Collection<? extends MethodSpecification>) newValue);
			return;
		case ComparchPackage.INTERFACE_TYPE__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends Interface>) newValue);
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
		case ComparchPackage.INTERFACE_TYPE__FQ_NAME:
			setFqName(FQ_NAME_EDEFAULT);
			return;
		case ComparchPackage.INTERFACE_TYPE__ARCHITECTURE:
			setArchitecture((Architecture) null);
			return;
		case ComparchPackage.INTERFACE_TYPE__REQUIRING_COMPONENT_TYPES:
			getRequiringComponentTypes().clear();
			return;
		case ComparchPackage.INTERFACE_TYPE__PROVIDING_COMPONENT_TYPES:
			getProvidingComponentTypes().clear();
			return;
		case ComparchPackage.INTERFACE_TYPE__METHOD_SPECIFICATIONS:
			getMethodSpecifications().clear();
			return;
		case ComparchPackage.INTERFACE_TYPE__INSTANCES:
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
		case ComparchPackage.INTERFACE_TYPE__FQ_NAME:
			return FQ_NAME_EDEFAULT == null ? fqName != null : !FQ_NAME_EDEFAULT.equals(fqName);
		case ComparchPackage.INTERFACE_TYPE__ARCHITECTURE:
			return getArchitecture() != null;
		case ComparchPackage.INTERFACE_TYPE__REQUIRING_COMPONENT_TYPES:
			return requiringComponentTypes != null && !requiringComponentTypes.isEmpty();
		case ComparchPackage.INTERFACE_TYPE__PROVIDING_COMPONENT_TYPES:
			return providingComponentTypes != null && !providingComponentTypes.isEmpty();
		case ComparchPackage.INTERFACE_TYPE__METHOD_SPECIFICATIONS:
			return methodSpecifications != null && !methodSpecifications.isEmpty();
		case ComparchPackage.INTERFACE_TYPE__INSTANCES:
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
		result.append(" (fqName: ");
		result.append(fqName);
		result.append(')');
		return result.toString();
	}

} //InterfaceTypeImpl
