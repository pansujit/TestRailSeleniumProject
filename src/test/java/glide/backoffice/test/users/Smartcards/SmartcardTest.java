package glide.backoffice.test.users.Smartcards;

import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.users.Smartcards.SmartcardsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SmartcardTest extends BaseClassExtended {

    @BeforeClass
    public void clickOnSmartCards() throws MalformedURLException, InterruptedException {
        OpenBrowser();
        SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class);
        siteMenuItems.clickOnSmartcards();
    }
    @Test
    public void homepageVarificationTest(){
        SmartcardsMethod smartcardsMethod= PageFactory.initElements(driver,SmartcardsMethod.class);
        smartcardsMethod.smartcardHomepageVerification();
    }

    @AfterClass(alwaysRun = true)
    public void closeAllBrowser(){
        closeBrowser();
    }
}
