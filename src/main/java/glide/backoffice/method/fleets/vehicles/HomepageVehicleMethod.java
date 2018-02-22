package glide.backoffice.method.fleets.vehicles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.fleets.vehicles.AddVehicle;
import glide.backoffice.locators.fleets.vehicles.HomepageVehicles;
import glide.backoffice.locators.fleets.vehicles.ViewVehicle;
import glide.backoffice.utility.SeleniumUtility;

public class HomepageVehicleMethod {
	WebDriver driver;
	HomepageVehicles homepageVehicles;
	AddVehicle addVehicle;
	ViewVehicle viewVehicle;
	public HomepageVehicleMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addVehicle=PageFactory.initElements(driver, AddVehicle.class);
		this.viewVehicle=PageFactory.initElements(driver, ViewVehicle.class);

	}
	
	/**
	 * This methods click on Add a Vehicle Button in Vehicle Home page and wait upto 30s to the "NEXT" button in Add/edit vehicle to
	 * be visibled and further wait 1s for fixed delay.
	 */
	void clickOnAddAVehicleButton() {
		SeleniumUtility.clickOnElement(driver, homepageVehicles.buttonTagAddVehicleHomepageVehicles);
		SeleniumUtility.waitElementToBeVisible(driver, addVehicle.buttonTagNextEditVehicle);
		SeleniumUtility.fixedWait(1);

	}
	
	/**
	 * This method click on Vehicle number plate  to view the vehicle in detail
	 */
	void clickOnVehicleToView(String plateNumber){
		
		SeleniumUtility.clickOnElement(driver, homepageVehicles.divTagPlateNumberHomepageVehicles(plateNumber));
		SeleniumUtility.waitElementToBeVisible(driver, viewVehicle.buttonTagEditVehicleViewVehicle);
		SeleniumUtility.fixedWait(1);		
	}

}
