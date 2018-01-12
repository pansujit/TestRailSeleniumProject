package glide.backoffice.locators.menuitems;

import org.openqa.selenium.By;

public class SidebarMenuItems {
	
	/**
	 * This locator will find menuBar tag in the back Office homepage
	 */
	public final By buttonTagMenuIconSidebarMenuItems= By.xpath(".//*[@id='mainContainer']/div/div[1]/header/div[1]");
	
	
	/**
	 * This locator will find DashBoard tag in the back Office homepage
	 */
	public final By aTagDashboardSidebarMenuItems= By.xpath(".//ul[@class='sideMenu_sections']//li/a[@href='#/dashboard']");
	

	
	/**
	 * This locator will find General Settings tag in the back Office homepage
	 */
	public final By buttonTagGeneralSettingsSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--settings']/button");
	
	/**
	 * This locator will find Account Management tag in the back Office homepage
	 */
	public final By buttonTagAccountsSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--accountManagement']/button");
	
	/**
	 * This locator will find Fleet Management tag in the back Office homepage
	 */
	public final By buttonTagFleetsSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--fleet']/button");
	
	/**
	 * This locator will find User Management tag in the back Office homepage
	 */
	public final By buttonTagUsersSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--membersManagement']/button");
	
	/**
	 * This locator will find Booking Management tag in the back Office homepage
	 */
	public final By aTagBookingsSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--booking']/a");
	
	/**
	 * This locator will find Invoice Management tag in the back Office homepage
	 */
	public final By aTagInvoicesSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--invoice']/a");
	
	/**
	 * This locator will find Voucher Management tag in the back Office homepage
	 */
	public final By aTagVoucherSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--invoice']/a");
	
	/***** LOCATORS IN GENERAL SETTINGS**********/
	/**
	 * Locator for the colors in setting in menu items in back office
	 */
	public final By aTagColorsSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--colors']/a");
	/**
	 * Locator for the Brands, models and versions in setting in menu items in back office
	 */
	public final By aTagBrandsSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--brands']/a");
	
	/**
	 * Locator for the vehicle categories in setting in menu items in back office
	 */
	public final By aTagCategoriesSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--categories']/a");
	
	/*********** Super Companies************* */
	/**
	 * Locator for the contract for super companies in Accounts in menu items in back office
	 */
	public final By aTagContractSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--contract']/a");
	
	/**
	 * Locator for the super companies in Accounts in menu items in back office
	 */
	public final By aTagSuperCompaniesSidebarMenuItems= By.xpath(".//li[contains(@class,'sideMenu_section sideMenu_section--companies')]/a");
	
	/**
	 * Locator for the sub super companies in Accounts in menu items in back office
	 */
	public final By aTagSubCompaniesSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--sub-companies']/a");
	
	/**
	 * Locator for the Groups in Accounts in menu items in back office
	 */
	public final By aTagGroupsSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--groups']/a");
	
	/**
	 * Locator for the Shuttles in Accounts in menu items in back office
	 */
	public final By aTagShuttleSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--shuttles']/a");
	
	/**
	 * Locator for the Configurations companies in Accounts in menu items in back office
	 */
	public final By aTagConfigSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--configurations']/a");
	
	/**
	 * Locator for the Hotlines in Accounts in menu items in back office
	 */
	public final By aTagHotlinesSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--hotlines']/a");
	
	/**
	 * Locator for the Sites in Accounts in menu items in back office
	 */
	public final By aTagSitesSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--sites']/a");
	
	/**
	 * Locator for the Pricing rules in Accounts in menu items in back office
	 */
	public final By aTagPricingRulesSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--pricing']/a");
	
	/******** FLEETS*********/
	/**
	 * Locator for Vehicles Tag in Fleets in menu items in back office
	 */
	public final By aTagVehiclesSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--vehicles']/a");
	
	/**
	 * Locator for Fines Tag in Fleets in menu items in back office
	 */
	public final By aTagFinesRulesSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--fines']/a");
	
	/**
	 * Locator for Usages Tag in Fleets in menu items in back office
	 */
	public final By aTagUsagesSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--usages']/a");
	
	/**
	 * Locator for Feedbacks Tag in Fleets in menu items in back office
	 */
	public final By aTagFeedbacksSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--feedbacks']/a");
	
	/**
	 * Locator for the Technical Incidents in Fleets in  menu items in back office
	 */
	public final By aTagIncidentsSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--incidents']/a");
	
	/**
	 * Locator for Vehicle Damages Tag in Fleets in menu items in back office
	 */
	public final By aTagVehicleDamageSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--vehicleDamages']/a");
	
	/************************* USERS**************************/
	/**
	 * Locator for Members Tag in USERS in menu items in back office
	 */
	public final By aTagMembersSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--members']/a");
	
	/**
	 * Locator for Back Users Tag in USERS in menu items in back office
	 */
	public final By aTagBackUsersSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--backUsers']/a");
	
	/**
	 * LLocator for Smartcards Tag in USERS in menu items in back office
	 */
	public final By aTagSmartcardsSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--smartcards]/a");
	
	/**
	 * Locator for Smartcards Events Tag in USERS in menu items in back office
	 */
	public final By aTagSmartcardsEventsSidebarMenuItems= By.xpath(".//li[@class='sideMenu_section sideMenu_section--smartcardsEvents']/a");

}
