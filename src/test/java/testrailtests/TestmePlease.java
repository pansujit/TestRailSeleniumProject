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
import org.testng.annotations.Test;

public class TestmePlease {
	
	WebDriver driver;
	
	
	@Test
	public void openBrowser() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap= DesiredCapabilities.safari();
		cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
		cap.setCapability(CapabilityType.PLATFORM, "mac");
		driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void openBrowser1() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		cap.setPlatform(Platform.MAC);
		driver= new RemoteWebDriver(new URL("http://192.168.1.42:4444/wd/hub"),cap);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

	
	@Test
	public void openBrowser2() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap= DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		cap.setPlatform(Platform.WINDOWS);
		driver= new RemoteWebDriver(new URL("http://192.168.1.42:4444/wd/hub"),cap);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

	

	
	@Test
	public void openBrowser3() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap= DesiredCapabilities.firefox();
		cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		cap.setPlatform(Platform.WINDOWS);
		driver= new RemoteWebDriver(new URL("http://192.168.1.42:4444/wd/hub"),cap);
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();
	}
	@Test
	public void openBrowser4() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap= DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
		cap.setPlatform(Platform.WINDOWS);
		cap.setCapability(InternetExplorerDriver.
				  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);

		driver= new RemoteWebDriver(new URL("http://192.168.1.42:4444/wd/hub"),cap);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
