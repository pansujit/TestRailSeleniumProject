package glide.backoffice.method.users.backusers;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.enums.BackuserRoles;
import glide.backoffice.locators.users.backusers.AddBackuser;
import glide.backoffice.locators.users.backusers.FilterBackusers;
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
	FilterBackusers filterBackusers;
	public BackuserHomepageMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageBackusers=PageFactory.initElements(driver, HomepageBackusers.class);
		this.addBackuser=PageFactory.initElements(driver, AddBackuser.class);
		this.viewBackuser=PageFactory.initElements(driver, ViewBackuser.class);
		this.softAssert=new SoftAssert();		this.viewBackuser=PageFactory.initElements(driver, ViewBackuser.class);
		this.filterBackusers=PageFactory.initElements(driver, FilterBackusers.class);

	}

	/**
	 * This method click on the Add a backuser button in back office
	 */
	void clickOnAddABackuserButton() {
		SeleniumUtility.clickOnElement(driver,homepageBackusers.aTagAddABackuserHomepageBackusers );
	}

	/**
	 * This method  waits until the ADD A Backuser button is displayed in backuser homepage in backoffice
	 */
	void waitUntilAddBackuesrButtonIsVisible() {
		SeleniumUtility.checkElementIsVisible(driver, homepageBackusers.aTagAddABackuserHomepageBackusers);
		SeleniumUtility.fixedWait(1);

	}
	/**
	 * This method click on theView link of a given backuser  and wait until the Edit Button in Add back View page appears.  
	 * @param testBackuser - Should be String
	 */
	void clickOnViewButton(String testBackuser) {
		SeleniumUtility.clickOnElement(driver, homepageBackusers.buttonTagViewHomepageBackusers(testBackuser));
		
	}
	
	void moveToBackUser(String email) {
		SeleniumUtility.moveToElementAction(driver, homepageBackusers.spanTagEmailHomepageBackusers(email));
		SeleniumUtility.fixedMilliSecondWait();
	}

	List<Boolean> assertAddEditBackuser(String email,String lastname,String firstname,String role) {
		List<Boolean> assertValue= new ArrayList<>();
		assertValue.add(0,SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageBackusers.spanTagFullnameHomepageBackusers(email), firstname+" "+lastname)); 
		assertValue.add(1,SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageBackusers.spanTagRoleHomepageBackusers(email),BackuserRoles.getBackUserValue(role)));
		return assertValue;
	}


}
