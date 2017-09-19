package project.utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testrail.TestRailTestForTest;

public class SeleniumUtility {
	static Logger log = Logger.getLogger(SeleniumUtility.class.getName());

	WebDriver driver;

	public SeleniumUtility(WebDriver ldriver) {
		this.driver= ldriver;
	}

	public static void clickOnElement(WebElement element) {
		log.info("Clicking on the Element");
		element.click();
	}
	public static void clickOnElementF(WebElement element) {
		log.info("Clicking on the Element");
		try {
			element.click();

		}catch(Exception e) {
			log.debug("The web driver cannot find the click but it will continue without clicking the element:\n"+ e.getMessage());
		}
	}
	
	public static void sendText(WebElement element,String text) {
		log.info("typing text on the given element");
		element.sendKeys(text);
	}
	public static void clearText(WebElement element) {
		log.info("Clearing text from given element");
		element.clear();
	}
	public static void sendEnter(WebElement element) {
		log.info("keyboard action \"ENTER\" in the Element ");
		element.sendKeys(Keys.ENTER);
	}
	public static void sendEscape(WebElement element) {
		log.info("keyboard action \"ESCAPE\" in the Element ");
		element.sendKeys(Keys.ESCAPE);
	}
	public static String getText(WebElement element) {
		log.info("Taking the innertext of the given Webelement");
		return element.getText().toString();
	}
	public static boolean compareText(String text1,String text2) {
		log.info("comparing the one text to another");
		return text1.equals(text2);
	}
	public static boolean containsText(String text1,String text2) {
		log.info("compare one text contains another text");
		return text1.contains(text2);
	}
	public static boolean compareIgnoreCaseText(String text1,String text2) {
		log.info("compare one text contains another text");
		return (text1.compareToIgnoreCase(text2)==0);
	}
	
	

}
