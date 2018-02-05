package glide.backoffice.locators.fleets.vehicles;

import org.openqa.selenium.By;

public class HomepageVehicles {
	
	
	/**
	 * This method locator will find Add a Vehicle element in the Fleet management->Vehicle-->Homapage
	 */
	public final By buttonTagAddVehicleHomepageVehicles=By.xpath(".//button[@id='fleet_add_button']");
	
	/**
	 * This method locator will find Export element in the Fleet management->Vehicle-->Homapage
	 */
	public final By buttonTagExportVehicleHomepageVehicles=By.xpath(".//button[@id='fleet_export_button']");
	
	
	

	/**
	 * This method locator will find Plate number in Vehicle table page in the Fleet management->Vehicle-->Homapage
	 * @param plateNumber should be String
	 * @return By Selenium By
	 */
	public final By divTagPlateNumberHomepageVehicles(String plateNumber) {
		String text=".//div[contains(@id,'fleet_list_row_')]/div[1]/div/div/div[1 and text()='xxxx']";
		return By.xpath(text.replace("xxxx", plateNumber));
		
	}
	
	/**
	 * This method locator will find Fuel Type in Vehicle table page in the Fleet management->Vehicle-->Homapage
	 * @param plateNumber should be String
	 * @return By Selenium By
	 */
	public final By spanTagFuelTypeHomepageVehicles(String plateNumber) {
		String text=".//div[contains(@id,'fleet_list_row_')]/div[1]/div/div/div[1 and text()='xxxx']/../div[2]/span/span";
		return By.xpath(text.replace("xxxx", plateNumber));
		
	}
	
	/**
	 * This method locator will find Brand Name in Vehicle table page in the Fleet management->Vehicle-->Homapage
	 * @param plateNumber should be String
	 * @return By Selenium By
	 */
	public final By divTagBrandNameHomepageVehicles(String plateNumber) {
		String text=".//div[contains(@id,'fleet_list_row_')]/div[1]/div/div/div[1 and text()='xxxx']/../../../../div[2]/div[1]";
		return By.xpath(text.replace("xxxx", plateNumber));
		
	}
	
	/**
	 * This method locator will find Vehicle Model in Vehicle table page in the Fleet management->Vehicle-->Homapage
	 * @param plateNumber should be String
	 * @return By Selenium By
	 */
	public final By divTagVehicleModelHomepageVehicles(String plateNumber) {
		String text=".//div[contains(@id,'fleet_list_row_')]/div[1]/div/div/div[1 and text()='xxxx']/../../../../div[2]/span";
		return By.xpath(text.replace("xxxx", plateNumber));
		
	}
	
	/**
	 * This method locator will find hardware in Vehicle table page in the Fleet management->Vehicle-->Homapage
	 * @param plateNumber should be String
	 * @return By Selenium By
	 */
	public final By divTagHardwareHomepageVehicles(String plateNumber) {
		String text=".//div[contains(@id,'fleet_list_row_')]/div[1]/div/div/div[1 and text()='xxxx']/../../../../div[3]";
		return By.xpath(text.replace("xxxx", plateNumber));
		
	}
	
	/**
	 * This method locator will find Super Company in Vehicle table page in the Fleet management->Vehicle-->Homapage
	 * @param plateNumber should be String
	 * @return By Selenium By
	 */
	public final By divTagSuperCompanyHomepageVehicles(String plateNumber) {
		String text=".//div[contains(@id,'fleet_list_row_')]/div[1]/div/div/div[1 and text()='xxxx']/../../../../div[4]";
		return By.xpath(text.replace("xxxx", plateNumber));
		
	}
	
	/**
	 * This method locator will find Parking Name in Vehicle table page in the Fleet management->Vehicle-->Homapage
	 * @param plateNumber should be String
	 * @return By Selenium By
	 */
	public final By divTagParkingNameHomepageVehicles(String plateNumber) {
		String text=".//div[contains(@id,'fleet_list_row_')]/div[1]/div/div/div[1 and text()='xxxx']/../../../../div[5]/div[1]";
		return By.xpath(text.replace("xxxx", plateNumber));
		
	}
	
	/**
	 * This method locator will find Site Name in Vehicle table page in the Fleet management->Vehicle-->Homapage
	 * @param plateNumber should be String
	 * @return By Selenium By
	 */
	public final By divTagSiteNameHomepageVehicles(String plateNumber) {
		String text=".//div[contains(@id,'fleet_list_row_')]/div[1]/div/div/div[1 and text()='xxxx']/../../../../div[5]/span";
		return By.xpath(text.replace("xxxx", plateNumber));
		
	}
	/**
	 * This method locator will find Status in Table in Vehicle table page in the Fleet management->Vehicle-->Homapage
	 * @param plateNumber should be String
	 * @return By Selenium By
	 */
	public final By divTagStatusInTableHomepageVehicles(String plateNumber) {
		String text=".//div[contains(@id,'fleet_list_row_')]/div[1]/div/div/div[1 and text()='xxxx']/../../../../div[6]//span/span";
		return By.xpath(text.replace("xxxx", plateNumber));
		
	}
	
	
}
