package glide.backoffice.locators.accounts.supercompanies;

import org.openqa.selenium.By;

public class HomepageSC {

	/**
	 * This locators finds add super company element in the super company homepage
	 */
	public final By aTagAddSuperCompanyHomepageSC= By.xpath(".//div[@class='pageManagementHeader_actionButton']/a");
	/**
	 * This locators finds whole table element in the super company homepage
	 */
	public final By tableTagTableSuperCompanyHomepageSC= By.xpath(".//table[@class='tableView']");
	/**
	 * This locators finds view of a super company element in the super company homepage
	 */
	public final By buttonTagViewSuperCompanyHomepageSC(String replacementText) {
		String text= ".//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../..//td/button";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locators finds company name element in the super company homepage
	 */
	public final By spanTagCompanyNameHomepageSC(String replacementText) {
		String text= ".//table/tbody/tr/td[1]/span/span[text()='xxxx']";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	/**
	 * This locators finds email element in the supercompanies--> homepage
	 */
	public final By spanTagCompanyEmailHomepageSC(String replacementText) {
		String text= ".//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[2]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locators finds company Phone element in the supercompanies--> homepage
	 */
	public final By spanTagCompanyPhoneHomepageSC(String replacementText) {
		String text= ".//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[3]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locators finds company Tax Number element in the supercompanies--> homepage
	 */
	public final By spanTagCompanyTaxNumberHomepageSC(String replacementText) {
		String text= ".//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[4]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locators finds company Vat Number element in the supercompanies--> homepage
	 */
	public final By spanTagCompanyVatNumberHomepageSC(String replacementText) {
		String text= ".//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[5]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}

	/**
	 * This locators finds Super company header name element in the super company homepage
	 */
	public final By spanTagHeaderSCNameHomepageSC= By.xpath(".//table/thead/tr/th[1]/span/span/span");
	/**
	 * This locators finds super company header email element in the super company homepage
	 */
	public final By spanTagHeaderSCEmailHomepageSC= By.xpath(".//table/thead/tr/th[2]/span/span/span");
	/**
	 * This locators finds super company header phone numbers element in the super company homepage
	 */
	public final By spanTagHeaderSCPhoneNoHomepageSC= By.xpath(".//table/thead/tr/th[3]/span/span/span");
	/**
	 * This locators finds super company header tax number element in the super company homepage
	 */
	public final By spanTagHeaderSCTaxNumberHomepageSC= By.xpath(".//table/thead/tr/th[4]/span/span/span");
	/**
	 * This locators finds super company header vat number element in the super company homepage
	 */
	public final By spanTagHeaderSCVatNumberHomepageSC= By.xpath(".//table/thead/tr/th[5]/span/span/span");
	/**
	 * This locators finds super company header Action element in the super company homepage
	 */
	public final By buttonTagHeaderSCActionHomepageSC= By.xpath(".//table/thead/tr/th[6]/span/span/span");



}
