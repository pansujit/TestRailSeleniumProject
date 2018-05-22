package glide.backoffice.test.headertest;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.test.baseclass.BaseClassExtended3;

public class HeaderTest extends BaseClassExtended3 {
	SoftAssert softAssert;
	@BeforeMethod(alwaysRun=true)
	public void openingBrowser() throws MalformedURLException, InterruptedException {
		openBrowser();
		login();
	}
	@Test(description= "this test verifies the UI values in the Different field")
	public void checkPopupInHeaderTest() {
		List<Boolean> assertValue = new ArrayList<>();
		softAssert= new SoftAssert();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		assertValue = headerMethod.checkAllPopUpInHeader();	
		softAssert.assertTrue(assertValue.get(0),"The Super-Company pop up is not displayed");
		softAssert.assertTrue(assertValue.get(1),"The Company pop up is not displayed");
		softAssert.assertAll();

	}

	@Test(description= "this test verifies big search box functionality in the system")
	public void checkSearchBoxFunctionTest() {
		List<Boolean> assertValue = new ArrayList<>();
		softAssert= new SoftAssert();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		assertValue = headerMethod.bigSearchBoxVerification();
		softAssert.assertTrue(assertValue.get(0),"Member Result is empty");
		softAssert.assertTrue(assertValue.get(1),"The result is not empty");
	}

	@Test(description= "this test verifies navigation from the big search result to the page")
	public void checkNavigationFunctionTest() {
		List<Boolean> assertValue = new ArrayList<>();
		softAssert= new SoftAssert();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		assertValue =headerMethod.bigsearchBoxResultNavigate();
		softAssert.assertTrue(assertValue.get(0),"The details page is displayed for user");
		softAssert.assertTrue(assertValue.get(1),"The details page is displayed for Super company");
	}
	/*@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}*/
}
