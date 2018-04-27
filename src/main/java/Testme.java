



import org.json.simple.parser.ParseException;

import glide.backoffice.method.common.ApiCallsMethod;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;


public class Testme {

	public static void main(String[] args) throws FileNotFoundException,  ParseException {
	/*	List<String> listOne= new ArrayList<String>();
		List<String> listTwo= new ArrayList<String>();
		 JSONParser parser = new JSONParser();
		  JSONArray a = (JSONArray) parser.parse(new FileReader("src/test/resources/firstAll.txt"));
		  JSONArray b= (JSONArray) parser.parse(new FileReader("src/test/resources/notAll.txt"));
		  for (Object o : a)
		  {
		    JSONObject person = (JSONObject) o;

		    String bookingId = (String) person.get("id");
		    listOne.add(bookingId);
		  }
		  
		  for (Object o : b)
		  {
		    JSONObject person = (JSONObject) o;

		    String bookingId = (String) person.get("id");
		    listTwo.add(bookingId);
		  }
		  
		  listOne.removeAll(listTwo);
		System.out.println(listOne.size());
		
		try (PrintWriter out = new PrintWriter("src/test/resources/filename.txt")) {
			for(String text:listOne )
		    out.println(text+"\n");
		}*/
		//ApiCallsMethod.deletestatus();
		
		Testme calUsage = new Testme();
	       //calUsage.performCalendarArithmetic();
		
		   Random rand = new Random();

		    // nextInt is normally exclusive of the top value,
		    // so add 1 to make it inclusive
		   for(int i=0;i<100;i++) {
		    int randomNum = rand.nextInt((3 - 1) + 1) + 1;

		    System.out.println(randomNum); 
		   }
		
	}	
	
	   private void performCalendarArithmetic() {
		 //set calendar to 6th March 2009
		 //Initialize your Date however you like it.
		   Date date = new Date();
		   Calendar calendar = new GregorianCalendar();
		   calendar.setTime(date);
		   calendar.add(Calendar.HOUR, 7);
		   calendar.add(Calendar.MINUTE, 7);

		      System.out.println("Current Date::");
		      SimpleDateFormat sdf = new SimpleDateFormat("HH");
		      String date1 = sdf.format(calendar.getTime());
		      System.out.println(date1);
		      SimpleDateFormat sdf1 = new SimpleDateFormat("mm");
		      date1 = sdf1.format(calendar.getTime());
		      System.out.println(date1);

		   }
}
