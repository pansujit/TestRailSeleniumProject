package glide.backoffice.locators.companies;

import org.openqa.selenium.By;

public class EditCompany {
	
	/**
	 * This will find Name element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By inputTagNameEditCompany= By.xpath(".//input[@id='name']");
	
	/**
	 * This will find Company Address element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By inputTagAddressEditCompany= By.xpath(".//div[@class='geosuggest subCompanyForm_AddressAutocomplete']/input");
	
	/**
	 * This will find Email element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By inputTagEmailEditCompany= By.xpath(".//input[@id='email']");
	
	/**
	 * This will find Country Code element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By selectTagCountryCodeEditCompany= By.xpath(".//select[@id='mobilePhonePrefix']");
	
	/**
	 * This will find Phone number element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By inputTagPhoneNumberEditCompany= By.xpath(".//input[@id='phoneNumber' and @name='phoneNumber']");
	
	/**
	 * This will find Tax Number element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By inputTagTaxNumberEditCompany= By.xpath(".//input[@id='sirenNumber']");
	
	/**
	 * This will find Capital element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By inputTagCapitalEditCompany= By.xpath(".//*[@id='legalForm' and @name='capital']");
	
	/**
	 * This will find Logo(URL) element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By inputTagLogoURLEditCompany= By.xpath(".//input[@id='termsOfUseUrl']");
	
	/**
	 * This will find Company legal form element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By inputTagCompanyLegalFormEditCompany= By.xpath(".//*[@id='legalForm' and @name='legalForm']");
	
	/**
	 * This will find Agence Code element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By inputTagAgenceCodeEditCompany= By.xpath(".//input[@id='agencyCode']");
	
	/**
	 * This will find Applied configuration element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By selectTagAppliedConfigEditCompany= By.xpath(".//select[@id='configurationId']");
	
	/**
	 * This will find Save element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By buttonTagSaveEditCompany= By.xpath(".//div[@class='subCompanyForm_actions']/button");
	
	/**
	 * This will find Cancel element in company Edit in  Account-->Companies-->View-->Edit
	 */
	public final By aTagCancelEditCompany= By.xpath(".//div[@class='subCompanyForm_actions']/a");
	
	
	
}
