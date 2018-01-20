/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.Tenant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.ArchitectureImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ArchitectureImpl#getComponentTypes <em>Component Types</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ArchitectureImpl#getInterfaceTypes <em>Interface Types</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ArchitectureImpl#getTenants <em>Tenants</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ArchitectureImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureImpl extends ArchitecturalElementImpl implements Architecture {
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
	 * The cached value of the '{@link #getComponentTypes() <em>Component Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> componentTypes;

	/**
	 * The cached value of the '{@link #getInterfaceTypes() <em>Interface Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceType> interfaceTypes;

	/**
	 * The cached value of the '{@link #getTenants() <em>Tenants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenants()
	 * @generated
	 * @ordered
	 */
	protected EList<Tenant> tenants;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected Annotations annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.ARCHITECTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.ARCHITECTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getComponentTypes() {
		if (componentTypes == null) {
			componentTypes = new EObjectContainmentWithInverseEList<ComponentType>(ComponentType.class, this,
					ComparchPackage.ARCHITECTURE__COMPONENT_TYPES, ComparchPackage.COMPONENT_TYPE__ARCHITECTURE);
		}
		return componentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceType> getInterfaceTypes() {
		if (interfaceTypes == null) {
			interfaceTypes = new EObjectContainmentWithInverseEList<InterfaceType>(InterfaceType.class, this,
					ComparchPackage.ARCHITECTURE__INTERFACE_TYPES, ComparchPackage.INTERFACE_TYPE__ARCHITECTURE);
		}
		return interfaceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tenant> getTenants() {
		if (tenants == null) {
			tenants = new EObjectContainmentWithInverseEList<Tenant>(Tenant.class, this,
					ComparchPackage.ARCHITECTURE__TENANTS, ComparchPackage.TENANT__ARCHITECTURE);
		}
		return tenants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotations getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(Annotations newAnnotations, NotificationChain msgs) {
		Annotations oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ComparchPackage.ARCHITECTURE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
	public void setAnnotations(Annotations newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject) annotations).eInverseRemove(this, ComparchPackage.ANNOTATIONS__ARCHITECTURE,
						Annotations.class, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, ComparchPackage.ANNOTATIONS__ARCHITECTURE,
						Annotations.class, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.ARCHITECTURE__ANNOTATIONS,
					newAnnotations, newAnnotations));
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
		case ComparchPackage.ARCHITECTURE__COMPONENT_TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComponentTypes()).basicAdd(otherEnd, msgs);
		case ComparchPackage.ARCHITECTURE__INTERFACE_TYPES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaceTypes()).basicAdd(otherEnd, msgs);
		case ComparchPackage.ARCHITECTURE__TENANTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTenants()).basicAdd(otherEnd, msgs);
		case ComparchPackage.ARCHITECTURE__ANNOTATIONS:
			if (annotations != null)
				msgs = ((InternalEObject) annotations).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ComparchPackage.ARCHITECTURE__ANNOTATIONS, null, msgs);
			return basicSetAnnotations((Annotations) otherEnd, msgs);
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
		case ComparchPackage.ARCHITECTURE__COMPONENT_TYPES:
			return ((InternalEList<?>) getComponentTypes()).basicRemove(otherEnd, msgs);
		case ComparchPackage.ARCHITECTURE__INTERFACE_TYPES:
			return ((InternalEList<?>) getInterfaceTypes()).basicRemove(otherEnd, msgs);
		case ComparchPackage.ARCHITECTURE__TENANTS:
			return ((InternalEList<?>) getTenants()).basicRemove(otherEnd, msgs);
		case ComparchPackage.ARCHITECTURE__ANNOTATIONS:
			return basicSetAnnotations(null, msgs);
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
		case ComparchPackage.ARCHITECTURE__NAME:
			return getName();
		case ComparchPackage.ARCHITECTURE__COMPONENT_TYPES:
			return getComponentTypes();
		case ComparchPackage.ARCHITECTURE__INTERFACE_TYPES:
			return getInterfaceTypes();
		case ComparchPackage.ARCHITECTURE__TENANTS:
			return getTenants();
		case ComparchPackage.ARCHITECTURE__ANNOTATIONS:
			return getAnnotations();
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
		case ComparchPackage.ARCHITECTURE__NAME:
			setName((String) newValue);
			return;
		case ComparchPackage.ARCHITECTURE__COMPONENT_TYPES:
			getComponentTypes().clear();
			getComponentTypes().addAll((Collection<? extends ComponentType>) newValue);
			return;
		case ComparchPackage.ARCHITECTURE__INTERFACE_TYPES:
			getInterfaceTypes().clear();
			getInterfaceTypes().addAll((Collection<? extends InterfaceType>) newValue);
			return;
		case ComparchPackage.ARCHITECTURE__TENANTS:
			getTenants().clear();
			getTenants().addAll((Collection<? extends Tenant>) newValue);
			return;
		case ComparchPackage.ARCHITECTURE__ANNOTATIONS:
			setAnnotations((Annotations) newValue);
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
		case ComparchPackage.ARCHITECTURE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ComparchPackage.ARCHITECTURE__COMPONENT_TYPES:
			getComponentTypes().clear();
			return;
		case ComparchPackage.ARCHITECTURE__INTERFACE_TYPES:
			getInterfaceTypes().clear();
			return;
		case ComparchPackage.ARCHITECTURE__TENANTS:
			getTenants().clear();
			return;
		case ComparchPackage.ARCHITECTURE__ANNOTATIONS:
			setAnnotations((Annotations) null);
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
		case ComparchPackage.ARCHITECTURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ComparchPackage.ARCHITECTURE__COMPONENT_TYPES:
			return componentTypes != null && !componentTypes.isEmpty();
		case ComparchPackage.ARCHITECTURE__INTERFACE_TYPES:
			return interfaceTypes != null && !interfaceTypes.isEmpty();
		case ComparchPackage.ARCHITECTURE__TENANTS:
			return tenants != null && !tenants.isEmpty();
		case ComparchPackage.ARCHITECTURE__ANNOTATIONS:
			return annotations != null;
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
		result.append(')');
		return result.toString();
	}

} //ArchitectureImpl
