package glide.backoffice.locators.companies;

import org.openqa.selenium.By;

public class AddCompanyErrors {
	
	/**
	 * This will find Name Error Error element in company Add in  Account-->Companies-->Add a company
	 */
	public final By inputTagNameAddCompanyErrors= By.xpath(".//input[@id='name']/../../../div/span/span");
	
	/**
	 * This will find Company Address Error element in company Add in  Account-->Companies-->Add a company
	 */
	public final By inputTagAddressAddCompanyErrors= 
			By.xpath(".//div[@class='geosuggest subCompanyForm_AddressAutocomplete']/input/../../../div/span/span");
	
	/**
	 * This will find Email Error element in company Add in  Account-->Companies-->Add a company
	 */
	public final By inputTagEmailAddCompanyErrors= By.xpath(".//input[@id='email']/../../../div/span/span");
	
	/**
	 * This will find Phone number Error element in company Add in  Account-->Companies-->Add a company
	 */
	public final By inputTagPhoneNumberAddCompanyErrors= 
			By.xpath(".//input[@id='phoneNumber' and @name='phoneNumber']/../../../../div[2]/span/span");
	
	/**
	 * This will find Tax Number Error element in company Add in  Account-->Companies-->Add a company
	 */
	public final By inputTagTaxNumberAddCompanyErrors= By.xpath(".//input[@id='sirenNumber']/../../../div/span/span");
	
	/**
	 * This will find Capital Error element in company Add in  Account-->Companies-->Add a company
	 */
	public final By inputTagCapitalAddCompanyErrors= 
			By.xpath(".//*[@id='legalForm' and @name='capital']/../../../div/span/span");
	
	/**
	 * This will find Logo(URL) Error element in company Add in  Account-->Companies-->Add a company
	 */
	public final By inputTagLogoURLAddCompanyErrors= By.xpath(".//input[@id='termsOfUseUrl']/../../../div/span/span");
	
	/**
	 * This will find Company legal form Error element in company Add in  Account-->Companies-->Add a company
	 */
	public final By inputTagCompanyLegalFormAddCompanyErrors= 
			By.xpath(".//*[@id='legalForm' and @name='legalForm']/../../../div/span/span");
	
	/**
	 * This will find Agence Code Error element in company Add in  Account-->Companies-->Add a company
	 */
	public final By inputTagAgenceCodeAddCompanyErrors= By.xpath(".//input[@id='agencyCode']/../../../div/span/span");
	
	/**
	 * This will find Applied configuration Error element in company Add in  Account-->Companies-->Add a company
	 */
	public final By selectTagAppliedConfigAddCompanyErrors= 
			By.xpath(".//select[@id='configurationId']/../../../div/span/span");
	
	/**
	 * This will find Save  element in company Add in  Account-->Companies-->Add a company
	 */
	public final By buttonTagSaveAddCompanyErrors= By.xpath(".//div[@class='subCompanyForm_actions']/button");
	
	/**
	 * This will find Cancel  element in company Add in  Account-->Companies-->Add a company
	 */
	public final By aTagCancelAddCompanyErrors= By.xpath(".//div[@class='subCompanyForm_actions']/a");
	
	

}
