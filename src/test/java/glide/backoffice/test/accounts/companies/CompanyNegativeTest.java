package glide.backoffice.test.accounts.companies;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.CompanyDataProvider;
import glide.backoffice.enums.Status;
import glide.backoffice.enums.UsageType;
import glide.backoffice.method.accounts.companies.CompanyDto;
import glide.backoffice.method.accounts.companies.CompanyMethod;
import glide.backoffice.method.common.CheckData;
import glide.backoffice.method.common.CheckData.Parameter;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class CompanyNegativeTest extends BaseClassExtended{
	@BeforeClass(description="This runs once which will select the super company and click on company side bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		//headerMethod.selectSuperCompany();
		siteMenuItems.clickOnCompanies();
	}
	@Test(priority=1)
	public void editAddcompanyErrorTest() {
		CompanyMethod company= PageFactory.initElements(driver, CompanyMethod.class);
		company.addEditCompanyErrorCheck();
	}
	/*@Test(priority=2,dataProvider="fieldValidationErrorCompany",dataProviderClass=CompanyDataProvider.class)
	public void editAddcompanyValidationErrorTest(CompanyDto companyDto) {
		CompanyMethod company= PageFactory.initElements(driver, CompanyMethod.class);
		company.addEditCompanyValidationErrorCheck(companyDto);
	}

	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}*/
}
