package glide.backoffice.locators.invoices;

import org.openqa.selenium.By;

/**
 * This class contains the all locators in side the invoices homepage
 * @author sujitpandey
 *
 */
public class HomepageInvoices {
	
	/**
	 * Locator for the create invoice in invoice homepage
	 */
	final public By buttonTagCreateInvoiceHomepageInvoices= By.xpath(".//div[@class='invoicesPage_filters']/button[3]");
	
	/**Locator for the Export to CSV format in invoice homepage
	 * 
	 */
	final public By buttonTagExportHomepageInvoices= By.xpath(".//div[@class='invoicesPage_filters']/button[2]");
	/**
	 * Locator for the Filter invoice in invoice homepage
	 */
	final public By buttonTagFilterHomepageInvoices= By.xpath(".//div[@class='invoicesPage_filters']/button[1]");
	/**
	 * Locator for the create invoice in invoice homepage
	 */
	final public By tableHeaderInvoiceNumberHomepageInvoices= By.xpath(".//table/thead/tr/th[1]");
	/**
	 * Locator for the create invoice in invoice homepage
	 */
	final public By tableHeaderCompanyHomepageInvoices= By.xpath(".//table/thead/tr/th[2]");
	/**
	 * 
	 */
	final public By tableHeaderClientNameHomepageInvoices= By.xpath(".//table/thead/tr/th[3]");
	/**
	 * 
	 */
	final public By tableHeaderPlateNumberHomepageInvoices= By.xpath(".//table/thead/tr/th[4]");
	/**
	 * 
	 */
	final public By tableHeaderInvoiceTypeHomepageInvoices= By.xpath(".//table/thead/tr/th[5]");
	/**
	 * 
	 */
	final public By tableHeaderDateOfIssueHomepageInvoices= By.xpath(".//table/thead/tr/th[6]");
	/**
	 * 
	 */
	final public By tableHeaderInvoiceStartHomepageInvoices= By.xpath(".//table/thead/tr/th[7]");
	/**
	 * 
	 */
	final public By tableHeaderInvoiceEndHomepageInvoices= By.xpath(".//table/thead/tr/th[8]");
	/**
	 * 
	 */
	final public By tableHeaderValueHomepageInvoices= By.xpath(".//table/thead/tr/th[9]");
	/**
	 * 
	 */
	final public By tableHeaderStatusHomepageInvoices= By.xpath(".//table/thead/tr/th[10]");
	/**
	 * 
	 */
	final public By tableHeaderTagActionHomepageInvoices= By.xpath(".//table/thead/tr/th[11]");
	/**
	 * 
	 */
	final public By inputTagInvoiceNumberHomepageInvoicesFilter= By.xpath(".//input[@id='search_publicId']");
	/**
	 * 
	 */
	final public By inputTagPlateNumberHomepageInvoicesFilter= By.xpath(".//input[@id='search_plateNumber']");
	/**
	 * 
	 */
	final public By inputTagToDateHomepageInvoicesFilter= By.xpath(".//input[@id='search_endDate']");
	/**
	 * 
	 */
	final public By inputTagFromDateHomepageInvoicesFilter= By.xpath(".//input[@id='search_startDate']");
	/**
	 * 
	 */
	final public By selectTagInvoiceTypeInvoicesFilter= By.xpath(".//select[contains(@class,'boxedSelect') and @name='type']");
	/**
	 * 
	 */
	final public By selectTagStatusHomepageInvoicesFilter= By.xpath(".//select[contains(@class,'boxedSelect') and @name='status']");
	
	/**
	 * 
	 */
	final public By buttonTagSearchHomepageInvoicesFilter= By.xpath(".//button[@class='ekButton vehiclesFiltersForm_actionsButton']");
	
	/**
	 * 
	 */
	final public By buttonTagResetHomepageInvoicesFilter= By.xpath(".//button[@class='ekButton ekButton--reverse vehiclesFiltersForm_actionsButton']");
	


}
