package glide.backoffice.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForSystem {
	
	WebDriver driver;
	public WaitForSystem(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	
	public static void waitForPageLoaded(WebDriver driver)
	{
	    ExpectedCondition<Boolean> expectation = new
	ExpectedCondition<Boolean>() 
	    {
	        public Boolean apply(WebDriver driver)
	        {
	            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	        }
	    };
	    Wait<WebDriver> wait = new WebDriverWait(driver,30);
	    try
	    {
	        wait.until(expectation);
	    }
	    catch(Throwable error)
	    {
	        //assertFalse("Timeout waiting for Page Load Request to complete.",true);
	    }
	}

}
