package de.mdelab.simulator.mrubis.examples.selfoptimization.eventmape;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.Impact;
import de.mdelab.comparch.InputParameter;
import de.mdelab.comparch.Issue;
import de.mdelab.comparch.PerformanceStats;

/**
 * Planning activity of the feedback loop.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class Plan {

	private PipeAdaptationHelper helper;

	/**
	 * Constructs the planning activity.
	 * 
	 * @param helper
	 *            an instance of the {@link PipeAdaptationHelper}.
	 */
	public Plan(PipeAdaptationHelper helper) {
		super();
		this.helper = helper;
	}

	/**
	 * Processes the {@link Issue} annotations made by the previous analyze activity
	 * by planning an adaptation. The planned adaptation is annotated to the model
	 * using {@link AdaptationStrategy} annotations.
	 * 
	 * @param annotations
	 *            the annotations of the model
	 * @param responseTimeGoal
	 *            the goal for the average response time of the personalized search
	 */
	public void plan(Annotations annotations, int responseTimeGoal) {
		// assigns an adaptation strategy to each issue based on a static mapping
		for (Issue issue : annotations.getIssues()) {
			List<Impact> impacts = issue.getImpacts();
			AdaptationStrategy strategy = null;
			switch (issue.getType()) {
			case "PI1":
				Impact impactedFilter = this.getImpactByType(impacts, "impactedFilter");
				strategy = this.planFilterReordering((Component) impactedFilter.getArchitecturalElement());
				break;
			case "PI2":
				Impact impactedStats = this.getImpactByType(impacts, "impactedStats");
				Impact impactedPipe = this.getImpactByType(impacts, "impactedPipe");
				strategy = this.planSkipFilters((PerformanceStats) impactedStats.getArchitecturalElement(),
						(Component) impactedPipe.getArchitecturalElement(), responseTimeGoal);
				break;
			case "PI3":
				Impact impactedStats2 = this.getImpactByType(impacts, "impactedStats");
				Impact impactedPipe2 = this.getImpactByType(impacts, "impactedPipe");
				strategy = this.planAddFilters((PerformanceStats) impactedStats2.getArchitecturalElement(),
						(Component) impactedPipe2.getArchitecturalElement(), responseTimeGoal);
				break;
			default:
				break;
			}

			issue.getAssignedAdaptationStrategies().add(strategy);
			annotations.getAdaptationStrategies().add(strategy);
		}
	}

	/**
	 * Returns the first impact element from the given list based on the impact
	 * type.
	 * 
	 * @param impacts
	 *            list of impact elements
	 * @param type
	 *            the searched impact type
	 * @return the impact element with the given type from the list of impact
	 *         elements
	 */
	private Impact getImpactByType(List<Impact> impacts, String type) {
		Optional<Impact> impact = impacts.stream().filter(i -> i.getType().equals(type)).findFirst();
		return impact.get();
	}

	/**
	 * Plans a re-ordering of the given filter component in the pipe and creates a
	 * corresponding {@link AdaptationStrategy} annotation in the model.
	 * 
	 * @param filter
	 *            the given filter
	 * @return the created {@link AdaptationStrategy} to be added to the model.
	 */
	private AdaptationStrategy planFilterReordering(Component filter) {
		AdaptationStrategy strategy = ComparchFactory.eINSTANCE.createAdaptationStrategy();
		strategy.setType("ReorderFilters");

		InputParameter impactedFilterParam = ComparchFactory.eINSTANCE.createInputParameter();
		impactedFilterParam.setType("impactedFilter");
		impactedFilterParam.setArchitecturalElement(filter);
		strategy.getInputParameters().add(impactedFilterParam);

		Component newPrecedingFilter = null;
		Component newSubsequentFilter = null;

		// find new preceding and new subsequent filter of the impacted filter
		double filterSlope = helper.getSlopeOfFilter(filter);
		// search toward the beginning of the pipe
		Component pointer = filter;
		while (helper.getSlopeOfPrecedingFilter(pointer) < filterSlope) {
			pointer = helper.getPrecedingFilter(pointer);
		}

		if (!pointer.equals(filter)) {
			// position found at the beginning of the pipe
			newSubsequentFilter = pointer;
			newPrecedingFilter = helper.getPrecedingComponent(pointer);
		} else {
			// position is toward the end of the pipe
			// search toward the end of the pipe
			while (helper.getSlopeOfSubsequentFilter(pointer) > filterSlope) {
				pointer = helper.getSubsequentFilter(pointer);
			}
			newPrecedingFilter = pointer;
			newSubsequentFilter = helper.getSubsequentFilter(pointer);
		}

		InputParameter newPrecedingFilterParam = ComparchFactory.eINSTANCE.createInputParameter();
		newPrecedingFilterParam.setType("newPrecedingFilter");
		newPrecedingFilterParam.setArchitecturalElement(newPrecedingFilter);
		strategy.getInputParameters().add(newPrecedingFilterParam);

		InputParameter newSubsequentFilterParam = ComparchFactory.eINSTANCE.createInputParameter();
		newSubsequentFilterParam.setType("newSubsequentFilter");
		newSubsequentFilterParam.setArchitecturalElement(newSubsequentFilter);
		strategy.getInputParameters().add(newSubsequentFilterParam);

		return strategy;
	}

	/**
	 * Plans a shortening of the pipe by skipping filters and it creates a
	 * corresponding {@link AdaptationStrategy} annotation in the model.
	 * 
	 * @param stats
	 *            the {@link PerformanceStats} of the personalized search
	 * @param queryService
	 *            the query service of the tenant as the start of the pipe of filter
	 *            components
	 * @param responseTimeGoal
	 *            the goal for the average response time of the personalized search
	 * @return the created {@link AdaptationStrategy} to be added to the model.
	 */
	private AdaptationStrategy planSkipFilters(PerformanceStats stats, Component queryService, int responseTimeGoal) {
		AdaptationStrategy strategy = ComparchFactory.eINSTANCE.createAdaptationStrategy();
		strategy.setType("SkipFilters");
		double observedResponseTime = stats.getTotalTime() / stats.getInvocationCount();
		List<Component> filters = this.helper.getFilters(queryService);

		double currentResponseTime = observedResponseTime;
		int i = filters.size();
		while (currentResponseTime > responseTimeGoal && i > 1) {
			i--;
			Component lastFilter = filters.get(i);
			long localComputationTime = this.helper.getLocalComputationTime(lastFilter);
			currentResponseTime = currentResponseTime - localComputationTime;
		}

		InputParameter newLastFilterOfPipe = ComparchFactory.eINSTANCE.createInputParameter();
		newLastFilterOfPipe.setType("newLastFilterOfPipe");
		newLastFilterOfPipe.setArchitecturalElement(filters.get(i - 1));
		strategy.getInputParameters().add(newLastFilterOfPipe);
		return strategy;
	}

	/**
	 * Plans an extension of the pipe by adding unused filters to the pipe, and it
	 * creates a corresponding {@link AdaptationStrategy} annotation in the model.
	 * 
	 * @param stats
	 *            the {@link PerformanceStats} of the personalized search
	 * @param queryService
	 *            the query service of the tenant as the start of the pipe of filter
	 *            components
	 * @param responseTimeGoal
	 *            the goal for the average response time of the personalized search
	 * @return the created {@link AdaptationStrategy} to be added to the model.
	 */
	private AdaptationStrategy planAddFilters(PerformanceStats stats, Component queryService, int responseTimeGoal) {
		AdaptationStrategy strategy = ComparchFactory.eINSTANCE.createAdaptationStrategy();
		strategy.setType("AddFilters");
		double observedResponseTime = stats.getTotalTime() / stats.getInvocationCount();

		List<Component> undeployedFilters = this.helper.getUndeployedOrStoppedFiltersOfTenant(queryService.getTenant());
		undeployedFilters.sort(new FilterSorter(this.helper));
		List<PlannedFilterAddition> plannedFilterAdditions = new LinkedList<Plan.PlannedFilterAddition>();

		double currentResponseTime = observedResponseTime;
		while (currentResponseTime < responseTimeGoal && undeployedFilters.size() > 0) {

			Component filterToAdd = undeployedFilters.remove(0);
			long localComputationTime = this.helper.getLocalComputationTime(filterToAdd);

			if (currentResponseTime + localComputationTime < responseTimeGoal) {
				// find position of the filterToAdd
				PlannedFilterAddition plannedFilterAddition = this.findOptimalPositionOfFilter(queryService,
						filterToAdd, plannedFilterAdditions);
				plannedFilterAdditions.add(plannedFilterAddition);

				currentResponseTime = currentResponseTime + localComputationTime;
			}
		}
		// set input parameter of strategy
		int i = 1;
		for (PlannedFilterAddition pfa : plannedFilterAdditions) {
			InputParameter filterAddition = ComparchFactory.eINSTANCE.createInputParameter();
			filterAddition.setType("filterAddition" + i);
			filterAddition.setArchitecturalElement(pfa.getFilterToAdd());
			strategy.getInputParameters().add(filterAddition);

			InputParameter newPrecedingFilter = ComparchFactory.eINSTANCE.createInputParameter();
			newPrecedingFilter.setType("newPrecedingFilter" + i);
			newPrecedingFilter.setArchitecturalElement(pfa.getNewPrecedingFilter());
			strategy.getInputParameters().add(newPrecedingFilter);

			InputParameter newSubsequentFilter = ComparchFactory.eINSTANCE.createInputParameter();
			newSubsequentFilter.setType("newSubsequentFilter" + i);
			newSubsequentFilter.setArchitecturalElement(pfa.getNewSubsequentFilter());
			strategy.getInputParameters().add(newSubsequentFilter);

			i++;
		}

		return strategy;
	}

	/**
	 * Comparator to sort filter components according to their slopes (the slope of
	 * a component is the selection rate divided by the local computation time of
	 * the component)
	 * 
	 * @author thomas vogel
	 * @version 0.41
	 *
	 */
	private class FilterSorter implements Comparator<Component> {

		private PipeAdaptationHelper helper;

		/**
		 * Creates the comparator for filter components.
		 * 
		 * @param helper
		 *            an instance of the {@link PipeAdaptationHelper}
		 */
		public FilterSorter(PipeAdaptationHelper helper) {
			this.helper = helper;
		}

		/**
		 * @see Comparator#compare(Object, Object)
		 */
		@Override
		public int compare(Component f1, Component f2) {
			double f1_slope = this.helper.getSlopeOfFilter(f1);
			double f2_slope = this.helper.getSlopeOfFilter(f2);
			if (f1_slope > f2_slope) {
				return -1;
			} else if (f1_slope < f2_slope) {
				return 1;
			} else {
				return 0;
			}
		}

	}

	/**
	 * Data structure to temporarily store a plan for adding a filter to a pipe.
	 * 
	 * @author thomas vogel
	 * @version 0.41
	 *
	 */
	private class PlannedFilterAddition {
		private Component filterToAdd;
		private Component newPrecedingFilter;
		private Component newSubsequentFilter;

		/**
		 * Constructs the filter addition
		 * 
		 * @param filterToAdd
		 *            the filter to be added to the pipe
		 */
		public PlannedFilterAddition(Component filterToAdd) {
			super();
			this.filterToAdd = filterToAdd;
		}

		/**
		 * @return the filter to be added to the pipe
		 */
		public Component getFilterToAdd() {
			return this.filterToAdd;
		}

		/**
		 * @return the filter component that will precede the filter to be added in the
		 *         pipe
		 */
		public Component getNewPrecedingFilter() {
			return this.newPrecedingFilter;
		}

		/**
		 * Sets the filter component that will precede the filter to be added in the
		 * pipe.
		 * 
		 * @param newPrecedingFilter
		 *            the filter component that will precede the filter to be added in
		 *            the pipe.
		 */
		public void setNewPrecedingFilter(Component newPrecedingFilter) {
			this.newPrecedingFilter = newPrecedingFilter;
		}

		/**
		 * @return the filter component that will succeed the filter to be added in the
		 *         pipe
		 */
		public Component getNewSubsequentFilter() {
			return this.newSubsequentFilter;
		}

		/**
		 * Sets the filter component that will succeed the filter to be added in the
		 * pipe
		 * 
		 * @param newSubsequentFilter
		 *            the filter component that will succeed the filter to be added in
		 *            the pipe
		 */
		public void setNewSubsequentFilter(Component newSubsequentFilter) {
			this.newSubsequentFilter = newSubsequentFilter;
		}

	}

	/**
	 * Plans the addition of a filter by searching the optimal position of the
	 * filter in the pipe.
	 * 
	 * @param queryService
	 *            the query service of the tenant as the start of the pipe of filter
	 *            components
	 * @param filterToAdd
	 *            the filter to be added to the pipe
	 * @param plannedAdditions
	 *            the filter additions that have been planned so far but not
	 *            executed yet.
	 * @return the plan of adding the given filter.
	 */
	private PlannedFilterAddition findOptimalPositionOfFilter(Component queryService, Component filterToAdd,
			List<PlannedFilterAddition> plannedAdditions) {
		PlannedFilterAddition filterAddition = new PlannedFilterAddition(filterToAdd);

		List<Component> filters = this.helper.getFilters(queryService);

		for (PlannedFilterAddition pfa : plannedAdditions) {
			Component plannedAdd = pfa.getFilterToAdd();
			Component plannedPrecFilter = pfa.getNewPrecedingFilter();
			int pos = 0;
			for (int i = 0; i < filters.size(); i++) {
				Component c = filters.get(i);
				if (c.equals(plannedPrecFilter)) {
					pos = i + 1;
					break;
				}
			}
			// If the preceding filter cannot be found in the list of filters,
			// then it is the query service. in this case, the filter should be
			// added at the beginning of the pipe, that is, at position 0.
			if (pos <= filters.size()) {
				filters.add(pos, plannedAdd);
			} else {
				filters.add(0, plannedAdd);
			}

		}

		double filterSlope = this.helper.getSlopeOfFilter(filterToAdd);

		for (int i = 0; i < filters.size(); i++) {
			Component current = filters.get(i);
			if (filterSlope >= this.helper.getSlopeOfFilter(current)) {
				filterAddition.setNewSubsequentFilter(current);
				Component pFilter = null;
				if (i > 0) {
					pFilter = filters.get(i - 1);
				} else {
					// i = 0 -> preceding component is the query service
					pFilter = queryService; // helper.getPrecedingComponent(current);
				}

				filterAddition.setNewPrecedingFilter(pFilter);
				break;
			}
		}

		// no position found within the pipe?
		if (filterAddition.getNewPrecedingFilter() == null && filterAddition.getNewSubsequentFilter() == null) {
			// => filter must be added to the end of the pipe:
			// preceding filter is the last filter of the pipe
			filterAddition.setNewPrecedingFilter(filters.get(filters.size() - 1));
			// subsequent filter is null
			filterAddition.setNewSubsequentFilter(null);
		}

		return filterAddition;

	}

}
