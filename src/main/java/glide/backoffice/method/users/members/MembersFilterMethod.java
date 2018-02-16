package glide.backoffice.method.users.members;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.users.members.FilterMembers;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This class contains all the method related to the filter in the member homepage
 * @author sujitpandey
 * @created on Feb 13, 2018 4:40:29 PM
 */
public class MembersFilterMethod {
	WebDriver driver;
	FilterMembers filterMembers;
	CommonMethods commonMethods;

	public MembersFilterMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.filterMembers=PageFactory.initElements(driver, FilterMembers.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);

	}

	/**
	 * 
	 * This method click on Filters Button in the member homepage only if it is not click before.
	 */
	private void clickOnFilters() {
		if(!SeleniumUtility.checkElementIsVisible(driver, filterMembers.inputTagMemberNameFilterMembers)) {
			SeleniumUtility.clickOnElement(driver, filterMembers.buttonTagFiltersFilterMembers);
			SeleniumUtility.waitElementToBeVisible(driver, filterMembers.inputTagMemberNameFilterMembers);
			SeleniumUtility.fixedWait(1);
		}
		else
		{
			return;
		}
	}
	/**
	 * This private method select the element using selenium select action class where it will select by its option value.
	 * The input text should be boolean which further translate to the String by code
	 * @param by - Should be Selenium By
	 * @param text - Should be boolean
	 */
	private void selectBooleanValueForMemberFilter(By by,boolean text) {
		SeleniumUtility.selectByvalue(driver, by, String.valueOf(text));
		SeleniumUtility.fixedMilliSecondWait();
	}
	/**
	 * This private method select the element using selenium select action class where it will select by its option value.
	 * The input text should be String which further translate to the String by code
	 * @param by - Should be Selenium By
	 * @param text - Should be String
	 */
	private void selectValueForMemberFilter(By by,String text) {
		SeleniumUtility.selectByvalue(driver, by, String.valueOf(text));
		SeleniumUtility.fixedMilliSecondWait();
	}
	/**
	 * This private method click on the search button in member filter page and wait until loading circle disappear
	 */
	 void clickOnSearchButton() {
		SeleniumUtility.clickOnElement(driver, filterMembers.buttonTagSearchFilterMembers);
		commonMethods.waitUntilElementToBeInvisible();
	}

	/**
	 * This method input given name in the name input box to find the member with given name. 
	 * @param text - Should be String
	 */
	 void inputMemberNameOnMembersFilter(String name) {
		clickOnFilters();
		SeleniumUtility.clearTextAndSendText(driver, filterMembers.inputTagMemberNameFilterMembers, name);
	}
	/**
	 * This method input given email in the email input box to find the member with given email address. 
	 * @param text - Should be String
	 */
	 void inputEmailOnMembersFilter(String email) {
		clickOnFilters();
		SeleniumUtility.clearTextAndSendText(driver, filterMembers.inputTagEmailFilterMembers, email);
		SeleniumUtility.fixedMilliSecondWait();

	}
	/**
	 * This method select the given Expedite Review status of the member in the filter with given text
	 * @param text - Should be String
	 */
	 void selectExpediteReviewOnMembersFilter(boolean text) {
		clickOnFilters();
		selectBooleanValueForMemberFilter(filterMembers.selectTagExpediteReviewFilterMembers,text);
	}
	/**
	 * This method select the given Technician status of the member in the filter with given text
	 * @param text - Should be String
	 */
	 void selectTechnicianOnMembersFilter(boolean text) {
		clickOnFilters();
		selectBooleanValueForMemberFilter(filterMembers.selectTagTechnicianStatusFilterMembers,text);
	}
	/**
	 * This method select the given VIP status of the member in the filter with given text
	 * @param text - Should be String
	 */
	 void selectVIPOnMembersFilter(boolean text) {
		clickOnFilters();
		selectBooleanValueForMemberFilter(filterMembers.selectTagVIPStatusFilterMembers,text);
	}
	/**
	 * This method select the given Professional status of the member in the filter with given text
	 * @param text - Should be String
	 */
	 void selectProfessionalOnMembersFilter(boolean text) {
		clickOnFilters();
		selectBooleanValueForMemberFilter(filterMembers.selectTagProfessionalStatusFilterMembers,text);
	}
	/**
	 * This method select the given validation status of the member in the filter with given text
	 * @param text - Should be String
	 */
	 void selectValidationStatusOnMembersFilter(String text) {
		clickOnFilters();
		selectValueForMemberFilter(filterMembers.selectTagValidationStatusFilterMembers,text);
	}
	/**
	 * This method click on the reset button of the member filter and wait until the loading icon disappear
	 */
	 void clickOnResetButton() {
		SeleniumUtility.clickOnElement(driver, filterMembers.buttonTagResetFilterMembers);
		commonMethods.waitUntilElementToBeInvisible();
	}





}
