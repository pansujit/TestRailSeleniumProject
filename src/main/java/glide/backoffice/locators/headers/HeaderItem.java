package glide.backoffice.locators.headers;

import org.openqa.selenium.By;

public class HeaderItem {
	
	/**
	 * Locator for Big Search Box Tag in header  in back office
	 */
	public final By inputTagBigSearchBoxHeaderItem= By.xpath(".//*[@class='header-searchInput-searchIcon']/../input");
	
	/**
	 * Locator for Super Companies Tag in header in back office
	 */
	public final By buttonTagSuperCompaniesHeaderItem= 
			By.xpath(".//div[@class='header-actionIcons-companyName header-superCompanyAutoComplete-button']/button");
	
	/**
	 * Locator for Companies Tag in header in back office
	 */
	public final By buttonTagCompaniesHeaderItem= By.xpath(".//div[@class='header-companyAutoComplete-button']/button");
	
	/**
	 * Locator for Language Tag in header in back office
	 */
	public final By buttonTagLanguageHeaderItem= By.xpath(".//div[@class='header-actionIcons-icon']/div/button");
	
	/**
	 * Locator for User Info Tag in header in back office
	 */
	public final By aTagUserInfoHeaderItem= By.xpath(".//div[@class='header-actionIcons-icon header-actionIcons-accountIcon']");
	
	//****************** Super Company Input *****************/
	
	
	/**
	 * Locator for Input Tag for super companies in header in back office
	 */
	public final By inputTagSuperCompaniesHeaderItem= By.xpath(".//div[@class='header-superCompanyAutoCompleteWrap']//input");
	
	//****************** Company Input *****************/
	
	/**
	 * Locator for Input Tag for super companies in header in back office
	 */
	public final By inputTagCompaniesHeaderItem= By.xpath(".//div[@class='header-superCompanyAutoCompleteWrap']/div[1]//input");
	
	//****************** Super Company dropdown *****************/
	
	//****************** Super Company popup text *****************/
	/**
	 * Locator for Input Tag for super companies in header in back office
	 */
	public final By divTagSuperCompanyPopupHeaderItem= By.xpath(".//div[@class='header-actionIcons-tooltipWrap']");
	
	/***********************Locators inside super company search box**************************/
	/**
	 * Locator for checkbox Tag to select all super companies in header
	 */
	public final By buttonTagSelectAllSCHeaderItem= 
			By.xpath(".//*[@id='mainContainer']/div/div[1]/header/div[4]/div[1]/div/div[1]/div/div/div[1]/button[2]/div");
			
			/**
	 * Locator for cancel Tag to cancel all super companies in header
	 */
	public final By buttonTagCancelSCHeaderItem= 
			By.xpath(".//div[@class='header-superCompanyEditing header-superCompanyEditing-edit']//div[@class='header-superCompanyAutoCompleteWrap']/button[1]");
	
	
	/**
	 * Locator for cancel Tag to cancel all super companies in header
	 */
	public final By buttonTagSelectAllTextSCHeaderItem= 
			By.xpath(".//div[@class='header-superCompanyEditing header-superCompanyEditing-edit']"
					+ "//div[@class='header-superCompanyAutoCompleteWrap']/button[2]//span/span/span");
	
	
}
