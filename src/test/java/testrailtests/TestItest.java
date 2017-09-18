package testrailtests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.ISuiteListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

public class TestItest extends Beforetest  {



	@Test
	public void bibi() {
		Assert.assertTrue(true);
	}
	@Test
	public void didi() {
		Assert.assertTrue(true);
	}
	@Test
	public void cici() {
		Assert.assertTrue(false);
	}
	@AfterMethod
	public void afterMethod(ITestResult result) {
		//System.out.println(result.getMethod().getMethodName().toString() + result.getStatus());
		methodName.add(result.getMethod().getMethodName().toString());
	}


}
