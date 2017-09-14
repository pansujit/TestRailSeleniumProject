package testrailtests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeSuite;

public class Beforetest {
	static List<String> methodName= new ArrayList<String>();	


	@BeforeSuite
	public void beforeSuite() {
		System.out.println("hello");
	}
}
