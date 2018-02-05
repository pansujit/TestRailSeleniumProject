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
	public final By inputTagEmailFilterBookings= By.xpath("..//input[@id='bookings_filter_value_input_memberLogin']");


	/**
	 * This will find status element in filter in Bookings-->Homepage
	 */
	public final By divTagStatusFilterBookings= By.xpath(".//span[@id='bookings_filter_type_status']/div/div/div");
	
	/**
	 * This will find Click to Dropdown element in filter in Bookings-->Homepage
	 */
	public final By divTagClickToDropdownCommonFilterBookings= By.xpath(".//div[@class='advancedList_filtersInput']/div");

	/**
	 * This will find Click to select element in filter in Bookings-->Homepage
	 */
	public final By divTagClickToSelectFilterBookings(String replacementText) {
		String text= ".//span[@id='bookings_filter_value_xxxx']/div/div/div";
				return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This will find Brand element in filter in Bookings-->Homepage
	 */
	public final By divTagBrandFilterBookings= By.xpath(".//span[@id='bookings_filter_type_vehicleBrand']/div/div/div");

	/**
	 * This will find Model element in filter in Bookings-->Homepage
	 */
	public final By divTagHomepageBookings= By.xpath(".//span[@id='bookings_filter_type_vehicleModel']/div");

	/**
	 * This will find Plate number element in filter in Bookings-->Homepage
	 */
	public final By divTagPlateNumberFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_vehicleRegistrationNumber']/div/div/div");
	
	/**
	 * This will find Plate number input element in filter in Bookings-->Homepage
	 */
	public final By inputTagPlateNumberFilterBookings= 
			By.xpath(".//input[@id='bookings_filter_value_input_vehicleRegistrationNumber']");
	
	
	/**
	 * This will find Departure date element in filter in Bookings-->Homepage
	 */
	public final By divTagDepartureFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_startDate']/div/div/div");

	/**
	 * This will find Arrival Date element in filter in Bookings-->Homepage
	 */
	public final By divTagArrivalFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_endDate']/div/div/div");

	/**
	 * This will find Delayed element in filter in Bookings-->Homepage
	 */
	public final By aTagDelayedFilterBookings= By.xpath(".//span[@id='bookings_filter_type_delayed']/div/div/div");

	/**
	 * This will find Invoicing Error element in filter in Bookings-->Homepage
	 */
	public final By spanTagInvoiceErrorFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_failed']/div/div/div");

	/**
	 * This will find  Update Contract Error element in filter in Bookings-->Homepage
	 */
	public final By spanTagUpdateErrorFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_rrsUpdateFailed']/div/div/div");

	/**
	 * This will find Booking ID element in filter in Bookings-->Homepage
	 */
	public final By spanTagBookingIDFilterBookings= 
			By.xpath(".//span[@id='bookings_filter_type_bookingId']/div/div/div");

	/**
	 * This will find Booking ID input element in filter in Bookings-->Homepage
	 */
	public final By inoutTagBookingIDFilterBookings= 
			By.xpath(".//input[@id='bookings_filter_value_input_bookingId']");

}
