package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;

public class HomepageBookings {
	/**
	 * This locators is for the filter when it is not opened
	 */
	public final By buttonTagFilterClosed= By.xpath(".//button[@class='ekButton ekButton--variant1 bookingsPage_filtersButton']");
	
	/**
	 * This locators is for the filter when it is  opened
	 */
	public final By buttonTagFilterOpened= By.xpath(".//button[@class='ekButton ekButton--variant1 bookingsPage_filtersButton _is_opened']");
	
	/**
	 * 
	 */
	public final By buttonTagCreateBooking= By.xpath(".//button[@class='ekButton ekButton--variant3 bookingsPage_createBookingButton']");
	/**
	 * 
	 */
	public final By aTagExportInCSV= By.xpath(".//a[contains(@class,'bookingsPage_exportButton ekButton')]");


}
