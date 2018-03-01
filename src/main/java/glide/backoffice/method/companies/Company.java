package glide.backoffice.method.companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;


public class Company {
	
	WebDriver driver;
	HeaderMethod headerMethod;
	HomepageCompanyMethod homepageCompanyMethod;
	AddEditCompanyMethod addEditCompanyMethod;
	SideMenuItemsMethod siteMenuItems;
	ViewCompanyMethod viewCompanyMethod;
	public Company(WebDriver ldriver) {
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
	}
	
	/**
	 * This public method edits an existing company. it edits everything except name and configs.
	 * @param companyDto - Should be CompanyDto
	 */
	public void editCompany(CompanyDto companyDto) {

		homepageCompanyMethod.clickOnViewCompany(Config.getProperty("EDIT_SUB_COMPANY_NAME"));
		viewCompanyMethod.clickOnEditCompany();
		addEditCompanyMethod.inputToNewCompanyFields(companyDto);
		addEditCompanyMethod.clickOnSaveEditButton();
		clickOnBackHeaderButton();
		siteMenuItems.clickOnCompanies();
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
	
	
	

}
