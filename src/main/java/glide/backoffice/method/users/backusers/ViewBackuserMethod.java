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
	 * This method click on the Edit button in the Backuser view page and wait until the Save button is appeared in Edit backuser page
	 */
	 void clickOnEditButton() {
		SeleniumUtility.clickOnElement(driver,viewBackuser.aTagBackUserViewEdit);
		SeleniumUtility.waitElementToBeVisible(driver, addBackuser.buttonTagSaveEditBackuser);
		SeleniumUtility.fixedWait(1);
	}
	 void assertViewBackuser() {
		 softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, viewBackuser.aTagBackUserViewEdit));
		 softAssert.assertAll();
	 }

}
