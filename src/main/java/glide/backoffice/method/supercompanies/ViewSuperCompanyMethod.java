package glide.backoffice.method.supercompanies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.accounts.supercompanies.AddSC;
import glide.backoffice.locators.accounts.supercompanies.ViewSC;
import glide.backoffice.utility.SeleniumUtility;

public class ViewSuperCompanyMethod {
	WebDriver driver;
	ViewSC viewSC;
	AddSC addSC;
	public ViewSuperCompanyMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.viewSC=PageFactory.initElements(driver, ViewSC.class);
		this.addSC=PageFactory.initElements(driver, AddSC.class);

	}
	
	void clickonEditButton() {
		SeleniumUtility.clickOnElement(driver, viewSC.aTagEditSuperCompanyViewSC);
		SeleniumUtility.checkElementIsVisible(driver, addSC.buttonTagSaveButtonAddSC);
		SeleniumUtility.fixedWait(2);
	}

}
