/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.ConcernedElement;
import de.mdelab.comparch.WorkingData;

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
 * An implementation of the model object '<em><b>Working Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.WorkingDataImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.WorkingDataImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.WorkingDataImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.WorkingDataImpl#getConcernedElements <em>Concerned Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkingDataImpl extends AnnotationImpl implements WorkingData {
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
	 * The cached value of the '{@link #getConcernedElements() <em>Concerned Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcernedElement> concernedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.WORKING_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.WORKING_DATA__UNIT, oldUnit, unit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.WORKING_DATA__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotations getAnnotations() {
		if (eContainerFeatureID() != ComparchPackage.WORKING_DATA__ANNOTATIONS)
			return null;
		return (Annotations) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(Annotations newAnnotations, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAnnotations, ComparchPackage.WORKING_DATA__ANNOTATIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(Annotations newAnnotations) {
		if (newAnnotations != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.WORKING_DATA__ANNOTATIONS && newAnnotations != null)) {
			if (EcoreUtil.isAncestor(this, newAnnotations))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject) newAnnotations).eInverseAdd(this, ComparchPackage.ANNOTATIONS__WORKINGDATA,
						Annotations.class, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.WORKING_DATA__ANNOTATIONS,
					newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcernedElement> getConcernedElements() {
		if (concernedElements == null) {
			concernedElements = new EObjectContainmentWithInverseEList<ConcernedElement>(ConcernedElement.class, this,
					ComparchPackage.WORKING_DATA__CONCERNED_ELEMENTS, ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA);
		}
		return concernedElements;
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
		case ComparchPackage.WORKING_DATA__ANNOTATIONS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAnnotations((Annotations) otherEnd, msgs);
		case ComparchPackage.WORKING_DATA__CONCERNED_ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConcernedElements()).basicAdd(otherEnd,
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
		case ComparchPackage.WORKING_DATA__ANNOTATIONS:
			return basicSetAnnotations(null, msgs);
		case ComparchPackage.WORKING_DATA__CONCERNED_ELEMENTS:
			return ((InternalEList<?>) getConcernedElements()).basicRemove(otherEnd, msgs);
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
		case ComparchPackage.WORKING_DATA__ANNOTATIONS:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.ANNOTATIONS__WORKINGDATA,
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
		case ComparchPackage.WORKING_DATA__UNIT:
			return getUnit();
		case ComparchPackage.WORKING_DATA__VALUE:
			return getValue();
		case ComparchPackage.WORKING_DATA__ANNOTATIONS:
			return getAnnotations();
		case ComparchPackage.WORKING_DATA__CONCERNED_ELEMENTS:
			return getConcernedElements();
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
		case ComparchPackage.WORKING_DATA__UNIT:
			setUnit((String) newValue);
			return;
		case ComparchPackage.WORKING_DATA__VALUE:
			setValue((String) newValue);
			return;
		case ComparchPackage.WORKING_DATA__ANNOTATIONS:
			setAnnotations((Annotations) newValue);
			return;
		case ComparchPackage.WORKING_DATA__CONCERNED_ELEMENTS:
			getConcernedElements().clear();
			getConcernedElements().addAll((Collection<? extends ConcernedElement>) newValue);
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
		case ComparchPackage.WORKING_DATA__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case ComparchPackage.WORKING_DATA__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case ComparchPackage.WORKING_DATA__ANNOTATIONS:
			setAnnotations((Annotations) null);
			return;
		case ComparchPackage.WORKING_DATA__CONCERNED_ELEMENTS:
			getConcernedElements().clear();
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
		case ComparchPackage.WORKING_DATA__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case ComparchPackage.WORKING_DATA__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case ComparchPackage.WORKING_DATA__ANNOTATIONS:
			return getAnnotations() != null;
		case ComparchPackage.WORKING_DATA__CONCERNED_ELEMENTS:
			return concernedElements != null && !concernedElements.isEmpty();
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //WorkingDataImpl
