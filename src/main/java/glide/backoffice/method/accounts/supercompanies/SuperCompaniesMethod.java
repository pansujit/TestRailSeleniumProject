package glide.backoffice.method.accounts.supercompanies;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.locators.headers.HeaderItem;
import glide.backoffice.method.common.CommonMethods;
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
	FilterSuperCompanyMethod filterSuperCompanyMethod;
	CommonMethods commonMethods;
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
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);
		this.filterSuperCompanyMethod=PageFactory.initElements(driver, FilterSuperCompanyMethod.class);
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
	 * @return 
	 */
	public List<String> createSuperCompany(SuperCompanyDto superCompanyDto) {
		homepageSuperCompaniesMethod.clickOnAddASuperCompanyButton();
		addEditSuperCompanyMethod.waitUntilSaveButtonIsVisible();
		SeleniumUtility.fixedWait(1);
		addEditSuperCompanyMethod.inputAddASuperCompany(superCompanyDto);
		addEditSuperCompanyMethod.clickOnSaveButton();
		commonMethods.waitUntilElementToBeInvisible();
		homepageSuperCompaniesMethod.waitUntilAddSCButtonIsVisible();
		SeleniumUtility.fixedWait(1);
		filterSuperCompanyMethod.clickOnFilter();
		filterSuperCompanyMethod.clickOnCompanyName();
		filterSuperCompanyMethod.inputCompanyName(superCompanyDto.getCompanyName());
		filterSuperCompanyMethod.clickOnConfirmButton();
		commonMethods.waitUntilTableContentVisible();
		return homepageSuperCompaniesMethod.assertEditSuperCompany(superCompanyDto.getCompanyName());
	}
	
	
	/**
	 * This public method edit a super company with given input in the existing super company.
	 * @param superCompanyDto -  Should be SuperCompanyDto
	 * @return 
	 */
	public List<String> editSuperCompany(SuperCompanyDto superCompanyDto) {
		filterSuperCompanyMethod.clickOnFilter();
		filterSuperCompanyMethod.clickOnCompanyName();
		filterSuperCompanyMethod.inputCompanyName(superCompanyDto.getCompanyName());
		filterSuperCompanyMethod.clickOnConfirmButton();
		commonMethods.waitUntilTableContentVisible();
		homepageSuperCompaniesMethod.clickOnViewButtonOfSuperCompany(superCompanyDto.getCompanyName());
		viewSuperCompanyMethod.waitUntilEditButtonIsVisible();
		viewSuperCompanyMethod.clickOnEditButton();
		addEditSuperCompanyMethod.waitUntilSaveButtonIsVisible();
		addEditSuperCompanyMethod.inputAddASuperCompany(superCompanyDto);
		addEditSuperCompanyMethod.clickOnSaveButton();
		commonMethods.waitUntilElementToBeInvisible();
		viewSuperCompanyMethod.waitUntilEditButtonIsVisible();
		headerMethod.clickOnHeaderBackButton();
		homepageSuperCompaniesMethod.waitUntilAddSCButtonIsVisible();
		SeleniumUtility.fixedWait(2);
		return homepageSuperCompaniesMethod.assertEditSuperCompany(superCompanyDto.getCompanyName());

	}



}
