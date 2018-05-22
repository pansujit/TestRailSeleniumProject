package glide.backoffice.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.log4j.Logger;




public class DateHelper {
	static Logger log = Logger.getLogger(SeleniumUtility.class.getName());
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
	
	/**
	 * This Static method does the date calculation. It checks also for the date pattern. If the pattern is not like 
	 * "YYYY-MM-DD" format, it will throw an error and sends NULL List. Otherwise, it will return List of integers where 
	 * 1st index for year and second index for currentMonth-givenMonth and 3rd index for given day.
	 * @param myDate - Should be String 
	 * @return {@code List<Integer>}
	 */
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
	
	
	/**
	 * This Static method does the date calculation. It checks also for the date pattern. If the pattern is not like 
	 * "YYYY-MM-DD" format, it will throw an error and sends NULL List. Otherwise, it will return List of integers where 
	 * 1st index for Given year and second index for shownMonthInDatePicker-givenMonth and 3rd index for given day.
	 * @param myDate - Should be String 
	 * @param text - Should be String
	 * @return {@code List<Integer>}
	 * 
	 */
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
	 * This Static method does the Month and day calculation. It checks also for the date pattern. If the pattern is not like 
	 * "YYYY-MM-DD" format, it will throw an error and sends NULL List. Otherwise, it will return List of integers where 
	 * 1st index for shownMonthInDatePicker-givenMonth and 2rd index for given day.
	 * @param myDate - Should be String 
	 * @param text - Should be String
	 * @return {@code List<Integer>}
	 * 
	 */
	public static List<Integer> selectMonthAndDate(String myDate,String text) {
		String[] monthFinder=text.split(" ");
		List<Integer> returnData=new ArrayList<>();
		if (!myDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
		   log.error("year month date is not formatted as YYYY-MM-DD format: ",  new RuntimeException(myDate));
		   return returnData;
		}
		int month=Month.valueOf(monthFinder[0].toUpperCase()).getValue();
		String[] testdate=myDate.split("-");
		int customMonth=Integer.parseInt(testdate[1]);
		int customDate=Integer.parseInt(testdate[2]);
		returnData.add(0,month-customMonth);
		returnData.add(1,customDate);
		return returnData;
		
		
	}
	
	

	/**
	 * This method returns the Array of Strings. The hours and minutes are based on current hours and minutes plus given hour and minutes.
	 * And it return always two digit hour(00 to 23) and two digit minutes (00 to 59)
	 * @param hours - Should be Integer to calculate hours
	 * @param minute - Should be Integer to calculate minutes
	 * @return {@code String[]} Array of hours and minutes in String Array
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
	
	public static String getCurrentDate() {
		Date date = new Date();
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}


}
