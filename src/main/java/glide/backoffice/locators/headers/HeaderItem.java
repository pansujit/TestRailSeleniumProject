package glide.backoffice.locators.headers;

import org.openqa.selenium.By;

public class HeaderItem {
	
	/**
	 * Locator for Big Search Box Tag in header  in back office
	 */
	public final By inputTagBigSearchBoxHeaderItem= By.xpath(".//input[@class='false header-searchInput']");
	
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
	

}
