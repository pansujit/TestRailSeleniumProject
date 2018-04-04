package glide.backoffice.method.vehicleplanning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.vehicleplanning.AddStatusPlanning;

public class AddStatusPlanningMethod {
	WebDriver driver;
	AddStatusPlanning addStatusPlanning;
	public AddStatusPlanningMethod(WebDriver ldriver) {
		this.driver= ldriver;
		this.addStatusPlanning=PageFactory.initElements(driver, AddStatusPlanning.class);
	}
	
	
}
