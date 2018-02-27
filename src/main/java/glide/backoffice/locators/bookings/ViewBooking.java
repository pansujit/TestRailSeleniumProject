package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;

public class ViewBooking {
	
	/**
	 * This will find Cancel button element in Bookings-->Homepage-->View
	 */
	public final By buttonTagCancelViewBooking= 
			By.xpath(".//div[@class='bookingDetailPage_actions']/button[@class='ekButton ekButton--variant3 bookingDetailPage_actionsButton']");

	
	/**
	 * This will find element in Bookings-->Homepage-->View
	 */
	public final By buttonTagViewBooking= By.xpath("");


	
	/**
	 * This will find confirm button element in popup in Bookings-->Homepage-->View
	 */
	public final By buttonTagConfirmPopupViewBooking= By.xpath(".//button[@class='ekButton bookingDetailPage_cancelBooking_confirm_button']");

	
	
	/**
	 * This will find Cancel Button element in popup in Bookings-->Homepage-->View
	 */
	public final By buttonTagCancelPopViewBooking= 
			By.xpath(".//button[@class='ekButton ekButton--reverse bookingDetailPage_cancelBooking_abort_button']");

	/**
	 * This will find element booking id in Bookings-->Homepage-->View
	 */
	public final By spanTagBookingIDViewBooking= By.xpath(".//div[@class='bookingDetail_line']/div[5]/a/../../div[1]/span[2]");

	/**
	 * This will find Booking type element in Bookings-->Homepage-->View
	 */
	public final By spanTagBookingTypeViewBooking= By.xpath(".//div[@class='bookingDetail_line']/div[5]/a/../../div[2]/span[2]/span/span");

	/**
	 * This will find Status element in Bookings-->Homepage-->View
	 */
	public final By spanTagStatusViewBooking= By.xpath(".//div[@class='bookingDetail_line']/div[5]/a/../../div[3]/span[2]/span/span");

	/**
	 * This will find Member Name element in Bookings-->Homepage-->View
	 */
	public final By spanTagMemberNameViewBooking= By.xpath(".//div[@class='bookingDetail_line']/div[5]/a/../../div[4]/a/span");


	

	
	

}
