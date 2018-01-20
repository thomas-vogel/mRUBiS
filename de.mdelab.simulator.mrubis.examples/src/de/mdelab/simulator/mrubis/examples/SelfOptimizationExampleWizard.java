package de.mdelab.simulator.mrubis.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SelfOptimizationExampleWizard extends AbstractExampleWizard {

	@Override
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		final List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor(Activator.getDefault().getBundle().getSymbolicName(),
				"zips/selfoptimizationExample.zip", "de.mdelab.simulator.mrubis.examples.selfoptimization"));
		return projects;
	}
}
