package glide.backoffice.test.dashboardtest;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.method.dashboard.DashboardMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class DashboardTest extends BaseClassExtended {

	@BeforeClass
	public void openingBrowser() throws MalformedURLException, InterruptedException {
		OpenBrowser();
	}
	
	@Test(description= "This test verifies the visibility of all dashboard contents")
	public void dashboradContentVisibilityTest() {
		DashboardMethod dashboardMethod=PageFactory.initElements(driver, DashboardMethod.class);
		dashboardMethod.checkVisibilityContent();
	}
	@Test(description= "This test verifies the value of all dashboard contents")
	public void dashboradContentTest() {
		DashboardMethod dashboardMethod=PageFactory.initElements(driver, DashboardMethod.class);
		dashboardMethod.checkDashboardContain();
	}
	@Test(description= "This test verifies the navigation to the link page from dashboard")
	public void dashboradNavigationTest() {
		DashboardMethod dashboardMethod=PageFactory.initElements(driver, DashboardMethod.class);
		dashboardMethod.checkDashboardPageNavigation();
	}
	@AfterClass
	public void closeAllBrowser() {
		closeBrowser();
	}

}
