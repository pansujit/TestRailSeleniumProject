package glide.backoffice.test.bookings;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.method.bookings.Booking;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;


public class CreateNewBooking extends BaseClassExtended {
	
	
	@BeforeClass
	public void clickOnBookingSidebar() throws MalformedURLException, InterruptedException {

			OpenBrowser();

		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		headerMethod.selectSuperCompany();
		siteMenuItems.clickOnBookings();	
	}
	
	@Test
	public void createNewBookingTest() throws InterruptedException {
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.createBooking();
	}
	@AfterClass
	public void closeAllBrowser() {
		closeBrowser();
	}
}
