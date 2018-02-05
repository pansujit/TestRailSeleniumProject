package glide.backoffice.locators.accounts.configurations;

import org.openqa.selenium.By;

public class EditConfig {
	/**
	 * This will find Configuration name  element in configuration in  Account-->Configuration-->Edit
	 */
	public final By inputTagConfigurationNameEditConfig= By.xpath(".//input[@id='name']");
	
	/**
	 * This will find Vat Number element in configuration in  Account-->Configuration-->Edit
	 */
	public final By inputTagVatNumberEditConfig= By.xpath(".//input[@id='vatCode']");
	
	/**
	 * This will find Vat Rate element in configuration in  Account-->Configuration-->Edit
	 */
	public final By inputTagVatRateEditConfig= By.xpath(".//input[@id='vatRate']");
	
	/**
	 * This will find Hotline element in configuration in  Account-->Configuration-->Edit
	 */
	public final By selectTagHotlineEditConfig= By.xpath(".//select[@id='hotlinesSelect']");
	
	/**
	 * This will find parent Configuration element in configuration in  Account-->Configuration-->Edit
	 */
	public final By selectTagParentConfigEditConfig= By.xpath(".//select[@id='parentConfigurationSelect']");
	
	/**
	 * This will find Allow Group radio Button element in configuration in  Account-->Configuration-->Edit
	 */
	public final By labelTagAllowGroupEditConfig= By.xpath(".//input[@id='allowsGroups_option_true']/../label");
	
	/**
	 * This will find Disallow Group Radio Button element in configuration in  Account-->Configuration-->Edit
	 */
	public final By labelTagDisallowGroupEditConfig= By.xpath(".//input[@id='allowsGroups_option_false']/../label");
	
	/**
	 * This will find Save Button element in configuration in  Account-->Configuration-->Edit
	 */
	public final By buttonTagSaveEditConfig= By.xpath(".//div[@class='configurationForm_actions']/button");
	
	/**
	 * This will find Cancel Button element in configuration in  Account-->Configuration-->Edit
	 */
	public final By aTagCancelEditConfig= By.xpath(".//div[@class='configurationForm_actions']/a");
	
	
	
	

}
