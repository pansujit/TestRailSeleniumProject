package glide.backoffice.method.accounts.companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.companies.EditCompany;
import glide.backoffice.locators.accounts.companies.HomepageCompany;
import glide.backoffice.locators.accounts.companies.ViewCompany;
import glide.backoffice.method.common.Config;
import glide.backoffice.utility.SeleniumUtility;

public class HomepageCompanyMethod {
	WebDriver driver;
	HomepageCompany homepageCompany;
	EditCompany editCompany;
	ViewCompany viewCompany;
	SoftAssert softAssert;
	public HomepageCompanyMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageCompany=PageFactory.initElements(driver, HomepageCompany.class);
		this.editCompany=PageFactory.initElements(driver, EditCompany.class);
		this.viewCompany=PageFactory.initElements(driver, ViewCompany.class);
		this.softAssert=new SoftAssert();
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
		void clickOnViewCompany(String companyName) {
			SeleniumUtility.clickOnElement(driver, homepageCompany.buttonTagViewHomepageCompanies(companyName));
			SeleniumUtility.waitElementToBeClickable(driver, viewCompany.aTagEditViewCompany);
			SeleniumUtility.fixedWait(1);
		}
		/**
		 * This method waits until the Add button in company homepage is displayed
		 */
		void waitUntilAddButtonIsVisible() {
			SeleniumUtility.waitElementToBeClickable(driver, homepageCompany.aTagAddCompanyHomepageCompanies) ;
			SeleniumUtility.fixedWait(1);
		}
		/**
		 * This method compare the text in company homepage of the given company with given parameters and return the boolean result
		 * @param companyName - Should be String
		 * @param taxNumber - Should be String
		 * @param companyEmail - Should be String
		 * @param companyPhone - Should be String
		 * @param companyVat - Should be String
		 */
		void assertCompanyEditCreate(String companyName,String taxNumber,String companyEmail,String companyPhone) {
			softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
					homepageCompany.spanTagTaxNumberHomepageCompanies(companyName),taxNumber));
			softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
					homepageCompany.spanTagEmailHomepageCompanies(companyName),companyEmail));
			softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
					homepageCompany.spanTagPhoneHomepageCompanies(companyName),"+33"+companyPhone));
			softAssert.assertTrue(!SeleniumUtility.getText(driver, homepageCompany.spanTagVatCodeHomepageCompanies(companyName)).isEmpty());
			softAssert.assertAll();
		}

}
