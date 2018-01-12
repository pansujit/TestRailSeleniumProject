package glide.backoffice.locators.accounts.supercompanies;

import org.openqa.selenium.By;

public class AddSCError {
	/**
	 * This will finds super company name input element error in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagNameErrorAddSC= By.xpath(".//*[@class='boxedInput_inputText']/input[@id='name']/../../../div/span/span");
	
	/**
	 * This will finds super company Address input element error in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagAddressErrorAddSC= 
			By.xpath(".//*[@class='geosuggest companyForm_AddressAutocomplete']/input/../../div[@class='fieldErrorMsg fieldErrorMsg--companyForm']/span/span");
	
	/**
	 * This will finds super company email input error element in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagEmailErrorAddSC= By.xpath(".//input[@id='email']/../../../div/span/span");
	
	/**
	 * This will finds super company Phone number error input element in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagPhoneNoErrorAddSC= 
			By.xpath(".//input[@id='phoneNumber']/../../../../div[@class='fieldErrorMsg fieldErrorMsg--companyForm']/span/span");
	
	/**
	 * This will finds super company Tax Number input error element in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagTaxNumberErrorAddSC= By.xpath(".//input[@id='sirenNumber']/../../../div/span/span");
	
	/**
	 * This will finds super company Capital input error element in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagCapitalErrorAddSC= By.xpath(".//input[@id='legalForm']/../../../div/span/span");
	/**
	 * This will finds super company Terms of Use URL input error element in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagTOUUrlErrorAddSC= By.xpath(".//input[@id='termsOfUseUrl']/../../../div/span/span");
	
	/**
	 * This will finds super company Subscription URL input error element in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagSubscriptionUrlErrorAddSC= By.xpath(".//input[@id='termsOfSubscriptionUrl']/../../../div/span/span");
	
	/**
	 * This will finds super company Time allowing to lock or unlock the vehicle after the trip is finished (min) 
	 * input  error element in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagAllowLockUnlockErrorAddSC=
			By.xpath(".//input[@id='durationAfterTripToAllowLockUnlock']/../../../div/span/span");
	
	/**
	 * This will finds super company Invoice Number Suffix input error element in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagInvoiceNumberSuffixErrorAddSC= By.xpath(".//input[@id='invoiceLabel']/../../../div/span/span");
	
	/**
	 * This will finds super company Super-Company legal form input error element in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagLagalFormErrorAddSC= By.xpath(".//input[@id='legalForm']/../../../div/span/span");
	
	
	/**
	 * This will finds super company Email styling input error element in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagEmailStylingErrorAddSC= 
			By.xpath(".//div[@class='boxedSelectBlockInner boxedSelectBlock_templateGroup']/div/span/span");
	
	
	/**
	 * This will finds super company Applied configuration input error element in add super company in Account-->super companies-->Add a SC
	 */
	public final  By spanTagAppliedConfigurationErrorAddSC= 
			By.xpath(".//div[@class='fieldErrorMsg fieldErrorMsg--companyForm' and contains(@data-reactid,'companyForm_parent_configuration')]/span/span");
	
	


}
