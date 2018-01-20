package de.mdelab.simulator.mrubis.handlers;

import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import de.mdelab.simulator.mrubis.genmodel.CompArchMRubisModelCreator;

/**
 * Wizard for creating a new file.
 * 
 * @author thomas vogel
 * @version 0.1
 *
 */
public class NewMrubisModelPage extends WizardNewFileCreationPage {

	private int numberOfTenants;
	private boolean createPerformanceData = false;

	public NewMrubisModelPage(IStructuredSelection selection) {
		super("Create a new CompArch model", selection);
		setTitle("Create a new CompArch model");
		setDescription("Choose the folder and specify the file for the new CompArch model.");
		setFileExtension("comparch");
		setFileName("NEW_MODEL");
	}

	@Override
	protected InputStream getInitialContents() {
		// System.out.println("Create contents with " + this.numberOfTenants + "
		// tenants.");
		CompArchMRubisModelCreator creator = new CompArchMRubisModelCreator();
		return creator.createModelAsInputStream(this.numberOfTenants, this.createPerformanceData);
	}

	void setParameters(int numberOfTenants, boolean createPerformanceData) {
		this.numberOfTenants = numberOfTenants;
		this.createPerformanceData = createPerformanceData;
	}
}
