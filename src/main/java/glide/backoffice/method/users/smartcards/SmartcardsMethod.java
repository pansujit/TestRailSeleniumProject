package glide.backoffice.method.users.smartcards;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SmartcardsMethod {
    WebDriver driver;
    SmartcardsHomepageMethod smartcardsHomepageMethod;

    public SmartcardsMethod(WebDriver ldriver){
        this.driver=ldriver;
        this.smartcardsHomepageMethod= PageFactory.initElements(driver,SmartcardsHomepageMethod.class);
    }

    public void smartcardHomepageVerification(){
        smartcardsHomepageMethod.assertHomepageSmartCard();
    }

}
