package glide.backoffice.method.accounts.supercompanies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.accounts.supercompanies.AddSC;
import glide.backoffice.locators.accounts.supercompanies.ViewSC;
import glide.backoffice.utility.SeleniumUtility;

public class ViewSuperCompanyMethod {
	WebDriver driver;
	ViewSC viewSC;
	AddSC addSC;
	public ViewSuperCompanyMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.viewSC=PageFactory.initElements(driver, ViewSC.class);
		this.addSC=PageFactory.initElements(driver, AddSC.class);

	}
	
	/**
	 * This method click on the Edit button in view page of given super company in back office
	 */
	void clickOnEditButton() {
		SeleniumUtility.clickOnElement(driver, viewSC.aTagEditSuperCompanyViewSC);

	}
	/**
	 * This method waits until the Edit button of view page of  the super company is displayed in backoffice
	 */
	void waitUntilEditButtonIsVisible() {
		SeleniumUtility.checkElementIsVisible(driver, viewSC.aTagEditSuperCompanyViewSC);
		SeleniumUtility.fixedWait(1);
	}

}
