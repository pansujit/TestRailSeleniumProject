package glide.backoffice.test.accounts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import glide.backoffice.method.accounts.ParkingHoursMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class ParkingHours extends BaseClassExtended {
	
	
	@Test
	public void verifyElementsInParkingHours() {	
		ParkingHoursMethod parkingHours= PageFactory.initElements(driver, ParkingHoursMethod.class);
		Assert.assertTrue(parkingHours.testParkingHour());
		
	}
	@Test 
	public void addTimeFrame() {
		
	}


}
