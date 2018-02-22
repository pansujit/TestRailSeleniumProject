package glide.backoffice.method.fleets.vehicles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import glide.backoffice.locators.fleets.vehicles.AddVehicle;
import glide.backoffice.locators.fleets.vehicles.HomepageVehicles;
import glide.backoffice.utility.SeleniumUtility;

public class AddEditVehicleMethod {
	WebDriver driver;
	HomepageVehicles homepageVehicles;
	AddVehicle addVehicle;
	
	public AddEditVehicleMethod(WebDriver ldriver ) {
		this.driver=ldriver;
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
	 * This method adds the parameters in Add/Edit Vehicle in Vehicle Sections.Data should be get from VehicleDto
	 * @param vehicleDto - should be VehicleDto
	 */
	void inputVehicleData(VehicleDto vehicleDto) {
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
	void inputAdministrationData(VehicleDto vehicleDto) {
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
	 void inputOprerationalData(VehicleDto vehicleDto) {
		SeleniumUtility.selectByvalue(driver,addVehicle.selectTagUsedSystemEditVehicle,vehicleDto.getSystemInUse());
		SeleniumUtility.clearTextAndSendText(driver,addVehicle.inputTagDeviceSerialNumberEditVehicle,vehicleDto.getDeviceSerialNumber());

	}
	/**
	 * This method will click on Save or Next button in Add or edit vehicle.
	 */
	void clickOnSave() {
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagNextEditVehicle);
		SeleniumUtility.fixedWait(5);

	}
}
