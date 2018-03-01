package glide.backoffice.locators.fleets.vehicles;

import org.openqa.selenium.By;

public class EditVehicle {
	/**
	 * This method locator will find Transmission type Automatic
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By labelTagTransMissionAutomaticEditVehicle=By.xpath(".//input[@id='transmissionType_option_AUTOMATIC']/../label");
	
	/**
	 * This method locator will find Transmision type manual 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By labelTagTransmissionManualEditVehicle=By.xpath(".//input[@id='transmissionType_option_MANUAL']/../label");
	
	/**
	 * This method locator will find Vehicle type according to given one. The option is "Electric", "LPG","petrol","diesel"
	 * and "Hybrid"
	 *  element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By labelTagFuelTypeEditVehicle(String fuelType) {
		String text =".//input[@id='vehicleType_option_xxxx']/../label";
		return By.xpath(text.replace("xxxx", fuelType));
	}
	

	/**
	 * This method locator will find Car Brand select element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By selectTagCarBrandEditVehicle=By.xpath(".//select[@id='carBrand']");
	
	/**
	 * This method locator will find Car Model element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By selectTagCarModelEditVehicle=By.xpath(".//select[@id='carModel']");
	
	/**
	 * This method locator will find Car Version element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By selectTagCarVersionEditVehicle=By.xpath(".//select[@id='carVersion']");
	
	/**
	 * This method locator will find Number Of seats element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By inputTagNumberOfSeatsEditVehicle=By.xpath(".//input[@id='numberOfSeats']");
	
	/**
	 * This method locator will find Vehicle class select element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By selectTagVehicleClassEditVehicle=By.xpath(".//select[@id='vehicleClass' and @name='vehicleClass']");
	
	/**
	 * This method locator will find Vehicle Color element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By selectTagVehicleColorEditVehicle=By.xpath(".//select[@id='vehicleColor']");
	
	/**
	 * This method locator will find Vehicle Type select element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By selectTagVehicleTypeEditVehicle=By.xpath(".//select[@id='vehicleClass' and @name='type']");
	
	/**
	 * This method locator will find Doors Number input element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By inputTagDoorsNumberEditVehicle=By.xpath(".//input[@id='doorsNumber']");
	
	/**
	 * This method locator will find picture URL input element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By inputTagPictureURLEditVehicle=By.xpath(".//input[@id='pictureUrl']");
	
	/**
	 * This method locator will find Next Button element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagNextEditVehicle=By.xpath(".//div[@class='vehicleForm_actions']/button[@class='ekButton vehicleForm_actionsButton']");

	/**
	 * This method locator will find Cancel element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagCancelEditVehicle=By.xpath(".//div[@class='vehicleForm_actions']/button[@class='ekButton vehicleForm_actionsLink']");


	
	
	
	/**
	 * This method locator will find VIN number element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By inputTagVINNumberEditVehicle=By.xpath(".//input[@id='vinNumber']");

	
	/**
	 * This method locator will find Plate number element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By inputTagPlateNumberEditVehicle=By.xpath(".//input[@id='licencePlate']");
	
	/**
	 * This method locator will find Curren company radio Input 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By labelTagCurrentCompanyEditVehicle=By.xpath(".//input[@id='vehicleOwner_option_currentCompany']/../label");


	/**
	 * This method locator will find RCI Mobility radio input element 
	 * in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By labelTagRCICompanyEditVehicle=By.xpath(".//input[@id='vehicleOwner_option_default']/../label");

	/**
	 * This method locator will find Site Location select 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By selectTagSiteLocationEditVehicle=By.xpath(".//select[@id='siteLocation']");
	
	/**
	 * This method locator will find Parking Location Select 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By selectTagParkingLocationEditVehicle=By.xpath(".//select[@id='parkingLocation']");

	
	
	/**
	 * This method locator will find Service level select 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By selectTagServiceLevelEditVehicle=By.xpath(".//select[@id='serviceLevel']");

	
	
	/**
	 * This method locator will find System in Use select 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By selectTagUsedSystemEditVehicle=By.xpath(".//select[@id='usedSystems']");

	
	
	/**
	 * This method locator will find Device Serial Number 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By inputTagDeviceSerialNumberEditVehicle=By.xpath(".//input[@id='deviceSerialNumber']");

	
	
}
