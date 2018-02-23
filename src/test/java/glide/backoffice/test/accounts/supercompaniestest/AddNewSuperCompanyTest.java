package glide.backoffice.test.accounts.supercompaniestest;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.SuperCompanyCreateDataProvider;
import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.supercompanies.SuperCompaniesMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class AddNewSuperCompanyTest extends BaseClassExtended {

	@BeforeClass(description="This runs once which will click on Super companies on side bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
			OpenBrowser();

		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		siteMenuItems.clickOnSuperCompanies();
	}
	
	@Test(dataProvider="createCompanyData",dataProviderClass = SuperCompanyCreateDataProvider.class)
	public void createSuperCompanyTest(SuperCompanyDto superCompanyDto) {
		SuperCompaniesMethod superCompanies=PageFactory.initElements(driver, SuperCompaniesMethod.class);
		superCompanies.createSuperCompany(superCompanyDto);

	}
	@AfterClass
	public void closeAllBrowser() {
		closeBrowser();
	}
	



}
