package glide.backoffice.method.accounts.hotlines;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.hotlines.AddHotline;
import glide.backoffice.locators.accounts.hotlines.HomepageHotlines;
import glide.backoffice.utility.SeleniumUtility;

public class HomepageHotlineMethod {
	WebDriver driver;
	HomepageHotlines homepageHotlines;
	AddHotline addHotline;
	SoftAssert softAssert;
	public HomepageHotlineMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageHotlines=PageFactory.initElements(driver, HomepageHotlines.class);
		this.addHotline=PageFactory.initElements(driver, AddHotline.class);
		this.softAssert=new SoftAssert();
	}
	/**
	 * This method click on the edit button of the given element and wait for save button in edit page is displayed in hotlines.
	 * @param hotlineName - Should be String
	 */
	void clickOnEditButton(String hotlineName) {
		SeleniumUtility.clickOnElement(driver, homepageHotlines.buttonTagTableEditHomepageHotlines(hotlineName));
		SeleniumUtility.waitElementToBeVisible(driver, addHotline.buttonTagSaveEditHotline);
		SeleniumUtility.fixedMilliSecondWait();
	}
	/**
	 * This method assert the given hotline in the homepage with given properties.
	 * @param hotlineName - Should be String
	 * @param email - Should be String
	 * @param phoneNumber - Should be String
	 */
	void assertAddEditHotline(String hotlineName, String email,String phoneNumber) {
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				homepageHotlines.spanTagTableEmailHomepageHotlines(hotlineName), email));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,
				homepageHotlines.spanTagTablePhoneHomepageHotlines(hotlineName), phoneNumber));
		softAssert.assertAll();
	}
	/**
	 * This method click on the add a hotline button in hotline homepage and wait until the save button in add hotline page is displayed.
	 */
	void addANewHotline() {
		SeleniumUtility.clickOnElement(driver, homepageHotlines.aTagAddAHotlineHomepageHotlines);
		SeleniumUtility.waitElementToBeVisible(driver, addHotline.buttonTagSaveEditHotline);
		SeleniumUtility.fixedMilliSecondWait();
	}

}
