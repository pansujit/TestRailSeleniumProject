package glide.backoffice.locators.users.members;

import org.openqa.selenium.By;

public class ViewMember {
	
	/**
	 * This Locator finds member name element in the view section of the members in Users-->Members-->View
	 */
	public final By h3TagMemberNameViewMembers= By.xpath(".//h3[@class='memberView_user_name']");
	
	/**
	 * This Locator finds button tag from right side to display dropdown element in the view section of the members in Users-->Members-->View
	 */
	public final By buttonTagMenuForViewActionViewMembers= By.xpath(".//div[@class='memberView_header_right']//button");
}
