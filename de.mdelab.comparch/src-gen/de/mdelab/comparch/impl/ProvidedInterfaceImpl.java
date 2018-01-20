/**
 */
package de.mdelab.comparch.impl;

import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.ProvidedInterface;

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
 * An implementation of the model object '<em><b>Provided Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.comparch.impl.ProvidedInterfaceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ProvidedInterfaceImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ProvidedInterfaceImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link de.mdelab.comparch.impl.ProvidedInterfaceImpl#getPerformanceStats <em>Performance Stats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedInterfaceImpl extends InterfaceImpl implements ProvidedInterface {
	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<de.mdelab.comparch.Exception> exceptions;

	/**
	 * The cached value of the '{@link #getPerformanceStats() <em>Performance Stats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceStats()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceStats> performanceStats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComparchPackage.Literals.PROVIDED_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (eContainerFeatureID() != ComparchPackage.PROVIDED_INTERFACE__COMPONENT)
			return null;
		return (Component) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newComponent, ComparchPackage.PROVIDED_INTERFACE__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		if (newComponent != eInternalContainer()
				|| (eContainerFeatureID() != ComparchPackage.PROVIDED_INTERFACE__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject) newComponent).eInverseAdd(this,
						ComparchPackage.COMPONENT__PROVIDED_INTERFACES, Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComparchPackage.PROVIDED_INTERFACE__COMPONENT,
					newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectWithInverseResolvingEList<Connector>(Connector.class, this,
					ComparchPackage.PROVIDED_INTERFACE__CONNECTORS, ComparchPackage.CONNECTOR__TARGET);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<de.mdelab.comparch.Exception> getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectContainmentWithInverseEList<de.mdelab.comparch.Exception>(
					de.mdelab.comparch.Exception.class, this, ComparchPackage.PROVIDED_INTERFACE__EXCEPTIONS,
					ComparchPackage.EXCEPTION__INTERFACE);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformanceStats> getPerformanceStats() {
		if (performanceStats == null) {
			performanceStats = new EObjectContainmentWithInverseEList<PerformanceStats>(PerformanceStats.class, this,
					ComparchPackage.PROVIDED_INTERFACE__PERFORMANCE_STATS,
					ComparchPackage.PERFORMANCE_STATS__INTERFACE);
		}
		return performanceStats;
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
		case ComparchPackage.PROVIDED_INTERFACE__COMPONENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetComponent((Component) otherEnd, msgs);
		case ComparchPackage.PROVIDED_INTERFACE__CONNECTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConnectors()).basicAdd(otherEnd, msgs);
		case ComparchPackage.PROVIDED_INTERFACE__EXCEPTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getExceptions()).basicAdd(otherEnd, msgs);
		case ComparchPackage.PROVIDED_INTERFACE__PERFORMANCE_STATS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPerformanceStats()).basicAdd(otherEnd, msgs);
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
		case ComparchPackage.PROVIDED_INTERFACE__COMPONENT:
			return basicSetComponent(null, msgs);
		case ComparchPackage.PROVIDED_INTERFACE__CONNECTORS:
			return ((InternalEList<?>) getConnectors()).basicRemove(otherEnd, msgs);
		case ComparchPackage.PROVIDED_INTERFACE__EXCEPTIONS:
			return ((InternalEList<?>) getExceptions()).basicRemove(otherEnd, msgs);
		case ComparchPackage.PROVIDED_INTERFACE__PERFORMANCE_STATS:
			return ((InternalEList<?>) getPerformanceStats()).basicRemove(otherEnd, msgs);
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
		case ComparchPackage.PROVIDED_INTERFACE__COMPONENT:
			return eInternalContainer().eInverseRemove(this, ComparchPackage.COMPONENT__PROVIDED_INTERFACES,
					Component.class, msgs);
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
		case ComparchPackage.PROVIDED_INTERFACE__COMPONENT:
			return getComponent();
		case ComparchPackage.PROVIDED_INTERFACE__CONNECTORS:
			return getConnectors();
		case ComparchPackage.PROVIDED_INTERFACE__EXCEPTIONS:
			return getExceptions();
		case ComparchPackage.PROVIDED_INTERFACE__PERFORMANCE_STATS:
			return getPerformanceStats();
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
		case ComparchPackage.PROVIDED_INTERFACE__COMPONENT:
			setComponent((Component) newValue);
			return;
		case ComparchPackage.PROVIDED_INTERFACE__CONNECTORS:
			getConnectors().clear();
			getConnectors().addAll((Collection<? extends Connector>) newValue);
			return;
		case ComparchPackage.PROVIDED_INTERFACE__EXCEPTIONS:
			getExceptions().clear();
			getExceptions().addAll((Collection<? extends de.mdelab.comparch.Exception>) newValue);
			return;
		case ComparchPackage.PROVIDED_INTERFACE__PERFORMANCE_STATS:
			getPerformanceStats().clear();
			getPerformanceStats().addAll((Collection<? extends PerformanceStats>) newValue);
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
		case ComparchPackage.PROVIDED_INTERFACE__COMPONENT:
			setComponent((Component) null);
			return;
		case ComparchPackage.PROVIDED_INTERFACE__CONNECTORS:
			getConnectors().clear();
			return;
		case ComparchPackage.PROVIDED_INTERFACE__EXCEPTIONS:
			getExceptions().clear();
			return;
		case ComparchPackage.PROVIDED_INTERFACE__PERFORMANCE_STATS:
			getPerformanceStats().clear();
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
		case ComparchPackage.PROVIDED_INTERFACE__COMPONENT:
			return getComponent() != null;
		case ComparchPackage.PROVIDED_INTERFACE__CONNECTORS:
			return connectors != null && !connectors.isEmpty();
		case ComparchPackage.PROVIDED_INTERFACE__EXCEPTIONS:
			return exceptions != null && !exceptions.isEmpty();
		case ComparchPackage.PROVIDED_INTERFACE__PERFORMANCE_STATS:
			return performanceStats != null && !performanceStats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvidedInterfaceImpl
