package glide.backoffice.method.accounts.supercompanies;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.supercompanies.AddSC;
import glide.backoffice.locators.accounts.supercompanies.HomepageSC;
import glide.backoffice.locators.accounts.supercompanies.ViewSC;
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
	ViewSC viewSC;
	SoftAssert softAssert;
	//Constructor for the homepage super company method
	public HomepageSuperCompaniesMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageSC=PageFactory.initElements(driver, HomepageSC.class);
		this.addSC=PageFactory.initElements(driver, AddSC.class);
		this.softAssert=new SoftAssert();
		this.viewSC=PageFactory.initElements(driver, ViewSC.class);

	}
	/**
	 * This method Click on the add a super company button in super company homepage and wait until the Save button in the
	 * Add super company page is visible
	 */
	void clickOnAddASuperCompanyButton() {
		//This is temporary method  to click on element using java script need some work around 
		SeleniumUtility.clickWithJavaScript(driver, homepageSC.buttonTagAddSuperCompanyHomepageSC);

	}
	void clickOnViewButtonOfSuperCompany(String superCompanyName) {
		SeleniumUtility.clickOnElement(driver, homepageSC.divTagCompanyNameHomepageSC(superCompanyName));

	}
	/**
	 * This method verifies the some of the elements are present in the super company homepage.
	 * @return 
	 */
	List<Boolean> assertSuperCompanyHomepage() {
		List<Boolean> assertValue= new ArrayList<>();
		assertValue.add(0,SeleniumUtility.checkElementIsVisible(driver, homepageSC.buttonTagAddSuperCompanyHomepageSC));
		assertValue.add(1,SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCEmailHomepageSC));
		assertValue.add(2,SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCPhoneNoHomepageSC));
		return assertValue;
	}
	
	List<String> assertEditSuperCompany(String superCompany) {
		List<String> assertValue= new ArrayList<>();
		assertValue.add(0, SeleniumUtility.getText(driver, homepageSC.divTagCompanyNameHomepageSC(superCompany))); 
		assertValue.add(1, SeleniumUtility.getText(driver, homepageSC.divTagCompanyEmailHomepageSC(superCompany))); 
		return assertValue;
		
	}
	void waitUntilAddSCButtonIsVisible() {
		
	}
}
