package glide.backoffice.locators.accounts.companies;

import org.openqa.selenium.By;

public class ViewCompany {
	/**
	 * This will find Edit element in company view in  Account-->Companies-->View
	 */
	public final By aTagEditViewCompany= By.xpath(".//div[@class='subCompanyDetailPage_head']/a");
	
	/**
	 * This will find section element for detailing of company in company view in  Account-->Companies-->View
	 */
	public final By sectionTagViewCompanies= By.xpath(".//section[@class='subCompanyDetail']");
	
	
	

}
