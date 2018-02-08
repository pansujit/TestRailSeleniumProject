package glide.backoffice.utility;



import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class SeleniumUtility {
	private SeleniumUtility() {
		
	}
	static Logger log = Logger.getLogger(SeleniumUtility.class.getName());


	/**
	 * Clicking on the WebElement
	 * @param driver Should be WebDriver
	 * @param element the parameter should be Selenium By
	 */
	public static void clickOnElement(WebDriver driver,By element) {
		try {
			log.info("Event Click is started on Element :" + (element.toString()));
			driver.findElement(element).click();
		}catch(Exception e) {
			log.error("Click event on element :"+ element.toString()+" "+" FAILED with exception: "+e.getClass().getSimpleName());
			throw(e);
		}
	}
	/**
	 * Clicking on webElement, if Fails catch the exception continue forward.
	 * @param driver Should be WebDriver
	 * @param element the parameter should be locators
	 */
	public  static void clickOnElementF(WebDriver driver,By element) {
		log.info("Clicking on the Element :"+ element.toString());
		try {
			driver.findElement(element).click();

		}catch(Exception e) {
			log.error("Clicking on the Element :"+ element.toString()+" "+" FAILED with exception: "+e.getClass().getSimpleName());

		}
	}
	/**
	 * The method send the text to the given WebElement
	 * @param driver Should be WebDriver
	 * @param element the parameter should be Locator
	 * @param text the text should be String
	 */
	public  static void sendText(WebDriver driver,By element,String text) {
		try {
			if(text!=null) {
			driver.findElement(element).sendKeys(text);
			log.info("Typing text on the given element: " + element.toString() );
			}
		}catch(Exception e) {
			log.error("Cannot type text on element: "+ element.toString()+" "+" FAILED with exception: "+e.getClass().getSimpleName());
			throw(e);

		}	
	}
	
	/**
	 * This static method clear the input text and type the given text, in that text field.
	 * @param driver Should be WebDriver
	 * @param element the parameter should be Locator
	 * @param text the text should be String
	 */
	public  static void clearTextAndSendText(WebDriver driver,By element,String text) {
		try {
			if(text!=null) {
			driver.findElement(element).clear();
			driver.findElement(element).sendKeys(text);
			log.info("Typing text on the given element: " + element.toString() );
			}
		}catch(Exception e) {
			log.error("Cannot type text on element: "+ element.toString()+" "+" FAILED with exception: "+e.getClass().getSimpleName());
			throw(e);

		}	
	}
	
	
	/**
	 * The method clears the text field of the given webElement
	 * @param element the parameter should be Locator
	 * @param driver Should be WebDriver
	 */
	public static void clearText(WebDriver driver,By element) {
		try {
			driver.findElement(element).clear();
			log.info("Clearing text from given element :" + element.toString());
		}catch(Exception e) {
			log.error("Cannot clear text on element: "+ element.toString()+" "+" FAILED with exception: "+e.getClass().getSimpleName());
			throw(e);
		}
	}
	/**
	 * This method sends the Keyword ENTER keys to the given WebElement
	 * @param driver should be WebDriver
	 * @param element the parameter should be Selenium By
	 */
	public static void sendEnter(WebDriver driver,By element) {
		try {
			driver.findElement(element).sendKeys(Keys.ENTER);
			log.info("keyboard action \"ENTER\" in the Element :"+ element.toString());
		}catch(Exception e) {
			log.error("Cannot send ENTER key on element: "+ element.toString()+" "+" FAILED with exception: "+e.getClass().getSimpleName());
			throw(e);
		}
	}
	/**
	 * This method sends the Keyboard Escape key to the given key Element
	 * @param driver should be WebDriver
	 * @param element the parameter should be Selenium By
	 */
	public static void sendEscape(WebDriver driver,By element) {
		try {
			driver.findElement(element).sendKeys(Keys.ESCAPE);
			log.info("keyboard action \"ESCAPE\" in the Element :"+ element.toString());

		}catch(Exception e) {
			log.error("Cannot send ESCAPE key on element: "+ element.toString()+" "+" FAILED with exception: "+e.getClass().getSimpleName());
			throw(e);
		}
	}
	/**
	 * This method returns the inner text of given WebElement
	 * @param driver should be WebDriver
	 * @param element the parameter should be Selenium By
	 * @return {@code String}
	 */
	public static String getText(WebDriver driver,By element) {
		String text= "";
		try {
			text=driver.findElement(element).getText().toString();
			log.info("Taking the innertext of the given Webelement :"+ element.toString());
			return text;
		}catch(Exception e) {
			log.error("Cannot find given Element to extract text: "+ element.toString()+" "+" FAILED with exception: "+e.getClass().getSimpleName());
			throw(e);
		}
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
		if(text1.compareToIgnoreCase(text2)==0) {
			log.info("Given Text text1: " + text1 +" is equal to another text text2: "+  text2);
			return true;
		}
		else
		{
			log.info("Given Text text1: " + text1 +" is not equal to another text text2: "+  text2);
			return false;
		}
	}

	/**
	 * This method compare the two text and returns the boolean results
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 * @param text2 should be String
	 * @return {@code Boolean}
	 */
	public static boolean compareText(WebDriver driver,By element,String text2) {
		log.info("comparing the one text to another");
		return (driver.findElement(element).getText()).equals(text2);
	}
	/**
	 * This method return boolean result according to the one text contains another
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 * @param text2 should be String
	 * @return {@code Boolean}
	 */

	public static boolean containsText(WebDriver driver,By element,String text2) {
		Boolean text= false;
		try {
		text=(driver.findElement(element).getText()).contains(text2);
		log.info("compare one text contains another text ");
		return text;
		}catch(Exception e) {
			log.error("Element cannot be found to compare text: "+ element.toString()+" "+" FAILED with exception: "+e.getClass().getSimpleName());
			throw(e);
		}
	}
	/**
	 * This method returns boolean result after compare two text ignoring its case.
	 * @param text1 should be String
	 * @param text2 should be String
	 * @return {@code Boolean}
	 */
	public static boolean compareIgnoreCaseText(WebDriver driver,By element,String text2) {
		log.info("compare one text contains another text");
		return ((driver.findElement(element).getText().toString()).compareToIgnoreCase(text2)==0);
	}

	/**
	 * This method returns boolean result after compare two text ignoring its case.
	 * @param text1 should be String
	 * @param text2 should be String
	 * @return {@code Boolean}
	 */
	public static boolean compareIgnoreCaseText(WebDriver driver,WebElement element,String text2) {
		log.info("compare one text contains another text on");
		if ((element.getText()).compareToIgnoreCase(text2)==0) {
			log.info("Both text are equal");
			return true;
		}
		else {
			log.info("The text got from the webElement is :"+element.getText().toString()+ "but input text is "+ text2);
			return false;
		}
	}

	/**
	 * This method waits for given period of time to element to be clickable.
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 */
	public static void WaitElementToBeClickable(WebDriver driver, By element) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		try {
			log.info("Waiting for maximum 30 seconds to element to be clickable in DOM");
			wait.until(ExpectedConditions.elementToBeClickable(element));

		}catch(Exception e) {
			log.error("The element cannot be clickable until 30 seconds: "+ element.toString());
			return;
		}
	}
	/**
	 * This method waits for a given period of time for the element to be deleted or not attached to dom 
	 * @param driver should be WebDriver
	 * @param element Should be Selenium By
	 */
	public static void waitElementToBeStale(WebDriver driver, By element) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		try {
			log.info("Waiting for maximum 30 seconds to element to be visible in DOM");
			long x=System.currentTimeMillis();
			wait.until(ExpectedConditions.stalenessOf(driver.findElement(element)));
			long y=System.currentTimeMillis();
			log.info("The element is down: "+ "in time: " +(y-x)/1000.00);
		}catch(Exception e) {
			log.error("The element is still visible until 30 seconds: "+ element.toString());
			return;
		}
	}
	/**
	 * This is custom wait which is wait for the element to be not visibled until 30 seconds.
	 * It is loops over the in every 3seconds which means there will be at maximum 3 second of delay.
	 * @param driver should be WebDriver
	 * @param element Should be Selenium By
	 */
	public static void waitUntilElementisNotVisible(WebDriver driver,By element) {
		long x=System.currentTimeMillis();
		long y=System.currentTimeMillis();
		log.info("Waiting for maximum 30 seconds to element to be not visible in DOM");
		try {
			for(int i=0;i<15;i++) {
				if(driver.findElement(element).isDisplayed()) {
					Thread.sleep(2000);
					y=System.currentTimeMillis();
				}
				else {
					y=System.currentTimeMillis();
					break;
				}
			}
			log.error("The element visible until 30 seconds: "+ element.toString());
			return;
		}catch(Exception e) {
			log.info("The element is down: "+ element.toString()+ "in time: " +(y-x)/1000.00);
			return;
		}
	}
	/**
	 * This method waits for the Locator to be clickable for the given amount of time. 
	 * @param driver should be WebDriver
	 * @param element Should be Selenium By
	 */
	public static void waitElementToBeClickableByLocator(WebDriver driver, By element) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		try {
			log.info("Waiting for maximum 30 seconds to element to be clickable in DOM");
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(element)));

		}catch(Exception e) {
			log.error("The element cannot be clickable until 30 seconds: "+ element.toString());
			return;
		}
	}
	/**
	 * This method waits for the given element to be visible in given amount of time.
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 */
	public static void waitElementToBeVisible(WebDriver driver, By element) {
		WebDriverWait wait= new WebDriverWait(driver,30);
		try {
			log.info("Waiting for maximum 30 seconds to element to be visible in DOM");
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));

		}catch(Exception e) {
			log.error("The element cannot be Visibled until 30 seconds: "+ element.toString());
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
			log.error("Exception", e);
			Thread.currentThread().interrupt();
		}
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
		try {
			FileUtils.copyFile(scrFile, new File("./src/test/resources/Screenshot/"+name+myDate+".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param result should be String
	 * @param methodName should de String
	 */
	public static void printStatus(String result, String methodName) {
		log.info(String.format("The Test : \" %s \"  is  %s" ,methodName,result));

	}

	/**
	 * This method move the cursor to the given place of given element
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 */
	public static void moveToElementAction(WebDriver driver,By element) {
		Actions action= new Actions(driver);
		log.info("Moving to the given element using action class :"+ element.toString());
		action.moveToElement(driver.findElement(element)).build().perform();
	}
	/**
	 * This Static method uses the selenium Actions class. Using the action class, This method move mouse to the 
	 * given element and perform click on that element. When Fails, there is no exception is returned.
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 */
	public static void clickUsingAction(WebDriver driver,By element) {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		Actions action= new Actions(driver);
		log.info("Moving to the given element using action class :"+ element.toString());
		WebElement element1 = wait.until(ExpectedConditions.
                elementToBeClickable(element));
		action.moveToElement(element1).click().build().perform();
		log.info("perform click Operation on element using action class :"+ element.toString());
	}
	
	/**
	 * This method will enter the text on the given text field using selenium actions 
	 * @param driver should be webdriver
	 * @param element should be selenium by
	 * @param data should be String
	 */
	public static void actionClickAndSendKeys(WebDriver driver,By element,String data) {
		try {
			Actions action= new Actions(driver);
			log.info("Moving to the given element and inserting text using action class :"+ element.toString());
			action.moveToElement(driver.findElement(element)).click()
			.sendKeys(data)
			.build().perform();
		}catch(Exception e) {
			log.error("Moving to the given element and inserting text using action class failed with exception :"+ element.toString()+e.getClass().getSimpleName());
			throw(e);
		}
	}
	/**
	 * This method will hit Enter in the current pointer area using selenuim action
	 * @param driver should be webDriver
	 * @param key should be selenium Keys
	 */
	public static void actionSendKeys(WebDriver driver,Keys key) {
		try {
			log.info("Pressing the key: "+ key.toString()+"using action class");
			Actions action= new Actions(driver);
			action.sendKeys(key).build().perform();
		}catch(Exception e) {
			log.error("Pressing the key: "+ key.name()+"using action class failed with exception: "+e.getClass().getSimpleName());
			throw(e);
		}

	}
	public static void actionSendKeys(WebDriver driver,Keys key,By element) {
		try {
			log.info("Pressing the key: "+ key.toString()+"using action class");
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(element)).sendKeys(key).build().perform();
		}catch(Exception e) {
			log.error("Pressing the key: "+ key.name()+"using action class failed with exception: "+e.getClass().getSimpleName());
			throw(e);
		}

	}
	/**
	 * This method click on the element and hold for a time
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 */
	public static void clickAndHoldAction(WebDriver driver, By element) {
		Actions action= new Actions(driver);
		log.info("Clicking and Holding on element :"+ element.toString());
		action.clickAndHold(driver.findElement(element)).build().perform();
	}
	/**
	 * This method select the given element by  visible text from the options
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 * @param text should be String
	 */
	public static void selectByVisibleText(WebDriver driver,By element,String text) {
		if(text!=null) {
		log.info("Selecting the element by visible text in element :"+element.toString()+ " "+"with value :"+text );
		Select select= new Select(driver.findElement(element));
		select.selectByVisibleText(text);
		}
	}
	/**
	 * This method select the given element by value in option
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 * @param text should be String
	 */
	public static void selectByvalue(WebDriver driver,By element,String text) {
		if(text!=null) {
		log.info("Selecting the element by value in element :"+element.toString()+ " "+"with value :"+text );
		Select select= new Select(driver.findElement(element));
		select.selectByValue(text);
		}
	}
	/**
	 * This method checks whether the given element is displayed in DOM.
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 * @return boolean
	 */
	public static boolean checkElementIsVisible(WebDriver driver, By element) {
		boolean status=false;
		try {
			status=driver.findElement(element).isDisplayed();
			log.info("The element is visible and displayed in DOM :"+ element.toString());
			return status;

		}catch(Exception e) {
			log.error("Either element is not found or is not visible  :"+ element.toString()+ "With exception :" );
			return status;
		}
	}
	/**
	 * This method checks whether the given element is enabled in DOM.
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 * @return boolean
	 */
	public static boolean checkElementIsEnable(WebDriver driver, By element) {
		log.info("Checking whether the element is enable or not :"+ element.toString());
		try {
			return driver.findElement(element).isEnabled();

		}catch(Exception e) {
			log.info("Either element is not found or is not enable  :"+ element.toString() );
			return false;
		}
	}
	/**
	 * This method checks whether the given element is selected or not.
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 * @return boolean
	 */
	public static boolean checkElementIsSelected(WebDriver driver, By element) {
		log.info("Checking whether the element is selected or not :"+ element.toString());
		try {
			return driver.findElement(element).isSelected();

		}catch(Exception e) {
			log.info("Either element is not found or is not selected  :"+ element.toString() );
			return false;
		}
	}
	/**
	 * This method will return the attribute value of the given element
	 * @param driver should be WebDriver
	 * @param element should be Selenium By
	 * @param attrName should be String
	 * @return boolean
	 */
	public static String getAttribute(WebDriver driver, By element,String attrName) {
		return driver.findElement(element).getAttribute(attrName);
	}

	public static void movingForMonth(WebDriver driver, By elementForward,By elementBackward,String text) throws ParseException {
		int compareMonth=DateHelper.initialplannedBookingDate(text);
		if(compareMonth>0) {
			for(int i=0;i<compareMonth;i++) {
				driver.findElement(elementForward).click();
				SeleniumUtility.fixedWait(1);
			}
		}
		else if(compareMonth<0) {
			for(int i=0;i<compareMonth;i++) {
				driver.findElement(elementBackward).click();
				SeleniumUtility.fixedWait(1);
			}
		}
		else {
			return;
		}
	}

	/**
	 * This public static method return all the webelements of a given locators
	 * @param driver - should be WebDriver
	 * @param element- Should be Selenium By
	 * @return - Should be {@code List<WebElement>}
	 */
	public static List<WebElement> returnWebElements(WebDriver driver,By element) {
		List<WebElement> elements=new ArrayList<>();
		try {
			elements=driver.findElements(element);
			log.info("Returning the Web Elements in List<WebElements> Format of BY element: "+element.toString());
			return elements;
		}catch(Exception e) {
			log.error("The Element cannot appear after search, can't return List<WebElements> of element: "+element.toString());
			return elements;
		}
	}
	
	public static void clickWithJavaScript(WebDriver driver,By element) {
		try {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("return arguments[0].click();", driver.findElement(element));
		log.info("Clicking on given element is successful with JavaScript :"+ element.toString());

		}catch(Exception e) {
			log.error("Either element is not found or is not selected  :"+ element.toString() );
			
		}
		
	}
}
