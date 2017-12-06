package glide.backoffice.method.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.common.BackOfficeHomepage;
import glide.backoffice.utility.SeleniumUtility;

public class VeifyObjectElement {
	
	
	WebDriver driver;
	BackOfficeHomepage backOfficeHomepage;
	public VeifyObjectElement(WebDriver ldriver) {
		this.driver=ldriver;
		this.backOfficeHomepage=PageFactory.initElements(ldriver, BackOfficeHomepage.class);
	}
	
	public boolean verifyDashBoardLink(String headerName) {
		
		return SeleniumUtility.compareIgnoreCaseText(driver, backOfficeHomepage.aTagBackOfficeHomepageDashboard, headerName);
	}

	public boolean verifyAccountsLink(String headerName) {
		
		return SeleniumUtility.compareIgnoreCaseText(driver, backOfficeHomepage.buttonTagAccountsBackOfficeHomepage, headerName);
	}
	public boolean verifyUsersLink(String headerName) {
		
		return SeleniumUtility.compareIgnoreCaseText(driver, backOfficeHomepage.buttonTagUsersBackOfficeHomepage, headerName);
	}
	public boolean verifyVehiclesLink(String headerName) {
		
		return SeleniumUtility.compareIgnoreCaseText(driver, backOfficeHomepage.buttonTagFleetsBackOfficeHomepage, headerName);
	}
	public boolean verifyBookingsLink(String headerName) {
		
		return SeleniumUtility.compareIgnoreCaseText(driver, backOfficeHomepage.aTagBookingsBackOfficeHomepage, headerName);
	}
	public boolean verifyInvoiceLink(String headerName) {
		
		return SeleniumUtility.compareIgnoreCaseText(driver, backOfficeHomepage.aTagInvoicesBackOfficeHomepage, headerName);
	}

	

}
