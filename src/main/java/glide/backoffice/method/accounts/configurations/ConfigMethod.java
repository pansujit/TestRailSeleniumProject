package glide.backoffice.method.accounts.configurations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;


public class ConfigMethod {
	SideMenuItemsMethod siteMenuItems;
	
	WebDriver driver;
	AddEditConfigMethod addEditConfigMethod;
	HomepageConfigMethod homepageConfigMethod;
	
	public ConfigMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addEditConfigMethod=PageFactory.initElements(driver, AddEditConfigMethod.class);
		this.homepageConfigMethod=PageFactory.initElements(driver, HomepageConfigMethod.class);
	}


	public void createConfiguration(ConfigDto configDto) {
		homepageConfigMethod.clickOnAddConfigButton();
		addEditConfigMethod.waitSaveButtonIsVisible();
		addEditConfigMethod.typeInputFields(configDto);
		addEditConfigMethod.clickOnSaveButton();
		homepageConfigMethod.waitAddAConfigButtonToBeVisible();
	}
	
	public void editConfiguration(ConfigDto configDto) {
		homepageConfigMethod.clickOnEditConfigButton(Config.getProperty("EDIT_CONFIGURATION_NAME"));
		addEditConfigMethod.waitSaveButtonIsVisible();
		addEditConfigMethod.typeInputFields(configDto);
		addEditConfigMethod.clickOnSaveButton();
		homepageConfigMethod.waitAddAConfigButtonToBeVisible();
		homepageConfigMethod.assertAddEditConfig(Config.getProperty("EDIT_CONFIGURATION_NAME"), 
				configDto.getVatNumber(), configDto.getVatPercentage());
	}

}
