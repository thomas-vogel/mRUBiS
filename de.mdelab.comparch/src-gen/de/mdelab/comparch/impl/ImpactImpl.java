/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.Impact;
import de.mdelab.comparch.Issue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.ImpactImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ImpactImpl#getArchitecturalElement <em>Architectural Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpactImpl extends AnnotationImpl implements Impact {
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
	protected ImpactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.IMPACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue getIssue() {
		if (eContainerFeatureID() != ComparchPackage.IMPACT__ISSUE)
			return null;
		return (Issue) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssue(Issue newIssue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newIssue, ComparchPackage.IMPACT__ISSUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssue(Issue newIssue) {
		if (newIssue != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.IMPACT__ISSUE && newIssue != null)) {
			if (EcoreUtil.isAncestor(this, newIssue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIssue != null)
				msgs = ((InternalEObject) newIssue).eInverseAdd(this, ComparchPackage.ISSUE__IMPACTS, Issue.class,
						msgs);
			msgs = basicSetIssue(newIssue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.IMPACT__ISSUE, newIssue, newIssue));
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
							ComparchPackage.IMPACT__ARCHITECTURAL_ELEMENT, oldArchitecturalElement,
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
					ComparchPackage.IMPACT__ARCHITECTURAL_ELEMENT, oldArchitecturalElement, newArchitecturalElement);
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
						ComparchPackage.ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS, ArchitecturalElement.class, msgs);
			if (newArchitecturalElement != null)
				msgs = ((InternalEObject) newArchitecturalElement).eInverseAdd(this,
						ComparchPackage.ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS, ArchitecturalElement.class, msgs);
			msgs = basicSetArchitecturalElement(newArchitecturalElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.IMPACT__ARCHITECTURAL_ELEMENT,
					newArchitecturalElement, newArchitecturalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComparchPackage.IMPACT__ISSUE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetIssue((Issue) otherEnd, msgs);
		case ComparchPackage.IMPACT__ARCHITECTURAL_ELEMENT:
			if (architecturalElement != null)
				msgs = ((InternalEObject) architecturalElement).eInverseRemove(this,
						ComparchPackage.ARCHITECTURAL_ELEMENT__ISSUE_IMPACTS, ArchitecturalElement.class, msgs);
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
		case ComparchPackage.IMPACT__ISSUE:
			return basicSetIssue(null, msgs);
		case ComparchPackage.IMPACT__ARCHITECTURAL_ELEMENT:
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
		case ComparchPackage.IMPACT__ISSUE:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.ISSUE__IMPACTS, Issue.class, msgs);
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
		case ComparchPackage.IMPACT__ISSUE:
			return getIssue();
		case ComparchPackage.IMPACT__ARCHITECTURAL_ELEMENT:
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
		case ComparchPackage.IMPACT__ISSUE:
			setIssue((Issue) newValue);
			return;
		case ComparchPackage.IMPACT__ARCHITECTURAL_ELEMENT:
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
		case ComparchPackage.IMPACT__ISSUE:
			setIssue((Issue) null);
			return;
		case ComparchPackage.IMPACT__ARCHITECTURAL_ELEMENT:
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
		case ComparchPackage.IMPACT__ISSUE:
			return getIssue() != null;
		case ComparchPackage.IMPACT__ARCHITECTURAL_ELEMENT:
			return architecturalElement != null;
		}
		return super.eIsSet(featureID);
	}

} //ImpactImpl
