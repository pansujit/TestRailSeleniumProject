package glide.backoffice.locators.accounts.sitesandparkings;

import org.openqa.selenium.By;

public class AddParking {
	
	
	/**
	 * This locator will find  "yes" Radio Tag in parking hours in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By inputTagRadioParkingPageOpenWholeWeek= By.xpath(".//input[@id='parkingAccess_true']");
	
	/**
	 * This locator will find "No" Radio Tag in parking hours in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By inputTagRadioParkingPageCustomParkingHour= By.xpath(".//input[@id='parkingAccess_false']/../label");
	
	/**
	 * This locator will find  "Apply french bank holidays" Tag in parking in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By spanTagParkingPageBankHolidayText= By.xpath(".//*[@id='bankHolidays_true']/../../../span/span/span");
	/**
	 * This locator will find BankHoliday True Radio Button Tag in parking in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By inputTagParkingPageYesToBankHoliday= By.xpath(".//input[@id='bankHolidays_true']/../label");
	/**
	 * This locator will find BankHoliday False Radio Button Tag in parking in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By inputTagParkingPageNoToBankHoliday= By.xpath("//input[@id='bankHolidays_false']/../label");
	/**
	 * This locator will find Outside the Parking hour text Tag in parking in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By spanTagParkingPageOutSideParkingHourText= By.xpath(".//input[@id='outsideOpeningHours_true']/../../../span/span/span");
	/**
	 * This locator will find Outside Parking hours True Radio Button Tag in parking in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By inputTagParkingPageYesToOutsideParkingHours= By.xpath(".//input[@id='outsideOpeningHours_true']/../label");
	/**
	 * This locator will find Outside Parking hours False Radio Button Tag in parking in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By inputTagParkingPageNoToOutsideParkingHours= By.xpath(".//input[@id='outsideOpeningHours_false']/../label");
	/**
	 * This locator will find Outside the Parking area text Tag in parking in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By spanTagParkingPageOutsideParkingArea= By.xpath(".//input[@id='outsideParkingArea_true']/../../../span/span/span");
	/**
	 * This locator will find Outside Parking area True Radio Button Tag Tag in parking in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By inputTagParkingPageYesToOutsideParkingArea= By.xpath(".//input[@id='outsideParkingArea_true']/../label");
	/**
	 * This locator will find Outside Parking area False Radio Button Tag Tag in parking in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By inputTagParkingPageNoToOutsideParkingArea= By.xpath(".//input[@id='outsideParkingArea_false']/../label");
	/**
	 * This locator will find Tag in parking in the Account Management->Sites and Parking->Edit->ParkingEdit
	 */
	final public By inputTagParkingPage= By.xpath("");

}
