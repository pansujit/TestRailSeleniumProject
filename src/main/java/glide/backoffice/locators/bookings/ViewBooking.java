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


	
	public final By spanTagBookingIdOnViewBooking(String bookingId) {
		String text=".//span[@class='bookingDetail_item_result' and text()='xxxx']";
		return By.xpath(text.replace("xxxx", bookingId));		
	}
	public final By spanTagUsageTypeOnViewBooking(String bookingId) {
		String text=".//span[@class='bookingDetail_item_result' and text()='xxxx']/../../div[2]/span[2]/span/span";
		return By.xpath(text.replace("xxxx", bookingId));		
	}
	public final By spanTagStatusOnViewBooking(String bookingId) {
		String text=".//span[@class='bookingDetail_item_result' and text()='xxxx']/../../div[3]/span[2]/span/span";
		return By.xpath(text.replace("xxxx", bookingId));		
	}
	public final By spanTagCompanyNameOnViewBooking(String bookingId) {
		String text=".//span[@class='bookingDetail_item_result' and text()='xxxx']/../../div[5]/a/span";
		return By.xpath(text.replace("xxxx", bookingId));		
	}
	public final By spanTagMemberNameOnViewBooking(String bookingId) {
		String text=".//span[@class='bookingDetail_item_result' and text()='xxxx']/../../div[4]/a/span";
		return By.xpath(text.replace("xxxx", bookingId));		
	}
	public final By spanTagVehiclePlateOnViewBooking(String vehicleNumberPlate) {
		String text=".//span[@class='bookingDetail_item_result' and text()='xxxx']";
		return By.xpath(text.replace("xxxx", vehicleNumberPlate));		
	}
	

	
	

}
