package glide.backoffice.test.baseclass;

import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;

import glide.backoffice.method.common.CheckData.Parameter;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.login.SignIn;
import glide.backoffice.utility.SeleniumUtility;
import listeners.MethodListener;





@Listeners({MethodListener.class})
 abstract public  class BaseClassExtended3 {
	
	public Logger log = Logger.getLogger(BaseClassExtended3.class.getName());

	static{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        System.setProperty("current.date", dateFormat.format(new Date()));
    }
	protected WebDriver driver;
	DesiredCapabilities cap;
	
	protected void openBrowser() throws MalformedURLException, InterruptedException {	
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		driver = new ChromeDriver(options);
		driver.navigate().to(Config.get(Parameter.BO_URL));//Config.getProperty("BO_URL"));
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		
		/*java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Point position = new Point(0, 0);
		driver.manage().window().setPosition(position);
		Dimension maximizedScreenSize =
		new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
		driver.manage().window().setSize(maximizedScreenSize);*/
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String screenWidth = jse.executeScript("return screen.availWidth").toString();
		String screenHeight = jse.executeScript("return screen.availHeight").toString();
		int intScreenWidth = Integer.parseInt(screenWidth);
		int intScreenHeight = Integer.parseInt(screenHeight);
		org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(intScreenWidth, intScreenHeight);
		driver.manage().window().setSize(d);
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
	}
	
	protected void login() {
		SignIn signin=PageFactory.initElements(driver, SignIn.class);
		signin.signIn(Config.getProperty("BO_ADMIN"), Config.getProperty("BO_PASSWORD"));
		//signin.signIn("sujit.pandey+1@glidemobility.com", "1Aaaaaaa");
	}



	private void getScreenshot(WebDriver driver, String name){
		SeleniumUtility.captureScreenShot(driver,name);

	}
	
	@AfterMethod(alwaysRun=true)
	public void closeOnlyInstance(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus())
		{
			SeleniumUtility.printStatus("Failed",result.getName());
			getScreenshot(driver,result.getName());
		}
		else {
			SeleniumUtility.printStatus("Passed",result.getName());
		}
		try {
			driver.manage().deleteAllCookies();
		} catch (Exception ignored) {
			System.out.println("Unable to clear cookies, driver object is not viable...");
		}
		
		try {
			driver.manage().deleteAllCookies();
		}catch(Exception e) {
			log.error("Unable to clear cookies "+ e.getMessage());
		}
		driver.close();
	}
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
			driver.quit();
		
	}
}
