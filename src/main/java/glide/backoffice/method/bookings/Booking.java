package glide.backoffice.method.bookings;


import static org.testng.Assert.assertFalse;

import java.time.LocalTime;
import java.util.List;

import glide.backoffice.method.filter.BookingsFilter;
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
	public Booking(WebDriver ldriver) {
		this.driver=ldriver;
		this.sidebarMenuItems=PageFactory.initElements(driver, SidebarMenuItems.class);
		this.findMemberBooking=PageFactory.initElements(driver, FindMemberBooking.class);
		this.findVehicleBooking=PageFactory.initElements(driver, FindVehicleBooking.class);
		this.bookingsFilter= PageFactory.initElements(driver,BookingsFilter.class);
		this.homepageBookings= PageFactory.initElements(driver,HomepageBookings.class);


	}


	private void clickOnBookings() {
		SeleniumUtility.clickOnElement(driver,sidebarMenuItems.aTagBookingsSidebarMenuItems);
	}
	private void ClickOnCreateBooking() {
		SeleniumUtility.clickOnElement(driver, homepageBookings.buttonTagCreateBooking);
		SeleniumUtility.fixedWait(5);
	}
	private void InputEmailInSearchBox() {
		SeleniumUtility.sendText(driver, findMemberBooking.inputTagSearchMemberByEmail, "sujit.pandey+24@glidemobility.com");
	}
	private void ClickOnSearch() {
		SeleniumUtility.clickOnElement(driver, findMemberBooking.buttonTagSearch);
		SeleniumUtility.fixedWait(3);
	}
	private void clickOnBook() {
		SeleniumUtility.clickOnElement(driver, findMemberBooking.bookOncreateBooking("sujit.pandey+24@glidemobility.com"));
		SeleniumUtility.fixedWait(3);
	}
	private void clickOnRoundTrip() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.divTagCheckRoundTrip);
	}
	private void inputStartAddress() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagStartAddress);
		//SeleniumUtility.sendText(driver, findVehicleBooking.inputTagStartAddress, "testCompanySite");
		SeleniumUtility.sendText(driver, findVehicleBooking.inputTagStartAddress, "1 Rue de Gramont, 75002 Paris, France");

		SeleniumUtility.fixedWait(1);
		SeleniumUtility.sendEnter(driver, findVehicleBooking.inputTagStartAddress);
		SeleniumUtility.fixedWait(1);
	}
	private void selectInputAddress() {
		SeleniumUtility.moveToElementAction(driver, findVehicleBooking.inputTagStartAddressPopup);
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.inputTagStartAddressPopup);
		SeleniumUtility.fixedWait(1);
	}
	private void selectStartDate() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.divTagStartDate);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
	}
	private void selectStartHour(int extrahour) {
		System.out.println("KK"+LocalTime.now().getHour());
		String x=Integer.toString(LocalTime.now().getHour()+extrahour);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.divTagStartHour, x);
		SeleniumUtility.fixedWait(1);
	}
	private void selectStartMinute(int extraMinute) {
		String x= Integer.toString(LocalTime.now().getMinute()+extraMinute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.divTagStartMinute, x);
		SeleniumUtility.fixedWait(1);

	}

	private void selectEndDate() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.divTagEndDate);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		SeleniumUtility.fixedWait(1);
	}
	private void selectEndHour(int extrahour) {
		String x=Integer.toString(LocalTime.now().getHour()+extrahour);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.divTagEndHour, x);
		SeleniumUtility.fixedWait(1);

	}
	private void selectEndMinute(int extraMinute) {
		String x= Integer.toString(LocalTime.now().getMinute()+extraMinute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.divTagEndMinute, x);
		SeleniumUtility.fixedWait(1);

	}

	private void ClickOnSearchBooking() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.buttonTagSearch);
		SeleniumUtility.fixedWait(5);
	}
	private void startHourAndMinute(int hours, int minute) {
		String[] data=DateHelper.hourAndMinute(hours, minute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.divTagStartHour, data[0]);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.divTagStartMinute,  data[1]);
		SeleniumUtility.fixedWait(1);

	}
	private void endHourAndMinute(int hours, int minute) {
		String[] data=DateHelper.hourAndMinute(hours, minute);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.divTagEndHour, data[0]);
		SeleniumUtility.fixedWait(1);
		SeleniumUtility.selectByVisibleText(driver, findVehicleBooking.divTagEndMinute, data[1]);
		SeleniumUtility.fixedWait(1);

	}
	private void clickOnConfirmBooking() {
		SeleniumUtility.clickOnElement(driver, findVehicleBooking.buttonTagBookingConfirmButton);
		SeleniumUtility.fixedWait(3);
	}
	private void inputCustomField() {
		SeleniumUtility.sendText(driver, findVehicleBooking.inputTagCustomField, "hello");
		SeleniumUtility.fixedWait(3);
	}
	private void ClickOnSaveButton() {

		SeleniumUtility.moveToElementAction(driver, findVehicleBooking.buttonTagSave);
		SeleniumUtility.actionClickAndSendKeys(driver,  findVehicleBooking.buttonTagSave, "hello");
		//SeleniumUtility.fixedWait(3);
	}
	private void refreshPage() {
		driver.navigate().refresh();
	}

	public boolean verifyBookingPage() {
		SeleniumUtility.fixedWait(3);
		clickOnBookings();
		SeleniumUtility.WaitElementToBeClickable(driver, homepageBookings.buttonTagFilterClosed);
		return 	SeleniumUtility.checkElementIsVisible(driver, homepageBookings.buttonTagFilterClosed) &&
				SeleniumUtility.checkElementIsVisible(driver,homepageBookings.buttonTagCreateBooking) &&
				SeleniumUtility.checkElementIsVisible(driver,homepageBookings.aTagExportInCSV);

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
		SeleniumUtility.fixedWait(2);
		WebElement test=driver.findElement(By.xpath(".//*[@id='mainContainer']/div/div[2]/div/div/div/section/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div"));
		Actions action= new Actions(driver);
		action.moveToElement(test).perform();
		
		/*ClickOnCreateBooking();
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
		bookingsFilter.filterBookings( firstname, lastname,  email, plateNumber,  vehicleBrand,
				bookingId, startDate, enddate, vehicleModel, invoiceError,
				status, delayed);
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
