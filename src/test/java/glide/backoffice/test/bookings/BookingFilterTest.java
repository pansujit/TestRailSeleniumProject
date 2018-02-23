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

public class BookingFilterTest extends BaseClassExtended {
	@BeforeClass
	public void clickOnBookingSidebar() throws MalformedURLException, InterruptedException {
			OpenBrowser();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		headerMethod.selectSuperCompany();
		siteMenuItems.clickOnBookings();	

	}
	
	@Test
	public void filterBookingByFirstnameTest() throws InterruptedException {
		
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.filterBookingByFirstname();
	}
	@Test
	public void filterBookingByLastnameTest() throws InterruptedException {
		
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.filterBookingByLastname();
	}
	@Test
	public void filterBookingByBookingIDTest() throws InterruptedException {
		
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.filterBookingByBookingID();
	}
	@Test
	public void filterBookingByEmailTest() throws InterruptedException {
		
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.filterBookingByEmail();
	}
	@Test
	public void filterBookingByPlateNumberTest() throws InterruptedException {
		
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.filterBookingByPlateNumber();
	}
	
	@Test
	public void filterBookingByStatusAndEmailTest() throws InterruptedException {
		
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.filterBookingByStatusAndEmail();
	}

	@Test
	public void filterBookingByDepartureDateTest() throws InterruptedException {
		
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.filterBookingByDepartureDateTest();
		
	}
	@Test
	public void filterBookingByArrivalAndDepartureDateTest() throws InterruptedException {
		
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.filterBookingByArrivalAndDepartureDate();
	}
	@Test
	public void filterBookingByAllTest() throws InterruptedException {
		
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.filterBookingByAll();
	}
	@Test
	public void filterBookingByStatus() throws InterruptedException {
		
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.filterBookingByStatus();
	}
	
	@Test
	public void filterBookingByArrivalDateTest() throws InterruptedException {
		
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.filterBookingByArrivalDate();
	
	}
	@AfterClass
	public void closeAllBrowser() {
		closeBrowser();
	}

}
