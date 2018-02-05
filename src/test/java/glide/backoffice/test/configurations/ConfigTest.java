package glide.backoffice.test.configurations;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.ConfigDataProvider;
import glide.backoffice.method.configurations.ConfigDto;
import glide.backoffice.method.configurations.ConfigMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class ConfigTest  extends BaseClassExtended {
	
	@BeforeClass
	public void clickconfigurations() {
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		siteMenuItems.clickOnConfigurations();	
	}
	
	
	@Test(dataProvider="createConfig",dataProviderClass = ConfigDataProvider.class)
	public void addConfigTest(ConfigDto configDto) {
		ConfigMethod configMethod=PageFactory.initElements(driver, ConfigMethod.class);
		configMethod.editConfiguration(configDto);		
	}
	
	@Test(dataProvider="editConfig",dataProviderClass = ConfigDataProvider.class)
	public void editConfigTest(ConfigDto configDto) {
		ConfigMethod configMethod=PageFactory.initElements(driver, ConfigMethod.class);
		configMethod.editConfiguration(configDto);	
	}
	

}
