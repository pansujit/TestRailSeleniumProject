package glide.backoffice.test.bookings;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import glide.backoffice.method.bookings.Booking;
import glide.backoffice.test.baseclass.BaseClassExtended;
import junit.framework.Assert;

/**
 * This page will verify the booking home page
 * @author sujitpandey
 *
 */
public class BookingHomepageVerification  extends BaseClassExtended{
	
	@BeforeClass
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		//SelectSuperCompany selectSuperCompany=PageFactory.initElements(driver, SelectSuperCompany.class);
		//selectSuperCompany.selectSuperCompany();
	
			OpenBrowser();

	}

	SoftAssert sa= new SoftAssert();
	@Test
	public void bookingHomepageTest() {
		Booking booking= PageFactory.initElements(driver, Booking.class);
	}
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}

}
