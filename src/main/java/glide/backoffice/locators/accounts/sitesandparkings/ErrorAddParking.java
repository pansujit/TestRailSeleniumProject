package glide.backoffice.locators.accounts.sitesandparkings;

import org.openqa.selenium.By;

public class ErrorAddParking {
	

	/**
	 * This locator finds error message element in name in  
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Add Parking
	 */
	public final By inputTagNameErrorAddParking= By.xpath(".//input[@id='name']/../../../div/span/span");
	
	/**
	 * This locator finds error message element in Latitude in  
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Add Parking
	 */
	public final By inputTagLatitudeErrorAddParking= By.xpath(".//input[@id='latitude']/../../../div/span/span");
	/**
	 * This locator finds error message element in Longitude in  
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Add Parking
	 */
	public final By inputTagEditLongitudeErrorAddParking= By.xpath(".//input[@id='longitude']/../../../div/span/span");

	/**
	 * This locator finds error message element in Private Access in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Add Parking
	 */
	public final By labelTagPrivateAccessFalseErrorAddParking= By.xpath(".//input[@id='privateAccess_option_false']/../../../div/span/span");

	/**
	 * This locator finds error message element in Disable Access in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Add Parking
	 */
	public final By labelTagDisabledAccessFalseErrorAddParking= By.xpath(".//input[@id='disabledAccess_option_false']/../../../div/span/span");

	/**
	 * This locator finds error message element in Electric charge in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Add Parking
	 */
	public final By labelTagElectricChargingFalseErrorAddParking= By.xpath(".//input[@id='electricCharging_option_false']/../../../div/span/span");

	/**
	 * This locator finds error message element in GSM Connection in
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Add Parking
	 */
	public final By labelTagGSMConnectionFalseErrorAddParking= By.xpath(".//input[@id='gsmConnection_option_false']/../../../div/span/span");

	

}
