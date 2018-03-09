package glide.backoffice.method.bookings;




import glide.backoffice.method.common.ApiCallsMethod;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.filter.BookingsFilterMethod;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.enums.Status;

/**
 * This is main class for booking page where all the methods for booking has been created.
 * @author sujitpandey
 *
 */
public class Booking {
	public static final String EMAIL_ADDRESS="sujit.pandey+24@glidemobility.com";
	WebDriver driver;
	BookingsFilterMethod bookingsFilter;
	SideMenuItemsMethod siteMenuItems;
	BookingsFilterMethod bookingFilterMethod;
	HomepageBookingsMethod homepageBookingsMethod;
	FindMemberBookingMethod findMemberBookingMethod;
	FindVehicleBookingMethod findVehicleBookingMethod;
	ViewBookingMethod viewBookingMethod;
	CommonMethods commomMethods;
	HeaderMethod headerMethod;
	SoftAssert softAssert;
	// This is the constructor for the class
	public Booking(WebDriver ldriver) {
		this.driver=ldriver;
		this.siteMenuItems= PageFactory.initElements(driver,SideMenuItemsMethod.class);
		this.bookingFilterMethod= PageFactory.initElements(driver,BookingsFilterMethod.class);
		this.homepageBookingsMethod= PageFactory.initElements(driver,HomepageBookingsMethod.class);
		this.findMemberBookingMethod= PageFactory.initElements(driver,FindMemberBookingMethod.class);
		this.findVehicleBookingMethod= PageFactory.initElements(driver,FindVehicleBookingMethod.class);
		this.commomMethods= PageFactory.initElements(driver,CommonMethods.class);
		this.viewBookingMethod= PageFactory.initElements(driver,ViewBookingMethod.class);
		this.headerMethod= PageFactory.initElements(driver,HeaderMethod.class);
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
		findMemberBookingMethod.waitForNameFieldIsVisible();
		// type email address of the user to which we are going to create booking
		findMemberBookingMethod.inputEmailInSearchBox(bookingDto.getMemberEmail());
		// Click on Search button to find member
		findMemberBookingMethod.clickOnSearch();
		// click on BOOK icon in the member row
		findMemberBookingMethod.clickOnBook(bookingDto.getMemberEmail());
		findVehicleBookingMethod.waitUntilSearchButtonIsVisible();
		//Select the radio button for round trip
		findVehicleBookingMethod.chooseTripType(bookingDto.isStatusToSelectTripType());
		// Type the start address. it will be the same for end address
		findVehicleBookingMethod.inputStartAddress(bookingDto.getStartAddress());
		// Select the Start Date 
		findVehicleBookingMethod.selectStartDate(bookingDto.getStartDate());
		if(bookingDto.isStatusToSelectTripType()) {
		// Select the end Date 
		findVehicleBookingMethod.selectEndDate(bookingDto.getEndDate());
		// Select the end hour and minutes the difference between endDataTime-startDataTime>=1hour
		findVehicleBookingMethod.endHourAndMinute(bookingDto.getEndTimeHour(),bookingDto.getEndTimeMinutes());
		}
		// Select the Start hour and minutes the difference between endDataTime-startDataTime>=1hour
		findVehicleBookingMethod.startHourAndMinute(bookingDto.getStartTimeHour(),bookingDto.getStartTimeMinutes());
		// Click on Search booking button to find the vehicle
		findVehicleBookingMethod.clickOnSearchBooking();
		// Wait until the system finds the Booking
		waitUntilElementNotToBeVisible();
	}
	private void confirmBooking(boolean isPaidBooking) {
		findVehicleBookingMethod.clickOnPaidBooking(isPaidBooking);
		// Click on save button in booking pop up page
		findVehicleBookingMethod.clickOnSaveButton();
		// Wait until the system redirect to the booking page
		waitUntilElementNotToBeVisible();
		
	}

	/**
	 * This public method create a booking for a user using back office.
	 */
	public void createBooking(BookingDto bookingDto) {		
		findVehicleForRoundTripBooking(bookingDto);
		// Click on confirm booking link in the result booking list
		findVehicleBookingMethod.clickOnConfirmBooking(Config.getProperty("VEHICLE_PLATE_NUMBER"),bookingDto.getUsageType());
		confirmBooking(bookingDto.isPaidBooking());
		//get the booking Id using rest api
		String bookingId=ApiCallsMethod.getBookingID();	
		//click on filter booking with scheduled
		bookingFilterMethod.filterByStatus(bookingDto.getStatus());
		//Click on View Button of the booking
		homepageBookingsMethod.clickOnViewBookingButton(bookingId);
		viewBookingMethod.assertScheduledBooking(bookingId, Config.getProperty("VEHICLE_PLATE_NUMBER"), bookingDto.getUsageType(),
				Config.getProperty("MEMBER_FIRSTNAME")+" "+Config.getProperty("MEMBER_LASTNAME"), Config.getProperty("SUPER_COMPANY_NAME"), 
				Status.Scheduled.toString());
		//Click on Cancel Booking
		viewBookingMethod.clickOnCancelButton();
		// confirm cancel
		viewBookingMethod.confirmCancelBooking();
		viewBookingMethod.assertScheduledBooking(bookingId, Config.getProperty("VEHICLE_PLATE_NUMBER"), bookingDto.getUsageType(),
				Config.getProperty("MEMBER_FIRSTNAME")+" "+Config.getProperty("MEMBER_LASTNAME"), Config.getProperty("SUPER_COMPANY_NAME"), 
				Status.Canceled.toString());
		// Click on back Button
		headerMethod.clickOnHeaderBackButton();
		homepageBookingsMethod.waitUntilExportBookingButtonIsVisible();
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
	 * This public method verify the booking homepage in back office
	 */
	public void verifyHomepageBooking() {
		homepageBookingsMethod.assertHomepageBooking();
		
	}











}
