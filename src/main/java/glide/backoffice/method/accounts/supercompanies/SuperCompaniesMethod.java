package glide.backoffice.method.accounts.supercompanies;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.locators.headers.HeaderItem;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This class contains all the method for the super companies
 * @author sujitpandey
 * @created on Feb 19, 2018 3:54:02 PM
 */
public class SuperCompaniesMethod {
	WebDriver driver;
	SoftAssert softAssert;
	HeaderItem headerItem;
	AddEditSuperCompanyMethod addEditSuperCompanyMethod;
	HomepageSuperCompaniesMethod homepageSuperCompaniesMethod;
	ViewSuperCompanyMethod viewSuperCompanyMethod;
	HeaderMethod headerMethod;
	
	// no args constructor
	public SuperCompaniesMethod() {

	}
	// constructor with web driver
	public SuperCompaniesMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.softAssert=new SoftAssert();
		this.headerItem=PageFactory.initElements(driver, HeaderItem.class);
		this.addEditSuperCompanyMethod=PageFactory.initElements(driver, AddEditSuperCompanyMethod.class);
		this.homepageSuperCompaniesMethod=PageFactory.initElements(driver, HomepageSuperCompaniesMethod.class);
		this.viewSuperCompanyMethod=PageFactory.initElements(driver, ViewSuperCompanyMethod.class);
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
	}


	/**
	 * This public method Check the super company homepage
	 */
	public void checkSuperCompanyHomePage() {
		homepageSuperCompaniesMethod.validateSuperCompanyHomepage();

	}
	/**
	 * This public method input the given input in the add super company field and check the error
	 * @param superCompanyDto -  Should be SuperCompanyDto
	 */
	public void checkAllErrorInCreateSuperCompany(SuperCompanyDto superCompanyDto) {
		homepageSuperCompaniesMethod.clickOnAddASuperCompanyButton();
		addEditSuperCompanyMethod.waitUntilSaveButtonIsVisible();
		addEditSuperCompanyMethod.inputAddASuperCompany(superCompanyDto);
		addEditSuperCompanyMethod.clickOnSaveButton();
		addEditSuperCompanyMethod.validateSuperCompanyAddError();
		addEditSuperCompanyMethod.clickOnCancelButton();
		homepageSuperCompaniesMethod.waitUntilAddSCButtonIsVisible();
	}
	/**
	 * This public method input the given input in the add super company field and check the Integer to String error
	 * @param superCompanyDto -  Should be SuperCompanyDto
	 */
	public void integerToStringError(SuperCompanyDto superCompanyDto) {
		homepageSuperCompaniesMethod.clickOnAddASuperCompanyButton();
		addEditSuperCompanyMethod.waitUntilSaveButtonIsVisible();
		addEditSuperCompanyMethod.inputAddASuperCompany(superCompanyDto);
		addEditSuperCompanyMethod.clickOnSaveButton();
		addEditSuperCompanyMethod.validateIntegerToStringError();
		addEditSuperCompanyMethod.clickOnCancelButton();
		homepageSuperCompaniesMethod.waitUntilAddSCButtonIsVisible();
	}
	/**
	 * This public method create a super company with given input in the super company.
	 * @param superCompanyDto -  Should be SuperCompanyDto
	 */
	public void createSuperCompany(SuperCompanyDto superCompanyDto) {
		boolean status=false;
		homepageSuperCompaniesMethod.clickOnAddASuperCompanyButton();
		addEditSuperCompanyMethod.waitUntilSaveButtonIsVisible();
		SeleniumUtility.fixedWait(1);
		addEditSuperCompanyMethod.inputAddASuperCompany(superCompanyDto);
		addEditSuperCompanyMethod.clickOnSaveButton();
		homepageSuperCompaniesMethod.waitUntilAddSCButtonIsVisible();
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.clickOnElement(driver, headerItem.inputTagBigSearchBoxHeaderItem);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.sendText(driver, headerItem.inputTagBigSearchBoxHeaderItem, superCompanyDto.getCompanyName());
		SeleniumUtility.fixedWait(3);
		List<WebElement>  webElements=SeleniumUtility.returnWebElements(driver, headerItem.resultBigSearchBoxHeaderItem);
		SeleniumUtility.fixedWait(2);
		if(webElements.isEmpty()) {
			return;
		}
		for(WebElement element:webElements) {
			if(SeleniumUtility.compareIgnoreCaseText(element.getText(), superCompanyDto.getCompanyName())) {
				status=true;
				break;
			}
		}
		softAssert.assertTrue(status);
		softAssert.assertAll();
	}
	
	
	/**
	 * This public method edit a super company with given input in the existing super company.
	 * @param superCompanyDto -  Should be SuperCompanyDto
	 */
	public void editSuperCompany(SuperCompanyDto superCompanyDto) {
		homepageSuperCompaniesMethod.clickOnViewButtonOfSuperCompany(Config.getProperty("EDIT_SUPER_COMPANY_NAME"));
		viewSuperCompanyMethod.waitUntilEditButtonIsVisible();
		viewSuperCompanyMethod.clickOnEditButton();
		addEditSuperCompanyMethod.waitUntilSaveButtonIsVisible();
		addEditSuperCompanyMethod.inputAddASuperCompany(superCompanyDto);
		addEditSuperCompanyMethod.clickOnSaveButton();
		viewSuperCompanyMethod.waitUntilEditButtonIsVisible();
		headerMethod.clickOnHeaderBackButton();
		homepageSuperCompaniesMethod.waitUntilAddSCButtonIsVisible();
		SeleniumUtility.fixedWait(2);
		homepageSuperCompaniesMethod.assertEditSuperCompany(Config.getProperty("EDIT_SUPER_COMPANY_NAME"), superCompanyDto.getEmail());

	}



}
