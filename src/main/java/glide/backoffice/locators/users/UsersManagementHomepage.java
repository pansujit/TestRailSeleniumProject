package glide.backoffice.locators.users;

import org.openqa.selenium.By;

/**
 * This class contains all the locator in the Users management dropdown
 * @author sujitpandey
 *
 */
public class UsersManagementHomepage {
	
	//.//li[@class='sideMenu_section sideMenu_section--membersManagement']
	/**
	 * This locator will find Member tag in the User Management
	 */
	final public By liTagUsersManagementHomepageMembers= By.xpath(".//li[@class='sideMenu_section sideMenu_section--members']");
	/**
	 * This locator will find Back Users tag in the User Management
	 */
	final public By liTagUsersManagementHomepageBackUsers= By.xpath(".//li[@class='sideMenu_section sideMenu_section--backUsers']");
	/**
	 * This locator will find Smart card tag in the User Management
	 */
	final public By liTagUsersManagementHomepageSmartCards= By.xpath(".//li[@class='sideMenu_section sideMenu_section--smartcards']");
	/**
	 * This locator will find Smart card Events tag in the User Management
	 */
	final public By liTagUsersManagementHomepageSmartCardEvents= By.xpath(".//li[@class='sideMenu_section sideMenu_section--smartcardsEvents']");

}
