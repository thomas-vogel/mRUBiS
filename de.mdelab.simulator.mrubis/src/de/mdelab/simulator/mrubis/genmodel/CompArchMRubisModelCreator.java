package de.mdelab.simulator.mrubis.genmodel;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import de.hpi.sam.rubis.authservice.AuthenticationService;
import de.hpi.sam.rubis.bidandbuy.BidService;
import de.hpi.sam.rubis.bidandbuy.BuyNowService;
import de.hpi.sam.rubis.filter.ItemFilter;
import de.hpi.sam.rubis.inventorymgmt.InventoryService;
import de.hpi.sam.rubis.itemmgmt.BrowseCategoriesService;
import de.hpi.sam.rubis.itemmgmt.ItemRegistrationService;
import de.hpi.sam.rubis.persistenceservice.BusinessObjectsPersistenceService;
import de.hpi.sam.rubis.queryservice.BasicQueryService;
import de.hpi.sam.rubis.queryservice.QueryService;
import de.hpi.sam.rubis.reputationservice.ReputationService;
import de.hpi.sam.rubis.usermgmt.AboutMeService;
import de.hpi.sam.rubis.usermgmt.BrowseRegionsService;
import de.hpi.sam.rubis.usermgmt.UserRegistrationService;
import de.hpi.sam.rubis.usermgmt.ViewUserInfoService;
import de.mdelab.comparch.Annotations;
import de.mdelab.comparch.Architecture;
import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.ComponentState;
import de.mdelab.comparch.ComponentType;
import de.mdelab.comparch.Connector;
import de.mdelab.comparch.Interface;
import de.mdelab.comparch.InterfaceType;
import de.mdelab.comparch.MethodSpecification;
import de.mdelab.comparch.ParameterType;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.RequiredInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Generates a model describing mRUBiS. The model conforms to the CompArch
 * metamodel. The generation of the model is parameterized by the number of
 * {@link Tenant}s and whether performance data should be generated and included
 * in the model.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public class CompArchMRubisModelCreator {

	private boolean ADD_FACEBOOK_AHTENTICATION = true;
	private boolean ADD_GOOGLE_AUTHENTICATION = true;
	private boolean ADD_TWITTER_AHTENTICATION = true;

	/**
	 * Constructor.
	 */
	public CompArchMRubisModelCreator() {
		super();
	}

	/**
	 * Generates the mRUBiS model.
	 * 
	 * @param numberOfTenants
	 *            the number of tenants to be generated in the model
	 * @param createPerformanceStats
	 *            whether performance data should be generated and included in the
	 *            model
	 * @return input stream to which the generated model is written as as a
	 *         {@link org.eclipse.emf.ecore.resource.Resource}.
	 */
	public InputStream createModelAsInputStream(int numberOfTenants, boolean createPerformanceStats) {
		Architecture architecture = this.createModel(numberOfTenants, createPerformanceStats);
		XMIResource modelResource = new XMIResourceImpl();
		modelResource.getContents().add(architecture);
		modelResource.setEncoding("UTF-8");

		StringWriter stringWriter = new StringWriter();
		try {
			URIConverter.WriteableOutputStream s = new URIConverter.WriteableOutputStream(stringWriter,
					modelResource.getEncoding());
			modelResource.save(s, null);
			// String result = stringWriter.getBuffer().toString();
			// System.out.println(result);
			return new ByteArrayInputStream(stringWriter.getBuffer().toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * Generates the mRUBiS model.
	 * 
	 * @param numberOfTenants
	 *            the number of tenants to be generated in the model
	 * @param createPerformanceStats
	 *            whether performance data should be generated and included in the
	 *            model
	 * @return the generated model in terms of its root object.
	 */
	public Architecture createModel(int numberOfTenants, boolean createPerformanceStats) {
		// generate model
		Architecture architecture = this.generateModel(numberOfTenants, createPerformanceStats);
		// create and set Annotations element
		Annotations annotations = ComparchFactory.eINSTANCE.createAnnotations();
		architecture.setAnnotations(annotations);
		return architecture;
	}

	/**
	 * Generates the mRUBiS model.
	 * 
	 * @param numberOfTenants
	 *            the number of tenants to be generated in the model
	 * @param createPerformanceStats
	 *            whether performance data should be generated and included in the
	 *            model
	 * @return the generated model in terms of its root object.
	 */
	private Architecture generateModel(int numberOfTenants, boolean createPerformanceStats) {
		Architecture architecture = ComparchFactory.eINSTANCE.createArchitecture();
		architecture.setName("mRUBiS");

		createInterfaceTypes(architecture);
		createComponentTypes(architecture);

		if (this.ADD_FACEBOOK_AHTENTICATION) {
			createExternalAuthenticationServiceComponentType(architecture,
					externalFacebookAuthenticationSerivce_ComponentType, "Facebook Authentication Service",
					"http://localhost:8080/FacebookAuthenticationService/FbAuthenticationServiceImpl?wsdl",
					"http://authentication.facebook.com/", "FacebookAuthenticationService");
		}
		if (this.ADD_GOOGLE_AUTHENTICATION) {
			createExternalAuthenticationServiceComponentType(architecture,
					externalGoogleAuthenticationSerivce_ComponentType, "Google Authentication Service",
					"http://localhost:8080/GoogleAuthenticationService/GoogleAuthenticationServiceImpl?wsdl",
					"http://authentication.google.com/", "GoogleAuthenticationService");
		}

		if (this.ADD_TWITTER_AHTENTICATION) {
			createExternalAuthenticationServiceComponentType(architecture,
					externalTwitterAuthenticationSerivce_ComponentType, "Twitter Authentication Service",
					"http://localhost:8080/TwitterAuthenticationService/TwitterAuthenticationServiceImpl?wsdl",
					"http://authentication.twitter.com/", "TwitterAuthenticationService");
		}

		// generate and add performance data
		boolean flag = true;
		double scale = 1.00;
		for (int i = 0; i < numberOfTenants; i++) {
			Tenant tenant = instantiateTenant(architecture, "mRUBiS Tenant #" + (i + 1));
			if (createPerformanceStats) {
				CompArchPerformanceDataGenerator generator = new CompArchPerformanceDataGenerator(scale);
				generator.generateAndAddPerformanceStats(tenant);
				if (flag) {
					// next run uses statistics scaled up by 5 %.
					scale = scale * 1.05;
					flag = false;
				} else {
					// next run uses statistics scaled down by 5 %.
					scale = scale * 0.95;
					flag = true;
				}
			}
		}

		return architecture;
	}

	private static Random reliabilityRandom = new Random();

	private double randomReliability() {
		int min = 8000;
		int max = 9999;
		int randomNum = reliabilityRandom.nextInt((max - min) + 1) + min;
		double r = randomNum / 10000.0;
		return r;
	}

	private static Random criticalityRandom = new Random();

	private double randomCriticality() {
		int min = 1000;
		int max = 10000;
		int randomNum = criticalityRandom.nextInt((max - min) + 1) + min;
		double r = randomNum / 10000.0;
		return r;
	}

	/*
	 * ========================================================
	 */
	/*
	 * InterfaceTypes
	 */

	private InterfaceType authenticationService_InterfaceType, bidService_InterfaceType, buyNowService_InterfaceType,
			itemFilter_InterfaceType, inventoryService_InterfaceType, browseCategoriesService_InterfaceType,
			itemRegistrationService_InterfaceType, businessObjectsPersistenceService_InterfaceType,
			basicQueryService_InterfaceType, queryService_InterfaceType, reputationService_InterfaceType,
			aboutMeService_InterfaceType, browseRegionService_InterfaceType, userRegistrationService_InterfaceType,
			viewUserInfoService_InterfaceType;

	private void createInterfaceTypes(Architecture architecture) {
		authenticationService_InterfaceType = createAndAddInterfaceType(AuthenticationService.class, architecture);
		bidService_InterfaceType = createAndAddInterfaceType(BidService.class, architecture);
		buyNowService_InterfaceType = createAndAddInterfaceType(BuyNowService.class, architecture);
		itemFilter_InterfaceType = createAndAddInterfaceType(ItemFilter.class, architecture);
		inventoryService_InterfaceType = createAndAddInterfaceType(InventoryService.class, architecture);
		browseCategoriesService_InterfaceType = createAndAddInterfaceType(BrowseCategoriesService.class, architecture);
		itemRegistrationService_InterfaceType = createAndAddInterfaceType(ItemRegistrationService.class, architecture);
		businessObjectsPersistenceService_InterfaceType = createAndAddInterfaceType(
				BusinessObjectsPersistenceService.class, architecture);
		queryService_InterfaceType = createAndAddInterfaceType(QueryService.class, architecture);
		basicQueryService_InterfaceType = createAndAddInterfaceType(BasicQueryService.class, architecture);
		reputationService_InterfaceType = createAndAddInterfaceType(ReputationService.class, architecture);
		aboutMeService_InterfaceType = createAndAddInterfaceType(AboutMeService.class, architecture);
		browseRegionService_InterfaceType = createAndAddInterfaceType(BrowseRegionsService.class, architecture);
		userRegistrationService_InterfaceType = createAndAddInterfaceType(UserRegistrationService.class, architecture);
		viewUserInfoService_InterfaceType = createAndAddInterfaceType(ViewUserInfoService.class, architecture);
	}

	private InterfaceType createAndAddInterfaceType(Class<?> interfaceClass, Architecture architecture) {
		InterfaceType interfaceType = ComparchFactory.eINSTANCE.createInterfaceType();
		interfaceType.setFqName(interfaceClass.getCanonicalName());
		for (Method method : interfaceClass.getMethods()) {
			MethodSpecification methodSpecification = ComparchFactory.eINSTANCE.createMethodSpecification();
			String signature = method.getName() + "(";
			boolean hasParams = method.getParameterTypes().length > 0;
			for (Class<?> paramType : method.getParameterTypes()) {
				signature = signature + paramType.getCanonicalName() + ",";
			}
			if (hasParams) {
				signature = signature.substring(0, signature.length() - 1);
			}
			signature = signature + ")";
			methodSpecification.setSignature(signature);
			interfaceType.getMethodSpecifications().add(methodSpecification);
		}
		architecture.getInterfaceTypes().add(interfaceType);
		return interfaceType;
	}

	/*
	 * ========================================================
	 */
	/*
	 * ComponentTypes
	 */

	private ComponentType userManagementService_ComponentType, itemManagementService_ComponentType,
			authenticationService_ComponentType, bidAndBuyService_ComponentType, inventoryService_ComponentType,
			reputationService_ComponentType, persistenceService_ComponentType, queryService_ComponentType,
			lastSecondSalesItemFilter_ComponentType, pastSalesItemFilter_ComponentType, buyNowItemFilter_ComponentType,
			availabilityItemFilter_ComponentType, regionItemFilter_ComponentType,
			sellerReputationItemFilter_ComponentType, commentItemFilter_ComponentType, categoryItemFilter_ComponentType,
			recommendationItemFilter_ComponentType, futureSalesItemFilter_ComponentType;
	private ComponentType externalFacebookAuthenticationSerivce_ComponentType;
	private ComponentType externalGoogleAuthenticationSerivce_ComponentType;
	private ComponentType externalTwitterAuthenticationSerivce_ComponentType;

	private void createComponentTypes(Architecture architecture) {
		userManagementService_ComponentType = createComponentTypeWithName(
				MRubisNames.userManagementService_ComponentType_Name, architecture);
		userManagementService_ComponentType.getProvidedInterfaceTypes().add(aboutMeService_InterfaceType);
		userManagementService_ComponentType.getProvidedInterfaceTypes().add(browseRegionService_InterfaceType);
		userManagementService_ComponentType.getProvidedInterfaceTypes().add(userRegistrationService_InterfaceType);
		userManagementService_ComponentType.getProvidedInterfaceTypes().add(viewUserInfoService_InterfaceType);
		userManagementService_ComponentType.getRequiredInterfaceTypes().add(authenticationService_InterfaceType);
		userManagementService_ComponentType.getRequiredInterfaceTypes().add(queryService_InterfaceType);
		userManagementService_ComponentType.getRequiredInterfaceTypes().add(basicQueryService_InterfaceType);
		userManagementService_ComponentType.getRequiredInterfaceTypes()
				.add(businessObjectsPersistenceService_InterfaceType);
		ParameterType privacyLevel_parameterType = createParameterType("privacy-level", String.class.getCanonicalName(),
				"LOW");
		userManagementService_ComponentType.getParameterTypes().add(privacyLevel_parameterType);

		itemManagementService_ComponentType = createComponentTypeWithName(
				MRubisNames.itemManagementService_ComponentType_Name, architecture);
		itemManagementService_ComponentType.getProvidedInterfaceTypes().add(browseCategoriesService_InterfaceType);
		itemManagementService_ComponentType.getProvidedInterfaceTypes().add(itemRegistrationService_InterfaceType);
		itemManagementService_ComponentType.getRequiredInterfaceTypes().add(basicQueryService_InterfaceType);
		itemManagementService_ComponentType.getRequiredInterfaceTypes().add(queryService_InterfaceType);
		itemManagementService_ComponentType.getRequiredInterfaceTypes().add(authenticationService_InterfaceType);
		itemManagementService_ComponentType.getRequiredInterfaceTypes()
				.add(businessObjectsPersistenceService_InterfaceType);

		authenticationService_ComponentType = createComponentTypeWithName(
				MRubisNames.authenticationService_ComponentType_Name, architecture);
		authenticationService_ComponentType.getProvidedInterfaceTypes().add(authenticationService_InterfaceType);
		authenticationService_ComponentType.getRequiredInterfaceTypes().add(basicQueryService_InterfaceType);

		bidAndBuyService_ComponentType = createComponentTypeWithName(MRubisNames.bidAndBuyService_ComponentType_Name,
				architecture);
		bidAndBuyService_ComponentType.getProvidedInterfaceTypes().add(bidService_InterfaceType);
		bidAndBuyService_ComponentType.getProvidedInterfaceTypes().add(buyNowService_InterfaceType);
		bidAndBuyService_ComponentType.getRequiredInterfaceTypes().add(basicQueryService_InterfaceType);
		bidAndBuyService_ComponentType.getRequiredInterfaceTypes().add(queryService_InterfaceType);
		bidAndBuyService_ComponentType.getRequiredInterfaceTypes().add(authenticationService_InterfaceType);
		bidAndBuyService_ComponentType.getRequiredInterfaceTypes().add(inventoryService_InterfaceType);
		bidAndBuyService_ComponentType.getRequiredInterfaceTypes().add(businessObjectsPersistenceService_InterfaceType);

		inventoryService_ComponentType = createComponentTypeWithName(MRubisNames.inventoryService_ComponentType_Name,
				architecture);
		inventoryService_ComponentType.getProvidedInterfaceTypes().add(inventoryService_InterfaceType);
		inventoryService_ComponentType.getRequiredInterfaceTypes().add(queryService_InterfaceType);
		inventoryService_ComponentType.getRequiredInterfaceTypes().add(businessObjectsPersistenceService_InterfaceType);

		reputationService_ComponentType = createComponentTypeWithName(MRubisNames.reputationService_ComponentType_Name,
				architecture);
		reputationService_ComponentType.getProvidedInterfaceTypes().add(reputationService_InterfaceType);
		reputationService_ComponentType.getRequiredInterfaceTypes().add(basicQueryService_InterfaceType);
		reputationService_ComponentType.getRequiredInterfaceTypes().add(queryService_InterfaceType);
		reputationService_ComponentType.getRequiredInterfaceTypes().add(authenticationService_InterfaceType);
		reputationService_ComponentType.getRequiredInterfaceTypes()
				.add(businessObjectsPersistenceService_InterfaceType);

		persistenceService_ComponentType = createComponentTypeWithName(
				MRubisNames.persistenceService_ComponentType_Name, architecture);
		persistenceService_ComponentType.getProvidedInterfaceTypes()
				.add(businessObjectsPersistenceService_InterfaceType);

		queryService_ComponentType = createComponentTypeWithName(MRubisNames.queryService_ComponentType_Name,
				architecture);
		queryService_ComponentType.getProvidedInterfaceTypes().add(basicQueryService_InterfaceType);
		queryService_ComponentType.getProvidedInterfaceTypes().add(queryService_InterfaceType);
		queryService_ComponentType.getRequiredInterfaceTypes().add(itemFilter_InterfaceType);

		lastSecondSalesItemFilter_ComponentType = createItemFilterComponentTypeWithName(
				MRubisNames.lastSecondSalesItemFilter_ComponentType_Name, architecture);
		ParameterType lastSeconds_ParameterType = createParameterType("last-seconds", Integer.class.getCanonicalName(),
				"300");
		lastSecondSalesItemFilter_ComponentType.getParameterTypes().add(lastSeconds_ParameterType);

		pastSalesItemFilter_ComponentType = createItemFilterComponentTypeWithName(
				MRubisNames.pastSalesItemFilter_ComponentType_Name, architecture);

		buyNowItemFilter_ComponentType = createItemFilterComponentTypeWithName(
				MRubisNames.buyNowItemFilter_ComponentType_Name, architecture);

		availabilityItemFilter_ComponentType = createItemFilterComponentTypeWithName(
				MRubisNames.availabilityItemFilter_ComponentType_Name, architecture);

		regionItemFilter_ComponentType = createItemFilterComponentTypeWithName(
				MRubisNames.regionItemFilter_ComponentType_Name, architecture);

		sellerReputationItemFilter_ComponentType = createItemFilterComponentTypeWithName(
				MRubisNames.sellerReputationItemFilter_ComponentType_Name, architecture);
		ParameterType reputationThreshold_ParameterType = createParameterType("reputation-threshold",
				Integer.class.getCanonicalName(), "5");
		sellerReputationItemFilter_ComponentType.getParameterTypes().add(reputationThreshold_ParameterType);

		commentItemFilter_ComponentType = createItemFilterComponentTypeWithName(
				MRubisNames.commentItemFilter_ComponentType_Name, architecture);
		ParameterType ratingThreshold_ParameterType = createParameterType("rating-threshold",
				Integer.class.getCanonicalName(), "5");
		commentItemFilter_ComponentType.getParameterTypes().add(ratingThreshold_ParameterType);

		categoryItemFilter_ComponentType = createItemFilterComponentTypeWithName(
				MRubisNames.categoryItemFilter_ComponentType_Name, architecture);
		ParameterType filteredCategories_ParameterType = createParameterType("filtered-categories",
				String.class.getCanonicalName(), "Coins,Jewelry");
		categoryItemFilter_ComponentType.getParameterTypes().add(filteredCategories_ParameterType);

		recommendationItemFilter_ComponentType = createItemFilterComponentTypeWithName(
				MRubisNames.recommendationItemFilter_ComponentType_Name, architecture);

		futureSalesItemFilter_ComponentType = createItemFilterComponentTypeWithName(
				MRubisNames.futureSalesItemFilter_ComponentType_Name, architecture);
		ParameterType daysToRun_ParameterType = createParameterType("days-to-run", Integer.class.getCanonicalName(),
				"14");
		futureSalesItemFilter_ComponentType.getParameterTypes().add(daysToRun_ParameterType);
	}

	private void createExternalAuthenticationServiceComponentType(Architecture architecture,
			ComponentType componentType, String componentTypeName, String serviceURI_Value, String serviceNS_Value,
			String serviceNsLocalPartName_Value) {
		componentType = createComponentTypeWithName(componentTypeName, architecture);
		componentType.getProvidedInterfaceTypes().add(authenticationService_InterfaceType);
		componentType.getRequiredInterfaceTypes().add(basicQueryService_InterfaceType);
		ParameterType serviceURI = createParameterType("ServiceURI", String.class.getCanonicalName(), serviceURI_Value);
		componentType.getParameterTypes().add(serviceURI);
		ParameterType serviceNS = createParameterType("ServiceNS", String.class.getCanonicalName(), serviceNS_Value);
		componentType.getParameterTypes().add(serviceNS);
		ParameterType serviceNsLocalPartName = createParameterType("ServiceNsLocalPartName",
				String.class.getCanonicalName(), serviceNsLocalPartName_Value);
		componentType.getParameterTypes().add(serviceNsLocalPartName);
	}

	private ComponentType createItemFilterComponentTypeWithName(String name, Architecture architecture) {
		ComponentType itemFilter_ComponentType = createComponentTypeWithName(name, architecture);
		itemFilter_ComponentType.getProvidedInterfaceTypes().add(itemFilter_InterfaceType);
		itemFilter_ComponentType.getRequiredInterfaceTypes().add(itemFilter_InterfaceType);
		return itemFilter_ComponentType;
	}

	private ComponentType createComponentTypeWithName(String name, Architecture architecture) {
		ComponentType componentType = ComparchFactory.eINSTANCE.createComponentType();
		componentType.setName(name);
		// set reliability
		componentType.setReliability(this.randomReliability());
		// set criticality
		componentType.setCriticality(this.randomCriticality());
		architecture.getComponentTypes().add(componentType);
		return componentType;
	}

	private ParameterType createParameterType(String name, String type, String defaultValue) {
		ParameterType parameterType = ComparchFactory.eINSTANCE.createParameterType();
		parameterType.setName(name);
		parameterType.setType(type);
		parameterType.setDefaultValue(defaultValue);
		return parameterType;
	}

	/*
	 * ========================================================
	 */
	/*
	 * Components
	 */
	@SuppressWarnings("unused")
	private Tenant instantiateTenant(Architecture architecture, String tenantName) {
		Tenant tenant = ComparchFactory.eINSTANCE.createTenant();
		tenant.setName(tenantName);
		tenant.setArchitecture(architecture);

		List<Component> components = new ArrayList<Component>(18);
		Component userManagementService_Component = userManagementService_ComponentType.instantiate();
		components.add(userManagementService_Component);
		ProvidedInterface userManagementService__aboutMeService_ProvInt = getInterfaceOfType(
				userManagementService_Component.getProvidedInterfaces(), aboutMeService_InterfaceType);
		ProvidedInterface userManagementService__viewUserInfoService_ProvInt = getInterfaceOfType(
				userManagementService_Component.getProvidedInterfaces(), viewUserInfoService_InterfaceType);
		ProvidedInterface userManagementService__browseRegionsService_ProvInt = getInterfaceOfType(
				userManagementService_Component.getProvidedInterfaces(), browseRegionService_InterfaceType);
		ProvidedInterface userManagementService__userRegistrationService_ProvInt = getInterfaceOfType(
				userManagementService_Component.getProvidedInterfaces(), userRegistrationService_InterfaceType);
		RequiredInterface userManagementService__basicQueryService_ReqInt = getInterfaceOfType(
				userManagementService_Component.getRequiredInterfaces(), basicQueryService_InterfaceType);
		RequiredInterface userManagementService__queryService_ReqInt = getInterfaceOfType(
				userManagementService_Component.getRequiredInterfaces(), queryService_InterfaceType);
		RequiredInterface userManagementService__authenticationService_ReqInt = getInterfaceOfType(
				userManagementService_Component.getRequiredInterfaces(), authenticationService_InterfaceType);
		RequiredInterface userManagementService__businessObjectPersistenceService_ReqInt = getInterfaceOfType(
				userManagementService_Component.getRequiredInterfaces(),
				businessObjectsPersistenceService_InterfaceType);

		Component itemManagementService_Component = itemManagementService_ComponentType.instantiate();
		components.add(itemManagementService_Component);
		ProvidedInterface itemManagementService__browseCategoriesService_ProvInt = getInterfaceOfType(
				itemManagementService_Component.getProvidedInterfaces(), browseCategoriesService_InterfaceType);
		ProvidedInterface itemManagementService__itemRegistrationService_ProvInt = getInterfaceOfType(
				itemManagementService_Component.getProvidedInterfaces(), itemRegistrationService_InterfaceType);
		RequiredInterface itemManagementService__basicQueryService_ReqInt = getInterfaceOfType(
				itemManagementService_Component.getRequiredInterfaces(), basicQueryService_InterfaceType);
		RequiredInterface itemManagementService__queryService_ReqInt = getInterfaceOfType(
				itemManagementService_Component.getRequiredInterfaces(), queryService_InterfaceType);
		RequiredInterface itemManagementService__authenticationService_ReqInt = getInterfaceOfType(
				itemManagementService_Component.getRequiredInterfaces(), authenticationService_InterfaceType);
		RequiredInterface itemManagementService__businessObjectPersistenceService_ReqInt = getInterfaceOfType(
				itemManagementService_Component.getRequiredInterfaces(),
				businessObjectsPersistenceService_InterfaceType);

		Component authenticationService_Component = authenticationService_ComponentType.instantiate();
		components.add(authenticationService_Component);
		ProvidedInterface authenticationService__authenticationService_ProvInt = getInterfaceOfType(
				authenticationService_Component.getProvidedInterfaces(), authenticationService_InterfaceType);
		RequiredInterface authenticationService__basicQueryService_ReqInt = getInterfaceOfType(
				authenticationService_Component.getRequiredInterfaces(), basicQueryService_InterfaceType);

		Component bidAndBuyService_Component = bidAndBuyService_ComponentType.instantiate();
		components.add(bidAndBuyService_Component);
		ProvidedInterface bidAndBuyService__bidService_ProvInt = getInterfaceOfType(
				bidAndBuyService_Component.getProvidedInterfaces(), bidService_InterfaceType);
		ProvidedInterface bidAndBuyService__buyNowService_ProvInt = getInterfaceOfType(
				bidAndBuyService_Component.getProvidedInterfaces(), buyNowService_InterfaceType);
		RequiredInterface bidAndBuyService__basicQueryService_ReqInt = getInterfaceOfType(
				bidAndBuyService_Component.getRequiredInterfaces(), basicQueryService_InterfaceType);
		RequiredInterface bidAndBuyService__queryService_ReqInt = getInterfaceOfType(
				bidAndBuyService_Component.getRequiredInterfaces(), queryService_InterfaceType);
		RequiredInterface bidAndBuyService__authenticationService_ReqInt = getInterfaceOfType(
				bidAndBuyService_Component.getRequiredInterfaces(), authenticationService_InterfaceType);
		RequiredInterface bidAndBuyService__businessObjectPersistenceService_ReqInt = getInterfaceOfType(
				bidAndBuyService_Component.getRequiredInterfaces(), businessObjectsPersistenceService_InterfaceType);
		RequiredInterface bidAndBuyService__inventoryService_ReqInt = getInterfaceOfType(
				bidAndBuyService_Component.getRequiredInterfaces(), inventoryService_InterfaceType);

		Component inventoryService_Component = inventoryService_ComponentType.instantiate();
		components.add(inventoryService_Component);
		ProvidedInterface inventoryService__inventoryService_ProvInt = getInterfaceOfType(
				inventoryService_Component.getProvidedInterfaces(), inventoryService_InterfaceType);
		RequiredInterface inventoryService__businessObjectPersistenceService_ReqInt = getInterfaceOfType(
				inventoryService_Component.getRequiredInterfaces(), businessObjectsPersistenceService_InterfaceType);
		RequiredInterface inventoryService__queryService_ReqInt = getInterfaceOfType(
				inventoryService_Component.getRequiredInterfaces(), queryService_InterfaceType);

		Component reputationService_Component = reputationService_ComponentType.instantiate();
		components.add(reputationService_Component);
		ProvidedInterface reputationService__reputationService_ProvInt = getInterfaceOfType(
				reputationService_Component.getProvidedInterfaces(), reputationService_InterfaceType);
		RequiredInterface reputationService__queryService_ReqInt = getInterfaceOfType(
				reputationService_Component.getRequiredInterfaces(), queryService_InterfaceType);
		RequiredInterface reputationService__basicQueryService_ReqInt = getInterfaceOfType(
				reputationService_Component.getRequiredInterfaces(), basicQueryService_InterfaceType);
		RequiredInterface reputationService__authenticationService_ReqInt = getInterfaceOfType(
				reputationService_Component.getRequiredInterfaces(), authenticationService_InterfaceType);
		RequiredInterface reputationService__businessObjectPersistenceService_ReqInt = getInterfaceOfType(
				reputationService_Component.getRequiredInterfaces(), businessObjectsPersistenceService_InterfaceType);

		Component persistenceService_Component = persistenceService_ComponentType.instantiate();
		components.add(persistenceService_Component);
		ProvidedInterface persistenceService__businessObjectPersistenceService_ProvInt = getInterfaceOfType(
				persistenceService_Component.getProvidedInterfaces(), businessObjectsPersistenceService_InterfaceType);

		Component queryService_Component = queryService_ComponentType.instantiate();
		components.add(queryService_Component);
		ProvidedInterface queryService__basicQueryService_ProvInt = getInterfaceOfType(
				queryService_Component.getProvidedInterfaces(), basicQueryService_InterfaceType);
		ProvidedInterface queryService__queryService_ProvInt = getInterfaceOfType(
				queryService_Component.getProvidedInterfaces(), queryService_InterfaceType);
		RequiredInterface queryService__itemFilter_ReqInt = getInterfaceOfType(
				queryService_Component.getRequiredInterfaces(), itemFilter_InterfaceType);

		Component lastSecondSalesItemFilter_Component = lastSecondSalesItemFilter_ComponentType.instantiate();
		components.add(lastSecondSalesItemFilter_Component);
		ProvidedInterface lastSecondSalesItemFilter__itemFilter_ProvInt = getInterfaceOfType(
				lastSecondSalesItemFilter_Component.getProvidedInterfaces(), itemFilter_InterfaceType);
		RequiredInterface lastSecondSalesItemFilter__itemFilter_ReqInt = getInterfaceOfType(
				lastSecondSalesItemFilter_Component.getRequiredInterfaces(), itemFilter_InterfaceType);

		Component pastSalesItemFilter_Component = pastSalesItemFilter_ComponentType.instantiate();
		components.add(pastSalesItemFilter_Component);
		ProvidedInterface pastSalesItemFilter__itemFilter_ProvInt = getInterfaceOfType(
				pastSalesItemFilter_Component.getProvidedInterfaces(), itemFilter_InterfaceType);
		RequiredInterface pastSalesItemFilter__itemFilter_ReqInt = getInterfaceOfType(
				pastSalesItemFilter_Component.getRequiredInterfaces(), itemFilter_InterfaceType);

		Component buyNowItemFilter_Component = buyNowItemFilter_ComponentType.instantiate();
		components.add(buyNowItemFilter_Component);
		ProvidedInterface buyNowItemFilter__itemFilter_ProvInt = getInterfaceOfType(
				buyNowItemFilter_Component.getProvidedInterfaces(), itemFilter_InterfaceType);
		RequiredInterface buyNowItemFilter__itemFilter_ReqInt = getInterfaceOfType(
				buyNowItemFilter_Component.getRequiredInterfaces(), itemFilter_InterfaceType);

		Component availabilityItemFilter_Component = availabilityItemFilter_ComponentType.instantiate();
		components.add(availabilityItemFilter_Component);
		ProvidedInterface availabilityItemFilter__itemFilter_ProvInt = getInterfaceOfType(
				availabilityItemFilter_Component.getProvidedInterfaces(), itemFilter_InterfaceType);
		RequiredInterface availabilityItemFilter__itemFilter_ReqInt = getInterfaceOfType(
				availabilityItemFilter_Component.getRequiredInterfaces(), itemFilter_InterfaceType);

		Component regionItemFilter_Component = regionItemFilter_ComponentType.instantiate();
		components.add(regionItemFilter_Component);
		ProvidedInterface regionItemFilter__itemFilter_ProvInt = getInterfaceOfType(
				regionItemFilter_Component.getProvidedInterfaces(), itemFilter_InterfaceType);
		RequiredInterface regionItemFilter__itemFilter_ReqInt = getInterfaceOfType(
				regionItemFilter_Component.getRequiredInterfaces(), itemFilter_InterfaceType);

		Component sellerReputationItemFilter_Component = sellerReputationItemFilter_ComponentType.instantiate();
		components.add(sellerReputationItemFilter_Component);
		ProvidedInterface sellerReputationItemFilter__itemFilter_ProvInt = getInterfaceOfType(
				sellerReputationItemFilter_Component.getProvidedInterfaces(), itemFilter_InterfaceType);
		RequiredInterface sellerReputationItemFilter__itemFilter_ReqInt = getInterfaceOfType(
				sellerReputationItemFilter_Component.getRequiredInterfaces(), itemFilter_InterfaceType);

		Component commentItemFilter_Component = commentItemFilter_ComponentType.instantiate();
		components.add(commentItemFilter_Component);
		ProvidedInterface commentItemFilter__itemFilter_ProvInt = getInterfaceOfType(
				commentItemFilter_Component.getProvidedInterfaces(), itemFilter_InterfaceType);
		RequiredInterface commentItemFilter__itemFilter_ReqInt = getInterfaceOfType(
				commentItemFilter_Component.getRequiredInterfaces(), itemFilter_InterfaceType);

		Component categoryItemFilter_Component = categoryItemFilter_ComponentType.instantiate();
		components.add(categoryItemFilter_Component);
		ProvidedInterface categoryItemFilter__itemFilter_ProvInt = getInterfaceOfType(
				categoryItemFilter_Component.getProvidedInterfaces(), itemFilter_InterfaceType);
		RequiredInterface categoryItemFilter__itemFilter_ReqInt = getInterfaceOfType(
				categoryItemFilter_Component.getRequiredInterfaces(), itemFilter_InterfaceType);

		Component recommendationItemFilter_Component = recommendationItemFilter_ComponentType.instantiate();
		components.add(recommendationItemFilter_Component);
		ProvidedInterface recommendationItemFilter__itemFilter_ProvInt = getInterfaceOfType(
				recommendationItemFilter_Component.getProvidedInterfaces(), itemFilter_InterfaceType);
		RequiredInterface recommendationItemFilter__itemFilter_ReqInt = getInterfaceOfType(
				recommendationItemFilter_Component.getRequiredInterfaces(), itemFilter_InterfaceType);

		Component futureSalesItemFilter_Component = futureSalesItemFilter_ComponentType.instantiate();
		components.add(futureSalesItemFilter_Component);
		ProvidedInterface futureSalesItemFilter__itemFilter_ProvInt = getInterfaceOfType(
				futureSalesItemFilter_Component.getProvidedInterfaces(), itemFilter_InterfaceType);
		RequiredInterface futureSalesItemFilter__itemFilter_ReqInt = getInterfaceOfType(
				futureSalesItemFilter_Component.getRequiredInterfaces(), itemFilter_InterfaceType);

		// create connectors
		connect(reputationService__basicQueryService_ReqInt, queryService__basicQueryService_ProvInt);
		connect(reputationService__queryService_ReqInt, queryService__queryService_ProvInt);
		connect(reputationService__authenticationService_ReqInt, authenticationService__authenticationService_ProvInt);
		connect(reputationService__businessObjectPersistenceService_ReqInt,
				persistenceService__businessObjectPersistenceService_ProvInt);

		connect(itemManagementService__businessObjectPersistenceService_ReqInt,
				persistenceService__businessObjectPersistenceService_ProvInt);
		connect(itemManagementService__authenticationService_ReqInt,
				authenticationService__authenticationService_ProvInt);
		connect(itemManagementService__queryService_ReqInt, queryService__queryService_ProvInt);
		connect(itemManagementService__basicQueryService_ReqInt, queryService__basicQueryService_ProvInt);

		connect(userManagementService__businessObjectPersistenceService_ReqInt,
				persistenceService__businessObjectPersistenceService_ProvInt);
		connect(userManagementService__authenticationService_ReqInt,
				authenticationService__authenticationService_ProvInt);
		connect(userManagementService__queryService_ReqInt, queryService__queryService_ProvInt);
		connect(userManagementService__basicQueryService_ReqInt, queryService__basicQueryService_ProvInt);

		connect(authenticationService__basicQueryService_ReqInt, queryService__basicQueryService_ProvInt);

		connect(bidAndBuyService__inventoryService_ReqInt, inventoryService__inventoryService_ProvInt);
		connect(bidAndBuyService__businessObjectPersistenceService_ReqInt,
				persistenceService__businessObjectPersistenceService_ProvInt);
		connect(bidAndBuyService__authenticationService_ReqInt, authenticationService__authenticationService_ProvInt);
		connect(bidAndBuyService__queryService_ReqInt, queryService__queryService_ProvInt);
		connect(bidAndBuyService__basicQueryService_ReqInt, queryService__basicQueryService_ProvInt);

		connect(inventoryService__queryService_ReqInt, queryService__queryService_ProvInt);
		connect(inventoryService__businessObjectPersistenceService_ReqInt,
				persistenceService__businessObjectPersistenceService_ProvInt);

		connect(queryService__itemFilter_ReqInt, lastSecondSalesItemFilter__itemFilter_ProvInt);

		connect(lastSecondSalesItemFilter__itemFilter_ReqInt, pastSalesItemFilter__itemFilter_ProvInt);

		connect(pastSalesItemFilter__itemFilter_ReqInt, buyNowItemFilter__itemFilter_ProvInt);

		connect(buyNowItemFilter__itemFilter_ReqInt, availabilityItemFilter__itemFilter_ProvInt);

		connect(availabilityItemFilter__itemFilter_ReqInt, regionItemFilter__itemFilter_ProvInt);

		connect(regionItemFilter__itemFilter_ReqInt, sellerReputationItemFilter__itemFilter_ProvInt);

		connect(sellerReputationItemFilter__itemFilter_ReqInt, commentItemFilter__itemFilter_ProvInt);

		connect(commentItemFilter__itemFilter_ReqInt, categoryItemFilter__itemFilter_ProvInt);

		connect(categoryItemFilter__itemFilter_ReqInt, recommendationItemFilter__itemFilter_ProvInt);

		connect(recommendationItemFilter__itemFilter_ReqInt, futureSalesItemFilter__itemFilter_ProvInt);

		// add components to the tenant and start components
		for (Component component : components) {
			tenant.getComponents().add(component);
			component.setState(ComponentState.STARTED);
		}

		// return the tenant architecture
		return tenant;

	}

	private <T extends Interface> T getInterfaceOfType(List<T> interfazes, InterfaceType interfaceType) {
		T result = null;
		for (T interfaze : interfazes) {
			if (interfaceType.equals(interfaze.getType())) {
				result = interfaze;
			}
		}
		return result;
	}

	private void connect(RequiredInterface requiredInterface, ProvidedInterface providedInterface) {
		if (requiredInterface.getType().equals(providedInterface.getType())) {
			Connector connector = ComparchFactory.eINSTANCE.createConnector();
			connector.setName(
					requiredInterface.getType().getFqName() + "_to_" + providedInterface.getType().getFqName());
			connector.setSource(requiredInterface);
			connector.setTarget(providedInterface);
		} else {
			throw new RuntimeException("Cannot connect " + requiredInterface + " to " + providedInterface);
		}
	}

}
