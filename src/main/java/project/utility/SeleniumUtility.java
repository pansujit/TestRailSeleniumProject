package project.utility;



import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class SeleniumUtility {
	static Logger log = Logger.getLogger(SeleniumUtility.class.getName());


	/**
	 * Clicking on the WebElement
	 * @param element the parameter should be WebElement
	 */
	public static void clickOnElement(WebElement element) {
		log.info("Clicking on the Element :" + webElementToString(element));
		element.click();
	}
	/**
	 * Clicking on webElement, if Fails catch the exception continue forward.
	 * @param element the parameter should be WebElement
	 */
	public  static void clickOnElementF(WebElement element) {
		log.info("Clicking on the Element :"+ webElementToString(element));
		try {
			element.click();

		}catch(Exception e) {
			log.debug("The web driver cannot find the click but it will continue without clicking the element :"+
					webElementToString(element) + "\n"+ e.getMessage() );
		}
	}
	/**
	 * The method send the text to the given WebElement
	 * @param element the parameter should be WebElement
	 * @param text the text should be String
	 */
	public  static void sendText(WebElement element,String text) {
		log.info("typing text on the given element: " + webElementToString(element) );
		element.sendKeys(text);
	}
	/**
	 * The method clears the text field of the given webElement
	 * @param element the parameter should be WebElement
	 */
	public static void clearText(WebElement element) {
		log.info("Clearing text from given element :" + webElementToString(element));
		element.clear();
	}
	/**
	 * This method sends the Keyword ENTER keys to the given WebElement
	 * @param element the parameter should be WebElement
	 */
	public static void sendEnter(WebElement element) {
		log.info("keyboard action \"ENTER\" in the Element :"+ webElementToString(element));
		element.sendKeys(Keys.ENTER);
	}
	/**
	 * This method sends the Keyboard Escape key to the given key Element
	 * @param element the parameter should be WebElement
	 */
	public static void sendEscape(WebElement element) {
		log.info("keyboard action \"ESCAPE\" in the Element :"+ webElementToString(element));
		element.sendKeys(Keys.ESCAPE);
	}
	/**
	 * This method returns the inner text of given WebElement
	 * @param element the parameter should be WebElement
	 * @return {@code String}
	 */
	public static String getText(WebElement element) {
		log.info("Taking the innertext of the given Webelement :"+ webElementToString(element));
		return element.getText().toString();
	}
	/**
	 * This method compare the two text and returns the boolean results
	 * @param text1 should be String
	 * @param text2 should be String
	 * @return {@code Boolean}
	 */
	public static boolean compareText(String text1,String text2) {
		log.info("comparing the one text to another");
		return text1.equals(text2);
	}
	/**
	 * This method return boolean result according to the one text contains another
	 * @param text1 should be String
	 * @param text2 should be String
	 * @return {@code Boolean}
	 */
	public static boolean containsText(String text1,String text2) {
		log.info("compare one text contains another text ");
		return text1.contains(text2);
	}
	/**
	 * This method returns boolean result after compare two text ignoring its case.
	 * @param text1 should be String
	 * @param text2 should be String
	 * @return {@code Boolean}
	 */
	public static boolean compareIgnoreCaseText(String text1,String text2) {
		log.info("compare one text contains another text");
		return (text1.compareToIgnoreCase(text2)==0);
	}
	
	/**
	 * This method compare the two text and returns the boolean results
	 * @param text1 should be String
	 * @param text2 should be String
	 * @return {@code Boolean}
	 */
	public static boolean compareText(WebElement element,String text2) {
		log.info("comparing the one text to another");
		return (element.getText().toString()).equals(text2);
	}
	/**
	 * This method return boolean result according to the one text contains another
	 * @param text1 should be String
	 * @param text2 should be String
	 * @return {@code Boolean}
	 */
	public static boolean containsText(WebElement element,String text2) {
		log.info("compare one text contains another text ");
		return (element.getText().toString()).contains(text2);
	}
	/**
	 * This method returns boolean result after compare two text ignoring its case.
	 * @param text1 should be String
	 * @param text2 should be String
	 * @return {@code Boolean}
	 */
	public static boolean compareIgnoreCaseText(WebElement element,String text2) {
		log.info("compare one text contains another text");
		return ((element.getText().toString()).compareToIgnoreCase(text2)==0);
	}
	
	public static void WaitElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		try {
			log.info("Waiting for maximum 30 seconds to element to be visible in DOM");
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}catch(Exception e) {
			log.error("The element cannot be clickable until 30 seconds: "+ webElementToString(element));
			return;
		}
	}
	public static void WaitElementToBeClickableByLocator(WebDriver driver, WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		try {
			log.info("Waiting for maximum 30 seconds to element to be visible in DOM");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(webElementToString(element))));
			
		}catch(Exception e) {
			log.error("The element cannot be clickable until 30 seconds: "+ webElementToString(element));
			return;
		}
	}
	
	public static void WaitElementToBeVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		try {
			log.info("Waiting for maximum 30 seconds to element to be visible in DOM");
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}catch(Exception e) {
			log.error("The element cannot be Visibled until 30 seconds: "+ webElementToString(element));
			return;
		}
	}
	
	/**
	 * This is fixed wait for the system
	 * @param sec should be integer
	 */
	public static void fixedWait(int sec) {
		sec=sec*1000;
		try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void waitForElementVisible(WebElement Element) {

	}

	/**
	 * This method  capture the screenshot of the webpage when it fails and save into the src/test/resources/screenshot
	 * folder
	 * @param driver should be WebDriver
	 * @param name should be String
	 */
	public static void  captureScreenShot(WebDriver driver,String name){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String myDate=dateFormat.format(date).replace("/", "_").replace(" ", "_").replace(":", "_");
		log.info("ScreenShot Taken for the test :" + name);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//The below method will save the screen shot in /src/test/resources/Screenshot/ with name 
		//"methodname+dateAndTime.png"
		try {
			FileUtils.copyFile(scrFile, new File("./src/test/resources/Screenshot/"+name+myDate+".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public static void printStatus(String result, String methodName) {
		log.info(String.format("The Test : \" %s \"  is  %s" ,methodName,result));
		
	}
	
	/**
	 * This method convert the WebElement to the string and remove other part other than locators
	 * @param element should be webElement
	 * @return {@code String}
	 */
	private static String webElementToString(WebElement element) {
		return (element.toString().split("->"))[1];
	}

}
