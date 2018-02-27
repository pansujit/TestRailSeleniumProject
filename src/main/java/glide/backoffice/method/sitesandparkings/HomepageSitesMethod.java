package glide.backoffice.method.sitesandparkings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.accounts.sitesandparkings.AddSite;
import glide.backoffice.locators.accounts.sitesandparkings.HomepageSites;
import glide.backoffice.method.common.Config;
import glide.backoffice.utility.SeleniumUtility;
/**
 * This class contains all the method for the site and parking homepage page
 * @author sujitpandey
 * @created on Feb 22, 2018 4:30:09 PM
 */
public class HomepageSitesMethod {
	WebDriver driver;
	HomepageSites homepageSites; 
	AddSite addSite;
	// constructor for the homepage of the sites
	public HomepageSitesMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageSites=PageFactory.initElements(driver, HomepageSites.class);
		this.addSite=PageFactory.initElements(driver, AddSite.class);
	}
	/**
	 * This method Click on "add a site" button on a Sites and parking homepage in back office
	 */
	void clickOnAddSiteButton() {
		SeleniumUtility.clickOnElement(driver, homepageSites.aTagAddSiteHomepageSites);
		SeleniumUtility.waitElementToBeVisible(driver, addSite.buttonTagSaveEditSite);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method click on The Edit site button and wait until the save button in the add site is displayed in back office.
	 */
	void clickOnEditSiteButton() {
		SeleniumUtility.clickOnElement(driver, homepageSites.buttonTagEditSiteHomepageSites(Config.getProperty("EDIT_SITE_NAME")));
		SeleniumUtility.waitElementToBeVisible(driver, addSite.buttonTagSaveEditSite);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method wait until the Add a site button is displayed in back office.
	 */
	void waitToAddASiteVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, homepageSites.aTagAddSiteHomepageSites);
		SeleniumUtility.fixedWait(1);
	}

}
