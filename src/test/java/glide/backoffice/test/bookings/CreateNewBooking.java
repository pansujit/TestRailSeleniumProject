package glide.backoffice.test.bookings;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.enums.Status;
import glide.backoffice.method.bookings.Booking;
import glide.backoffice.method.common.SelectSuperCompany;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class CreateNewBooking extends BaseClassExtended {
	
	private Booking booking;
	@BeforeClass
	public void selectCompany() {
		
		SelectSuperCompany selectSuperCompany= PageFactory.initElements(driver, SelectSuperCompany.class);
		selectSuperCompany.selectSuperCompany();
		selectSuperCompany.clickOnMenuBar();
		
	}
	
	/*@Test
	public void createBookingTest() throws InterruptedException {
		booking.createBooking();
	}*/
	@Test
	public void cancelBookingTest() {
		booking= PageFactory.initElements(driver, Booking.class);
		//booking.bookingFilter("sujit",null,null,null,null,null,null,null,null,null,null,null,"1",null);
		booking.bookingFilter("sujit","Pandey","Hello@gmail.com",null,null,null,null,null,null,null,Status.Completed.toString(),null,"1",null);
		//booking.bookingFilter("sujit","pandey",null);
	}

}
