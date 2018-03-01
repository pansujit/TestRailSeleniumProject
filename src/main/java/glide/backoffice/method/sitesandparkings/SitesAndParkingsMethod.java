package glide.backoffice.method.sitesandparkings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This class contains all the public method and common method for sites and parking 
 * @author sujitpandey
 * @created on Feb 22, 2018 4:30:52 PM
 */
public class SitesAndParkingsMethod {
	
	WebDriver driver;
	HeaderMethod headerMethod;
	HomepageSitesMethod homepageSitesMethod;
	AddEditSiteMethod addEditSiteMethod;
	AddEditParkingMethod addEditParkingMethod;
	
	public SitesAndParkingsMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		this.homepageSitesMethod=PageFactory.initElements(driver, HomepageSitesMethod.class);
		this.addEditSiteMethod=PageFactory.initElements(driver, AddEditSiteMethod.class);
		this.addEditParkingMethod=PageFactory.initElements(driver, AddEditParkingMethod.class);
	}
	
	/**
	 * This private method click on the back button on header of the back office
	 */
	private void clickOnBackButton() {
		headerMethod.clickOnHeaderBackButton();
	}

/**
 * This public method create a site in the back office 
 * @param siteDto - Should be  SiteDto
 */
	public void createSite(SiteDto siteDto) {
		homepageSitesMethod.clickOnAddSiteButton();
		addEditSiteMethod.inputDataInSiteParamaters(siteDto);
		addEditSiteMethod.clickonSaveButton();
		homepageSitesMethod.waitToAddASiteVisible();
	}
	/**
	 * This public method edit an existing site in back office
	 * @param siteDto - Should be  SiteDto
	 */
	public void editSite(SiteDto siteDto) {
		homepageSitesMethod.clickOnEditSiteButton(Config.getProperty("EDIT_SITE_NAME"));
		addEditSiteMethod.inputDataInSiteParamaters(siteDto);
		addEditSiteMethod.clickonSaveButton();
		SeleniumUtility.fixedWait(1);
		clickOnBackButton();
		homepageSitesMethod.waitToAddASiteVisible();
		homepageSitesMethod.assertAddEditSite(Config.getProperty("EDIT_SITE_NAME"),siteDto.getSiteAddress());
	}
	
	/**
	 * This public method create a parking in back office
	 * @param parkingDto - Should be parkingDto
	 */
	public void createParking(ParkingDto parkingDto) {
		homepageSitesMethod.clickOnEditSiteButton(Config.getProperty("EDIT_SITE_NAME"));
		addEditSiteMethod.clickOnAddParkingButton();
		addEditParkingMethod.inputDataInParkingParamaters(parkingDto);
		addEditParkingMethod.clickOnParkingSaveButton();
		SeleniumUtility.fixedWait(1);
		clickOnBackButton();
		homepageSitesMethod.waitToAddASiteVisible();
		
	}
	/**
	 * This public method edit an existing parking in back office
	 * @param parkingDto - Should be  ParkingDto
	 */
	public void editParking(ParkingDto parkingDto) {
		homepageSitesMethod.clickOnEditSiteButton(Config.getProperty("EDIT_SITE_NAME"));
		addEditSiteMethod.clickOnParkingEditButton(Config.getProperty("EDIT_PARKING_NAME"));
		addEditParkingMethod.inputDataInParkingParamaters(parkingDto);
		addEditParkingMethod.clickOnParkingSaveButton();
		//this method has to be removed by depended method wait until something visible or invisible
		SeleniumUtility.fixedWait(2);
		addEditSiteMethod.assertEditAddParking(Config.getProperty("EDIT_PARKING_NAME"), 
				 parkingDto.isPrivateAccess()? "yes" : "no",parkingDto.isElectricCharge()? "yes" : "no", 
						 parkingDto.isDisableAccess()? "yes" : "no", parkingDto.isAllTimeOpen()? "yes" : "no", 
								 parkingDto.isGsmConnection()? "yes" : "no");
		clickOnBackButton();
		homepageSitesMethod.waitToAddASiteVisible();
	}

}
