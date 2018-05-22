package glide.backoffice.locators.users.smartcardevents;

import org.openqa.selenium.By;

public class FilterSmartcardEvents {
	
	/**
	 * This locator finds filter tag in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By divTagFilterFilterSmartcardEvents= By.xpath(".//div[@id='smartcardsEvents_filter_type_wrap']/div[1]/div[2]");
	/**
	 * This locator finds element to click in filter value  to display dropdown menu 
	 * in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By divTagClickToDropdownCommonFilterSmartcardEvents= By.xpath(".//div[@class='advancedList_filtersInput']/div");
	/**
	 * This locator finds Filter dropdown in key and value side in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By divTagFilterDropdownFilterSmartcardEvents= By.xpath(".//div[@role='menu']");
	/**
	 * This locator finds Action filter key in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By divTagFilterKeyActionFilterSmartcardEvents= By.xpath(".//span[@id='smartcardsEvents_filter_type_action']/div/div/div");
	/**
	 * This locator finds Results filter key in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By divTagFilterKeyResultFilterSmartcardEvents= By.xpath(".//span[@id='smartcardsEvents_filter_type_result']/div/div/div");
	/**
	 * This locator finds Start date filter key in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By divTagFilterKeyStartDateFilterSmartcardEvents= By.xpath(".//span[@id='smartcardsEvents_filter_type_startdate']/div/div/div");
	/**
	 * This locator finds End date filter key in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By divTagFilterKeyEndDateFilterSmartcardEvents= By.xpath(".//span[@id='smartcardsEvents_filter_type_endDate']/div/div/div");
	/**
	 * This locator finds card Id filter key in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By divTagFilterKeyCardIdFilterSmartcardEvents= By.xpath(".//span[@id='smartcardsEvents_filter_type_smartcardCardId']/div/div/div");
	/**
	 * This locator finds User email filter key in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By divTagFilterKeyUserEmailFilterSmartcardEvents= By.xpath(".//span[@id='smartcardsEvents_filter_type_userLogin']/div/div/div");
	/**
	 * This locator finds Vehicle Registration Number filter key in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By divTagFilterKeyPlateNumberFilterSmartcardEvents= 
			By.xpath(".//span[@id='smartcardsEvents_filter_type_vehicleRegistrationNumber']/div/div/div");
	/**
	 * This locator finds input card id in filter value in the User Management->SmartCard events-->Homepage
	 */
	public final By inputTagFilterValueCardIdFilterSmartcardEvents= 
			By.xpath(".//input[@id='smartcardsEvents_filter_value_input_smartcardCardId']");
	/**
	 * This locator finds input user email in filter value in smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By inputTagFilterValueUserEmailFilterSmartcardEvents= By.xpath(".//input[@id='smartcardsEvents_filter_value_input_userLogin']");
	/**
	 * This locator finds input Vehicle Registration number in filter value in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By inputTagFilterValuePlateNumberFilterSmartcardEvents= By.xpath(".//input[@id='smartcardsEvents_filter_value_input_vehicleRegistrationNumber']");

	/**
	 * This locator finds Confirm button in Smartcard event filter in the User Management->SmartCard events-->Homepage
	 */
	public final By divTagConfirmBtnFilterSmartcardEvents= By.xpath(".//div[@id='smartcardsEvents_filter_confirm_button']");

	/**
	 * This locator will find  dropdown value for the filter value  in homepage in the  User Management->SmartCard events-->Homepage
	 */
	public final By divTagFilterValueInDropdownFilterConfirmFilterBackusers(String filterValue) {
		String text= ".//span[@id='smartcardsEvents_filter_value_xxxx']/div/div/div";
		return By.xpath(text.replace("xxxx", filterValue));
	}
	
	
	/*************svg need to do for all *********/
	
	/**
	 * This locator finds in clear icon filter key-value pair for result display in the User Management->SmartCard events-->Homepage
	 */
	public final By svgTagResultPairFilterSmartcardEvents= By.cssSelector("#smartcardsEvents_filterChip_result svg");
	/**
	 * This locator finds clear icon in filter key-value pair for Action display in the User Management->SmartCard events-->Homepage
	 */
	public final By svgTagActionPairFilterSmartcardEvents= By.cssSelector("#smartcardsEvents_filterChip_action svg");

	/**
	 * This locator finds clear icon in filter key-value pair display for start date in the User Management->SmartCard events-->Homepage
	 */
	public final By svgTagStartDatePairFilterSmartcardEvents= By.cssSelector("#smartcardsEvents_filterChip_startdate svg");

	/**
	 * This locator finds clear icon in filter key-value pair display for User email in the User Management->SmartCard events-->Homepage
	 */
	public final By svgTagUserEmailPairFilterSmartcardEvents= By.cssSelector("#smartcardsEvents_filterChip_userLogin svg");



	/*****SPAN******* need to do for all /
	
	/**
	 * This locator finds text in filter key-value pair for result display in the User Management->SmartCard events-->Homepage
	 */
	public final By spanTagResultPairTextFilterSmartcardEvents= By.cssSelector("#smartcardsEvents_filterChip_result span");
	/**
	 * This locator finds text in filter key-value pair for Action display in the User Management->SmartCard events-->Homepage
	 */
	public final By spanTagActionPairTextFilterSmartcardEvents= By.cssSelector("#smartcardsEvents_filterChip_action span");

	/**
	 * This locator finds text in filter key-value pair display for start date in the User Management->SmartCard events-->Homepage
	 */
	public final By spanTagStartDatePairTextFilterSmartcardEvents= By.cssSelector("#smartcardsEvents_filterChip_startdate span");

	/**
	 * This locator finds text in filter key-value pair display for User email in the User Management->SmartCard events-->Homepage
	 */
	public final By spanTagUserEmailPairTextFilterSmartcardEvents= By.cssSelector("#smartcardsEvents_filterChip_userLogin span");
}
