package glide.backoffice.locators.accounts.companies;

import org.openqa.selenium.By;

public class HomepageCompany {
	
	/**
	 * This will find Add a Company element in  Account-->Companies-->Homepage
	 */
	public final By aTagAddCompanyHomepageCompanies= By.xpath(".//div[@class='pageManagementHeader_actionButton']/a");
	
	
	/**
	 * This will find Name element in company table in Account-->Companies-->Homepage
	 */
	public final By spanTagNameHomepageCompanies(String replacementText) {
		
		String text=".//div[@id='mainContainer']//table/tbody/tr/td[1]/span/span[text()='xxxx']";
		return By.xpath(text.replace("xxxx", replacementText));	
	}
	/**
	 * This will find Email element in company table in Account-->Companies-->Homepage
	 */
	public final By spanTagEmailHomepageCompanies(String replacementText) {
		
		String text=".//div[@id='mainContainer']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[2]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));	
	}
	/**
	 * This will find Phone Number element in company table in Account-->Companies-->Homepage
	 */
	public final By spanTagPhoneHomepageCompanies(String replacementText) {
		
		String text=".//div[@id='mainContainer']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[3]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));	
	}
	/**
	 * This will find Tax Number element in company table in Account-->Companies-->Homepage
	 */
	public final By spanTagTaxNumberHomepageCompanies(String replacementText) {
		
		String text=".//div[@id='mainContainer']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[4]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));	
	}
	/**
	 * This will find Vat Code element in company table in Account-->Companies-->Homepage
	 */
	public final By spanTagVatCodeHomepageCompanies(String replacementText) {
		
		String text=".//div[@id='mainContainer']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[5]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));	
	}
	
	/**
	 * This will find Agency Code element in company table in Account-->Companies-->Homepage
	 */
	public final By spanTagAgencyCodeHomepageCompanies(String replacementText) {
		
		String text=".//div[@id='mainContainer']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[6]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));	
	}
	
	/**
	 * This will find View element in company table in Account-->Companies-->Homepage
	 */
	public final By buttonTagViewHomepageCompanies(String replacementText) {
		
		String text=".//div[@id='mainContainer']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[7]/button";
		return By.xpath(text.replace("xxxx", replacementText));	
	}
	

	
	
}
