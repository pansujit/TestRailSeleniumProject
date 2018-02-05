package glide.backoffice.method.fleets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.fleets.vehicles.AddVehicle;
import glide.backoffice.locators.fleets.vehicles.HomepageVehicles;
import glide.backoffice.locators.fleets.vehicles.ViewVehicle;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.utility.SeleniumUtility;

public class VehicleMethod {
	WebDriver driver;
	SideMenuItemsMethod sideMenuItemsMethod;
	HomepageVehicles homepageVehicles;
	AddVehicle addVehicle;
	ViewVehicle viewVehicle;
	HeaderMethod headerMethod;
	public VehicleMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addVehicle=PageFactory.initElements(driver, AddVehicle.class);
		this.sideMenuItemsMethod=PageFactory.initElements(driver, SideMenuItemsMethod.class);
		this.homepageVehicles=PageFactory.initElements(driver, HomepageVehicles.class);
		this.viewVehicle=PageFactory.initElements(driver, ViewVehicle.class);
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);

	}

	/**
	 * This method click on elements, espeacially for the radio button, which has two choices, according to the 
	 * response got from the data (Boolean response) and wait for fixed 1 sec
	 * @param status - Should be boolean
	 * @param elementTrue - Should be Selenium By
	 * @param elementFalse - Should be Selenium By
	 */
	private void selectRadioButton(boolean status, By elementTrue,By elementFalse) {
		if(status) {
			SeleniumUtility.clickOnElement(driver, elementTrue);
			SeleniumUtility.fixedWait(1);
		}
		else {
			SeleniumUtility.clickOnElement(driver, elementFalse);
			SeleniumUtility.fixedWait(1);
		}

	}

	/**
	 * This methods click on Add a Vehicle Button in Vehicle Home page and wait upto 30s to the "NEXT" button in Add/edit vehicle to
	 * be visibled and further wait 1s for fixed delay.
	 */
	private void clickOnAddAVehicleButton() {
		SeleniumUtility.clickOnElement(driver, homepageVehicles.buttonTagAddVehicleHomepageVehicles);
		SeleniumUtility.waitElementToBeVisible(driver, addVehicle.buttonTagNextEditVehicle);
		SeleniumUtility.fixedWait(1);

	}
	/**
	 * This method adds the parameters in Add/Edit Vehicle in Vehicle Sections.Data should be get from VehicleDto
	 * @param vehicleDto - should be VehicleDto
	 */

	private void inputVehicleData(VehicleDto vehicleDto) {
		selectRadioButton(vehicleDto.isGearBox(),addVehicle.labelTagTransMissionAutomaticEditVehicle,
				addVehicle.labelTagTransmissionManualEditVehicle);
		SeleniumUtility.selectByVisibleText(driver, addVehicle.selectTagCarBrandEditVehicle, vehicleDto.getCarBrand());
		SeleniumUtility.selectByVisibleText(driver, addVehicle.selectTagCarModelEditVehicle, vehicleDto.getCarModel());
		SeleniumUtility.selectByVisibleText(driver, addVehicle.selectTagCarVersionEditVehicle, vehicleDto.getCarVersion());
		SeleniumUtility.clearTextAndSendText(driver, addVehicle.inputTagPictureURLEditVehicle, vehicleDto.getImageURL()+"/xx.jpg");
		SeleniumUtility.selectByVisibleText(driver, addVehicle.selectTagVehicleClassEditVehicle, vehicleDto.getVehicleClass());
		SeleniumUtility.selectByVisibleText(driver, addVehicle.selectTagVehicleColorEditVehicle, vehicleDto.getVehicleColor());
		SeleniumUtility.selectByVisibleText(driver, addVehicle.selectTagVehicleTypeEditVehicle, vehicleDto.getVehicleType());
		SeleniumUtility.clearTextAndSendText(driver, addVehicle.inputTagDoorsNumberEditVehicle, vehicleDto.getNumberOfDoors());
		SeleniumUtility.clearTextAndSendText(driver, addVehicle.inputTagNumberOfSeatsEditVehicle, vehicleDto.getSeatNumber());
		SeleniumUtility.clickOnElement(driver, addVehicle.labelTagVehicleTypeElectricEditVehicle);


	}
	/**
	 * This method adds the parameters in Add/Edit Vehicle in Administration Sections.Data should be get from VehicleDto
	 * @param vehicleDto - Should be vehicleDto
	 */
	private void inputAdministrationData(VehicleDto vehicleDto) {
		SeleniumUtility.clearTextAndSendText(driver, addVehicle.inputTagVINNumberEditVehicle, vehicleDto.getVehicleVIN());
		SeleniumUtility.clearTextAndSendText(driver, addVehicle.inputTagPlateNumberEditVehicle, vehicleDto.getPlateNumber());
		selectRadioButton(vehicleDto.isOwnerOfVehicle(),addVehicle.labelTagRCICompanyEditVehicle,
				addVehicle.labelTagCurrentCompanyEditVehicle);
		SeleniumUtility.selectByVisibleText(driver, addVehicle.selectTagServiceLevelEditVehicle, vehicleDto.getServiceLevel());

	}

	/**
	 * This method adds the parameters in Add/Edit Vehicle in Operational Sections.Data should be get from VehicleDto
	 * @param vehicleDto - Should be VehicleDto
	 */
	private void inputOprerationalData(VehicleDto vehicleDto) {
		SeleniumUtility.selectByvalue(driver,addVehicle.selectTagUsedSystemEditVehicle,vehicleDto.getSystemInUse());
		SeleniumUtility.clearTextAndSendText(driver,addVehicle.inputTagDeviceSerialNumberEditVehicle,vehicleDto.getDeviceSerialNumber());

	}
	/**
	 * This method will click on Save or Next button in Add or edit vehicle.
	 */
	private void clickOnSave() {
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagNextEditVehicle);
		SeleniumUtility.fixedWait(5);

	}
	/**
	 * This method click on Vehicle number plate  to view the vehicle in detail
	 */
	private void clickOnVehicleToView(String plateNumber){
		
		SeleniumUtility.clickOnElement(driver, homepageVehicles.divTagPlateNumberHomepageVehicles(plateNumber));
		SeleniumUtility.waitElementToBeVisible(driver, viewVehicle.buttonTagEditVehicleViewVehicle);
		SeleniumUtility.fixedWait(1);	
		
		
	}
	/**
	 * This method click on edit button of a vehicle 
	 * 
	 */
	private void clickOnEditVehicle() {
		SeleniumUtility.clickOnElement(driver, viewVehicle.buttonTagEditVehicleViewVehicle);
		SeleniumUtility.waitElementToBeVisible(driver, addVehicle.buttonTagNextEditVehicle);
		SeleniumUtility.fixedWait(1);	
	}
	private void clickOnBackButton() {
		headerMethod.clickOnHeaderBackButton();
	}

	/**
	 * This public method add a vehicle to the given public super company
	 * @param vehicleDto - Should be VehicleDto
	 */
	public void addANewVehicle(VehicleDto vehicleDto) {
		//Click on Add a vehicle button in vehicle page
		clickOnAddAVehicleButton();
		// Input data in the vehicle
		inputVehicleData(vehicleDto);
		SeleniumUtility.fixedWait(1);
		clickOnSave();
		// Input data in the Administration
		inputAdministrationData(vehicleDto);
		SeleniumUtility.fixedWait(1);
		clickOnSave();
		// Input data in the operational in vehicle
		//inputOprerationalData(vehicleDto);
		//clickOnSave();
	}
	
	
	/**
	 * This public method add a vehicle to the given public super company
	 * @param vehicleDto - Should be VehicleDto
	 */
	public void editAVehicle(VehicleDto vehicleDto) {
		//Click on Edit button in vehicle. There is not edit button so click anywher in given vehicle row
		clickOnVehicleToView("AABBCCDDEEFF");
		// Click on Edit Button of the vehicle
		clickOnEditVehicle();
		// Input data in the vehicle
		inputVehicleData(vehicleDto);
		SeleniumUtility.fixedWait(1);
		clickOnSave();
		// Input data in the Administration
		inputAdministrationData(vehicleDto);
		SeleniumUtility.fixedWait(1);
		clickOnSave();
		// Input data in the operational in vehicle
		inputOprerationalData(vehicleDto);
		clickOnSave();
		clickOnBackButton();
	}
	/**
	 * This method click on plate number of a vehicle to view details of that vehicle
	 */
	public void viewAVehicle() {
		//Click on Edit button in vehicle. There is not edit button so click anywher in given vehicle row
		clickOnVehicleToView("AABBCCDDEEFF");
		clickOnBackButton();

	}

}
