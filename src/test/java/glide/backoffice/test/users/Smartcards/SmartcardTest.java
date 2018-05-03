package glide.backoffice.test.users.Smartcards;

import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.users.smartcards.SmartcardsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;
import glide.backoffice.test.baseclass.BaseClassExtended3;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SmartcardTest extends BaseClassExtended3 {

    @BeforeMethod
    public void clickOnSmartCards() throws MalformedURLException, InterruptedException {
        openBrowser();
        login();
        SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class);
        siteMenuItems.clickOnSmartcards();
    }
    @Test
    public void homepageVarificationTest(){
        SmartcardsMethod smartcardsMethod= PageFactory.initElements(driver,SmartcardsMethod.class);
        smartcardsMethod.smartcardHomepageVerification();
    }

}
