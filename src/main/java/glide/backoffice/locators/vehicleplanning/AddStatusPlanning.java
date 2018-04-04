package glide.backoffice.locators.vehicleplanning;

import org.openqa.selenium.By;

public class AddStatusPlanning {
	
	/**
	 * This locator will find Start date element in Add status page in the Vehicle Planing->homepage->Add status
	 */
	public final By inputTagStartDateAddStatusPlanning= By.xpath(".//input[@id='date']");
	/**
	 * This locator will find End date element in Add status page in the Vehicle Planing->homepage->Add status
	 */
	public final By inputTagEndDateAddStatusPlanning= By.xpath(".//input[@id='endDate']");
	/**
	 * This locator will find element in Add status page in the Vehicle Planing->homepage->Add status
	 */
	public final By divTagStartHourAddStatusPlanning= 
			By.xpath(".//div[@class='VehiclePlanningEditBooking_col1Row2_dateWrap']//select[@name='hour']");
	/**
	 * This locator will find element in Add status page in the Vehicle Planing->homepage->Add status
	 */
	public final By divTagStartMinuteAddStatusPlanning= 
			By.xpath(".//div[@class='VehiclePlanningEditBooking_col1Row2_dateWrap']//select[@name='minute']");
	/**
	 * This locator will find element in Add status page in the Vehicle Planing->homepage->Add status
	 */
	public final By divTagEndHoursAddStatusPlanning= 
	By.xpath(".//div[@class='VehiclePlanningEditBooking_col1Row2_dateWrap']//select[@name='endHour']");
	/**
	 * This locator will find element in Add status page in the Vehicle Planing->homepage->Add status
	 */
	public final By divTagEndMinuteAddStatusPlanning= 
			By.xpath(".//div[@class='VehiclePlanningEditBooking_col1Row2_dateWrap']//select[@name='EndMinute']");
	/**
	 * This locator will find DropDown for vehicle status element in Add status page in the Vehicle Planing->homepage->Add status
	 */
	public final By divTagVehicleStatusAddStatusPlanning= By.xpath(".//section/form/div[2]/div[1]");
	/**
	 * This locator will find Status List element in Add status page in the Vehicle Planing->homepage->Add status
	 */
	public final By divTagStatusListAddStatusPlanning= By.xpath(".//div[@role='menu']/div/span/div/div/div[text()='Ready']");
	
	
	/**
	 * This locator will find Save Buttonelement in Add status page in the Vehicle Planing->homepage->Add status
	 */
	public final By buttonTagSaveAddStatusPlanning= By.xpath(".//section/form//button[@class='flatButton']");

}
