package glide.backoffice.method.users.members;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
	public HomepageMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageMembers=PageFactory.initElements(driver, HomepageMembers.class);
		this.viewMember=PageFactory.initElements(driver, ViewMember.class);
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
	 
	

}
