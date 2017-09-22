package method.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.test.TestLocators;
import locators.test.UserHomePage;
import project.utility.SeleniumUtility;


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
		System.out.println(testLocators.inputEmail.getText());
		
		SeleniumUtility.clickOnElement(testLocators.inputEmail);
		//SeleniumUtility.clearText(testLocators.inputEmail);
		SeleniumUtility.sendText(testLocators.inputEmail, "sujit.pandey+7@glidemobility.com");
		
		SeleniumUtility.fixedWait(2);
		
		SeleniumUtility.clickOnElement(testLocators.inputPassword);
		SeleniumUtility.clearText(testLocators.inputPassword);
		SeleniumUtility.sendText(testLocators.inputPassword,"1Aaaaaaa");
		
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.clickOnElement(testLocators.ButtonSubmit);
		SeleniumUtility.WaitElementToBeVisible(driver, userHomePage.aTagMyBooking);

	}
	
	

}
