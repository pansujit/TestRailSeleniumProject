package glide.backoffice.test.users.backusers;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.users.backusers.BackuserMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class BackuserNegativeTest extends BaseClassExtended{
	@BeforeClass(alwaysRun=true,description="This runs once which will select the super company and click on Backuser bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		siteMenuItems.clickOnBackusers();
	}
	
	@Test
	public void missingMandatoryBackuserTest() {
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		backuser.mandatoryMissingFieldValidation();
	}
	
	
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}

	
}
