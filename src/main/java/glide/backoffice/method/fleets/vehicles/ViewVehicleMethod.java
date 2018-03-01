package glide.backoffice.method.fleets.vehicles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.fleets.vehicles.AddVehicle;
import glide.backoffice.locators.fleets.vehicles.ViewVehicle;
import glide.backoffice.utility.SeleniumUtility;

public class ViewVehicleMethod {
	WebDriver driver;
	ViewVehicle viewVehicle;
	AddVehicle addVehicle;
	SoftAssert softAssert;
	public ViewVehicleMethod(WebDriver  ldriver) {
		this.driver=ldriver;
		this.viewVehicle=PageFactory.initElements(driver, ViewVehicle.class);
		this.addVehicle=PageFactory.initElements(driver, AddVehicle.class);
		this.softAssert=new SoftAssert();
	}
	
	/**
	 * This method click on edit button of a vehicle 
	 * 
	 */
	void clickOnEditVehicle() {
		SeleniumUtility.clickOnElement(driver, viewVehicle.buttonTagEditVehicleViewVehicle);
		SeleniumUtility.waitElementToBeVisible(driver, addVehicle.buttonTagNextEditVehicle);
		SeleniumUtility.fixedWait(1);	
	}
	void assertVehicleView() {
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, viewVehicle.buttonTagEditVehicleViewVehicle));
	}

}
