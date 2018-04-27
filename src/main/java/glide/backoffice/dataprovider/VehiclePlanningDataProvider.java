package glide.backoffice.dataprovider;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.DataProvider;


import glide.backoffice.enums.Status;
import glide.backoffice.enums.UsageType;
import glide.backoffice.enums.VehicleStatus;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.vehicleplanning.VehiclePlanningDto;
import glide.backoffice.utility.DateHelper;

public class VehiclePlanningDataProvider {
	private static final String MEMBER_LOGIN=Config.getProperty("MEMBER_LOGIN");
	private static final String MEMBER_FIRSTNAME=Config.getProperty("MEMBER_FIRSTNAME");
	private static final String PLATE_NUMBER=Config.getProperty("VEHICLE_PLATE_NUMBER");
	VehiclePlanningDto vehiclePlanningDto;
	Date date = new Date();
	String myDate=new SimpleDateFormat("yyyy-MM-dd").format(date);
	String startAppendDate=new SimpleDateFormat("dd.MM.yyyy").format(date);
	String[] myStartTime=DateHelper.hourAndMinute(0, 25);
	String[] myEndTime=DateHelper.hourAndMinute(1, 30);
	String startDateTime=startAppendDate+" "+myStartTime[0]+":"+myStartTime[1];
	String endDateTime=startAppendDate+" "+myEndTime[0]+":"+myEndTime[1];
	@DataProvider
	public Object[][] createRoundTripPrivateBooking() {

		vehiclePlanningDto=VehiclePlanningDto.builder()
				.plateNumber(PLATE_NUMBER)
				.memberEmail(MEMBER_LOGIN)
				.status(Status.Scheduled.toString())
				.secondStatus(Status.Canceled.toString())
				.startDate(myDate)
				.endDate(myDate)
				.startTimeHour(myStartTime[0])
				.startTimeMinutes(myStartTime[1])
				.endTimeHour(myEndTime[0])
				.endTimeMinutes(myEndTime[1])
				.firstname(MEMBER_FIRSTNAME)
				.startDateTimeForBooking(startDateTime)
				.endDateTimeForBooking(endDateTime)
				.statusToSelectTripType(true)
				.usageType(UsageType.Private.toString())
				.paidBooking(true)
				.build();
		return new Object[][] {{vehiclePlanningDto}};
	}

	@DataProvider
	public Object[][] createOneWayPrivateBooking() {

		vehiclePlanningDto=VehiclePlanningDto.builder()
				.plateNumber(PLATE_NUMBER)
				.memberEmail(MEMBER_LOGIN)
				.status(Status.Scheduled.toString())
				.secondStatus(Status.Canceled.toString())
				.startDate(myDate)
				.endDate(myDate)
				.startTimeHour(myStartTime[0])
				.startTimeMinutes(myStartTime[1])
				.endTimeHour(myEndTime[0])
				.endTimeMinutes(myEndTime[1])
				.firstname(MEMBER_FIRSTNAME)
				.startDateTimeForBooking(startDateTime)
				.endDateTimeForBooking(endDateTime)
				.statusToSelectTripType(false)
				.usageType(UsageType.Private.toString())
				.paidBooking(true)
				.build();
		return new Object[][] {{vehiclePlanningDto}};
	}

	@DataProvider
	public Object[][] createRoundTripBusinessBooking() {

		vehiclePlanningDto=VehiclePlanningDto.builder()
				.plateNumber(PLATE_NUMBER)
				.memberEmail(MEMBER_LOGIN)
				.status(Status.Scheduled.toString())
				.secondStatus(Status.Canceled.toString())
				.startDate(myDate)
				.endDate(myDate)
				.startTimeHour(myStartTime[0])
				.startTimeMinutes(myStartTime[1])
				.endTimeHour(myEndTime[0])
				.endTimeMinutes(myEndTime[1])
				.firstname(MEMBER_FIRSTNAME)
				.startDateTimeForBooking(startDateTime)
				.endDateTimeForBooking(endDateTime)
				.statusToSelectTripType(true)
				.usageType(UsageType.Business.toString())
				.paidBooking(false)
				.build();
		return new Object[][] {{vehiclePlanningDto}};
	}
	@DataProvider
	public Object[][] createOneWayBusinessBooking() {

		vehiclePlanningDto=VehiclePlanningDto.builder()
				.plateNumber(PLATE_NUMBER)
				.memberEmail(MEMBER_LOGIN)
				.status(Status.Scheduled.toString())
				.secondStatus(Status.Canceled.toString())
				.startDate(myDate)
				.endDate(myDate)
				.startTimeHour(myStartTime[0])
				.startTimeMinutes(myStartTime[1])
				.endTimeHour(myEndTime[0])
				.endTimeMinutes(myEndTime[1])
				.firstname(MEMBER_FIRSTNAME)
				.startDateTimeForBooking(startDateTime)
				.endDateTimeForBooking(endDateTime)
				.statusToSelectTripType(false)
				.usageType(UsageType.Business.toString())
				.paidBooking(false)
				.build();
		return new Object[][] {{vehiclePlanningDto}};
	}


	@DataProvider
	public Object[][] addStatusVehiclePlanning() {
		myStartTime=DateHelper.hourAndMinute(0, 60);
		myEndTime=DateHelper.hourAndMinute(2, 30);
		startDateTime=startAppendDate+" "+myStartTime[0]+":"+myStartTime[1];
		endDateTime=startAppendDate+" "+myEndTime[0]+":"+myEndTime[1];

		vehiclePlanningDto=VehiclePlanningDto.builder()
				.plateNumber(PLATE_NUMBER)
				.startDate(myDate)
				.endDate(myDate)
				.startTimeHour(myStartTime[0])
				.startTimeMinutes(myStartTime[1])
				.endTimeHour(myEndTime[0])
				.endTimeMinutes(myEndTime[1])
				.startDateTimeForBooking(startDateTime)
				.endDateTimeForBooking(endDateTime)
				.vehicleStatus(VehicleStatus.getVehicleStatus())
				.build();
		return new Object[][] {{vehiclePlanningDto}};
	}

}
