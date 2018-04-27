package glide.backoffice.method.common;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.common.CommonLocators;
import glide.backoffice.locators.common.DatePicker;
import glide.backoffice.locators.common.SuceessErrorPopupMessage;
import glide.backoffice.utility.DateHelper;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This common methods contains helpful methods that are common in whole Back office system.
 * @author sujitpandey
 *
 */
public class CommonMethods {
	WebDriver driver;
	CommonLocators commonLocators;
	DatePicker datePicker;
	SuceessErrorPopupMessage suceessErrorPopupMessage;
	
	public CommonMethods(WebDriver ldriver) {
		this.driver=ldriver;
		this.commonLocators=PageFactory.initElements(driver, CommonLocators.class);
		this.datePicker=PageFactory.initElements(driver, DatePicker.class);
		this.suceessErrorPopupMessage=PageFactory.initElements(driver, SuceessErrorPopupMessage.class);
	}
	/**
	 * This public method in CommonMethods click on pagination next icon.
	 */
	public void clickOnPaginationNext() {
		SeleniumUtility.clickOnElement(driver, commonLocators.buttonTagPaginationNextCommonLocators);
	}
	/**
	 * This return the boolean value for the pagination next ICON
	 * @return boolean
	 */
	public boolean checkVisibilityPaginationNext() {
		return SeleniumUtility.checkElementIsVisible(driver, commonLocators.buttonTagPaginationNextCommonLocators);
	}
	/**
	 * This public method in CommonMethods wait until the loading page icon disappear
	 */
	public void waitUntilElementToBeInvisible() {
		SeleniumUtility.waitUntilElementisNotVisible(driver, commonLocators.divTagLoadingIconCommonLocators);
		SeleniumUtility.fixedWait(2);
	}
	/**
	 * This public method in CommonMethods wait until The Table loading Icon is disappear 
	 */
	public void waitUntilTableContentVisible() {
		SeleniumUtility.waitUntilElementisNotVisible(driver, commonLocators.divTagLoadingIconTableCommonLocators);
		SeleniumUtility.fixedWait(2);
	}
	/**
	 * This private method select the year in the date picker
	 * @param year - Should be String in format "YYYY"
	 */
	private void selectYear(String year) {
		SeleniumUtility.waitElementToBeVisible(driver, datePicker.divTagTopYearSelectorDatePicker);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.clickUsingAction(driver, datePicker.divTagTopYearSelectorDatePicker);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.clickUsingAction(driver, datePicker.spanTagSelectYearDatePicker(year));
		SeleniumUtility.waitElementToBeVisible(driver, datePicker.buttonTagRightMonthMoverDatePicker);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This private method Select the given month in the date picker by moving left or right next button.
	 * @param month - Should be integer
	 */
	private void selectMonth(int month) {
		if(month<0) {
			for(int i=0;i<Math.abs(month);i++) {
				SeleniumUtility.clickOnElement(driver, datePicker.buttonTagRightMonthMoverDatePicker);
				SeleniumUtility.fixedWait(1);
			}
		}
		else if(month>0){
			for(int i=0;i<month;i++) {
				SeleniumUtility.clickOnElement(driver, datePicker.buttonTagLeftMonthMoverDatePicker);
				SeleniumUtility.fixedWait(1);
			}
		}

	}
	/**
	 * 
	 * This private method Select the given days in the date picker.
	 * @param date - Should be String
	 */
	private void selectDate(String date) {
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.clickUsingAction(driver, datePicker.spanTagSelectDateDatePicker(date));
		SeleniumUtility.waitUntilElementisNotVisible(driver, datePicker.buttonTagCancelDatePicker);
		SeleniumUtility.fixedWait(1);
	}
	
	/**
	 * This public method, Choose the given date in date picker
	 * @param oldDate - Should be String in "YYYY-MM-DD" format
	 */
	public void datePicker(String oldDate) {
		List<Integer> x=DateHelper.selectdate(oldDate,SeleniumUtility.getText(driver, datePicker.divTagMonthAndYearDatePicker));
		if(!x.isEmpty()) {
			selectYear(String.valueOf(x.get(0)));
			selectMonth(x.get(1));
			selectDate(String.valueOf(x.get(2)));
		}
		else {
			SeleniumUtility.actionSendKeys(driver, Keys.ESCAPE);
			SeleniumUtility.fixedWait(2);
		}
	}
	/**
	 * This public method, Ignore year and select the month and day. This method is especially use where the year is disabled
	 * and can not have drop-down list.  For example, in while create booking.
	 * @param oldDate - Should be String in format "YYYY-MM-DD"
	 */
	public void monthAndDayPicker(String oldDate) {
		List<Integer> x=DateHelper.selectMonthAndDate(oldDate,SeleniumUtility.getText(driver, datePicker.divTagMonthAndYearDatePicker));
		if(!x.isEmpty()) {
			selectMonth(x.get(0));
			selectDate(String.valueOf(x.get(1)));
		}
		else {
			SeleniumUtility.actionSendKeys(driver, Keys.ESCAPE);
			SeleniumUtility.fixedWait(2);
		}
	}
	
	
	public boolean assertErrorSuccessMessage(String text) {
		return SeleniumUtility.compareIgnoreCaseText(driver, suceessErrorPopupMessage.spanTagPopupSuceessErrorPopupMessage, text);
	}
	
}
