package glide.backoffice.method.companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.header.HeaderMethod;


public class Company {
	
	WebDriver driver;
	HeaderMethod headerMethod;
	HomepageCompanyMethod homepageCompanyMethod;
	AddEditCompanyMethod addEditCompanyMethod;
	public Company(WebDriver ldriver) {
		this.driver=ldriver;	
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);	
		this.homepageCompanyMethod=PageFactory.initElements(driver, HomepageCompanyMethod.class);	
		this.addEditCompanyMethod=PageFactory.initElements(driver, AddEditCompanyMethod.class);


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

		homepageCompanyMethod.clickOnViewCompany();
		addEditCompanyMethod.clickOnEditCompany();
		addEditCompanyMethod.inputToNewCompanyFields(companyDto);
		addEditCompanyMethod.clickOnSaveEditButton();
		clickOnBackHeaderButton();
	}
	
	/**
	 * This public method Views an existing company.
	 */
	public void viewCompany() {
		homepageCompanyMethod.clickOnViewCompany();
		clickOnBackHeaderButton();

	}
	
	
	

}
