package glide.backoffice.locators.accounts.sitesandparkings;

import org.openqa.selenium.By;

public class HomepageSites {

	/**
	 * This locator will find  Add a site element in homepage in Account-->Sites and parkings--> Homepage
	 */
	public final  By aTagAddSiteHomepageSites= By.xpath(".//div[@class='pageManagementHeader_actionButton']/a");
	/**
	 * This locator will find Site name element in homepage in Account-->Sites and parkings--> Homepage
	 */
	public final  By spanTagSiteNameHomepageSites(String replacementText) {
		String text=".//table/tbody/tr/td[1]/span/span[contains(text(),'xxxx')]";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find site address element in homepage in Account-->Sites and parkings--> Homepage
	 */
	public final  By spanTagSiteAddressHomepageSites(String replacementText) {
		String text=".//table/tbody/tr/td[1]/span/span[contains(text(),'xxxx')]/../../../td[2]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}	
	/**
	 * This locator will find company name element in homepage in Account-->Sites and parkings--> Homepage
	 */
	public final  By spanTagCompanyNameHomepageSites(String replacementText) {
		String text=".//table/tbody/tr/td[1]/span/span[contains(text(),'xxxx')]/../../../td[2]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}	
	/**
	 * This locator will find Edit button element in homepage in Account-->Sites and parkings--> Homepage
	 */
	public final  By buttonTagEditSiteHomepageSites(String replacementText) {
		String text=".//table/tbody/tr/td[1]/span/span[contains(text(),'xxxx')]/../../../td[4]/button";
		return By.xpath(text.replace("xxxx", replacementText));
	}	

}
