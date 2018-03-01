package glide.backoffice.method.bookings;



import java.util.List;

import glide.backoffice.method.common.ApiCallsMethod;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.filter.BookingsFilterMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.enums.Status;
import glide.backoffice.enums.UsageType;
import glide.backoffice.locators.menuitems.SidebarMenuItems;

import glide.backoffice.utility.SeleniumUtility;
/**
 * This is main class for booking page where all the methods for booking has been created.
 * @author sujitpandey
 *
 */
public class Booking implements Testme {
	public static final String EMAIL_ADDRESS="sujit.pandey+24@glidemobility.com";
	SidebarMenuItems sidebarMenuItems;
	WebDriver driver;
	BookingsFilterMethod bookingsFilter;
	SideMenuItemsMethod siteMenuItems;
	BookingsFilterMethod bookingFilterMethod;
	HomepageBookingsMethod homepageBookingsMethod;
	FindMemberBookingMethod findMemberBookingMethod;
	FindVehicleBookingMethod findVehicleBookingMethod;
	ViewBookingMethod viewBookingMethod;
	CommonMethods commomMethods;
	SoftAssert softAssert;
	// This is the constructor for the class
	public Booking(WebDriver ldriver) {
		this.driver=ldriver;
		this.sidebarMenuItems=PageFactory.initElements(driver, SidebarMenuItems.class);
		this.siteMenuItems= PageFactory.initElements(driver,SideMenuItemsMethod.class);
		this.bookingFilterMethod= PageFactory.initElements(driver,BookingsFilterMethod.class);
		this.homepageBookingsMethod= PageFactory.initElements(driver,HomepageBookingsMethod.class);
		this.findMemberBookingMethod= PageFactory.initElements(driver,FindMemberBookingMethod.class);
		this.findVehicleBookingMethod= PageFactory.initElements(driver,FindVehicleBookingMethod.class);
		this.commomMethods= PageFactory.initElements(driver,CommonMethods.class);
		this.viewBookingMethod= PageFactory.initElements(driver,ViewBookingMethod.class);
		this.softAssert= new SoftAssert();

	}


	/**
	 * This method hold the test until the loading page is not disappeared.
	 */
	private void waitUntilElementNotToBeVisible() {		

		commomMethods.waitUntilElementToBeInvisible();
	}



	/**private void inputCustomField() {		

		SeleniumUtility.sendText(driver, findVehicleBooking.inputTagCustomFieldFindVehicleBooking, "hello");
		SeleniumUtility.fixedWait(3);

	}*/

	private void findVehicleForRoundTripBooking(BookingDto bookingDto) {
		//click on create booking field in booking homepage 
		homepageBookingsMethod.clickOnCreateBooking();
		// type email address of the user to which we are going to create booking
		findMemberBookingMethod.inputEmailInSearchBox(bookingDto.getMemberEmail());
		// Click on Search button to find member
		findMemberBookingMethod.clickOnSearch();
		// click on BOOK icon in the member row
		findMemberBookingMethod.clickOnBook(bookingDto.getMemberEmail());
		//Select the radio button for round trip
		findVehicleBookingMethod.clickOnRoundTrip();
		// Type the start address. it will be the same for end address
		findVehicleBookingMethod.inputStartAddress(bookingDto.getStartAddress());
		// Select the end Date 
		findVehicleBookingMethod.selectEndDate(bookingDto.getEndDate());
		// Select the end hour and minutes the difference between endDataTime-startDataTime>=1hour
		findVehicleBookingMethod.endHourAndMinute(bookingDto.getEndTimeHour(),bookingDto.getEndTimeMinutes());
		// Select the Start Date 
		findVehicleBookingMethod.selectStartDate(bookingDto.getStartDate());
		// Select the Start hour and minutes the difference between endDataTime-startDataTime>=1hour
		findVehicleBookingMethod.startHourAndMinute(bookingDto.getStartTimeHour(),bookingDto.getStartTimeMinutes());
		// Click on Search booking button to find the vehicle
		findVehicleBookingMethod.clickOnSearchBooking();
		// Wait until the system finds the Booking
		waitUntilElementNotToBeVisible();
	}
	private void confirmBooking() {
		// Click on save button in booking pop up page
		findVehicleBookingMethod.clickOnSaveButton();
		// Wait until the system redirect to the booking page
		waitUntilElementNotToBeVisible();
		
	}

