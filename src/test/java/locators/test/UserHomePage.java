package locators.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserHomePage {
	
	/*@FindBy(how = How.NAME,using="")
	public WebElement set;*/
	
	@FindBy(how=How.XPATH,using=".//div[@id='mainContainer']//header//ul/li/a[@href='#/my-bookings']")
	public WebElement inputEmail;
	
	@FindBy(how=How.XPATH,using=".//*[@class='HomePage_content']/div/div//button/span[contains(@class,'searchBooking_tab_text--oneWay')]")
	public WebElement spanTagOneway;
	
	@FindBy(how=How.XPATH,using=".//*[@class='HomePage_content']/div/div//button/span[contains(@class,'searchBooking_tab')]")
	public WebElement spanTagRoundTrip;
	


	
}
