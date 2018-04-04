package glide.backoffice.method.users.Smartcards;

import glide.backoffice.locators.users.smartcards.HomepageSmartcards;
import glide.backoffice.utility.SeleniumUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class SmartcardsHomepageMethod {
    WebDriver driver;
    HomepageSmartcards homepageSmartcards;
    SoftAssert softAssert;
    public SmartcardsHomepageMethod(WebDriver ldriver){
        this.driver=ldriver;
        this.homepageSmartcards= PageFactory.initElements(driver,HomepageSmartcards.class);
        this.softAssert= new SoftAssert();
    }

    /**
     * This method wait until the refresh button is visible in smartcard homepage in backoffice
     */
    void waitUntilRefreshButtonIsVisible(){
    SeleniumUtility.checkElementIsVisible(driver,homepageSmartcards.buttonTagRefreshHomepageSmartcards);
    SeleniumUtility.fixedWait(1);
    }

    /**
     * This method checks for the table is present on the smartcard homepage or not
     */
    void assertHomepageSmartCard(){
        softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver,
                homepageSmartcards.divTagTableHomepageSmartcards),
                "The table is not present in the smartcard homepage");
        softAssert.assertAll();

    }


}