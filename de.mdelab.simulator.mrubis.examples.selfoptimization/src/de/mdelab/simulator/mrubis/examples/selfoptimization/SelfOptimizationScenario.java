package de.mdelab.simulator.mrubis.examples.selfoptimization;

import java.util.LinkedList;
import java.util.List;

import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.Injection;
import de.mdelab.simulator.Scenario;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.mrubis.injectors.PI1_Injector;
import de.mdelab.simulator.mrubis.injectors.PI2_Injector;
import de.mdelab.simulator.mrubis.injectors.PI3_Injector;

/**
 * A scenario for simulating the mRUBiS self-optimization case. This scenario
 * injects one performance issue (PI) in each simulation round. It repeats the
 * injection of a PI1, PI2, PI3, and another PI3, then starting again with PI1.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class SelfOptimizationScenario implements Scenario {

	private Architecture architecture;
	private int performanceMonitoringIntervall;
	private int responseTimeUpperThreshold;
	private int responseTimeLowerThreshold;

	/**
	 * Creates the self-optimization scenario.
	 * 
	 * @param architecture
	 *            the root element of the model
	 * @param performanceMonitoringIntervall
	 *            interval in terms of invocation counts between two performance
	 *            measurements
	 * @param responseTimeUpperThreshold
	 *            the upper threshold for the average response time of the
	 *            personalized search
	 * @param responseTimeLowerThreshold
	 *            the lower threshold for the average response time of the
	 *            personalized search
	 */
	public SelfOptimizationScenario(Architecture architecture, int performanceMonitoringIntervall,
			int responseTimeUpperThreshold, int responseTimeLowerThreshold) {
		this.architecture = architecture;
		this.performanceMonitoringIntervall = performanceMonitoringIntervall;
		this.responseTimeUpperThreshold = responseTimeUpperThreshold;
		this.responseTimeLowerThreshold = responseTimeLowerThreshold;
	}

	/**
	 * @see Scenario#getInjections(int)
	 */
	@Override
	public List<Injection<? extends ArchitecturalElement>> getInjections(int currentRound) {
		List<Injection<? extends ArchitecturalElement>> injections = new LinkedList<Injection<? extends ArchitecturalElement>>();

		// allows to run the switch case statement for more than 4 rounds.
		currentRound = (currentRound % 4);
		if (currentRound == 0) {
			currentRound = 4;
		}

		switch (currentRound) {
		case 1:
			Injection<Tenant> pi1 = new Injection<Tenant>(this.selectRandomTenant(), new PI1_Injector());
			injections.add(pi1);
			break;
		case 2:
			Injection<Tenant> pi2 = new Injection<Tenant>(this.selectRandomTenant(),
					new PI2_Injector(this.performanceMonitoringIntervall, this.responseTimeUpperThreshold));
			injections.add(pi2);
			break;
		case 3:
			Injection<Tenant> pi3 = new Injection<Tenant>(this.selectRandomTenant(),
					new PI3_Injector(this.performanceMonitoringIntervall, this.responseTimeLowerThreshold));
			injections.add(pi3);
			break;
		case 4:
			Injection<Tenant> pi3b = new Injection<Tenant>(this.selectRandomTenant(),
					new PI3_Injector(this.performanceMonitoringIntervall, this.responseTimeLowerThreshold));
			injections.add(pi3b);
			break;
		default:
			break;
		}

		return injections;
	}

	/**
	 * @see Scenario#notifyAboutSuccess(java.util.List)
	 */
	@Override
	public void notifyAboutSuccess(List<Injection<? extends ArchitecturalElement>> injections) {
		// can be used to adjust the scenario depending on the success of individual
		// injections (trying to be) performed so far.
	}

	/**
	 * @return a random {@link Tenant} of the model.
	 */
	private Tenant selectRandomTenant() {
		List<Tenant> tenants = this.architecture.getTenants();
		if (tenants.size() > 0) {
			int tenantNumber = SimulatorUtil.randInt(0, tenants.size() - 1);
			Tenant tenant = tenants.get(tenantNumber);
			return tenant;
		} else {
			return null;
		}
	}

}
