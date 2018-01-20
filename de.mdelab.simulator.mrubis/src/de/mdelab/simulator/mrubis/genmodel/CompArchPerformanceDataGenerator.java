package de.mdelab.simulator.mrubis.genmodel;

import de.mdelab.comparch.ComparchFactory;
import de.mdelab.comparch.Component;
import de.mdelab.comparch.MethodSpecification;
import de.mdelab.comparch.MonitoredProperty;
import de.mdelab.comparch.PerformanceStats;
import de.mdelab.comparch.ProvidedInterface;
import de.mdelab.comparch.Tenant;
import de.mdelab.simulator.SimulatorException;
import de.mdelab.simulator.mrubis.MRubisNames;

/**
 * Generates performance data of mRUBiS.
 * 
 * @author thomas vogel
 * @version 0.41
 * 
 */
class CompArchPerformanceDataGenerator {

	private double scale = 1.00;

	/**
	 * Constructor.
	 * 
	 * @param scale
	 *            factor to scale some of the generated performance data
	 */
	public CompArchPerformanceDataGenerator(double scale) {
		this.scale = scale;
	}

	/**
	 * Generates and adds performance data to the given tenant.
	 * 
	 * @param tenant
	 *            the tenant for which the performance data will be generated and
	 *            added.
	 */
	void generateAndAddPerformanceStats(Tenant tenant) {

		for (Component c : tenant.getComponents()) {
			String componentTypeName = c.getType().getName();
			ProvidedInterface pi;
			MethodSpecification m;
			switch (componentTypeName) {
			// Future Sales Item Filter
			case MRubisNames.futureSalesItemFilter_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.itemFilterService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "filter(java.util.List,de.hpi.sam.rubis.entity.User)");
				this.addStats(pi, m, 15, 100, 30 * 30, 30);
				this.addMonitoredProperties(c, 0.03, 30);
				break;
			// Recommendation Item Filter
			case MRubisNames.recommendationItemFilter_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.itemFilterService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "filter(java.util.List,de.hpi.sam.rubis.entity.User)");
				this.addStats(pi, m, 45, 175, 67 * 30, 30);
				this.addMonitoredProperties(c, 0.04, 37);
				break;
			// Category Item Filter
			case MRubisNames.categoryItemFilter_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.itemFilterService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "filter(java.util.List,de.hpi.sam.rubis.entity.User)");
				this.addStats(pi, m, 95, 300, 136 * 30, 30);
				this.addMonitoredProperties(c, 0.08, 69);
				break;
			// Comment Item Filter
			case MRubisNames.commentItemFilter_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.itemFilterService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "filter(java.util.List,de.hpi.sam.rubis.entity.User)");
				this.addStats(pi, m, 140, 390, 204 * 30, 30);
				this.addMonitoredProperties(c, 0.10, 68);
				break;
			// Seller Reputation Item Filter
			case MRubisNames.sellerReputationItemFilter_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.itemFilterService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "filter(java.util.List,de.hpi.sam.rubis.entity.User)");
				this.addStats(pi, m, 190, 440, 269 * 30, 30);
				this.addMonitoredProperties(c, 0.12, 65);
				break;
			// Region item filter
			case MRubisNames.regionItemFilter_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.itemFilterService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "filter(java.util.List,de.hpi.sam.rubis.entity.User)");
				this.addStats(pi, m, 240, 500, 332 * 30, 30);
				this.addMonitoredProperties(c, 0.15, 63);
				break;
			// Availability Item Filter
			case MRubisNames.availabilityItemFilter_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.itemFilterService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "filter(java.util.List,de.hpi.sam.rubis.entity.User)");
				this.addStats(pi, m, 300, 620, 392 * 30, 30);
				this.addMonitoredProperties(c, 0.17, 60);
				break;
			// Buy-Now Item Filter
			case MRubisNames.buyNowItemFilter_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.itemFilterService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "filter(java.util.List,de.hpi.sam.rubis.entity.User)");
				this.addStats(pi, m, 340, 690, 449 * 30, 30);
				this.addMonitoredProperties(c, 0.18, 57);
				break;
			// Past Sales Item Filter
			case MRubisNames.pastSalesItemFilter_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.itemFilterService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "filter(java.util.List,de.hpi.sam.rubis.entity.User)");
				this.addStats(pi, m, 400, 740, 503 * 30, 30);
				this.addMonitoredProperties(c, 0.20, 54);
				break;
			// Last Second Sales Item Filter
			case MRubisNames.lastSecondSalesItemFilter_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.itemFilterService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "filter(java.util.List,de.hpi.sam.rubis.entity.User)");
				this.addStats(pi, m, 450, 760, 560 * 30, 30);
				this.addMonitoredProperties(c, 0.22, 57);
				break;
			// Query Service
			case MRubisNames.queryService_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.basicQueryService_InterfaceType_FqName);
				// m = this.findMethodSpec(pi, "findAllUsers()");
				// this.addStats(pi, m, 0, 0, 0, 0);
				m = this.findMethodSpec(pi, "findUserById(int)");
				this.addStats(pi, m, 10, 377, 896, 9);
				m = this.findMethodSpec(pi, "findUserByNickname(java.lang.String)");
				this.addStats(pi, m, 2, 479, 3495, 48);
				m = this.findMethodSpec(pi, "findAllCategories()");
				this.addStats(pi, m, 184, 619, 1134, 3);
				m = this.findMethodSpec(pi, "findCategoryById(int)");
				this.addStats(pi, m, 167, 717, 1210, 3);
				// m = this.findMethodSpec(pi, "findCategoryByName(java.lang.String)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				// m = this.findMethodSpec(pi, "findCategoriesByName(java.lang.String)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				m = this.findMethodSpec(pi, "findAllRegions()");
				this.addStats(pi, m, 194, 1484, 3335, 6);
				// m = this.findMethodSpec(pi, "findRegionById(int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				m = this.findMethodSpec(pi, "findRegionByName(java.lang.String)");
				this.addStats(pi, m, 5, 442, 977, 6);
				// m = this.findMethodSpec(pi, "findRegionsByName(java.lang.String)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				m = this.findMethodSpec(pi, "findItemsByName(java.lang.String)");
				this.addStats(pi, m, 188, 375, 819, 3);
				m = this.findMethodSpec(pi, "findItemById(int)");
				this.addStats(pi, m, 1, 2, 13, 9);
				// m = this.findMethodSpec(pi, "findAllItems()");
				// this.addStats(pi, m, 0, 0, 0, 0);
				/*
				 * findPersonalizedItems(de.hpi.sam.rubis.entity.User)
				 */
				m = this.findMethodSpec(pi, "findPersonalizedItems(de.hpi.sam.rubis.entity.User)");
				this.addStats(pi, m, 600, 900, 816 * 30, 30);
				m = this.findMethodSpec(pi, "isUserNicknameUsed(java.lang.String)");
				this.addStats(pi, m, 4, 12, 43, 6);

				pi = this.findProvidedInterface(c, MRubisNames.queryService_InterfaceType_FqName);
				// m = this.findMethodSpec(pi, "findCurrentItemsInCategory(int,int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				// m = this.findMethodSpec(pi, "findPastItemsInCategory(int,int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				// m = this.findMethodSpec(pi,
				// "findCurrentItemsInCategoryAndRegion(int,int,int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				// m = this.findMethodSpec(pi, "findPastItemsInCategoryAndRegion(int,int,int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				// m = this.findMethodSpec(pi, "findItemMaxBid(int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				m = this.findMethodSpec(pi, "findItemMaxBids(int,int)");
				this.addStats(pi, m, 11, 393, 881, 6);
				// m = this.findMethodSpec(pi, "findItemBidHistory(int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				// m = this.findMethodSpec(pi, "findSuccessfulBidsForItem(int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				// m = this.findMethodSpec(pi,"findUserBuyNows(int,int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				// m = this.findMethodSpec(pi,"findUserCurrentSellings(int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				// m = this.findMethodSpec(pi,"findUserPastSellings(int,int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				m = this.findMethodSpec(pi, "findUserPastWinningBids(int)");
				this.addStats(pi, m, 12, 38, 118, 6);
				m = this.findMethodSpec(pi, "findUserCurrentMaxBids(int)");
				this.addStats(pi, m, 12, 20, 91, 6);
				// m = this.findMethodSpec(pi, "findCategoriesInRegion(java.lang.String)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				// m = this.findMethodSpec(pi, "getNumberOfBidsForItem(int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				m = this.findMethodSpec(pi, "findComment(int,int,int)");
				this.addStats(pi, m, 42, 93, 199, 3);
				m = this.findMethodSpec(pi, "retrieveAvailabilityOfItem(int)");
				this.addStats(pi, m, 4, 11, 64, 9);
				break;
			// Persistence Service
			case MRubisNames.persistenceService_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.boPersistenceService_InterfaceType_FqName);
				m = this.findMethodSpec(pi,
						"persistUser(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,de.hpi.sam.rubis.entity.Region,de.hpi.sam.rubis.entity.CustomerClass)");
				this.addStats(pi, m, 1, 433, 969, 6);
				m = this.findMethodSpec(pi,
						"persistItem(java.lang.String,java.lang.String,int,float,float,float,java.util.Date,java.util.Date,de.hpi.sam.rubis.entity.User,de.hpi.sam.rubis.entity.Category)");
				this.addStats(pi, m, 170, 550, 1063, 3);
				m = this.findMethodSpec(pi,
						"persistBid(de.hpi.sam.rubis.entity.User,de.hpi.sam.rubis.entity.Item,float,float,int,java.util.Date)");
				this.addStats(pi, m, 200, 445, 935, 3);
				m = this.findMethodSpec(pi,
						"persistBuyNow(de.hpi.sam.rubis.entity.User,de.hpi.sam.rubis.entity.Item,int,java.util.Date)");
				this.addStats(pi, m, 61, 122, 301, 3);
				m = this.findMethodSpec(pi,
						"persistComment(de.hpi.sam.rubis.entity.User,de.hpi.sam.rubis.entity.User,de.hpi.sam.rubis.entity.Item,java.lang.String,int,java.util.Date)");
				this.addStats(pi, m, 169, 353, 737, 3);
				m = this.findMethodSpec(pi, "reduceInventoryItem(de.hpi.sam.rubis.entity.Item,int)");
				this.addStats(pi, m, 10, 15, 39, 3);
				// m = this.findMethodSpec(pi,
				// "increaseInventoryItem(de.hpi.sam.rubis.entity.Item,int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				break;
			// Reputation Service
			case MRubisNames.reputationService_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.reputationService_InterfaceType_FqName);
				m = this.findMethodSpec(pi,
						"giveComment(java.lang.String,java.lang.String,int,int,java.lang.String,int)");
				this.addStats(pi, m, 436, 793, 1770, 3);
				break;
			// Inventory Service
			case MRubisNames.inventoryService_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.inventoryService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "checkAvailabilityOfItem(de.hpi.sam.rubis.entity.Item)");
				this.addStats(pi, m, 7, 37, 109, 6);
				m = this.findMethodSpec(pi, "reserveItem(de.hpi.sam.rubis.entity.Item,int)");
				this.addStats(pi, m, 30, 40, 103, 3);
				// m = this.findMethodSpec(pi,
				// "cancelReservedItem(de.hpi.sam.rubis.entity.Item,int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				break;
			// Bid and Buy Service
			case MRubisNames.bidAndBuyService_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.bidService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "bidOnItem(int,float,float,int,java.lang.String,java.lang.String)");
				this.addStats(pi, m, 423, 1086, 2138, 3);
				// m = this.findMethodSpec(pi, "getItemBidHistory(int)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				m = this.findMethodSpec(pi, "getItemBidHistorySortyByBidPrice(int)");
				this.addStats(pi, m, 13, 402, 908, 6);

				pi = this.findProvidedInterface(c, MRubisNames.buyNowService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "buyItemNow(int,int,java.lang.String,java.lang.String)");
				this.addStats(pi, m, 335, 620, 1375, 3);
				break;
			// Authentication Service
			case MRubisNames.authenticationService_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.authenticationService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "authenticate(java.lang.String,java.lang.String)");
				this.addStats(pi, m, 50, 153, 3675, 48);
				break;
			// Item Management Service
			case MRubisNames.itemManagementService_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.itemRegistrationService_InterfaceType_FqName);
				m = this.findMethodSpec(pi,
						"registerItem(java.lang.String,java.lang.String,int,float,float,float,java.util.Date,java.util.Date,int,java.lang.String,int)");
				this.addStats(pi, m, 363, 1349, 2425, 3);

				pi = this.findProvidedInterface(c, MRubisNames.browseCategoriesService_InterfaceType_FqName);
				// m = this.findMethodSpec(pi, "getCategoriesInRegion(java.lang.String)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				m = this.findMethodSpec(pi, "getAllCategories()");
				this.addStats(pi, m, 190, 652, 1185, 3);
				// m = this.findMethodSpec(pi, "getCategoriesByName(java.lang.String)");
				// this.addStats(pi, m, 0, 0, 0, 0);
				m = this.findMethodSpec(pi, "getItemsByName(java.lang.String)");
				this.addStats(pi, m, 196, 391, 853, 3);
				/*
				 * getPersonalizedItems(java.lang.String,java.lang.String)
				 */
				m = this.findMethodSpec(pi, "getPersonalizedItems(java.lang.String,java.lang.String)");
				this.addStats(pi, m, 680, 996, 897 * 30, 30);
				break;
			// User Management Service
			case MRubisNames.userManagementService_ComponentType_Name:
				pi = this.findProvidedInterface(c, MRubisNames.aboutMeService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "getAboutMe(java.lang.String,java.lang.String)");
				this.addStats(pi, m, 39, 556, 1294, 6);

				pi = this.findProvidedInterface(c, MRubisNames.viewUserService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "getUserInfo(int)");
				this.addStats(pi, m, 188, 404, 907, 3);

				pi = this.findProvidedInterface(c, MRubisNames.browseRegionService_InterfaceType_FqName);
				m = this.findMethodSpec(pi, "getAllRegions()");
				this.addStats(pi, m, 203, 1550, 3459, 6);

				pi = this.findProvidedInterface(c, MRubisNames.userRegistrationService_InterfaceType_FqName);
				m = this.findMethodSpec(pi,
						"registerUser(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,de.hpi.sam.rubis.entity.CustomerClass)");
				this.addStats(pi, m, 13, 937, 2109, 6);
				break;
			default:
				break;
			}
		}

	}

	private ProvidedInterface findProvidedInterface(Component c, String fullyQualifiedInterfaceName) {
		ProvidedInterface result = null;
		for (ProvidedInterface pi : c.getProvidedInterfaces()) {
			if (pi.getType().getFqName().equals(fullyQualifiedInterfaceName)) {
				result = pi;
				break;
			}
		}
		return result;
	}

	private MethodSpecification findMethodSpec(ProvidedInterface pi, String signature) {
		MethodSpecification result = null;
		for (MethodSpecification m : pi.getType().getMethodSpecifications()) {
			if (m.getSignature().equals(signature)) {
				result = m;
				break;
			}
		}
		return result;
	}

	private void addStats(ProvidedInterface pi, MethodSpecification m, long minTime, long maxTime, long totalTime,
			long invocationCount) {
		if (pi == null || m == null) {
			throw new SimulatorException(
					"Error generating performance stats. Provided interface is " + pi + " and method is  + m");
		}
		// if there is no invocation, no stats are required.
		if (invocationCount > 0) {
			PerformanceStats stats = ComparchFactory.eINSTANCE.createPerformanceStats();
			stats.setInterface(pi);
			stats.setMethod(m);
			stats.setMinTime((long) (minTime * this.scale));
			stats.setMaxTime((long) (maxTime * this.scale));
			stats.setTotalTime((long) (totalTime * this.scale));
			stats.setInvocationCount(invocationCount);
		}
	}

	private void addMonitoredProperties(Component c, double selectionRateValue, long localComputationTimeValue) {
		MonitoredProperty selectionRate = ComparchFactory.eINSTANCE.createMonitoredProperty();
		selectionRate.setName(MRubisNames.selectionRate_MonitoredProperty_Name);
		selectionRate.setType(MRubisNames.selectionRate_MonitoredProperty_Type);
		selectionRate.setUnit(MRubisNames.selectionRate_MonitoredProperty_Unit);
		selectionRate.setDescription(MRubisNames.selectionRate_MonitoredProperty_Description);
		selectionRate.setValue("" + selectionRateValue);
		selectionRate.setArchitecturalElement(c);

		MonitoredProperty localComputationTime = ComparchFactory.eINSTANCE.createMonitoredProperty();
		localComputationTime.setName(MRubisNames.localComputationTime_MonitoredProperty_Name);
		localComputationTime.setType(MRubisNames.localComputationTime_MonitoredProperty_Type);
		localComputationTime.setUnit(MRubisNames.localComputationTime_MonitoredProperty_Unit);
		localComputationTime.setDescription(MRubisNames.localComputationTime_MonitoredProperty_Description);
		long value = (long) (localComputationTimeValue * this.scale);
		localComputationTime.setValue("" + value);
		localComputationTime.setArchitecturalElement(c);
	}

}