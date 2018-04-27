package glide.backoffice.locators.fleets.vehicles;

import org.openqa.selenium.By;

public class EditVehicle {
	/**
	 * This method locator will find Gear Box 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagGearBoxEditVehicle=By.xpath(".//div[contains(@id,'Gearbox-')]//button");
	
	/**
	 * This method locator will find dropdown content  
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By divTagDropdownTextEditVehicle(String replaceDropdownText) {
		String text=".//span[@role='menuitem']/div/div/div[text()='xxxx']";
		return By.xpath(text.replace("xxxx", replaceDropdownText));
	}
	
	/**
	 * This method locator will find Vehicle fuel type button
	 *  element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagFuelTypeEditVehicle= By.xpath(".//div[contains(@id,'Vehicletype-')]//button");
	
	/**
	 * This method locator will find Car Brand button element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagCarBrandEditVehicle=By.xpath(".//div[contains(@id,'Carbrand-')]//button");
	
	/**
	 * This method locator will find Car Model button element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagCarModelEditVehicle=By.xpath(".//div[contains(@id,'Carmodel-')]//button");
	
	/**
	 * This method locator will find Car Version button element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagCarVersionEditVehicle=By.xpath(".//div[contains(@id,'Carversion-')]//button");
	
	/**
	 * This method locator will find Number Of seats button element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagNumberOfSeatsEditVehicle=By.xpath(".//div[contains(@id,'Numberofseats-')]//button");
	
	/**
	 * This method locator will find Number Of doors button element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagNumberOfDoorsEditVehicle=By.xpath(".//div[contains(@id,'Numberofdoors-')]//button");
	
	
	/**
	 * This method locator will find Vehicle class button element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagVehicleClassEditVehicle=By.xpath(".//div[contains(@id,'Vehicleclass-')]//button");
	
	/**
	 * This method locator will find Vehicle Color button element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagVehicleColorEditVehicle=By.xpath(".//div[contains(@id,'Color-')]//button");
	
	/**
	 * This method locator will find Vehicle Type button element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagVehicleTypeEditVehicle=By.xpath(".//div[contains(@id,'Type-')]//button");

	/**
	 * This method locator will find picture URL input element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By inputTagPictureURLEditVehicle=By.xpath(".//div[@class='newVehicleForm_carImg']/img");

	/**
	 * This method locator will find Vehicle Registration document input element 
	 * in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By inputTagRegistrationDocLEditVehicle=By.xpath(".//input[@id='registrationFile']");


	
	
	
	/**
	 * This method locator will find VIN number element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By inputTagVINNumberEditVehicle=By.xpath(".//input[contains(@id,'VINnumber-')]");

	
	/**
	 * This method locator will find Plate number element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By inputTagPlateNumberEditVehicle=By.xpath(".//input[contains(@id,'Platenumber-')]");
	
	
	//missing vehicle resgistration document upload file and first date of registration input field
	

	/**
	 * This method locator will find owner of the vehicle button element 
	 * in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagOwnerEditVehicle=By.xpath(".//div[contains(@id,'Ownerofthevehicle-')]//button");

	/**
	 * This method locator will find Site Location button 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagSiteLocationEditVehicle=By.xpath(".//div[contains(@id,'Sitelocation-')]//button");
	
	/**
	 * This method locator will find Parking Location button 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagParkingLocationEditVehicle=By.xpath(".//div[contains(@id,'Parkinglocation-')]//button");

	
	//service level 
	
	/**
	 * This method locator will find Service level select 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	//public final By selectTagServiceLevelEditVehicle=By.xpath(".//select[@id='serviceLevel']");

	
	
	/**
	 * This method locator will find System in Use button 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagUsedSystemEditVehicle=By.xpath(".//div[contains(@id,'Systeminuse-')]//button");

	
	
	/**
	 * This method locator will find Device Serial Number 
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By inputTagDeviceSerialNumberEditVehicle=By.xpath(".//input[contains(@id,'Deviceserialnumber-')]");

	/**
	 * This method locator will find Save button
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle
	 */
	public final By buttonTagSaveEditVehicle=By.xpath(".//button[@class='ekButton newVehicleForm_button']");

	
}
