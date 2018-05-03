package glide.backoffice.locators.users.smartcards;

import org.openqa.selenium.By;

public class SmartcardDetailPage {
	/**
	 * This locator will Find Remove button Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By buttonTagRemoveSmartcardDetailPage= By.xpath(".//button[@class='smartcardsDetail_flatButton']");
	
	/**
	 * This locator will find Email Address in  Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagEmailSmartcardDetailPage= By.xpath(".//div[@class='smartcardsDetail_user_info']/span[2]");
	
	/**
	 * This locator will find super company name Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagSuperCompanyNameSmartcardDetailPage= By.xpath(".//div[@class='smartcardsDetail_user_info']/span[3]");
	
	/**
	 * This locator will find full name  Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagFullnameSmartcardDetailPage= By.xpath(".//div[@class='smartcardsDetail_user_info']/span[1]");
	/**
	 * This locator will find Status of card in Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagStatusSmartcardDetailPage= By.xpath(".//div[@class='smartcardsDetail_smartcardImage_name']/span/span/span/span");
	/**
	 * This locator will find Card id Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By bTagCardIdSmartcardDetailPage= By.xpath(".//div[@class='smartcardsDetail_smartcardImage_id']/span/b");
	/**
	 * This locator will find Activation Text Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagActivationTextSmartcardDetailPage= By.xpath(".//div[@class='smartcardsDetail_smartcardCard_bottom_row'][1]/span/span/span");
	/**
	 * This locator will find Activation date Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagActivationDateSmartcardDetailPage= By.xpath(".//div[@class='smartcardsDetail_smartcardCard_bottom_row'][1]/span[2]");
	/**
	 * This locator will Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagDeactivationTextSmartcardDetailPage= By.xpath(".//div[@class='smartcardsDetail_smartcardCard_bottom_row'][2]/span/span/span");
	
	/**
	 * This locator will find Deactivation date Element in Smartcard detail in the Users->SmartCard-->Homepage--SmartCard detail
	 */
	public final By spanTagDeactivationDateSmartcardDetailPage= By.xpath(".//div[@class='smartcardsDetail_smartcardCard_bottom_row'][2]/span[2]");
	

	
	
}
