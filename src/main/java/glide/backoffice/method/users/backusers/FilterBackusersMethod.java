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
	
	/**
	 * This method click on the filter button and wait until firstname element is clickable in filter dropdown in backuser homepage
	 */
	void clickOnFilter() {
		SeleniumUtility.clickOnElement(driver, filterBackusers.divTagFilterFilterBackusers);
		SeleniumUtility.waitElementToBeClickable(driver, filterBackusers.divTagFilterKeyFirstnameFilterBackusers);
	}
	void waitUntilElementIsNotVisible() {
		SeleniumUtility.waitUntilElementisNotVisible(driver, filterBackusers.divTagDropdownMenuFilterBackusers);
		SeleniumUtility.fixedMilliSecondWait();
	}
	void clickOnRole() {
		SeleniumUtility.clickOnElement(driver,filterBackusers.divTagFilterKeyRoleFilterBackusers);
		waitUntilElementIsNotVisible();
	}
	void clickOnFirstname() {
		SeleniumUtility.clickOnElement(driver,filterBackusers.divTagFilterKeyFirstnameFilterBackusers);
		waitUntilElementIsNotVisible();
	}
	void clickOnLastname() {
		SeleniumUtility.clickOnElement(driver,filterBackusers.divTagFilterKeyLastnameFilterBackusers);
		waitUntilElementIsNotVisible();
	}
	void clickOnEmail() {
		SeleniumUtility.clickOnElement(driver,filterBackusers.divTagFilterKeyEmailFilterBackusers);
		waitUntilElementIsNotVisible();
	}
	
	void clickOnConfirmButton() {
		SeleniumUtility.clickOnElement(driver,filterBackusers.divTagFilterConfirmFilterBackusers);
		waitUntilElementIsNotVisible();
	}
	void inputEmail(String email) {
		SeleniumUtility.clearTextAndSendText(driver, filterBackusers.inputTagFilterValueEmailFilterBackusers, email);
		waitUntilElementIsNotVisible();

	}
	void inputFirstname(String firstname) {
		SeleniumUtility.clearTextAndSendText(driver, filterBackusers.inputTagFilterValueFirstnameFilterBackusers, firstname);
		waitUntilElementIsNotVisible();

	}
	void inputLatname(String lastname) {
		SeleniumUtility.clearTextAndSendText(driver, filterBackusers.inputTagFilterValueLastnameFilterBackusers, lastname);
		waitUntilElementIsNotVisible();

	}
	void selectRole(String role) {
		SeleniumUtility.clickOnElement(driver,filterBackusers.divTagFilterValueRoleFilterBackusers(role));
		waitUntilElementIsNotVisible();
	}
	
}
