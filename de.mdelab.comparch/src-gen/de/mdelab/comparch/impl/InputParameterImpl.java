/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.InputParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.InputParameterImpl#getAdaptationStrategy <em>Adaptation Strategy</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.InputParameterImpl#getArchitecturalElement <em>Architectural Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputParameterImpl extends AnnotationImpl implements InputParameter {
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
	protected InputParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.INPUT_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationStrategy getAdaptationStrategy() {
		if (eContainerFeatureID() != ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY)
			return null;
		return (AdaptationStrategy) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdaptationStrategy(AdaptationStrategy newAdaptationStrategy,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAdaptationStrategy,
				ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdaptationStrategy(AdaptationStrategy newAdaptationStrategy) {
		if (newAdaptationStrategy != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY
						&& newAdaptationStrategy != null)) {
			if (EcoreUtil.isAncestor(this, newAdaptationStrategy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAdaptationStrategy != null)
				msgs = ((InternalEObject) newAdaptationStrategy).eInverseAdd(this,
						ComparchPackage.ADAPTATION_STRATEGY__INPUT_PARAMETERS, AdaptationStrategy.class, msgs);
			msgs = basicSetAdaptationStrategy(newAdaptationStrategy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY,
					newAdaptationStrategy, newAdaptationStrategy));
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
							ComparchPackage.INPUT_PARAMETER__ARCHITECTURAL_ELEMENT, oldArchitecturalElement,
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
					ComparchPackage.INPUT_PARAMETER__ARCHITECTURAL_ELEMENT, oldArchitecturalElement,
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
						ComparchPackage.ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS, ArchitecturalElement.class, msgs);
			if (newArchitecturalElement != null)
				msgs = ((InternalEObject) newArchitecturalElement).eInverseAdd(this,
						ComparchPackage.ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS, ArchitecturalElement.class, msgs);
			msgs = basicSetArchitecturalElement(newArchitecturalElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComparchPackage.INPUT_PARAMETER__ARCHITECTURAL_ELEMENT, newArchitecturalElement,
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
		case ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAdaptationStrategy((AdaptationStrategy) otherEnd, msgs);
		case ComparchPackage.INPUT_PARAMETER__ARCHITECTURAL_ELEMENT:
			if (architecturalElement != null)
				msgs = ((InternalEObject) architecturalElement).eInverseRemove(this,
						ComparchPackage.ARCHITECTURAL_ELEMENT__STRATEGY_INPUTS, ArchitecturalElement.class, msgs);
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
		case ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY:
			return basicSetAdaptationStrategy(null, msgs);
		case ComparchPackage.INPUT_PARAMETER__ARCHITECTURAL_ELEMENT:
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
		case ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.ADAPTATION_STRATEGY__INPUT_PARAMETERS,
					AdaptationStrategy.class, msgs);
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
		case ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY:
			return getAdaptationStrategy();
		case ComparchPackage.INPUT_PARAMETER__ARCHITECTURAL_ELEMENT:
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
		case ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY:
			setAdaptationStrategy((AdaptationStrategy) newValue);
			return;
		case ComparchPackage.INPUT_PARAMETER__ARCHITECTURAL_ELEMENT:
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
		case ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY:
			setAdaptationStrategy((AdaptationStrategy) null);
			return;
		case ComparchPackage.INPUT_PARAMETER__ARCHITECTURAL_ELEMENT:
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
		case ComparchPackage.INPUT_PARAMETER__ADAPTATION_STRATEGY:
			return getAdaptationStrategy() != null;
		case ComparchPackage.INPUT_PARAMETER__ARCHITECTURAL_ELEMENT:
			return architecturalElement != null;
		}
		return super.eIsSet(featureID);
	}

} //InputParameterImpl
