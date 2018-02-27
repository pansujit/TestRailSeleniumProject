package glide.backoffice.test.accounts.supercompanies;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.supercompanies.SuperCompaniesMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class SuperCompanyHomepageTest extends BaseClassExtended {
	@BeforeClass(description="This runs once which will click on Super companies on side bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		siteMenuItems.clickOnSuperCompanies();
	}
	@Test
	public void homepageValidationTest() {
		SuperCompaniesMethod superCompanies=PageFactory.initElements(driver, SuperCompaniesMethod.class);
		superCompanies.checkSuperCompanyHomePage();

	}

	@AfterClass
	public void closeAllBrowser() {
		closeBrowser();
	}
}
