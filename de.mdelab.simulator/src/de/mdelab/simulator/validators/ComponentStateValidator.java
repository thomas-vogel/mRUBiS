package de.mdelab.simulator.validators;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorUtil;
import de.mdelab.simulator.Validator;

/**
 * Retrieves all {@link Component}s of all {@link Tenant} architectures ordered
 * by their states (see {@link Component#getState()} and grouped by their
 * {@link Tenant}s.
 * 
 * The validation particularly checks for components in state
 * {@link ComponentState#UNKNOWN}, which indicates that something is wrong with
 * the life cycle of the component. In this case, an issue is raised by the
 * validator.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class ComponentStateValidator implements Validator {

	private final static Logger LOGGER = Logger.getLogger(ComponentStateValidator.class.getName());

	/**
	 * Constructor.
	 */
	public ComponentStateValidator() {

	}

	/**
	 * @see Validator#validate(Architecture)
	 */
	@Override
	public int validate(Architecture architecture) {
		int issueCount = 0;
		for (Tenant tenant : architecture.getTenants()) {
			LOGGER.info("Validating " + SimulatorUtil.elementToString(tenant));

			List<Component> undeployedComponents = new LinkedList<Component>();
			List<Component> deployedComponents = new LinkedList<Component>();
			List<Component> startedComponents = new LinkedList<Component>();
			List<Component> unknownComponents = new LinkedList<Component>();

			for (Component component : tenant.getComponents()) {
				switch (component.getState()) {
				case UNDEPLOYED:
					undeployedComponents.add(component);
					break;
				case DEPLOYED:
					deployedComponents.add(component);
					break;
				case STARTED:
					startedComponents.add(component);
					break;
				case UNKNOWN:
					unknownComponents.add(component);
					break;
				default:
					break;
				}
			}

			StringBuffer msg = new StringBuffer("List of components in state ");

			msg.append("\n\tUNDEPLOYED:\n" + this.listOfComponentsAsString(undeployedComponents));
			msg.append("\n\tDEPLOYED:\n" + this.listOfComponentsAsString(deployedComponents));
			msg.append("\n\tSTARTED:\n" + this.listOfComponentsAsString(startedComponents));
			msg.append("\n\tUNKNOWN:\n" + this.listOfComponentsAsString(unknownComponents));
			LOGGER.finer(msg.toString());

			int numberOfUnknownComponents = unknownComponents.size();
			if (numberOfUnknownComponents > 0) {
				LOGGER.severe("[ISSUES] " + numberOfUnknownComponents + " components are in state UNKNOWN:\n"
						+ this.listOfComponentsAsString(unknownComponents));
			} else {
				LOGGER.info("[OK] " + numberOfUnknownComponents + " component(s) is/are in state UNKNOWN.");
			}
			issueCount += numberOfUnknownComponents;
		}

		return issueCount;
	}

	/**
	 * Returns a String representation of the given list of components.
	 * 
	 * @param components
	 *            the given list of components
	 * @return a String representation of the <code>components</code>.
	 */
	private String listOfComponentsAsString(List<Component> components) {
		StringBuffer s = new StringBuffer();
		if (components.size() > 0) {
			for (Component c : components) {
				s.append("\t- ");
				s.append(SimulatorUtil.elementToString(c));
				s.append("\n");
			}
		} else {
			s.append("\t- None\n");
		}
		return s.toString();
	}

}
