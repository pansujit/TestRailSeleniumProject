package glide.backoffice.test.bookings;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.BookingDataProvidor;
import glide.backoffice.method.bookings.Booking;
import glide.backoffice.method.bookings.BookingDto;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;


public class CreateNewBusinessBookingTest extends BaseClassExtended {
	
	
	@BeforeClass
	public void clickOnBookingSidebar() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		siteMenuItems.clickOnBookings();	
	}
	
	@Test(dataProvider="createRoundTripBusinessBooking",dataProviderClass=BookingDataProvidor.class,priority=1)
	public void createNewPrivateRoundTripBookingTest(BookingDto bookingDto) throws InterruptedException {
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.createBooking(bookingDto);
	}
	@Test(dataProvider="createOneWayBusinessBooking",dataProviderClass=BookingDataProvidor.class,priority=1)
	public void createNewBusinessRoundTripBookingTest(BookingDto bookingDto) throws InterruptedException {
		Booking booking= PageFactory.initElements(driver, Booking.class);
		booking.createBooking(bookingDto);
	}
	
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}
}
