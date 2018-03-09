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

public class AddNewSuperCompanyErrorTest extends BaseClassExtended {
	@BeforeClass(description="This runs once which will click on Super companies on side bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		siteMenuItems.clickOnSuperCompanies();
	}
	@Test(dataProvider="nonInteDataForIntFieldTest",dataProviderClass = SuperCompanyCreateDataProvider.class,priority=2)
	public void ValidateIntegerFieldTest(SuperCompanyDto superCompanyDto) {
		SuperCompaniesMethod superCompanies=PageFactory.initElements(driver, SuperCompaniesMethod.class);
		superCompanies.integerToStringError(superCompanyDto);
	}
	@Test(dataProvider="returnEmptyData",dataProviderClass = SuperCompanyCreateDataProvider.class,priority=1)
	public void homepageValidationTest(SuperCompanyDto superCompanyDto) {
		SuperCompaniesMethod superCompanies=PageFactory.initElements(driver, SuperCompaniesMethod.class);
		superCompanies.checkAllErrorInCreateSuperCompany(superCompanyDto);

	}
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}

}
