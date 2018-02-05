package glide.backoffice.method.sitesandparkings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.accounts.sitesandparkings.AddParking;
import glide.backoffice.locators.accounts.sitesandparkings.AddSite;
import glide.backoffice.locators.accounts.sitesandparkings.HomepageSites;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.utility.SeleniumUtility;

public class SitesAndParkings {
	
	WebDriver driver;
	HeaderMethod headerMethod;
	HomepageSites homepageSites;
	AddSite addSites;
	AddParking addParking;
	public SitesAndParkings(WebDriver ldriver) {
		this.driver=ldriver;
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		this.homepageSites=PageFactory.initElements(driver, HomepageSites.class);
		this.addSites=PageFactory.initElements(driver, AddSite.class);
		this.addParking=PageFactory.initElements(driver, AddParking.class);

	}
	
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
	
	private void clickOnAddSiteButton() {
		SeleniumUtility.clickOnElement(driver, homepageSites.aTagAddSiteHomepageSites);
		SeleniumUtility.waitElementToBeVisible(driver, addSites.buttonTagSaveEditSite);
		SeleniumUtility.fixedWait(1);
	}
	private void inputDataInSiteParamaters(SiteDto siteDto) {
		SeleniumUtility.clearTextAndSendText(driver, addSites.inputTagNameEditSite, siteDto.getSiteName());
		SeleniumUtility.clearTextAndSendText(driver, addSites.inputTagAddressEditSite, siteDto.getSiteAddress());
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, addSites.selectTagCompanyAddSite, siteDto.getSelectCompany());
		SeleniumUtility.fixedWait(1);


		selectRadioButton(siteDto.isEnableSmartcard(), addSites.labelTagEnableSmartcardTrueEditSite,
				addSites.labelTagEnableSmartcardFalseEditSite);
		selectRadioButton(siteDto.automaticExtendingBooing, addSites.labelTagAutomaticExtensionTrueEditSite,
				addSites.labelTagAutomaticExtensionFalseEditSite);
		selectRadioButton(siteDto.automaticShorteningBooing, addSites.labelTagAutomaticShorteningTrueEditSite,
				addSites.labelTagAutomaticShorteningFalseEditSite);
		selectRadioButton(siteDto.isPenaltyOnExpiredBooing(), addSites.labelTagPenaltyOnExpiredBooingTrueEditSite,
				addSites.labelTagPenaltyOnExpiredBooingFalseEditSite);
		selectRadioButton(siteDto.isSpontaneousBooking(), addSites.labelTagSpontaneousBookingTrueEditSite,
				addSites.labelTagSpontaneousBookingFalseEditSite);
		selectRadioButton(siteDto.isSpontaneousBookingType(), addSites.labelTagSpontaneousBookingTypeTrueEditSite,
				addSites.labelTagSpontaneousBookingTypeFalseEditSite);
		selectRadioButton(siteDto.isPhisingSmartcard(), addSites.labelTagSmartcardFishingEnabledTrueEditSite,
				addSites.labelTagSmartcardFishingEnabledFalseEditSite);
		SeleniumUtility.selectByvalue(driver, addSites.selectTagTimeZoneEditSite, siteDto.getSelectTimeZone());
		SeleniumUtility.fixedWait(1);
	}
	private void clickOnEditSiteButton() {
		SeleniumUtility.clickOnElement(driver, homepageSites.buttonTagEditSiteHomepageSites("autoTest_site"));
		SeleniumUtility.waitElementToBeVisible(driver, addSites.buttonTagSaveEditSite);
		SeleniumUtility.fixedWait(1);
	}
	
	private void clickonSaveButton() {
		SeleniumUtility.clickOnElement(driver, addSites.buttonTagSaveEditSite);

	}
	private void clickOnBackButton() {
		headerMethod.clickOnHeaderBackButton();
	}
	private void waitToAddASiteVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, homepageSites.aTagAddSiteHomepageSites);
		SeleniumUtility.fixedWait(1);
	}
	private void clickOnAddParkingButton() {
		SeleniumUtility.clickOnElement(driver, addSites.aTagAddParkingEditSite);
		SeleniumUtility.waitElementToBeVisible(driver, addParking.buttonTagSaveEditParking);
		SeleniumUtility.fixedWait(1);
	}
	private void clickOnParkingEditButton() {
		SeleniumUtility.clickOnElement(driver,addSites.buttonTagEditParkingEditSite("test_parking"));
		SeleniumUtility.waitElementToBeVisible(driver, addParking.buttonTagSaveEditParking);
		SeleniumUtility.fixedWait(1);
		
		
	}
	private void inputDataInParkingParamaters(ParkingDto parkingDto) {
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
	private void clickOnParkingSaveButton() {
		SeleniumUtility.clickOnElement(driver, addParking.buttonTagSaveEditParking);
		SeleniumUtility.waitElementToBeVisible(driver, addSites.aTagAddParkingEditSite);
		SeleniumUtility.fixedWait(1);
	}
	

	public void createSite(SiteDto siteDto) {
		clickOnAddSiteButton();
		inputDataInSiteParamaters(siteDto);
		clickonSaveButton();
		waitToAddASiteVisible();
	}
	public void editSite(SiteDto siteDto) {
		clickOnEditSiteButton();
		inputDataInSiteParamaters( siteDto);
		clickonSaveButton();
		SeleniumUtility.fixedWait(1);
		clickOnBackButton();
	}
	
	
	public void createParking(ParkingDto parkingDto) {
		clickOnEditSiteButton();
		clickOnAddParkingButton();
		inputDataInParkingParamaters(parkingDto);
		clickOnParkingSaveButton();
		SeleniumUtility.fixedWait(1);
		clickOnBackButton();
	}
	
	public void editParking(ParkingDto parkingDto) {
		clickOnEditSiteButton();
		clickOnParkingEditButton();
		inputDataInParkingParamaters(parkingDto);
		clickOnParkingSaveButton();
		SeleniumUtility.fixedWait(1);
		clickOnBackButton();
	}

}
