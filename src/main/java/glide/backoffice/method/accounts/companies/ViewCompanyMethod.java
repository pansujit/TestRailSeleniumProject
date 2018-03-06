package glide.backoffice.method.accounts.companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.companies.AddCompany;
import glide.backoffice.locators.accounts.companies.HomepageCompany;
import glide.backoffice.locators.accounts.companies.ViewCompany;
import glide.backoffice.utility.SeleniumUtility;

public class ViewCompanyMethod {
	WebDriver driver;
	HomepageCompany homepageCompany;
	ViewCompany viewCompany;
	AddCompany addCompany;
	SoftAssert softAssert;
	public ViewCompanyMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageCompany=PageFactory.initElements(driver, HomepageCompany.class);
		this.viewCompany=PageFactory.initElements(driver, ViewCompany.class);
		this.addCompany=PageFactory.initElements(driver, AddCompany.class);
		this.softAssert= new SoftAssert();

	}
	

	/**
	 * This method clicks on the Edit link of the company. The edit is found after in the view page of company
	 */
	void clickOnEditCompany() {
		SeleniumUtility.clickOnElement(driver, viewCompany.aTagEditViewCompany);
		SeleniumUtility.waitElementToBeClickable(driver, addCompany.buttonTagSaveEditCompany);
		SeleniumUtility.fixedWait(1);
	}
	
	void assertViewCompany() {
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,  viewCompany.aTagEditViewCompany));
		softAssert.assertAll();
	}


}
