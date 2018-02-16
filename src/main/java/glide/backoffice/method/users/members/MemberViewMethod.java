package glide.backoffice.method.users.members;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.users.members.ActionMenuMember;
import glide.backoffice.locators.users.members.ViewMember;
import glide.backoffice.utility.SeleniumUtility;

public class MemberViewMethod {
	WebDriver driver;
	ViewMember viewMember;
	ActionMenuMember actionMenuMember;
	public MemberViewMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.viewMember=PageFactory.initElements(driver, ViewMember.class);
		this.actionMenuMember=PageFactory.initElements(driver, ActionMenuMember.class);

	}
	/**
	 * This method click on the Action menu icons in view member page and wait until the drop-down menu is displayed.
	 */
	 void clickOnActionMenuIcon() {
		SeleniumUtility.clickOnElement(driver, viewMember.buttonTagMenuForViewActionViewMembers);
		SeleniumUtility.waitElementToBeVisible(driver, actionMenuMember.spanTagResetPasswordActionMenuMembers);
		SeleniumUtility.fixedMilliSecondWait();
	}

}
