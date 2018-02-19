package glide.backoffice.method.supercompanies;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.locators.headers.HeaderItem;
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
		addEditSuperCompanyMethod.inputAddASuperCompany(superCompanyDto);
		addEditSuperCompanyMethod.clickOnSaveButton();
		addEditSuperCompanyMethod.validateSuperCompanyAddError();
		addEditSuperCompanyMethod.clickOnCancelButton();

	}
	/**
	 * This public method input the given input in the add super company field and check the Integer to String error
	 * @param superCompanyDto -  Should be SuperCompanyDto
	 */
	public void integerToStringError(SuperCompanyDto superCompanyDto) {
		homepageSuperCompaniesMethod.clickOnAddASuperCompanyButton();
		addEditSuperCompanyMethod.inputAddASuperCompany(superCompanyDto);
		addEditSuperCompanyMethod.clickOnSaveButton();
		addEditSuperCompanyMethod.validateIntegerToStringError();
		addEditSuperCompanyMethod.clickOnCancelButton();
	}
	/**
	 * This public method create a super company with given input in the super company.
	 * @param superCompanyDto -  Should be SuperCompanyDto
	 */
	public void createSuperCompany(SuperCompanyDto superCompanyDto) {
		boolean status=false;
		homepageSuperCompaniesMethod.clickOnAddASuperCompanyButton();
		addEditSuperCompanyMethod.inputAddASuperCompany(superCompanyDto);
		addEditSuperCompanyMethod.clickOnSaveButton();
		SeleniumUtility.fixedWait(15);
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



}
