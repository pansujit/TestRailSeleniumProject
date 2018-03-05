package glide.backoffice.method.supercompanies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.dataprovider.ErrorMessages;
import glide.backoffice.locators.accounts.supercompanies.AddSC;
import glide.backoffice.locators.accounts.supercompanies.AddSCError;
import glide.backoffice.locators.accounts.supercompanies.HomepageSC;
import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This class contains all the methods in the Add super company page and edit a super company page.
 * @author sujitpandey
 * @created on Feb 19, 2018 3:56:05 PM
 */
public class AddEditSuperCompanyMethod {
	WebDriver driver;
	AddSC addSC;
	AddSCError addSCError;
	SoftAssert softAssert;
	HomepageSC homepageSC;
	//Constructor with webdriver initialization
	public AddEditSuperCompanyMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addSC=PageFactory.initElements(driver, AddSC.class);
		this.softAssert=new SoftAssert();
		this.addSCError=PageFactory.initElements(driver, AddSCError.class);
		this.homepageSC=PageFactory.initElements(driver, HomepageSC.class);

	}
	
	/**
	 * This method  fill or select, all fields in Add/Edit super company fields with given input
	 * @param superCompanyDto - Should be SuperCompanyDto
	 */
	void inputAddASuperCompany(SuperCompanyDto superCompanyDto) {
		SeleniumUtility.clearTextAndSendText(driver, addSC.inputTagNameAddSC,superCompanyDto.getCompanyName());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.clearTextAndSendText(driver, addSC.inputTagAddressAddSC,superCompanyDto.getCompanyAddress());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.clearTextAndSendText(driver, addSC.inputTagEmailAddSC, superCompanyDto.getEmail());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.clearTextAndSendText(driver, addSC.inputTagPhoneNoAddSC, superCompanyDto.getPhoneNumber());
		SeleniumUtility.clearTextAndSendText(driver, addSC.inputTagTaxNumberAddSC, superCompanyDto.getTaxNumber());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.clearTextAndSendText(driver, addSC.inputTagCapitalAddSC, superCompanyDto.getCapital());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.clearTextAndSendText(driver, addSC.inputTagTOUUrlAddSC, superCompanyDto.getTermsURL());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.clearTextAndSendText(driver, addSC.inputTagSubscriptionUrlAddSC, superCompanyDto.getSubscriptionURL());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.clearTextAndSendText(driver, addSC.inputTagAllowLockUnlockAddSC, superCompanyDto.getLockUnlockTime());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.clearTextAndSendText(driver, addSC.inputTagInvoiceNumberSuffixAddSC, superCompanyDto.getInvoiceNumberSuffix());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.clearTextAndSendText(driver, addSC.inputTagLegalFormAddSC, superCompanyDto.getCompanyLegalForm());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByvalue(driver, addSC.selectTagEmailStylingAddSC, superCompanyDto.getEmailTemplate());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, addSC.selectTagAppliedConfigurationAddSC, superCompanyDto.getConfiguration());
		SeleniumUtility.fixedWait(1);
		
	}
	/**
	 * This method click on the Save button in the SaveButton in the Add/Edit super company page
	 */
	 void clickOnSaveButton() {
		SeleniumUtility.clickOnElement(driver, addSC.buttonTagSaveButtonAddSC);
		
		
	}
		/**
		 * This method click on the Save button in the cancelButton in the Add/Edit super company page
		 */
		 void clickOnCancelButton() {
			SeleniumUtility.clickOnElement(driver, addSC.aTagCancelButtonAddSC);
			SeleniumUtility.waitElementToBeVisible(driver, homepageSC.aTagAddSuperCompanyHomepageSC);
			SeleniumUtility.fixedWait(5);
		}
	 /**
	  * This method verifies the Error in Add super companies page when non of the fields are filled or selected.
	  */
	 void validateSuperCompanyAddError() {
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, addSCError.spanTagAddressErrorAddSC));
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,addSCError.spanTagAllowLockUnlockErrorAddSC ));
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,addSCError.spanTagAppliedConfigurationErrorAddSC ));
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,addSCError.spanTagCapitalErrorAddSC ));
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, addSCError.spanTagEmailErrorAddSC));
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,addSCError.spanTagEmailStylingErrorAddSC ));
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, addSCError.spanTagInvoiceNumberSuffixErrorAddSC));
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,addSCError.spanTagLagalFormErrorAddSC ));
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, addSCError.spanTagNameErrorAddSC));
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,addSCError.spanTagPhoneNoErrorAddSC ));
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,addSCError.spanTagTaxNumberErrorAddSC ));
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,addSCError.spanTagTOUUrlErrorAddSC ));
			softAssert.assertAll();
	 }
	 /**
	  * This method verifies the interger/String only error when misplace the contents (eg. String --> Integer and viceversa)
	  */
	 void validateIntegerToStringError() {
			softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagCapitalErrorAddSC, ErrorMessages.INTEGER_FIELD_ERROR));
			softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagTaxNumberErrorAddSC, ErrorMessages.INTEGER_FIELD_ERROR));
			softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagEmailErrorAddSC, ErrorMessages.INVALID_EMAIL_ERROR));
			softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagPhoneNoErrorAddSC, ErrorMessages.INTEGER_FIELD_ERROR));
			softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagTOUUrlErrorAddSC, ErrorMessages.INVALID_URL_ERROR));
			softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagSubscriptionUrlErrorAddSC, ErrorMessages.INVALID_URL_ERROR));
			softAssert.assertAll();

	 }
}
