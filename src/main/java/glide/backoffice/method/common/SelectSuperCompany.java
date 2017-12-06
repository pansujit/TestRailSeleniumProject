package glide.backoffice.method.common;


import static org.testng.Assert.assertFalse;

import java.lang.reflect.Method;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import glide.backoffice.locators.bookings.BookingHomepage;
import glide.backoffice.locators.common.BackOfficeHomepage;
import glide.backoffice.locators.common.CommonLocators;
import glide.backoffice.utility.SeleniumUtility;
import glide.backoffice.utility.WaitForSystem;

public class SelectSuperCompany {
	BookingHomepage bookingHomepage;
	BackOfficeHomepage backOfficeHomepage;
	CommonLocators commonLocators;

	WebDriver driver;

	public SelectSuperCompany(WebDriver ldriver) {
		this.driver = ldriver;
		this.bookingHomepage = PageFactory.initElements(driver, BookingHomepage.class);
		this.backOfficeHomepage = PageFactory.initElements(driver, BackOfficeHomepage.class);
		this.commonLocators = PageFactory.initElements(driver, CommonLocators.class);

	}

	public void selectSuperCompany() {
		SeleniumUtility.clickOnElement(driver, commonLocators.divTagSuperCompanyCommonLocators);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionClickAndSendKeys(driver, commonLocators.inputTagSuperCompanyCommonLocators, "AirStone");
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		WaitForSystem.waitForPageLoaded(driver);
		SeleniumUtility.fixedWait(2);
	}
	public void clickOnMenuBar() {
		if(!SeleniumUtility.checkElementIsVisible(driver, backOfficeHomepage.aTagBookingsBackOfficeHomepage)) {
			SeleniumUtility.clickOnElement(driver, backOfficeHomepage.buttonTagMenuIconBackOfficeHomepage);
		}
	}
	


}
