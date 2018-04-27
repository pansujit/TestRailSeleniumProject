package glide.backoffice.method.vehicleplanning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.vehicleplanning.SearchMemberPlanning;
import glide.backoffice.utility.SeleniumUtility;

public class SearchMemberPlanningMethod {
	WebDriver driver;
	SearchMemberPlanning searchMemberPlanning;
	public SearchMemberPlanningMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.searchMemberPlanning=PageFactory.initElements(driver, SearchMemberPlanning.class);
	}
	
	/**
	 * This method waits until the input field is visible on the search member in vehicle Planning
	 */
	void waitUntilInputIsDisplayed() {
		SeleniumUtility.waitElementToBeVisible(driver, searchMemberPlanning.inputTagSearchNameSearchMemberPlanning);
	}
	/**
	 * This method click on Input field in the search a member popup in vehicle planning
	 */
	void clickOnInputField() {
		SeleniumUtility.clickOnElement(driver, searchMemberPlanning.inputTagSearchNameSearchMemberPlanning);
	}
	/**
	 * This method type the given name in the input field of the search member popup in vehicle planning
	 * @param text - Should be String
	 */
	void sendTextOnInputField(String text) {
		
		SeleniumUtility.clearTextAndSendText(driver, searchMemberPlanning.inputTagSearchNameSearchMemberPlanning, text);
	}
	/**
	 * This method click on the email address in the dropdown list in search member in vehicle planning
	 * @param email - Should be String
	 */
	void clickOnDropDownItem(String email) {
		SeleniumUtility.clickOnElement(driver, searchMemberPlanning.divTagResultNameSearchMemberPlanning(email));

	}

}
