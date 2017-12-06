package glide.backoffice.method.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.common.BackOfficeDashBoard;
import glide.backoffice.locators.common.BackOfficeHomepage;
import glide.backoffice.utility.SeleniumUtility;

public class DashBoardTest {
	
	WebDriver driver;
	BackOfficeHomepage backOfficeHomepage;
	public DashBoardTest(WebDriver ldriver) {
		this.driver=ldriver;
		this.backOfficeHomepage=PageFactory.initElements(ldriver, BackOfficeHomepage.class);
	}
	
	public boolean verifyDashBoardHeader(String headerName) {
		
		return SeleniumUtility.compareIgnoreCaseText(driver, backOfficeHomepage.aTagBackOfficeHomepageDashboard, headerName);
	}
	

}
