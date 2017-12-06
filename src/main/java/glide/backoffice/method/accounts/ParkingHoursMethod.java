package glide.backoffice.method.accounts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.accounts.AccountMgmtHomepage;
import glide.backoffice.locators.accounts.ParkingPage;
import glide.backoffice.locators.accounts.SitesAndParking;
import glide.backoffice.locators.accounts.SitesAndParkingEdit;
import glide.backoffice.locators.common.BackOfficeHomepage;
import glide.backoffice.locators.common.CommonLocators;
import glide.backoffice.utility.SeleniumUtility;

public class ParkingHoursMethod {
	WebDriver driver;
	AccountMgmtHomepage accountMgmtHomepage;
	BackOfficeHomepage backOfficeHomepage;
	CommonLocators commonLocators;
	SitesAndParking sitesAndParking;
	SitesAndParkingEdit sitesAndParkingEdit;
	ParkingPage parkingPage;
	public ParkingHoursMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.accountMgmtHomepage=PageFactory.initElements(driver, AccountMgmtHomepage.class);
		this.backOfficeHomepage=PageFactory.initElements(driver, BackOfficeHomepage.class);
		this.commonLocators=PageFactory.initElements(driver, CommonLocators.class);
		this.sitesAndParking=PageFactory.initElements(driver, SitesAndParking.class);
		this.sitesAndParkingEdit=PageFactory.initElements(driver, SitesAndParkingEdit.class);
		this.parkingPage=PageFactory.initElements(driver, ParkingPage.class);
	}
	
	
	public boolean testParkingHour() {
		SeleniumUtility.clickOnElement(driver, backOfficeHomepage.buttonTagAccountsBackOfficeHomepage);
		SeleniumUtility.fixedWait(10);
		SeleniumUtility.clickOnElement(driver,accountMgmtHomepage.liTagAccountMgmtHomepageParkingNSites );
		SeleniumUtility.fixedWait(10);
		SeleniumUtility.selectByVisibleText(driver,commonLocators.selectTagSuperCompany,"2 RCI Mobility");
		SeleniumUtility.fixedWait(10);
		SeleniumUtility.clickOnElement(driver, sitesAndParking.buttonTagSitesAndParkingEdit);
		SeleniumUtility.fixedWait(10);
		SeleniumUtility.clickOnElement(driver, sitesAndParkingEdit.buttonTagSitesAndParkingEditParkingEdit);
		SeleniumUtility.fixedWait(10);
		System.out.println("hello the parking 24/7 is selected ?" + driver.findElement(parkingPage.inputTagRadioParkingPageOpenWholeWeek).isSelected());
		if(driver.findElement(parkingPage.inputTagRadioParkingPageOpenWholeWeek).isSelected()) {
			driver.findElement(parkingPage.inputTagRadioParkingPageCustomParkingHour).click();	
		}
		SeleniumUtility.fixedWait(10);
		System.out.println(SeleniumUtility.checkElementIsVisible(driver, parkingPage.spanTagParkingPageBankHolidayText));
		System.out.println(SeleniumUtility.checkElementIsVisible(driver, parkingPage.inputTagParkingPageYesToBankHoliday));
		System.out.println(SeleniumUtility.checkElementIsVisible(driver, parkingPage.inputTagParkingPageNoToBankHoliday));
		System.out.println(SeleniumUtility.checkElementIsVisible(driver, parkingPage.spanTagParkingPageOutsideParkingArea));
		System.out.println(SeleniumUtility.checkElementIsVisible(driver, parkingPage.inputTagParkingPageYesToOutsideParkingArea));
		System.out.println(SeleniumUtility.checkElementIsVisible(driver, parkingPage.inputTagParkingPageNoToOutsideParkingArea));
		System.out.println(SeleniumUtility.checkElementIsVisible(driver, parkingPage.spanTagParkingPageOutSideParkingHourText));
		System.out.println(SeleniumUtility.checkElementIsVisible(driver, parkingPage.inputTagParkingPageYesToOutsideParkingHours));
		System.out.println(SeleniumUtility.checkElementIsVisible(driver, parkingPage.inputTagParkingPageNoToOutsideParkingHours));
		return SeleniumUtility.checkElementIsVisible(driver, parkingPage.spanTagParkingPageBankHolidayText)&&
		SeleniumUtility.checkElementIsVisible(driver, parkingPage.inputTagParkingPageYesToBankHoliday)&&
		SeleniumUtility.checkElementIsVisible(driver, parkingPage.spanTagParkingPageOutsideParkingArea)&&
		SeleniumUtility.checkElementIsVisible(driver, parkingPage.inputTagParkingPageYesToOutsideParkingArea)&&
		SeleniumUtility.checkElementIsVisible(driver, parkingPage.inputTagParkingPageNoToOutsideParkingArea)&&
		SeleniumUtility.checkElementIsVisible(driver, parkingPage.spanTagParkingPageOutSideParkingHourText)&&
		SeleniumUtility.checkElementIsVisible(driver, parkingPage.inputTagParkingPageYesToOutsideParkingHours)&&
		SeleniumUtility.checkElementIsVisible(driver, parkingPage.inputTagParkingPageNoToOutsideParkingHours);
	}

}
