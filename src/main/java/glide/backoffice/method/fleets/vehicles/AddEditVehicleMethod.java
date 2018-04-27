package glide.backoffice.method.fleets.vehicles;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.fleets.vehicles.AddVehicle;
import glide.backoffice.locators.fleets.vehicles.HomepageVehicles;
import glide.backoffice.utility.SeleniumUtility;

public class AddEditVehicleMethod {
	static Logger log = Logger.getLogger(AddEditVehicleMethod.class.getName());

	WebDriver driver;
	HomepageVehicles homepageVehicles;
	AddVehicle addVehicle;
	ImagePopupMethod imagePopupMethod;
	public AddEditVehicleMethod(WebDriver ldriver ) {
		this.driver=ldriver;
		this.addVehicle=PageFactory.initElements(driver, AddVehicle.class);
		this.imagePopupMethod=PageFactory.initElements(driver, ImagePopupMethod.class);
	}

	
	/**
	 * This method adds the parameters in Add/Edit Vehicle in Vehicle Sections.Data should be get from VehicleDto
	 * @param vehicleDto - should be VehicleDto
	 */
	void inputVehicleData(VehicleDto vehicleDto) {
		
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagCarBrandEditVehicle);
		SeleniumUtility.fixedWait(5);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getCarBrand());
		
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagCarModelEditVehicle);
		SeleniumUtility.fixedWait(1);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getCarModel());
		
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagCarVersionEditVehicle);
		SeleniumUtility.fixedWait(1);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getCarVersion());
		
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagVehicleColorEditVehicle);
		SeleniumUtility.fixedWait(1);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getVehicleColor());
		
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagVehicleTypeEditVehicle);
		SeleniumUtility.fixedWait(1);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getVehicleType());
		
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagVehicleClassEditVehicle);
		SeleniumUtility.fixedWait(1);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getVehicleClass());
		
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagGearBoxEditVehicle);
		SeleniumUtility.fixedWait(1);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getGearBox());
		
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagFuelTypeEditVehicle);
		SeleniumUtility.fixedWait(1);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getFuelType());
		
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagNumberOfDoorsEditVehicle);
		SeleniumUtility.fixedWait(1);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getNumberOfDoors());
		
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagNumberOfSeatsEditVehicle);
		SeleniumUtility.fixedWait(1);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getNumberOfDoors());
		
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagOwnerEditVehicle);
		SeleniumUtility.fixedWait(1);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getOwnerOfVehicle());
		
		uploadRegistrationDocument(vehicleDto.getFileName());
		SeleniumUtility.clickOnElement(driver, addVehicle.inputTagPictureURLEditVehicle);
		imagePopupMethod.waitUntilImageURLIsVisible();
		imagePopupMethod.inputURLInImageField(vehicleDto.getImageURL());
		imagePopupMethod.clickOnOkButton();
		imagePopupMethod.waitUntilImageURLNotIsVisible();
	}
	
	void uploadRegistrationDocument(String fileName) {
		String data=SeleniumUtility.fileCheck(fileName);
		if(data==null) {
			log.error("Absolute path is not found for the file "+ fileName);
			return;
		}
		else {
			SeleniumUtility.sendText(driver, addVehicle.inputTagRegistrationDocLEditVehicle, data);
		}
	}
	
	void clickonVisibleTextOnAddEditVehicleDropdown(String vehicleElement) {
		if(SeleniumUtility.checkElementIsVisible(driver, addVehicle.divTagDropdownTextEditVehicle(vehicleElement))){
			//SeleniumUtility.moveToElementAction(driver, addVehicle.divTagDropdownTextEditVehicle(vehicleElement));
			//SeleniumUtility.clickOnElement(driver, addVehicle.divTagDropdownTextEditVehicle(vehicleElement));
			SeleniumUtility.clickWithJavaScript(driver, addVehicle.divTagDropdownTextEditVehicle(vehicleElement));
			SeleniumUtility.fixedWait(1);
		}
		else {
			SeleniumUtility.actionSendKeys(driver, Keys.ESCAPE);
			SeleniumUtility.fixedWait(1);
		}

	}
	private void waitUntilDataIsDisplayedInDropdown() {
		
	}
	
	/**
	 * This method adds the parameters in Add/Edit Vehicle in Administration Sections.Data should be get from VehicleDto
	 * @param vehicleDto - Should be vehicleDto
	 */
	void inputAdministrationData(VehicleDto vehicleDto) {
		SeleniumUtility.clearTextAndSendText(driver, addVehicle.inputTagVINNumberEditVehicle, vehicleDto.getVehicleVIN());
		SeleniumUtility.clearTextAndSendText(driver, addVehicle.inputTagPlateNumberEditVehicle, vehicleDto.getPlateNumber());

		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagSiteLocationEditVehicle);
		clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getSiteLocation());
		// This parking location is causing problem whilel creating  a vehicle, disabling for the moment
		//SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagParkingLocationEditVehicle);
		//clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getParkingLocation());

	}
	
	/**
	 * This method adds the parameters in Add/Edit Vehicle in Operational Sections.Data should be get from VehicleDto
	 * @param vehicleDto - Should be VehicleDto
	 */
	 void inputOprerationalData(VehicleDto vehicleDto) {
		 SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagUsedSystemEditVehicle);
			clickonVisibleTextOnAddEditVehicleDropdown(vehicleDto.getSystemInUse());
		SeleniumUtility.clearTextAndSendText(driver,addVehicle.inputTagDeviceSerialNumberEditVehicle,vehicleDto.getDeviceSerialNumber());

	}
	/**
	 * This method will click on Save or Next button in Add or edit vehicle.
	 */
	void clickOnSave() {
		SeleniumUtility.clickOnElement(driver, addVehicle.buttonTagSaveEditVehicle);

	}
	
	void waitUntilSaveButtonIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, addVehicle.buttonTagSaveEditVehicle);
	}
}
