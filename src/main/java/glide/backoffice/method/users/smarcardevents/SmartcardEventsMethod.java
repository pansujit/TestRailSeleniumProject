package glide.backoffice.method.users.smarcardevents;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SmartcardEventsMethod {
	static Logger log = Logger.getLogger(SmartcardEventsMethod.class.getName());
	WebDriver driver;
	FilterSmartcardEventsMethod filterSmartcardEventsMethod;
	public SmartcardEventsMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.filterSmartcardEventsMethod=PageFactory.initElements(driver, FilterSmartcardEventsMethod.class);
	}
	
	
	public void filteringTest() {
		filterSmartcardEventsMethod.clickToDisplayDropdownInFilterKey();
		filterSmartcardEventsMethod.clickOnAction();
		
		filterSmartcardEventsMethod.clickToDisplayDropdownInFiltervalue();
		filterSmartcardEventsMethod.clickAndSelectFilterValueInDropdown("OPEN");
		
		filterSmartcardEventsMethod.clickToDisplayDropdownInFilterKey();
		filterSmartcardEventsMethod.clickOnResult();
		
		filterSmartcardEventsMethod.clickToDisplayDropdownInFiltervalue();
		filterSmartcardEventsMethod.clickAndSelectFilterValueInDropdown("SUCCESS");
		
		filterSmartcardEventsMethod.clickToDisplayDropdownInFilterKey();
		filterSmartcardEventsMethod.clickOnUserEmail();
		
		filterSmartcardEventsMethod.inputEmail("sujit.pandey+14@gmail.com");
		filterSmartcardEventsMethod.clickOnCofirmButton();
		
		filterSmartcardEventsMethod.getActionText();
		filterSmartcardEventsMethod.getResultText();
		filterSmartcardEventsMethod.getUserEmailText();
		
		filterSmartcardEventsMethod.clearAction();
		filterSmartcardEventsMethod.clearResult();
		filterSmartcardEventsMethod.clearEmail();
	}
}
