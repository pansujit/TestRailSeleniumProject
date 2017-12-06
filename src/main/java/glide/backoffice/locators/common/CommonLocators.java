package glide.backoffice.locators.common;

import org.openqa.selenium.By;
/**
 * This page contains all the common locators which are found in the back office. This locators are common to two or more pages
 * @author sujitpandey
 *
 */
public class CommonLocators {


	/**
	 * This locators will find the super company tag in the back office
	 */
	final public By selectTagSuperCompany= By.xpath(".//div[@id='mainContainer']/div/div/div/header/form[2]/div/div/span/select");
	/**
	 * This locator will find company tag in the back office
	 */
	final public By selectTagCompany= By.xpath(".//div[@id='mainContainer']/div/div/div/header/form[1]/div/div/span/select");
	/**
	 * This locator will find the super icon in upper header bar
	 */
	final public By divTagSuperCompanyCommonLocators= By.xpath(".//div[@class='header-superCompanyAutoComplete']");
	/**
	 * This locator is the input field of the super company
	 */
	final public By inputTagSuperCompanyCommonLocators= By.xpath(".//*[@class='header-superCompanyEditing header-superCompanyEditing-edit']/div[1]/div[1]/div/div[1]");
	

}
