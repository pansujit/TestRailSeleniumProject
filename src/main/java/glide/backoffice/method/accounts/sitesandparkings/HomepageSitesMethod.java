package glide.backoffice.method.accounts.sitesandparkings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

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
	SoftAssert softAssert;
	// constructor for the homepage of the sites
	public HomepageSitesMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageSites=PageFactory.initElements(driver, HomepageSites.class);
		this.addSite=PageFactory.initElements(driver, AddSite.class);
		this.softAssert=new SoftAssert();
	}
	/**
	 * This method Click on "add a site" button on a Sites and parking homepage in back office
	 */
	void clickOnAddSiteButton() {
		SeleniumUtility.clickOnElement(driver, homepageSites.aTagAddSiteHomepageSites);

	}
	/**
	 * This method click on The Edit site button and wait until the save button in the add site is displayed in back office.
	 */
	void clickOnEditSiteButton(String siteName) {
		SeleniumUtility.clickOnElement(driver, homepageSites.buttonTagEditSiteHomepageSites(siteName));

	}
	/**
	 * This method wait until the Add a site button is displayed in back office.
	 */
	void waitToAddASiteIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, homepageSites.aTagAddSiteHomepageSites);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method checks the sitename, company name and site address in site homepage with given parameters
	 * @param siteName - Should be String
	 * @param siteAddress - Should be String
	 */
	void assertAddEditSite(String siteName,String siteAddress) {
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				homepageSites.spanTagSiteAddressHomepageSites(siteName), siteAddress));
		softAssert.assertTrue(!SeleniumUtility.getText(driver, 
				homepageSites.spanTagCompanyNameHomepageSites(siteName)).isEmpty());
		softAssert.assertAll();
	}

}
