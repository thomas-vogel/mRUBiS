package de.mdelab.simulator.mrubis.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SelfHealingExampleWizard extends AbstractExampleWizard {

	@Override
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		final List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor(Activator.getDefault().getBundle().getSymbolicName(),
				"zips/selfhealingExample.zip", "de.mdelab.simulator.mrubis.examples.selfhealing"));
		return projects;
	}
}
