package glide.backoffice.locators.accounts.supercompanies;

import org.openqa.selenium.By;

public class AddSC {
	/**
	 * This will finds super company name element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagNameAddSC= By.xpath(".//input[@id='name']");
	
	/**
	 * This will finds super company Address input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagAddressAddSC= 
			By.xpath(".//*[@class='geosuggest companyForm_AddressAutocomplete']/input");
	
	/**
	 * This will finds super company email input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagEmailAddSC= By.xpath(".//input[@id='email']");
	
	/**
	 * This will finds super company Phone number input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagPhoneNoAddSC= 
			By.xpath(".//input[@id='phoneNumber']");
	
	/**
	 * This will finds super company Tax Number input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagTaxNumberAddSC= By.xpath(".//input[@id='sirenNumber']");
	
	/**
	 * This will finds super company Capital input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagCapitalAddSC= By.xpath(".//input[@id='legalForm']");
	/**
	 * This will finds super company Terms of Use URL input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagTOUUrlAddSC= By.xpath(".//input[@id='termsOfUseUrl']");
	
	/**
	 * This will finds super company Subscription URL input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagSubscriptionUrlAddSC= By.xpath(".//input[@id='termsOfSubscriptionUrl']");
	
	
	/**
	 * This will finds super company Time allowing to lock or unlock the vehicle after the trip is finished (min) 
	 * input  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagAllowLockUnlockAddSC=
			By.xpath(".//input[@id='durationAfterTripToAllowLockUnlock']");
	
	/**
	 * This will finds super company Invoice Number Suffix input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagInvoiceNumberSuffixAddSC= By.xpath(".//input[@id='invoiceLabel']");
	
	/**
	 * This will finds super company Super-Company legal form input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagLegalFormAddSC= By.xpath(".//input[@id='legalForm' and @name='legalForm']");
	
	
	/**
	 * This will finds super company Email styling input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By selectTagEmailStylingAddSC= 
			By.xpath(".//div[@class='boxedSelectBlock']//select[@name='templateGroup']");
	
	
	/**
	 * This will finds super company Applied configuration input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By selectTagAppliedConfigurationAddSC= 
			By.xpath(".//select[@id='configurationId']");
	
	/**
	 * This will finds super company Save button  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By buttonTagSaveButtonAddSC=By.xpath(".//button[@class='ekButton companyForm_actionsButton']");
	
	/**
	 * This will finds super company Cancel Button element in add super company in Account-->super companies-->Add a SC
	 */
	public final By aTagCancelButtonAddSC=By.xpath(".//a[@class='companyForm_actionsLink']");
	

}
