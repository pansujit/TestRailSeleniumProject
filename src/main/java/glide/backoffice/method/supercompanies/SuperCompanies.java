package glide.backoffice.method.supercompanies;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.enums.ErrorMessages;
import glide.backoffice.locators.accounts.supercompanies.AddSC;
import glide.backoffice.locators.accounts.supercompanies.AddSCError;
import glide.backoffice.locators.accounts.supercompanies.HomepageSC;
import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.locators.headers.HeaderItem;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.utility.SeleniumUtility;

public class SuperCompanies {
	WebDriver driver;
	SoftAssert softAssert;
	SideMenuItemsMethod siteMenuItems;
	HeaderItem headerItem;
	HomepageSC homepageSC;
	AddSC addSC;
	AddSCError addSCError;
	public SuperCompanies() {

	}
	public SuperCompanies(WebDriver ldriver) {
		this.driver=ldriver;
		this.siteMenuItems=PageFactory.initElements(driver, SideMenuItemsMethod.class);
		this.softAssert=new SoftAssert();
		this.homepageSC=PageFactory.initElements(driver, HomepageSC.class);
		this.addSC=PageFactory.initElements(driver, AddSC.class);
		this.addSCError=PageFactory.initElements(driver, AddSCError.class);
		this.headerItem=PageFactory.initElements(driver, HeaderItem.class);
	}
	private void clickSuperCompanies() {
		siteMenuItems.clickOnSuperCompanies();
	}
	private void clickOnAddASuperCompany(SuperCompanyDto superCompanyDto) {
		SeleniumUtility.clickOnElement(driver, homepageSC.aTagAddSuperCompanyHomepageSC);
		SeleniumUtility.waitElementToBeVisible(driver, addSC.buttonTagSaveButtonAddSC);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.sendText(driver, addSC.inputTagNameAddSC,superCompanyDto.getCompanyName());
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.sendText(driver, addSC.inputTagAddressAddSC,superCompanyDto.getCompanyAddress());
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.sendText(driver, addSC.inputTagEmailAddSC, superCompanyDto.getEmail());
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.sendText(driver, addSC.inputTagPhoneNoAddSC, superCompanyDto.getPhoneNumber());
		SeleniumUtility.sendText(driver, addSC.inputTagTaxNumberAddSC, superCompanyDto.getTaxNumber());
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.sendText(driver, addSC.inputTagCapitalAddSC, superCompanyDto.getCapital());
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.sendText(driver, addSC.inputTagTOUUrlAddSC, superCompanyDto.getTermsURL());
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.sendText(driver, addSC.inputTagSubscriptionUrlAddSC, superCompanyDto.getSubscriptionURL());
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.sendText(driver, addSC.inputTagAllowLockUnlockAddSC, superCompanyDto.getLockUnlockTime());
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.sendText(driver, addSC.inputTagInvoiceNumberSuffixAddSC, superCompanyDto.getInvoiceNumberSuffix());
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.sendText(driver, addSC.inputTagLegalFormAddSC, superCompanyDto.getCompanyLegalForm());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByvalue(driver, addSC.selectTagEmailStylingAddSC, superCompanyDto.getEmailTemplate());
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.selectByVisibleText(driver, addSC.selectTagAppliedConfigurationAddSC, superCompanyDto.getConfiguration());
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.waitElementToBeVisible(driver, addSC.buttonTagSaveButtonAddSC);

	}
	private void clickOnSaveButton() {
		SeleniumUtility.clickOnElement(driver, addSC.buttonTagSaveButtonAddSC);
	}

	public void checkSuperCompanyHomePage() {
		clickSuperCompanies();
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.aTagAddSuperCompanyHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.tableTagTableSuperCompanyHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.buttonTagHeaderSCActionHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCEmailHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCNameHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCTaxNumberHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCVatNumberHomepageSC));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageSC.spanTagHeaderSCPhoneNoHomepageSC));
		softAssert.assertAll();

	}

	public void checkAllErrorInCreateSuperCompany(SuperCompanyDto superCompanyDto) {
		clickSuperCompanies();
		clickOnAddASuperCompany(superCompanyDto);
		clickOnSaveButton();
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

	public void integerToStringError(SuperCompanyDto superCompanyDto) {
		clickSuperCompanies();
		clickOnAddASuperCompany(superCompanyDto);
		clickOnSaveButton();
		SeleniumUtility.fixedWait(15);
		softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagCapitalErrorAddSC, ErrorMessages.NUMERIC_FIELD_ERROR));
		softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagTaxNumberErrorAddSC, ErrorMessages.NUMERIC_FIELD_ERROR));
		softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagEmailErrorAddSC, ErrorMessages.INVALID_EMAIL_ERROR));
		softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagPhoneNoErrorAddSC, ErrorMessages.NUMERIC_FIELD_ERROR));
		softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagTOUUrlErrorAddSC, ErrorMessages.INVALID_URL_ERROR));
		softAssert.assertTrue(SeleniumUtility.compareText(driver, addSCError.spanTagSubscriptionUrlErrorAddSC, ErrorMessages.INVALID_URL_ERROR));

		softAssert.assertAll();

	}

	public void createSuperCompany(SuperCompanyDto superCompanyDto) {
		boolean status=false;
		clickSuperCompanies();
		clickOnAddASuperCompany(superCompanyDto);
		clickOnSaveButton();
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
	public void display12() {
		//void
	}


}
