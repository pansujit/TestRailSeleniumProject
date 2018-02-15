package glide.backoffice.method.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.common.BackOfficeSignInPage;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;

/**
 * This method will sign in the back office of glide mobility with given credential
 * @author sujitpandey
 *
 */
public class SignIn {
	
	WebDriver driver;
	BackOfficeSignInPage signInPage;
	CommonMethods commonMethods;

	public SignIn(WebDriver ldriver) {
		this.driver=ldriver;
		this.signInPage=PageFactory.initElements(driver, BackOfficeSignInPage.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);

	}
	/**
	 * This public method sign in to the back office with given username and password. 
	 * @param username - Should be String
	 * @param password - Should be String
	 */
	public void signIn(String username, String password) {
		SeleniumUtility.waitElementToBeVisible(driver, signInPage.inputTagBackOfficeSignInPageEmail);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.clickOnElement(driver, signInPage.inputTagBackOfficeSignInPageEmail);
		SeleniumUtility.clearText(driver, signInPage.inputTagBackOfficeSignInPageEmail);
		SeleniumUtility.sendText(driver, signInPage.inputTagBackOfficeSignInPageEmail, username);
		
		SeleniumUtility.fixedWait(1);
		
		SeleniumUtility.clickOnElement(driver, signInPage.inputTagBackOfficeSignInPagePassword);
		SeleniumUtility.sendText(driver, signInPage.inputTagBackOfficeSignInPagePassword, password);
		
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.clickOnElement(driver, signInPage.buttonTagBackOfficeSignInPageSubmit);
		commonMethods.waitUntilElementToBeInvisible();
		
	}

}
