package glide.backoffice.locators.accounts.contract;

import org.openqa.selenium.By;

public class HomepageContract {
	/**
	 * This locator will find Account name element in Account-->Contract--> Homepage
	 */
	public final By inputTagNameHomepageContract= By.xpath(".//input[@id='contractForm_name']");
	
	/**
	 * This locator will find Reference element in Account-->Contract--> Homepage
	 */
	public final By inputTagReferenceHomepageContract= By.xpath(".//input[@id='contractForm_reference']");
	
	/**
	 * This locator will find Business Car Sharing element in Account-->Contract--> Homepage
	 */
	public final By idivTagBusineeCarSharingHomepageContract= 
			By.xpath(".//form[@class='contractForm']//dd[@class='contractForm_definitionList_definition']/div[1]");
	
	/**
	 * This locator will find Private Car Sharing element in Account-->Contract--> Homepage
	 */
	public final By divTagPrivateCarSharingHomepageContract= 
			By.xpath(".//form[@class='contractForm']//dd[@class='contractForm_definitionList_definition']/div[2]");
	
	/**
	 * This locator will find Ride Sharing element in Account-->Contract--> Homepage
	 */
	public final By divTagRideSharingHomepageContract= 
			By.xpath(".//form[@class='contractForm']//dd[@class='contractForm_definitionList_definition']/div[3]");
	
	/**
	 * This locator will find SHUTTLE checkbox element in Account-->Contract--> Homepage
	 */
	public final By divTagShuttleHomepageContract= 
			By.xpath(".//form[@class='contractForm']//dd[@class='contractForm_definitionList_definition']/div[1]");
	
	/**
	 * This locator will find Save Button element in Account-->Contract--> Homepage
	 */
	public final By buttonTagSaveHomepageContract= By.xpath(".//button[@class='ekButton contractForm_actionsButton']");
	
	/**
	 * This locator will find Account name error element in Account-->Contract--> Homepage
	 */
	public final By spanTagNameErrorHomepageContract= 
			By.xpath(".//div[@class='fieldErrorMsg fieldErrorMsg--contractForm' and contains(@data-reactid,'contractForm_name')]/span/span");
	
	/**
	 * This locator will find Reference error element in Account-->Contract--> Homepage
	 */
	public final By spanTagReferenceErrorHomepageContract= 
			By.xpath(".//div[@class='fieldErrorMsg fieldErrorMsg--contractForm' and contains(@data-reactid,'contractForm_reference')]/span/span");
	
	
	
	
	
	
	
}
