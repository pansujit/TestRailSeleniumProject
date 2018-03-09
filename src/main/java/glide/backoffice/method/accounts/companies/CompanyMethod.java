package glide.backoffice.method.accounts.companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.dataprovider.ErrorMessages;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.utility.SeleniumUtility;


public class CompanyMethod {
	
	WebDriver driver;
	HeaderMethod headerMethod;
	HomepageCompanyMethod homepageCompanyMethod;
	AddEditCompanyMethod addEditCompanyMethod;
	SideMenuItemsMethod siteMenuItems;
	ViewCompanyMethod viewCompanyMethod;
	public CompanyMethod(WebDriver ldriver) {
		this.driver=ldriver;	
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);	
		this.homepageCompanyMethod=PageFactory.initElements(driver, HomepageCompanyMethod.class);	
		this.addEditCompanyMethod=PageFactory.initElements(driver, AddEditCompanyMethod.class);
		this.siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		this.viewCompanyMethod= PageFactory.initElements(driver, ViewCompanyMethod.class); 

	}


	private void clickOnBackHeaderButton() {
		headerMethod.clickOnHeaderBackButton();
	}


	
	/**
	 * This public method Creates new company in the given super company.
	 * @param companyDto - should be CompanyDto
	 */
	public void createNewCompany(CompanyDto companyDto) {
		homepageCompanyMethod.clickOnAddCompany();
		addEditCompanyMethod.inputToNewCompanyFields(companyDto);
		addEditCompanyMethod.clickOnSaveButton();
		homepageCompanyMethod.waitUntilAddButtonIsVisible();
	}
	
	/**
	 * This public method edits an existing company. it edits everything except name and configs.
	 * @param companyDto - Should be CompanyDto
	 */
	public void editCompany(CompanyDto companyDto) {

		homepageCompanyMethod.clickOnViewCompany(Config.getProperty("EDIT_SUB_COMPANY_NAME"));
		viewCompanyMethod.clickOnEditCompany();
		addEditCompanyMethod.inputToNewCompanyFields(companyDto);
		addEditCompanyMethod.clickOnSaveButton();
		viewCompanyMethod.waitUntilEditButtonIsVisible();
		clickOnBackHeaderButton();
		homepageCompanyMethod.assertCompanyEditCreate(Config.getProperty("EDIT_SUB_COMPANY_NAME"),
				companyDto.getTaxNumber(), companyDto.getEmail(), companyDto.getPhoneNumber());
	}
	
	/**
	 * This public method Views an existing company.
	 */
	public void viewCompany() {
		homepageCompanyMethod.clickOnViewCompany(Config.getProperty("EDIT_SUB_COMPANY_NAME"));
		viewCompanyMethod.assertViewCompany();
		clickOnBackHeaderButton();
	}
	/**
	 * This public method checks for the all the mandatory field error message and check with given message in super company add/edit page.
	 */
	public void addEditCompanyErrorCheck() {
		homepageCompanyMethod.clickOnAddCompany();
		addEditCompanyMethod.clickOnSaveButton();
		SeleniumUtility.fixedWait(2);
		addEditCompanyMethod.assertCompanyErrorCheck(ErrorMessages.FIELD_IS_REQUIRED);
	}
	/**
	 * This public method check the error messages when input is provided other that what is defined for that input field in add/edit
	 * sub-company page.
	 * @param companyDto - Should be CompanyDto
	 */
	public void addEditCompanyValidationErrorCheck(CompanyDto companyDto) {
		addEditCompanyMethod.inputToNewCompanyFields(companyDto);
		addEditCompanyMethod.clickOnSaveButton();
		SeleniumUtility.fixedWait(2);
		addEditCompanyMethod.assertCompanyFieldValidationErrorCheck(ErrorMessages.INTEGER_FIELD_ERROR,
				ErrorMessages.INVALID_URL_ERROR,ErrorMessages.INVALID_EMAIL_ERROR);
	}
	
	
	

}
