package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;

public class FindVehicleBooking {

	/**
	 * This will find radioButton Round trip element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By divTagCheckRoundTripFindVehicleBooking= By.xpath(".//input[@id='tripType_option_roundTrip']/..");
	
	/**
	 * This will find RadioButton One-Way element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By divTagCheckOneWayFindVehicleBooking= By.xpath(".//input[@id='tripType_option_oneWayTrip']/..");
		
	/**
	 * This will find Input tag start Address element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By inputTagStartAddressFindVehicleBooking=
			By.xpath(".//div[@class='searchVehicle_col searchVehicle_col--left']/div[1]//input");
	
	/**
	 * This will find Start address element popup in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By liTagStartAddressPopupFindVehicleBooking(String replacementText) {
		String text=".//*[@class='geosuggest__suggests']//li[text()='xxxx']";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	/**
	 * This will find  start date input element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By inputTagStartDateFindVehicleBooking= By.xpath(".//input[starts-with(@id,'pickupDate')]");
	
	/**
	 * This will find start calender popup element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By divTagStartDatePopupFindVehicleBooking= By.xpath("/html/body/div[2]/div/div[1]/div");
	
	/**
	 * This will find start date hour element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By selectTagStartHourFindVehicleBooking= 
			By.xpath(".//div[@class='boxedSelectBlock']//select[@name='pickupDateHour']");
	
	/**
	 * This will find start date minute element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By selectTagStartMinuteFindVehicleBooking= 
			By.xpath(".//div[@class='boxedSelectBlock']//select[@name='pickupDateMin']");
	
	/**
	 * This will find calendar pop for end date element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By divTagEndDatePopupFindVehicleBooking= By.xpath("html/body/div[3]/div/div[1]/div");
	/**
	 * This will find end date input element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	//public final By inputTagEndDateFindVehicleBooking= By.xpath(".//input[starts-with(@id,'returnDate')]");
	public final By inputTagEndDateFindVehicleBooking= By.xpath(".//div[@class='boxedInput boxedInput--date']//input[contains(@data-reactid,'returnDate')]");

	
	/**
	 * This will find  end date hour element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By selectTagEndHourFindVehicleBooking= By.xpath(".//div[@class='boxedSelectBlock']//select[@name='returnDateHour']");
	

	/**
	 * This will find end date minute element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By selectTagEndMinuteFindVehicleBooking= By.xpath(".//div[@class='boxedSelectBlock']//select[@name='returnDateMin']");
	

	/**
	 * This will find Search button element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By buttonTagSearchFindVehicleBooking= 
			By.xpath(".//button[@class='ekButton ekButton--variant3 ekButton--fullWidth submit']");
	
	/**
	 * This will find confirm button element in Bookings-->Create Booking--> Find member-->Find vehicle
	 * @param plateNumber - Should be String 
	 * @param usageType  - Should be String
	 * @return - Selenium By
	 */
	public final By buttonTagConfirmFindVehicleBooking(String plateNumber, String usageType) {
		String text=".//table/tbody/tr/td//span[contains(text(),'xxxx')]/../../../td/span/span[contains(text(),'yyyy')]/../../../td[10]/button";
		return By.xpath((text.replace("xxxx", plateNumber)).replace("yyyy",usageType));
	}
	
	
	/**
	 * This will find Custom field Element element in Bookings-->Create Booking--> Find member-->Find vehicle
	 */
	public final By inputTagCustomFieldFindVehicleBooking= By.xpath(".//input[@class='boxedInput boxedInput--text']");
	
	
	
	/**
	 * This will find Save Button element in Bookings-->Create Booking--> Find member-->Find vehicle--popup
	 */
	public final By buttonTagSaveFindVehicleBooking= By.xpath(".//button[@class='ekButton addBookingConfirmationForm_button']");
	
	/**
	 * This will find Paid Booking Button element in Bookings-->Create Booking--> Find member-->Find vehicle-->popup
	 */
	public final By inputTagPaidBookingVehicleBooking= By.xpath(".//div[@class='checkboxMaterial']//input");
	

	/**
	 * This will find Cancel button element in Bookings-->Create Booking--> Find member-->Find vehicle--popup
	 */
	public final By buttonTagCancelFindVehicleBooking= 
			By.xpath("//button[@class='ekButton ekButton--reverse addBookingConfirmationForm_button']");



}
