package locators.test;

import org.openqa.selenium.By;


public class TestLocators {
	
	/*@FindBy(how = How.NAME,using="")
	public WebElement set;*/
	
	public final By inputEmail=By.xpath(".//div[@id='mainContainer']//div[@class='loginPage']//div[@class='loginBox']//form/div//input[@type='email']");
	public final By inputPassword=By.xpath(".//div[@id='mainContainer']//div[@class='loginPage']//div[@class='loginBox']//form/div//input[@type='password']");
	public final By ButtonSubmit=By.xpath(".//div[@id='mainContainer']//div[@class='loginPage']//div[@class='loginBox']//form//button[contains(@class,'loginForm_submitBtn')]");

	public By testemail(String replacementText) {
		String test= "avcvcv/xxxxx/tt";
		return By.xpath(test.replace("xxxx", replacementText));
	}
}
