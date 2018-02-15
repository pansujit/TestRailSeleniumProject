package glide.backoffice.test.accounts;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.SiteDataProvider;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.sitesandparkings.ParkingDto;
import glide.backoffice.method.sitesandparkings.SitesAndParkings;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class ParkingTest extends BaseClassExtended {
	@BeforeClass
	public void selectSuperCompany() {
		HeaderMethod headerMethod= PageFactory.initElements(driver, HeaderMethod.class);
		headerMethod.selectSuperCompany();
		SideMenuItemsMethod sideMenuItemsMethod= PageFactory.initElements(driver, SideMenuItemsMethod.class);
		sideMenuItemsMethod.clickOnSitesAndParking();
	}
	
	@Test(dataProvider="createParking",dataProviderClass=SiteDataProvider.class)
	public void createASiteTest(ParkingDto parkingDto) {
		SitesAndParkings sitesAndParkings= PageFactory.initElements(driver, SitesAndParkings.class);
		sitesAndParkings.createParking(parkingDto);
	}
	
	@Test(dataProvider="editParking",dataProviderClass=SiteDataProvider.class)
	public void editASiteTest(ParkingDto parkingDto) {
		SitesAndParkings sitesAndParkings= PageFactory.initElements(driver, SitesAndParkings.class);
		sitesAndParkings.editParking(parkingDto);
	}
}
