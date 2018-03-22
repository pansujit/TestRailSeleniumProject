package glide.backoffice.test.headertest;

import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class HeaderTest extends BaseClassExtended {

	@BeforeClass
	public void openingBrowser() throws MalformedURLException, InterruptedException {
		OpenBrowser();
	}
	@Test(description= "this test verifies the UI values in the Different field")
	public void checkPopupInHeaderTest() {
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		headerMethod.checkAllPopUpInHeader();	
	}

	@Test(description= "this test verifies big search box functionality in the system")
	public void checkSearchBoxFunctionTest() {
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		headerMethod.bigSearchBoxVerification();
	}

	@Test(description= "this test verifies navigation from the big search result to the page")
	public void checkNavigationFunctionTest() {
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		headerMethod.bigsearchBoxResultNavigate();

	}
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}
}
