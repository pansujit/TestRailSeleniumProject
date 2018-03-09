package glide.backoffice.method.accounts.configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.accounts.configurations.AddConfig;
import glide.backoffice.utility.SeleniumUtility;

public class AddEditConfigMethod {
	WebDriver driver;
	AddConfig addConfig;
	
	public AddEditConfigMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addConfig=PageFactory.initElements(driver, AddConfig.class);
	}
	/**
	 * This method clear the input field of the edit/add configuration and input the given text.
	 * @param configDto - Should be ConfigDto
	 */
	void typeInputFields(ConfigDto configDto) {
		SeleniumUtility.clearTextAndSendText(driver, addConfig.inputTagConfigurationNameEditConfig, configDto.getConfigName());
		SeleniumUtility.clearTextAndSendText(driver, addConfig.inputTagVatNumberEditConfig, configDto.getVatNumber());
		SeleniumUtility.clearTextAndSendText(driver, addConfig.inputTagVatRateEditConfig, configDto.getVatPercentage());
	}
	
	void clickOnSaveButton() {
		SeleniumUtility.clickOnElement(driver, addConfig.buttonTagSaveEditConfig);
	}
	
	void waitSaveButtonIsVisible() {
		SeleniumUtility.waitElementToBeClickable(driver, addConfig.buttonTagSaveEditConfig);
		SeleniumUtility.fixedWait(1);
	}
}
