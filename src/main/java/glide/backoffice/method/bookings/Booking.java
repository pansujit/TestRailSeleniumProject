package glide.backoffice.method.bookings;


import static org.testng.Assert.assertFalse;

import java.time.LocalTime;

import glide.backoffice.method.filter.BookingsFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import glide.backoffice.locators.bookings.BookCarPage;
import glide.backoffice.locators.bookings.BookingHomepage;
import glide.backoffice.locators.bookings.CreateBookingMemberPage;
import glide.backoffice.locators.common.BackOfficeHomepage;
import glide.backoffice.locators.common.CommonLocators;
import glide.backoffice.utility.DateHelper;
import glide.backoffice.utility.SeleniumUtility;

public class Booking {

	BookingHomepage bookingHomepage;
	BackOfficeHomepage backOfficeHomepage;
	CommonLocators commonLocators;
	WebDriver driver;
	CreateBookingMemberPage createBookingMemberPage;
	BookCarPage bookCarPage;
	BookingsFilter bookingsFilter;
	public Booking(WebDriver ldriver) {
		this.driver=ldriver;
		this.bookingHomepage=PageFactory.initElements(driver, BookingHomepage.class);
		this.backOfficeHomepage=PageFactory.initElements(driver, BackOfficeHomepage.class);
		this.commonLocators=PageFactory.initElements(driver, CommonLocators.class);
		this.createBookingMemberPage=PageFactory.initElements(driver, CreateBookingMemberPage.class);
		this.bookCarPage=PageFactory.initElements(driver, BookCarPage.class);
		this.bookingsFilter= PageFactory.initElements(driver,BookingsFilter.class);

	}


	private void clickOnBookings() {
		SeleniumUtility.clickOnElement(driver,backOfficeHomepage.aTagBookingsBackOfficeHomepage);
	}
	private void ClickOnCreateBooking() {
		SeleniumUtility.clickOnElement(driver, bookingHomepage.buttonTagCreateBooking);
		SeleniumUtility.fixedWait(5);
	}
	private void InputEmailInSearchBox() {
		SeleniumUtility.sendText(driver, createBookingMemberPage.inputTagSearchMemberByEmail, "sujit.pandey+24@glidemobility.com");
	}
	private void ClickOnSearch() {
		SeleniumUtility.clickOnElement(driver, createBookingMemberPage.ButtonTagSearch);
		SeleniumUtility.fixedWait(3);
	}
	private void clickOnBook() {
		SeleniumUtility.clickOnElement(driver, createBookingMemberPage.bookOncreateBooking("sujit.pandey+24@glidemobility.com"));
		SeleniumUtility.fixedWait(3);
	}
	private void clickOnRoundTrip() {
		SeleniumUtility.clickOnElement(driver, bookCarPage.divTagCheckRoundTrip);
	}
	private void inputStartAddress() {
		SeleniumUtility.clickOnElement(driver, bookCarPage.inputTagStartAddress);
		//SeleniumUtility.sendText(driver, bookCarPage.inputTagStartAddress, "testCompanySite");
		SeleniumUtility.sendText(driver, bookCarPage.inputTagStartAddress, "1 Rue de Gramont, 75002 Paris, France");
		
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.sendEnter(driver, bookCarPage.inputTagStartAddress);
		SeleniumUtility.fixedWait(1);
	}
	private void selectInputAddress() {
		SeleniumUtility.moveToElementAction(driver, bookCarPage.inputTagStartAddressPopup);
		SeleniumUtility.clickOnElement(driver, bookCarPage.inputTagStartAddressPopup);
		SeleniumUtility.fixedWait(1);
	}
	private void selectStartDate() {
		SeleniumUtility.clickOnElement(driver, bookCarPage.divTagStartDate);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
	}
	private void selectStartHour(int extrahour) {
		System.out.println("KK"+LocalTime.now().getHour());
		String x=Integer.toString(LocalTime.now().getHour()+extrahour);
		SeleniumUtility.selectByVisibleText(driver, bookCarPage.divTagStartHour, x);
		SeleniumUtility.fixedWait(1);
	}
	private void selectStartMinute(int extraMinute) {
		String x= Integer.toString(LocalTime.now().getMinute()+extraMinute);
		SeleniumUtility.selectByVisibleText(driver, bookCarPage.divTagStartMinute, x);
		SeleniumUtility.fixedWait(1);

	}
	
