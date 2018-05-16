package glide.backoffice.locators.accounts.supercompanies;

import org.openqa.selenium.By;

public class FilterSuperCompany {

	/**
	 * This locators finds filter tag element in the super company homepage -->filter
	 */
	public final By divTagFilterFilterSuperCompany= By.xpath(".//div[@id='companies_filter_type_wrap']/div[1]/div[2]");
	
	/**
	 * This locators finds filter key dropdown menu element in the super company homepage -->filter
	 */
	public final By divTagDropdownMenuFilterSuperCompany= By.xpath(".//div[@role='menu']");
	
	/**
	 * This locators finds filter key company name element in the super company homepage -->filter
	 */
	public final By spanTagCompanyNameFilterSuperCompany= By.xpath(".//span[@id='companies_filter_type_name']/div/div/div");
	
	/**
	 * This locators finds Filter value company name element in the super company homepage -->filter
	 */
	public final By inputTagCompnayNameFilterSuperCompany= By.xpath(".//input[@id='companies_filter_value_input_name']");
	
	/**
	 * This locators finds filter confirm button element in the super company homepage -->filter
	 */
	public final By divTagConfirmBtnFilterSuperCompany= By.xpath(".//div[@id='companies_filter_confirm_button']");
	
	

	
}
