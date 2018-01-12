package glide.backoffice.locators.accounts.sitesandparkings;

import org.openqa.selenium.By;

public class EditSite {
	/**
	 * This locator will find Add parking element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By aTagAddParkingEditSite= By.xpath(".//div[@class='pageManagementHeader_actionButton']/a");
	
	/**
	 * This locator will find Name of sites element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By inputTagNameEditSite= By.xpath(".//input[@id='name']");
	
	/**
	 * This locator will find element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	//final public By TagEditSite= By.xpath("");
	
	/**
	 * This locator will find Time zone element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By selectTagTimeZoneEditSite= By.xpath(".//select[@id='zoneId']");
	
	/**
	 * This locator will find minimum time unit of booking element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By inputTagMinTimeUnitOfBookingEditSite= By.xpath(".//input[@id='timeUnitOfBooking']");
	
	/**
	 * This locator will find Save button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By buttonTagSaveEditSite= By.xpath(".//button[@class='ekButton siteForm_actionsButton']");
	
	/**
	 * This locator will find Cancel button element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By aTagCancelEditSite= By.xpath(".//div[@class='siteForm_actions']/a");
	
	
	/**
	 * This locator will find Parking name element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By spanTagPaekingNameEditSite(String replacementText) {
		String text=".//*/table/tbody/tr/td[1]/span/span[contains(text(),'xxxx')]";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find Private Access element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By spanTagPrivateAccessEditSite(String replacementText) {
		String text=".//*/table/tbody/tr/td[1]/span/span[contains(text(),'xxxx')]/../../../td[2]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find Electric Charger element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By aTagElectricChargerEditSite(String replacementText) {
		String text=".//*/table/tbody/tr/td[1]/span/span[contains(text(),'xxxx')]/../../../td[3]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find Reduced Mobility Access element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By spanTagReducedMobAccessEditSite(String replacementText) {
		String text=".//*/table/tbody/tr/td[1]/span/span[contains(text(),'xxxx')]/../../../td[4]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find Open 24/7 element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By spanTagOpenAllTimeEditSite(String replacementText) {
		String text=".//*/table/tbody/tr/td[1]/span/span[contains(text(),'xxxx')]/../../../td[5]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find Good connectivity element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By spanTagEditGoodConnectivityEditSite(String replacementText) {
		String text=".//*/table/tbody/tr/td[1]/span/span[contains(text(),'xxxx')]/../../../td[6]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}	
	/**
	 * This locator will find Edit element in Edit sites in Account-->Sites and parkings-->Edit
	 */
	final public By ButtonTagEditParkingEditSite(String replacementText) {
		String text=".//*/table/tbody/tr/td[1]/span/span[contains(text(),'xxxx')]/../../../td[7]/button";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	
	
}
