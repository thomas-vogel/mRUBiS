package de.mdelab.simulator.mrubis.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

/**
 * Handler for creating a new mRUBiS model described in the CompArch language.
 * 
 * @author thomas vogel
 * @version 0.1
 * 
 */
public class GenerateModelHandler {

	@Execute
	public void execute(Shell shell) {
		// https://stackoverflow.com/questions/33815822/custom-file-creation-wizard-implementing-inewwizard-throws-npe-when-called-from
		// https://wiki.eclipse.org/FAQ_How_do_I_find_the_active_workbench_page%3F
		// http://blog.eclipse-tips.com/2008/07/how-to-create-new-file-wizard.html

		// System.out.println(shell);
		IWorkbench wb = PlatformUI.getWorkbench();
		
		NewMrubisModelWizard wiz = new NewMrubisModelWizard();
		wiz.init(wb, StructuredSelection.EMPTY);
		WizardDialog wizardDialog = new WizardDialog(shell, wiz);

		if (wizardDialog.open() == Window.OK) {
			// System.out.println("Ok pressed");
		} else {
			// System.out.println("Cancel pressed");
		}
	}
}
