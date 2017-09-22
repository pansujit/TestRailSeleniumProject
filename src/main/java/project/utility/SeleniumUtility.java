package project.utility;



import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class SeleniumUtility {
	 static Logger log = Logger.getLogger(SeleniumUtility.class.getName());



	public static void clickOnElement(WebElement element) {
		log.info("Clicking on the Element :" + webElementToString(element));
		element.click();
	}
	public  static void clickOnElementF(WebElement element) {
		log.info("Clicking on the Element :"+ webElementToString(element));
		try {
			element.click();

		}catch(Exception e) {
			log.debug("The web driver cannot find the click but it will continue without clicking the element :"+
		webElementToString(element) + "\n"+ e.getMessage() );
		}
	}
	
	public  static void sendText(WebElement element,String text) {
		log.info("typing text on the given element: " + webElementToString(element) );
		element.sendKeys(text);
	}
	public static void clearText(WebElement element) {
		log.info("Clearing text from given element :" + webElementToString(element));
		element.clear();
	}
	public static void sendEnter(WebElement element) {
		log.info("keyboard action \"ENTER\" in the Element :"+ webElementToString(element));
		element.sendKeys(Keys.ENTER);
	}
	public static void sendEscape(WebElement element) {
		log.info("keyboard action \"ESCAPE\" in the Element :"+ webElementToString(element));
		element.sendKeys(Keys.ESCAPE);
	}
	public static String getText(WebElement element) {
		log.info("Taking the innertext of the given Webelement :"+ webElementToString(element));
		return element.getText().toString();
	}
	public static boolean compareText(String text1,String text2) {
		log.info("comparing the one text to another");
		return text1.equals(text2);
	}
	public static boolean containsText(String text1,String text2) {
		log.info("compare one text contains another text ");
		return text1.contains(text2);
	}
	public static boolean compareIgnoreCaseText(String text1,String text2) {
		log.info("compare one text contains another text");
		return (text1.compareToIgnoreCase(text2)==0);
	}
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
	
	
	public static void  captureScreenShot(WebDriver driver,String name){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String myDate=dateFormat.format(date).replace("/", "_").replace(" ", "_").replace(":", "_");
		System.out.println("ScreenShot Taken for the test :" + name);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//The below method will save the screen shot in d drive with name "screenshot.png"
		try {
			FileUtils.copyFile(scrFile, new File("./src/test/resources/Screenshot/"+name+myDate+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static String webElementToString(WebElement element) {
		return (element.toString().split("->"))[1];
	}

}
