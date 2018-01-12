package glide.backoffice.locators.accounts.supercompanies;

import org.openqa.selenium.By;

public class ViewSC {
	/**
	 * This locators finds Super company header element in the super company --> View
	 */
	public final By spanTagSuperCompanyHeaderViewSC= By.xpath(".//div[@class='companyDetail_tabs']/div[1]/span");
	/**
	 * This locators finds Application header element in the super company --> View
	 */
	public final By spanTagApplicationheaderViewSC= By.xpath(".//div[@class='companyDetail_tabs']/div[2]/span");

	/**
	 * This locators finds shuttle header element in the super company --> View
	 */
	public final By spanTagShuttleHeaderViewSC= By.xpath(".//div[@class='companyDetail_tabs']/div[3]/span");

	/**
	 * This locators finds Custom subscription fields header element in the super company --> View
	 */
	public final By spanTagCustomSubscriptionHeaderViewSC= By.xpath(".//div[@class='companyDetail_tabs']/div[4]/span");

	/**
	 * This locators finds Custom Booking fields element in the super company --> View
	 */
	public final By spanTagCustomBookingHeaderViewSC= By.xpath(".//div[@class='companyDetail_tabs']/div[5]/span");

	/**
	 * This locators finds Edit super company element in the super company --> View
	 */
	public final By aTagEditSuperCompanyViewSC= By.xpath(".//div[@class='companyDetailPage_head']/a");

	/**
	 * This locators finds Super company name element in the super company --> View
	 */
	public final By spanTagSuperCompanyNameViewSC= By.xpath(".//span[@class='detailItem_result' and contains(@data-reactid,'companyForm_name_label')]");

	/**
	 * This locators finds Super Company Email element in the super company --> View
	 */
	public final By spanTagSuperCompanyEmailViewSC= By.xpath(".//span[@class='detailItem_result' and contains(@data-reactid,'companyForm_email_label')]");

	/**
	 * This locators finds Super Company Address element in the super company --> View
	 */
	public final By spanTagSupeCompanyAddressViewSC= By.xpath(".//span[@class='detailItem_result' and contains(@data-reactid,'companyForm_address_label')]");

	


}
