package glide.backoffice.locators.accounts.sitesandparkings;

import org.openqa.selenium.By;

public class EditParking {
	
	/**
	 * This locator will find Parking name element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By inputTagNameEditParking= By.xpath(".//input[@id='name']");
	
	/**
	 * This locator will find Parking coordinates Latitude element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By inputTagLatitudeEditParking= By.xpath(".//input[@id='latitude']");
	/**
	 * This locator will find Parking coordinates Longitude element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By inputTagEditLongitudeParking= By.xpath(".//input[@id='longitude']");
	/**
	 * This locator will find Parking coordinates Radius element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By inputTagRadiusEditParking= By.xpath(".//input[@id='radius']");
	/**
	 * This locator will find Additional information element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By inputTagEditAdditionalInfoEditParking= By.xpath(".//input[@id='additionalInformation']");
	/**
	 * This locator will find RRS Parking ID element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By inputTagEditRRSParkingIdParking= By.xpath(".//input[@id='rrsParkingId']");
	/**
	 * This locator will find Radio button 24/7 false element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By labelTagParkingOpenFalseEditParking= By.xpath(".//input[@id='parkingAccess_option_false']/../label");

	/**
	 * This locator will find Radio button 24/7 true element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By labelTagParkingOpenTrueEditParking= By.xpath(".//input[@id='parkingAccess_option_true']/../label");
	
	/**
	 * This locator will find Private access Radio Button FALSE element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By labelTagPrivateAccessFalseEditParking= By.xpath(".//input[@id='privateAccess_option_false']/../label");

	/**
	 * This locator will find Private access Radio Button TRUE element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By labelTagPrivateAccessTrueEditParking= By.xpath(".//input[@id='privateAccess_option_true']/../label");
	
	/**
	 * This locator will find Disable access Radio Button FALSE element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By labelTagDisabledAccessFalseEditParking= By.xpath(".//input[@id='disabledAccess_option_false']/../label");

	/**
	 * This locator will find Disable access Radio Button TRUE element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By labelTagDisabledAccessTrueEditParking= By.xpath(".//input[@id='disabledAccess_option_true']/../label");
	
	/**
	 * This locator will find Electric Charge access Radio Button FALSE element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By labelTagElectricChargingFalseEditParking= By.xpath(".//input[@id='electricCharging_option_false']/../label");

	/**
	 * This locator will find Electric Charge access Radio Button TRUE element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By labelTagElectricChargingTrueEditParking= By.xpath(".//input[@id='electricCharging_option_true']/../label");
	
	/**
	 * This locator will find GSM Connection Radio Button FALSE element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By labelTagGSMConnectionFalseEditParking= By.xpath(".//input[@id='gsmConnection_option_false']/../label");

	/**
	 * This locator will find GSM Connection access Radio Button TRUE element in 
	 * Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By labelTagGSMConnectionTrueEditParking= By.xpath(".//input[@id='gsmConnection_option_true']/../label");
	
	
	/**
	 * This locator will find Save element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By buttonTagSaveEditParking= By.xpath(".//div[@class='parkingForm_actions']/button");
	/**
	 * This locator will find  Cancel element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Parking Edit
	 */
	public final By aTagCancelEditParking= By.xpath(".//div[@class='parkingForm_actions']/a");
	
	
	

}
