package glide.backoffice.test.accounts.sitesandparkings;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.SiteDataProvider;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.sitesandparkings.SiteDto;
import glide.backoffice.method.sitesandparkings.SitesAndParkingsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;
/**
 * 
 * @author sujitpandey
 * @created on Feb 22, 2018 4:29:00 PM
 */
public class SiteTest extends BaseClassExtended {

	@BeforeClass
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		HeaderMethod headerMethod= PageFactory.initElements(driver, HeaderMethod.class);
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		SideMenuItemsMethod sideMenuItemsMethod= PageFactory.initElements(driver, SideMenuItemsMethod.class);
		sideMenuItemsMethod.clickOnSitesAndParking();
	}

	@Test(dataProvider="createSite",dataProviderClass=SiteDataProvider.class,
			description="This test verifies that creation of the sites in back office")
	public void createASiteTest(SiteDto siteDto) {
		SitesAndParkingsMethod sitesAndParkings= PageFactory.initElements(driver, SitesAndParkingsMethod.class);
		sitesAndParkings.createSite(siteDto);
	}

	@Test(dataProvider="editSite",dataProviderClass=SiteDataProvider.class, 
			description="This test verifies that a site be edited from the back office")
	public void editASiteTest(SiteDto siteDto) {
		SitesAndParkingsMethod sitesAndParkings= PageFactory.initElements(driver, SitesAndParkingsMethod.class);
		sitesAndParkings.editSite(siteDto);
	}
	@AfterClass
	public void closeAllBrowser() {
		closeBrowser();
	}

}
