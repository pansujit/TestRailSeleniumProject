package glide.backoffice.locators.accounts.contract;

import org.openqa.selenium.By;

public class ContractHomepage {
	/**
	 * This locator will find Account name element in Account-->Contract--> Homepage
	 */
	public final By inputTagNameContractHomepage= By.xpath(".//input[@id='contractForm_name']");
	
	/**
	 * This locator will find Reference element in Account-->Contract--> Homepage
	 */
	public final By inputTagReferenceContractHomepage= By.xpath(".//input[@id='contractForm_reference']");
	
	/**
	 * This locator will find Business Car Sharing element in Account-->Contract--> Homepage
	 */
	public final By inputTagBusineeCarSharingContractHomepage= 
			By.xpath(".//dl[@class='contractForm_definitionList']/dd/div[1]/div[1]/div/div/label/span");
	
	/**
	 * This locator will find Private Car Sharing element in Account-->Contract--> Homepage
	 */
	public final By spanTagPrivateCarSharingContractHomepage= 
			By.xpath(".//dl[@class='contractForm_definitionList']/dd/div[2]/div[1]/div/div/label/span");
	
	/**
	 * This locator will find Ride Sharing element in Account-->Contract--> Homepage
	 */
	public final By spanTagRideSharingContractHomepage= 
			By.xpath(".//dl[@class='contractForm_definitionList']/dd/div[3]/div[1]/div/div/label/span");
	
	/**
	 * This locator will find SHUTTLE checkbox element in Account-->Contract--> Homepage
	 */
	public final By spanTagShuttleContractHomepage= 
			By.xpath(".//dl[@class='contractForm_definitionList']/dd/div[4]/div[1]/div/div/label/span");
	
	/**
	 * This locator will find Save Button element in Account-->Contract--> Homepage
	 */
	public final By buttonTagSaveContractHomepage= By.xpath(".//button[@class='ekButton contractForm_actionsButton']");
	
	/**
	 * This locator will find Account name error element in Account-->Contract--> Homepage
	 */
	public final By spanTagNameErrorContractHomepage= 
			By.xpath(".//div[@class='fieldErrorMsg fieldErrorMsg--contractForm' and contains(@data-reactid,'contractForm_name')]/span/span");
	
	/**
	 * This locator will find Reference error element in Account-->Contract--> Homepage
	 */
	public final By spanTagTeferenceContractHomepage= 
			By.xpath(".//div[@class='fieldErrorMsg fieldErrorMsg--contractForm' and contains(@data-reactid,'contractForm_reference')]/span/span");
	
	
	
	
	
	
	
}
