package testrailtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import listeners.TestClassISuiteListener;

public class BaseClass {
	WebDriver driver;

	@BeforeClass
	public void openBrowser() throws MalformedURLException, InterruptedException {
		String data=TestClassISuiteListener.testme;
		DesiredCapabilities cap;
		switch(data){
		case "internet explorer, windows":
			cap= DesiredCapabilities.internetExplorer();
			cap.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
			cap.setPlatform(Platform.WINDOWS);
			cap.setCapability(InternetExplorerDriver.
					INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);

			driver= new RemoteWebDriver(new URL("http://192.168.1.42:4444/wd/hub"),cap);
			break;
		case "safari, mac":
			cap= DesiredCapabilities.safari();
			cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
			cap.setCapability(CapabilityType.PLATFORM, "mac");
			driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			break;
		case "chrome, windows":
			cap= DesiredCapabilities.chrome();
			cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			cap.setPlatform(Platform.WINDOWS);
			driver= new RemoteWebDriver(new URL("http://192.168.1.42:4444/wd/hub"),cap);
			break;
		case "firefox, windows":
			cap= DesiredCapabilities.firefox();
			cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");
			cap.setPlatform(Platform.WINDOWS);
			driver= new RemoteWebDriver(new URL("http://192.168.1.42:4444/wd/hub"),cap);
			break;
		}
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);

	}



	@AfterClass
	public void closeBrowser() {
		try {
		driver.quit();
		}catch(Exception e) {
			
		}finally {
			driver.close();
			driver.quit();
		}
		
	}



}
