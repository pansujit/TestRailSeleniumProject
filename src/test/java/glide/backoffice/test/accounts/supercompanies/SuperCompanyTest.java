package glide.backoffice.test.accounts.supercompanies;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.SuperCompanyCreateDataProvider;
import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.method.accounts.supercompanies.SuperCompaniesMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class SuperCompanyTest extends BaseClassExtended {

	@BeforeClass(description="This runs once which will click on Super companies on side bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		siteMenuItems.clickOnSuperCompanies();
	}
	// there is equal effect of creating super company and edit super company
	/*@Test(dataProvider="createCompanyData",dataProviderClass = SuperCompanyCreateDataProvider.class)
	public void createSuperCompanyTest(SuperCompanyDto superCompanyDto) {
		SuperCompaniesMethod superCompanies=PageFactory.initElements(driver, SuperCompaniesMethod.class);
		superCompanies.createSuperCompany(superCompanyDto);

	}*/
	
	@Test(dataProvider="editSuperCompany",dataProviderClass = SuperCompanyCreateDataProvider.class)
	public void editSuperCompanyTest(SuperCompanyDto superCompanyDto) {
		SuperCompaniesMethod superCompanies=PageFactory.initElements(driver, SuperCompaniesMethod.class);
		superCompanies.editSuperCompany(superCompanyDto);

	}
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}
	



}
