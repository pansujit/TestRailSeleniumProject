package glide.backoffice.method.users.members;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.users.members.HomepageMembers;
import glide.backoffice.locators.users.members.ViewMember;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This class contains all the method required for the Homepage of a member
 * @author sujitpandey
 * @created on Feb 16, 2018 4:45:06 PM
 */
public class HomepageMethod {
	
	WebDriver driver;
	HomepageMembers homepageMembers; 
	ViewMember viewMember;
	SoftAssert softAssert;
	public HomepageMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageMembers=PageFactory.initElements(driver, HomepageMembers.class);
		this.viewMember=PageFactory.initElements(driver, ViewMember.class);
		this.softAssert=new SoftAssert();
	}
	/**
	 * This private method click on the view link of a given member
	 * @param text - Should be String (Email)
	 */
	void clickOnViewLinkOfMember(String text) {
		SeleniumUtility.clickOnElement(driver, homepageMembers.buttonTagViewHomepageMembers(text));
		SeleniumUtility.waitElementToBeVisible(driver, viewMember.buttonTagMenuForViewActionViewMembers);
		SeleniumUtility.fixedMilliSecondWait();
	}
	/**
	 * This method should be refactor for the reusability
	 * This method compare the given text to the table element's text and returns the boolean
	 * @param email
	 * @param vip
	 * @param firstname
	 * @param lastname
	 */
	void assertFilterMemberMethod(String email,String vip,String firstname,String lastname) {
		if(email!=null) {
			softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageMembers.spanTagEmailHomepageMembers(email))
					,"The email "+email+ " in the member table is not available " );

		}
		if(email==null && vip==null && firstname!=null && lastname==null) {
			softAssert.assertTrue(SeleniumUtility.compareTextInWebElements(driver, homepageMembers.spanTagAllFirstnameHomepageMembers, firstname),
					"Either member table is not available or the given firstname "+firstname+" is not matching with existing one");

		}
		if(email==null && vip!=null && firstname==null && lastname==null) {
			softAssert.assertTrue(SeleniumUtility.compareTextInWebElements(driver, homepageMembers.spanTagAllVIPnameHomepageMembers, vip),
			"Either member table is not available or the given VIP "+vip+" is not matching with existing one");
		}
		
		if(email==null && vip==null && firstname==null && lastname!=null) {
			softAssert.assertTrue(SeleniumUtility.compareTextInWebElements(driver, homepageMembers.spanTagAllLastnameHomepageMembers, lastname),
					"Either member table is not available or the given lastname "+lastname+" is not matching with existing one");
		}

		
		softAssert.assertAll();
	}
	 
	

}
