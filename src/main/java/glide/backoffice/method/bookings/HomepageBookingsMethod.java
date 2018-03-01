package glide.backoffice.method.bookings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.bookings.FindMemberBooking;
import glide.backoffice.locators.bookings.HomepageBookings;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;

public class HomepageBookingsMethod {
	WebDriver driver;
	HomepageBookings homepageBookings;
	FindMemberBooking findMemberBooking;
	CommonMethods commonMethods;
	public HomepageBookingsMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageBookings=PageFactory.initElements(driver, HomepageBookings.class);
		this.findMemberBooking=PageFactory.initElements(driver, FindMemberBooking.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);

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
	
	void clickOnViewBookingButton(String bookingId) {
		SeleniumUtility.moveToElementAction(driver, homepageBookings.highlightBookingOnHomepageBookings(bookingId));
		SeleniumUtility.clickOnElement(driver, homepageBookings.clickOnViewBookingButtonHomepageBookings(bookingId));
		commonMethods.waitUntilElementToBeInvisible();
		SeleniumUtility.fixedWait(1);
	}
	


}
