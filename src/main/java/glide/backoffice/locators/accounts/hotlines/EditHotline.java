package glide.backoffice.locators.accounts.hotlines;

import org.openqa.selenium.By;

public class EditHotline {
	/**
	 * This locator will find name element in Account-->Hotlines--> Edit
	 */
	public final By inputTagNameEditHotline= By.xpath(".//input[@id='name']");
	/**
	 * This locator will find Name of the customer service element in Account-->Hotlines--> Edit
	 */
	public final By inputTagCustServiceNameEditHotline= By.xpath(".//input[@id='customerServiceName']");
	
	/**
	 * This locator will find customer service email element in Account-->Hotlines--> Edit
	 */
	public final By inputTagCustServiceEmailEditHotline= By.xpath(".//input[@id='customerServiceEmail']");
	
	/**
	 * This locator will find "Email address to be shown" element in Account-->Hotlines--> Edit
	 */
	public final By inputTagNoReplyEmailEditHotline= By.xpath(".//input[@id='noReplyEmail']");
	
	/**
	 * This locator will find "Phone number name" element in Account-->Hotlines--> Edit
	 */
	public final By inputTagPhoneNoNameEditHotline= By.xpath(".//input[@id='phoneNumberName']");
	
	/**
	 * This locator will find "Country code" element in Account-->Hotlines--> Edit
	 */
	public final By selectTagCountryCodeEditHotline= By.xpath(".//select[@id='mobilePhonePrefix']");
	
	/**
	 * This locator will find "Phone number" element in Account-->Hotlines--> Edit
	 */
	public final By inputTagPhoneNumberEditHotline= By.xpath(".//input[@id='phoneNumber']");
	
	/**
	 * This locator will find "Add a Phone number" element in Account-->Hotlines--> Edit
	 */
	public final By buttonTagAddAPhoneNumberEditHotline= By.xpath(".//button[@class='ekButton']");
	
	/**
	 * This locator will find "Save" element in Account-->Hotlines--> Edit
	 */
	public final By buttonTagSaveEditHotline= By.xpath(".//div[@class='hotlineForm_actions']/button");
	
	/**
	 * This locator will find cancel element in Account-->Hotlines--> Edit
	 */
	public final By aTagCancelEditHotline= By.xpath(".//div[@class='hotlineForm_actions']/a");
	
}
