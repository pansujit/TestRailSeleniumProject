package glide.backoffice.method.accounts.configurations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.dataprovider.ErrorMessages;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;


public class ConfigMethod {
	SideMenuItemsMethod siteMenuItems;
	
	WebDriver driver;
	AddEditConfigMethod addEditConfigMethod;
	HomepageConfigMethod homepageConfigMethod;
	HeaderMethod headerMethod;
	public ConfigMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addEditConfigMethod=PageFactory.initElements(driver, AddEditConfigMethod.class);
		this.homepageConfigMethod=PageFactory.initElements(driver, HomepageConfigMethod.class);
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
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
	
	public void errorConfigMadatoryFieldMissing() {
		homepageConfigMethod.clickOnAddConfigButton();
		addEditConfigMethod.waitSaveButtonIsVisible();
		addEditConfigMethod.clickOnSaveButton();
		addEditConfigMethod.assertErrorMandatoryfieldInConfig(ErrorMessages.FIELD_IS_REQUIRED);
		headerMethod.clickOnHeaderBackButton();
	}
	public void inputTypeCheckedConfigError(ConfigDto configDto) {
		homepageConfigMethod.clickOnAddConfigButton();
		addEditConfigMethod.waitSaveButtonIsVisible();
		addEditConfigMethod.typeInputFields(configDto);
		addEditConfigMethod.clickOnSaveButton();
		addEditConfigMethod.assertConfigInputTypeChecked(ErrorMessages.NUMERIC_FIELD_ERROR);
		headerMethod.clickOnHeaderBackButton();
	}

}
