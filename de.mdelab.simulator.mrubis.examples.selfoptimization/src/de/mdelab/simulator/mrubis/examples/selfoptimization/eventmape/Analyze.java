package de.mdelab.simulator.mrubis.examples.selfoptimization.eventmape;

import java.util.Queue;

import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.Impact;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.Issue;
import de.mdelab.comparch.MethodSpecification;
import de.mdelab.comparch.MonitoredProperty;
import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.events.ChangeEventQueues;
import de.mdelab.simulator.events.MonitoredPropertyUpdateEvent;
import de.mdelab.simulator.events.PerformanceStatsUpdateEvent;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Analyze activity of the feedback loop.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class Analyze {

	private PipeAdaptationHelper helper;

	/**
	 * Constructs the analyze activity.
	 * 
	 * @param helper
	 *            an instance of the {@link PipeAdaptationHelper}.
	 */
	public Analyze(PipeAdaptationHelper helper) {
		super();
		this.helper = helper;
	}

	/**
	 * Analyzes the model to identify PI1, PI2, and PI3 issues. The analysis is
	 * driven by change events. For each identified issue, it enriches the model
	 * with a corresponding {@link Issue} annotation.
	 * 
	 * @param annotations
	 *            the annotations in the model
	 * @param queues
	 *            the queues of change events provided by the simulator
	 * @param responseTimeUpperThreshold
	 *            the upper threshold for the average response time of the
	 *            personalized search
	 * @param responseTimeLowerThreshold
	 *            the lower threshold for the average response time of the
	 *            personalized search
	 */
	public void analyze(Annotations annotations, ChangeEventQueues queues, int responseTimeUpperThreshold,
			int responseTimeLowerThreshold) {
		// analyze for PI1
		this.processMonitoredPropertyChange(annotations, queues.getMonitoredPropertyUpdateEvents());
		// analyze for PI2 and PI3
		this.processPerformanceStatsChange(annotations, queues.getPerformanceStatsUpdateEvents(),
				responseTimeUpperThreshold, responseTimeLowerThreshold);
	}

	/**
	 * Processes the {@link MonitoredPropertyUpdateEvent}s that might refer to
	 * changes of the selection rate or local computation time of a filter
	 * component. As a consequence of the change, the filter component might not be
	 * located any more at its optimal position in the pipe.
	 * 
	 * @param annotations
	 *            the annotations in the model
	 * @param events
	 *            the queue of {@link MonitoredPropertyUpdateEvent}s
	 */
	private void processMonitoredPropertyChange(Annotations annotations, Queue<MonitoredPropertyUpdateEvent> events) {
		while (!events.isEmpty()) {
			// process event
			MonitoredPropertyUpdateEvent event = events.poll();
			// check condition
			boolean conditionSatisfied = this.checkPI1Condition(event);
			Component updatedFilter = (Component) event.getProperty().getArchitecturalElement();
			if (conditionSatisfied) {
				// create an issue if there does not exist an issue yet
				boolean pi1Exists = false;
				for (Impact i : updatedFilter.getIssueImpacts()) {
					Issue issue = i.getIssue();
					if (issue.getType().equals("PI1")) {
						pi1Exists = true;
						break;
					}
				}
				if (!pi1Exists) {
					Issue pi1 = ComparchFactory.eINSTANCE.createIssue();
					pi1.setType("PI1");
					annotations.getIssues().add(pi1);
					// specify the impact of the issue, that is, the affected filter
					Impact impactedFilter = ComparchFactory.eINSTANCE.createImpact();
					impactedFilter.setType("impactedFilter");
					impactedFilter.setArchitecturalElement(updatedFilter);
					pi1.getImpacts().add(impactedFilter);
				}
			}
		}
	}

	/**
	 * Checks the condition whether a PI1 issue has occurred for the given event
	 * notifying about an update of a {@link MonitoredProperty}.
	 * 
	 * @param event
	 *            the event to be checked.
	 * @return <code>true</code> if a PI1 issue has been identified, otherwise
	 *         <code>false</code>.
	 */
	private boolean checkPI1Condition(MonitoredPropertyUpdateEvent event) {
		// check if the updated property is the selection rate or local computation time
		// of a filter
		MonitoredProperty property = event.getProperty();
		String propertyName = property.getName();
		if (propertyName.equals(MRubisNames.selectionRate_MonitoredProperty_Name)
				|| propertyName.equals(MRubisNames.localComputationTime_MonitoredProperty_Name)) {
			Component updatedFilter = (Component) property.getArchitecturalElement();
			double slopeOfUpdatedFilter = helper.getSlopeOfFilter(updatedFilter);

			// check preceding filter if it exists (the preceding component can be the
			// query service in which case we do not have to do any check):
			// a filter has exactly one provided interface that is used by one required
			// interface
			Component precedingComponent = updatedFilter.getProvidedInterfaces().get(0).getConnectors().get(0)
					.getSource().getComponent();
			if (helper.isFilter(precedingComponent)) {
				double slopeOfPrecedingFilter = helper.getSlopeOfFilter(precedingComponent);
				if (slopeOfPrecedingFilter < slopeOfUpdatedFilter) {
					return true;
				} else {
					// check subsequent filter that is a filter component
					Component subsequentFilter = updatedFilter.getRequiredInterfaces().get(0).getConnector().getTarget()
							.getComponent();
					double slopeOfSubsequentFilter = helper.getSlopeOfFilter(subsequentFilter);
					if (slopeOfUpdatedFilter < slopeOfSubsequentFilter) {
						return true;
					}
				}
			}

		}
		return false;
	}

	/**
	 * Processes the {@link PerformanceStatsUpdateEvent}s that might refer to an
	 * update of the performance of the personalized search. As a consequence, the
	 * average response time of the personalized search might have changed and might
	 * be now above the upper threshold or below the lower threshold.
	 * 
	 * @param annotations
	 *            the annotations in the model
	 * @param events
	 *            the queue of {@link PerformanceStatsUpdateEvent}.
	 * @param responseTimeUpperThreshold
	 *            the upper threshold for the average response time of the
	 *            personalized search
	 * @param responseTimeLowerThreshold
	 *            the lower threshold for the average response time of the
	 *            personalized search
	 */
	private void processPerformanceStatsChange(Annotations annotations, Queue<PerformanceStatsUpdateEvent> events,
			int responseTimeUpperThreshold, int responseTimeLowerThreshold) {
		while (!events.isEmpty()) {
			// process event
			PerformanceStatsUpdateEvent event = events.poll();
			PerformanceStats stats = event.getPerformanceStats();
			ProvidedInterface providedInterface = stats.getInterface();
			InterfaceType interfaceType = providedInterface.getType();
			// check whether the stats belongs the browse categories service
			if (interfaceType.getFqName().equals(MRubisNames.browseCategoriesService_InterfaceType_FqName)) {
				MethodSpecification method = stats.getMethod();
				// check if we have the proper method getPersonalizedItems
				if (method != null && method.getSignature().equals(MRubisNames.getPersonalizedItems_Signature)) {
					long invovationCount = stats.getInvocationCount();
					double averageResponseTime = 0;
					if (invovationCount > 0) {
						averageResponseTime = stats.getTotalTime() / invovationCount;
					}

					// check conditions
					if (averageResponseTime > 0) {
						if (averageResponseTime > responseTimeUpperThreshold) {
							// PI2 identified
							// create an issue if there does not exist an issue yet
							if (!this.issueExists("PI2", stats)) {
								this.assignIssue("PI2", stats, annotations);
							}
						} else if (averageResponseTime < responseTimeLowerThreshold) {
							// PI3 identified
							if (!this.issueExists("PI3", stats)) {
								this.assignIssue("PI3", stats, annotations);
							}
						}
					}

				}
			}

		}

	}

	/**
	 * Checks whether an {@link Issue} annotation of the given type already exists
	 * for the given stats.
	 * 
	 * @param issueType
	 *            the type of the issue annotation to be searched
	 * @param stats
	 *            the {@link PerformanceStats} element whose issue annotations are
	 *            checked
	 * @return <code>true</code> if there is already an issue of the given type
	 *         annotated to the stats element, otherwise <code>false</code>
	 */
	private boolean issueExists(String issueType, PerformanceStats stats) {
		boolean issueExists = false;
		for (Impact i : stats.getIssueImpacts()) {
			Issue issue = i.getIssue();
			if (issue.getType().equals(issueType)) {
				issueExists = true;
				break;
			}
		}
		return issueExists;
	}

	/**
	 * Creates and assigns an {@link Issue} annotation of the given type to the
	 * given stats element.
	 * 
	 * @param issueType
	 *            the type of the issue to be created
	 * @param stats
	 *            the stats element to which the issue annotation will be made
	 * @param annotations
	 *            all annotations in the model
	 */
	private void assignIssue(String issueType, PerformanceStats stats, Annotations annotations) {
		Issue issue = ComparchFactory.eINSTANCE.createIssue();
		issue.setType(issueType);
		annotations.getIssues().add(issue);
		// specify the impact of the issue, that is, the affected stats and the query
		// service as the start of the pipe
		Impact impactedStats = ComparchFactory.eINSTANCE.createImpact();
		impactedStats.setType("impactedStats");
		impactedStats.setArchitecturalElement(stats);
		issue.getImpacts().add(impactedStats);

		Impact impactedPipe = ComparchFactory.eINSTANCE.createImpact();
		impactedPipe.setType("impactedPipe");
		Tenant tenant = stats.getInterface().getComponent().getTenant();
		impactedPipe.setArchitecturalElement(this.helper.getQueryService(tenant));
		issue.getImpacts().add(impactedPipe);
	}

}
