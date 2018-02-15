package glide.backoffice.test.accounts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.SiteDataProvider;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.sitesandparkings.SiteDto;
import glide.backoffice.method.sitesandparkings.SitesAndParkings;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class SiteTest extends BaseClassExtended {
	
	@BeforeClass
	public void selectSuperCompany() {
		HeaderMethod headerMethod= PageFactory.initElements(driver, HeaderMethod.class);
		headerMethod.selectSuperCompany();
		SideMenuItemsMethod sideMenuItemsMethod= PageFactory.initElements(driver, SideMenuItemsMethod.class);
		sideMenuItemsMethod.clickOnSitesAndParking();
	}
	
	@Test(dataProvider="createSite",dataProviderClass=SiteDataProvider.class)
	public void createASiteTest(SiteDto siteDto) {
		SitesAndParkings sitesAndParkings= PageFactory.initElements(driver, SitesAndParkings.class);
		sitesAndParkings.createSite(siteDto);
	}
	
	@Test(dataProvider="editSite",dataProviderClass=SiteDataProvider.class)
	public void editASiteTest(SiteDto siteDto) {
		SitesAndParkings sitesAndParkings= PageFactory.initElements(driver, SitesAndParkings.class);
		sitesAndParkings.editSite(siteDto);
	}

}
