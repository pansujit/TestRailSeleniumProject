package glide.backoffice.locators.accounts.sitesandparkings;

import org.openqa.selenium.By;

public class EditParking {
	
	/**
	 * This locator will find Parking name element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Edit
	 */
	final public By inpitTagNameEditParking= By.xpath(".//input[@id='name']");
	
	/**
	 * This locator will find Parking coordinates Latitude element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Edit
	 */
	final public By inputTagLatitudeEditParking= By.xpath(".//input[@id='latitude']");
	/**
	 * This locator will find Parking coordinates Longitude element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Edit
	 */
	final public By inputTagEditLongitudeParking= By.xpath(".//input[@id='longitude']");
	/**
	 * This locator will find Parking coordinates Radius element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Edit
	 */
	final public By inputTagRadiusEditParking= By.xpath(".//input[@id='radius']");
	/**
	 * This locator will find Additional information element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Edit
	 */
	final public By inputTagEditAdditionalInfoEditParking= By.xpath(".//input[@id='additionalInformation']");
	/**
	 * This locator will find RRS Parking ID element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Edit
	 */
	final public By inputTagEditRRSParkingIdParking= By.xpath(".//input[@id='rrsParkingId']");
	/**
	 * This locator will find Radio button 24/7 false element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Edit
	 */
	final public By divTagParkingOpenFalseEditParking= By.xpath(".//input[@id='parkingAccess_option_false']/..");
	/**
	 * This locator will find Radio button 24/7 true element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Edit
	 */
	final public By divTagParkingOpenTrueEditParking= By.xpath(".//input[@id='parkingAccess_option_true']/..");
	/**
	 * This locator will find Save element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Edit
	 */
	final public By buttonTagSaveEditParking= By.xpath(".//div[@class='parkingForm_actions']/button");
	/**
	 * This locator will find  Cancel element in Edit Parking sites in Account-->Sites and parkings-->Edit-->Edit
	 */
	final public By aTagCancelEditParking= By.xpath(".//div[@class='parkingForm_actions']/a");
	
	
	
	

}
