package glide.backoffice.locators.common;

import org.openqa.selenium.By;

public class CommonLocators {
	/**
	 * This locator is for to move forward to next page in the table list.
	 */
	public final By buttonTagPaginationNextCommonLocators= 
			By.xpath(".//button[@class='paginationControls_button paginationControls_button--next']");
	
	
	/**
	 * This locators find the loading icon in every page 
	 */
	public final By divTagLoadingIconCommonLocators= By.xpath(".//div[@class='sk-circle']");
	
	
	/**
	 * This locators find the loading icon for the table 
	 */
	public final By divTagLoadingIconTableCommonLocators= By.xpath(".//div[@class='lds-rolling']");
		
	
	
	
}
