package glide.backoffice.locators.accounts.sitesandparkings;

import org.openqa.selenium.By;

public class ErrorAddSite {

	/**
	 * This locator will find Error Message element in Name of sites  in Add sites in Account-->Sites and parkings-->AddSite
	 */
	public final By inputTagNameErrorAddSite= By.xpath(".//input[@id='name']/../../../div/span/span");
	
	/**
	 * This locator will find Error Message element in Address in Add sites in Account-->Sites and parkings-->AddSite
	 */
	public final By inputTagAddressErrorAddSite= By.xpath(".//div[@class='geosuggest siteForm_AddressAutocomplete']/../div[2]/span/span");
	
	/**
	 * This locator will find Error Message element in Time zone  in Edit sites in Account-->Sites and parkings-->AddSite
	 */
	public final By selectTagTimeZoneErrorAddSite= By.xpath(".//select[@id='zoneId']/../../div/span/span");
	
	/**
	 * This locator will find Error Message element in Company in Add sites in Account-->Sites and parkings-->Add new Site
	 */
	public final By selectTagCompanyErrorAddSite= By.xpath(".//select[@id='subCompanyId']/../../div/span/span");

	
}
