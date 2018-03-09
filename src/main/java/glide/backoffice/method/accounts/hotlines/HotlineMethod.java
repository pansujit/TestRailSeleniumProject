package glide.backoffice.method.accounts.hotlines;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.dataprovider.ErrorMessages;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;

public class HotlineMethod {
	WebDriver driver;
	AddEditHotlineMethod addEditHotlineMethod;
	HomepageHotlineMethod homepageHotlineMethod;
	HeaderMethod headerMethod;
	public HotlineMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageHotlineMethod=PageFactory.initElements(driver, HomepageHotlineMethod.class);
		this.addEditHotlineMethod=PageFactory.initElements(driver, AddEditHotlineMethod.class);
		this.headerMethod= PageFactory.initElements(driver, HeaderMethod.class);
	}
	/**
	 * This public method create a new hotline in the system and check its value on the hotline table
	 * @param hotlineDto - Should be HotlineDto
	 */
	public void addAHotline(HotlineDto hotlineDto) {
		homepageHotlineMethod.addANewHotline();
		addEditHotlineMethod.waitUntilSaveButtonIsVisible();
		addEditHotlineMethod.inputDataForhotline(hotlineDto);
		addEditHotlineMethod.clickOnSaveButtonHotline();
		homepageHotlineMethod.waitUntilAddHotlineButtonIsVisible();
		homepageHotlineMethod.assertAddEditHotline(hotlineDto.getHotlineName(),hotlineDto.getHotlineEmail(), hotlineDto.getPhoneNumber());		
	}
	/**
	 * This public method Edit a given hotline in the system and check its modification on the hotline table
	 * @param hotlineDto - Should be HotlineDto
	 */
	public void editAHotline(HotlineDto hotlineDto) {
		homepageHotlineMethod.clickOnEditButton(Config.getProperty("EDIT_HOTLINE"));
		addEditHotlineMethod.inputDataForhotline(hotlineDto);
		addEditHotlineMethod.clickOnSaveButtonHotline();
		homepageHotlineMethod.waitUntilAddHotlineButtonIsVisible();
		homepageHotlineMethod.assertAddEditHotline(Config.getProperty("EDIT_HOTLINE"), hotlineDto.getHotlineEmail(), "+33"+hotlineDto.getPhoneNumber());
	}
	/**
	 * This public method clicks on the save button without adding data and checks the error message in add/edit hotline
	 */
	public void mandatoryFieldCheckError() {
		homepageHotlineMethod.addANewHotline();
		addEditHotlineMethod.waitUntilSaveButtonIsVisible();
		addEditHotlineMethod.clickOnSaveButtonHotline();
		addEditHotlineMethod.assertErrorMandatoryFieldCheck(ErrorMessages.FIELD_IS_REQUIRED);
		headerMethod.clickOnHeaderBackButton();
	}
	/**
	 * This public method verifies that if the data is given in unacceptable format.
	 */
	public void inputFieldCheckError() {
		homepageHotlineMethod.addANewHotline();
		addEditHotlineMethod.waitUntilSaveButtonIsVisible();
		addEditHotlineMethod.inputDataForhotline(HotlineDto.builder().hotlineEmail("hello").build());
		addEditHotlineMethod.clickOnSaveButtonHotline();
		addEditHotlineMethod.inputTypeErrorCheck(ErrorMessages.INVALID_EMAIL_ERROR);
		headerMethod.clickOnHeaderBackButton();
	}
	
}
