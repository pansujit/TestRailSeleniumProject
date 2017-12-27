package glide.backoffice.method.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.common.BackOfficeSignInPage;
import glide.backoffice.utility.SeleniumUtility;
import glide.backoffice.utility.WaitForSystem;

/**
 * This method will sign in the back office of glide mobility with given credential
 * @author sujitpandey
 *
 */
public class SignIn {
	
	WebDriver driver;
	BackOfficeSignInPage signInPage;

	public SignIn(WebDriver ldriver) {
		this.driver=ldriver;
		this.signInPage=PageFactory.initElements(driver, BackOfficeSignInPage.class);
	

	}
	public void signIn(String username, String password) {
		
		SeleniumUtility.clickOnElement(driver, signInPage.inputTagBackOfficeSignInPageEmail);
		SeleniumUtility.clearText(driver, signInPage.inputTagBackOfficeSignInPageEmail);
		SeleniumUtility.sendText(driver, signInPage.inputTagBackOfficeSignInPageEmail, username);
		
		SeleniumUtility.fixedWait(1);
		
		SeleniumUtility.clickOnElement(driver, signInPage.inputTagBackOfficeSignInPagePassword);
		//SeleniumUtility.clearText(driver, signInPage.inputTagBackOfficeSignInPagePassword);
		SeleniumUtility.sendText(driver, signInPage.inputTagBackOfficeSignInPagePassword, password);
		
		SeleniumUtility.fixedWait(1);
		
		SeleniumUtility.clickOnElement(driver, signInPage.buttonTagBackOfficeSignInPageSubmit);
		WaitForSystem.waitForPageLoaded(driver);
	
		SeleniumUtility.fixedWait(5);
		
	}

}
