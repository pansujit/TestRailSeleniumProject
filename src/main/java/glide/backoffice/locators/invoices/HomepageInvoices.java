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
	public final By buttonTagCreateInvoiceHomepageInvoices= By.xpath(".//div[@class='invoicesPage_filters']/button[3]");
	
	/**Locator for the Export to CSV format in invoice homepage
	 * 
	 */
	public final By buttonTagExportHomepageInvoices= By.xpath(".//div[@class='invoicesPage_filters']/button[2]");
	/**
	 * Locator for the Filter invoice in invoice homepage
	 */
	public final By buttonTagFilterHomepageInvoices= By.xpath(".//div[@class='invoicesPage_filters']/button[1]");
	/**
	 * Locator for the create invoice in invoice homepage
	 */
	public final By tableHeaderInvoiceNumberHomepageInvoices= By.xpath(".//table/thead/tr/th[1]");
	/**
	 * Locator for the create invoice in invoice homepage
	 */
	public final By tableHeaderCompanyHomepageInvoices= By.xpath(".//table/thead/tr/th[2]");
	/**
	 * 
	 */
	public final By tableHeaderClientNameHomepageInvoices= By.xpath(".//table/thead/tr/th[3]");
	/**
	 * 
	 */
	public final By tableHeaderPlateNumberHomepageInvoices= By.xpath(".//table/thead/tr/th[4]");
	/**
	 * 
	 */
	public final By tableHeaderInvoiceTypeHomepageInvoices= By.xpath(".//table/thead/tr/th[5]");
	/**
	 * 
	 */
	public final By tableHeaderDateOfIssueHomepageInvoices= By.xpath(".//table/thead/tr/th[6]");
	/**
	 * 
	 */
	public final By tableHeaderInvoiceStartHomepageInvoices= By.xpath(".//table/thead/tr/th[7]");
	/**
	 * 
	 */
	public final By tableHeaderInvoiceEndHomepageInvoices= By.xpath(".//table/thead/tr/th[8]");
	/**
	 * 
	 */
	public final By tableHeaderValueHomepageInvoices= By.xpath(".//table/thead/tr/th[9]");
	/**
	 * 
	 */
	public final By tableHeaderStatusHomepageInvoices= By.xpath(".//table/thead/tr/th[10]");
	/**
	 * 
	 */
	public final By tableHeaderTagActionHomepageInvoices= By.xpath(".//table/thead/tr/th[11]");
	/**
	 * 
	 */
	public final By inputTagInvoiceNumberHomepageInvoicesFilter= By.xpath(".//input[@id='search_publicId']");
	/**
	 * 
	 */
	public final By inputTagPlateNumberHomepageInvoicesFilter= By.xpath(".//input[@id='search_plateNumber']");
	/**
	 * 
	 */
	public final By inputTagToDateHomepageInvoicesFilter= By.xpath(".//input[@id='search_endDate']");
	/**
	 * 
	 */
	public final By inputTagFromDateHomepageInvoicesFilter= By.xpath(".//input[@id='search_startDate']");
	/**
	 * 
	 */
	public final By selectTagInvoiceTypeInvoicesFilter= By.xpath(".//select[contains(@class,'boxedSelect') and @name='type']");
	/**
	 * 
	 */
	public final By selectTagStatusHomepageInvoicesFilter= By.xpath(".//select[contains(@class,'boxedSelect') and @name='status']");
	
	/**
	 * 
	 */
	public final By buttonTagSearchHomepageInvoicesFilter= By.xpath(".//button[@class='ekButton vehiclesFiltersForm_actionsButton']");
	
	/**
	 * 
	 */
	public final By buttonTagResetHomepageInvoicesFilter= By.xpath(".//button[@class='ekButton ekButton--reverse vehiclesFiltersForm_actionsButton']");
	


}
