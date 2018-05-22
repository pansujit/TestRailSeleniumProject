package glide.backoffice.locators.users.backusers;

import org.openqa.selenium.By;

public class FilterBackusers {
	
	/**
	 * This locator will find filter tag element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	
	public final By divTagFilterFilterBackusers= By.xpath(".//div[@id='backusers_filters_filter_type_wrap']/div[1]/div[2]");

	/**
	 * This will find Click to Dropdown element in filter in User Management->BackUsers->Homepage-->Filters
	 */
	public final By divTagClickToDropdownCommonFilterBackusers= By.xpath(".//div[@class='advancedList_filtersInput']/div");

	
	/**
	 * This locator will find filter key dropdown menu  element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	
	public final By divTagDropdownMenuFilterBackusers= By.xpath(".//div[@role='menu']");
	
	/**
	 * This locator will find filter key First name in dropdown menu  element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	
	public final By divTagFilterKeyFirstnameFilterBackusers= By.xpath(".//span[@id='backusers_filters_filter_type_firstName']/div/div/div");
	
	/**
	 * This locator will find filter key Last name in dropdown menu  element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	
	public final By divTagFilterKeyLastnameFilterBackusers= By.xpath(".//span[@id='backusers_filters_filter_type_lastName']/div/div/div");
	
	/**
	 * This locator will find filter key email in dropdown menu  element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	
	public final By divTagFilterKeyEmailFilterBackusers= By.xpath(".//span[@id='backusers_filters_filter_type_email']/div/div/div");
	/**
	 * This locator will find filter key Role in dropdown menu  element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	
	public final By divTagFilterKeyRoleFilterBackusers= By.xpath(".//span[@id='backusers_filters_filter_type_role']/div/div/div");
	
	
	/**
	 * This locator will find filter key Value in dropdown menu  element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	
	public final By divTagFilterValueRoleFilterBackusers(String roleName) {
		String text= ".//span[@id='backusers_filters_filter_value_ROLE_xxxx']/div/div/div";
		return By.xpath(text.replace("xxxx", roleName));
	}
	
	/**
	 * This locator will find filter value Last name in dropdown menu  element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	public final By inputTagFilterValueLastnameFilterBackusers= By.xpath(".//input[@id='backusers_filters_filter_value_input_lastName']");
	
	
	/**
	 * This locator will find filter value First name in dropdown menu  element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	public final By inputTagFilterValueFirstnameFilterBackusers= By.xpath(".//input[@id='backusers_filters_filter_value_input_firstName']");
	
	
	/**
	 * This locator will find filter value Email in dropdown menu  element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	public final By inputTagFilterValueEmailFilterBackusers= By.xpath(".//input[@id='backusers_filters_filter_value_input_email']");
	
	
	/**
	 * This locator will find filter FilterConfirm Button element in homepage in the User Management->BackUsers->Homepage-->Filters
	 */
	public final By divTagFilterConfirmFilterBackusers= By.xpath(".//div[@id='backusers_filters_filter_confirm_button']");




}
