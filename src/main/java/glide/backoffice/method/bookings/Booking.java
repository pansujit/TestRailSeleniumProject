package glide.backoffice.method.bookings;



import java.util.List;

import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.method.filter.BookingsFilterMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import glide.backoffice.locators.bookings.FindVehicleBooking;
import glide.backoffice.locators.bookings.HomepageBookings;
import glide.backoffice.locators.menuitems.SidebarMenuItems;
import glide.backoffice.locators.bookings.FindMemberBooking;

import glide.backoffice.utility.DateHelper;
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
	FindMemberBooking findMemberBooking;
	FindVehicleBooking findVehicleBooking;
	BookingsFilterMethod bookingsFilter;
	HomepageBookings homepageBookings;
	CommonMethods commonMethods;
	SideMenuItemsMethod siteMenuItems;
	BookingsFilterMethod bookingFilterMethod;

	// This is the constructor for the class
	public Booking(WebDriver ldriver) {
		this.driver=ldriver;
		this.sidebarMenuItems=PageFactory.initElements(driver, SidebarMenuItems.class);
		this.findMemberBooking=PageFactory.initElements(driver, FindMemberBooking.class);
		this.findVehicleBooking=PageFactory.initElements(driver, FindVehicleBooking.class);
		this.bookingsFilter= PageFactory.initElements(driver,BookingsFilterMethod.class);
		this.homepageBookings= PageFactory.initElements(driver,HomepageBookings.class);
		this.siteMenuItems= PageFactory.initElements(driver,SideMenuItemsMethod.class);
		this.commonMethods= PageFactory.initElements(driver,CommonMethods.class);
		this.bookingFilterMethod= PageFactory.initElements(driver,BookingsFilterMethod.class);
	}

	/**
	 * This method click on Create A Booking in the booking homepage and wait for the Member name search filter appeared in 
	 * find-member page
	 */
	private void clickOnCreateBooking() {		
		SeleniumUtility.clickOnElement(driver, homepageBookings.buttonTagCreateBookingHomepageBookings);
		SeleniumUtility.waitElementToBeVisible(driver, findMemberBooking.inputTagNameFindMemberBooking);
		SeleniumUtility.fixedWait(1);	
	}
	/**
	 * This method input email in email search box.
	 */
	private void inputEmailInSearchBox() {		
		SeleniumUtility.sendText(driver, findMemberBooking.inputTagEmailFindMemberBooking, EMAIL_ADDRESS);
	}
	/**
	 * This method click on the search button in the find-member to find the member to for booking
	 */
	private void clickOnSearch() {
		SeleniumUtility.clickOnElement(driver, findMemberBooking.buttonTagSearchFindMemberBooking);
		SeleniumUtility.fixedWait(3);

	}
	/**
	 * This method click on The book link of the member in find-member page
	 */
	private void clickOnBook() {		
		SeleniumUtility.clickOnElement(driver, findMemberBooking.buttonTagBookFindMemberBooking(EMAIL_ADDRESS));
		SeleniumUtility.waitElementToBeVisible(driver, findVehicleBooking.buttonTagSearchFindVehicleBooking);
		SeleniumUtility.fixedWait(1);

	}
	/**
	 * This method click on the Round trip radip button in find vehicle page
	 */
	private void clickOnRoundTrip() {		
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.divTagCheckRoundTripFindVehicleBooking);
	}
	/**
	 * This method input the start address rather than the site name in find-vehicle page.
	 */
	private void inputStartAddress() {		
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking);
		SeleniumUtility.sendText(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking, "1 Rue de Gramont, 75002 Paris, France");
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.sendEnter(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking);
		SeleniumUtility.fixedWait(1);

	}
	/**
	 * This method select the site name in from the drop down list in find-vehicle page
	 */
	private void selectInputAddress() {		
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking);
		SeleniumUtility.clickUsingAction(driver, findVehicleBooking.liTagStartAddressPopupFindVehicleBooking("testCompanySite"));
		SeleniumUtility.fixedWait(1);

	}
	/**
	 * This method select the Start date which is today in find-vehicle page.
	 */
	private void selectStartDate() {		
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagStartDateFindVehicleBooking);
		SeleniumUtility.fixedWait(1);
		commonMethods.monthAndDayPicker(DateHelper.getCurrentDate());

	}

	/**
	 * This method select the End date which is today in find-vehicle page.
	 */
	private void selectEndDate() {	
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagEndDateFindVehicleBooking);
		SeleniumUtility.fixedWait(1);
		commonMethods.monthAndDayPicker(DateHelper.getCurrentDate());

	}

	/**
	 * This method click on search button to find the vehicle in find-vehicle page
	 */
	private void clickOnSearchBooking() {		

		SeleniumUtility.fixedWait(2);
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.buttonTagSearchFindVehicleBooking);

	}
	/**
	 * This method hold the test until the loading page is not disappeared.
	 */
	private void waitUntilElementNotToBeVisible() {		

		commonMethods.waitUntilElementToBeInvisible();

	}
	/**
	 * This method select the start hour and minutes. the hour and minutes should be give simultaneously.
	 * @param hours - should be int between (00 to 23)
	 * @param minute - should be int between (00 to 59)
	 */
	private void startHourAndMinute(int hours, int minute) {		

		String[] data=DateHelper.hourAndMinute(hours, minute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagStartHourFindVehicleBooking, data[0]);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagStartMinuteFindVehicleBooking,  data[1]);
		SeleniumUtility.fixedWait(1);


	}
	/**
	 * This method select the End hour and minutes. the hour and minutes should be give simultaneously.
	 * @param hours - should be int between (00 to 23)
	 * @param minute - should be int between (00 to 59)
	 */
	private void endHourAndMinute(int hours, int minute) {		

		String[] data=DateHelper.hourAndMinute(hours, minute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagEndHourFindVehicleBooking, data[0]);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagEndMinuteFindVehicleBooking, data[1]);
		SeleniumUtility.fixedWait(1);


	}
	/**
	 * This method will click on the confirm button of the given booking in find-vehicle page
	 */
	private void clickOnConfirmBooking() {		
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.buttonTagConfirmFindVehicleBooking("kkkkkkkkk", "PRIVATE"));
		SeleniumUtility.fixedWait(3);

	}
	/**private void inputCustomField() {		

		SeleniumUtility.sendText(driver, findVehicleBooking.inputTagCustomFieldFindVehicleBooking, "hello");
		SeleniumUtility.fixedWait(3);

	}*/
	/**
	 * This method click on Save button in Pop up page to confirm booking in find-vehicle page
	 */
	private void clickOnSaveButton() {		

		SeleniumUtility.clickUsingAction(driver, findVehicleBooking.buttonTagSaveFindVehicleBooking);
		SeleniumUtility.fixedWait(3);

	}


	/**
	 * This public method create a booking for a user using back office.
	 */
	public void createBooking() {		

		//click on create booking field in booking homepage 
		clickOnCreateBooking();
		// type email address of the user to which we are going to create booking
		inputEmailInSearchBox();
		// Click on Search button to find member
		clickOnSearch();
		// click on BOOK icon in the member row
		clickOnBook();
		//Select the radio button for round trip
		clickOnRoundTrip();
		// Type the start address. it will be the same for end address
		inputStartAddress();
		// Select the end Date 
		selectEndDate();
		// Select the end hour and minutes the difference between endDataTime-startDataTime>=1hour
		endHourAndMinute(1,30);
		// Select the Start Date 
		selectStartDate();
		// Select the Start hour and minutes the difference between endDataTime-startDataTime>=1hour
		startHourAndMinute(0,15);
		// Click on Search booking button to find the vehicle
		clickOnSearchBooking();
		// Wait until the system finds the Booking
		waitUntilElementNotToBeVisible();
		// Click on confirm booking link in the result booking list
		clickOnConfirmBooking();
		// Click on save button in booking pop up page
		clickOnSaveButton();
		// Wait until the system redirect to the booking page
		waitUntilElementNotToBeVisible();
		// Click on invoice site menu
		siteMenuItems.clickOnInvoices();
		// Click on Booking site menu
		siteMenuItems.clickOnBookings();

	}


	/**
	 * This method filter the booking according to status given.
	 */
	public void filterBookingByStatus() {		

		bookingFilterMethod.filterByStatus("completed");
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

		bookingFilterMethod.filterByEmail(EMAIL_ADDRESS);		
		bookingFilterMethod.deleteFilteredIconsInBooking();
	}
	/**
	 * This method filter the booking according to Status and Email given.
	 */
	public void filterBookingByStatusAndEmail() {		

		bookingFilterMethod.filterByStatus("completed");
		bookingFilterMethod.filterByEmail(EMAIL_ADDRESS);
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
		bookingFilterMethod.filterByEmail(EMAIL_ADDRESS);
		bookingFilterMethod.filterByBookingID("AAZZAZZAA");
		bookingFilterMethod.filterByPlateNumber("xxxxxx");
		bookingFilterMethod.filterByStatus("completed");
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
