package glide.backoffice.method.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.common.BackOfficeHomepage;
import glide.backoffice.locators.users.Members;
import glide.backoffice.locators.users.UsersManagementHomepage;
import glide.backoffice.utility.SeleniumUtility;

public class MemberMethod {
	
	WebDriver driver;
	BackOfficeHomepage backOfficeHomepage;
	UsersManagementHomepage usersManagementHomepage;
	Members member;
	public MemberMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.backOfficeHomepage=PageFactory.initElements(driver, BackOfficeHomepage.class);
		this.member=PageFactory.initElements(driver, Members.class);	
		this.usersManagementHomepage=PageFactory.initElements(driver, UsersManagementHomepage.class);
	}
	
	public void clickOnMember() {
		if(!(SeleniumUtility.containsText(SeleniumUtility.getAttribute(driver, backOfficeHomepage.buttonTagUsersBackOfficeHomepage,"class"),"is_open"))) {
			SeleniumUtility.clickOnElement(driver, backOfficeHomepage.buttonTagUsersBackOfficeHomepage);
			SeleniumUtility.WaitElementToBeClickable(driver, usersManagementHomepage.liTagUsersManagementHomepageMembers);
			SeleniumUtility.fixedWait(1);
			SeleniumUtility.clickOnElement(driver, usersManagementHomepage.liTagUsersManagementHomepageMembers);
		}
		if(!(SeleniumUtility.containsText(SeleniumUtility.getAttribute(driver, member.buttonTagFilterMember,"class"),"is_opened"))) {
			SeleniumUtility.clickOnElement(driver, member.buttonTagFilterMember);
		}
		SeleniumUtility.WaitElementToBeClickable(driver, member.buttonTagFilterSearch);
		SeleniumUtility.selectByVisibleText(driver, member.selectTagFilterValidationStatus, "Applied");
		SeleniumUtility.clickOnElement(driver, member.buttonTagFilterSearch);
		SeleniumUtility.WaitElementToBeStale(driver, member.divTagFilterLoadingLogo);
		SeleniumUtility.fixedWait(1);

	

	}

}
