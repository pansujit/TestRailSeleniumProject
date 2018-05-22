package glide.backoffice.method.vehicleplanning;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.vehicleplanning.HomepageVehiclePlanning;
import glide.backoffice.method.common.ApiCallsMethod;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;
import glide.backoffice.utility.StringSplitter;
public class HomepagePlanningMethod {

	WebDriver driver;
	HomepageVehiclePlanning homepageVehiclePlanning;
	CommonMethods commonMethods;
	public HomepagePlanningMethod(WebDriver ldriver) {
		this.driver= ldriver;
		this.homepageVehiclePlanning= PageFactory.initElements(driver, HomepageVehiclePlanning.class);
		this.commonMethods= PageFactory.initElements(driver, CommonMethods.class);
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
	 * @return 
	 */
	List<Boolean> assertVehiclePlanningHomepage() {
		List<Boolean> assertValue= new ArrayList<>();

		assertValue.add(0,SeleniumUtility.checkElementIsVisible(driver, 
				homepageVehiclePlanning.buttonTagRefreshButtonHomepageVehiclePlanning));
		assertValue.add(1,SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.buttonTagAddStatusHomepageVehiclePlanning));
		assertValue.add(2,SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.divTagSelectSitesHomepageVehiclePlanning));
		assertValue.add(3,SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.buttonTagDaysArrowHomepageVehiclePlanning));
		assertValue.add(4,SeleniumUtility.checkElementIsVisible(driver,
				homepageVehiclePlanning.inputTagSelectDateHomepageVehiclePlanning));
		return assertValue;
	}
	/**
	 * This method verifies that Adding status is shown in the vehicle planning page for that vehicle and after it will delete that status.
	 * @param statusText - Should be String
	 * @return {@code List<Boolean>}
	 */
	List<Boolean> assertAddStatusVehiclePlanning(String plateNumber,String statusText) {
		List<Boolean> assertValue= new ArrayList<>();
		boolean status=false;
		for (WebElement element:SeleniumUtility.returnWebElements(driver, homepageVehiclePlanning.divTagVehicleStatusHomepageVehiclePlanning(plateNumber))) {
			if(element.getText().contains(statusText)) {
				status= true;
				assertValue.add(0, status);
			}
		}
		assertValue.add(1, !ApiCallsMethod.getStatusesOfVehicle(statusText.toUpperCase()).isEmpty());
		ApiCallsMethod.deletestatus();
		return assertValue;
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
	 * @return 
	 */
	Boolean assertDaysTimeSlots(String text,String plateNumber) {
		Boolean status= false;
		switch (text) {
		case "1":
			status=SeleniumUtility.compareIntegers(SeleniumUtility.returnWebElements(driver,
					homepageVehiclePlanning.divTagGetAllTimesHomepageVehiclePlanning(plateNumber)).size(),24);

			break;
		case "3" :
			status=SeleniumUtility.compareIntegers(SeleniumUtility.returnWebElements(driver,
					homepageVehiclePlanning.divTagAllDaysSlotsHomepageVehiclePlanning(plateNumber)).size(),3);

			break;
		case "7":
			status=SeleniumUtility.compareIntegers(SeleniumUtility.returnWebElements(driver,
					homepageVehiclePlanning.divTagAllDaysSlotsHomepageVehiclePlanning(plateNumber)).size(),7);
			break;
		default:
			break;
		}
		return status;
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
	 * @return {@code List<Boolean>}
	 */
	List<Boolean> assertForwardAndBackwardArrow(String text1, String text2){
		List<Boolean> assertValue= new ArrayList<>();
		assertValue.add(0, !SeleniumUtility.compareText(text1, text2));
		return assertValue;
	}

	void clickOnBookingOnVehiclePlanning(String status,String plateNumber) {
		String text=status.toLowerCase();
		switch(text)
		{
		case "scheduled":

			for(WebElement element:SeleniumUtility.returnWebElements(driver, homepageVehiclePlanning.divTagListOfBookingsHomepageVehiclePlanning(plateNumber))) {
				String value =StringSplitter.splitStyle(SeleniumUtility.getAttribute(driver, element, "style"));
				
				if(StringSplitter.rgbToHEX(value).equalsIgnoreCase("#F78C35")) {
					SeleniumUtility.clickOnElement(driver, element);
				}
				else
				{
					continue;
				}
			}
			break;
		case "in-progress":
			System.out.println("hello1");
			break;
		case "completed":
			System.out.println("hello2");
			break;
		default:
			break;
		}

	}
	
	void waitUntilBookingDetailPopupIsVisible(){
		SeleniumUtility.waitElementToBeVisible(driver, homepageVehiclePlanning.divTagBookingDeatailPopupHomepageVehiclePlanning);
		SeleniumUtility.fixedMilliSecondWait();
	}



}
