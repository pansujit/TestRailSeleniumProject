package glide.backoffice.test.bookings;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.method.bookings.Booking;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

/**
 * This page will verify the booking home page
 * @author sujitpandey
 *
 */
public class BookingHomepageVerification  extends BaseClassExtended{

	@BeforeClass
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		SideMenuItemsMethod sideMenuItemsMethod= PageFactory.initElements(driver, SideMenuItemsMethod.class);
		sideMenuItemsMethod.clickOnBookings();
	}

	@Test
	public void bookingHomepageTest() {
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.verifyHomepageBooking();
	}
	
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}

}
