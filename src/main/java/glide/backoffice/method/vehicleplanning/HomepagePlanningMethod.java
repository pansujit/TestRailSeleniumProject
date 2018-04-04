package glide.backoffice.method.vehicleplanning;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.vehicleplanning.HomepageVehiclePlanning;
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
	void clickOnVehicleStatus() {
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
		SeleniumUtility.clickOnElement(driver, timeSlot.get(2));

	}
	
	void assertVehiclePlanningHomepage() {
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, 
				homepageVehiclePlanning.buttonTagRefreshButtonHomepageVehiclePlanning), "The refresh button is not visible");
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.buttonTagAddStatusHomepageVehiclePlanning), "The add status button is not visible");
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.divTagSelectSitesHomepageVehiclePlanning), "The site is not displayed");
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.divTagSelectDaysHomepageVehiclePlanning), "The days is not displayed");
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.inputTagSelectDateHomepageVehiclePlanning), "The date is not displayed");
		softAssert.assertAll();
	}

}
