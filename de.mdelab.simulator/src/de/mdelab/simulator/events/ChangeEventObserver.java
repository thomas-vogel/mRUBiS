package de.mdelab.simulator.events;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.Exception;
import de.mdelab.comparch.MonitoredProperty;
import de.mdelab.comparch.Parameter;
import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;

/**
 * Collects change events of the model which are provided to the feedback loop.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class ChangeEventObserver extends EContentAdapter {

	/**
	 * Queues for the change events.
	 */
	private ChangeEventQueues queues;

	/**
	 * Constructor.
	 * 
	 * @param queues
	 *            the queues to which the collected change events will be added by
	 *            this observer.
	 */
	public ChangeEventObserver(ChangeEventQueues queues) {
		super();
		this.queues = queues;
	}

	/**
	 * Filters relevant notifications and creates as well as adds corresponding
	 * change events to the queues.
	 * 
	 * @see EContentAdapter#notifyChanged(Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		this.queues.addEvent(notification);

		Object notifier = notification.getNotifier();
		Object feature = notification.getFeature();

		// check changes in the attribute Component.state
		if (feature == ComparchPackage.Literals.COMPONENT__STATE) {
			assert notifier instanceof Component;
			Component component = (Component) notifier;
			ComponentState oldState = (ComponentState) notification.getOldValue();
			ComponentState newState = (ComponentState) notification.getNewValue();
			this.queues.addEvent(new ComponentStateChangeEvent(component, component.getUid(), component.getName(),
					oldState, newState));
		} else
		// check component additions and removals, that is, changes in the multi-value
		// association Tenant.components
		if (feature == ComparchPackage.Literals.TENANT__COMPONENTS) {
			assert notifier instanceof Tenant;
			Tenant tenant = (Tenant) notifier;
			if (notification.getEventType() == Notification.ADD) {
				// component has been added;
				// notification.getOldValue() is null
				Component addedComponent = (Component) notification.getNewValue();
				this.queues.addEvent(new ComponentAdditionEvent(tenant, addedComponent, addedComponent.getUid(),
						addedComponent.getName()));
			} else if (notification.getEventType() == Notification.REMOVE) {
				// component has been removed;
				// notification.getNewValue() is null
				Component removedComponent = (Component) notification.getOldValue();
				this.queues.addEvent(new ComponentRemovalEvent(tenant, removedComponent, removedComponent.getUid(),
						removedComponent.getName()));
			}

		} else
		// check removal of components using the relationship between component types
		// and components
		if (feature == ComparchPackage.Literals.COMPONENT_TYPE__INSTANCES) {
			assert notifier instanceof ComponentType;
			ComponentType componentType = (ComponentType) notifier;
			if (notification.getEventType() == Notification.REMOVE) {
				// component has been removed;
				// notification.getNewValue() is null
				Component removedComponent = (Component) notification.getOldValue();
				this.queues.addEvent(new ComponentTypeInstanceRemovalEvent(componentType, removedComponent,
						removedComponent.getUid(), removedComponent.getName()));
			}

		} else
		// check changes to connectors
		if (feature == ComparchPackage.Literals.REQUIRED_INTERFACE__CONNECTOR) {
			assert notifier instanceof RequiredInterface;
			RequiredInterface requiredInterface = (RequiredInterface) notifier;
			Connector oldConnector = (Connector) notification.getOldValue();
			Connector newConnector = (Connector) notification.getNewValue();
			this.queues.addEvent(new ReroutingEvent(requiredInterface, oldConnector, newConnector));
		} else
		// check additions of exceptions to provided interfaces
		if (feature == ComparchPackage.Literals.PROVIDED_INTERFACE__EXCEPTIONS) {
			assert notifier instanceof ProvidedInterface;
			ProvidedInterface providedInterface = (ProvidedInterface) notifier;
			if (notification.getEventType() == Notification.ADD) {
				// exception has been added
				// notification.getOldValue() is null
				Exception addedException = (Exception) notification.getNewValue();
				this.queues.addEvent(new ExceptionOccurrenceEvent(providedInterface, addedException));
			}
		} else
		// check changes of values of MonitoredProperties
		if (feature == ComparchPackage.Literals.MONITORED_PROPERTY__VALUE) {
			assert notifier instanceof MonitoredProperty;
			MonitoredProperty monitoredProperty = (MonitoredProperty) notifier;
			String oldValue = notification.getOldStringValue();
			String newValue = notification.getNewStringValue();
			this.queues.addEvent(new MonitoredPropertyUpdateEvent(monitoredProperty, oldValue, newValue));
		} else
		// check changes of the attributes of performance stats
		if (feature == ComparchPackage.Literals.PERFORMANCE_STATS__MIN_TIME
				|| feature == ComparchPackage.Literals.PERFORMANCE_STATS__MAX_TIME
				|| feature == ComparchPackage.Literals.PERFORMANCE_STATS__TOTAL_TIME
				|| feature == ComparchPackage.Literals.PERFORMANCE_STATS__INVOCATION_COUNT) {
			assert notifier instanceof PerformanceStats;
			PerformanceStats stats = (PerformanceStats) notifier;
			this.queues.addEvent(new PerformanceStatsUpdateEvent(stats));
		} else
		// check changes to values of Parameters
		if (feature == ComparchPackage.Literals.PARAMETER__VALUE) {
			assert notifier instanceof Parameter;
			Parameter parameter = (Parameter) notifier;
			String oldValue = notification.getOldStringValue();
			String newValue = notification.getNewStringValue();
			this.queues.addEvent(new ParameterUpdateEvent(parameter, oldValue, newValue));
		} else
		// check additions and removals of tenants
		if (feature == ComparchPackage.Literals.ARCHITECTURE__TENANTS) {
			assert notifier instanceof Architecture;
			Architecture architecture = (Architecture) notifier;
			if (notification.getEventType() == Notification.ADD) {
				// tenant has been added
				// notification.getOldValue() is null
				Tenant addedTenant = (Tenant) notification.getNewValue();
				this.queues.addEvent(new TenantAdditionEvent(architecture, addedTenant));
			} else if (notification.getEventType() == Notification.REMOVE) {
				// tenant has been removed;
				// notification.getNewValue() is null
				Tenant removedTenant = (Tenant) notification.getOldValue();
				this.queues.addEvent(new TenantRemovalEvent(architecture, removedTenant));
			}
		}
	}

	/**
	 * @see EContentAdapter#isAdapterForType(Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		return type == ChangeEventObserver.class;
	}

}
