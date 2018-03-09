package glide.backoffice.method.accounts.companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.companies.AddCompany;
import glide.backoffice.locators.accounts.companies.AddCompanyErrors;
import glide.backoffice.locators.accounts.companies.HomepageCompany;
import glide.backoffice.locators.accounts.companies.ViewCompany;
import glide.backoffice.utility.SeleniumUtility;

public class AddEditCompanyMethod {
	WebDriver driver;
	HomepageCompany homepageCompany;
	AddCompany addCompany;
	ViewCompany viewCompany;
	SoftAssert softAssert;
	AddCompanyErrors addCompanyErrors;
	public AddEditCompanyMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addCompany=PageFactory.initElements(driver, AddCompany.class);
		this.viewCompany=PageFactory.initElements(driver, ViewCompany.class);
		this.softAssert=new SoftAssert();
		this.addCompanyErrors=PageFactory.initElements(driver, AddCompanyErrors.class);
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

	}

	void assertCompanyErrorCheck(String errorMessage) {
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagAddressAddCompanyErrors, errorMessage));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagNameAddCompanyErrors, errorMessage));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagEmailAddCompanyErrors, errorMessage));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagPhoneNumberAddCompanyErrors, errorMessage));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagTaxNumberAddCompanyErrors, errorMessage));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagCapitalAddCompanyErrors, errorMessage));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagCompanyLegalFormAddCompanyErrors, errorMessage));
		softAssert.assertAll();
	}
	/**
	 * This method check the validation error, when different type or format of data is given to the input field in add companies
	 * @param integerError - Should be String
	 * @param urlError - Should be String
	 * @param emailError - Should be String
	 */
	void assertCompanyFieldValidationErrorCheck(String integerError, String urlError, String emailError) {
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagEmailAddCompanyErrors, emailError));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagPhoneNumberAddCompanyErrors, integerError));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagTaxNumberAddCompanyErrors, integerError));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagCapitalAddCompanyErrors, integerError));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				addCompanyErrors.inputTagLogoURLAddCompanyErrors, urlError));
		softAssert.assertAll();
	}


}
