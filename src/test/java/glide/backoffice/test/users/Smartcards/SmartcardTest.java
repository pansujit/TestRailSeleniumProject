package glide.backoffice.test.users.Smartcards;

import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.users.smartcards.SmartcardsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended3;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class SmartcardTest extends BaseClassExtended3 {
	SoftAssert softAssert;
    @BeforeMethod
    public void clickOnSmartCards() throws MalformedURLException, InterruptedException {
        openBrowser();
        login();
        SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class);
        siteMenuItems.clickOnSmartcards();
    }
   /* @Test
    public void homepageVarificationTest(){
        SmartcardsMethod smartcardsMethod= PageFactory.initElements(driver,SmartcardsMethod.class);
        smartcardsMethod.smartcardHomepageVerification();
    }*/
    @Test
    public void homepageVarificationTest(){
    	softAssert= new SoftAssert();
    	List<Boolean> assertValue= new ArrayList<>();
        SmartcardsMethod smartcardsMethod= PageFactory.initElements(driver,SmartcardsMethod.class);
        assertValue=smartcardsMethod.filterEmail();
        softAssert.assertTrue(assertValue.get(0), "The Activation link for this user is not available");
        softAssert.assertTrue(assertValue.get(1), "The Deactivation link for this user is not available");
        softAssert.assertTrue(assertValue.get(2), "The status 'Active/Disable' is not displayed");
        softAssert.assertTrue(assertValue.get(3), "The email address is doesnot matched with given email address");
        softAssert.assertTrue(assertValue.get(4), "The full name is not match with the given full name");
        softAssert.assertTrue(assertValue.get(5), "The super company is not match with given super company");
        softAssert.assertAll();

    }

}
