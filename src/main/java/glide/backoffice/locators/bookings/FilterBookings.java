package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;

public class FilterBookings {
	/**
	 * Locator for email input in the booking filter
	 */
	final public By inputTagEmailFilterBookings= By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'memberLogin')]");
	/**
	 * Locator for Firstname input in the booking filter
	 */
	final public By inputTagFirstnameFilterBookings= By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'memberFirstName')]");
	/**
	 * Locator for Lastname input in the booking filter
	 */
	final public By inputTagLastnameFilterBookings= By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'memberLastName')]");
	/**
	 * Locator for Plate number of vehicle input in the booking filter
	 */
	final public By inputTagPlateNumberFilterBookings= By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'vehicleRegistrationNumber')]");
	
	/**
	 * Locator for Booking Id  input in the booking filter
	 */
	final public By inputTagBookingIdFilterBookings= By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'bookingId')]");
	/**
	 * Locator for Start date of booking input in the booking filter
	 */
	final public By inputTagStartDateFilterBookings= By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'startDate')]");
	/**
	 * Locator for End date of booking input in the booking filter
	 */
	final public By inputTagEndDateFilterBookings= By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'endDate')]");
	/**
	 * Locator for Select Vehicle brand in the booking filter
	 */
	final public By selectTagVehicleBrandFilterBookings=By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'vehicleBrand')]");
	/**
	 * Locator for Select Vehicle Model in the booking filter
	 */
	final public By selectTagVehicleModelFilterBookings=By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'vehicleModel')]");
	/**
	 * Locator for Select Status of the booking in the booking filter
	 */
	final public By selectTagStatusFilterBookings=By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'status')]");
	/**
	 * Locator for Select Invoice Error in the booking filter
	 */
	final public By selectTagInvoiceErrorFilterBookings=By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'failed')]");
	/**
	 * Locator for Select Booking delayed in the booking filter
	 */
	final public By selectTagDelayedFilterBookings=By.xpath(".//div[@role='menu']/div[contains(@data-reactid,'delayed')]");
	/**
	 * Locator for Search button in the booking filter
	 */
	//final public By buttonTagSearchFilterBookings= By.xpath(".//button[@class='ekButton vehiclesFiltersForm_actionsButton']");
	/**
	 * Locator for Reset button in the booking filter
	 */
	//final public By buttonTagResetFilterBookings= By.xpath(".//button[@class='ekButton ekButton--reverse vehiclesFiltersForm_actionsButton']");


}