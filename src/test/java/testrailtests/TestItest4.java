package testrailtests;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestItest4 extends Beforetest {


	@Test
	public void test4() {
		Assert.assertTrue(true);
	}
	@Test
	public void test5() {
		Assert.assertTrue(true);
	}
	@Test
	public void test6() {
		Assert.assertTrue(false);
	}
	@AfterMethod
	public void afterMethod(ITestResult result) {
		//System.out.println(result.getMethod().getMethodName().toString() + result.getStatus());
		methodName.add(result.getMethod().getMethodName().toString());
	}

}
