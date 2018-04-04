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
	void clickOnInputField() {
		SeleniumUtility.clickOnElement(driver, searchMemberPlanning.inputTagSearchNameSearchMemberPlanning);
	}
	void sendTextOnInputField(String text) {
		
		SeleniumUtility.clearTextAndSendText(driver, searchMemberPlanning.inputTagSearchNameSearchMemberPlanning, text);
	}
	void clickOnDropDownItem(String email) {
		SeleniumUtility.clickOnElement(driver, searchMemberPlanning.divTagResultNameSearchMemberPlanning(email));

	}

}
