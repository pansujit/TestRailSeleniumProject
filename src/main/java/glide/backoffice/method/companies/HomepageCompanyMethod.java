package glide.backoffice.method.companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.companies.EditCompany;
import glide.backoffice.locators.companies.HomepageCompany;
import glide.backoffice.locators.companies.ViewCompany;
import glide.backoffice.method.common.Config;
import glide.backoffice.utility.SeleniumUtility;

public class HomepageCompanyMethod {
	WebDriver driver;
	HomepageCompany homepageCompany;
	EditCompany editCompany;
	ViewCompany viewCompany;
	public HomepageCompanyMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageCompany=PageFactory.initElements(driver, HomepageCompany.class);
		this.editCompany=PageFactory.initElements(driver, EditCompany.class);
		this.viewCompany=PageFactory.initElements(driver, ViewCompany.class);

	}
	
	/**
	 * This method clicks on Add a Company button and wait for "Save button" to be  clickable.
	 */
	 void clickOnAddCompany() {
		SeleniumUtility.clickOnElement(driver, homepageCompany.aTagAddCompanyHomepageCompanies);
		SeleniumUtility.waitElementToBeClickable(driver, editCompany.buttonTagSaveEditCompany);
		SeleniumUtility.fixedWait(1);
	}
	 
		/**
		 * This method clicks on the view links of the given company 
		 */
		void clickOnViewCompany() {
			SeleniumUtility.clickOnElement(driver, homepageCompany.buttonTagViewHomepageCompanies(Config.getProperty("EDIT_SUB_COMPANY_NAME")));
			SeleniumUtility.waitElementToBeClickable(driver, viewCompany.aTagEditViewCompany);
			SeleniumUtility.fixedWait(1);
		}

}
