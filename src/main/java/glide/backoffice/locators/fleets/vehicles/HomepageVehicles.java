package glide.backoffice.locators.fleets.vehicles;

import org.openqa.selenium.By;

public class HomepageVehicles {
	/**
	 * This locator will find the Add a Vehicle tag in Vehicle management page in the Fleet management->Vehicle Management
	 */
	final public By aTagFleetVehicleMgmtAddVehicle= By.xpath(".//div[@class='pageManagementHeader_actionButton']/a");
	/**
	 * This locator will find the Export all to CSV tag in Vehicle management page in the Fleet management->Vehicle Management
	 */
	final public By aTagFleetVehicleMgmtExportAsCSV= By.xpath(".//div[@class='fleetPage_filters']/a");
	/**
	 * This locator will find the Filter button tag in Vehicle management page in the Fleet management->Vehicle Management
	 */
	final public By ButtonTagFleetVehicleMgmtFilter= By.xpath(".//div[@class='fleetPage_filters']/button");
	/**
	 * This locator will find the xx tag in Vehicle management page in the Fleet management->Vehicle Management
	 */
	/**
	 * This locator will find the Plate number header tag in Vehicle management Table page in the Fleet management->Vehicle Management
	 */
	final public By spanTagFleetVehicleMgmtTheadPlateNumber= By.xpath(".//table[@class='tableView']//th[1]/span");
	/**
	 * This locator will find the Model Header tag in Vehicle management table page in the Fleet management->Vehicle Management
	 */
	final public By spanTagFleetVehicleMgmtMgmtTheadModel= By.xpath(".//table[@class='tableView']//th[2]/span");
	/**
	 * This locator will find the Fuel Type header tag in Vehicle management table page in the Fleet management->Vehicle Management
	 */
	final public By spanTagFleetVehicleMgmtMgmtTheadFuelType= By.xpath(".//table[@class='tableView']//th[3]/span");
	/**
	 * This locator will find the Status header tag in Vehicle management table page in the Fleet management->Vehicle Management
	 */
	final public By spanTagFleetVehicleMgmtTheadStatus= By.xpath(".//table[@class='tableView']//th[8]/span");
	/**
	 * This method locator will find the View tag in Vehicle management table page in the Fleet management->Vehicle Management
	 * @param plateNumber should be String
	 * @return By Selenium By
	 */
	public final By buttonTagFleetVehicleMgmtViewVehicle(String plateNumber) {
		String text=".//table[@class='tableView']//tr/td/span/span[text()='xxxx']/../../../td[9]/button";
		return By.xpath(text.replace("xxxx", plateNumber));
		
	}
	/**
	 * This method locator will find the Status tag in Vehicle management table page in the Fleet management->Vehicle Management
	 * @param plateNumber should be String 
	 * @return By Selenium By
	 */
	public final By buttonTagFleetVehicleMgmtStatus(String plateNumber) {
		String text=".//table[@class='tableView']//tr/td/span/span[text()='xxxx']/../../../td[8]/span/span";
		return By.xpath(text.replace("xxxx", plateNumber));
		
	}
	/**
	 * This locator will find the xx tag in Vehicle management page in the Fleet management->Vehicle Management
	 */
	final public By aTagFleetVehicleMgmt= By.xpath("");


	
	
}
