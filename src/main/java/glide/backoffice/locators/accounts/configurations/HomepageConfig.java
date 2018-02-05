package glide.backoffice.locators.accounts.configurations;

import org.openqa.selenium.By;

public class HomepageConfig {
	/**
	 * This will find Add a Configuration button element in configuration in  Account-->Configuration-->Homepage
	 */
	public final By aTagAddConfigHomepageConfig= By.xpath(".//div[@class='pageManagementHeader_actionButton']/a");
	
	/**
	 * This will find Configuration Name in configuration table in  Account-->Configuration-->Homepage
	 */
	public final By spanTagConfigNameHomepageConfig(String configName) {
		String text=".//div[@class='configurationPage_list']//table/tbody/tr/td[1]/span/span[text()='xxxx']";
		return By.xpath(text.replace("xxxx", configName));

		
	}
			
	/**
	 * This will find Vat Percentage element in configuration table in  Account-->Configuration-->Homepage
	 */
	public final By spanTagVatPercentageHomepageConfig(String configName) {
		
		String text=(".//div[@class='configurationPage_list']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[2]/span/span");
			return By.xpath(text.replace("xxxx", configName));
	}
	
	/**
	 * This will find Vat Number element in configuration table in  Account-->Configuration-->Homepage
	 */
	public final By spanTagVatNumberHomepageConfig(String configName) {
		
		String text=(".//div[@class='configurationPage_list']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[3]/span/span");
			return By.xpath(text.replace("xxxx", configName));
	}
	/**
	 * This will find Edit Button  element in configuration table in  Account-->Configuration-->Homepage
	 */
	public final By buttonTagEditHomepageConfig(String configName) {
		
		String text=(".//div[@class='configurationPage_list']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[4]/button");
			return By.xpath(text.replace("xxxx", configName));
	}
	
	
	
}
