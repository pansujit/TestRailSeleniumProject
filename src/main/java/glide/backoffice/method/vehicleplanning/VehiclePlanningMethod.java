package glide.backoffice.method.vehicleplanning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.bookings.FindVehicleBookingMethod;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;

public class VehiclePlanningMethod {
	AddStatusPlanningMethod addStatusPlanningMethod;
	HomepagePlanningMethod homepagePlanningMethod;
	WebDriver driver;
	SearchMemberPlanningMethod searchMemberPlanningMethod;
	FindVehicleBookingMethod findVehicleBookingMethod;
	CommonMethods commonMethods;
	public VehiclePlanningMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addStatusPlanningMethod=PageFactory.initElements(driver, AddStatusPlanningMethod.class);
		this.homepagePlanningMethod=PageFactory.initElements(driver, HomepagePlanningMethod.class);
		this.searchMemberPlanningMethod=PageFactory.initElements(driver, SearchMemberPlanningMethod.class);
		this.findVehicleBookingMethod=PageFactory.initElements(driver, FindVehicleBookingMethod.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);
		this.addStatusPlanningMethod=PageFactory.initElements(driver, AddStatusPlanningMethod.class);
	}
	
	/**
	 * This public method verifies the attributes in vehicle planning homepage
	 */
	public void homepageVerification() {
		homepagePlanningMethod.waitForAddStatusIsDisplayed();
		homepagePlanningMethod.assertVehiclePlanningHomepage();
	}
	
	/**
	 * This method create booking using vehicle planning
	 * @param vehiclePlanningDto - Should be VehiclePlanningDto
	 */
	public void createBooking(VehiclePlanningDto vehiclePlanningDto) {
		// need double click so calling twice same method
		homepagePlanningMethod.clickonTimeSlotOfVehicle(vehiclePlanningDto.getPlateNumber());
		homepagePlanningMethod.clickonTimeSlotOfVehicle(vehiclePlanningDto.getPlateNumber());
		searchMemberPlanningMethod.waitUntilInputIsDisplayed();
		searchMemberPlanningMethod.clickOnInputField();
		searchMemberPlanningMethod.sendTextOnInputField(vehiclePlanningDto.getFirstname());
		searchMemberPlanningMethod.clickOnDropDownItem(vehiclePlanningDto.getMemberEmail());
		SeleniumUtility.fixedWait(2);
		//Select the radio button for round trip
		findVehicleBookingMethod.chooseTripType(vehiclePlanningDto.isStatusToSelectTripType());
		SeleniumUtility.fixedWait(1);
		// Select the Start Date 
		findVehicleBookingMethod.selectStartDate(vehiclePlanningDto.getStartDate());
		SeleniumUtility.fixedWait(1);
		if(vehiclePlanningDto.isStatusToSelectTripType()) {
		// Select the end Date 
		findVehicleBookingMethod.selectEndDate(vehiclePlanningDto.getEndDate());
		SeleniumUtility.fixedWait(1);
		// Select the end hour and minutes the difference between endDataTime-startDataTime>=1hour
		findVehicleBookingMethod.endHourAndMinute(vehiclePlanningDto.getEndTimeHour(),vehiclePlanningDto.getEndTimeMinutes());
		}
		SeleniumUtility.fixedWait(1);
		// Select the Start hour and minutes the difference between endDataTime-startDataTime>=1hour
		findVehicleBookingMethod.startHourAndMinute(vehiclePlanningDto.getStartTimeHour(),vehiclePlanningDto.getStartTimeMinutes());
		SeleniumUtility.fixedWait(1);
		findVehicleBookingMethod.clickOnSaveButton();
		// Wait until the system redirect to the booking page
		
	}
	/**
	 * This method create and verifies the add status from the vehicle planning and removes the created status form vehicle plannning
	 * @param vehiclePlanningDto - Should be VehiclePlanningDto
	 */
	public void addStatusFromVehiclePlanning(VehiclePlanningDto vehiclePlanningDto) {
		homepagePlanningMethod.clickOnVehicleAddStatus();
		homepagePlanningMethod.clickonTimeSlotOfVehicle(vehiclePlanningDto.getPlateNumber());
		SeleniumUtility.fixedWait(5);
		addStatusPlanningMethod.clickOnStartDate();
		commonMethods.monthAndDayPicker(vehiclePlanningDto.getStartDate());
		addStatusPlanningMethod.startHourAndMinute(vehiclePlanningDto.getStartTimeHour(),"15");
		addStatusPlanningMethod.clickOnEndDate();
		commonMethods.monthAndDayPicker(vehiclePlanningDto.getEndDate());
		addStatusPlanningMethod.endHourAndMinute(vehiclePlanningDto.getEndTimeHour(),"15");
		addStatusPlanningMethod.clickOnStatusDropdown();
		addStatusPlanningMethod.selectStatusFromDropdown(vehiclePlanningDto.getVehicleStatus());
		addStatusPlanningMethod.clickOnSaveButtonInAddStatus();
		commonMethods.waitUntilElementToBeInvisible();
		homepagePlanningMethod.clickOnRefreshButton();
		SeleniumUtility.fixedWait(2);
		homepagePlanningMethod.assertAddStatusVehiclePlanning(vehiclePlanningDto.getPlateNumber(),vehiclePlanningDto.getVehicleStatus());
	}
	/**
	 * This public method click on the days and select the  days, according to selected days, it verifies the no. of rows per vehicle.
	 * @param vehiclePlanningDto - Should be VehiclePlanningDto
	 */
	public void daysRowsCount(VehiclePlanningDto vehiclePlanningDto) {
		SeleniumUtility.fixedWait(3);
		homepagePlanningMethod.clickOnSelectDaysButton();
		homepagePlanningMethod.waitUntilDaysDropdownElementIsVisible();
		homepagePlanningMethod.clickOnDays("1");
		homepagePlanningMethod.assertDaysTimeSlots("1", vehiclePlanningDto.getPlateNumber());
		SeleniumUtility.fixedWait(2);
		homepagePlanningMethod.clickOnSelectDaysButton();
		homepagePlanningMethod.waitUntilDaysDropdownElementIsVisible();
		homepagePlanningMethod.clickOnDays("3");
		homepagePlanningMethod.assertDaysTimeSlots("3", vehiclePlanningDto.getPlateNumber());
		SeleniumUtility.fixedWait(2);
		homepagePlanningMethod.clickOnSelectDaysButton();
		homepagePlanningMethod.waitUntilDaysDropdownElementIsVisible();
		SeleniumUtility.fixedWait(2);
		homepagePlanningMethod.clickOnDays("7");
		homepagePlanningMethod.assertDaysTimeSlots("7", vehiclePlanningDto.getPlateNumber());
	}
	
	/**
	 * This public method check the functionality of the back and forth arrrow in vehicle plannning
	 */
	public void backAndFrontArrow() {
		String text1=homepagePlanningMethod.getDateFromHeader();
		homepagePlanningMethod.clickOnFrontArrow();
		String text2=homepagePlanningMethod.getDateFromHeader();
		homepagePlanningMethod.assertForwardAndBackwardArrow(text1, text2);
		
		text1=homepagePlanningMethod.getDateFromHeader();
		homepagePlanningMethod.clickOnBackArrow();
		text2=homepagePlanningMethod.getDateFromHeader();
		homepagePlanningMethod.assertForwardAndBackwardArrow(text1, text2);
	}
	
	

}
