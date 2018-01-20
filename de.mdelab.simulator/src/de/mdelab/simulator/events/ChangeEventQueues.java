package de.mdelab.simulator.events;

import java.util.LinkedList;
import java.util.Queue;

import org.eclipse.emf.common.notify.Notification;

/**
 * Queues of events notifying about changes of the model (change events). For
 * each change event type there is an individual queue. The events can be used
 * by a feedback loop that gets access to the queues. A feedback loop is
 * responsible for clearing the queues in each round or removing those events
 * that have been processed and should not been kept in the queues for the next
 * simulation round.
 * 
 * Change events are only read (and typically not modified) by a feedback loop
 * to drive the adaptation process of the feedback loop.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class ChangeEventQueues {

	private Queue<ComponentStateChangeEvent> componentStateChangeEvents;
	private Queue<ComponentAdditionEvent> componentAdditionEvents;
	private Queue<ComponentRemovalEvent> componentRemovalEvents;
	private Queue<ReroutingEvent> reroutingEvents;
	private Queue<ExceptionOccurrenceEvent> exceptionOccurrenceEvents;
	private Queue<MonitoredPropertyUpdateEvent> monitoredPropertyUpdateEvents;
	private Queue<ParameterUpdateEvent> parameterUpdateEvents;
	private Queue<TenantAdditionEvent> tenantAdditionEvents;
	private Queue<TenantRemovalEvent> tenantRemovalEvents;
	private Queue<ComponentTypeInstanceRemovalEvent> componentTypeInstanceRemovalEvents;
	private Queue<PerformanceStatsUpdateEvent> performanceStatsUpdateEvents;
	private Queue<Notification> allEvents;

	/**
	 * Constructor.
	 */
	public ChangeEventQueues() {
		this.componentStateChangeEvents = new LinkedList<ComponentStateChangeEvent>();
		this.componentAdditionEvents = new LinkedList<ComponentAdditionEvent>();
		this.componentRemovalEvents = new LinkedList<ComponentRemovalEvent>();
		this.reroutingEvents = new LinkedList<ReroutingEvent>();
		this.exceptionOccurrenceEvents = new LinkedList<ExceptionOccurrenceEvent>();
		this.monitoredPropertyUpdateEvents = new LinkedList<MonitoredPropertyUpdateEvent>();
		this.parameterUpdateEvents = new LinkedList<ParameterUpdateEvent>();
		this.tenantAdditionEvents = new LinkedList<TenantAdditionEvent>();
		this.tenantRemovalEvents = new LinkedList<TenantRemovalEvent>();
		this.componentTypeInstanceRemovalEvents = new LinkedList<ComponentTypeInstanceRemovalEvent>();
		this.performanceStatsUpdateEvents = new LinkedList<PerformanceStatsUpdateEvent>();
		this.allEvents = new LinkedList<Notification>();
	}

	/**
	 * Adds a {@link ComponentStateChangeEvent} to the queue.
	 * 
	 * @param event
	 *            the event to be added.
	 */
	public void addEvent(ComponentStateChangeEvent event) {
		this.componentStateChangeEvents.add(event);
	}

	/**
	 * Returns the queue of {@link ComponentStateChangeEvent}s.
	 * 
	 * @return the queue of {@link ComponentStateChangeEvent}s.
	 */
	public Queue<ComponentStateChangeEvent> getComponentStateChangeEvents() {
		return this.componentStateChangeEvents;
	}

	/**
	 * Adds a {@link ComponentAdditionEvent} to the queue.
	 * 
	 * @param event
	 *            the event to be added.
	 */
	public void addEvent(ComponentAdditionEvent event) {
		this.componentAdditionEvents.add(event);
	}

	/**
	 * Returns the queue of {@link ComponentAdditionEvent}s.
	 * 
	 * @return the queue of {@link ComponentAdditionEvent}s.
	 */
	public Queue<ComponentAdditionEvent> getComponentAdditionEvents() {
		return this.componentAdditionEvents;
	}

	/**
	 * Adds a {@link ComponentRemovalEvent} to the queue.
	 * 
	 * @param event
	 *            the event to be added.
	 */
	public void addEvent(ComponentRemovalEvent event) {
		this.componentRemovalEvents.add(event);
	}

	/**
	 * Returns the queue of {@link ComponentRemovalEvent}s.
	 * 
	 * @return the queue of {@link ComponentRemovalEvent}s.
	 */
	public Queue<ComponentRemovalEvent> getComponentRemovalEvents() {
		return this.componentRemovalEvents;
	}

	/**
	 * Adds a {@link ReroutingEvent} to the queue.
	 * 
	 * @param event
	 *            the event to be added.
	 */
	public void addEvent(ReroutingEvent event) {
		this.reroutingEvents.add(event);
	}

	/**
	 * Returns the queue of {@link ReroutingEvent}s.
	 * 
	 * @return the queue of {@link ReroutingEvent}s.
	 */
	public Queue<ReroutingEvent> getReroutingEvents() {
		return this.reroutingEvents;
	}

	/**
	 * Adds an {@link ExceptionOccurrenceEvent} to the queue.
	 * 
	 * @param event
	 *            the event to be added.
	 */
	public void addEvent(ExceptionOccurrenceEvent event) {
		this.exceptionOccurrenceEvents.add(event);
	}

	/**
	 * Returns the queue of {@link ExceptionOccurrenceEvent}s.
	 * 
	 * @return the queue of {@link ExceptionOccurrenceEvent}s.
	 */
	public Queue<ExceptionOccurrenceEvent> getExceptionOccurrenceEvents() {
		return this.exceptionOccurrenceEvents;
	}

	/**
	 * Adds a {@link MonitoredPropertyUpdateEvent} to the queue.
	 * 
	 * @param event
	 *            the event to be added.
	 */
	public void addEvent(MonitoredPropertyUpdateEvent event) {
		this.monitoredPropertyUpdateEvents.add(event);
	}

	/**
	 * Returns the queue of {@link MonitoredPropertyUpdateEvent}s.
	 * 
	 * @return the queue of {@link MonitoredPropertyUpdateEvent}s.
	 */
	public Queue<MonitoredPropertyUpdateEvent> getMonitoredPropertyUpdateEvents() {
		return this.monitoredPropertyUpdateEvents;
	}

	/**
	 * Adds a {@link ParameterUpdateEvent} to the queue.
	 * 
	 * @param event
	 *            the event to be added.
	 */
	public void addEvent(ParameterUpdateEvent event) {
		this.parameterUpdateEvents.add(event);
	}

	/**
	 * Returns the queue of {@link ParameterUpdateEvent}s.
	 * 
	 * @return the queue of {@link ParameterUpdateEvent}s.
	 */
	public Queue<ParameterUpdateEvent> getParameterUpdateEvents() {
		return this.parameterUpdateEvents;
	}

	/**
	 * Adds a {@link TenantAdditionEvent} to the queue.
	 * 
	 * @param event
	 *            the event to be added.
	 */
	public void addEvent(TenantAdditionEvent event) {
		this.tenantAdditionEvents.add(event);
	}

	/**
	 * Returns the queue of {@link TenantAdditionEvent}s.
	 * 
	 * @return the queue of {@link TenantAdditionEvent}s.
	 */
	public Queue<TenantAdditionEvent> getTenantAdditionEvents() {
		return this.tenantAdditionEvents;
	}

	/**
	 * Adds a {@link TenantRemovalEvent} to the queue.
	 * 
	 * @param event
	 *            the event to be added.
	 */
	public void addEvent(TenantRemovalEvent event) {
		this.tenantRemovalEvents.add(event);
	}

	/**
	 * Returns the queue of {@link TenantRemovalEvent}s.
	 * 
	 * @return the queue of {@link TenantRemovalEvent}s.
	 */
	public Queue<TenantRemovalEvent> getTenantRemovalEvents() {
		return this.tenantRemovalEvents;
	}

	/**
	 * Adds a {@link ComponentTypeInstanceRemovalEvent} to the queue.
	 * 
	 * @param event
	 *            the event to be added.
	 */
	public void addEvent(ComponentTypeInstanceRemovalEvent event) {
		this.componentTypeInstanceRemovalEvents.add(event);
	}

	/**
	 * Returns the queue of {@link ComponentTypeInstanceRemovalEvent}s.
	 * 
	 * @return the queue of {@link ComponentTypeInstanceRemovalEvent}s.
	 */
	public Queue<ComponentTypeInstanceRemovalEvent> getComponentTypeInstanceRemovalEvents() {
		return this.componentTypeInstanceRemovalEvents;
	}

	/**
	 * Adds a {@link PerformanceStatsUpdateEvent} to the queue.
	 * 
	 * @param event
	 *            the event to be added.
	 */
	public void addEvent(PerformanceStatsUpdateEvent event) {
		this.performanceStatsUpdateEvents.add(event);
	}

	/**
	 * Returns the queue of {@link ParameterUpdateEvent}s.
	 * 
	 * @return the queue of {@link ParameterUpdateEvent}s.
	 */
	public Queue<PerformanceStatsUpdateEvent> getPerformanceStatsUpdateEvents() {
		return this.performanceStatsUpdateEvents;
	}

	/**
	 * Adds each occurring generic {@link Notification} to the queue.
	 * 
	 * @param event
	 *            the {@link Notification} to be added.
	 */
	public void addEvent(Notification event) {
		this.allEvents.add(event);
	}

	/**
	 * Returns the queue of all change events, that have occurred, in the EMF format
	 * (see {@link Notification})..
	 * 
	 * @return the queue of all occurring change events.
	 */
	public Queue<Notification> getAllEvents() {
		return this.allEvents;
	}

	/**
	 * Clears are queues.
	 */
	public void clearEvents() {
		this.componentStateChangeEvents.clear();
		this.componentAdditionEvents.clear();
		this.componentRemovalEvents.clear();
		this.reroutingEvents.clear();
		this.exceptionOccurrenceEvents.clear();
		this.monitoredPropertyUpdateEvents.clear();
		this.parameterUpdateEvents.clear();
		this.tenantAdditionEvents.clear();
		this.tenantRemovalEvents.clear();
		this.componentTypeInstanceRemovalEvents.clear();
		this.performanceStatsUpdateEvents.clear();
		this.allEvents.clear();
	}

}
