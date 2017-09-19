package testrailtests;


import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.TestClassISuiteListener;

public class TestItest4 {


	@Test
	public void test4() {
		System.out.println("the configuration"+ TestClassISuiteListener.testme);
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


}
