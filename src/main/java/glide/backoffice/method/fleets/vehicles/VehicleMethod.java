package glide.backoffice.method.fleets.vehicles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.utility.SeleniumUtility;

public class VehicleMethod {
	WebDriver driver;
	HeaderMethod headerMethod;
	HomepageVehicleMethod homepageVehicleMethod;
	AddEditVehicleMethod addEditVehicleMethod;
	ViewVehicleMethod viewVehicleMethod;
	SideMenuItemsMethod sideMenuItemsMethod;
	CommonMethods commonMethods;
	FilterVehiclesMethod filterVehiclesMethod;
	public VehicleMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		this.homepageVehicleMethod=PageFactory.initElements(driver, HomepageVehicleMethod.class);
		this.addEditVehicleMethod=PageFactory.initElements(driver, AddEditVehicleMethod.class);
		this.viewVehicleMethod=PageFactory.initElements(driver, ViewVehicleMethod.class);
		this.sideMenuItemsMethod=PageFactory.initElements(driver, SideMenuItemsMethod.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);
		this.filterVehiclesMethod=PageFactory.initElements(driver, FilterVehiclesMethod.class);

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
		// Input data in the Administration
		addEditVehicleMethod.inputAdministrationData(vehicleDto);
		SeleniumUtility.fixedWait(1);
		// Input data in the operational in vehicle
		addEditVehicleMethod.inputOprerationalData(vehicleDto);
		// click on save button
		addEditVehicleMethod.clickOnSave();
		// wait until rotating circle is invisible
		commonMethods.waitUntilElementToBeInvisible();
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
		// Input data in the Administration
		addEditVehicleMethod.inputAdministrationData(vehicleDto);
		SeleniumUtility.fixedWait(1);
		// Input data in the operational in vehicle
		addEditVehicleMethod.inputOprerationalData(vehicleDto);
		addEditVehicleMethod.clickOnSave();
		//clickOnBackButton();
		//sideMenuItemsMethod.clickOnVehicles();
		//homepageVehicleMethod.assertAddEditVehicle(Config.getProperty("EDIT_VEHICLE_PLATE_NUMBER"), 
		//		Config.getProperty("SUPER_COMPANY_NAME"), vehicleDto.getCarModel(), vehicleDto.getCarBrand(), vehicleDto.getFuelType());
	}
	/**
	 * This method click on plate number of a vehicle to view details of that vehicle
	 */
	public void viewAVehicle() {
		//Click on Edit button in vehicle. There is not edit button so click anywher in given vehicle row
		homepageVehicleMethod.clickOnVehicleToView(Config.getProperty("EDIT_VEHICLE_PLATE_NUMBER"));
		viewVehicleMethod.assertVehicleView();
		clickOnBackButton();

	}
	
	public void filtervehicle(VehicleFilterDto vehicleFilterDto) {
		
		filterVehiclesMethod.clickOnBrand();
		filterVehiclesMethod.selectFilterKeyAndValue(vehicleFilterDto.getBrand());
		commonMethods.waitUntilTableContentVisible();
		//filterVehiclesMethod.clickOnBrandDeleteIcon();
		filterVehiclesMethod.clickOnModel();
		filterVehiclesMethod.selectFilterKeyAndValue(vehicleFilterDto.getModel());
		commonMethods.waitUntilTableContentVisible();
		filterVehiclesMethod.clickOnVersion();
		filterVehiclesMethod.selectFilterKeyAndValue(vehicleFilterDto.getVersion());
		commonMethods.waitUntilTableContentVisible();
		filterVehiclesMethod.clickOnVehicleCategory();
		filterVehiclesMethod.selectFilterKeyAndValue(vehicleFilterDto.getVehicleCategory());
		commonMethods.waitUntilTableContentVisible();
		filterVehiclesMethod.clickOnVehicleColor();
		filterVehiclesMethod.selectFilterKeyAndValue(vehicleFilterDto.getColor());
		commonMethods.waitUntilTableContentVisible();
		filterVehiclesMethod.clickOnSystemType();
		filterVehiclesMethod.selectFilterKeyAndValue(vehicleFilterDto.getSystemType());
		commonMethods.waitUntilTableContentVisible();
		filterVehiclesMethod.clickOnVehicleStatus();
		filterVehiclesMethod.selectFilterKeyAndValue(vehicleFilterDto.getVehicleStatus());
		commonMethods.waitUntilTableContentVisible();
		filterVehiclesMethod.clickOnType();
		filterVehiclesMethod.selectFilterKeyAndValue(vehicleFilterDto.getType());
		commonMethods.waitUntilTableContentVisible();
		filterVehiclesMethod.clickOnCleanlinessStatus();
		filterVehiclesMethod.selectFilterKeyAndValue(vehicleFilterDto.getCleanlinessStatus());
		commonMethods.waitUntilTableContentVisible();
		filterVehiclesMethod.clickOnPlateNumber();
		filterVehiclesMethod.inputFilterPlateNumber(vehicleFilterDto.getPlateNumber());
		filterVehiclesMethod.clickOnConfirmButtonToPreserveInputField();
		commonMethods.waitUntilTableContentVisible();
	}

}
