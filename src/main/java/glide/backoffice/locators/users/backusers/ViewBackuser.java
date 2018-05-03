package glide.backoffice.locators.users.backusers;

import org.openqa.selenium.By;

public class ViewBackuser {
	/**
	 * This locator will find the Suspend tag in BackUsers view in the User Management->BackUsers->View
	 */
	public final By buttonTagSuspendViewBackuser= By.xpath(".//div[@class='backUserDetailPage_actions']/button");
	/**
	 * This locator will find the Edit tag in BackUsers view in the User Management->BackUsers->View
	 */
	public final By aTagEditViewBackuser= By.xpath(".//div[@class='backUserDetailPage_actions']/a");
	
	/**
	 * This locator will find email address element in BackUsers view in the User Management->BackUsers->View
	 */
	public final By spanTagEmailAddressViewBackuser(String email) {
		String text=".//span[2 and @class='backUserDetail_item_result' and text()='xxxx']";
		return  By.xpath(text.replace("xxxx", email));
	}
			
	
	
}
