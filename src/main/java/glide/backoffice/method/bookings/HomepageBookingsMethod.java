package glide.backoffice.method.bookings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import glide.backoffice.locators.bookings.HomepageBookings;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;

public class HomepageBookingsMethod {
	WebDriver driver;
	HomepageBookings homepageBookings;
	CommonMethods commonMethods;
	SoftAssert softAssert;

	public HomepageBookingsMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageBookings=PageFactory.initElements(driver, HomepageBookings.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);
		this.softAssert=new SoftAssert();
	}

	/**
	 * This method click on Create A Booking in the booking homepage and wait for the Member name search filter appeared in 
	 * find-member page
	 */
	void clickOnCreateBooking() {		
		SeleniumUtility.clickOnElement(driver, homepageBookings.buttonTagCreateBookingHomepageBookings);	
	}
	/**
	 * This method click on view button of the given booking in the booking homepage in booking in back office
	 * @param bookingId - Should be String
	 */
	void clickOnViewBookingButton(String bookingId) {
		SeleniumUtility.moveToElementAction(driver, homepageBookings.highlightBookingOnHomepageBookings(bookingId));
		SeleniumUtility.clickOnElement(driver, homepageBookings.clickOnViewBookingButtonHomepageBookings(bookingId));
		commonMethods.waitUntilElementToBeInvisible();
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method waits until the Booking export button is visible of booking homepage in bookings in back office
	 */
	void waitUntilExportBookingButtonIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, homepageBookings.buttonTagExportHomepageBookings);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method check some elements in the booking homepage to ensure it is in booking page
	 */
	void assertHomepageBooking() {
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageBookings.buttonTagExportHomepageBookings));
		softAssert.assertAll();		
	}



}
