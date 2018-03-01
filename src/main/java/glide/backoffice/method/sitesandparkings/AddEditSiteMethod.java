package glide.backoffice.method.sitesandparkings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.sitesandparkings.AddParking;
import glide.backoffice.locators.accounts.sitesandparkings.AddSite;
import glide.backoffice.method.common.Config;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This class contains all the method for add and edit site page
 * @author sujitpandey
 * @created on Feb 22, 2018 4:29:18 PM
 */
public class AddEditSiteMethod {
	WebDriver driver;
	AddSite addSite;
	AddParking addParking;
	SoftAssert softAssert;
	public AddEditSiteMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addSite=PageFactory.initElements(driver, AddSite.class);
		this.addParking=PageFactory.initElements(driver, AddParking.class);
		this.softAssert=new SoftAssert();
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
	 * This method input or select the edit/add site parameter value in Sites in back office.
	 * @param siteDto
	 */
	void inputDataInSiteParamaters(SiteDto siteDto) {
		SeleniumUtility.clearTextAndSendText(driver, addSite.inputTagNameEditSite, siteDto.getSiteName());
		SeleniumUtility.clearTextAndSendText(driver, addSite.inputTagAddressEditSite, siteDto.getSiteAddress());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, addSite.selectTagCompanyAddSite, siteDto.getSelectCompany());
		SeleniumUtility.fixedWait(1);


		selectRadioButton(siteDto.isEnableSmartcard(), addSite.labelTagEnableSmartcardTrueEditSite,
				addSite.labelTagEnableSmartcardFalseEditSite);
		selectRadioButton(siteDto.automaticExtendingBooing, addSite.labelTagAutomaticExtensionTrueEditSite,
				addSite.labelTagAutomaticExtensionFalseEditSite);
		selectRadioButton(siteDto.automaticShorteningBooing, addSite.labelTagAutomaticShorteningTrueEditSite,
				addSite.labelTagAutomaticShorteningFalseEditSite);
		selectRadioButton(siteDto.isPenaltyOnExpiredBooing(), addSite.labelTagPenaltyOnExpiredBooingTrueEditSite,
				addSite.labelTagPenaltyOnExpiredBooingFalseEditSite);
		selectRadioButton(siteDto.isSpontaneousBooking(), addSite.labelTagSpontaneousBookingTrueEditSite,
				addSite.labelTagSpontaneousBookingFalseEditSite);
		selectRadioButton(siteDto.isSpontaneousBookingType(), addSite.labelTagSpontaneousBookingTypeTrueEditSite,
				addSite.labelTagSpontaneousBookingTypeFalseEditSite);
		selectRadioButton(siteDto.isPhisingSmartcard(), addSite.labelTagSmartcardFishingEnabledTrueEditSite,
				addSite.labelTagSmartcardFishingEnabledFalseEditSite);
		SeleniumUtility.selectByvalue(driver, addSite.selectTagTimeZoneEditSite, siteDto.getSelectTimeZone());
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method click on the save button in Edit/Add site in Backoffice 
	 */
	void clickonSaveButton() {
		SeleniumUtility.clickOnElement(driver, addSite.buttonTagSaveEditSite);
	}
	
	/**
	 * This method click on the Parking Edit button in edit site and wait until the Save button in add/edit parking page is displayed.
	 */
	void clickOnParkingEditButton(String parkingName) {
		SeleniumUtility.clickOnElement(driver,addSite.buttonTagEditParkingEditSite(parkingName));
		SeleniumUtility.waitElementToBeVisible(driver, addParking.buttonTagSaveEditParking);
		SeleniumUtility.fixedWait(1);
		
		
	}
	/**
	 * This method click on Add parking button in edit site and wait until the Save button in add parking is appear.
	 */
	void clickOnAddParkingButton() {
		SeleniumUtility.clickOnElement(driver, addSite.aTagAddParkingEditSite);
		SeleniumUtility.waitElementToBeVisible(driver, addParking.buttonTagSaveEditParking);
		SeleniumUtility.fixedWait(1);
	}
	void assertEditAddParking(String parkingName,String electricCharge,String privateAccess,String reducedMob,String openAll,String connectivity) {
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				addSite.spanTagParkingPrivateAccessEditSite(parkingName), privateAccess));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				addSite.spanTagParkingElectricChargerEditSite(parkingName), electricCharge));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				addSite.spanTagParkingReducedMobAccessEditSite(parkingName), reducedMob));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				addSite.spanTagParkingOpenAllTimeEditSite(parkingName), openAll));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				addSite.spanTagParkingGoodConnectivityEditSite(parkingName), connectivity));
		softAssert.assertAll();
	}


}
