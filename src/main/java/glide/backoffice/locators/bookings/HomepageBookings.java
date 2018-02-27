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
	 * @param firstname - Should be String
	 * @param startDateTime - Should be String
	 * @param endDateTime - Should be String
	 * @return Selenium By
	 */
	public final By clickOnViewBookingButton(String firstname,String startDateTime,String endDateTime) {
		String text=".//div[starts-with(@id,'bookings_list_row_')]/div[2]/div/span[text()='xxxx']"
				+ "/../../../div[4]/div/span[1 and text()='yyyy']"
				+ "/../span[2 and text()='zzzz']/../../../div[5]/button";
		return By.xpath(text.replace("xxxx", firstname).replace("yyyy", startDateTime).replace("zzzz", endDateTime));
		
	}
	
	/**
	 * This locator finds the View button of the given booking with given firstname, start date time and end date time in Bookings-->Homepage
	 * @param firstname - Should be String
	 * @param startDateTime - Should be String
	 * @param endDateTime - Should be String
	 * @return Selenium By
	 */
	public final By highlightBookingOnViewBooking(String firstname,String startDateTime,String endDateTime) {
		String text=".//div[starts-with(@id,'bookings_list_row_')]/div[2]/div/span[text()='xxxx']"
				+ "/../../../div[4]/div/span[1 and text()='yyyy']"
				+ "/../span[2 and text()='zzzz']/../../..";
		return By.xpath(text.replace("xxxx", firstname).replace("yyyy", startDateTime).replace("zzzz", endDateTime));
		
	}
	
	

	



}
