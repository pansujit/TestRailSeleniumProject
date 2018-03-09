package glide.backoffice.dataprovider;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import glide.backoffice.enums.BackuserRoles;
import glide.backoffice.enums.Status;
import glide.backoffice.enums.UsageType;
import glide.backoffice.method.bookings.BookingDto;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.users.backusers.BackuserDto;
import glide.backoffice.utility.DateHelper;
import glide.backoffice.utility.RandomGenerator;

public class BookingDataProvidor {
	private static final String START_ADDRESS="1 Rue de Gramont, 75002 Paris, France";
	private static final String MEMBER_LOGIN=Config.getProperty("MEMBER_LOGIN");
	private static final String MEMBER_FIRSTNAME=Config.getProperty("MEMBER_FIRSTNAME");
	BookingDto bookingDto;
	Date date = new Date();
	String myDate=new SimpleDateFormat("yyyy-MM-dd").format(date);
	String startAppendDate=new SimpleDateFormat("dd.MM.yyyy").format(date);
	String[] myStartTime=DateHelper.hourAndMinute(0, 25);
	String[] myEndTime=DateHelper.hourAndMinute(1, 30);
	String startDateTime=startAppendDate+" "+myStartTime[0]+":"+myStartTime[1];
	String endDateTime=startAppendDate+" "+myEndTime[0]+":"+myEndTime[1];
	@DataProvider
	public Object[][] createRoundTripPrivateBooking() {
		
			bookingDto=BookingDto.builder()
					.memberEmail(MEMBER_LOGIN)
					.startAddress(START_ADDRESS)
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
			return new Object[][] {{bookingDto}};
	}
	
	@DataProvider
	public Object[][] createOneWayPrivateBooking() {
		
			bookingDto=BookingDto.builder()
					.memberEmail(MEMBER_LOGIN)
					.startAddress(START_ADDRESS)
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
			return new Object[][] {{bookingDto}};
	}
	
	@DataProvider
	public Object[][] createRoundTripBusinessBooking() {
		
			bookingDto=BookingDto.builder()
					.memberEmail(MEMBER_LOGIN)
					.startAddress(START_ADDRESS)
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
			return new Object[][] {{bookingDto}};
	}
	@DataProvider
	public Object[][] createOneWayBusinessBooking() {
		
			bookingDto=BookingDto.builder()
					.memberEmail(MEMBER_LOGIN)
					.startAddress(START_ADDRESS)
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
			return new Object[][] {{bookingDto}};
	}

}