	/**
	 * This public method create a booking for a user using back office.
	 */
	public void createPrivateRoundTripBooking(BookingDto bookingDto) {		
		findVehicleForRoundTripBooking(bookingDto);
		// Click on confirm booking link in the result booking list
		findVehicleBookingMethod.clickOnConfirmBooking(Config.getProperty("VEHICLE_PLATE_NUMBER"),UsageType.Private.toString());
		confirmBooking();
		//get the booking Id using rest api
		String bookingId=ApiCallsMethod.getBookingID();	
		//click on filter booking with scheduled
		bookingFilterMethod.filterByStatus(bookingDto.getStatus());
		//Click on View Button of the booking
		homepageBookingsMethod.clickOnViewBookingButton(bookingId);
		viewBookingMethod.assertScheduledBooking(bookingId, Config.getProperty("VEHICLE_PLATE_NUMBER"), UsageType.Private.toString(),
				Config.getProperty("MEMBER_FIRSTNAME")+" "+Config.getProperty("MEMBER_LASTNAME"), Config.getProperty("SUPER_COMPANY_NAME"), 
				Status.Scheduled.toString());
		//Click on Cancel Booking
		viewBookingMethod.clickOnCancelButton();
		// confirm cancel
		viewBookingMethod.confirmCancelBooking();
		viewBookingMethod.assertScheduledBooking(bookingId, Config.getProperty("VEHICLE_PLATE_NUMBER"), UsageType.Private.toString(),
				Config.getProperty("MEMBER_FIRSTNAME")+" "+Config.getProperty("MEMBER_LASTNAME"), Config.getProperty("SUPER_COMPANY_NAME"), 
				Status.Canceled.toString());
		// Click on invoice site menu
		siteMenuItems.clickOnInvoices();
		// Click on Booking site menu
		siteMenuItems.clickOnBookings();
		


	}
	
	public void createBusinessRoundTripBooking(BookingDto bookingDto) {
		findVehicleForRoundTripBooking(bookingDto);
		// Click on confirm booking link in the result booking list
		findVehicleBookingMethod.clickOnConfirmBooking(Config.getProperty("VEHICLE_PLATE_NUMBER"),UsageType.Business.toString());
		confirmBooking();
		//get the booking Id using rest api
		String bookingId=ApiCallsMethod.getBookingID();	
		//click on filter booking with scheduled
		bookingFilterMethod.filterByStatus(bookingDto.getStatus());
		//Click on View Button of the booking
		homepageBookingsMethod.clickOnViewBookingButton(bookingId);
		viewBookingMethod.assertScheduledBooking(bookingId, Config.getProperty("VEHICLE_PLATE_NUMBER"), UsageType.Business.toString(),
				Config.getProperty("MEMBER_FIRSTNAME")+" "+Config.getProperty("MEMBER_LASTNAME"), Config.getProperty("SUPER_COMPANY_NAME"), 
				Status.Scheduled.toString());
		//Click on Cancel Booking
		viewBookingMethod.clickOnCancelButton();
		// confirm cancel
		viewBookingMethod.confirmCancelBooking();
		viewBookingMethod.assertScheduledBooking(bookingId, Config.getProperty("VEHICLE_PLATE_NUMBER"), UsageType.Business.toString(),
				Config.getProperty("MEMBER_FIRSTNAME")+" "+Config.getProperty("MEMBER_LASTNAME"), Config.getProperty("SUPER_COMPANY_NAME"), 
				Status.Canceled.toString());
		// Click on invoice site menu
		siteMenuItems.clickOnInvoices();
		// Click on Booking site menu
		siteMenuItems.clickOnBookings();
	}



