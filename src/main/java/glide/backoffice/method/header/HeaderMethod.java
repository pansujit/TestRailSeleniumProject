package glide.backoffice.method.header;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.headers.HeaderItem;
import glide.backoffice.utility.SeleniumUtility;

public class HeaderMethod {
	
	WebDriver driver;
	HeaderItem headerItem;
	public HeaderMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.headerItem=PageFactory.initElements(driver, HeaderItem.class);
	}
	
	
	public void selectSuperCompany(String superCompanyName) {
		if(superCompanyName==null) {
			return;
		}
		SeleniumUtility.clickOnElement(driver, headerItem.buttonTagSuperCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.moveToElementAction(driver, headerItem.inputTagSuperCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionClickAndSendKeys(driver, headerItem.inputTagSuperCompaniesHeaderItem, superCompanyName);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		SeleniumUtility.fixedWait(5);
	}
	public void selectSuperCompany() {
		SeleniumUtility.clickOnElement(driver, headerItem.buttonTagSuperCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.moveToElementAction(driver, headerItem.inputTagSuperCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionClickAndSendKeys(driver, headerItem.inputTagSuperCompaniesHeaderItem, "Airstone");
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		SeleniumUtility.fixedWait(5);
	}
	public void selectCompany(String companyName) {
		if(companyName==null) {
			return;
		}
		SeleniumUtility.clickOnElement(driver, headerItem.buttonTagCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.moveToElementAction(driver, headerItem.inputTagCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionClickAndSendKeys(driver, headerItem.inputTagCompaniesHeaderItem, companyName);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		SeleniumUtility.fixedWait(5);
	}
	public void selectCompany() {
		SeleniumUtility.clickOnElement(driver, headerItem.buttonTagSuperCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.moveToElementAction(driver, headerItem.inputTagCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionClickAndSendKeys(driver, headerItem.inputTagCompaniesHeaderItem, "testingCompany");
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		SeleniumUtility.fixedWait(5);
	}

}
