package glide.backoffice.method.bookings;


import static org.testng.Assert.assertFalse;

import java.time.LocalTime;
import java.util.List;

import glide.backoffice.method.filter.BookingsFilter;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import glide.backoffice.locators.bookings.FindVehicleBooking;
import glide.backoffice.locators.bookings.HomepageBookings;
import glide.backoffice.locators.menuitems.SidebarMenuItems;
import glide.backoffice.locators.bookings.FindMemberBooking;

import glide.backoffice.utility.DateHelper;
import glide.backoffice.utility.SeleniumUtility;

public class Booking implements Testme {

	SidebarMenuItems sidebarMenuItems;
	WebDriver driver;
	FindMemberBooking findMemberBooking;
	FindVehicleBooking findVehicleBooking;
	BookingsFilter bookingsFilter;
	HomepageBookings homepageBookings;
	SideMenuItemsMethod siteMenuItems;
	public Booking(WebDriver ldriver) {
		this.driver=ldriver;
		this.sidebarMenuItems=PageFactory.initElements(driver, SidebarMenuItems.class);
		this.findMemberBooking=PageFactory.initElements(driver, FindMemberBooking.class);
		this.findVehicleBooking=PageFactory.initElements(driver, FindVehicleBooking.class);
		this.bookingsFilter= PageFactory.initElements(driver,BookingsFilter.class);
		this.homepageBookings= PageFactory.initElements(driver,HomepageBookings.class);
		this.siteMenuItems= PageFactory.initElements(driver,SideMenuItemsMethod.class);


	}


