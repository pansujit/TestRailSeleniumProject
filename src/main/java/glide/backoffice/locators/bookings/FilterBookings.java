package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;

public class FilterBookings {
	/**
	 * This will find Filter element in Bookings-->Homepage-->Filters
	 */
	public final By divTagFilterIconsFilterBookings= By.xpath(".//div[@id='bookings_filter_type_wrap']/div[1]/div[2]");
	
	/**
	 * This will find firstname element in filter in Bookings-->Homepage
	 */
	public final By spanTagFirstnameFilterBookings= By.xpath(".//span[@id='bookings_filter_type_memberFirstName']");
	/**
	 * This will find firstname input element in filter in Bookings-->Homepage
	 */
	public final By inputTagFirstnameFilterBookings= By.xpath(".//input[@id='bookings_filter_value_input_memberFirstName']");

	
	/**
	 * This will find lastname element in filter in Bookings-->Homepage
	 */
	public final By spanTagLastnameFilterBookings= By.xpath(".//span[@id='bookings_filter_type_memberLastName']");

	/**
	 * This will find lastname input element in filter in Bookings-->Homepage
	 */
	public final By inputTagLastnameFilterBookings= By.xpath(".//input[@id='bookings_filter_value_input_memberLastName']");

	
	/**
	 * This will find Search For an email element in filter in Bookings-->Homepage
	 */
	public final By spanTagEmailFilterBookings= By.xpath(".//span[@id='bookings_filter_type_memberLogin']");
	
	/**
	 * This will find email input element in filter in Bookings-->Homepage
	 */
	public final By inputTagEmailFilterBookings= By.xpath(".//input[@id='bookings_filter_value_input_memberLogin']");


	/**
	 * This will find status element in filter in Bookings-->Homepage
	 */
	public final By spanTagStatusFilterBookings= By.xpath(".//span[@id='bookings_filter_type_status']");
	
	/**
	 * This will find Click to Dropdown element in filter in Bookings-->Homepage
	 */
	public final By divTagClickToDropdownCommonFilterBookings= By.xpath(".//div[@class='advancedList_filtersInput']/div");

	/**
	 * This will find filter value in Dropdown  element in filter value in Bookings-->Homepage
	 */
	public final By divTagFilterValueFilterBookings(String replacementText) {
		String text= ".//span[@id='bookings_filter_value_xxxx']/div/div/div";
				return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This will find Vehicle Brand element in filter in Bookings-->Homepage
	 */
	public final By spanTagVehicleBrandFilterBookings= By.xpath(".//span[@id='bookings_filter_type_vehicleBrand']");

	/**
	 * This will find Vehicle Model element in filter in Bookings-->Homepage
	 */
	public final By spanTagVehicleModelFilterBookings= By.xpath(".//span[@id='bookings_filter_type_vehicleModel']");

	/**
	 * This will find Plate number element in filter in Bookings-->Homepage
	 */
	public final By spanTagPlateNumberFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_vehicleRegistrationNumber']");
	
	/**
	 * This will find Plate number input element in filter in Bookings-->Homepage
	 */
	public final By inputTagPlateNumberFilterBookings= 
			By.xpath(".//input[@id='bookings_filter_value_input_vehicleRegistrationNumber']");
	
	
	/**
	 * This will find Departure date element in filter in Bookings-->Homepage
	 */
	public final By spanTagDepartureFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_startDate']");

	/**
	 * This will find Arrival Date element in filter in Bookings-->Homepage
	 */
	public final By spanTagArrivalFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_endDate']");

	/**
	 * This will find Delayed element in filter in Bookings-->Homepage
	 */
	public final By spanTagDelayedFilterBookings= By.xpath(".//span[@id='bookings_filter_type_delayed']");

	/**
	 * This will find Invoicing Error element in filter in Bookings-->Homepage
	 */
	public final By spanTagInvoiceErrorFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_failed']");

	/**
	 * This will find  Update Contract Error element in filter in Bookings-->Homepage
	 */
	public final By spanTagUpdateErrorFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_rrsUpdateFailed']");

	/**
	 * This will find Booking ID element in filter in Bookings-->Homepage
	 */
	public final By spanTagBookingIDFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_bookingId']");

	/**
	 * This will find Booking ID input element in filter in Bookings-->Homepage
	 */
	public final By inputTagBookingIDFilterBookings= 
			By.xpath(".//input[@id='bookings_filter_value_input_bookingId']");
	
	
	/**
	 * This will find Confirm filter button element in filter in Bookings-->Homepage
	 */
	public final By divTagBookingConfirmFilterBookings= 
			By.xpath(".//div[@id='bookings_filter_confirm_button']");

	/**
	 * This will find delete Icon in  filtered element in filter in Bookings-->Homepage
	 */
	public final By svgTagDeleteIconFilterBookings= 
			By.cssSelector("div[id^=\"bookings_filterChip_\"] svg");
	
}
