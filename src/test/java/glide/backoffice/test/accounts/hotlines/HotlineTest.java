package glide.backoffice.test.accounts.hotlines;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.HotlineDataProvider;
import glide.backoffice.method.accounts.hotlines.HotlineDto;
import glide.backoffice.method.accounts.hotlines.HotlineMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class HotlineTest extends BaseClassExtended {
	
	@BeforeClass(description="This runs once which will select the super company and click on company side bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		siteMenuItems.clickOnHotlines();
	}
	
	@Test(dataProvider="editHotline", dataProviderClass=HotlineDataProvider.class)
	public void editAHotline(HotlineDto hotlineDto) {
		HotlineMethod hotlineMethod=PageFactory.initElements(driver, HotlineMethod.class);
		hotlineMethod.editAHotline(hotlineDto);
	}
	
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}

}
