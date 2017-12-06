package testrailtests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.IntStream;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import com.beust.jcommander.converters.ISO8601DateConverter;

import testrail.APIException;
import testrail.TestRailTestForTest;

public class Jptclass {
	final static Logger logger = Logger.getLogger(Jptclass.class);
	static final String path = "src/test/resources/log4j.properties";

	public static void main(String[] args) throws MalformedURLException, IOException, APIException, InterruptedException {
		PropertyConfigurator.configure(path);
		//System.out.println(System.getProperty("os.name"));
		//System.out.println(Browser.ie.getBrowserName());
		//System.out.println(OperatingSystem.windows.getOSName());
		//System.out.println(StringToIntEnum.firefox.getBrowserValueInInteger());
		//HashMap<String,HashMap<String, Integer>> test= new HashMap<String,HashMap<String, Integer>>();
		//HashMap<String, Integer> test1= new HashMap<String, Integer>();
		//test1.put("hello", 1);
		//test.put("browse",test1);
		//System.out.println((test.get("browse").get("hello")));
		
		//TestRailTestForTest testplan=TestRailTestForTest();

	//TestRailTestForTest.get_plan(25);
		//TestRailTestForTest.getconfig(1);
		//TestRailTestForTest.get_cases(1,1);
		//TestRailTestForTest test= new TestRailTestForTest();
		//test.get_cases(1, 1);
		//logger.debug("hello");
		//System.out.println((new Date()).toString());
		/*list.add(1);list.add(2);
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(1);list2.add(2);
		System.out.println(list.equals(list2));*/

		long x=System.currentTimeMillis();
		Thread.sleep(2000);
		long y=System.currentTimeMillis();
		System.out.println((y-x)/1000.00);
		//  "companyId" : "45cf4775-5362-4928-8b60-8b15488ccc0e"

		//String  superCompanyId="7ad1caa1-818f-4d31-a844-0446f42494b8";
		//System.out.println(UUID.fromString(superCompanyId));
		
       //String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 16);
       // System.out.println(uuid.getClass().getName());
		DateTimeFormatter parser2 = ISODateTimeFormat.dateTime();
		LocalDateTime dateTime= LocalDateTime.now();
		String jtdate = "2010-01-01T12:00:00.000Z";
		System.out.println(dateTime.toString()+"Z");		
        
		
	}

}
