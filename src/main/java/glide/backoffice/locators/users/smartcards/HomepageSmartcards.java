package glide.backoffice.locators.users.smartcards;

import org.openqa.selenium.By;

public class HomepageSmartcards {


	/**
	 * This locator will find Smartcard number element in Smartcard table page in the Users ->SmartCard--> Homepage
	 * @param cardNumber should be String
	 * @return By should be Selenium By
	 */
	public final By spanTagCardNumberHomepageSmartcards(String cardNumber) {
		String text=".//div[starts-with(@id,'smartcards_list_row_')]/div[1]/div/div[2]/span[text()='xxxx']";
		return By.xpath(text.replace("xxxx", cardNumber));
	}
	
	/**
	 * This locator will find Full name element in Smartcard table page in the Users ->SmartCard--> Homepage
	 * @param cardNumber should be String
	 * @return By should be Selenium By
	 */
	public final By spanTagFullnameHomepageSmartcards(String cardNumber) {
		String text=".//div[starts-with(@id,'smartcards_list_row_')]/div[1]/div/div[2]/span[text()='xxxx']/../div/span";
		return By.xpath(text.replace("xxxx", cardNumber));
	}
	
	
	/**
	 * This locator will find Company element in Smartcard table page in the Users ->SmartCard--> Homepage
	 * @param cardNumber should be String
	 * @return By should be Selenium By
	 */
	public final By divTagCompanyNameHomepageSmartcards(String cardNumber) {
		String text=".//div[starts-with(@id,'smartcards_list_row_')]/div[1]/div/div[2]/span[text()='xxxx']/../../../../div[2]";
		return By.xpath(text.replace("xxxx", cardNumber));
	}
	
	/**
	 * This locator will find Refresh button Element in Smart Card homepage in the Users ->SmartCards --> Homepage
	 */
	public final By buttonTagRefreshHomepageSmartcards= By.xpath(".//button[@id='smartcards_list_refresh_button']");




}
