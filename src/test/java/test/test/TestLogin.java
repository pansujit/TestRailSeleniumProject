package test.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import method.test.Login;
import project.utility.SeleniumUtility;

public class TestLogin  {
	
	
	WebDriver driver;
	DesiredCapabilities cap;
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		cap= DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
		cap.setPlatform(Platform.WINDOWS);
		cap.setCapability(InternetExplorerDriver.
				INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);

		driver= new RemoteWebDriver(new URL("http://192.168.1.42:4444/wd/hub"),cap);
		Login loginMe=PageFactory.initElements(driver, Login.class);
		driver.navigate().to("https://web-valid-2-glide.tech.rcimobility.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
		loginMe.login();
		
	}
	
	/*@AfterMethod
	public void teardown(ITestResult result){
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			getScreenshot(driver,result.getName());
		}

	}*/


	public void getScreenshot(WebDriver driver, String name){
		SeleniumUtility.captureScreenShot(driver,name);

	}
	
	
	@AfterTest
	public void closeBrowser() {
		try {
			driver.close();
		}catch(Exception e) {
			
		}finally {
			driver.quit();
		}
	}
	
	
	
	

}
