package glide.backoffice.test.users.smarcardevents;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.users.smarcardevents.SmartcardEventsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended3;

public class SmartcardEventsTest extends BaseClassExtended3{

	SoftAssert softAssert;
    @BeforeMethod
    public void clickOnSmartCards() throws MalformedURLException, InterruptedException {
        openBrowser();
        login();
        SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class);
        siteMenuItems.clickOnSmartcardEvents();
    }
    
    @Test
    public void filterTest() {
    	SmartcardEventsMethod smartcardEventsMethod=PageFactory.initElements(driver, SmartcardEventsMethod.class);
    	smartcardEventsMethod.filteringTest();
    }
    
    
    
	
}
