package de.mdelab.simulator.mrubis;

/**
 * Names of architectural elements of mRUBiS.
 * 
 * @author thomas vogel
 * @version 0.41
 *
 */
public interface MRubisNames {

	/*
	 * Component Type Names of mRUBiS
	 */
	public static String userManagementService_ComponentType_Name = "User Management Service";
	public static String itemManagementService_ComponentType_Name = "Item Management Service";
	public static String authenticationService_ComponentType_Name = "Authentication Service";
	public static String bidAndBuyService_ComponentType_Name = "Bid and Buy Service";
	public static String inventoryService_ComponentType_Name = "Inventory Service";
	public static String reputationService_ComponentType_Name = "Reputation Service";
	public static String persistenceService_ComponentType_Name = "Persistence Service";
	public static String queryService_ComponentType_Name = "Query Service";
	public static String lastSecondSalesItemFilter_ComponentType_Name = "Last Second Sales Item Filter";
	public static String pastSalesItemFilter_ComponentType_Name = "Past Sales Item Filter";
	public static String buyNowItemFilter_ComponentType_Name = "Buy Now Item Filter";
	public static String availabilityItemFilter_ComponentType_Name = "Availability Item Filter";
	public static String regionItemFilter_ComponentType_Name = "Region Item Filter";
	public static String sellerReputationItemFilter_ComponentType_Name = "Seller Reputation Item Filter";
	public static String commentItemFilter_ComponentType_Name = "Comment Item Filter";
	public static String categoryItemFilter_ComponentType_Name = "Category Item Filter";
	public static String recommendationItemFilter_ComponentType_Name = "Recommendation Item Filter";
	public static String futureSalesItemFilter_ComponentType_Name = "Future Sales Item Filter";

	/*
	 * Fully Qualified Interface Type Names of mRUBiS
	 */
	public final static String base_package = "de.hpi.sam.rubis.";
	public final static String aboutMeService_InterfaceType_FqName = base_package + "usermgmt.AboutMeService";
	public final static String viewUserService_InterfaceType_FqName = base_package + "usermgmt.ViewUserInfoService";
	public final static String browseRegionService_InterfaceType_FqName = base_package
			+ "usermgmt.BrowseRegionsService";
	public final static String userRegistrationService_InterfaceType_FqName = base_package
			+ "usermgmt.UserRegistrationService";
	public final static String browseCategoriesService_InterfaceType_FqName = base_package
			+ "itemmgmt.BrowseCategoriesService";
	public final static String itemRegistrationService_InterfaceType_FqName = base_package
			+ "itemmgmt.ItemRegistrationService";
	public final static String authenticationService_InterfaceType_FqName = base_package
			+ "authservice.AuthenticationService";
	public final static String bidService_InterfaceType_FqName = base_package + "bidandbuy.BidService";
	public final static String buyNowService_InterfaceType_FqName = base_package + "bidandbuy.BuyNowService";
	public final static String inventoryService_InterfaceType_FqName = base_package + "inventorymgmt.InventoryService";
	public final static String reputationService_InterfaceType_FqName = base_package
			+ "reputationservice.ReputationService";
	public final static String boPersistenceService_InterfaceType_FqName = base_package
			+ "persistenceservice.BusinessObjectsPersistenceService";
	public final static String basicQueryService_InterfaceType_FqName = base_package + "queryservice.BasicQueryService";
	public final static String queryService_InterfaceType_FqName = base_package + "queryservice.QueryService";
	public final static String itemFilterService_InterfaceType_FqName = base_package + "filter.ItemFilter";

	/*
	 * Monitored Property attributes for the selection rate of filter components in
	 * mRUBiS
	 */
	public final static String selectionRate_MonitoredProperty_Name = "selection-rate";
	public final static String selectionRate_MonitoredProperty_Type = Double.class.getCanonicalName();
	public final static String selectionRate_MonitoredProperty_Unit = "*100%";
	public final static String selectionRate_MonitoredProperty_Description = "The selection rate of this filter";

	/*
	 * Monitored Property attributes for the local computation time of filter
	 * components in mRUBiS
	 */
	public final static String localComputationTime_MonitoredProperty_Name = "local-computation-time";
	public final static String localComputationTime_MonitoredProperty_Type = Long.class.getCanonicalName();
	public final static String localComputationTime_MonitoredProperty_Unit = "ms";
	public final static String localComputationTime_MonitoredProperty_Description = "The local computation time c of this filter";

	/*
	 * Signature of the method realizing the personalized search in a tenant of
	 * mRUBiS.
	 */
	public final static String getPersonalizedItems_Signature = "getPersonalizedItems(java.lang.String,java.lang.String)";

}
