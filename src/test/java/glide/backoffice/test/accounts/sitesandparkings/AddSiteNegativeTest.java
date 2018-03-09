package glide.backoffice.test.accounts.sitesandparkings;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.method.accounts.sitesandparkings.SitesAndParkingsMethod;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class AddSiteNegativeTest extends BaseClassExtended{
	@BeforeClass
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		HeaderMethod headerMethod= PageFactory.initElements(driver, HeaderMethod.class);
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		SideMenuItemsMethod sideMenuItemsMethod= PageFactory.initElements(driver, SideMenuItemsMethod.class);
		sideMenuItemsMethod.clickOnSitesAndParking();
	}
	
	@Test
	public void MandatoryFieldEmptyErrorTest() {
		SitesAndParkingsMethod sitesAndParkings= PageFactory.initElements(driver, SitesAndParkingsMethod.class);
		sitesAndParkings.manadatorySiteFieldEmptyError();
		
	}
	
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}
}