	/**
	 * This method filter the booking according to status given.
	 */
	public void filterBookingByStatus() {		

		bookingFilterMethod.filterByStatus(Status.Completed.toString());
		bookingFilterMethod.deleteFilteredIconsInBooking();
	}
	/**
	 * This method filter the booking according to Firstname given.
	 */
	public void filterBookingByFirstname() {		

		bookingFilterMethod.filterByFirstname("sujit");
		bookingFilterMethod.deleteFilteredIconsInBooking();	
	}
	/**
	 * This method filter the booking according to Lastname given.
	 */
	public void filterBookingByLastname() {		

		bookingFilterMethod.filterByLastname("pandey");
		bookingFilterMethod.deleteFilteredIconsInBooking();
	}
	/**
	 * This method filter the booking according to Booking ID given.
	 */
	public void filterBookingByBookingID() {		

		bookingFilterMethod.filterByBookingID("AAAASSSSS");
		bookingFilterMethod.deleteFilteredIconsInBooking();

	}
	/**
	 * This method filter the booking according to Email given.
	 */
	public void filterBookingByEmail() {		

		bookingFilterMethod.filterByEmail(Config.getProperty("EDIT_MEMBER"));		
		bookingFilterMethod.deleteFilteredIconsInBooking();
	}
	/**
	 * This method filter the booking according to Status and Email given.
	 */
	public void filterBookingByStatusAndEmail() {		

		bookingFilterMethod.filterByStatus(Status.Completed.toString());
		bookingFilterMethod.filterByEmail(Config.getProperty("EDIT_MEMBER"));
		bookingFilterMethod.deleteFilteredIconsInBooking();

	}
	/**
	 * This method filter the booking according to Arrival Date given.
	 */
	public void filterBookingByArrivalDate() {		
		bookingFilterMethod.filterByArrivalDate("2016-11-22");
		bookingFilterMethod.deleteFilteredIconsInBooking();

	}
	/**
	 * This method filter the booking according to Departure Date given.
	 */
	public void filterBookingByDepartureDateTest() {		

		bookingFilterMethod.filterByDepatureDate("2016-11-22");
		bookingFilterMethod.deleteFilteredIconsInBooking();
	}
	/**
	 * This method filter the booking according to Arrival and departure Date given.
	 */
	public void filterBookingByArrivalAndDepartureDate() {		

		bookingFilterMethod.filterByArrivalDate("2010-03-12");
		bookingFilterMethod.filterByDepatureDate("2016-11-22");
		bookingFilterMethod.deleteFilteredIconsInBooking();
	}
	/**
	 * This method filter the booking according to Plate number given.
	 */
	public void filterBookingByPlateNumber() {		

		bookingFilterMethod.filterByPlateNumber("ddddd");
		bookingFilterMethod.deleteFilteredIconsInBooking();
	}
	/**
	 * This method filter the booking according to Brand Name given.
	 */
	public void filterBookingByBrand() {		

		bookingFilterMethod.filterByBrand("xxx");
		bookingFilterMethod.deleteFilteredIconsInBooking();
	}
	/**
	 * This method filter the booking according to Vehicle Model given.
	 */
	public void filterBookingByModel() {		
		// this method select the given model
		bookingFilterMethod.filterByModel("rrrr");
		//delete the selected filter
		bookingFilterMethod.deleteFilteredIconsInBooking();
	}
	/**
	 * This method filter the booking according to All filter parameters given.
	 */
	public void filterBookingByAll() {		

		bookingFilterMethod.filterByArrivalDate("2010-03-12");
		bookingFilterMethod.filterByDepatureDate("2016-11-22");
		bookingFilterMethod.filterByFirstname("sujit");
		bookingFilterMethod.filterByLastname("pandey");
		bookingFilterMethod.filterByEmail(Config.getProperty("EDIT_MEMBER"));
		bookingFilterMethod.filterByBookingID("AAZZAZZAA");
		bookingFilterMethod.filterByPlateNumber("xxxxxx");
		bookingFilterMethod.filterByStatus(Status.Completed.toString());
		bookingFilterMethod.filterByDelayed("yes");
		bookingFilterMethod.filterByInvoicingError("no");
		/**bookingFilterMethod.filterByBrand("xxxx");
		bookingFilterMethod.filterByModel("yyyyy");*/
		bookingFilterMethod.deleteFilteredIconsInBooking();

	}







	/**
	 * This is booking filter test
	 * @return 
	 */
	public boolean bookingFilter(String firstname,String lastname, String email,String plateNumber, String vehicleBrand,
			String bookingId,String startDate,String enddate,String vehicleModel,String invoiceError,
			String status,String delayed){
		siteMenuItems.clickOnBookings();
		SeleniumUtility.fixedWait(10);
		return	testmine(driver.findElements(By.xpath(".//table/tbody/tr/td[2]/button")),driver,"sujit pandey",firstname) &&
				testmine(driver.findElements(By.xpath(".//table/tbody/tr/td[2]/button")),driver,"sujit pandey",lastname) &&
				testmine(driver.findElements(By.xpath(".//table/tbody/tr/td[9]/span/span/span/span")),driver,"cancelled",status);
	}


	@Override
	public boolean testmine(List<WebElement> elements, WebDriver driver, String text, String inputText) {
		boolean status=true;
		if(inputText==null) {
			return status;
		}
		for(WebElement element:elements) {
			status=SeleniumUtility.compareIgnoreCaseText(driver, element, text);
			if(!status) {
				break;
			}
		}
		return status;
	}


}
