package testrailtests;

import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.TestClassISuiteListener;

public class TestItest {



	@Test
	public void bibi() {
		System.out.println("this is configuration"+ TestClassISuiteListener.testme);
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



}
