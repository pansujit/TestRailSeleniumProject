package glide.backoffice.locators.fleets.vehicles;

import org.openqa.selenium.By;

public class FilterVehicles {
	/**
	 * This locator will find Filter element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagFilterTagFilterVehicles= By.xpath(".//div[@id='fleet_filter_type_wrap']/div[1]/div[2]");
	
	/**
	 * This locator will find filter dropdown menu element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagFilterDropdownFilterVehicles= By.xpath(".//div[@role='menu']");
	
	/**
	 * This locator will find element filter value button in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By buttonTagSelectValueFilterVehicles= By.xpath(".//div[@class='advancedList_filtersInput']//button");
	
	/**
	 * This locator will find Filter select value  element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagSelectKeyAndValueFilterVehicles(String replacementText) {
		String text=".//span[@id='fleet_filter_value_xxxx']/div/div/div";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	/**
	 * This locator will find Filter confirm element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagFilterConfirmFilterVehicles= By.xpath(".//div[@id='fleet_filter_confirm_button']");
		
	/**
	 * This locator will find  Brand element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagBrandFilterVehicles= By.xpath(".//span[@id='fleet_filter_type_brand']/div/div/div");

	/**
	 * This locator will find Model element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagModelFilterVehicles= By.xpath(".//span[@id='fleet_filter_type_model']/div/div/div");
	
	/**
	 * This locator will find Version element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagVersionFilterVehicles= By.xpath(".//span[@id='fleet_filter_type_version']/div/div/div");

	/**
	 * This locator will find Vehicle Category element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagVehicleCategoryFilterVehicles= By.xpath(".//span[@id='fleet_filter_type_category']/div/div/div");

	/**
	 * This locator will find Color element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagColorFilterVehicles= By.xpath(".//span[@id='fleet_filter_type_color']/div/div/div");

	/**
	 * This locator will find System Type element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagSystemTypeFilterVehicles= By.xpath(".//span[@id='fleet_filter_type_systemType']/div/div/div");

	/**
	 * This locator will find Vehicle Status element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagVehicleStausFilterVehicles= By.xpath(".//span[@id='fleet_filter_type_vehicleStatus']/div/div/div");

	/**
	 * This locator will find Usage Type element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagTypeFilterVehicles= By.xpath(".//span[@id='fleet_filter_type_type']/div/div/div");

	/**
	 * This locator will find Cleanliness Status element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagCleanlinessStatusFilterVehicles= By.xpath(".//span[@id='fleet_filter_type_cleanliness']/div/div/div");

	/**
	 * This locator will find plate number element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By divTagPlateNumberFilterVehicles= By.xpath(".//span[@id='fleet_filter_type_plateNumber']/div/div/div");
	
	/**
	 * This locator will Input Plate number field find element in the Fleet management->Vehicle-->Homepage Filter
	 */
	public final By inputTagPlateNumberFilterVehicles= By.xpath(".//input[@id='fleet_filter_value_input_plateNumber']");

	
	
	
	
}
