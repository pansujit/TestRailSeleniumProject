package glide.backoffice.method.vehicleplanning;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.vehicleplanning.HomepageVehiclePlanning;
import glide.backoffice.method.common.ApiCallsMethod;
import glide.backoffice.utility.SeleniumUtility;
public class HomepagePlanningMethod {

	WebDriver driver;
	HomepageVehiclePlanning homepageVehiclePlanning;
	SoftAssert softAssert;
	public HomepagePlanningMethod(WebDriver ldriver) {
		this.driver= ldriver;
		this.homepageVehiclePlanning= PageFactory.initElements(driver, HomepageVehiclePlanning.class);
		this.softAssert= new SoftAssert();
	}
	/**
	 * This method wait for the Add status is displayed on vehicle planning
	 */
	void waitForAddStatusIsDisplayed() {
		SeleniumUtility.waitElementToBeVisible(driver, homepageVehiclePlanning.buttonTagAddStatusHomepageVehiclePlanning);
	}
	/**
	 * This method click on add status in vehicle planning
	 */
	void clickOnVehicleAddStatus() {
		SeleniumUtility.clickOnElement(driver, homepageVehiclePlanning.buttonTagAddStatusHomepageVehiclePlanning);
	}
	/**
	 * This method clicks on the Refresh button on vehicle planning
	 */
	void clickOnRefreshButton() {
		SeleniumUtility.clickOnElement(driver, homepageVehiclePlanning.buttonTagRefreshButtonHomepageVehiclePlanning);
	}
	/**
	 * This method clicks on the time slot of the given vehicle
	 * @param plateNumber - Should be String
	 */
	void clickonTimeSlotOfVehicle(String plateNumber) {
		List<WebElement> timeSlot=SeleniumUtility.returnWebElements(driver, 
				homepageVehiclePlanning.divTagGetAllTimesHomepageVehiclePlanning(plateNumber));
		SeleniumUtility.clickOnElement(driver, timeSlot.get(2));
	}


	/**
	 * This method verifies the homepage of the Vehicle planning by verifying different Elements in that page
	 */
	void assertVehiclePlanningHomepage() {
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, 
				homepageVehiclePlanning.buttonTagRefreshButtonHomepageVehiclePlanning), "The refresh button is not visible");
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.buttonTagAddStatusHomepageVehiclePlanning), "The add status button is not visible");
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.divTagSelectSitesHomepageVehiclePlanning), "The site is not displayed");
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.buttonTagDaysArrowHomepageVehiclePlanning), "The days is not displayed");
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.inputTagSelectDateHomepageVehiclePlanning), "The date is not displayed");
		softAssert.assertAll();
	}
	/**
	 * This method verifies that Adding status is shown in the vehicle planning page for that vehicle and after it will delete that status.
	 * @param statusText - Should be String
	 */
	void assertAddStatusVehiclePlanning(String plateNumber,String statusText) {
		boolean status=false;
		for (WebElement element:SeleniumUtility.returnWebElements(driver, homepageVehiclePlanning.divTagVehicleStatusHomepageVehiclePlanning(plateNumber))) {
			if(element.getText().contains(statusText)) {
				status= true;
			}
		}
		softAssert.assertTrue(status,"The given status in not correct");
		softAssert.assertTrue(!ApiCallsMethod.getStatusesOfVehicle(statusText.toUpperCase()).isEmpty(),"The status is empty for given vehicle");
		ApiCallsMethod.deletestatus();
		softAssert.assertAll();
	}
	/**
	 * This method click on the days button to select the required days (either 1, 3 or 7 days)
	 */
	void clickOnSelectDaysButton() {
		SeleniumUtility.clickOnElement(driver, homepageVehiclePlanning.buttonTagDaysArrowHomepageVehiclePlanning);
	}
	/**
	 * This method click on given days on the dropdown in days slots in header of the vehicle planning
	 * @param text - Should be String
	 */
	void clickOnDays(String text) {
		SeleniumUtility.clickOnElement(driver, homepageVehiclePlanning.divTagSelectDaysHomepageVehiclePlanning(text));

	}
	/**
	 * This method wait until the dropdown is visible
	 */
	void waitUntilDaysDropdownElementIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, homepageVehiclePlanning.divTagSelectDaysHomepageVehiclePlanning("7"));
	}
	
	/**
	 * This method verifies the slots that changes according to the days changes in the header of the vehicle planning
	 * @param text - Should be String
	 * @param plateNumber - Should be String
	 */
	void assertDaysTimeSlots(String text,String plateNumber) {
		switch (text) {
		case "1":
			softAssert.assertTrue(SeleniumUtility.compareIntegers(SeleniumUtility.returnWebElements(driver,
					homepageVehiclePlanning.divTagGetAllTimesHomepageVehiclePlanning(plateNumber)).size(),24),
					"The slot is more or less than 24 for 1 day slot");
			softAssert.assertAll();
			break;
		case "3" :
			softAssert.assertTrue(SeleniumUtility.compareIntegers(SeleniumUtility.returnWebElements(driver,
					homepageVehiclePlanning.divTagAllDaysSlotsHomepageVehiclePlanning(plateNumber)).size(),3),
					"The slot is more or less than 3 for 3 days slots");
			softAssert.assertAll();
			break;
		case "7":
			softAssert.assertTrue(SeleniumUtility.compareIntegers(SeleniumUtility.returnWebElements(driver,
					homepageVehiclePlanning.divTagAllDaysSlotsHomepageVehiclePlanning(plateNumber)).size(),7),
					"The slot is more or less than 7 for 7 days slots");
			softAssert.assertAll();
			break;
		default:
			break;
		}
	}

	/**
	 * This method click on front arrow which moves date ahead
	 */
	void clickOnFrontArrow() {
		SeleniumUtility.clickOnElement(driver, homepageVehiclePlanning.divTagForwardArrowHomepageVehiclePlanning);
	}
	/**
	 * This method click on front arrow which moves date back
	 */
	void clickOnBackArrow() {
		SeleniumUtility.clickOnElement(driver, homepageVehiclePlanning.divTagBackwardArrowHomepageVehiclePlanning);
	}
	/**
	 * This method get the text in the valur attribute and return that text
	 * @return {@code String}
	 */
	String getDateFromHeader() {
		return SeleniumUtility.getAttribute(driver, homepageVehiclePlanning.inputTagSelectDateHomepageVehiclePlanning, "value");
	}

	/**
	 * This method compare the string dates and return boolean result
	 * @param text1 - Should be String
	 * @param text2 - Should be String
	 */
	void assertForwardAndBackwardArrow(String text1, String text2){
		
		softAssert.assertTrue(!SeleniumUtility.compareText(text1, text2),"The arrow button is not clicked because dates are equal");
		softAssert.assertAll();
	}

}
