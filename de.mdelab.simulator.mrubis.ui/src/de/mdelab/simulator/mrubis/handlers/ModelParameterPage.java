package de.mdelab.simulator.mrubis.handlers;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Wizard page or setting the parameters (number of tenants and whether
 * performance data should be included) for the new mRUBiS model described in
 * the CompArch language, which will be generated.
 * 
 * @author thomas vogel
 * @version 0.1
 * 
 */
public class ModelParameterPage extends WizardPage {
	private Text tenants;
	private Button createPerformanceData;
	private Composite container;

	public ModelParameterPage() {
		super("Model Parameters");
		setTitle("Model Parameters");
		setDescription("Set the parameters for the mRUBiS model to be generated.");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		Label tenantLabel = new Label(container, SWT.NONE);
		tenantLabel.setText("Number of tenants (int value):");

		tenants = new Text(container, SWT.BORDER | SWT.SINGLE);
		tenants.setText("1");
		tenants.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (!tenants.getText().isEmpty()) {
					try {
						int numberOfTenants = Integer.parseInt(tenants.getText());
						setPageComplete(numberOfTenants > 0);
					} catch (Exception ex) {
						setPageComplete(false);
					}

				}
			}

		});
		Label labelCheck = new Label(container, SWT.NONE);
		labelCheck.setText("Include performance data?");
		createPerformanceData = new Button(container, SWT.CHECK);
		createPerformanceData.setSelection(false);

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		tenants.setLayoutData(gd);
		// required to avoid an error in the system
		setControl(container);
		setPageComplete(true);
	}

	public int getNumberOfTenants() {
		return Integer.parseInt(this.tenants.getText());
	}

	public boolean isPerformanceDataGenerationSelected() {
		return this.createPerformanceData.getSelection();
	}
}
