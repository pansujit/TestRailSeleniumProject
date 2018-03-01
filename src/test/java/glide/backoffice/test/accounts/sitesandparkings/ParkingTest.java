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
import glide.backoffice.method.sitesandparkings.ParkingDto;
import glide.backoffice.method.sitesandparkings.SitesAndParkingsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class ParkingTest extends BaseClassExtended {
	@BeforeClass
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		HeaderMethod headerMethod= PageFactory.initElements(driver, HeaderMethod.class);
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		SideMenuItemsMethod sideMenuItemsMethod= PageFactory.initElements(driver, SideMenuItemsMethod.class);
		sideMenuItemsMethod.clickOnSitesAndParking();
	}
	// The create parking is not running on the automation test which is more or less equal to edit a parking
	/*@Test(dataProvider="createParking",dataProviderClass=SiteDataProvider.class)
	public void createASiteTest(ParkingDto parkingDto) {
		SitesAndParkingsMethod sitesAndParkings= PageFactory.initElements(driver, SitesAndParkingsMethod.class);
		sitesAndParkings.createParking(parkingDto);
	}*/
	
	@Test(dataProvider="editParking",dataProviderClass=SiteDataProvider.class)
	public void editASiteTest(ParkingDto parkingDto) {
		SitesAndParkingsMethod sitesAndParkings= PageFactory.initElements(driver, SitesAndParkingsMethod.class);
		sitesAndParkings.editParking(parkingDto);
	}
	@AfterClass
	public void closeAllBrowser() {
		closeBrowser();
	}
}
