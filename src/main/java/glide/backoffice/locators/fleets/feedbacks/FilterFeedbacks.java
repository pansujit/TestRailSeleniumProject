package glide.backoffice.locators.fleets.feedbacks;

import org.openqa.selenium.By;

public class FilterFeedbacks {
	
	
	/**
	 * This locator will find filter tag element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	
	public final By divTagFilterFilterFeedbacks= By.xpath(".//div[@id='bookings_filter_type_wrap']/div[1]/div[2]");
	
	/**
	 * This locator will find filter key dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	
	public final By divTagDropdownMenuFilterFeedbacks= By.xpath(".//div[@role='menu']");
	
	/**
	 * This locator will find filter key Booking Id in dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	
	public final By divTagFilterKeyBookingIdFilterFeedbacks= By.xpath(".//span[@id='bookings_filter_type_bookingId']/div/div/div");
	
	/**
	 * This locator will find filter key member email in dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	
	public final By divTagFilterKeyLastnameFilterFeedbacks= By.xpath(".//span[@id='bookings_filter_type_memberEmail']/div/div/div");
	
	/**
	 * This locator will find filter key Member Name in dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	
	public final By divTagFilterKeyEmailFilterFeedbacks= By.xpath(".//span[@id='bookings_filter_type_memberName']/div/div/div");
	/**
	 * This locator will find filter key PlateNumber in dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	
	public final By divTagFilterKeyRoleFilterFeedbacks= By.xpath(".//span[@id='bookings_filter_type_plateNumber']/div/div/div");
	
	/**
	 * This locator will find filter key Dirty vehicle in dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	
	public final By divTagFilterKeyDirtyVehicleFilterFeedbacks= By.xpath(".//span[@id='bookings_filter_type_withCleanlinessProblems']/div/div/div");
	
	/**
	 * This locator will find filter key Damage declared in dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	
	public final By divTagFilterKeyDamageDeclaredFilterFeedbacks= By.xpath(".//span[@id='bookings_filter_type_withDamagesDeclared']/div/div/div");
	
	/**
	 * This locator will find filter key Feedback status in dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	
	public final By divTagFilterKeyFeedbackStatusFilterFeedbacks= By.xpath(".//span[@id='bookings_filter_type_status']/div/div/div");
	
	
	/**
	 * This locator will find filter value Booking Id in dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	public final By inputTagFilterValueBookingIdFilterFeedbacks= By.xpath(".//input[@id='bookings_filter_value_input_bookingId']");
	
	
	/**
	 * This locator will find filter value Member email in dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	public final By inputTagFilterValueMemberEmailFilterFeedbacks= By.xpath(".//input[@id='bookings_filter_value_input_memberEmail']");
	
	
	/**
	 * This locator will find filter value Member Name in dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	public final By inputTagFilterValueMemberNameFilterFeedbacks= By.xpath(".//input[@id='bookings_filter_value_input_memberName']");
	
	/**
	 * This locator will find filter value Plate number in dropdown menu  element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	public final By inputTagFilterValuePlateNumberFilterFeedbacks= By.xpath(".//input[@id='bookings_filter_value_input_plateNumber']");

	/**
	 * This locator will find filter FilterConfirm Button element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	public final By divTagFilterConfirmFilterFeedbacks= By.xpath(".//div[@id='bookings_filter_confirm_button']");

	
	/**
	 * This locator will find filter value for Feeback status , cleanliness status and damage declared
	 *   element in homepage in the Fleets-->Feedback-->HomePage filter
	 */
	public final By divTagFilterValueDirtyVehicleFilterFeedbacks(String vehicleCleanlinessStatus) {
		String text= ".//span[@id='bookings_filter_value_xxxx']/div/div/div";
		return By.xpath(text.replace("xxxxx", vehicleCleanlinessStatus));
	}

	

}
