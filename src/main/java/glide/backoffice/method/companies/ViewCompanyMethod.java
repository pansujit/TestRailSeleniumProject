package glide.backoffice.method.companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.companies.HomepageCompany;
import glide.backoffice.locators.companies.ViewCompany;

public class ViewCompanyMethod {
	WebDriver driver;
	HomepageCompany homepageCompany;
	ViewCompany viewCompany;
	public ViewCompanyMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageCompany=PageFactory.initElements(driver, HomepageCompany.class);
		this.viewCompany=PageFactory.initElements(driver, ViewCompany.class);

	}


}
