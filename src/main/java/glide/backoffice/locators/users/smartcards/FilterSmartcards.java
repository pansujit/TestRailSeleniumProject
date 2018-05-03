package glide.backoffice.locators.users.smartcards;

import org.openqa.selenium.By;

public class FilterSmartcards {
	/**
	 * This locator will find the Filter tag in Smartcard filter in the User Management->SmartCard-->Homepage
	 */
	public final By divTagFilterFilterSmartcards= By.xpath(".//div[@id='smartcards_filter_type_wrap']/div[1]/div[2]");
	
	/**
	 * This locator will find dropdown menu Element in Smartcard filter in the User Management->SmartCard-->Homepage
	 */
	public final By divTagMenuFilterSmartcards= By.xpath(".//div[@role='menu']");
	
	/**
	 * This locator will find Filter key Email Element in Smartcard filter in the User Management->SmartCard-->Homepage
	 */
	public final By divTagFilterKeyEmailFilterSmartcards= By.xpath(".//span[@id='smartcards_filter_type_userLogin']/div/div/div");
	
	/**
	 * This locator will find Filter Value Email Element in Smartcard filter in the User Management->SmartCard-->Homepage
	 */
	public final By inputTagFilterValueEmailFilterSmartcards= By.xpath(".//input[@id='smartcards_filter_value_input_userLogin']");
	
	/**
	 * This locator will find Confirm Button Element in Smartcard filter in the User Management->SmartCard-->Homepage
	 */
	public final By divTagConfirmFilterSmartcards= By.xpath(".//div[@id='smartcards_filter_confirm_button']");

	
	
}
