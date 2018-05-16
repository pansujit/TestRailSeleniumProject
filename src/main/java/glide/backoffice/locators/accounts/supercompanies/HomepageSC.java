package glide.backoffice.locators.accounts.supercompanies;

import org.openqa.selenium.By;

public class HomepageSC {

	/**
	 * This locators finds add super company element in the super company homepage
	 */
	public final By buttonTagAddSuperCompanyHomepageSC= By.xpath(".//button[@id='companies_add_company_button']");
	

	
	
	
/**
	 * This locators finds company name element in the supercompanies --> homepage
	 */
	public final By divTagCompanyNameHomepageSC(String replacementText) {
		String text= ".//div[starts-with(@id,'companies_list_row_')]/div[1 and text()='xxxx']";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	/**
	 * This locators finds email element in the supercompanies--> homepage
	 */
	public final By divTagCompanyEmailHomepageSC(String replacementText) {
		String text= ".//div[starts-with(@id,'companies_list_row_')]/div[1 and text()='xxxx']/../div[2]";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locators finds company Phone element in the supercompanies--> homepage
	 */
	public final By divTagCompanyPhoneHomepageSC(String replacementText) {
		String text= ".//div[starts-with(@id,'companies_list_row_')]/div[1 and text()='xxxx']/../div[3]";
		return By.xpath(text.replace("xxxx", replacementText));
	}


	
	/**
	 * This locators finds super company name  header element in the super companies --> homepage
	 */
	public final By divTagHeaderSCNameHomepageSC= By.xpath(".//div[@class='cursorPointer advancedList_header_sortIcon']");
	/**
	 * This locators finds super company header email element in the super companies --> homepage
	 */
	public final By spanTagHeaderSCEmailHomepageSC= By.xpath(".//*[@class='advancedList_header row']/div[2]/div/span/span");
	/**
	 * This locators finds super company header phone numbers element in the super companies --> homepage
	 */
	public final By spanTagHeaderSCPhoneNoHomepageSC= By.xpath(".//*[@class='advancedList_header row']/div[3]/div/span/span");




}
