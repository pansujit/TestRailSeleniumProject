package glide.backoffice.locators.users;

import org.openqa.selenium.By;

/**
 * This class contains all the locators user view  page of the back-user in User management
 * @author sujitpandey
 *
 */
public class BackUserView {


	/**
	 * This locator will find the Suspend tag in BackUsers view in the User Management->BackUsers->View
	 */
	final public By buttonTagBackUserViewSuspend= By.xpath(".//div[@class='backUserDetailPage_actions']/button");
	/**
	 * This locator will find the Edit tag in BackUsers view in the User Management->BackUsers->View
	 */
	final public By aTagBackUserViewEdit= By.xpath(".//div[@class='backUserDetailPage_actions']/a");
	
}
