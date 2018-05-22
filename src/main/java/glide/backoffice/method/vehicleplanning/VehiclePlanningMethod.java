package glide.backoffice.method.vehicleplanning;

import java.util.ArrayList;
import java.util.List;

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
	BookingDetailPopupPlanningMethod bookingDetailPopupPlanningMethod;
	public VehiclePlanningMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addStatusPlanningMethod=PageFactory.initElements(driver, AddStatusPlanningMethod.class);
		this.homepagePlanningMethod=PageFactory.initElements(driver, HomepagePlanningMethod.class);
		this.searchMemberPlanningMethod=PageFactory.initElements(driver, SearchMemberPlanningMethod.class);
		this.findVehicleBookingMethod=PageFactory.initElements(driver, FindVehicleBookingMethod.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);
		this.addStatusPlanningMethod=PageFactory.initElements(driver, AddStatusPlanningMethod.class);
		this.bookingDetailPopupPlanningMethod=PageFactory.initElements(driver, BookingDetailPopupPlanningMethod.class);

	}
	
	/**
	 * This public method verifies the attributes in vehicle planning homepage
	 * @return {@code List<Boolean>}
	 */
	public List<Boolean> homepageVerification() {
		homepagePlanningMethod.waitForAddStatusIsDisplayed();
		return homepagePlanningMethod.assertVehiclePlanningHomepage();
	}
	
	/**
	 * This method create booking using vehicle planning
	 * @param vehiclePlanningDto - Should be VehiclePlanningDto
	 * @return 
	 */
	public List<String> createBooking(VehiclePlanningDto vehiclePlanningDto) {
		
		// need double click so calling twice same method
		homepagePlanningMethod.clickonTimeSlotOfVehicle(vehiclePlanningDto.getPlateNumber());		
		homepagePlanningMethod.clickonTimeSlotOfVehicle(vehiclePlanningDto.getPlateNumber());
		searchMemberPlanningMethod.waitUntilInputIsDisplayed();
		
		//find user and wait till the booking vehicle page is displayed
		searchMemberPlanningMethod.clickOnInputField();
		searchMemberPlanningMethod.sendTextOnInputField(vehiclePlanningDto.getFirstname());
		searchMemberPlanningMethod.clickOnDropDownItem(vehiclePlanningDto.getMemberEmail());
		findVehicleBookingMethod.waitUntilSaveButtonIsVisible();
		SeleniumUtility.fixedMilliSecondWait();
		
		//Select the radio button for round trip
		findVehicleBookingMethod.chooseTripType(vehiclePlanningDto.isStatusToSelectTripType());
		SeleniumUtility.fixedMilliSecondWait();
		
		// Select the Start Date 
		findVehicleBookingMethod.selectStartDate(vehiclePlanningDto.getStartDate());
		SeleniumUtility.fixedWait(1);
		
		// Select end date if the triptype is round trip
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
		commonMethods.waitUntilElementToBeInvisible();
		
		// refresh the page
		homepagePlanningMethod.clickOnRefreshButton();
		SeleniumUtility.fixedWait(1);
		
		homepagePlanningMethod.clickOnBookingOnVehiclePlanning(vehiclePlanningDto.getStatus(),vehiclePlanningDto.getPlateNumber());
		bookingDetailPopupPlanningMethod.waitUntilPopupIsVisible();
		
		return bookingDetailPopupPlanningMethod.assertCreateBookingUsingVehiclePlanning();
		
		
	}
	/**
	 * This method create and verifies the add status from the vehicle planning and removes the created status form vehicle plannning
	 * @param vehiclePlanningDto - Should be VehiclePlanningDto
	 * @return 
	 */
	public List<Boolean> addStatusFromVehiclePlanning(VehiclePlanningDto vehiclePlanningDto) {
		homepagePlanningMethod.clickOnVehicleAddStatus();
		homepagePlanningMethod.waitUntilDaysDropdownElementIsVisible();
		
		homepagePlanningMethod.clickonTimeSlotOfVehicle(vehiclePlanningDto.getPlateNumber());
		addStatusPlanningMethod.waitUntilSaveButtonIsVisible();
		
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
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();
		
		return homepagePlanningMethod.assertAddStatusVehiclePlanning(vehiclePlanningDto.getPlateNumber(),vehiclePlanningDto.getVehicleStatus());
	}
	/**
	 * This public method click on the days and select the  days, according to selected days, it verifies the no. of rows per vehicle.
	 * @param vehiclePlanningDto - Should be VehiclePlanningDto
	 * @return 
	 */
	public List<Boolean> daysRowsCount(VehiclePlanningDto vehiclePlanningDto) {
		List<Boolean> assertValue= new ArrayList<>();
		SeleniumUtility.fixedWait(3);
		homepagePlanningMethod.clickOnSelectDaysButton();
		homepagePlanningMethod.waitUntilDaysDropdownElementIsVisible();
		homepagePlanningMethod.clickOnDays("1");
		assertValue.add(0,homepagePlanningMethod.assertDaysTimeSlots("1", vehiclePlanningDto.getPlateNumber()));
		SeleniumUtility.fixedWait(2);
		homepagePlanningMethod.clickOnSelectDaysButton();
		homepagePlanningMethod.waitUntilDaysDropdownElementIsVisible();
		homepagePlanningMethod.clickOnDays("3");
		assertValue.add(1,homepagePlanningMethod.assertDaysTimeSlots("3", vehiclePlanningDto.getPlateNumber()));
		SeleniumUtility.fixedWait(2);
		homepagePlanningMethod.clickOnSelectDaysButton();
		homepagePlanningMethod.waitUntilDaysDropdownElementIsVisible();
		SeleniumUtility.fixedWait(2);
		homepagePlanningMethod.clickOnDays("7");
		assertValue.add(2,homepagePlanningMethod.assertDaysTimeSlots("7", vehiclePlanningDto.getPlateNumber()));
		return assertValue;
	}
	
	/**
	 * This public method check the functionality of the back and forth arrrow in vehicle plannning
	 * @return 
	 */
	public List<Boolean> backAndFrontArrow() {
		String text1=homepagePlanningMethod.getDateFromHeader();
		homepagePlanningMethod.clickOnFrontArrow();
		String text2=homepagePlanningMethod.getDateFromHeader();
		homepagePlanningMethod.assertForwardAndBackwardArrow(text1, text2);
		
		text1=homepagePlanningMethod.getDateFromHeader();
		homepagePlanningMethod.clickOnBackArrow();
		text2=homepagePlanningMethod.getDateFromHeader();
		return homepagePlanningMethod.assertForwardAndBackwardArrow(text1, text2);
	}
	
	

}
