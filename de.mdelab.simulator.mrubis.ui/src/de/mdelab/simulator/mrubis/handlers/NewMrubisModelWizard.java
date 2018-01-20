package de.mdelab.simulator.mrubis.handlers;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * Wizard for creating a new mRUBiS model described in the CompArch language.
 * 
 * @author thomas vogel
 * @version 0.1
 *
 */
public class NewMrubisModelWizard extends Wizard implements INewWizard {

	private NewMrubisModelPage newModelPage;
	private ModelParameterPage modelParameterPage;

	@SuppressWarnings("unused")
	private IWorkbench workbench;
	private IStructuredSelection selection;

	public NewMrubisModelWizard() {
		setWindowTitle("New mRUBiS Model");
	}

	@Override
	public void addPages() {
		modelParameterPage = new ModelParameterPage();
		addPage(modelParameterPage);
		newModelPage = new NewMrubisModelPage(selection);
		addPage(newModelPage);
	}

	@Override
	public boolean performFinish() {
		newModelPage.setParameters(modelParameterPage.getNumberOfTenants(),
				modelParameterPage.isPerformanceDataGenerationSelected());
		IFile file = newModelPage.createNewFile();
		// System.out.println("Created file");
		if (file != null)
			return true;
		else
			return false;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
}