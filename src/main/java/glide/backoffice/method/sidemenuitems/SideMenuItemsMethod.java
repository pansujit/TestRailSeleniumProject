package glide.backoffice.method.sidemenuitems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.menuitems.SidebarMenuItems;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;

public class SideMenuItemsMethod {
	private SidebarMenuItems sidebarMenuItems;
	WebDriver driver;
	CommonMethods commonMethods;
	public SideMenuItemsMethod() {

	}
	public SideMenuItemsMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.sidebarMenuItems=PageFactory.initElements(driver, SidebarMenuItems.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);

	}
	/**
	 * This private menu click on menu only if menu is closed
	 */
	private void clickOnMenu() {
		if(SeleniumUtility.getAttribute(driver, sidebarMenuItems.navTagIsMenuClosedSidebarMenuItems, "class").contains("close")) {
			SeleniumUtility.clickUsingAction(driver,sidebarMenuItems.buttonTagMenuIconSidebarMenuItems);
			SeleniumUtility.fixedMilliSecondWait();
		}
	}
	private void clickOnAccounts() {
		clickOnMenu() ;
		SeleniumUtility.fixedWait(5);
		if(SeleniumUtility.checkElementIsVisible(driver, sidebarMenuItems.buttonTagAccountsSidebarMenuItems)) {
			SeleniumUtility.clickOnElement(driver, sidebarMenuItems.buttonTagAccountsSidebarMenuItems);
			SeleniumUtility.waitElementToBeVisible(driver, sidebarMenuItems.aTagSuperCompaniesSidebarMenuItems);
		}
	}
	
	private void clickOnFleets() {
		clickOnMenu() ;
		if(SeleniumUtility.checkElementIsVisible(driver, sidebarMenuItems.buttonTagFleetsSidebarMenuItems)) {
			SeleniumUtility.clickOnElement(driver, sidebarMenuItems.buttonTagFleetsSidebarMenuItems);
			SeleniumUtility.waitElementToBeVisible(driver, sidebarMenuItems.aTagVehiclesSidebarMenuItems);
		}
		
	}
	private void clickOnUsers() {
		clickOnMenu() ;
		if(SeleniumUtility.checkElementIsVisible(driver, sidebarMenuItems.buttonTagUsersSidebarMenuItems)) {
			SeleniumUtility.clickOnElement(driver, sidebarMenuItems.buttonTagUsersSidebarMenuItems);
			SeleniumUtility.waitElementToBeVisible(driver, sidebarMenuItems.aTagBackUsersSidebarMenuItems);
		}
		
	}

	public void clickOnBookings() {
		clickOnMenu();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagBookingsSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedWait(2);
	}

	public void clickOnSuperCompanies() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagSuperCompaniesSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	public void clickOnContracts() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagContractSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	public void clickOnCompanies() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagSubCompaniesSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	public void clickOnShuttleCompanies() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagShuttleSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	public void clickOnConfigurations() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagConfigSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	public void clickOnHotlines() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagHotlinesSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	public void clickOnSitesAndParking() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagSitesSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	public void clickOnPricingRules() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagPricingRulesSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	public void clickOnVehicles() {
		clickOnFleets();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagVehiclesSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	
	public void clickOnBackusers() {
		clickOnUsers();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagBackUsersSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	
	public void clickOnMembers() {
		clickOnUsers();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagMembersSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	public void clickOnInvoices() {
		clickOnMenu();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagInvoicesSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();
	}

	/**
	 * This method click on the smartcards sidebar menu item in back office
	 */
    public void clickOnSmartcards() {
		clickOnUsers();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagSmartcardsSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();
    }

	/**
	 * This method click on the smartcard Events sidebar menu item in back office
	 */
	public void clickOnSmartcardEvents() {
		clickOnUsers();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagSmartcardsEventsSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();
	}
	
	public void clickOnVehiclePlanning() {
		clickOnMenu();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagVehiclePlanningSidebarMenuItems);
		commonMethods.waitUntilElementToBeInvisible();
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();
	}

}
