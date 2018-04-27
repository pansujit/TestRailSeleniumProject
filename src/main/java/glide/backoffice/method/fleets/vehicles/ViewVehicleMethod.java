package glide.backoffice.method.fleets.vehicles;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.fleets.vehicles.ViewVehicle;
import glide.backoffice.utility.SeleniumUtility;

public class ViewVehicleMethod {
	WebDriver driver;
	ViewVehicle viewVehicle;
	Logger log = Logger.getLogger(ViewVehicleMethod.class.getName());
	SoftAssert softAssert;
	public ViewVehicleMethod(WebDriver  ldriver) {
		this.driver=ldriver;
		this.viewVehicle=PageFactory.initElements(driver, ViewVehicle.class);
		this.softAssert=new SoftAssert();
	}
	
	/**
	 * This method click on edit button of a vehicle 
	 * 
	 */
	void clickOnEditVehicle() {
		log.debug("Running assertion Method \"clickOnEditVehicle()\"");
		log.debug("Clicking on Element Edit Vehicle in View Vehicle Page");
		SeleniumUtility.clickOnElement(driver, viewVehicle.buttonTagEditVehicleViewVehicle);
	
	}
	
	void waitUntilEditButtonIsVisible() {
		log.debug("Running assertion Method \"waitUntilEditButtonIsVisible()\"");
		log.debug("Waiting for Edit Vehicle is visible in View Vehicle Page");
		SeleniumUtility.waitElementToBeVisible(driver, viewVehicle.buttonTagEditVehicleViewVehicle);
	}
	
	void assertVehicleView() {
		log.debug("Running assertion Method \"assertVehicleView()\"");
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, viewVehicle.buttonTagEditVehicleViewVehicle),
				"The Edit vehicle button is not displayed");
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, viewVehicle.buttonTagAddStatusViewVehicle),
				"The Add status button is not displayed");
	}

	
	
}
