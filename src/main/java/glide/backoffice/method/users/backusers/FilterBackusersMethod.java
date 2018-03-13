package glide.backoffice.method.users.backusers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.users.backusers.FilterBackusers;
import glide.backoffice.utility.SeleniumUtility;

public class FilterBackusersMethod {
	
	WebDriver driver;
	FilterBackusers filterBackusers;
	public FilterBackusersMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.filterBackusers=PageFactory.initElements(driver, FilterBackusers.class);	
	}
	
	void waitUntilEmailFieldIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, filterBackusers.inputTagEmailFilterBackusers);
	}
	void clickOnSearchButton() {
		SeleniumUtility.clickOnElement(driver, filterBackusers.buttonTagSearchFilterBackusers);
	}
	void clickOnResetButton() {
		SeleniumUtility.clickOnElement(driver, filterBackusers.buttonTagResetFilterBackusers);
		
	}
	void inputEmailInEmailField(String email) {
		SeleniumUtility.clearTextAndSendText(driver, filterBackusers.inputTagEmailFilterBackusers, email);
	}
	void inputFirstnameInFirstnameField(String firstname) {
		SeleniumUtility.clearTextAndSendText(driver, filterBackusers.inputTagFirstnameFilterBackusers, firstname);
	}
	void inputLastnameInLastnameField(String lastname) {
		SeleniumUtility.clearTextAndSendText(driver, filterBackusers.inputTagLastnameFilterBackusers, lastname);
	}
	void  selectRoleInRoleField(String role) {
		// the role by value and visible text are different need to be done later some work
		SeleniumUtility.selectByvalue(driver, filterBackusers.selectTagRoleFilterBackusers, role);
	}
	/**
	 * This method click on the filter button in backuser homepage in backoffice
	 */
	void clickOnFilter() {
		if(!SeleniumUtility.checkElementIsVisible(driver, filterBackusers.inputTagEmailFilterBackusers)) {
			SeleniumUtility.clickOnElement(driver, filterBackusers.buttonTagFilterButtonFilterBackusers);
		}else {
			return;
		}
	}

}
