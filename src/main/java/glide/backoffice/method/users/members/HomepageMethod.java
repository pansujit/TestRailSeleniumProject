package glide.backoffice.method.users.members;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.users.members.HomepageMembers;
import glide.backoffice.utility.SeleniumUtility;

class HomepageMethod {
	
	WebDriver driver;
	HomepageMembers homepageMembers; 
	public HomepageMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageMembers=PageFactory.initElements(driver, HomepageMembers.class);
	}
	
	private void clickOnViewLinkOfMember(String text) {
		SeleniumUtility.clickOnElement(driver, homepageMembers.buttonTagViewHomepageMembers(text));
	}
	

}
