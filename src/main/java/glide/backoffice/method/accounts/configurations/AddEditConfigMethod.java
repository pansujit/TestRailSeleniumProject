package glide.backoffice.method.accounts.configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.dataprovider.ErrorMessages;
import glide.backoffice.locators.accounts.configurations.AddConfig;
import glide.backoffice.locators.accounts.configurations.ErrorConfiguration;
import glide.backoffice.utility.SeleniumUtility;

public class AddEditConfigMethod {
	WebDriver driver;
	AddConfig addConfig;
	ErrorConfiguration errorConfiguration;
	SoftAssert softAssert;
	public AddEditConfigMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addConfig=PageFactory.initElements(driver, AddConfig.class);
		this.errorConfiguration=PageFactory.initElements(driver, ErrorConfiguration.class);
		this.softAssert= new SoftAssert();
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
	/**
	 * This method click on the save button in Add/Edit configuration in Accounts-->configurations-->Add/edit configuration in back office
	 */
	void clickOnSaveButton() {
		SeleniumUtility.clickOnElement(driver, addConfig.buttonTagSaveEditConfig);
	}
	/**
	 * This method waits until the Save button is visible in Add/edit page in configuration in Accounts-->configurations-->Add/edit in back office
	 */
	void waitSaveButtonIsVisible() {
		SeleniumUtility.waitElementToBeClickable(driver, addConfig.buttonTagSaveEditConfig);
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This method check the mandatory error message with given error message in 
	 * Add/edit page in configuration in Accounts-->configurations-->Add/edit in back office
	 */
	void assertErrorMandatoryfieldInConfig(String assertionText) {
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				errorConfiguration.inputTagConfigurationNameErrorConfiguration,assertionText ));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				errorConfiguration.inputTagVatNumberErrorConfiguration, assertionText));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				errorConfiguration.inputTagVatRateErrorConfiguration, assertionText));
		softAssert.assertAll();
	}
	
	void assertConfigInputTypeChecked(String assertionText) {
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
				errorConfiguration.inputTagVatRateErrorConfiguration, assertionText));
		softAssert.assertAll();
	}
}
