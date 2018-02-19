package glide.backoffice.method.supercompanies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.supercompanies.AddSC;
import glide.backoffice.locators.accounts.supercompanies.HomepageSC;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This class contains all the methods related to super companies homepage in the back office 	and it is only called by 
 * SuperCompaniesMethod
 * @author sujitpandey
 * @created on Feb 19, 2018 3:50:24 PM
 */
public class HomepageSuperCompaniesMethod {
	WebDriver driver;
	HomepageSC homepageSC;
	AddSC addSC;
	SoftAssert softAssert;
	//Constructor for the homepage super company method
	public HomepageSuperCompaniesMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageSC=PageFactory.initElements(driver, HomepageSC.class);
		this.addSC=PageFactory.initElements(driver, AddSC.class);
		this.softAssert=new SoftAssert();

	}
	/**
	 * This method Click on the add a super company button in super company homepage and wait until the Save button in the
	 * Add super company page is visible
	 */
	void clickOnAddASuperCompanyButton() {
		//This is temporary method  to click on element using java script need some work around 
		SeleniumUtility.clickWithJavaScript(driver, homepageSC.aTagAddSuperCompanyHomepageSC);
		SeleniumUtility.waitElementToBeVisible(driver, addSC.buttonTagSaveButtonAddSC);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method verifies the some of the elements are present in the super company homepage.
	 */
	void validateSuperCompanyHomepage() {
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.aTagAddSuperCompanyHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.tableTagTableSuperCompanyHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.buttonTagHeaderSCActionHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCEmailHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCNameHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCTaxNumberHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCVatNumberHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCPhoneNoHomepageSC));
		softAssert.assertAll();
	}
}
