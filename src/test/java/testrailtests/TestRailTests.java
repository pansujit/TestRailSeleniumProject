package testrailtests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testrail.APIException;
import testrail.TestRail;
import testrail.TestRailAPI;

@Listeners(listeners.TestListener.class)				

public class TestRailTests
{
   /* @Test
    public void testAPI() throws Exception
    {
        TestRailAPI api = new TestRailAPI();
        String testRailCase = api.getCase(1).toString();
        System.out.println(testRailCase);
    }*/
	WebDriver driver;
	/*@BeforeSuite
	public void beforeSuite() throws Exception
	{
		TestRailAPI.getCasesWithCustomfield(1);
		TestRailAPI.get_plan(5);
		for(int i=0;i<TestRailAPI.testString.size();i++)
		{
			if(TestRailAPI.testString.get(i).equalsIgnoreCase(String.format("%s, %s", Browser.chrome.getBrowserName(),OperatingSystem.mac.getOSName()))) {
				DesiredCapabilities cap= DesiredCapabilities.chrome();
				cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
				cap.setPlatform(Platform.MAC);
				driver= new RemoteWebDriver(new URL("http://192.168.1.42:4444/wd/hub"),cap);
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Thread.sleep(5000);
				System.out.println(driver.getTitle());
			}
		}

	}*/

    @Test
    @TestRail(customfield = {"baba"})
    public void passTest()
    {	driver.quit();
        Assert.assertTrue(true);
        
    }
    /*@Test
    @TestRail(customfield = {"bibi"})
    public void passTest1()
    {
        Assert.assertTrue(true);
    }
    @Test
    @TestRail(customfield = {"cici"})
    public void passTest2()
    {
        Assert.assertTrue(false);
    }
    @Test
    @TestRail(customfield = {"didi"})
    public void passTest3()
    {
        Assert.assertTrue(true);
    }*/
    
}
