package glide.backoffice.method.bookings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.bookings.FindMemberBooking;
import glide.backoffice.locators.bookings.FindVehicleBooking;
import glide.backoffice.utility.SeleniumUtility;

public class FindMemberBookingMethod {
	public static final String EMAIL_ADDRESS="sujit.pandey+24@glidemobility.com";
	WebDriver driver;
	FindMemberBooking findMemberBooking;
	FindVehicleBooking findVehicleBooking;
	public FindMemberBookingMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.findMemberBooking=PageFactory.initElements(driver, FindMemberBooking.class);
		this.findVehicleBooking=PageFactory.initElements(driver, FindVehicleBooking.class);
	}
	/**
	 * This method input email in email search box.
	 */
	void inputEmailInSearchBox(String emailAddress) {		
		SeleniumUtility.sendText(driver, findMemberBooking.inputTagEmailFindMemberBooking, emailAddress);
	}
	
	/**
	 * This method click on the search button in the find-member to find the member to for booking
	 */
	void clickOnSearch() {
		SeleniumUtility.clickOnElement(driver, findMemberBooking.buttonTagSearchFindMemberBooking);
		SeleniumUtility.fixedWait(3);
	}
	
	/**
	 * This method click on The book link of the member in find-member page
	 */
	 void clickOnBook(String email) {		
		SeleniumUtility.clickOnElement(driver, findMemberBooking.buttonTagBookFindMemberBooking(email));
		SeleniumUtility.waitElementToBeVisible(driver, findVehicleBooking.buttonTagSearchFindVehicleBooking);
		SeleniumUtility.fixedWait(1);

	}
}
