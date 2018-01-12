package glide.backoffice.method.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.bookings.HomepageBookings;
import glide.backoffice.locators.dashboard.HomepageDashboard;
import glide.backoffice.locators.fleets.technicalincidents.FilterIncidents;
import glide.backoffice.locators.fleets.vehicledamages.HomepageDamages;
import glide.backoffice.locators.fleets.vehicles.HomepageVehicles;
import glide.backoffice.locators.users.members.FilterMembers;
import glide.backoffice.utility.RegExpression;
import glide.backoffice.utility.SeleniumUtility;

public class DashboardMethod {
	
	SoftAssert softAssert;
	WebDriver driver;
	HomepageBookings homepageBookings;
	private HomepageDashboard homepageDashboard;
	HomepageVehicles homepageVehicles;
	FilterMembers filterMembers;
	FilterIncidents filterIncidents;
	HomepageDamages homepageDamages;
	public DashboardMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.softAssert= new SoftAssert();
		this.homepageDashboard=PageFactory.initElements(driver, HomepageDashboard.class);
		this.homepageBookings=PageFactory.initElements(driver, HomepageBookings.class);
		this.homepageVehicles=PageFactory.initElements(driver, HomepageVehicles.class);
		this.filterMembers=PageFactory.initElements(driver, FilterMembers.class);
		this.filterIncidents=PageFactory.initElements(driver, FilterIncidents.class);
		this.homepageDamages=PageFactory.initElements(driver, HomepageDamages.class);
	}


	

	public void checkVisibilityContent() {
		
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.aTagBookingInProgressContentHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.aTagDelayedBookingContentContentHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.aTagDirtyCarContentContentHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.aTagFeedbackReportedContentContentHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.aTagInvoicingErrorContentContentHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.aTagToValidateMemberContentContentHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.aTagTechnicalIncidentContentContentHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.aTagVehicleDamagedContentContentHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.spanTagBookingInProgressHeaderHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.spanTagDelayedBookingHeaderHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.spanTagDirtyCarHeaderHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.spanTagFeedbackReportedHeaderHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.spanTagInvoicingErrorHeaderHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.spanTagTechnicalIncidentHeaderHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.spanTagToValidateMemberHeaderHomepageDashboard));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, homepageDashboard.spanTagVehicleDamagedHeaderHomepageDashboard));

		softAssert.assertAll();
	}
	public void checkDashboardContain() {
		softAssert.assertTrue(RegExpression.matchDashBoardData(SeleniumUtility.getText(driver, homepageDashboard.aTagBookingInProgressContentHomepageDashboard)));
		softAssert.assertTrue(RegExpression.matchDashBoardData(SeleniumUtility.getText(driver, homepageDashboard.aTagDelayedBookingContentContentHomepageDashboard)));
		softAssert.assertTrue(RegExpression.matchDashBoardData(SeleniumUtility.getText(driver, homepageDashboard.aTagDirtyCarContentContentHomepageDashboard)));
		softAssert.assertTrue(RegExpression.matchDashBoardData(SeleniumUtility.getText(driver, homepageDashboard.aTagFeedbackReportedContentContentHomepageDashboard)));
		softAssert.assertTrue(RegExpression.matchDashBoardData(SeleniumUtility.getText(driver, homepageDashboard.aTagInvoicingErrorContentContentHomepageDashboard)));
		softAssert.assertTrue(RegExpression.matchDashBoardData(SeleniumUtility.getText(driver, homepageDashboard.aTagToValidateMemberContentContentHomepageDashboard)));
		softAssert.assertTrue(RegExpression.matchDashBoardData(SeleniumUtility.getText(driver, homepageDashboard.aTagTechnicalIncidentContentContentHomepageDashboard)));
		softAssert.assertTrue(RegExpression.matchDashBoardData(SeleniumUtility.getText(driver, homepageDashboard.aTagVehicleDamagedContentContentHomepageDashboard)));
		softAssert.assertAll();
	}
	
	public void checkDashboardPageNavigation() {
		//This page is navigate to the booking page with filter status in progress
		SeleniumUtility.clickOnElement(driver, homepageDashboard.aTagBookingInProgressContentHomepageDashboard);
		SeleniumUtility.waitElementToBeVisible(driver, homepageBookings.buttonTagCreateBooking);
		softAssert.assertTrue(driver.getCurrentUrl().contains("IN_PROGRESS"));
		driver.navigate().back();
		SeleniumUtility.waitUntilElementisNotVisible(driver, By.xpath(".//div[@class='sk-circle']"));
		
		//This page is navigate to the booking page with filter Booking delayed true 
		SeleniumUtility.clickOnElement(driver, homepageDashboard.aTagDelayedBookingContentContentHomepageDashboard);
		SeleniumUtility.waitElementToBeVisible(driver, homepageBookings.buttonTagCreateBooking);
		softAssert.assertTrue(driver.getCurrentUrl().contains("delayed"));
		driver.navigate().back();
		SeleniumUtility.waitUntilElementisNotVisible(driver, homepageDashboard.aTagBookingInProgressContentHomepageDashboard);

		//This page is navigate to the vehicle page with filter Cleanliness is DIRTY
		SeleniumUtility.clickOnElement(driver, homepageDashboard.aTagDirtyCarContentContentHomepageDashboard);
		SeleniumUtility.waitElementToBeVisible(driver, homepageVehicles.aTagFleetVehicleMgmtAddVehicle);
		softAssert.assertTrue(driver.getCurrentUrl().contains("DIRTY"));
		driver.navigate().back();
		SeleniumUtility.waitUntilElementisNotVisible(driver, By.xpath(".//div[@class='sk-circle']"));

		// This page is navigate to the booking page with filter invoicing error is true
		SeleniumUtility.clickOnElement(driver, homepageDashboard.aTagInvoicingErrorContentContentHomepageDashboard);
		SeleniumUtility.waitElementToBeVisible(driver, homepageBookings.buttonTagCreateBooking);
		softAssert.assertTrue(driver.getCurrentUrl().contains("failed"));
		driver.navigate().back();
		SeleniumUtility.waitUntilElementisNotVisible(driver, By.xpath(".//div[@class='sk-circle']"));

		// This page is navigate to members page with filter status is TO_REVIEW
		SeleniumUtility.clickOnElement(driver, homepageDashboard.aTagToValidateMemberContentContentHomepageDashboard);
		SeleniumUtility.waitElementToBeVisible(driver, filterMembers.buttonTagMainButtonFilterMembers);
		softAssert.assertTrue(driver.getCurrentUrl().contains("TO_REVIEW"));
		driver.navigate().back();
		SeleniumUtility.waitUntilElementisNotVisible(driver, By.xpath(".//div[@class='sk-circle']"));

		// This page is navigate to the incident page 
		SeleniumUtility.clickOnElement(driver, homepageDashboard.aTagTechnicalIncidentContentContentHomepageDashboard);
		SeleniumUtility.waitElementToBeVisible(driver, filterIncidents.buttonTagMainButtonFilterIncidents);
		softAssert.assertTrue(driver.getCurrentUrl().contains("incidents"));
		driver.navigate().back();
		SeleniumUtility.waitUntilElementisNotVisible(driver, By.xpath(".//div[@class='sk-circle']"));

		
		SeleniumUtility.clickOnElement(driver, homepageDashboard.aTagVehicleDamagedContentContentHomepageDashboard);
		SeleniumUtility.waitElementToBeVisible(driver, homepageDamages.buttonTagAddDamageHomepageDamages);
		softAssert.assertTrue(driver.getCurrentUrl().contains("vehicle-damages"));
		driver.navigate().back();
		SeleniumUtility.waitUntilElementisNotVisible(driver, By.xpath(".//div[@class='sk-circle']"));

		SeleniumUtility.clickOnElement(driver, homepageDashboard.aTagFeedbackReportedContentContentHomepageDashboard);
		softAssert.assertTrue(driver.getCurrentUrl().contains("feedbacks"));
		driver.navigate().back();
		SeleniumUtility.waitUntilElementisNotVisible(driver, By.xpath(".//div[@class='sk-circle']"));
		softAssert.assertAll();

	}

}
