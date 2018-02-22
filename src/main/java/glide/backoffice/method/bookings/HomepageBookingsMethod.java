package glide.backoffice.method.bookings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.bookings.FindMemberBooking;
import glide.backoffice.locators.bookings.HomepageBookings;
import glide.backoffice.utility.SeleniumUtility;

public class HomepageBookingsMethod {
	WebDriver driver;
	HomepageBookings homepageBookings;
	FindMemberBooking findMemberBooking;
	public HomepageBookingsMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageBookings=PageFactory.initElements(driver, HomepageBookings.class);
		this.findMemberBooking=PageFactory.initElements(driver, FindMemberBooking.class);

	}
	
	/**
	 * This method click on Create A Booking in the booking homepage and wait for the Member name search filter appeared in 
	 * find-member page
	 */
	void clickOnCreateBooking() {		
		SeleniumUtility.clickOnElement(driver, homepageBookings.buttonTagCreateBookingHomepageBookings);
		SeleniumUtility.waitElementToBeVisible(driver, findMemberBooking.inputTagNameFindMemberBooking);
		SeleniumUtility.fixedWait(1);	
	}

}
