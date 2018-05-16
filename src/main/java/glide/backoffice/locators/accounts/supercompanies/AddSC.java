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
			By.xpath(".//div[@class='geosuggest companyForm_AddressAutocomplete']/input");
	
	/**
	 * This will finds super company email input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagEmailAddSC= By.xpath(".//input[@id='email']");
	
	/**
	 * This will finds super company Phone number input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagPhoneNoAddSC= By.xpath(".//input[@id='phoneNumber' and @name='phoneNumber']");
	
	/**
	 * This will finds super company Tax Number input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagTaxNumberAddSC= By.xpath(".//input[@id='sirenNumber']");
	
	/**
	 * This will finds super company Capital input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagCapitalAddSC= By.xpath(".//input[@id='legalForm' and @name='capital']");
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
	public final By inputTagAllowLockUnlockAddSC=By.xpath(".//input[@id='durationAfterTripToAllowLockUnlock']");
	
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
	public final By selectTagEmailStylingAddSC= By.xpath(".//div[@class='boxedSelectBlock']//select[@name='templateGroup']");
	
	
	/**
	 * This will finds super company Applied configuration input element in add super company in Account-->super companies-->Add a SC
	 */
	public final By selectTagAppliedConfigurationAddSC= By.xpath(".//select[@id='configurationId']");
	
	/**
	 * This will finds super company Save button  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By buttonTagSaveButtonAddSC=By.xpath(".//button[@class='ekButton companyForm_actionsButton']");
	
	/**
	 * This will finds super company Cancel Button element in add super company in Account-->super companies-->Add a SC
	 */
	public final By aTagCancelButtonAddSC=By.xpath(".//a[@class='companyForm_actionsLink']");
	
	
	
	///////************************************* Radio Button and Other inputs *************************************////////////
	/**
	 * This will finds Fleet delegation by RCI Mobility true radio button 
	 * element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagFleetDelegationByRCITrueAddSC=By.xpath(".//input[@id='invoiceDelegate_option_true']/../label");
	/**
	 * This will finds Fleet delegation by RCI Mobility false radio button 
	 * element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagFleetDelegationByRCIFalseAddSC=By.xpath(".//input[@id='invoiceDelegate_option_false']/../label");
	/**
	 * This will finds Identity document required true radio button 
	 * element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagIdentityDocRequiredTrueAddSC=By.xpath(".//input[@id='identityDocumentRequired_option_true']/../label");
	/**
	 * This will finds Identity document required false radio button 
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagIdentityDocRequiredFalseAddSC=By.xpath(".//input[@id='identityDocumentRequired_option_false']/../label");
	/**
	 * This will finds Employer certificate required true radio button
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagEmpCertReqTrueAddSC=By.xpath(".//input[@id='employerCertificateRequired_option_true']/../label");
	/**
	 * This will finds Employer certificate required true radio button
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagEmpCertReqFalseAddSC=By.xpath(".//input[@id='employerCertificateRequired_option_false']/../label");
	/**
	 * This will finds Use external invoice system (RRS) true radio button
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagRRSInvoiceTrueAddSC=By.xpath(".//input[@id='useExternalInvoiceSystem_option_true']/../label");
	
	/**
	 * This will finds Use external invoice system (RRS) false radio button
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagRRSInvoiceFalseAddSC=By.xpath(".//input[@id='useExternalInvoiceSystem_option_false']/../label");
	/**
	 * This will finds Damage report at the start true radio button
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagDamageReportAtStartTrueAddSC=By.xpath(".//input[@id='startBookingDamageReportMandatory_option_true']/../label");
	/**
	 * This will finds Damage report at the start false radio button
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagDamageReportAtStartFalseAddSC=By.xpath(".//input[@id='startBookingDamageReportMandatory_option_false']/../label");
	/**
	 * This will finds Damage report at the end true radio button 
	 * element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagDamageReportAtEndTrueAddSC=By.xpath(".//input[@id='endBookingDamageReportMandatory_option_true']/../label");
	/**
	 * This will finds Damage report at the end true radio button
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagDamageReportAtEndFalseAddSC=By.xpath(".//input[@id='endBookingDamageReportMandatory_option_true']/../label");
	/**
	 * This will finds Charge the estimated price before the booking starts true radio button
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By lableTagPrebillBeforeBookingTrueAddSC=By.xpath(".//input[@id='billBeforeBooking_option_true']/../label");
	/**
	 * This will finds Charge the estimated price before the booking starts false radio button
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagPrebillBeforeBookingFalseAddSC=By.xpath(".//input[@id='billBeforeBooking_option_false']/../label");
	/**
	 * This will finds Offset for charging the estimated price before the booking starts (hours) input
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagChargePriceTimeBeforeBookingAddSC=By.xpath(".//input[@id='preBookingBillingOffset']");
	/**
	 * This will finds Enable safety deposit true radio button
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagSafetyDepositTrueAddSC=By.xpath(".//input[@id='enableSafetyDeposit_option_true']/../label");
	/**
	 * This will finds Enable safety deposit false radio button
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagSafetyDepositFalseAddSC=By.xpath(".//input[@id='enableSafetyDeposit_option_false']/../label");
	/**
	 * This will finds Safety deposit amount (Euros) input field element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagSafetyDepositAmountAddSC=By.xpath(".//input[@id='safetyDepositAmount']");
	/**
	 * This will finds Driving licence required true radio button element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagDrivingLicenseRequiredTrueAddSC=By.xpath(".//input[@id='drivingLicenceRequired_option_true']/../label");
	/**
	 * This will finds Driving licence required true radio element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagDrivingLicenseRequiredFalseAddSC=By.xpath(".//input[@id='drivingLicenceRequired_option_false']/../label");
	/**
	 * This will finds Send Italian driving authorization document true radio button 
	 * element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagItalianDrivingLicenseTrueAddSC=By.xpath(".//input[@id='sendDrivingAuthorisation_option_true']/../label");
	/**
	 * This will finds Send Italian driving authorization document true radio button
	 * element in add super company in Account-->super companies-->Add a SC
	 */
	public final By labelTagItalianDrivingLicenseFalseAddSC=By.xpath(".//input[@id='sendDrivingAuthorisation_option_false']/../label");
	/**
	 * This will finds URL of the PDF to append at the end of the document input field for Italian document
	 *  element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagGenericPdfDocumentUrlItalianAddSC=By.xpath(".//input[@id='safetyDepositAmount' and @name='genericPdfDocumentUrl']");
	
	/**
	 * This will finds Logo URL for Italian document element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagLogoUrlItalianAddSC=By.xpath(".//input[@id='safetyDepositAmount' and @name='logoUrl']");
	
	/**
	 * This will finds Signature image URL for Italian document element in add super company in Account-->super companies-->Add a SC
	 */
	public final By inputTagSignatureImageURLItalianSC=By.xpath(".//input[@id='safetyDepositAmount' and @name='signatureImageUrl']");
	
	
	

}
