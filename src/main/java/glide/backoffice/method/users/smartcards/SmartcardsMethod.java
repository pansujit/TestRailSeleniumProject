package glide.backoffice.method.users.smartcards;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.common.CommonMethods;

public class SmartcardsMethod {
    WebDriver driver;
    SmartcardsHomepageMethod smartcardsHomepageMethod;
    DetailPageSmartcardMethod detailPageSmartcardMethod;
    FilterSmartcardsMethod filterSmartcardsMethod;
    CommonMethods commonMethods;
    public SmartcardsMethod(WebDriver ldriver){
        this.driver=ldriver;
        this.smartcardsHomepageMethod= PageFactory.initElements(driver,SmartcardsHomepageMethod.class);
        this.detailPageSmartcardMethod= PageFactory.initElements(driver,DetailPageSmartcardMethod.class);
        this.filterSmartcardsMethod= PageFactory.initElements(driver,FilterSmartcardsMethod.class);
        this.commonMethods= PageFactory.initElements(driver,CommonMethods.class);

    }

    public void smartcardHomepageVerification(){
        smartcardsHomepageMethod.assertHomepageSmartCard();
    }
    
    public List<Boolean> filterEmail() {
    	filterSmartcardsMethod.clickOnFilter();
    	filterSmartcardsMethod.waitUntilDropdropMenuIsVisible();
    	filterSmartcardsMethod.clickOnEmail();
    	filterSmartcardsMethod.waitUntilDropdropMenuIsUnvisible();
    	filterSmartcardsMethod.inputEmail("sujit.pandey+24@glidemobility.com");
    	filterSmartcardsMethod.clickOnConfirmButton();
    	commonMethods.waitUntilTableContentVisible();
    	smartcardsHomepageMethod.clickOnView("0000000082E0930E");	
    	detailPageSmartcardMethod.waitUntilElementIsVisible();
    	return detailPageSmartcardMethod.assertDetailSmartcardPage("sujit.pandey+24@glidemobility.com", "sujit", "pandey", "AirStone");
    	
    }

}
