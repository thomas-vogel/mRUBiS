package de.mdelab.simulator;

import de.mdelab.simulator.events.ChangeEventQueues;

/**
 * Interface to use the simulator.
 * 
 * If the simulator has been obtained from the {@link SimulatorFactory}, it must
 * be configured by adding {@link Validator}s (see
 * {@link #addValidator(Validator)}) that validate the model in each simulation
 * round after the feedback loop has been executed.
 * 
 * After adding validators, the simulator can be used by alternately invoking
 * {@link #injectIssues()} to inject issues into the model according to the
 * provided {@link Scenario} and {@link #validateModel()} to validate the
 * adaptation and the model using the added {@link Validator}s. The validators
 * are executed in the same order as they are added to the simulator.
 * 
 * The method {@link #isSimulationCompleted()} is used to check whether the
 * simulation has been completed or not, that is, the specified number of
 * simulation rounds has been achieved. One round consists of invoking once
 * {@link #injectIssues()}, one run of the feedback loop, and finally invoking
 * once the {@link #validateModel()}.
 * 
 * Inbetween snapshots of the model can be obtained by invoking
 * {@link #snapshotModel()}. After the simulation has completed,
 * {@link #showResults()} can be used to produce CSV files and charts of the
 * utility of the managed system and of the performance of the feedback loop.
 * 
 * If a feedback loop uses events notifying about changes of the model to drive
 * the self-adaptation process, access to the various event queues can be
 * obtained through {@link #getChangeEventsQueues()}.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public interface Simulator {

	/**
	 * The singleton factory instance to obtain an instance of the
	 * {@link Simulator}.
	 */
	public final static SimulatorFactory FACTORY = new SimulatorFactory();

	/**
	 * Adds the given validator to the simulator.
	 * 
	 * @param validator
	 *            the validator to be added.
	 */
	public void addValidator(Validator validator);

	/**
	 * Validates the model using the analyzers.
	 * 
	 * @return the number of issues identified by the validation.
	 */
	public int validateModel();

	/**
	 * Injects issues into the model using the injectors according to the
	 * {@link Scenario}.
	 * 
	 * The issues injected by one invocation of this method should be handled by one
	 * run of the feedback loop. Hence, one invocation of this method corresponds to
	 * one run of the simulator.
	 */
	public void injectIssues();

	/**
	 * Returns <code>true</code> if the simulation has been completed, else
	 * <code>false</code>.
	 * 
	 * @return <code>true</code> if the simulation has been completed, else
	 *         <code>false</code>.
	 */
	public boolean isSimulationCompleted();

	/**
	 * Creates a snapshot of the model and stores the snapshot in the folder
	 * <code>./results/</code>.
	 */
	public void snapshotModel();

	/**
	 * Produces the simulation results in the folder <code>./results/</code> of the
	 * project. These results comprise the utility of the managed system and the
	 * execution time of the feedback loop.
	 */
	public void showResults();

	/**
	 * Returns the queues for events notifying about changes of the model if
	 * tracking of change events is enabled, otherwise <code>null</code>.
	 * 
	 * @return the queues for events notifying about changes of the model if
	 *         tracking of change events is enabled, otherwise <code>null</code>.
	 */
	public ChangeEventQueues getChangeEventsQueues();

}