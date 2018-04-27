package glide.backoffice.method.vehicleplanning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.vehicleplanning.AddStatusPlanning;
import glide.backoffice.utility.SeleniumUtility;

public class AddStatusPlanningMethod {
	WebDriver driver;
	AddStatusPlanning addStatusPlanning;
	public AddStatusPlanningMethod(WebDriver ldriver) {
		this.driver= ldriver;
		this.addStatusPlanning=PageFactory.initElements(driver, AddStatusPlanning.class);
	}
	/**
	 * This method waits until the SAVE button is visible the Add status in vehicle planning page
	 */
	void waitUntilSaveButtonIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, addStatusPlanning.buttonTagSaveAddStatusPlanning);
	}

	/**
	 * This method clicks on the SAVE button in the Add status in vehicle planning page
	 */
	void clickOnSaveButtonInAddStatus() {
		SeleniumUtility.clickOnElement(driver, addStatusPlanning.buttonTagSaveAddStatusPlanning);
	}

	/**
	 * This method clicks on the start date of add status in vehicle planning
	 */
	void clickOnStartDate() {
		SeleniumUtility.clickOnElement(driver, addStatusPlanning.inputTagStartDateAddStatusPlanning);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method clicks on the end date element of add status in vehicle planning
	 */
	void clickOnEndDate() {
		SeleniumUtility.clickOnElement(driver, addStatusPlanning.inputTagEndDateAddStatusPlanning);
		SeleniumUtility.fixedWait(1);
	}

	/**
	 * This method selects the start hour and minute for the vehicle status in add status in vehicle planning
	 * @param hours - Should be String
	 * @param minute - Should be String
	 */
	void startHourAndMinute(String hours, String minute) {		
		SeleniumUtility.selectByVisibleText(driver, addStatusPlanning.divTagStartHourAddStatusPlanning, hours);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, addStatusPlanning.divTagStartMinuteAddStatusPlanning, minute);
		SeleniumUtility.fixedWait(1);
	}

	/**
	 * This method selects the end hour and minute for the vehicle status in add status in vehicle planning
	 * @param hours - Should be String
	 * @param minute - Should be String
	 */
	void endHourAndMinute(String hours, String minute) {		
		SeleniumUtility.selectByVisibleText(driver, addStatusPlanning.divTagEndHourAddStatusPlanning, hours);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, addStatusPlanning.divTagEndMinuteAddStatusPlanning, minute);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method clicks on the arrow button to display the available status in the dropdown in add status page.
	 */
	void clickOnStatusDropdown() {
		SeleniumUtility.clickOnElement(driver, addStatusPlanning.divTagVehicleStatusAddStatusPlanning);
		SeleniumUtility.fixedWait(1);
	}

	/**
	 * This method clicks on the given status in the add dropdown list in add status in vehicle planning
	 * @param status - Should be String
	 */
	void selectStatusFromDropdown(String status) {
		SeleniumUtility.clickOnElement(driver, addStatusPlanning.divTagStatusListAddStatusPlanning(status));
		SeleniumUtility.fixedWait(1);
	}







}
