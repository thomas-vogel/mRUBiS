package de.mdelab.simulator.mrubis.examples.selfoptimization.eventmape;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.comparch.AdaptationStrategy;
import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.InputParameter;
import de.mdelab.comparch.Issue;
import de.mdelab.simulator.mrubis.examples.selfoptimization.strategies.AddFilter;
import de.mdelab.simulator.mrubis.examples.selfoptimization.strategies.ReorderFilters;
import de.mdelab.simulator.mrubis.examples.selfoptimization.strategies.SkipFilters;

/**
 * Planning activity of the feedback loop.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class Execute {

	/**
	 * Executes the planned adaptations to the model, that is, it processes the
	 * {@link AdaptationStrategy} elements annotated in the model by the previous
	 * planning activity and performs a corresponding adaptation to the model.
	 * 
	 * @param annotations
	 *            the annotations of the model.
	 */
	public void execute(Annotations annotations) {
		Iterator<AdaptationStrategy> strategies = annotations.getAdaptationStrategies().iterator();
		while (strategies.hasNext()) {
			AdaptationStrategy strategy = strategies.next();
			List<InputParameter> params = strategy.getInputParameters();
			switch (strategy.getType()) {
			case "ReorderFilters":
				InputParameter filter = this.getInputParameterByType(params, "impactedFilter");
				InputParameter newPrecedingComponent = this.getInputParameterByType(params, "newPrecedingFilter");
				InputParameter newSubsequentComponent = this.getInputParameterByType(params, "newSubsequentFilter");
				new ReorderFilters().enact((Component) filter.getArchitecturalElement(),
						(Component) newPrecedingComponent.getArchitecturalElement(),
						(Component) newSubsequentComponent.getArchitecturalElement());
				break;
			case "SkipFilters":
				InputParameter newLastFilterOfPipe = this.getInputParameterByType(params, "newLastFilterOfPipe");
				new SkipFilters().enact((Component) newLastFilterOfPipe.getArchitecturalElement());
				break;
			case "AddFilters":
				Iterator<InputParameter> parameterIterator = params.iterator();
				AddFilter addFilterStragtegy = new AddFilter();
				while (parameterIterator.hasNext()) {
					InputParameter filterToAdd = parameterIterator.next();
					InputParameter newPrecedingFilter = parameterIterator.next();
					InputParameter newSubsequentFilter = parameterIterator.next();
					addFilterStragtegy.enact((Component) filterToAdd.getArchitecturalElement(),
							(Component) newPrecedingFilter.getArchitecturalElement(),
							(Component) newSubsequentFilter.getArchitecturalElement());
				}
				break;
			default:
				break;
			}

		}
		// remove annotations assuming all annotated strategies have been executed and
		// handled the annotated issues.
		this.clearAnnotations(annotations);

	}

	/**
	 * Returns the first input parameter with the given type from the given list of
	 * input parameters.
	 * 
	 * @param params
	 *            the list of input parameters.
	 * @param type
	 *            the given type of the input parameter
	 * @return the first element of the given list of input parameters that has the
	 *         given type.
	 */
	private InputParameter getInputParameterByType(List<InputParameter> params, String type) {
		Optional<InputParameter> inputParam = params.stream().filter(i -> i.getType().equals(type)).findFirst();
		return inputParam.get();
	}

	/**
	 * Removes all annotations from the model that have been created by the feedback
	 * loop.
	 * 
	 * @param annotations
	 *            the annotations of the model.
	 */
	private void clearAnnotations(Annotations annotations) {
		// remove adaptation strategies and issues
		List<AdaptationStrategy> strategies = new LinkedList<AdaptationStrategy>(annotations.getAdaptationStrategies());
		for (AdaptationStrategy s : strategies) {
			EcoreUtil.delete(s, true);
		}
		List<Issue> issues = new LinkedList<Issue>(annotations.getIssues());
		for (Issue i : issues) {
			EcoreUtil.delete(i, true);
		}
	}

}
