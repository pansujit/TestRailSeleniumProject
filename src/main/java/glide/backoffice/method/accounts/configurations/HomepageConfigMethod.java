package glide.backoffice.method.accounts.configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.accounts.configurations.HomepageConfig;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;

public class HomepageConfigMethod {
	WebDriver driver;
	HomepageConfig homepageConfig;
	CommonMethods commonMethods;
	AddEditConfigMethod addEditConfigMethod;
	SoftAssert softAssert;
	public HomepageConfigMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageConfig=PageFactory.initElements(driver, HomepageConfig.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);
		this.addEditConfigMethod=PageFactory.initElements(driver, AddEditConfigMethod.class);
		this.softAssert= new SoftAssert();
	}
	/**
	 * This method clicks on the Add A Configuration button in configuration homepage in backoffice
	 */
	void clickOnAddConfigButton() {
		SeleniumUtility.clickUsingAction(driver, homepageConfig.aTagAddConfigHomepageConfig);
	}

	/**
	 * This method waits for the Add A Configuration button is visible in configuration homepage in backoffice
	 */
	void waitAddAConfigButtonToBeVisible() {
		SeleniumUtility.waitElementToBeClickable(driver, homepageConfig.aTagAddConfigHomepageConfig);
		SeleniumUtility.fixedWait(1);
	}

	/**
	 * This method click on the pagination next button until the given configuration is not appeared in the configuration homepage table.
	 * @param - Should be String
	 */
	void clickOnEditConfigButton(String configName) {
		if(commonMethods.checkVisibilityPaginationNext()) {
			while(commonMethods.checkVisibilityPaginationNext()) {
				if(SeleniumUtility.checkElementIsVisible(driver, homepageConfig.spanTagConfigNameHomepageConfig(configName))) {
					SeleniumUtility.clickOnElement(driver, homepageConfig.buttonTagEditHomepageConfig(configName));
					addEditConfigMethod.waitSaveButtonIsVisible();
					break;
				}
				else {
					commonMethods.clickOnPaginationNext();
				}
			}
		}
		else {
			SeleniumUtility.clickOnElement(driver, homepageConfig.buttonTagEditHomepageConfig(configName));
			addEditConfigMethod.waitSaveButtonIsVisible();
		}
	}
	
	/**
	 * This method compares the given configuration property in the table with given input 
	 * @param - Should be String
	 */
	void assertAddEditConfig(String configName, String vatNumber,String vatPercentage) {
		if(commonMethods.checkVisibilityPaginationNext()) {
			while(commonMethods.checkVisibilityPaginationNext()) {
				if(SeleniumUtility.checkElementIsVisible(driver, homepageConfig.spanTagConfigNameHomepageConfig(configName))) {
					softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, homepageConfig.spanTagVatNumberHomepageConfig(configName), vatNumber));
					//softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
					//		homepageConfig.spanTagVatPercentageHomepageConfig(configName),
					//		Double.toString(Double.parseDouble(vatPercentage)*100)+"%"));
					softAssert.assertAll();
					break;
				}
				else {
					commonMethods.clickOnPaginationNext();
				}
			}
		}
		else {
			softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, homepageConfig.spanTagVatNumberHomepageConfig(configName), vatNumber));
			softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver, 
					homepageConfig.spanTagVatPercentageHomepageConfig(configName), 
					Float.toString((Float.parseFloat(vatPercentage)*100))+"%"));
			softAssert.assertAll();
		}
	}





}
