package glide.backoffice.method.bookings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.bookings.FindVehicleBooking;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.DateHelper;
import glide.backoffice.utility.SeleniumUtility;

public class FindVehicleBookingMethod {

	WebDriver driver;
	FindVehicleBooking findVehicleBooking;
	CommonMethods commonMethods;

	public FindVehicleBookingMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.findVehicleBooking=PageFactory.initElements(driver, FindVehicleBooking.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);
	}

	/**
	 * This method click on the radio button to select the trip type depending upon the given status, if status is true, click on round trip
	 * else click on one way
	 */
	public void chooseTripType(boolean status) {
		if(status) {
			SeleniumUtility.clickOnElement(driver, findVehicleBooking.divTagCheckRoundTripFindVehicleBooking);

		}else{
			SeleniumUtility.clickOnElement(driver, findVehicleBooking.divTagCheckOneWayFindVehicleBooking);
		}
	}

	/**
	 * This method input the start address rather than the site name in find-vehicle page.
	 */
	void inputStartAddress(String address) {		
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking);
		SeleniumUtility.sendText(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking, address);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.sendEnter(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking);
		SeleniumUtility.fixedWait(1);

	}
	/**
	 * This method select the site name in from the drop down list in find-vehicle page
	 */
	void selectInputAddress() {		
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking);
		SeleniumUtility.clickUsingAction(driver, findVehicleBooking.liTagStartAddressPopupFindVehicleBooking("testCompanySite"));
		SeleniumUtility.fixedWait(1);

	}

	/**
	 * This method select the End date which is today in find-vehicle page.
	 */
	public void selectEndDate(String mydate ) {	
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagEndDateFindVehicleBooking);
		SeleniumUtility.fixedWait(1);
		commonMethods.monthAndDayPicker(mydate);
	}

	/**
	 * This method select the End hour and minutes. the hour and minutes should be give simultaneously.
	 * @param hours - should be String between (00 to 23)
	 * @param minute - should be String between (00 to 59)
	 */
	public void endHourAndMinute(String hours, String minute) {		

		//String[] data=DateHelper.hourAndMinute(hours, minute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagEndHourFindVehicleBooking, hours);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagEndMinuteFindVehicleBooking, minute);
		SeleniumUtility.fixedWait(1);
	}

	/**
	 * This method select the start hour and minutes. the hour and minutes should be give simultaneously.
	 * @param hours - should be int between (00 to 23)
	 * @param minute - should be int between (00 to 59)
	 */
	public void startHourAndMinute(String hours, String minutes) {		

		//String[] data=DateHelper.hourAndMinute(hours, minute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagStartHourFindVehicleBooking, hours);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagStartMinuteFindVehicleBooking,  minutes);
		SeleniumUtility.fixedWait(1);


	}

	/**
	 * This method select the Start date which is today in find-vehicle page.
	 */
	public void selectStartDate(String myStartDate) {		
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagStartDateFindVehicleBooking);
		SeleniumUtility.fixedWait(1);
		commonMethods.monthAndDayPicker(myStartDate);

	}



	/**
	 * This method click on search button to find the vehicle in find-vehicle page
	 */
	public void clickOnSearchBooking() {		

		SeleniumUtility.fixedWait(2);
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.buttonTagSearchFindVehicleBooking);

	}

	/**
	 * This method will click on the confirm button of the given booking in find-vehicle page
	 */
	 void clickOnConfirmBooking(String plateNumber, String bookingType) {		
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.buttonTagConfirmFindVehicleBooking(plateNumber, bookingType.toUpperCase()));
		SeleniumUtility.fixedWait(3);
	}

	/**
	 * This method click on Save button in Pop up page to confirm booking in find-vehicle page
	 */
	 public void clickOnSaveButton() {		

		SeleniumUtility.clickUsingAction(driver, findVehicleBooking.buttonTagSaveFindVehicleBooking);
		SeleniumUtility.fixedWait(3);
	}

	/**
	 * This method check the paid booking checkbox depend upon the boolean true or false. if the boolean is true, checkbox is check else
	 * checkbox is unchecked. 
	 * @param status - Should be boolean
	 */
	 public void clickOnPaidBooking(boolean status) {
		if(status) {
			if(SeleniumUtility.checkElementIsSelected(driver, findVehicleBooking.inputTagPaidBookingVehicleBooking)) {
				return;
			}else {
				SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagPaidBookingVehicleBooking);
			}			
		}else {
			if(SeleniumUtility.checkElementIsSelected(driver, findVehicleBooking.inputTagPaidBookingVehicleBooking)) {
				SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagPaidBookingVehicleBooking);

			}else {
				return;
			}
		}


	}

	/*
	 * 
	 * This method waits until the search button is visible on the find vehicle page in create booking in back office
	 */
	void waitUntilSearchButtonIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, findVehicleBooking.buttonTagSearchFindVehicleBooking);
		SeleniumUtility.fixedWait(1);
	}
	
	/**
	 * This method waits until the save button in popup is visible
	 */
	public void waitUntilSaveButtonIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, findVehicleBooking.buttonTagSaveFindVehicleBooking);
		SeleniumUtility.fixedWait(1);
	}
	

}
