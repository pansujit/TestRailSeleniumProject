package glide.backoffice.method.accounts.supercompanies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.accounts.supercompanies.FilterSuperCompany;
import glide.backoffice.utility.SeleniumUtility;

public class FilterSuperCompanyMethod {
	WebDriver driver;
	FilterSuperCompany filterSuperCompany;
	public FilterSuperCompanyMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.filterSuperCompany=PageFactory.initElements(ldriver, FilterSuperCompany.class);
	}
	/**
	 * This method waits until the filter key dropdown menu is displayed
	 */
	void waitUntilDropdownMenuIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, filterSuperCompany.divTagDropdownMenuFilterSuperCompany);
		SeleniumUtility.fixedMilliSecondWait();
	}
	
	/**
	 * This method waits until the filter key dropdown menu is invisible
	 */
	void waitUntilDropdownMenuIsNotVisible() {
		SeleniumUtility.waitUntilElementisNotVisible(driver, filterSuperCompany.divTagDropdownMenuFilterSuperCompany);
		SeleniumUtility.fixedMilliSecondWait();
	}
	
	/**
	 * This method click on filter and wait until the dropdown button is displayed
	 */
	void clickOnFilter() {
		SeleniumUtility.clickOnElement(driver, filterSuperCompany.divTagFilterFilterSuperCompany);
		waitUntilDropdownMenuIsVisible();
	}
	/**
	 * This method click on the "company name" filter key in the super company
	 */
	void clickOnCompanyName() {
		SeleniumUtility.clickOnElement(driver, filterSuperCompany.spanTagCompanyNameFilterSuperCompany);
		waitUntilDropdownMenuIsVisible();
	}
	/**
	 * This method inputs the company name in the company name input filter in super company
	 * @param companyName - Should be String
	 */
	void inputCompanyName(String companyName) {
		SeleniumUtility.clearTextAndSendText(driver, filterSuperCompany.inputTagCompnayNameFilterSuperCompany, companyName,null);
		SeleniumUtility.fixedMilliSecondWait();
	}
	
	/**
	 * This method clicks on the filter confirm button to apply the given filter in super company
	 */
	void clickOnConfirmButton() {
		SeleniumUtility.clickOnElement(driver, filterSuperCompany.divTagConfirmBtnFilterSuperCompany);
		SeleniumUtility.fixedMilliSecondWait();
	}
	
	
	
	
	
	
}
