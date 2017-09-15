package testrailtests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import testrail.APIException;
import testrail.TestRailTestForTest;

public class Jptclass {

	public static void main(String[] args) throws MalformedURLException, IOException, APIException {
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

		TestRailTestForTest.get_plan(25);
		
	}

}
