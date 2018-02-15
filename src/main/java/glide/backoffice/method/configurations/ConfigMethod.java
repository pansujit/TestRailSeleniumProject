package glide.backoffice.method.configurations;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.accounts.configurations.AddConfig;
import glide.backoffice.locators.accounts.configurations.EditConfig;
import glide.backoffice.locators.accounts.configurations.HomepageConfig;
import glide.backoffice.locators.common.CommonLocators;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.utility.SeleniumUtility;

public class ConfigMethod {
	SideMenuItemsMethod siteMenuItems;
	AddConfig addConfig;
	EditConfig editConfig;
	HomepageConfig homepageConfig;
	WebDriver driver;
	CommonLocators commonLocators;
	CommonMethods commonMethods;
	public ConfigMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.siteMenuItems=PageFactory.initElements(driver, SideMenuItemsMethod.class);
		this.addConfig=PageFactory.initElements(driver, AddConfig.class);
		this.editConfig=PageFactory.initElements(driver, EditConfig.class);
		this.homepageConfig=PageFactory.initElements(driver, HomepageConfig.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);



	}

	private void clickOnAddConfigButton() {
		SeleniumUtility.clickUsingAction(driver, homepageConfig.aTagAddConfigHomepageConfig);
		SeleniumUtility.waitElementToBeClickable(driver, addConfig.buttonTagSaveEditConfig);
		SeleniumUtility.fixedWait(1);

	}
	private void typeInputFields(ConfigDto configDto) {
		SeleniumUtility.clearTextAndSendText(driver, addConfig.inputTagConfigurationNameEditConfig, configDto.getConfigName());
		SeleniumUtility.clearTextAndSendText(driver, addConfig.inputTagVatNumberEditConfig, configDto.getVatNumber());
		SeleniumUtility.clearTextAndSendText(driver, addConfig.inputTagVatRateEditConfig, configDto.getVatPercentage());
	}
	private void clickOnSaveButton() {
		SeleniumUtility.clickOnElement(driver, addConfig.buttonTagSaveEditConfig);
		SeleniumUtility.waitElementToBeClickable(driver, homepageConfig.aTagAddConfigHomepageConfig);
		SeleniumUtility.fixedWait(1);

	}

	private void clickOnEditConfigButton() {
		while(commonMethods.checkVisibilityPaginationNext()) {
			if(SeleniumUtility.checkElementIsVisible(driver, homepageConfig.spanTagConfigNameHomepageConfig("Nagdobyr"))) {
				SeleniumUtility.clickOnElement(driver, homepageConfig.buttonTagEditHomepageConfig("Nagdobyr"));
				SeleniumUtility.waitElementToBeVisible(driver, addConfig.buttonTagSaveEditConfig);
				SeleniumUtility.fixedWait(1);
				break;
			}
			else {
				commonMethods.clickOnPaginationNext();
			}
		}
		
	}


	public void createConfiguration(ConfigDto configDto) {
		clickOnAddConfigButton();
		typeInputFields(configDto);
		clickOnSaveButton();
	}
	public void editConfiguration(ConfigDto configDto) {
		System.out.println("name" +configDto.getConfigName());
		clickOnEditConfigButton();
		typeInputFields(configDto);
		clickOnSaveButton();
	}

}
