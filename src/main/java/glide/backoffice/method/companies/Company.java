package glide.backoffice.method.companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.companies.AddCompany;
import glide.backoffice.locators.companies.AddCompanyErrors;
import glide.backoffice.locators.companies.EditCompany;
import glide.backoffice.locators.companies.HomepageCompany;
import glide.backoffice.locators.companies.ViewCompany;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.utility.SeleniumUtility;

public class Company {
	
	WebDriver driver;
	AddCompany addCompany;
	AddCompanyErrors addCompanyErrors;
	EditCompany editCompany;
	HomepageCompany homepageCompany;
	ViewCompany viewCompany;
	SideMenuItemsMethod siteMenuItems;
	HeaderMethod headerMethod;
	public Company(WebDriver ldriver) {
		this.driver=ldriver;
		addCompany=PageFactory.initElements(driver, AddCompany.class);
		addCompanyErrors=PageFactory.initElements(driver, AddCompanyErrors.class);
		editCompany=PageFactory.initElements(driver, EditCompany.class);
		homepageCompany=PageFactory.initElements(driver, HomepageCompany.class);
		viewCompany=PageFactory.initElements(driver, ViewCompany.class);
		siteMenuItems=PageFactory.initElements(driver, SideMenuItemsMethod.class);	
		headerMethod=PageFactory.initElements(driver, HeaderMethod.class);	


	}
	/**
	 * This method will click on menu bar and click on the companies in side bar menu
	 */
	private void  clickOnCompanies() {
		siteMenuItems.clickOnCompanies();
	}
	/**
	 * This method clicks on Add a Company button and wait for "Save button" to be  clickable.
	 */
	private void clickOnAddCompany() {
		SeleniumUtility.clickOnElement(driver, homepageCompany.aTagAddCompanyHomepageCompanies);
		SeleniumUtility.waitElementToBeClickable(driver, editCompany.buttonTagSaveEditCompany);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method clicks on the view links of the given company 
	 */
	private void clickOnViewCompany() {
		SeleniumUtility.clickOnElement(driver, homepageCompany.buttonTagViewHomepageCompanies("test_company"));
		SeleniumUtility.waitElementToBeClickable(driver, viewCompany.aTagEditViewCompany);
		SeleniumUtility.fixedWait(1);
	}
	
	/**
	 * This method clicks on the Edit link of the company. The edit is found after in the view page of company
	 */
	private void clickOnEditCompany() {
		SeleniumUtility.clickOnElement(driver, viewCompany.aTagEditViewCompany);
		SeleniumUtility.waitElementToBeClickable(driver, editCompany.buttonTagSaveEditCompany);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method clears the input fields and type the text on the give field in Add a Company page.
	 * @param companyDto - should be CompanyDto
	 */
	private void inputToNewCompanyFields(CompanyDto companyDto) {
		SeleniumUtility.clearTextAndSendText(driver, addCompany.inputTagNameEditCompany, companyDto.getCompanyName());
		SeleniumUtility.clearTextAndSendText(driver, addCompany.inputTagAddressEditCompany, companyDto.getAddress());
		SeleniumUtility.clearTextAndSendText(driver, addCompany.inputTagEmailEditCompany, companyDto.getEmail());
		SeleniumUtility.clearTextAndSendText(driver, addCompany.inputTagPhoneNumberEditCompany, companyDto.getPhoneNumber());
		SeleniumUtility.clearTextAndSendText(driver, addCompany.inputTagTaxNumberEditCompany, companyDto.getTaxNumber());
		SeleniumUtility.clearTextAndSendText(driver, addCompany.inputTagCapitalEditCompany, companyDto.getCapital());
		SeleniumUtility.clearTextAndSendText(driver, addCompany.inputTagLogoURLEditCompany, companyDto.getLogoURL());
		SeleniumUtility.clearTextAndSendText(driver, addCompany.inputTagCompanyLegalFormEditCompany, companyDto.getCompanyLegalForm());
		SeleniumUtility.selectByVisibleText(driver, addCompany.selectTagAppliedConfigEditCompany, companyDto.getAppliedConfiguration());
		
		
	}
	/**
	 * This method Clicks on Save Button in new create a new company.
	 */
	private void clickOnSaveButton() {
		SeleniumUtility.clickOnElement(driver, addCompany.buttonTagSaveEditCompany);
		SeleniumUtility.waitElementToBeClickable(driver, homepageCompany.aTagAddCompanyHomepageCompanies) ;
		SeleniumUtility.fixedWait(1);
	}
	
	/**
	 * This method clicks on Save button in Edit page in company.
	 */
	private void clickOnSaveEditButton() {
		SeleniumUtility.clickOnElement(driver, addCompany.buttonTagSaveEditCompany);
		SeleniumUtility.waitElementToBeClickable(driver, viewCompany.aTagEditViewCompany) ;
		SeleniumUtility.fixedWait(1);	
	}
	
	/**
	 * This public method Creates new company in the given super company.
	 * @param companyDto - should be CompanyDto
	 */
	public void createNewCompany(CompanyDto companyDto) {
		clickOnAddCompany();
		inputToNewCompanyFields(companyDto);
		clickOnSaveButton();
	}
	
	/**
	 * This public method edits an existing company. it edits everything except name and configs.
	 * @param companyDto - Should be CompanyDto
	 */
	public void editCompany(CompanyDto companyDto) {

		clickOnViewCompany();
		clickOnEditCompany();
		inputToNewCompanyFields(companyDto);
		clickOnSaveEditButton();
		headerMethod.clickOnHeaderBackButton();
	}
	
	/**
	 * This public method Views an existing company.
	 */
	public void viewCompany() {
		clickOnViewCompany();
		headerMethod.clickOnHeaderBackButton();

	}
	
	
	

}
