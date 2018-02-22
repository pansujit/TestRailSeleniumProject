package glide.backoffice.method.companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.companies.AddCompany;
import glide.backoffice.locators.companies.HomepageCompany;
import glide.backoffice.locators.companies.ViewCompany;
import glide.backoffice.utility.SeleniumUtility;

public class AddEditCompanyMethod {
	WebDriver driver;
	HomepageCompany homepageCompany;
	AddCompany addCompany;
	ViewCompany viewCompany;
	public AddEditCompanyMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addCompany=PageFactory.initElements(driver, AddCompany.class);
		this.viewCompany=PageFactory.initElements(driver, ViewCompany.class);
	}
	
	/**
	 * This method clears the input fields and type the text on the give field in Add a Company page.
	 * @param companyDto - should be CompanyDto
	 */
	void inputToNewCompanyFields(CompanyDto companyDto) {
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
	void clickOnSaveButton() {
		SeleniumUtility.clickOnElement(driver, addCompany.buttonTagSaveEditCompany);
		SeleniumUtility.waitElementToBeClickable(driver, homepageCompany.aTagAddCompanyHomepageCompanies) ;
		SeleniumUtility.fixedWait(1);
	}
	
	/**
	 * This method clicks on Save button in Edit page in company.
	 */
	void clickOnSaveEditButton() {
		SeleniumUtility.clickOnElement(driver, addCompany.buttonTagSaveEditCompany);
		SeleniumUtility.waitElementToBeClickable(driver, viewCompany.aTagEditViewCompany) ;
		SeleniumUtility.fixedWait(1);	
	}
	
	/**
	 * This method clicks on the Edit link of the company. The edit is found after in the view page of company
	 */
	void clickOnEditCompany() {
		SeleniumUtility.clickOnElement(driver, viewCompany.aTagEditViewCompany);
		SeleniumUtility.waitElementToBeClickable(driver, addCompany.buttonTagSaveEditCompany);
		SeleniumUtility.fixedWait(1);
	}
}
