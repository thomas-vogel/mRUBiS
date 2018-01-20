/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.ConcernedElement;
import de.mdelab.comparch.WorkingData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concerned Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.ConcernedElementImpl#getWorkingdata <em>Workingdata</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ConcernedElementImpl#getArchitecturalElement <em>Architectural Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcernedElementImpl extends AnnotationImpl implements ConcernedElement {
	/**
	 * The cached value of the '{@link #getArchitecturalElement() <em>Architectural Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalElement()
	 * @generated
	 * @ordered
	 */
	protected ArchitecturalElement architecturalElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.CONCERNED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkingData getWorkingdata() {
		if (eContainerFeatureID() != ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA)
			return null;
		return (WorkingData) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkingdata(WorkingData newWorkingdata, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newWorkingdata, ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkingdata(WorkingData newWorkingdata) {
		if (newWorkingdata != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA
						&& newWorkingdata != null)) {
			if (EcoreUtil.isAncestor(this, newWorkingdata))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkingdata != null)
				msgs = ((InternalEObject) newWorkingdata).eInverseAdd(this,
						ComparchPackage.WORKING_DATA__CONCERNED_ELEMENTS, WorkingData.class, msgs);
			msgs = basicSetWorkingdata(newWorkingdata, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA,
					newWorkingdata, newWorkingdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalElement getArchitecturalElement() {
		if (architecturalElement != null && architecturalElement.eIsProxy()) {
			InternalEObject oldArchitecturalElement = (InternalEObject) architecturalElement;
			architecturalElement = (ArchitecturalElement) eResolveProxy(oldArchitecturalElement);
			if (architecturalElement != oldArchitecturalElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComparchPackage.CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT, oldArchitecturalElement,
							architecturalElement));
			}
		}
		return architecturalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalElement basicGetArchitecturalElement() {
		return architecturalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchitecturalElement(ArchitecturalElement newArchitecturalElement,
			NotificationChain msgs) {
		ArchitecturalElement oldArchitecturalElement = architecturalElement;
		architecturalElement = newArchitecturalElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ComparchPackage.CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT, oldArchitecturalElement,
					newArchitecturalElement);
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
	public void setArchitecturalElement(ArchitecturalElement newArchitecturalElement) {
		if (newArchitecturalElement != architecturalElement) {
			NotificationChain msgs = null;
			if (architecturalElement != null)
				msgs = ((InternalEObject) architecturalElement).eInverseRemove(this,
						ComparchPackage.ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS, ArchitecturalElement.class, msgs);
			if (newArchitecturalElement != null)
				msgs = ((InternalEObject) newArchitecturalElement).eInverseAdd(this,
						ComparchPackage.ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS, ArchitecturalElement.class, msgs);
			msgs = basicSetArchitecturalElement(newArchitecturalElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComparchPackage.CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT, newArchitecturalElement,
					newArchitecturalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetWorkingdata((WorkingData) otherEnd, msgs);
		case ComparchPackage.CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT:
			if (architecturalElement != null)
				msgs = ((InternalEObject) architecturalElement).eInverseRemove(this,
						ComparchPackage.ARCHITECTURAL_ELEMENT__WORKING_DATA_ELEMENTS, ArchitecturalElement.class, msgs);
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
		case ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA:
			return basicSetWorkingdata(null, msgs);
		case ComparchPackage.CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT:
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
		case ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.WORKING_DATA__CONCERNED_ELEMENTS,
					WorkingData.class, msgs);
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
		case ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA:
			return getWorkingdata();
		case ComparchPackage.CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT:
			if (resolve)
				return getArchitecturalElement();
			return basicGetArchitecturalElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA:
			setWorkingdata((WorkingData) newValue);
			return;
		case ComparchPackage.CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT:
			setArchitecturalElement((ArchitecturalElement) newValue);
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
		case ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA:
			setWorkingdata((WorkingData) null);
			return;
		case ComparchPackage.CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT:
			setArchitecturalElement((ArchitecturalElement) null);
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
		case ComparchPackage.CONCERNED_ELEMENT__WORKINGDATA:
			return getWorkingdata() != null;
		case ComparchPackage.CONCERNED_ELEMENT__ARCHITECTURAL_ELEMENT:
			return architecturalElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ConcernedElementImpl
