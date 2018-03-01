package glide.backoffice.locators.accounts.sitesandparkings;

import org.openqa.selenium.By;

public class EditSite {
	/**
	 * This locator will find Add parking element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By aTagAddParkingEditSite= By.xpath(".//div[@class='pageManagementHeader_actionButton']/a");
	
	/**
	 * This locator will find Name of sites element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By inputTagNameEditSite= By.xpath(".//input[@id='name']");
	
	/**
	 * This locator will find Address element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By inputTagAddressEditSite= By.xpath(".//div[@class='geosuggest siteForm_AddressAutocomplete']/input");
	
	/**
	 * This locator will find Time zone element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By selectTagTimeZoneEditSite= By.xpath(".//select[@id='zoneId']");
	
	/**
	 * This locator will find minimum time unit of booking element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By inputTagMinTimeUnitOfBookingEditSite= By.xpath(".//input[@id='timeUnitOfBooking']");
	
	/**
	 * This locator will find Save button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By buttonTagSaveEditSite= By.xpath(".//button[@class='ekButton siteForm_actionsButton']");
	
	/**
	 * This locator will find Cancel button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By aTagCancelEditSite= By.xpath(".//div[@class='siteForm_actions']/a");
	
	/**
	 * This locator will find Automatic shortening at the end of my booking (min) TRUE Radio Button
	 *  element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagAutomaticShorteningTrueEditSite= By.xpath(".//input[@id='automaticShortening_option_true']/../label");
	
	/**
	 * This locator will find Automatic shortening at the end of my booking (min) FALSE Radio Button
	 *  element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagAutomaticShorteningFalseEditSite= By.xpath(".//input[@id='automaticShortening_option_false']/../label");
	
	
	/**
	 * This locator will find Automatic extension of a booking TRUE Radio Button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagAutomaticExtensionTrueEditSite= By.xpath(".//input[@id='automaticExtension_option_true']/../label");
	
	/**
	 * This locator will find Automatic extension of a booking false Radio Button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagAutomaticExtensionFalseEditSite= By.xpath(".//input[@id='automaticExtension_option_false']/../label");
	
	/**
	 * This locator will find Penalty fees on expired bookings TRUE Radio Button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagPenaltyOnExpiredBooingTrueEditSite= By.xpath(".//input[@id='chargeExpiredBooking_option_true']/../label");
	
	/**
	 * This locator will find Penalty fees on expired bookings False Radio Button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagPenaltyOnExpiredBooingFalseEditSite= By.xpath(".//input[@id='chargeExpiredBooking_option_false']/../label");
	
	/**
	 * This locator will find Enable smartcard TRUE Radio Button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagEnableSmartcardTrueEditSite= By.xpath(".//input[@id='smartcardEnabled_option_true']/../label");
	/**
	 * This locator will find Enable smartcard false Radio Button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagEnableSmartcardFalseEditSite= By.xpath(".//input[@id='smartcardEnabled_option_false']/../label");
	/**
	 * This locator will find Enable spontaneous bookings TRUE Radio Button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagSpontaneousBookingTrueEditSite= By.xpath(".//input[@id='spontaneousBookingEnabled_option_true']/../label");
	
	/**
	 * This locator will find Enable spontaneous bookings FALSE Radio Button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagSpontaneousBookingFalseEditSite= By.xpath(".//input[@id='spontaneousBookingEnabled_option_false']/../label");
	
	/**
	 * This locator will find Spontaneous booking type TRUE Radio button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagSpontaneousBookingTypeTrueEditSite= By.xpath(".//input[@id='spontaneousBookingUsage_option_BUSINESS']/../label");
	
	/**
	 * This locator will find Spontaneous booking type TRUE Radio button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagSpontaneousBookingTypeFalseEditSite= By.xpath(".//input[@id='spontaneousBookingUsage_option_PRIVATE']/../label");
	
	/**
	 * This locator will find Automatic pairing of new smartcards (phishing) TRUE Radio Button
	 *  element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagSmartcardFishingEnabledTrueEditSite= By.xpath(".//input[@id='smartcardFishingEnabled_option_true']/../label");
	/**
	 * This locator will find Automatic pairing of new smartcards (phishing) TRUE Radio Button
	 *  element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By labelTagSmartcardFishingEnabledFalseEditSite= By.xpath(".//input[@id='smartcardFishingEnabled_option_false']/../label");
	/**

/**********************************PARKING TABLE CONTENT*******************************************/
	
	/**
	 * This locator will find Parking name element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By spanTagParkingNameEditSite(String replacementText) {
		String text=".//section[@class='siteDetailsPage_management']//table/tbody/tr/td[1]/span/span[text()='xxxx']";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find Private Access element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By spanTagParkingPrivateAccessEditSite(String replacementText) {
		String text=
				".//section[@class='siteDetailsPage_management']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[2]/span/span/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find Electric Charger element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By spanTagParkingElectricChargerEditSite(String replacementText) {
		String text=
				".//section[@class='siteDetailsPage_management']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[3]/span/span/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find Reduced Mobility Access element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By spanTagParkingReducedMobAccessEditSite(String replacementText) {
		String text=
				".//section[@class='siteDetailsPage_management']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[4]/span/span/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find Open 24/7 element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By spanTagParkingOpenAllTimeEditSite(String replacementText) {
		String text=
				".//section[@class='siteDetailsPage_management']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[5]/span/span/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find Good connectivity element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By spanTagParkingGoodConnectivityEditSite(String replacementText) {
		String text=
				".//section[@class='siteDetailsPage_management']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[6]/span/span/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}	
	/**
	 * This locator will find Edit element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	public final By buttonTagEditParkingEditSite(String replacementText) {
		String text=".//section[@class='siteDetailsPage_management']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[7]/button";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	
	
}
