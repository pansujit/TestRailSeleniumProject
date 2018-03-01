package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;

public class HomepageBookings {
	/**
	 * This will find Create a booking  element in Bookings-->Homepage
	 */
	public final By buttonTagCreateBookingHomepageBookings= By.xpath(".//button[@id='bookings_create_button']");
	/**
	 * This will find Export  element in Bookings-->Homepage
	 */
	public final By buttonTagExportHomepageBookings= By.xpath(".//button[@id='bookings_export_button']");

	
	/**
	 * This will find element in Bookings-->Homepage
	 */
	/*public final By buttonTagHomepageBookings= By.xpath("");

	*/
	/**
	 * This locator finds the View button of the given booking with given firstname, start date time and end date time in Bookings-->Homepage
	 * @param bookingId - Should be String
	 * @return Selenium By
	 */
	public final By clickOnViewBookingButtonHomepageBookings(String bookingId) {
		String text=".//div[@id='bookings_list_row_xxxx']/div[5]/button";
		return By.xpath(text.replace("xxxx", bookingId));
		
	}
	
	/**
	 * This locator finds the View button of the given booking with given firstname, start date time and end date time in Bookings-->Homepage
	 * @param bookingId - Should be String
	 * @return Selenium By
	 */
	public final By highlightBookingOnHomepageBookings(String bookingId) {
		String text=".//div[@id='bookings_list_row_xxxx']";
		return By.xpath(text.replace("xxxx", bookingId));
		
	}
	
	


	
	


}
