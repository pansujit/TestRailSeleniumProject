package glide.backoffice.method.common;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.common.CommonLocators;
import glide.backoffice.locators.common.DatePicker;
import glide.backoffice.utility.DateHelper;
import glide.backoffice.utility.SeleniumUtility;

public class CommonMethods {
	WebDriver driver;
	CommonLocators commonLocators;
	DatePicker datePicker;
	public CommonMethods(WebDriver ldriver) {
		this.driver=ldriver;
		this.commonLocators=PageFactory.initElements(driver, CommonLocators.class);
		this.datePicker=PageFactory.initElements(driver, DatePicker.class);

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
	 * @param year - should be String
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
	 * @param month - Should be int
	 */
	private void selectMonth(int month) {
		System.out.println("Month"+month);
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
	 * This private method Select the given date in the date picker.
	 * @param date - should be String
	 */
	private void selectDate(String date) {
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.clickUsingAction(driver, datePicker.spanTagSelectDateDatePicker(date));
		SeleniumUtility.waitUntilElementisNotVisible(driver, datePicker.buttonTagCancelDatePicker);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This private method choose year, month and date in the date picker
	 * @param year - Should be String
	 * @param month- Should be Integer
	 * @param date- Should be String
	 */
	private void dateExtractorAndPicker(String year, int month,String date) {
		selectYear(year);
		selectMonth(month);
		selectDate(date);
	}
	
	/**
	 * This public method, Choose the given date in date picker
	 * @param oldDate
	 */
	public void datePicker(String oldDate) {
		List<Integer> x=DateHelper.selectdate(oldDate,SeleniumUtility.getText(driver, datePicker.divTagMonthAndYearDatePicker));
		if(!x.isEmpty()) {
			selectYear(String.valueOf(x.get(0)));
			selectMonth(x.get(1));
			selectDate(String.valueOf(x.get(2)));
		//dateExtractorAndPicker(String.valueOf(x.get(0)),x.get(1),String.valueOf(x.get(2)));
		}
		else {
			SeleniumUtility.actionSendKeys(driver, Keys.ESCAPE);
			SeleniumUtility.fixedWait(2);
		}
	}
	
}
