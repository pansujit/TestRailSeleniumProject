package glide.backoffice.test.accounts.hotlines;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.method.accounts.hotlines.HotlineMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class HotlineNegativeTest extends BaseClassExtended{
	@BeforeClass(description="This runs once which will select the super company and click on company side bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		siteMenuItems.clickOnHotlines();
	}
	@Test
	public void mandatoryFieldErrorTest() {
		HotlineMethod hotlineMethod=PageFactory.initElements(driver, HotlineMethod.class);
		hotlineMethod.mandatoryFieldCheckError();
	}
	
	@Test
	public void inputFieldTypeErrorTest() {
		HotlineMethod hotlineMethod=PageFactory.initElements(driver, HotlineMethod.class);
		hotlineMethod.inputFieldCheckError();
	}

	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}
}
