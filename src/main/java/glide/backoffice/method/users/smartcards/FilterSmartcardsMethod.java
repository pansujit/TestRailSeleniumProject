package glide.backoffice.method.users.smartcards;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.users.smartcards.FilterSmartcards;
import glide.backoffice.utility.SeleniumUtility;

public class FilterSmartcardsMethod {
	
	WebDriver driver;
	FilterSmartcards filterSmartcards;
	public FilterSmartcardsMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.filterSmartcards=PageFactory.initElements(driver, FilterSmartcards.class);
	}
	
	void clickOnFilter() {
		SeleniumUtility.clickOnElement(driver, filterSmartcards.divTagFilterFilterSmartcards);
	}
	void clickOnEmail() {
		SeleniumUtility.clickOnElement(driver, filterSmartcards.divTagFilterKeyEmailFilterSmartcards);
	}
	
	void inputEmail(String email) {
		SeleniumUtility.clearTextAndSendText(driver, filterSmartcards.inputTagFilterValueEmailFilterSmartcards, email);
	}
	
	void clickOnConfirmButton() {
		SeleniumUtility.clickOnElement(driver, filterSmartcards.divTagConfirmFilterSmartcards);
	}
	void waitUntilDropdropMenuIsVisible(){
		SeleniumUtility.waitElementToBeVisible(driver, filterSmartcards.divTagMenuFilterSmartcards);
		SeleniumUtility.fixedMilliSecondWait();
	}
	
	void waitUntilDropdropMenuIsUnvisible(){
		SeleniumUtility.waitUntilElementisNotVisible(driver, filterSmartcards.divTagMenuFilterSmartcards);
		SeleniumUtility.fixedMilliSecondWait();
		}

}
