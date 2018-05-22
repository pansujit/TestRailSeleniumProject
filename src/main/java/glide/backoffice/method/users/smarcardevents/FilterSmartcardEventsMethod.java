package glide.backoffice.method.users.smarcardevents;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.users.smartcardevents.FilterSmartcardEvents;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;

public class FilterSmartcardEventsMethod {
	static Logger log = Logger.getLogger(FilterSmartcardEventsMethod.class.getName());
	WebDriver driver;
	FilterSmartcardEvents filterSmartcardEvents;
	CommonMethods commonMethods;
	public FilterSmartcardEventsMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.filterSmartcardEvents=PageFactory.initElements(driver, FilterSmartcardEvents.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);

	}
	/**
	 * This method waits until the menu is visible
	 */
	private void waitUntilDropdownMenuIsVisible() {
		log.debug("Running private method 'waitUntilDropdownMenuIsVisible'");
		SeleniumUtility.waitElementToBeVisible(driver, filterSmartcardEvents.divTagFilterDropdownFilterSmartcardEvents);
		SeleniumUtility.fixedMilliSecondWait();
	}
	/**
	 * This method waits until menu is disappeared 
	 */
	private void waitUntilDropdownMenuIsInvisible() {
		log.debug("Running private method 'waitUntilDropdownMenuIsInvisible'");
		SeleniumUtility.waitUntilElementisNotVisible(driver, filterSmartcardEvents.divTagFilterDropdownFilterSmartcardEvents);
		SeleniumUtility.fixedMilliSecondWait();
	}
	/**
	 * This method clicks on the Action in the filter key and waits until the dropdown menu is disappeared
	 */
	void clickOnAction() {
		log.debug("Running private method 'clickOnAction'");
		SeleniumUtility.clickOnElement(driver, filterSmartcardEvents.divTagFilterKeyActionFilterSmartcardEvents);
		waitUntilDropdownMenuIsInvisible();
	}
	/**
	 * This method clicks on the Results in the filter key and waits until the dropdown menu is disappeared
	 */
	void clickOnResult() {
		log.debug("Running private method 'clickOnResult'");
		SeleniumUtility.clickOnElement(driver, filterSmartcardEvents.divTagFilterKeyResultFilterSmartcardEvents);
		waitUntilDropdownMenuIsInvisible();
	}
	/**
	 * This method clicks on the Start date in the filter key and waits until the dropdown menu is disappeared
	 */
	void clickOnStartDate() {
		log.debug("Running private method 'clickOnStartDate'");
		SeleniumUtility.clickOnElement(driver, filterSmartcardEvents.divTagFilterKeyStartDateFilterSmartcardEvents);
		waitUntilDropdownMenuIsInvisible();
	}
	/**
	 * This method clicks on the End date in the filter key and waits until the dropdown menu is disappeared
	 */
	void clickOnEndDate() {
		log.debug("Running private method 'clickOnEndDate'");
		SeleniumUtility.clickOnElement(driver, filterSmartcardEvents.divTagFilterKeyEndDateFilterSmartcardEvents);
		waitUntilDropdownMenuIsInvisible();
	}
	/**
	 * This method clicks on the card number in the filter key and waits until the dropdown menu is disappeared
	 */
	void clickOnCardNumber() {
		log.debug("Running private method 'clickOnCardNumber'");
		SeleniumUtility.clickOnElement(driver, filterSmartcardEvents.divTagFilterKeyCardIdFilterSmartcardEvents);
		waitUntilDropdownMenuIsInvisible();
	}
	/**
	 * This method clicks on the User email in the filter key and waits until the dropdown menu is disappeared
	 */
	void clickOnUserEmail() {
		log.debug("Running private method 'clickOnUserEmail'");
		SeleniumUtility.clickOnElement(driver, filterSmartcardEvents.divTagFilterKeyUserEmailFilterSmartcardEvents);
		waitUntilDropdownMenuIsInvisible();
	}
	/**
	 * This method clicks on the plate number in the filter key and waits until the dropdown menu is disappeared
	 */
	void clickOnPlateNumber() {
		log.debug("Running private method 'clickOnPlateNumber'");
		SeleniumUtility.clickOnElement(driver, filterSmartcardEvents.divTagFilterKeyPlateNumberFilterSmartcardEvents);
		waitUntilDropdownMenuIsInvisible();
	}
	/**
	 * This method input the given Email in the input field of filter value
	 * @param email - Should be String
	 */
	void inputEmail(String email) {
		log.debug("Running private method 'inputEmail'");
		SeleniumUtility.clearTextAndSendText(driver, filterSmartcardEvents.inputTagFilterValueUserEmailFilterSmartcardEvents, email);
		SeleniumUtility.fixedMilliSecondWait();
	}
	/**
	 * This method input the given card id  in the input field of filter value
	 * @param cardId - Should be String
	 */
	void inputCardId(String cardId) {
		log.debug("Running private method 'inputCardId'");
		SeleniumUtility.clearTextAndSendText(driver, filterSmartcardEvents.inputTagFilterValueCardIdFilterSmartcardEvents, cardId);
		SeleniumUtility.fixedMilliSecondWait();
	}
	/**
	 * This method input the given plate number in the input field of filter value
	 * @param plateNumber - Should be String
	 */
	void inputPlateNumber(String plateNumber) {
		log.debug("Running private method 'inputPlateNumber'");
		SeleniumUtility.clearTextAndSendText(driver, filterSmartcardEvents.inputTagFilterValuePlateNumberFilterSmartcardEvents, plateNumber);
		SeleniumUtility.fixedMilliSecondWait();
	}
	/**
	 * This method click on the confirm button in filter value and wait until the table is loaded completely
	 */
	void clickOnCofirmButton() {
		log.debug("Running private method 'clickOnCofirmButton'");
		SeleniumUtility.clickOnElement(driver,filterSmartcardEvents.divTagConfirmBtnFilterSmartcardEvents);
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();
	}

	/**
	 * This method click on the filter to display the filter value dropdown and wait until the dropdown is visible
	 */
	void  clickToDisplayDropdownInFiltervalue() {
		log.debug("Running private method 'clickToDisplayDropdownInFiltervalue'");
		SeleniumUtility.clickOnElement(driver,filterSmartcardEvents.divTagClickToDropdownCommonFilterSmartcardEvents);
		waitUntilDropdownMenuIsVisible();
	}
	/**
	 * This method click on the filter to display the filter key dropdown and wait until the dropdown is visible
	 */
	void clickToDisplayDropdownInFilterKey() {
		log.debug("Running private method 'clickToDisplayDropdownInFilterKey'");
		SeleniumUtility.clickOnElement(driver,filterSmartcardEvents.divTagFilterFilterSmartcardEvents);
		waitUntilDropdownMenuIsVisible();
	}
	/**
	 * This method click on the given filter in filter value section and wait until the dropdown is disappered
	 * @param filterValue - Should be String
	 */
	void clickAndSelectFilterValueInDropdown(String filterValue) {
		log.debug("Running private method 'clickAndSelectFilterValueInDropdown'");
		SeleniumUtility.clickOnElement(driver,filterSmartcardEvents.divTagFilterValueInDropdownFilterConfirmFilterBackusers(filterValue));
		waitUntilDropdownMenuIsInvisible();
	}
	
	void clearAction() {
		SeleniumUtility.clickOnElement(driver,filterSmartcardEvents.svgTagActionPairFilterSmartcardEvents);
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	void clearResult() {
		SeleniumUtility.clickOnElement(driver,filterSmartcardEvents.svgTagResultPairFilterSmartcardEvents);
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	void clearEmail() {
		SeleniumUtility.clickOnElement(driver,filterSmartcardEvents.svgTagUserEmailPairFilterSmartcardEvents);
		commonMethods.waitUntilTableContentVisible();
		SeleniumUtility.fixedMilliSecondWait();

	}
	void getActionText() {
		System.out.println(SeleniumUtility.getText(driver, filterSmartcardEvents.spanTagActionPairTextFilterSmartcardEvents));
	}
	void getResultText() {
		System.out.println(SeleniumUtility.getText(driver, filterSmartcardEvents.spanTagResultPairTextFilterSmartcardEvents));
	}
	void getUserEmailText() {
		System.out.println(SeleniumUtility.getText(driver, filterSmartcardEvents.spanTagUserEmailPairTextFilterSmartcardEvents));
	}

}
