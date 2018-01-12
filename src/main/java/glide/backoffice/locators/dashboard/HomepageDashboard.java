package glide.backoffice.locators.dashboard;

import org.openqa.selenium.By;

public class HomepageDashboard {

	/**
	 * Locator Booking in progress content in DashBoard in back office
	 */
	public final By aTagBookingInProgressContentHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/bookings/%7B%22status%22%3A%22')]");

	/**
	 * Locator Booking in progress Header in DashBoard in back office
	 */
	public final By spanTagBookingInProgressHeaderHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/bookings/%7B%22status%22%3A%22')]/../header/span/span");
	/**
	 * Locator Delayed booking content in DashBoard in back office
	 */
	public final By aTagDelayedBookingContentContentHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/bookings/%7B%22delayed%22%3A%22true')]");
	/**
	 * Locator Delayed booking Header in DashBoard in back office
	 */
	public final By spanTagDelayedBookingHeaderHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/bookings/%7B%22delayed%22%3A%22true')]/../header/span/span");

	/**
	 * Locator Feedback reported content in DashBoard in back office
	 */
	public final By aTagFeedbackReportedContentContentHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/feedbacks/%7B%22status%22%3A%22NEW')]");
	/**
	 * Locator Feedback reported Header in DashBoard in back office
	 */
	public final By spanTagFeedbackReportedHeaderHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/feedbacks/%7B%22status%22%3A%22NEW')]/../header/span/span");

	/**
	 * Locator Vehicle Damaged content in DashBoard in back office
	 */
	public final By aTagVehicleDamagedContentContentHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/vehicle-damages/')]");
	/**
	 * Locator Vehicle Damaged Header in DashBoard in back office
	 */
	public final By spanTagVehicleDamagedHeaderHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/vehicle-damages/')]/../header/span/span");
	/**
	 * Locator Dirty car content in DashBoard in back office
	 */
	public final By aTagDirtyCarContentContentHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/fleet/%7B%22cleanliness')]");
	/**
	 * Locator Dirty car Header in DashBoard in back office
	 */
	public final By spanTagDirtyCarHeaderHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/fleet/%7B%22cleanliness')]/../header/span/span");

	/**
	 * Locator To validate Member content in DashBoard in back office
	 */
	public final By aTagToValidateMemberContentContentHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/members/%7B%22status%22%3A%22TO_REVIEW')]");
	/**
	 * Locator To validate Member Header in DashBoard in back office
	 */
	public final By spanTagToValidateMemberHeaderHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/members/%7B%22status%22%3A%22TO_REVIEW')]/../header/span/span");


	/**
	 * Locator Technical Incident content in DashBoard in back office
	 */
	public final By aTagTechnicalIncidentContentContentHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/incidents')]");
	/**
	 * Locator Technical Incident Header in DashBoard in back office
	 */
	public final By spanTagTechnicalIncidentHeaderHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/incidents')]/../header/span/span");
	/**
	 * Locator External Invoicing Error content in DashBoard in back office
	 */
	public final By aTagInvoicingErrorContentContentHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/bookings/%7B%22failed')]");
	/**
	 * Locator External Invoicing Error Header in DashBoard in back office
	 */
	public final By spanTagInvoicingErrorHeaderHomepageDashboard= 
			By.xpath(".//a[@class='dashboardItem_link' and contains(@href,'#/bookings/%7B%22failed')]/../header/span/span");


	

}
