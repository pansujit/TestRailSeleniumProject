package glide.backoffice.locators.users.members;

import org.openqa.selenium.By;

public class ViewMember {
	
	/**
	 * This Locator will finds the button tag as technician in the Member's view page inside user management->member
	 */
	public final By aTagMemberViewTagAstechnician= By.xpath(".//div[@class='memberDetailPage_actions']/div/button[1]");
	/**
	 * This locator will Remove or add VIP Tag in the Member's view page inside user management->member
	 */
	public final By aTagMemberViewRemoveFromVIP= By.xpath(".//div[@class='memberDetailPage_actions']/div/button[2]");
	/**
	 * This locators will find the Reset Password tag in the Member's view page inside user management->member
	 */
	public final By aTagMemberViewResetPassword= By.xpath(".//div[@class='memberDetailPage_actions']/div/button[3]");
	/**
	 * This locator will find the Migrate tag in the Member's view page inside user management->member
	 */
	public final By aTagMemberViewMigrate= By.xpath(".//div[@class='memberDetailPage_actions']/div/button[4]");
	/**
	 * This locator will find the Suspend tag in the Member's view page inside user management->member
	 */
	public final By aTagMemberViewSuspend= By.xpath(".//div[@class='memberDetailPage_actions']/div/button[5]");
	/**
	 * This locator will find the Impersonate tag in the Member's view page inside user management->member
	 */
	public final By aTagMemberViewImpersonate= By.xpath(".//div[@class='memberDetailPage_actions']/div/button[6]");
	/**
	 * This locators will find the Add Comment Tag in the Member's view page inside user management->member
	 */
	public final By aTagMemberViewAddComment= By.xpath(".//div[@class='memberDetailPage_actions']/button");
	/**
	 * This locator will find status tag of the Personal information in the Member's 
	 * view page inside user management->member 
	 */
	public final By aTagMemberViewStausMI= By.xpath(".//div[@id='mainContainer']/div/div/div/div[2]/section[1]/div[2]/div[2]/span[2]/span/span");
	/**
	 * This locator will find Accept or Reject personal information in the 
	 * Member's view page inside user management->member
	 */
	public final By aTagMemberViewAcceptRejectInformationMI= By.xpath(".//div[@id='mainContainer']/div/div/div/div[2]/section[1]/div[7]/button[1]");
	/**
	 * This locator will find Back to List tag in the Member's view page inside user management->member
	 */
	public final By aTagMemberViewBackToList= By.xpath(".//a[@class='backLink']");
	/**
	 * This locator will find  Reject personal information in the 
	 * Member's view page only when the user is just applied inside user management->member
	 */
	public final By aTagMemberViewRejectInformationMI= By.xpath(".//div[@id='mainContainer']/div/div/div/div[2]/section[1]/div[7]/button[2]");
	

}
