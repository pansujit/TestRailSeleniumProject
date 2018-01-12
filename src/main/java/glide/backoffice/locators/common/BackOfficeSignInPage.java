package glide.backoffice.locators.common;

import org.openqa.selenium.By;
/**
 * This class contains all the locators of the sign in page of glide mobility admin signing page
 * @author sujitpandey
 *
 */
public class BackOfficeSignInPage {
	
	/**
	 * This locator will find Header  tag in the back Office sign-in page
	 */
	public final By spanTagBackOfficeSignInPageHeader= By.xpath(".//h2[@class='loginPage_title']/span/span");
	/**
	 * This locator will find Email  tag in the back Office sign-in page
	 */
	public final By inputTagBackOfficeSignInPageEmail= By.xpath(".//input[@name='login']");
	/**
	 * This locator will find Password  tag in the back Office sign-in page
	 */
	public final By inputTagBackOfficeSignInPagePassword= By.xpath(".//input[@name='password']");
	/**
	 * This locator will find Submit tag in the back Office sign-in page
	 */
	public final By buttonTagBackOfficeSignInPageSubmit= By.xpath(".//button[@class='ekButton ekButton--fullWidth loginForm_submitBtn']");
}
