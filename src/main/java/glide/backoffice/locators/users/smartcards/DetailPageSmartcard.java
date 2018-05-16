package glide.backoffice.locators.users.smartcards;

import org.openqa.selenium.By;

public class DetailPageSmartcard {
	/**
	 * This locator will Find Remove button Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By buttonTagRemoveDetailPageSmartcard= By.xpath(".//button[@class='smartcardsDetail_flatButton']");
	
	/**
	 * This locator will find Email Address in  Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagEmailDetailPageSmartcard= By.xpath(".//div[@class='smartcardsDetail_user_info']/span[2]");
	
	/**
	 * This locator will find super company name Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagSuperCompanyNameDetailPageSmartcard= By.xpath(".//div[@class='smartcardsDetail_user_info']/span[3]");
	
	/**
	 * This locator will find full name  Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagFullnameDetailPageSmartcard= By.xpath(".//div[@class='smartcardsDetail_user_info']/span[1]");
	/**
	 * This locator will find Status of card in Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagStatusDetailPageSmartcard= By.xpath(".//div[@class='smartcardsDetail_smartcardImage_name']/span/span/span/span");
	/**
	 * This locator will find Card id Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By bTagCardIdDetailPageSmartcard= By.xpath(".//div[@class='smartcardsDetail_smartcardImage_id']/span/b");
	/**
	 * This locator will find Activation Text Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagActivationTextDetailPageSmartcard= By.xpath(".//div[@class='smartcardsDetail_smartcardCard_bottom_row'][1]/span/span/span");
	/**
	 * This locator will find Activation date Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagActivationDateDetailPageSmartcard= By.xpath(".//div[@class='smartcardsDetail_smartcardCard_bottom_row'][1]/span[2]");
	/**
	 * This locator will Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagDeactivationTextDetailPageSmartcard= By.xpath(".//div[@class='smartcardsDetail_smartcardCard_bottom_row'][2]/span/span/span");
	
	/**
	 * This locator will find Deactivation date Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagDeactivationDateDetailPageSmartcard= By.xpath(".//div[@class='smartcardsDetail_smartcardCard_bottom_row'][2]/span[2]");
	

	/********************************** REMOVE POP UP*********************************/
	/**
	 * This locator will find Cancel button Element in Smartcard detail popup in the Users->SmartCard-->Homepage--SmartCard detail-->pop up
	 */
	public final By buttonTagCancelPopupDetailPageSmartcard= 
			By.xpath(".//button[@class='smartcardsDetail_flatButton']/../../h3/..//button[@class='smartcardsDetail_flatButton'][1]");
	public final By buttonTagRemovePopupDetailPageSmartcard= 
			By.xpath(".//button[@class='smartcardsDetail_flatButton']/../../h3/..//button[@class='smartcardsDetail_flatButton'][2]");
	
	
	/********************************** Assign User to Smartcard*********************************/
	/**
	 * This locator will find Input field Element in Smartcard detail popup in the Users->SmartCard-->Homepage--SmartCard detail-->pop up
	 */
	public final By inputTagUsernamePopupDetailPageSmartcard= 
			By.xpath(".//input[contains(@id,'-Searchbyfirstnameorlastname-')]");
	
}
