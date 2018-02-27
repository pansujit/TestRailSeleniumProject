package glide.backoffice.dataprovider;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import glide.backoffice.enums.BackuserRoles;
import glide.backoffice.method.bookings.BookingDto;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.users.backusers.BackuserDto;
import glide.backoffice.utility.DateHelper;
import glide.backoffice.utility.RandomGenerator;

public class BookingDataProvidor {
	BookingDto bookingDto;
	Date date = new Date();
	String myDate=new SimpleDateFormat("yyyy-MM-dd").format(date);
	String startAppendDate=new SimpleDateFormat("dd.MM.yyyy").format(date);
	String[] myStartTime=DateHelper.hourAndMinute(0, 25);
	String[] myEndTime=DateHelper.hourAndMinute(1, 30);
	String startDateTime=startAppendDate+" "+myStartTime[0]+":"+myStartTime[1];
	String endDateTime=startAppendDate+" "+myEndTime[0]+":"+myEndTime[1];
	@DataProvider
	public Object[][] createBooking() {
		
			bookingDto=BookingDto.builder()
					.memberEmail(Config.getProperty("MEMBER_LOGIN"))
					.startAddress("1 Rue de Gramont, 75002 Paris, France")
					.status("Scheduled")
					.secondStatus("Canceled")
					.startDate(myDate)
					.endDate(myDate)
					.startTimeHour(myStartTime[0])
					.startTimeMinutes(myStartTime[1])
					.endTimeHour(myEndTime[0])
					.endTimeMinutes(myEndTime[1])
					.firstname(Config.getProperty("MEMBER_FIRSTNAME"))
					.startDateTimeForBooking(startDateTime)
					.endDateTimeForBooking(endDateTime)
					.build();
	
			return new Object[][] {{bookingDto}};
	}

}
