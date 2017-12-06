package glide.backoffice.test.homepage;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import glide.backoffice.method.common.VeifyObjectElement;
import glide.backoffice.test.baseclass.BaseClassExtended;


public class TestLogin extends BaseClassExtended {
	SoftAssert sa= new SoftAssert();

	@Test
	public void verifyDashBoardHeaderTest() {
		VeifyObjectElement dashboard=PageFactory.initElements(driver, VeifyObjectElement.class);
		sa.assertTrue(dashboard.verifyDashBoardLink("DASHBOARD"));
		sa.assertTrue(dashboard.verifyAccountsLink("Accounts"));
		sa.assertTrue(dashboard.verifyBookingsLink("Bookings"));
		sa.assertTrue(dashboard.verifyInvoiceLink("Invoices"));
		sa.assertTrue(dashboard.verifyUsersLink("Users"));
		sa.assertTrue(dashboard.verifyVehiclesLink("Fleets"));
	}
	
	
	
	
	
	
	
	

}