	private void selectEndDate() {
		SeleniumUtility.clickOnElement(driver, bookCarPage.divTagEndDate);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		SeleniumUtility.fixedWait(1);
	}
	private void selectEndHour(int extrahour) {
		String x=Integer.toString(LocalTime.now().getHour()+extrahour);
		SeleniumUtility.selectByVisibleText(driver, bookCarPage.divTagEndHour, x);
		SeleniumUtility.fixedWait(1);

	}
	private void selectEndMinute(int extraMinute) {
		String x= Integer.toString(LocalTime.now().getMinute()+extraMinute);
		SeleniumUtility.selectByVisibleText(driver, bookCarPage.divTagEndMinute, x);
		SeleniumUtility.fixedWait(1);

	}
	
	private void ClickOnSearchBooking() {
		SeleniumUtility.clickOnElement(driver, bookCarPage.buttonTagSearch);
		SeleniumUtility.fixedWait(5);
	}
	private void startHourAndMinute(int hours, int minute) {
		String[] data=DateHelper.hourAndMinute(hours, minute);
		SeleniumUtility.selectByVisibleText(driver, bookCarPage.divTagStartHour, data[0]);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, bookCarPage.divTagStartMinute,  data[1]);
		SeleniumUtility.fixedWait(1);

	}
	private void endHourAndMinute(int hours, int minute) {
		String[] data=DateHelper.hourAndMinute(hours, minute);
		SeleniumUtility.selectByVisibleText(driver, bookCarPage.divTagEndHour, data[0]);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, bookCarPage.divTagEndMinute, data[1]);
		SeleniumUtility.fixedWait(1);

	}
	private void clickOnConfirmBooking() {
		SeleniumUtility.clickOnElement(driver, bookCarPage.buttonTagBookingConfirmButton);
		SeleniumUtility.fixedWait(3);
	}
	private void inputCustomField() {
		SeleniumUtility.sendText(driver, bookCarPage.inputTagCustomField, "hello");
		SeleniumUtility.fixedWait(3);
	}
	private void ClickOnSaveButton() {
		
		SeleniumUtility.moveToElementAction(driver, bookCarPage.buttonTagSave);
		SeleniumUtility.actionClickAndSendKeys(driver,  bookCarPage.buttonTagSave, "hello");
		//SeleniumUtility.fixedWait(3);
	}
	private void refreshPage() {
		driver.navigate().refresh();
	}

	public boolean verifyBookingPage() {
		SeleniumUtility.fixedWait(3);
		clickOnBookings();
		SeleniumUtility.WaitElementToBeClickable(driver, bookingHomepage.buttonTagFilterClosed);
		return 	SeleniumUtility.checkElementIsVisible(driver, bookingHomepage.buttonTagFilterClosed) &&
				SeleniumUtility.checkElementIsVisible(driver,bookingHomepage.buttonTagCreateBooking) &&
				SeleniumUtility.checkElementIsVisible(driver,bookingHomepage.aTagExportInCSV);

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
		clickOnBookings();
		SeleniumUtility.fixedWait(5);
		ClickOnCreateBooking();
		InputEmailInSearchBox();
		ClickOnSearch();
		clickOnBook();
		clickOnRoundTrip();
		inputStartAddress();
		//selectInputAddress();
		selectStartDate();
		startHourAndMinute(0,15);
		selectEndDate();
		endHourAndMinute(1,30);
		
		ClickOnSearchBooking();
		clickOnConfirmBooking();
		inputCustomField();
		ClickOnSaveButton();
		//waitForPageToLoad(driver) ;
		SeleniumUtility.fixedWait(10);

		clickOnInvoices();
		SeleniumUtility.fixedWait(6);
		clickOnBookings();
		//filterBooking();
		//CheckBookingStatus();
	
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
	 */
	public void bookingFilter(String firstname,String lastname, String email,String plateNumber, String vehicleBrand,
			String bookingId,String startDate,String enddate,String vehicleModel,String invoiceError,
			String status,String delayed,String search,String reset){
		clickOnBookings();
		SeleniumUtility.fixedWait(10);
bookingsFilter.bookingFilter( firstname, lastname,  email, plateNumber,  vehicleBrand,
		 bookingId, startDate, enddate, vehicleModel, invoiceError,
		 status, delayed, search, reset);
	}


}
