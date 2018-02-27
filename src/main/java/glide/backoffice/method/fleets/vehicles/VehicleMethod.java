package glide.backoffice.method.fleets.vehicles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.utility.SeleniumUtility;

public class VehicleMethod {
	WebDriver driver;
	HeaderMethod headerMethod;
	HomepageVehicleMethod homepageVehicleMethod;
	AddEditVehicleMethod addEditVehicleMethod;
	ViewVehicleMethod viewVehicleMethod;
	public VehicleMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		this.homepageVehicleMethod=PageFactory.initElements(driver, HomepageVehicleMethod.class);
		this.addEditVehicleMethod=PageFactory.initElements(driver, AddEditVehicleMethod.class);
		this.viewVehicleMethod=PageFactory.initElements(driver, ViewVehicleMethod.class);

	}
	/**
	 * This method click on the back arrow button in the header of the back office
	 */
	private void clickOnBackButton() {
		headerMethod.clickOnHeaderBackButton();
	}

	/**
	 * This public method add a vehicle to the given public super company
	 * @param vehicleDto - Should be VehicleDto
	 */
	public void addANewVehicle(VehicleDto vehicleDto) {
		//Click on Add a vehicle button in vehicle page
		homepageVehicleMethod.clickOnAddAVehicleButton();
		// Input data in the vehicle
		addEditVehicleMethod.inputVehicleData(vehicleDto);
		SeleniumUtility.fixedWait(1);
		addEditVehicleMethod.clickOnSave();
		// Input data in the Administration
		addEditVehicleMethod.inputAdministrationData(vehicleDto);
		SeleniumUtility.fixedWait(1);
		addEditVehicleMethod.clickOnSave();
		// Input data in the operational in vehicle
		//addEditVehicleMethod.inputOprerationalData(vehicleDto);
		//addEditVehicleMethod.clickOnSave();
	}
	
	
	/**
	 * This public method add a vehicle to the given public super company
	 * @param vehicleDto - Should be VehicleDto
	 */
	public void editAVehicle(VehicleDto vehicleDto) {
		//Click on Edit button in vehicle. There is not edit button so click anywher in given vehicle row
		homepageVehicleMethod.clickOnVehicleToView(Config.getProperty("EDIT_VEHICLE_PLATE_NUMBER"));
		// Click on Edit Button of the vehicle
		viewVehicleMethod.clickOnEditVehicle();
		// Input data in the vehicle
		addEditVehicleMethod.inputVehicleData(vehicleDto);
		SeleniumUtility.fixedWait(1);
		addEditVehicleMethod.clickOnSave();
		// Input data in the Administration
		addEditVehicleMethod.inputAdministrationData(vehicleDto);
		SeleniumUtility.fixedWait(1);
		addEditVehicleMethod.clickOnSave();
		// Input data in the operational in vehicle
		addEditVehicleMethod.inputOprerationalData(vehicleDto);
		addEditVehicleMethod.clickOnSave();
		clickOnBackButton();
	}
	/**
	 * This method click on plate number of a vehicle to view details of that vehicle
	 */
	public void viewAVehicle() {
		//Click on Edit button in vehicle. There is not edit button so click anywher in given vehicle row
		homepageVehicleMethod.clickOnVehicleToView(Config.getProperty("EDIT_VEHICLE_PLATE_NUMBER"));
		clickOnBackButton();

	}

}
