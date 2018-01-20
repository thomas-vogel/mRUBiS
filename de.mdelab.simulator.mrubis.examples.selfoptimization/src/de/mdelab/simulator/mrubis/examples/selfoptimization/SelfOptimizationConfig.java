package de.mdelab.simulator.mrubis.examples.selfoptimization;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchPackage;
import de.mdelab.simulator.Simulator;
import de.mdelab.simulator.mrubis.MRubisNames;
import de.mdelab.simulator.mrubis.validators.MRubisAvgResponseTimeValidator;
import de.mdelab.simulator.mrubis.validators.MRubisFilterOrderAnalyzer;
import de.mdelab.simulator.mrubis.validators.MRubisFilterTypeValidator;
import de.mdelab.simulator.mrubis.validators.MRubisMinConfigurationValidator;
import de.mdelab.simulator.mrubis.validators.MRubisMissingMonitoredPropertyValidator;
import de.mdelab.simulator.mrubis.validators.MRubisPipeAdaptationValidator;
import de.mdelab.simulator.mrubis.validators.MRubisPipeCycleValidator;
import de.mdelab.simulator.mrubis.validators.MRubisRequiredInterfaceValidator;
import de.mdelab.simulator.validators.ComponentLifeCycleAdaptationValidator;
import de.mdelab.simulator.validators.ComponentStateValidator;
import de.mdelab.simulator.validators.MinConfigurationValidator;
import de.mdelab.simulator.validators.ParameterValidator;
import de.mdelab.simulator.validators.ProvidedInterfaceValidator;

/**
 * Util and simulator configuration methods.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
public class SelfOptimizationConfig {

	/**
	 * Loads a CompArch model from disc.
	 * 
	 * @param uri
	 *            path to the model file
	 * @return the loaded model in terms of its root element, an
	 *         {@link Architecture} object.
	 */
	public static Architecture loadModel(String uri) {
		ComparchPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("comparch", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createURI(uri), true);
		Architecture architecture = (Architecture) resource.getContents().get(0);
		return architecture;
	}

	/**
	 * Creates and adds the validators for the mRUBiS self-optimization case to the
	 * given simulator.
	 * 
	 * @param simulator
	 *            the given simulator
	 * @param responseTimeUpperThreshold
	 *            the upper threshold for the average response time of the
	 *            personalized search
	 * @param responseTimeLowerThreshold
	 *            the lower threshold for the average response time of the
	 *            personalized search
	 * @param responseTimeGoal
	 *            the goal for the average response time of the personalized search
	 * @param performanceMonitoringIntervall
	 *            interval in terms of invocation counts between two performance
	 *            measurements
	 */
	public static void addValidators(Simulator simulator, int responseTimeUpperThreshold,
			int responseTimeLowerThreshold, int responseTimeGoal, int performanceMonitoringIntervall) {
		simulator.addValidator(new ComponentLifeCycleAdaptationValidator());

		// self-optimization validators
		simulator.addValidator(new MRubisMissingMonitoredPropertyValidator());
		simulator.addValidator(new MRubisPipeAdaptationValidator(performanceMonitoringIntervall));

		// simulator.addValidator(new ComponentReplacementValidator());
		simulator.addValidator(new ComponentStateValidator());
		simulator.addValidator(new ProvidedInterfaceValidator(getAllFqInterfaceNames()));
		// simulator.addValidator(new RequiredInterfaceValidator());
		simulator.addValidator(new MRubisRequiredInterfaceValidator());
		simulator.addValidator(new ParameterValidator());
		simulator.addValidator(new MinConfigurationValidator());
		// simulator.addValidator(new ExceptionValidator(exceptionThreshold));
		simulator.addValidator(new MRubisMinConfigurationValidator());

		simulator.addValidator(new MRubisPipeCycleValidator());
		// simulator.addValidator(new MRubisPipeSizeValidator(minPipeSize));
		simulator.addValidator(new MRubisFilterTypeValidator());

		// self-optimization validators
		simulator.addValidator(new MRubisFilterOrderAnalyzer());
		simulator.addValidator(new MRubisAvgResponseTimeValidator(responseTimeUpperThreshold,
				responseTimeLowerThreshold, responseTimeGoal));

	}

	/**
	 * Returns a set of fully qualified interface type names, which are used in
	 * mRUBiS.
	 * 
	 * @return set of fully qualified interface type names, which are used in mRUBiS
	 */
	private static Set<String> getAllFqInterfaceNames() {
		Set<String> allInterfaces = new HashSet<String>();
		allInterfaces.add(MRubisNames.aboutMeService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.viewUserService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.browseRegionService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.userRegistrationService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.browseCategoriesService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.itemRegistrationService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.authenticationService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.bidService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.buyNowService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.inventoryService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.reputationService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.boPersistenceService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.basicQueryService_InterfaceType_FqName);
		allInterfaces.add(MRubisNames.queryService_InterfaceType_FqName);
		return allInterfaces;
	}

}
