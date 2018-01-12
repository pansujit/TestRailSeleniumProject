package glide.backoffice.method.sidemenuitems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.menuitems.SidebarMenuItems;
import glide.backoffice.utility.SeleniumUtility;

public class SiteMenuItems {
	private SidebarMenuItems sidebarMenuItems;
	WebDriver driver;
	public SiteMenuItems() {

	}
	public SiteMenuItems(WebDriver ldriver) {
		this.driver=ldriver;
		this.sidebarMenuItems=PageFactory.initElements(driver, SidebarMenuItems.class);
	}
	private void clickOnMenu() {
		if(!SeleniumUtility.checkElementIsVisible(driver, sidebarMenuItems.buttonTagGeneralSettingsSidebarMenuItems)) {
			SeleniumUtility.clickOnElement(driver,sidebarMenuItems.buttonTagMenuIconSidebarMenuItems)	;
			SeleniumUtility.waitElementToBeVisible(driver, sidebarMenuItems.buttonTagGeneralSettingsSidebarMenuItems);
		}
	}
	private void clickOnAccounts() {
		clickOnMenu() ;
		if(SeleniumUtility.checkElementIsVisible(driver, sidebarMenuItems.buttonTagAccountsSidebarMenuItems)) {
			SeleniumUtility.clickOnElement(driver, sidebarMenuItems.buttonTagAccountsSidebarMenuItems);
			SeleniumUtility.waitElementToBeVisible(driver, sidebarMenuItems.aTagSuperCompaniesSidebarMenuItems);
		}
	}

	public void clickOnSuperCompanies() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagSuperCompaniesSidebarMenuItems);
		SeleniumUtility.fixedWait(5);

	}
	public void clickOnContracts() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagContractSidebarMenuItems);
		SeleniumUtility.fixedWait(5);

	}
	public void clickOnCompanies() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagSubCompaniesSidebarMenuItems);
		SeleniumUtility.fixedWait(5);

	}
	public void clickOnShuttleCompanies() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagShuttleSidebarMenuItems);
		SeleniumUtility.fixedWait(5);

	}
	public void clickOnConfigurations() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagConfigSidebarMenuItems);
		SeleniumUtility.fixedWait(5);

	}
	public void clickOnHotlines() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagHotlinesSidebarMenuItems);
		SeleniumUtility.fixedWait(5);

	}
	public void clickOnSitesAndParking() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagSitesSidebarMenuItems);
		SeleniumUtility.fixedWait(5);

	}
	public void clickOnPricingRules() {
		clickOnAccounts();
		SeleniumUtility.clickOnElement(driver, sidebarMenuItems.aTagPricingRulesSidebarMenuItems);
		SeleniumUtility.fixedWait(5);

	}


}
