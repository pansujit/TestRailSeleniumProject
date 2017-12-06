package locators.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserHomePage {
	
	/*@FindBy(how = How.NAME,using="")
	public WebElement set;*/

	public final By aTagMyBooking=By.xpath(".//div[@id='mainContainer']//header//ul/li/a[@href='#/my-bookings']");

	public final By spanTagOneway=By.xpath(".//*[@class='HomePage_content']/div/div//button/span[contains(@class,'searchBooking_tab_text--oneWay')]");

	public final By spanTagRoundTrip=By.xpath(".//*[@class='HomePage_content']/div/div//button/span[contains(@class,'searchBooking_tab')]");


	
}