	private void clickOnBookings() {
		SeleniumUtility.clickOnElement(driver,sidebarMenuItems.aTagBookingsSidebarMenuItems);
	}
	private void clickOnCreateBooking() {
		SeleniumUtility.clickOnElement(driver, homepageBookings.buttonTagCreateBookingHomepageBookings);
		SeleniumUtility.waitElementToBeVisible(driver, findMemberBooking.inputTagNameFindMemberBooking);
		SeleniumUtility.fixedWait(1);
	}
	private void inputEmailInSearchBox() {
		SeleniumUtility.sendText(driver, findMemberBooking.inputTagEmailFindMemberBooking, "sujit.pandey+24@glidemobility.com");
	}
	private void clickOnSearch() {
		SeleniumUtility.clickOnElement(driver, findMemberBooking.buttonTagSearchFindMemberBooking);
		SeleniumUtility.fixedWait(3);
	}
	private void clickOnBook() {
		SeleniumUtility.clickOnElement(driver, findMemberBooking.buttonTagBookFindMemberBooking("sujit.pandey+24@glidemobility.com"));
		SeleniumUtility.fixedWait(3);
	}
	private void clickOnRoundTrip() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.divTagCheckRoundTripFindVehicleBooking);
	}
	private void inputStartAddress() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking);
		//SeleniumUtility.sendText(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking, "testCompanySite");
		SeleniumUtility.sendText(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking, "1 Rue de Gramont, 75002 Paris, France");

		SeleniumUtility.fixedWait(1);
		SeleniumUtility.sendEnter(driver, findVehicleBooking.inputTagStartAddressFindVehicleBooking);
		SeleniumUtility.fixedWait(1);
	}
	private void selectInputAddress() {
		SeleniumUtility.moveToElementAction(driver, findVehicleBooking.liTagStartAddressPopupFindVehicleBooking("testCompanySite"));
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.liTagStartAddressPopupFindVehicleBooking("testCompanySite"));
		SeleniumUtility.fixedWait(1);
	}
	private void selectStartDate() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagStartDateFindVehicleBooking);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER,findVehicleBooking.divTagStartDatePopupFindVehicleBooking);
		SeleniumUtility.fixedWait(1);
	}
	private void selectStartHour(int extrahour) {
		System.out.println("KK"+LocalTime.now().getHour());
		String x=Integer.toString(LocalTime.now().getHour()+extrahour);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagStartHourFindVehicleBooking, x);
		SeleniumUtility.fixedWait(1);
	}
	private void selectStartMinute(int extraMinute) {
		String x= Integer.toString(LocalTime.now().getMinute()+extraMinute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagStartMinuteFindVehicleBooking, x);
		SeleniumUtility.fixedWait(1);

	}

	private void selectEndDate() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagEndDateFindVehicleBooking);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER,findVehicleBooking.divTagEndDatePopupFindVehicleBooking);
		SeleniumUtility.fixedWait(1);
	}
	private void selectEndHour(int extrahour) {
		String x=Integer.toString(LocalTime.now().getHour()+extrahour);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagEndHourFindVehicleBooking, x);
		SeleniumUtility.fixedWait(1);

	}
	private void selectEndMinute(int extraMinute) {
		String x= Integer.toString(LocalTime.now().getMinute()+extraMinute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagEndMinuteFindVehicleBooking, x);
		SeleniumUtility.fixedWait(1);

	}

	private void ClickOnSearchBooking() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.buttonTagSearchFindVehicleBooking);
		SeleniumUtility.fixedWait(5);
	}
	private void startHourAndMinute(int hours, int minute) {
		String[] data=DateHelper.hourAndMinute(hours, minute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagStartHourFindVehicleBooking, data[0]);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagStartMinuteFindVehicleBooking,  data[1]);
		SeleniumUtility.fixedWait(1);

	}
	private void endHourAndMinute(int hours, int minute) {
		String[] data=DateHelper.hourAndMinute(hours, minute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagEndHourFindVehicleBooking, data[0]);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.selectTagEndMinuteFindVehicleBooking, data[1]);
		SeleniumUtility.fixedWait(1);

	}
	private void clickOnConfirmBooking() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.buttonTagConfirmFindVehicleBooking("kkkkkkkkk", "PRIVATE"));
		SeleniumUtility.fixedWait(3);
	}
	private void inputCustomField() {
		SeleniumUtility.sendText(driver, findVehicleBooking.inputTagCustomFieldFindVehicleBooking, "hello");
		SeleniumUtility.fixedWait(3);
	}
	private void ClickOnSaveButton() {

		SeleniumUtility.moveToElementAction(driver, findVehicleBooking.buttonTagSaveFindVehicleBooking);
		SeleniumUtility.actionClickAndSendKeys(driver,  findVehicleBooking.buttonTagSaveFindVehicleBooking, "hello");
		//SeleniumUtility.fixedWait(3);
	}
	private void refreshPage() {
		driver.navigate().refresh();
	}



	public void waitForPageToLoad(WebDriver driver) {
		ExpectedCondition < Boolean > pageLoad = new
				ExpectedCondition < Boolean > () {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};

		Wait < WebDriver > wait = new WebDriverWait(driver, 60);
		try {
			wait.until(pageLoad);
		} catch (Throwable pageLoadWaitError) {
		}
	}
	private void clickOnInvoices() {
		SeleniumUtility.clickOnElement(driver, By.xpath(".//a[contains(@href,'#/invoices')]"));
	}

	public void createBooking() {
		siteMenuItems.clickOnBookings();
		SeleniumUtility.fixedWait(2);
		clickOnCreateBooking();
		inputEmailInSearchBox();
		clickOnSearch();
		clickOnBook();
		clickOnRoundTrip();
		inputStartAddress();
		//selectInputAddress();
		selectEndDate();
		endHourAndMinute(1,30);
		
		selectStartDate();
		startHourAndMinute(0,15);


		ClickOnSearchBooking();
		clickOnConfirmBooking();
		/*inputCustomField();
		ClickOnSaveButton();
		//waitForPageToLoad(driver) ;
		SeleniumUtility.fixedWait(10);

		clickOnInvoices();
		SeleniumUtility.fixedWait(6);
		clickOnBookings();
		//filterBooking();
		//CheckBookingStatus();*/

	}
	public void cancelBooking() {
		//ClickOnBookingView();
		//ClickOnCancelBooking();
		// ClickOnSubmit();
		clickOnInvoices();
		clickOnBookings();
	}
	public void finishedBooking() {
		createBooking();
		//start using mobile
		// finishBooking();

	}
	public void ExportBooking() {
		clickOnBookings();
		//clickOnExportBooking();	
	}
	public void filterTestBooking() {
		// clickOnFilter();
		//TypeOnName();
		//todo
	}

	/**
	 * This is booking filter test
	 * @return 
	 */
	public boolean bookingFilter(String firstname,String lastname, String email,String plateNumber, String vehicleBrand,
			String bookingId,String startDate,String enddate,String vehicleModel,String invoiceError,
			String status,String delayed){
		clickOnBookings();
		SeleniumUtility.fixedWait(10);
	return	testmine(driver.findElements(By.xpath(".//table/tbody/tr/td[2]/button")),driver,"sujit pandey",firstname) &&
		testmine(driver.findElements(By.xpath(".//table/tbody/tr/td[2]/button")),driver,"sujit pandey",lastname) &&
		testmine(driver.findElements(By.xpath(".//table/tbody/tr/td[9]/span/span/span/span")),driver,"cancelled",status);
	}


	@Override
	public boolean testmine(List<WebElement> elements, WebDriver driver, String text, String inputText) {
		boolean status=true;
		if(inputText==null) {
			return status;
		}
		for(WebElement element:elements) {
			status=SeleniumUtility.compareIgnoreCaseText(driver, element, text);
			if(!status) {
				break;
			}
		}
		return status;
	}
	

}
