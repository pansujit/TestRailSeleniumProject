package glide.backoffice.method.fleets.vehicles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.fleets.vehicles.AddVehicle;
import glide.backoffice.locators.fleets.vehicles.HomepageVehicles;
import glide.backoffice.locators.fleets.vehicles.ViewVehicle;
import glide.backoffice.utility.SeleniumUtility;

public class HomepageVehicleMethod {
	WebDriver driver;
	HomepageVehicles homepageVehicles;
	AddVehicle addVehicle;
	ViewVehicle viewVehicle;
	SoftAssert softAssert;
	public HomepageVehicleMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addVehicle=PageFactory.initElements(driver, AddVehicle.class);
		this.viewVehicle=PageFactory.initElements(driver, ViewVehicle.class);
		this.homepageVehicles=PageFactory.initElements(driver, HomepageVehicles.class);
		this.softAssert=new SoftAssert();

	}
	
	/**
	 * This methods click on Add a Vehicle Button in Vehicle Home page 
	 */
	void clickOnAddAVehicleButton() {
		SeleniumUtility.clickOnElement(driver, homepageVehicles.buttonTagAddVehicleHomepageVehicles);
	}
	
	/**
	 * This method click on Vehicle number plate  to view the vehicle in detail
	 */
	void clickOnVehicleToView(String plateNumber){
		SeleniumUtility.clickOnElement(driver, homepageVehicles.divTagPlateNumberHomepageVehicles(plateNumber));		
	}
	void waitUntilAddAVehicleButtonIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, homepageVehicles.buttonTagAddVehicleHomepageVehicles);
	}
	
	/**
	 * 
	 * @param plateNumber
	 * @param companyName
	 * @param model
	 * @param brand
	 * @param fuelType
	 */

	void assertAddEditVehicle(String plateNumber,String companyName,String model,String brand,String fuelType) {
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageVehicles.divTagSuperCompanyHomepageVehicles(plateNumber), companyName));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageVehicles.divTagVehicleModelHomepageVehicles(plateNumber), model));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageVehicles.divTagBrandNameHomepageVehicles(plateNumber), brand));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageVehicles.spanTagFuelTypeHomepageVehicles(plateNumber), fuelType));
		softAssert.assertAll();
	}
}
