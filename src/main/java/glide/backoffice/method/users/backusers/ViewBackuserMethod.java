package glide.backoffice.method.users.backusers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.users.backusers.AddBackuser;
import glide.backoffice.locators.users.backusers.ViewBackuser;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This class contains all methods in the View page of back user in back office and all these methods are invoked by the BackuserMethod
 * @author sujitpandey
 * @created on Feb 19, 2018 3:16:32 PM
 */
public class ViewBackuserMethod {

	WebDriver driver;
	AddBackuser addBackuser;
	ViewBackuser viewBackuser;
	SoftAssert softAssert;
	//Constructor for the ViewBackuserMethod
	public ViewBackuserMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addBackuser=PageFactory.initElements(driver, AddBackuser.class);
		this.viewBackuser=PageFactory.initElements(driver, ViewBackuser.class);
		this.softAssert=new SoftAssert();

	}
	/**
	 * This method click on the Edit button in the Backuser view page in back office
	 */
	void clickOnEditButton() {
		SeleniumUtility.clickOnElement(driver,viewBackuser.aTagBackUserViewEdit);
	}
	/**
	 * This method waits until the edit button is visible of view page of back user in back office
	 */
	void waitUntilEditButtonIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, viewBackuser.aTagBackUserViewEdit);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method asserts that edit button is visible in view page of the back user in back office
	 */
	void assertViewBackuser() {
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, viewBackuser.aTagBackUserViewEdit));
		softAssert.assertAll();
	}

}
