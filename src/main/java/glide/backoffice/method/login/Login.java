package glide.backoffice.method.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import glide.backoffice.utility.SeleniumUtility;
import locators.test.TestLocators;
import locators.test.UserHomePage;


public class Login {
	
	WebDriver driver;
	TestLocators testLocators;
	UserHomePage userHomePage;
	public Login(WebDriver ldriver) {
		this.driver=ldriver;
		this.testLocators=PageFactory.initElements(driver, TestLocators.class);
		this.userHomePage=PageFactory.initElements(driver, UserHomePage.class);

		
	}
	
	public void login() {
		SeleniumUtility.fixedWait(2);		
		SeleniumUtility.clickOnElement(driver,testLocators.inputEmail);
		SeleniumUtility.clearText(driver,testLocators.inputEmail);
		SeleniumUtility.sendText(driver,testLocators.inputEmail, "sujit.pandey+7@glidemobility.com");
		
		SeleniumUtility.fixedWait(2);
		
		SeleniumUtility.clickOnElement(driver,testLocators.inputPassword);
		SeleniumUtility.clearText(driver,testLocators.inputPassword);
		SeleniumUtility.sendText(driver,testLocators.inputPassword,"1Aaaaaaa");
		
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.clickOnElement(driver,testLocators.ButtonSubmit);
		SeleniumUtility.waitElementToBeVisible(driver, userHomePage.aTagMyBooking);

	}
	
	

}
