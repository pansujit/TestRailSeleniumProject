package glide.backoffice.test.bookings;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import glide.backoffice.enums.Status;
import glide.backoffice.method.bookings.Booking;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;
import net.bytebuddy.jar.asm.commons.Method;
import listeners.MethodListener;


public class CreateNewBooking extends BaseClassExtended {
	
	
	@BeforeClass
	public void selectCompany() {
		//SelectSuperCompany selectSuperCompany= PageFactory.initElements(driver, SelectSuperCompany.class);
		//selectSuperCompany.selectSuperCompany();
		//selectSuperCompany.clickOnMenuBar();
		
	}
	
	@Test
	public void createBookingTest() throws InterruptedException {
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.createBooking();
		//HeaderMethod booking= PageFactory.initElements(driver, HeaderMethod.class);
		//booking.selectSuperCompany("AirStone");
		//booking.selectCompany("testingCompany");
		//booking.checkAllPopUpInHeader();
	}

	/*@Test
	public void cancelBookingTest() {
		booking= PageFactory.initElements(driver, Booking.class);
		//booking.bookingFilter("sujit",null,null,null,null,null,null,null,null,null,null,null,"1",null);
	Assert.assertTrue(booking.bookingFilter("sujit","Pandey","sujit.pandey+24@glidemobility.com",
			null,null,null,null,null,null,null,Status.Completed.toString(),null));
		//booking.bookingFilter("sujit","pandey",null);
	
	}*/
	

}
