package glide.backoffice.method.vehicleplanning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.bookings.FindVehicleBookingMethod;
import glide.backoffice.utility.SeleniumUtility;

public class VehiclePlanningMethod {
	AddStatusPlanningMethod addStatusPlanningMethod;
	HomepagePlanningMethod homepagePlanningMethod;
	WebDriver driver;
	SearchMemberPlanningMethod searchMemberPlanningMethod;
	FindVehicleBookingMethod findVehicleBookingMethod;
	public VehiclePlanningMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addStatusPlanningMethod=PageFactory.initElements(driver, AddStatusPlanningMethod.class);
		this.homepagePlanningMethod=PageFactory.initElements(driver, HomepagePlanningMethod.class);
		this.searchMemberPlanningMethod=PageFactory.initElements(driver, SearchMemberPlanningMethod.class);
		this.findVehicleBookingMethod=PageFactory.initElements(driver, FindVehicleBookingMethod.class);
	}
	
	/**
	 * This method
	 */
	public void homepageVerification() {
		homepagePlanningMethod.waitForAddStatusIsDisplayed();
		homepagePlanningMethod.assertVehiclePlanningHomepage();
	}
	
	public void createBooking(VehiclePlanningDto vehiclePlanningDto) {
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

}
