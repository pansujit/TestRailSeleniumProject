package glide.backoffice.locators.users.backusers;

import org.openqa.selenium.By;

public class FilterBackusers {
	
	/**
	 * This locator will find Search button element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	public final By buttonTagSearchFilterBackusers= 
			By.xpath(".//div[@class='searchBackUsersForm_actions']/button[@class='ekButton searchBackUsersForm_actionsButton']");
	
	
	
	/**
	 * This locator will find Reset button element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	public final By buttonTagResetFilterBackusers= 
			By.xpath(".//div[@class='searchBackUsersForm_actions']/button[@class='ekButton ekButton--reverse searchBackUsersForm_actionsButton']");
	
	
	/**
	 * This locator will find Filter Button element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	public final By buttonTagFiltersFilterBackusers= By.xpath(".//div[@class='membersPage_filters']/button");
	
	
	/**
	 * This locator will find first name text box element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	public final By inputTagFirstnameFilterBackusers= By.xpath(".//input[@id='firstName']");
	
	
	/**
	 * This locator will find last name text box element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	public final By inputTagLastnameFilterBackusers= By.xpath(".//input[@id='lastName']");
	
	
	/**
	 * This locator will find email text box element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	public final By inputTagEmailFilterBackusers= By.xpath(".//input[@id='email']");
	
	
	/**
	 * This locator will find select tag role element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	public final By selectTagRoleFilterBackusers= By.xpath(".//select[@id='role']");

}
