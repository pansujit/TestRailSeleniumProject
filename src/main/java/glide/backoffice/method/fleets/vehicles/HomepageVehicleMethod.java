package glide.backoffice.method.fleets.vehicles;

import java.util.ArrayList;
import java.util.List;

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
	 * @return 
	 */

	List<Boolean> assertAddEditVehicle(String plateNumber,String companyName,String model,String brand,String fuelType) {
		List<Boolean> assertValue= new ArrayList<>();

		assertValue.add(0,SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageVehicles.divTagSuperCompanyHomepageVehicles(plateNumber), companyName));
		assertValue.add(1,SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageVehicles.divTagVehicleModelHomepageVehicles(plateNumber), model));
		assertValue.add(2,SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageVehicles.divTagBrandNameHomepageVehicles(plateNumber), brand));
		assertValue.add(3,SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageVehicles.spanTagFuelTypeHomepageVehicles(plateNumber), fuelType));
		return assertValue;
	}
}
