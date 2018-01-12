package glide.backoffice.locators.users.backusers;

import org.openqa.selenium.By;

public class ViewBackuser {
	/**
	 * This locator will find the Suspend tag in BackUsers view in the User Management->BackUsers->View
	 */
	public final By buttonTagBackUserViewSuspend= By.xpath(".//div[@class='backUserDetailPage_actions']/button");
	/**
	 * This locator will find the Edit tag in BackUsers view in the User Management->BackUsers->View
	 */
	public final By aTagBackUserViewEdit= By.xpath(".//div[@class='backUserDetailPage_actions']/a");
	

}
