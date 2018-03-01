package glide.backoffice.method.users.backusers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.users.backusers.AddBackuser;
import glide.backoffice.locators.users.backusers.HomepageBackusers;
import glide.backoffice.locators.users.backusers.ViewBackuser;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This Class contains all methods related to the Backuser homepage in back office and these method are called by main BackuserMethod
 * @author sujitpandey
 * @created on Feb 19, 2018 3:13:25 PM
 */
public class BackuserHomepageMethod {

	WebDriver driver;
	HomepageBackusers homepageBackusers;
	AddBackuser addBackuser;
	ViewBackuser viewBackuser;
	SoftAssert softAssert;
	public BackuserHomepageMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageBackusers=PageFactory.initElements(driver, HomepageBackusers.class);
		this.addBackuser=PageFactory.initElements(driver, AddBackuser.class);
		this.viewBackuser=PageFactory.initElements(driver, ViewBackuser.class);
		this.softAssert=new SoftAssert();
	}

	/**
	 * This method click on the Add a backuser button and wait until the Save Button in Add back user page appears.
	 */
	void clickOnAddABackuserButton() {
		SeleniumUtility.clickOnElement(driver,homepageBackusers.aTagAddABackuserHomepageBackusers );
		SeleniumUtility.waitElementToBeVisible(driver,addBackuser.buttonTagSaveEditBackuser);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method click on theView link of a given backuser  and wait until the Edit Button in Add back View page appears.  
	 * @param testBackuser - Should be String
	 */
	void clickOnViewButton(String testBackuser) {
		SeleniumUtility.clickOnElement(driver, homepageBackusers.buttonTagViewHomepageBackusers(testBackuser));
		SeleniumUtility.waitElementToBeVisible(driver, viewBackuser.aTagBackUserViewEdit);
		SeleniumUtility.fixedWait(1);

	}

	void assertAddEditBackuser(String email,String lastname,String firstname,String role) {
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageBackusers.spanTagLastnameHomepageBackusers(email), lastname));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageBackusers.spanTagFirstnameHomepageBackusers(email), firstname));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageBackusers.spanTagRoleHomepageBackusers(email), role));
		softAssert.assertTrue(!SeleniumUtility.getText(driver, homepageBackusers.spanTagStatusHomepageBackusers(email)).isEmpty());
		softAssert.assertAll();
	}

}
