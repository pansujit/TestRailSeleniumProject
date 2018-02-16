package glide.backoffice.locators.users.members;

import org.openqa.selenium.By;

public class AddCommentMember {
	/**
	 * This Locator finds Comment textarea element in Users-->Members-->View-->actionMenu-->Comment
	 */
	public final By textareaTagCommentAddCommentMember= By.xpath(".//textarea[@id='memberView_commentForm_text_area']");
	
	/**
	 * This Locator finds Cancel Button element in Users-->Members-->View-->actionMenu-->Comment
	 */
	public final By buttonTagCancelAddCommentMember= By.xpath(".//button[@id='memberView_commentForm_cancel_button']");
	
	/**
	 * This Locator finds Submit Button element in Users-->Members-->View-->actionMenu-->Comment
	 */
	public final By spanTagSubmitAddCommentMember= By.xpath(".//button[@id='memberView_commentForm_push_button']");
	
	
}
