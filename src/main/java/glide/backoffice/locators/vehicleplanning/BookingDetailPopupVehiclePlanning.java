package glide.backoffice.locators.vehicleplanning;

import org.openqa.selenium.By;

public class BookingDetailPopupVehiclePlanning {
	
	/**
	 * This locator will find POP up booking details element in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By divTagBookingDeatailPopupHomepageVehiclePlanning= By.xpath(".//div[@class='vehiclePlanning_card_wrap']");

	/**
	 * This locator will find Booking status type element in 
	 * Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By spanTagBookingStatusBookingDetailPopupVehiclePlanning= 
			By.xpath(".//div[@class='vehiclePlanning_card_headerStatus']/span/span");
	
	/**
	 * This locator will find Booking ID element in Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By aTagBookingIDBookingDetailPopupVehiclePlanning= 
			By.xpath(".//div[@class='vehiclePlanning_card_lineData']/a[contains(@href,'booking-detail')]");

	
	/**
	 * This locator will find member Name  element in Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By aTagMemberDetailBookingDetailPopupVehiclePlanning= 
			By.xpath(".//div[@class='vehiclePlanning_card_lineData']/a[contains(@href,'member-detail')]");
	
	/**
	 * This locator will find Usage Type element in Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By spanTagUsageTypeBookingDetailPopupVehiclePlanning=
			By.xpath(".//div[@class='vehiclePlanning_card_wrap']/div[5]/div[2]/span/span");
	/**
	 * This locator will find Booking Type 
	 * element in Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By spanTagBookingTypeBookingDetailPopupVehiclePlanning= 
			By.xpath(".//div[@class='vehiclePlanning_card_wrap']/div[5]/div[2]/span/span");
	/**
	 * This locator will find Vehicle Plate Number element 
	 * in Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By divTagPlateNumberBookingDetailPopupVehiclePlanning= 
			By.xpath(".//div[@class='vehiclePlanning_vehicleRow_registrationNumber']/a");
	/**
	 * This locator will find close button element in Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By buttonTagCloseBookingDetailPopupVehiclePlanning= 
			By.xpath(".//div[@class='vehiclePlanning_card_headerClose']/button");
	/**
	 * This locator will find Menu popup element in Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By divTagMenuPopupBookingDetailPopupVehiclePlanning= By.xpath(".//div[@class='vehiclePlanning_card_headerClose']/div");
	
	/**
	 * This locator will find Cancel button element 
	 * in Vehicle Planning booking popup page in the Vehicle Planning->homepage-->booking detail pop up
	 */
	public final By divTagCancelBookingDetailPopupVehiclePlanning= By.xpath(".//div[@role='menu']/div[1]/span/div/div/div");
	
	/**
	 * This locator will find  Edit element in Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By divTagEditBookingDetailPopupVehiclePlanning= By.xpath(".//div[@role='menu']/div[2]/span/div/div/div");
	/**
	 * This locator will find Change vehicle element in 
	 * Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By divTagChangeVehicleBookingDetailPopupVehiclePlanning= By.xpath(".//div[@role='menu']/div[3]/span/div/div/div");
	/**
	 * This locator will find Impersonate element in Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By divTagImpersonateBookingDetailPopupVehiclePlanning= By.xpath(".//div[@role='menu']/div[4]/span/div/div/div");
	// This should be set to the common locators
	/**
	 * This locator will find OK confirm button element in Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By buttonTagOKConfirmBookingDetailPopupVehiclePlanning= 
			By.xpath(".//button[@class='flatButton' and @type='button'][2]");
	
	// This should be set to the common locators
	/**
	 * This locator will find Impersonate element in Vehicle Planning booking popup page in the Vehicle Planing->homepage-->booking detail pop up
	 */
	public final By buttonTagCancelConfirmBookingDetailPopupVehiclePlanning= 
			By.xpath(".//button[@class='flatButton' and @type='button'][2]/../button[1]");
	


	
	

}
