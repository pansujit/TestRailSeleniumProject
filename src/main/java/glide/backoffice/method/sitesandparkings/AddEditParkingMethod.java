package glide.backoffice.method.sitesandparkings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.accounts.sitesandparkings.AddParking;
import glide.backoffice.locators.accounts.sitesandparkings.AddSite;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This class contains all the method for add and edit parking page
 * @author sujitpandey
 * @created on Feb 22, 2018 4:29:41 PM
 */
public class AddEditParkingMethod {
	WebDriver driver;
	AddParking addParking;
	AddSite addSite;
	public AddEditParkingMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addParking=PageFactory.initElements(driver, AddParking.class);
		this.addSite=PageFactory.initElements(driver, AddSite.class);

	}
	/**
	 * This private method, select the radio button, depending upon the the boolean value.
	 * @param status - Should be boolean
	 * @param elementTrue - Should be WebElement
	 * @param elementFalse - Should be WebElement
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
	 * This method input/select given values in Add/edit parking page in back-office
	 * @param parkingDto - Should be ParkingDto
	 */
	void inputDataInParkingParamaters(ParkingDto parkingDto) {
		SeleniumUtility.clearTextAndSendText(driver,addParking.inputTagNameEditParking, parkingDto.getParkingName());
		SeleniumUtility.clearTextAndSendText(driver,addParking.inputTagEditLongitudeParking, parkingDto.getLongitude());
		SeleniumUtility.clearTextAndSendText(driver,addParking.inputTagLatitudeEditParking, parkingDto.getLatitude());
		SeleniumUtility.clearTextAndSendText(driver,addParking.inputTagRadiusEditParking, parkingDto.getRadius());
		SeleniumUtility.clearTextAndSendText(driver,addParking.inputTagEditAdditionalInfoEditParking,
				parkingDto.getAdditionalInformation());
		selectRadioButton(parkingDto.isAllTimeOpen(), addParking.labelTagParkingOpenTrueEditParking, 
				addParking.labelTagParkingOpenFalseEditParking);
		selectRadioButton(parkingDto.isPrivateAccess(), addParking.labelTagPrivateAccessTrueEditParking, 
				addParking.labelTagPrivateAccessFalseEditParking);
		selectRadioButton(parkingDto.isDisableAccess(), addParking.labelTagDisabledAccessTrueEditParking, 
				addParking.labelTagDisabledAccessFalseEditParking);
		selectRadioButton(parkingDto.isGsmConnection(), addParking.labelTagGSMConnectionTrueEditParking, 
				addParking.labelTagGSMConnectionFalseEditParking);
		selectRadioButton(parkingDto.isElectricCharge(), addParking.labelTagElectricChargingTrueEditParking, 
				addParking.labelTagElectricChargingFalseEditParking);	
		
	}
	/**
	 * This method click on the Save button on the Add/Edit parking  and wait until the add a parking button in Edit site is appear.
	 */
	 void clickOnParkingSaveButton() {
		SeleniumUtility.clickOnElement(driver, addParking.buttonTagSaveEditParking);
		SeleniumUtility.waitElementToBeVisible(driver, addSite.aTagAddParkingEditSite);
		SeleniumUtility.fixedWait(1);
	}
}
