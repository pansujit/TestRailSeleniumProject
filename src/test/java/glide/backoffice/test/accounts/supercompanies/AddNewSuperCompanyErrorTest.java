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

public class AddNewSuperCompanyErrorTest extends BaseClassExtended3 {
	SoftAssert softAssert;
	@BeforeMethod(description="This runs once which will click on Super companies on side bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
        openBrowser();
        login();
        SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class);
		siteMenuItems.clickOnSuperCompanies();
	}
	@Test(dataProvider="nonInteDataForIntFieldTest",dataProviderClass = SuperCompanyCreateDataProvider.class,priority=2)
	public void addCompanyTypeErrorCheckTest(SuperCompanyDto superCompanyDto) {
		List<Boolean> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		SuperCompaniesMethod superCompanies=PageFactory.initElements(driver, SuperCompaniesMethod.class);
		assertValue=superCompanies.integerToStringError(superCompanyDto);
		softAssert.assertTrue(assertValue.get(0),"Capital doesnot return number specific error");
		softAssert.assertTrue(assertValue.get(1),"Tax number doesnot return number specific error");
		softAssert.assertTrue(assertValue.get(2),"Email doesnot return email specific error");
		softAssert.assertTrue(assertValue.get(3),"Phone number doesnot return number specific error");
		softAssert.assertTrue(assertValue.get(4),"Terms of URL doesnot return URL specific error");
		softAssert.assertTrue(assertValue.get(5),"Sunscription URL doesnot return URL specific error");
		softAssert.assertAll();
		
	}
	@Test(dataProvider="returnEmptyData",dataProviderClass = SuperCompanyCreateDataProvider.class,priority=1)
	public void addCompanyErrorTest(SuperCompanyDto superCompanyDto) {
		List<Boolean> assertValue= new ArrayList<>();
		softAssert= new SoftAssert();
		SuperCompaniesMethod superCompanies=PageFactory.initElements(driver, SuperCompaniesMethod.class);
		assertValue=superCompanies.checkAllErrorInCreateSuperCompany(superCompanyDto);
		softAssert.assertTrue(assertValue.get(0),"Address related error is not displayed");
		softAssert.assertTrue(assertValue.get(1),"Lock and unlock related error is not displayed");
		softAssert.assertTrue(assertValue.get(2),"Capital related error is not displayed");
		softAssert.assertTrue(assertValue.get(3),"Email related error is not displayed");
		softAssert.assertTrue(assertValue.get(4),"Email Styling related error is not displayed");
		softAssert.assertTrue(assertValue.get(5),"Invoice number related error is not displayed");
		softAssert.assertTrue(assertValue.get(6),"Legal form related error is not displayed");
		softAssert.assertTrue(assertValue.get(7),"Name related error is not displayed");
		softAssert.assertTrue(assertValue.get(8),"Phone number related error is not displayed");
		softAssert.assertTrue(assertValue.get(9),"Tax Number related error is not displayed");
		softAssert.assertTrue(assertValue.get(10),"Term URL related error is not displayed");
		softAssert.assertAll();

	}


}
