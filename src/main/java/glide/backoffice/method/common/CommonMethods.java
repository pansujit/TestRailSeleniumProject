package glide.backoffice.method.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.common.CommonLocators;
import glide.backoffice.utility.SeleniumUtility;

public class CommonMethods {
	WebDriver driver;
	CommonLocators commonLocators;
	public CommonMethods(WebDriver ldriver) {
		this.driver=ldriver;
		this.commonLocators=PageFactory.initElements(driver, CommonLocators.class);
	}
	
	public void clickOnPaginationNext() {
		SeleniumUtility.clickOnElement(driver, commonLocators.buttonTagPaginationNextCommonLocators);
	}
	
	public boolean checkVisibilityPaginationNext() {
		return SeleniumUtility.checkElementIsVisible(driver, commonLocators.buttonTagPaginationNextCommonLocators);
	}

}
