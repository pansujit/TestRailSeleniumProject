package glide.backoffice.test.accounts.supercompanies;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import glide.backoffice.dataprovider.SuperCompanyCreateDataProvider;
import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.method.accounts.supercompanies.SuperCompaniesMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended3;

public class SuperCompanyTest extends BaseClassExtended3 {
	SoftAssert softAssert;
	@BeforeMethod(description="This runs once which will click on Super companies on side bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
        openBrowser();
        login();
        SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class);
		siteMenuItems.clickOnSuperCompanies();
	}
	// there is equal effect of creating super company and edit super company
	@Test(dataProvider="createCompanyData",dataProviderClass = SuperCompanyCreateDataProvider.class)
	public void createSuperCompanyTest(SuperCompanyDto superCompanyDto) {
		List<String> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		SuperCompaniesMethod superCompanies=PageFactory.initElements(driver, SuperCompaniesMethod.class);
		assertValue= superCompanies.createSuperCompany(superCompanyDto);
		softAssert.assertEquals(assertValue.get(0),superCompanyDto.getCompanyName(),"The company name is not matched");
		softAssert.assertEquals(assertValue.get(1),superCompanyDto.getEmail(),"The email is not matched");
		softAssert.assertAll();

	}
	
	@Test(dataProvider="editSuperCompany",dataProviderClass = SuperCompanyCreateDataProvider.class)
	public void editSuperCompanyTest(SuperCompanyDto superCompanyDto) {
		List<String> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		SuperCompaniesMethod superCompanies=PageFactory.initElements(driver, SuperCompaniesMethod.class);
		assertValue= superCompanies.editSuperCompany(superCompanyDto);
		softAssert.assertEquals(assertValue.get(0),superCompanyDto.getCompanyName(),"The company name is not matched");
		softAssert.assertEquals(assertValue.get(1),superCompanyDto.getEmail(),"The email is not matched");
		softAssert.assertAll();
	}

	



}
