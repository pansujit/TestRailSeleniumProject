package glide.backoffice.test.accounts.companies;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.CompanyDataProvider;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.companies.Company;
import glide.backoffice.method.companies.CompanyDto;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class CompanyTest extends BaseClassExtended {


	@BeforeClass(description="This runs once which will select the super company and click on company side bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		siteMenuItems.clickOnCompanies();
	}

	@Test(dataProvider="createCompany",dataProviderClass = CompanyDataProvider.class,
			description="This test verifies the creation of the new company from the back office")
	public void createNewCompanyTest(CompanyDto companyDto) {
		Company company= PageFactory.initElements(driver, Company.class);
		company.createNewCompany(companyDto);

	}

	@Test(dataProvider="editCompany",dataProviderClass = CompanyDataProvider.class,
			description="This test verifies the edit of the company from the back office")
	public void editCompanyTest(CompanyDto companyDto) {
		Company company= PageFactory.initElements(driver, Company.class);
		company.editCompany(companyDto);

	}
	@Test(description="This test verifies the Viewing of the new company from the back office")
	public void viewCompanyTest() {
		Company company= PageFactory.initElements(driver, Company.class);
		company.viewCompany();

	}
	@AfterClass
	public void closeAllBrowser() {
		closeBrowser();
	}

}
