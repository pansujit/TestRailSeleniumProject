package glide.backoffice.method.users.members;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.users.members.ActionMenuMember;
import glide.backoffice.locators.users.members.AddCommentMember;
import glide.backoffice.utility.SeleniumUtility;

public class MemberActionMenuMethod {
	WebDriver driver;
	ActionMenuMember actionMenuMember;
	AddCommentMember addCommentMember;
	public MemberActionMenuMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.actionMenuMember=PageFactory.initElements(driver, ActionMenuMember.class);
		this.addCommentMember=PageFactory.initElements(driver, AddCommentMember.class);
	}
	/**
	 * This method Click on the  Suspend link in drop-down action menu in view page of member
	 */
	 void clickOnSuspend() {
		SeleniumUtility.clickOnElement(driver, actionMenuMember.spanTagSuspendActionMenuMembers);
		SeleniumUtility.fixedMilliSecondWait();
		}
	 void clickOnResetPassword() {
		SeleniumUtility.clickOnElement(driver, actionMenuMember.spanTagResetPasswordActionMenuMembers);
		SeleniumUtility.fixedMilliSecondWait();
	}
	 void clickOnResetEmail() {
		SeleniumUtility.clickOnElement(driver, actionMenuMember.spanTagResetEmailActionMenuMembers);		
		SeleniumUtility.fixedMilliSecondWait();
	}
	 void clickOnMigrate() {
		SeleniumUtility.clickOnElement(driver, actionMenuMember.spanTagMigrateActionMenuMembers);
		SeleniumUtility.fixedMilliSecondWait();
	}
	private void clickOnImpersonate() {
		SeleniumUtility.clickOnElement(driver, actionMenuMember.spanTagImpersonateActionMenuMembers);
		SeleniumUtility.fixedMilliSecondWait();
	}
	 void clickOnTagAsTechnician() {
		SeleniumUtility.clickOnElement(driver, actionMenuMember.spanTagTagAsTechActionMenuMembers);
		SeleniumUtility.fixedMilliSecondWait();
	}
	 void clickOnTagAsVIP() {
		SeleniumUtility.clickOnElement(driver, actionMenuMember.spanTagTagAsVIPActionMenuMembers);
		SeleniumUtility.fixedMilliSecondWait();
	}
	 /**
	  * This method click on the Add a comment link in drop-down in view page of a member
	  */
	 void clickOnComment() {
		SeleniumUtility.clickOnElement(driver, actionMenuMember.spanTagCommentActionMenuMembers);
		SeleniumUtility.waitElementToBeVisible(driver, addCommentMember.spanTagSubmitAddCommentMember);
		SeleniumUtility.fixedMilliSecondWait();

	}
	 /**
	  * This method click add a comment in comment box of a member.
	  */
	void addTextOnCommentBox() {
		clickOnComment();
		SeleniumUtility.clearTextAndSendText(driver, addCommentMember.textareaTagCommentAddCommentMember, "hello test");
		SeleniumUtility.clickOnElement(driver, addCommentMember.spanTagSubmitAddCommentMember);
	}


	
	
	

}
