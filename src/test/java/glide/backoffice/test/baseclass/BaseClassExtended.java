package glide.backoffice.test.baseclass;

import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import glide.backoffice.method.login.SignIn;
import glide.backoffice.utility.SeleniumUtility;
import listeners.MethodListener;
@Listeners({MethodListener.class})
public abstract class BaseClassExtended {

	static{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        System.setProperty("current.date", dateFormat.format(new Date()));
    }
	protected WebDriver driver;
	DesiredCapabilities cap;
	@BeforeTest
	public void OpenBrowser() throws MalformedURLException, InterruptedException {
		
		/*cap= DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
		cap.setPlatform(Platform.WINDOWS);
		cap.setCapability(InternetExplorerDriver.
				INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);

		driver= new RemoteWebDriver(new URL("http://192.168.1.42:4444/wd/hub"),cap);*/
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://admin-valid-2-glide.tech.rcimobility.com/#/login");
		//driver.navigate().to("https://web-dev-2-glide.tech.rcimobility.com/#/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
		login();

	}
	private void login() {
		SignIn signin=PageFactory.initElements(driver, SignIn.class);
		signin.signIn("admin@glidemobility.com", "1Aaaaaaa");
		//signin.signIn("sujit.pandey+1@glidemobility.com", "1Aaaaaaa");
	}
	
	@AfterMethod
	public void teardown(ITestResult result){
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			SeleniumUtility.printStatus("Failed",result.getName());
			getScreenshot(driver,result.getName());
		}
		else {
			SeleniumUtility.printStatus("Passed",result.getName());
		}

	}


	private void getScreenshot(WebDriver driver, String name){
		SeleniumUtility.captureScreenShot(driver,name);

	}
	
	
	/*@AfterTest
	public void closeBrowser() {
		try {
			driver.close();
		}catch(Exception e) {
			
		}finally {
			driver.quit();
		}
	}*/
}
