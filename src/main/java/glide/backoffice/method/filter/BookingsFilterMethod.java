package glide.backoffice.method.filter;

import glide.backoffice.utility.SeleniumUtility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import glide.backoffice.locators.bookings.FilterBookings;
import glide.backoffice.locators.common.DatePicker;
import glide.backoffice.method.common.CommonMethods;

import org.openqa.selenium.support.PageFactory;

public class BookingsFilterMethod {
	WebDriver driver;
	FilterBookings filterBookings;
	CommonMethods commonMethods;
	DatePicker datePicker;

	public BookingsFilterMethod(WebDriver ldriver){
		this.driver=ldriver;
		this.filterBookings=PageFactory.initElements(driver,FilterBookings.class);
		this.commonMethods=PageFactory.initElements(driver,CommonMethods.class);
		this.datePicker=PageFactory.initElements(driver,DatePicker.class);

	}
	/**
	 * This private method click on Filter icons and wait until the filter dropdown appears.
	 */
	private void clickOnFilter() {
		SeleniumUtility.clickOnElement(driver, filterBookings.divTagFilterIconsFilterBookings);
		SeleniumUtility.waitElementToBeVisible(driver, filterBookings.spanTagStatusFilterBookings);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This private method click on the TICK icon to confirm the input in input field in filter value in booking filter
	 */
	private void clickOnTickIcon() {
		SeleniumUtility.clickOnElement(driver, filterBookings.divTagBookingConfirmFilterBookings);
		waitUntilLoadingElementInvisible();
	}
	/**
	 * This private method wait until the round loading icon is disappear from the booking
	 */
	private void waitUntilLoadingElementInvisible() {
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This private method click on the value field to see the dropdown menu in filter value area. This dropdown
	 * only appears for the filter which has list items.
	 */
	private void clickToSeeDropdownInBookingFilter() {
		SeleniumUtility.waitUntilElementisNotVisible(driver, filterBookings.spanTagStatusFilterBookings);
		SeleniumUtility.clickOnElement(driver, filterBookings.divTagClickToDropdownCommonFilterBookings);
		SeleniumUtility.fixedWait(1);

	}
	/**
	 * This private method click on the value in dropdown. This dropdown is, list of items, we get after selecting the filter
	 * and click on the value field.
	 * @param value - Should be String
	 */
	private void clickOnFilterValueInDropdown(String value) {
		String text="";
		if(value.equalsIgnoreCase("yes"))
		{
			text="true";
		}
		else if(value.equalsIgnoreCase("no"))
		{
			text="false";
		}
		else {
			text=value.toUpperCase();
		}
	
		if(SeleniumUtility.checkElementIsVisible(driver, filterBookings.divTagFilterValueFilterBookings(text)))
		{
			SeleniumUtility.clickOnElement(driver, filterBookings.divTagFilterValueFilterBookings(text));
			waitUntilLoadingElementInvisible();
		}
		else
		{
			SeleniumUtility.actionSendKeys(driver, Keys.ESCAPE);
		}
	}
	/**
	 * This method select the First name filter in the booking
	 * @param firstname - Should be String
	 */
	public void filterByFirstname(String firstname) {
		if(firstname!=null && !firstname.isEmpty())
		{
			clickOnFilter();
			SeleniumUtility.clickOnElement(driver, filterBookings.spanTagFirstnameFilterBookings);
			SeleniumUtility.waitElementToBeVisible(driver, filterBookings.inputTagFirstnameFilterBookings);
			SeleniumUtility.fixedWait(1);
			SeleniumUtility.clearTextAndSendText(driver, filterBookings.inputTagFirstnameFilterBookings, firstname);
			clickOnTickIcon();
			SeleniumUtility.fixedWait(1);
		}
		else 
		{
			return;
		}


	}
	/**
	 * This method select the Lastname filter in the booking
	 * @param lastname - Should be String
	 */
	public void filterByLastname(String lastname) {
		if(lastname!=null && !lastname.isEmpty())
		{
			clickOnFilter();
			SeleniumUtility.clickOnElement(driver, filterBookings.spanTagLastnameFilterBookings);
			SeleniumUtility.waitElementToBeVisible(driver, filterBookings.inputTagLastnameFilterBookings);
			SeleniumUtility.fixedWait(1);
			SeleniumUtility.clearTextAndSendText(driver, filterBookings.inputTagLastnameFilterBookings, lastname);
			clickOnTickIcon();
			SeleniumUtility.fixedWait(1);
		}
		else 
		{
			return;
		}

	}
	/**
	 * This method select the E-Mail filter in the booking
	 * @param email - Should be String
	 */
	public void filterByEmail(String email) {
		if(email!=null && !email.isEmpty())
		{
			clickOnFilter();
			SeleniumUtility.clickOnElement(driver, filterBookings.spanTagEmailFilterBookings);
			SeleniumUtility.waitElementToBeVisible(driver, filterBookings.inputTagEmailFilterBookings);
			SeleniumUtility.fixedWait(1);
			SeleniumUtility.clearTextAndSendText(driver, filterBookings.inputTagEmailFilterBookings, email);
			clickOnTickIcon();
			SeleniumUtility.fixedWait(1);
		}
		else 
		{
			return;
		}

	}
	/**
	 * This method select the Plate number filter in the booking
	 * @param plateNumber - Should be String
	 */
	public void filterByPlateNumber(String plateNumber) {
		if(plateNumber!=null && !plateNumber.isEmpty())
		{
			clickOnFilter();
			SeleniumUtility.clickOnElement(driver, filterBookings.spanTagPlateNumberFilterBookings);
			SeleniumUtility.waitElementToBeVisible(driver, filterBookings.inputTagPlateNumberFilterBookings);
			SeleniumUtility.fixedWait(1);
			SeleniumUtility.clearTextAndSendText(driver, filterBookings.inputTagPlateNumberFilterBookings, plateNumber);
			clickOnTickIcon();
			SeleniumUtility.fixedWait(1);
		}
		else 
		{
			return;
		}

	}
	/**
	 * This method select the Booking filter in the booking
	 * @param bookingID - Should be String
	 */
	public void filterByBookingID(String bookingID) {
		if(bookingID!=null && !bookingID.isEmpty())
		{
			clickOnFilter();
			SeleniumUtility.clickOnElement(driver, filterBookings.spanTagBookingIDFilterBookings);
			SeleniumUtility.waitElementToBeVisible(driver, filterBookings.inputTagBookingIDFilterBookings);
			SeleniumUtility.fixedWait(1);
			SeleniumUtility.clearTextAndSendText(driver, filterBookings.inputTagBookingIDFilterBookings, bookingID);
			clickOnTickIcon();
			SeleniumUtility.fixedWait(1);
		}
		else 
		{
			return;
		}

	}
	/**
	 * This method select the Arrival Date filter in the booking
	 * @param givenDate - Should be String(in format "YYYY-MM-DD")
	 */
	public void filterByArrivalDate(String givenDate) {
		clickOnFilter();
		SeleniumUtility.clickOnElement(driver, filterBookings.spanTagArrivalFilterBookings);
		commonMethods.datePicker(givenDate);

	}
	/**
	 * This method select the Departure Date filter in the booking
	 * @param givenDate - Should be String(in format "YYYY-MM-DD")
	 */
	public void filterByDepatureDate(String givenDate) {
		clickOnFilter();
		SeleniumUtility.clickOnElement(driver, filterBookings.spanTagDepartureFilterBookings);
		commonMethods.datePicker(givenDate);
	}
	/**
	 * This method select the Vehicle Brand filter in the booking
	 * @param brand - Should be String
	 */
	public void filterByBrand(String brand){
		if(brand!=null && !brand.isEmpty())
		{
			clickOnFilter();
			SeleniumUtility.clickOnElement(driver, filterBookings.spanTagVehicleBrandFilterBookings);
			clickToSeeDropdownInBookingFilter();
			clickOnFilterValueInDropdown(brand);
		}
		else
		{
			return;
		}

	}
	/**
	 * This method select the Vehicle Model filter in the booking
	 * @param model - Should be String
	 */
	public void filterByModel(String model){
		if(model!=null && !model.isEmpty())
		{
			clickOnFilter();
			SeleniumUtility.clickOnElement(driver, filterBookings.spanTagVehicleModelFilterBookings);

			clickToSeeDropdownInBookingFilter();
			clickOnFilterValueInDropdown(model);
		}
		else
		{
			return;
		}

	}
	/**
	 * This method select the Delayed filter in the booking
	 * @param delayed - Should be String (only "Yes" and "No")
	 */
	public void filterByDelayed(String delayed) {
		if(delayed!=null && !delayed.isEmpty())
		{
			clickOnFilter();
			SeleniumUtility.clickOnElement(driver, filterBookings.spanTagDelayedFilterBookings);

			clickToSeeDropdownInBookingFilter();
			clickOnFilterValueInDropdown(delayed);
		}
		else
		{
			return;
		}
	}

	/**
	 * This method select the invoicing error filter in the booking
	 * @param invoicingError - Should be String (only "Yes" and "No")
	 */
	public void filterByInvoicingError(String invoicingError) {
		if(invoicingError!=null && !invoicingError.isEmpty())
		{
			clickOnFilter();
			SeleniumUtility.clickOnElement(driver, filterBookings.spanTagInvoiceErrorFilterBookings);

			clickToSeeDropdownInBookingFilter();
			clickOnFilterValueInDropdown(invoicingError);
		}
		else
		{
			return;
		}
	}
	/**
	 * This method filter booking with given status
	 * 
	 */
	public void filterByStatus(String status) {
		if(status!=null && !status.isEmpty())
		{
			clickOnFilter();
			SeleniumUtility.clickOnElement(driver, filterBookings.spanTagStatusFilterBookings);
			SeleniumUtility.fixedWait(2);
			clickToSeeDropdownInBookingFilter();
			clickOnFilterValueInDropdown(status);

		}
		else
		{
			return;
		}

	}
	/**
	 * This method will delete the selected filter from the booking 
	 */
	public void deleteFilteredIconsInBooking() {
		for(WebElement element: SeleniumUtility.returnWebElements(driver, filterBookings.svgTagDeleteIconFilterBookings)) {
			element.click();
			SeleniumUtility.fixedWait(2);

		}
	}













}
