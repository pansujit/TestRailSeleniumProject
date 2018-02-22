package glide.backoffice.test.bookings;

import org.openqa.selenium.support.PageFactory;
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
	public void selectSuperCompany() {
		//SelectSuperCompany selectSuperCompany=PageFactory.initElements(driver, SelectSuperCompany.class);
		//selectSuperCompany.selectSuperCompany();
		
	}

	SoftAssert sa= new SoftAssert();
	@Test
	public void bookingHomepageTest() {
		Booking booking= PageFactory.initElements(driver, Booking.class);
	}

}
