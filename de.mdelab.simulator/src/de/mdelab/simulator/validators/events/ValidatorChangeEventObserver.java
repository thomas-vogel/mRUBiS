package de.mdelab.simulator.validators.events;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import de.mdelab.comparch.ComparchPackage;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.simulator.events.ChangeEventQueues;
import de.mdelab.simulator.events.ComponentStateChangeEvent;
import de.mdelab.simulator.events.ReroutingEvent;

/**
 * Collects change events of the model. These change events are caused by the
 * feedback loop and they are used internally by the simulator to validate a
 * self-adaptation performed by the feedback loop.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class ValidatorChangeEventObserver extends EContentAdapter {

	/**
	 * Queues of change events only used internally by the simulator.
	 */
	public static ChangeEventQueues INTERNAL_EVENT_QUEUES = new ChangeEventQueues();

	/**
	 * Constructor.
	 */
	public ValidatorChangeEventObserver() {
		super();
	}

	/**
	 * Filters relevant notifications and adds corresponding events to the queues.
	 * Currently, only {@link ComponentStateChangeEvent}s and
	 * {@link ReroutingEvent}s are collected as they are required by the current
	 * validation performed by the simulator.
	 * 
	 * @see EContentAdapter#notifyChanged(Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);

		Object notifier = notification.getNotifier();
		Object feature = notification.getFeature();

		// check changes in the attribute Component.state
		if (feature == ComparchPackage.Literals.COMPONENT__STATE) {
			assert notifier instanceof Component;
			Component component = (Component) notifier;
			ComponentState oldState = (ComponentState) notification.getOldValue();
			ComponentState newState = (ComponentState) notification.getNewValue();
			INTERNAL_EVENT_QUEUES.addEvent(new ComponentStateChangeEvent(component, component.getUid(),
					component.getName(), oldState, newState));
		} else
		// check changes to connectors
		if (feature == ComparchPackage.Literals.REQUIRED_INTERFACE__CONNECTOR) {
			assert notifier instanceof RequiredInterface;
			RequiredInterface requiredInterface = (RequiredInterface) notifier;
			Connector oldConnector = (Connector) notification.getOldValue();
			Connector newConnector = (Connector) notification.getNewValue();
			INTERNAL_EVENT_QUEUES.addEvent(new ReroutingEvent(requiredInterface, oldConnector, newConnector));
		}
	}

	/**
	 * @see EContentAdapter#isAdapterForType(Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		return type == ValidatorChangeEventObserver.class;
	}

}
