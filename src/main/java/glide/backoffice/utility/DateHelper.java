package glide.backoffice.utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;


public class DateHelper {
	static Logger log = Logger.getLogger(DateHelper.class.getName());
	  private DateHelper() {
		    throw new IllegalStateException("Utility class");
		  }

		


	/**
	 * This method in dataHelper class will compare actual month and month in the calendar and return the difference.
	 * @param text should be String
	 * @return Integer
	 * @throws ParseException
	 */
	public  static int initialplannedBookingDate(String text) throws ParseException {
		Date date = new Date();
		final java.util.Calendar cal = GregorianCalendar.getInstance(); 
		cal.setTime( date );
		int month=cal.get(GregorianCalendar.MONTH);
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM yyyy");
		SimpleDateFormat monthDate = new SimpleDateFormat("MM");
		Date date1 = sdf.parse(text);
		int rr=Integer.parseInt(monthDate.format(date1));
		return (rr-month);
	}
	
	public static List<Integer> selectdate(String myDate) {
		List<Integer> returnData=new ArrayList<>();
		if (!myDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
		   log.error("year month date is not formatted as YYYY-MM-DD format: ",  new RuntimeException(myDate));
		   return returnData;
		}
		int month=LocalDate.now().getMonth().getValue();
		String[] testdate=myDate.split("-");
		int customYear=Integer.parseInt(testdate[0]);
		int customMonth=Integer.parseInt(testdate[1]);
		int customDate=Integer.parseInt(testdate[2]);
		returnData.add(customYear);
		returnData.add(1,month-customMonth);
		returnData.add(2,customDate);
		return returnData;
		
		
	}
	
	public static List<Integer> selectdate(String myDate,String text) {
		String[] monthFinder=text.split(" ");
		
		List<Integer> returnData=new ArrayList<>();
		if (!myDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
		   log.error("year month date is not formatted as YYYY-MM-DD format: ",  new RuntimeException(myDate));
		   return returnData;
		}
		int month=Month.valueOf(monthFinder[0].toUpperCase()).getValue();
		String[] testdate=myDate.split("-");
		int customYear=Integer.parseInt(testdate[0]);
		int customMonth=Integer.parseInt(testdate[1]);
		int customDate=Integer.parseInt(testdate[2]);
		returnData.add(customYear);
		returnData.add(1,month-customMonth);
		returnData.add(2,customDate);
		return returnData;
		
		
	}
	
	
	
	/**
	 * This method in dataHelper class will return Instant booking hour which is the actual hours in the system.
	 * @return String
	 */
	public static String initialInstantBookingHour() {

		DateFormat dateFormat = new SimpleDateFormat("HH");
		Date date = new Date();
		return dateFormat.format(date);
	}
	/**
	 * This method in dataHelper class will return Instant booking minutes which is ceil to multiple of 5.
	 * @return String
	 */
	public static String initialInstantBookingMinute() {

		DateFormat dateFormat = new SimpleDateFormat("mm");
		Date date = new Date();
		int x=Integer.parseInt(dateFormat.format(date));
		if(x==0) {
			return String.format("%d", 5);
		}
		else {
			return(Integer.toString((int)Math.ceil(x/5.0)*5));
		}	
	}
	/**
	 * This method in dataHelper class will return Instant booking for return date which is 2 hours plus from return date
	 * @return String 
	 */
	public static String finalInstantBookingHour() {

		return Integer.toString(LocalDateTime.now().plusHours(2).getHour());	
	}


	/**
	 * This method in dataHelper class will return Instant booking for return date which is 2 hours plus from return date
	 * @param hours should be Integer
	 * @return String 
	 */
	public static String customInstantBookingHour(int hours) {

		return Integer.toString(LocalDateTime.now().plusHours(hours).getHour());	
	}
	/**
	 * This method in dataHelper class will return Instant booking minutes which is ceil to multiple of 5.
	 * @param minutes should be String
	 * @return String
	 */
	public static String initialInstantBookingMinute(int minutes) {
		if(minutes==0) {
			return String.format("%d", 5);
		}
		else {
			return(Integer.toString((int)Math.ceil(minutes/5.0)*5));
		}	
	}
	/**
	 * This is custom date for checking the year, month and days are after or equal to current date
	 * @param year should be int
	 * @param month should be int
	 * @param day should be int
	 * @return boolean
	 */
	public static boolean checkDate(int year, int month, int day) {
		if (LocalDateTime.now().getYear()>year) 
		{
			return true;
		}
		else if (LocalDateTime.now().getYear()==year) 
		{
			if(LocalDateTime.now().getMonthValue()>month) {
				return true;
			}
			else if(LocalDateTime.now().getMonthValue()==month) {
				if(LocalDateTime.now().getDayOfMonth()>=day) {
					return true;
				}
				else
				{
					return false;
				}

			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		
	}
	
	/**
	 * This method will return the hour and minute from the given time zone
	 * @param hours
	 * @param minute
	 * @return
	 */
	public static  String[] hourAndMinute(int hours, int minute) {
		org.joda.time.LocalTime hourAndDate= org.joda.time.LocalTime.now().plusHours(hours).plusMinutes(minute);
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
		
		return new String[] {hr, min};
	}


}
