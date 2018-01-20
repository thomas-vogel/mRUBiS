/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.MonitoredProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitored Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.MonitoredPropertyImpl#getArchitecturalElement <em>Architectural Element</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.MonitoredPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.MonitoredPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.MonitoredPropertyImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.MonitoredPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.MonitoredPropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.MonitoredPropertyImpl#getRelatedArchitecturalElements <em>Related Architectural Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoredPropertyImpl extends ArchitecturalElementImpl implements MonitoredProperty {
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
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedArchitecturalElements() <em>Related Architectural Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedArchitecturalElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalElement> relatedArchitecturalElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoredPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.MONITORED_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalElement getArchitecturalElement() {
		if (eContainerFeatureID() != ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT)
			return null;
		return (ArchitecturalElement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchitecturalElement(ArchitecturalElement newArchitecturalElement,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newArchitecturalElement,
				ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecturalElement(ArchitecturalElement newArchitecturalElement) {
		if (newArchitecturalElement != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT
						&& newArchitecturalElement != null)) {
			if (EcoreUtil.isAncestor(this, newArchitecturalElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newArchitecturalElement != null)
				msgs = ((InternalEObject) newArchitecturalElement).eInverseAdd(this,
						ComparchPackage.ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES, ArchitecturalElement.class, msgs);
			msgs = basicSetArchitecturalElement(newArchitecturalElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT, newArchitecturalElement,
					newArchitecturalElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.MONITORED_PROPERTY__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.MONITORED_PROPERTY__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.MONITORED_PROPERTY__UNIT, oldUnit,
					unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.MONITORED_PROPERTY__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.MONITORED_PROPERTY__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalElement> getRelatedArchitecturalElements() {
		if (relatedArchitecturalElements == null) {
			relatedArchitecturalElements = new EObjectResolvingEList<ArchitecturalElement>(ArchitecturalElement.class,
					this, ComparchPackage.MONITORED_PROPERTY__RELATED_ARCHITECTURAL_ELEMENTS);
		}
		return relatedArchitecturalElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetArchitecturalElement((ArchitecturalElement) otherEnd, msgs);
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
		case ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT:
			return basicSetArchitecturalElement(null, msgs);
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
		case ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT:
			return eInternalContainer().eInverseRemove(this,
					ComparchPackage.ARCHITECTURAL_ELEMENT__MONITORED_PROPERTIES, ArchitecturalElement.class, msgs);
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
		case ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT:
			return getArchitecturalElement();
		case ComparchPackage.MONITORED_PROPERTY__NAME:
			return getName();
		case ComparchPackage.MONITORED_PROPERTY__TYPE:
			return getType();
		case ComparchPackage.MONITORED_PROPERTY__UNIT:
			return getUnit();
		case ComparchPackage.MONITORED_PROPERTY__DESCRIPTION:
			return getDescription();
		case ComparchPackage.MONITORED_PROPERTY__VALUE:
			return getValue();
		case ComparchPackage.MONITORED_PROPERTY__RELATED_ARCHITECTURAL_ELEMENTS:
			return getRelatedArchitecturalElements();
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
		case ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT:
			setArchitecturalElement((ArchitecturalElement) newValue);
			return;
		case ComparchPackage.MONITORED_PROPERTY__NAME:
			setName((String) newValue);
			return;
		case ComparchPackage.MONITORED_PROPERTY__TYPE:
			setType((String) newValue);
			return;
		case ComparchPackage.MONITORED_PROPERTY__UNIT:
			setUnit((String) newValue);
			return;
		case ComparchPackage.MONITORED_PROPERTY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ComparchPackage.MONITORED_PROPERTY__VALUE:
			setValue((String) newValue);
			return;
		case ComparchPackage.MONITORED_PROPERTY__RELATED_ARCHITECTURAL_ELEMENTS:
			getRelatedArchitecturalElements().clear();
			getRelatedArchitecturalElements().addAll((Collection<? extends ArchitecturalElement>) newValue);
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
		case ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT:
			setArchitecturalElement((ArchitecturalElement) null);
			return;
		case ComparchPackage.MONITORED_PROPERTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ComparchPackage.MONITORED_PROPERTY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ComparchPackage.MONITORED_PROPERTY__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case ComparchPackage.MONITORED_PROPERTY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ComparchPackage.MONITORED_PROPERTY__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ComparchPackage.MONITORED_PROPERTY__RELATED_ARCHITECTURAL_ELEMENTS:
			getRelatedArchitecturalElements().clear();
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
		case ComparchPackage.MONITORED_PROPERTY__ARCHITECTURAL_ELEMENT:
			return getArchitecturalElement() != null;
		case ComparchPackage.MONITORED_PROPERTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ComparchPackage.MONITORED_PROPERTY__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ComparchPackage.MONITORED_PROPERTY__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case ComparchPackage.MONITORED_PROPERTY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ComparchPackage.MONITORED_PROPERTY__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ComparchPackage.MONITORED_PROPERTY__RELATED_ARCHITECTURAL_ELEMENTS:
			return relatedArchitecturalElements != null && !relatedArchitecturalElements.isEmpty();
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
		result.append(", unit: ");
		result.append(unit);
		result.append(", description: ");
		result.append(description);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //MonitoredPropertyImpl
