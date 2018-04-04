package glide.backoffice.locators.vehicleplanning;

import org.openqa.selenium.By;

public class VehiclePagePlanning {
	
	/**
	 * This locator will find Save button element in Vehicle popup page in the Vehicle Planing->homepage->Vehicle page
	 */
	public final By buttonTagSaveVehiclePagePlanning= 
			By.xpath(".//div[@class='addBookingConfirmationForm_buttonRow']/button[@class='flatButton']");
	/**
	 * This locator will find Cancel button element in Vehicle popup page in the Vehicle Planing->homepage->Vehicle page
	 */
	public final By buttonTagCancelVehiclePagePlanning= 
			By.xpath(".//div[@class='addBookingConfirmationForm_buttonRow']/button[@class='ekButton addBookingConfirmationForm_button']");
	
	/**
	 * This locator will find Private Radio button element in Vehicle popup page in the Vehicle Planing->homepage->Vehicle page
	 */
	public final By labelTagPrivateRadioVehiclePagePlanning= By.xpath(".//input[@id='usageType_option_PRIVATE']/../label");
	
	/**
	 * This locator will find Business Radio button element in Vehicle popup page in the Vehicle Planing->homepage->Vehicle page
	 */
	public final By labelTagBusinessRadioVehiclePagePlanning= By.xpath(".//input[@id='usageType_option_BUSINESS']/../label");
	
	/**
	 * This locator will find One way Radio button element in Vehicle popup page in the Vehicle Planing->homepage->Vehicle page
	 */
	public final By labalTagOnewayRadioVehiclePagePlanning= By.xpath(".//input[@id='tripType_option_oneWayTrip']/../label");
	
	/**
	 * This locator will find Round trip radio button element in Vehicle popup page in the Vehicle Planing->homepage->Vehicle page
	 */
	public final By labelTagRoundTripRadioVehiclePagePlanning= By.xpath(".//input[@id='tripType_option_roundTrip']/../label");
	
	/**
	 * This locator will find Start date element in Vehicle popup page in the Vehicle Planing->homepage->Vehicle page
	 */
	public final By inputTagStartDateVehiclePagePlanning= By.xpath(".//input[@id='pickupDate']");
	
	/**
	 * This locator will find End date element in Vehicle popup page in the Vehicle Planing->homepage->Vehicle page
	 */
	public final By inputTagEndDateVehiclePagePlanning= By.xpath(".//input[@id='returnDate']");
	

	
	
}
