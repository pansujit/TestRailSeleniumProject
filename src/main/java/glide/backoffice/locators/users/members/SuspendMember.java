package glide.backoffice.locators.users.members;

import org.openqa.selenium.By;

public class SuspendMember {
	/**
	 * This Locator finds Comment input text element in the view section of the members in Users-->Members-->View-->Suspend
	 */
	public final By textareaTagCommentSuspendMember= By.xpath(".//textarea[@id='memberView_commentForm_text_area']");
	
	/**
	 * This Locator finds  Cancel element in the view section of the members in Users-->Members-->View-->Suspend
	 */
	public final By buttonTagCancelSuspendMember= By.xpath(".//button[@id='memberView_commentForm_cancel_button']");
	

	/**
	 * This Locator finds Confirm element in the view section of the members in Users-->Members-->View-->Suspend
	 */
	public final By spanTagConfirmSuspendMember= By.xpath(".//button[@id='memberView_commentForm_push_button']");
	

	/**
	 * This Locator finds Title header element in the view section of the members in Users-->Members-->View-->Suspend
	 */
	public final By spanTagTitleSuspendMember= By.xpath(".//h4[@class='memberCommentForm_title']/span/span");

	

}
