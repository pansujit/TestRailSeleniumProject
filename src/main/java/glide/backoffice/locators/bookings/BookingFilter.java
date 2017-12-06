package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;
/**
 * This class contains all the locators inside the booking filter
 * @author sujitpandey
 *
 */
public class BookingFilter {
	/**
	 * Locator for email input in the booking filter
	 */
	final public By inputTagEmailBookingFilter= By.xpath(".//input[@id='search_memberLogin']");
	/**
	 * Locator for Firstname input in the booking filter
	 */
	final public By inputTagFirstnameBookingFilter= By.xpath(".//input[@id='search_memberFirstName']");
	/**
	 * Locator for Lastname input in the booking filter
	 */
	final public By inputTagLastnameBookingFilter= By.xpath(".//input[@id='search_memberLastName']");
	/**
	 * Locator for Plate number of vehicle input in the booking filter
	 */
	final public By inputTagPlateNumberBookingFilter= By.xpath(".//input[@id='search_vehicleRegistrationNumber']");
	/**
	 * Locator for Booking Id  input in the booking filter
	 */
	final public By inputTagBookingIdBookingFilter= By.xpath(".//input[@id='search_bookingId']");
	/**
	 * Locator for Start date of booking input in the booking filter
	 */
	final public By inputTagStartDateBookingFilter= By.xpath(".//input[@id='search_startDate']");
	/**
	 * Locator for End date of booking input in the booking filter
	 */
	final public By inputTagEndDateBookingFilter= By.xpath(".//input[@id='search_endDate']");
	/**
	 * Locator for Select Vehicle brand in the booking filter
	 */
	final public By selectTagVehicleBrandBookingFilter=
			By.xpath(".//select[contains(@class,'boxedSelect') and @name='vehicleBrand']");
	/**
	 * Locator for Select Vehicle Model in the booking filter
	 */
	final public By selectTagVehicleModelBookingFilter=
			By.xpath(".//select[contains(@class,'boxedSelect') and @name='vehicleModel']");
	/**
	 * Locator for Select Status of the booking in the booking filter
	 */
	final public By selectTagStatusBookingFilter=
			By.xpath(".//select[contains(@class,'boxedSelect') and @name='status']");
	/**
	 * Locator for Select Invoice Error in the booking filter
	 */
	final public By selectTagInvoiceErrorBookingFilter=
			By.xpath(".//select[contains(@class,'boxedSelect') and @name='failed']");
	/**
	 * Locator for Select Booking delayed in the booking filter
	 */
	final public By selectTagDelayedBookingFilter=
			By.xpath(".//select[contains(@class,'boxedSelect') and @name='delayed']");
	/**
	 * Locator for Search button in the booking filter
	 */
	final public By buttonTagSearchBookingFilter= By.xpath(".//button[@class='ekButton vehiclesFiltersForm_actionsButton']");
	/**
	 * Locator for Reset button in the booking filter
	 */
	final public By buttonTagResetBookingFilter= By.xpath(".//button[@class='ekButton ekButton--reverse vehiclesFiltersForm_actionsButton']");




}
