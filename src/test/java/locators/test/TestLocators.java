package locators.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestLocators {
	
	/*@FindBy(how = How.NAME,using="")
	public WebElement set;*/
	
	@FindBy(how=How.XPATH,using=".//div[@id='mainContainer']//div[@class='loginPage']//div[@class='loginBox']//form/div//input[@type='email']")
	public WebElement inputEmail;
	
	@FindBy(how=How.XPATH,using=".//div[@id='mainContainer']//div[@class='loginPage']//div[@class='loginBox']//form/div//input[@type='password']")
	public WebElement inputPassword;
	
	@FindBy(how=How.XPATH,using=".//div[@id='mainContainer']//div[@class='loginPage']//div[@class='loginBox']//form//button[contains(@class,'loginForm_submitBtn')]")
	public WebElement ButtonSubmit;

}
