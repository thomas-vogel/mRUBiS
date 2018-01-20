package de.mdelab.simulator.mrubis.examples.selfhealing;

import java.util.LinkedList;
import java.util.List;

import de.mdelab.comparch.ArchitecturalElement;
import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.Injection;
import de.mdelab.simulator.Scenario;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.mrubis.MRubisNames;
import de.mdelab.simulator.mrubis.injectors.CF1_Injector;
import de.mdelab.simulator.mrubis.injectors.CF2_Injector;
import de.mdelab.simulator.mrubis.injectors.CF3_Injector;
import de.mdelab.simulator.mrubis.injectors.CF5_Injector;

/**
 * A scenario for simulating the mRUBiS self-healing case. This scenario injects
 * one critical failure (CF) in each simulation round. It repeats the injection
 * of a CF1, CF2, CF3, and CF5, then starting again with CF1.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class SelfHealingScenario implements Scenario {

	private Architecture architecture;
	private int exceptionThreshold;

	/**
	 * Creates the self-healing scenario.
	 * 
	 * @param architecture
	 *            the root element of the model
	 * @param exceptionThreshold
	 *            the threshold for the number of exceptions that causes a CF2.
	 */
	public SelfHealingScenario(Architecture architecture, int exceptionThreshold) {
		this.architecture = architecture;
		this.exceptionThreshold = exceptionThreshold;
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
			Injection<Component> cf1 = new Injection<Component>(this.selectRandomComponent(), new CF1_Injector());
			injections.add(cf1);
			break;
		case 2:
			Injection<ProvidedInterface> cf2 = new Injection<ProvidedInterface>(
					this.selectRandomUsedProvidedInterface(), new CF2_Injector(this.exceptionThreshold));
			injections.add(cf2);
			break;
		case 3:
			Injection<Component> cf3 = new Injection<Component>(this.selectRandomComponent(), new CF3_Injector());
			injections.add(cf3);
			break;
		case 4:
			Injection<Connector> cf5 = new Injection<Connector>(this.selectRandomConnector(), new CF5_Injector());
			injections.add(cf5);
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
	 * @return a random {@link Component} of the model but no filter component
	 *         (i.e., a component providing an interface of type
	 *         {@link MRubisNames#availabilityItemFilter_ComponentType_Name}).
	 */
	private Component selectRandomComponent() {
		Tenant tenant = this.selectRandomTenant();
		if (tenant != null) {
			int tries = 0;
			Component component = null;
			while (component == null && tries < 50) {
				int componentNumber = SimulatorUtil.randInt(0, tenant.getComponents().size() - 1);
				component = tenant.getComponents().get(componentNumber);
				for (ProvidedInterface providedInterface : component.getProvidedInterfaces()) {
					if (providedInterface.getType().getFqName()
							.equals(MRubisNames.itemFilterService_InterfaceType_FqName)) {
						component = null;
						break;
					}
				}
			}
			return component;
		} else {
			return null;
		}
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

	/**
	 * @return a random {@link ProvidedInterface} of the model, which is used by a
	 *         required interface though a connector.
	 */
	private ProvidedInterface selectRandomUsedProvidedInterface() {
		List<ProvidedInterface> usedInterfaces = new LinkedList<ProvidedInterface>();
		int tries = 0;

		while (usedInterfaces.size() == 0 || tries < 50) {
			tries++;
			Component component = this.selectRandomComponent();
			if (component != null) {
				for (ProvidedInterface pi : component.getProvidedInterfaces()) {
					if (pi.getConnectors().size() > 0) {
						usedInterfaces.add(pi);
					}
				}
			} else {
				break;
			}
		}
		if (usedInterfaces.size() > 0) {
			return usedInterfaces.get(SimulatorUtil.randInt(0, usedInterfaces.size() - 1));
		} else {
			return null;
		}
	}

	/**
	 * @return a random {@link Connector} of the model that wires a required and a
	 *         provided interface.
	 */
	private Connector selectRandomConnector() {
		Connector connector = null;
		int tries = 0;
		while (connector == null || tries > 25) {
			tries++;
			Component component = this.selectRandomComponent();
			if (component != null) {
				for (RequiredInterface ri : component.getRequiredInterfaces()) {
					Connector c = ri.getConnector();
					if (c != null && c.getTarget() != null) {
						connector = c;
						break;
					}
				}
			} else {
				break;
			}
		}
		return connector;
	}

}
