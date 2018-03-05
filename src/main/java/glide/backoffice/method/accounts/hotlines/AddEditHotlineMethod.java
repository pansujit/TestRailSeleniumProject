package glide.backoffice.method.accounts.hotlines;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.hotlines.AddHotline;
import glide.backoffice.locators.accounts.hotlines.HomepageHotlines;
import glide.backoffice.utility.SeleniumUtility;

public class AddEditHotlineMethod {
	WebDriver driver;
	HomepageHotlines homepageHotlines;
	AddHotline addHotline;
	SoftAssert softAssert;
	public AddEditHotlineMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageHotlines=PageFactory.initElements(driver, HomepageHotlines.class);
		this.addHotline=PageFactory.initElements(driver, AddHotline.class);
		this.softAssert=new SoftAssert();
	}
	/**
	 * This method input the values  in the edit/add hotline parameters.
	 * @param hotlineDto - Should be HotlineDto
	 */
	void inputDataForhotline(HotlineDto hotlineDto) {
		SeleniumUtility.clearTextAndSendText(driver, addHotline.inputTagNameEditHotline, hotlineDto.getHotlineName());
		SeleniumUtility.clearTextAndSendText(driver, addHotline.inputTagCustServiceEmailEditHotline, hotlineDto.getHotlineEmail());

		if(SeleniumUtility.checkElementIsVisible(driver, addHotline.inputTagPhoneNumberEditHotline)) {
			SeleniumUtility.clearTextAndSendText(driver, addHotline.inputTagPhoneNumberEditHotline, hotlineDto.getPhoneNumber());
		}
		else {
			SeleniumUtility.clickOnElement(driver, addHotline.buttonTagAddAPhoneNumberEditHotline);
			SeleniumUtility.fixedMilliSecondWait();
			SeleniumUtility.clearTextAndSendText(driver, addHotline.inputTagPhoneNumberEditHotline, hotlineDto.getPhoneNumber());
		}
	}

	/**
	 * This method click on save button of the edit/add hotline and wait until the add a hotline button is displayed.
	 */
	void clickOnSaveButtonHotline() {
		SeleniumUtility.clickOnElement(driver, addHotline.buttonTagSaveEditHotline);
		SeleniumUtility.waitElementToBeVisible(driver, homepageHotlines.aTagAddAHotlineHomepageHotlines);
		SeleniumUtility.fixedWait(1);
	}
}
