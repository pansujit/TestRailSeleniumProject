package testrailtests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import testrail.APIException;
import testrail.TestRailAPI;

public class TestBeforesuite {

	public static void main(String[] args) throws MalformedURLException, IOException, APIException {
		
		TestRailAPI.get_plan(5);
		for(int i=0;i<TestRailAPI.testString.size();i++)
		{
			if(TestRailAPI.testString.get(i).equalsIgnoreCase("chrome, mac")) {
				System.out.println("I am matching");
			}
		}
	
		
		

	}

}
