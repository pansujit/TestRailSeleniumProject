package glide.backoffice.test.accounts.configurations;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.ConfigDataProvider;
import glide.backoffice.method.accounts.configurations.ConfigDto;
import glide.backoffice.method.accounts.configurations.ConfigMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class ConfigurationNegativeTest extends BaseClassExtended {
	
	@BeforeClass
	public void clickconfigurations() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		siteMenuItems.clickOnConfigurations();	
	}
	@Test
	public void mandatoryConfigErrorTest() {
		ConfigMethod configMethod= PageFactory.initElements(driver, ConfigMethod.class);
		configMethod.errorConfigMadatoryFieldMissing();
	}
	
	@Test(dataProvider="inputDataTypeCheck",dataProviderClass = ConfigDataProvider.class)
	public void inputTypeCheckedConfigErrorTest(ConfigDto configDto) {
		ConfigMethod configMethod= PageFactory.initElements(driver, ConfigMethod.class);
		configMethod.inputTypeCheckedConfigError(configDto);
	}
	
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}

}
