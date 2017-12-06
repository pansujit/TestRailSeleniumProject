package glide.backoffice.test.bookings;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.LocalTime;


public class TestingClass {

	
	public static void main(String[] args) {
		org.joda.time.LocalTime hourAndDate= org.joda.time.LocalTime.now().plusHours(18).plusMinutes(6);
		String hr;
		String min;
		if(hourAndDate.getHourOfDay()<10) {
			hr="0"+Integer.toString(hourAndDate.getHourOfDay());
		}
		else
		{
			hr=Integer.toString(hourAndDate.getHourOfDay());
		}
		
		if(hourAndDate.getMinuteOfHour()<10) {
			min="0"+Integer.toString(hourAndDate.getMinuteOfHour());
		}
		else
		{
			min=Integer.toString(hourAndDate.getMinuteOfHour());
		}
		
		System.out.println(hr+" " +min);
	}
}
