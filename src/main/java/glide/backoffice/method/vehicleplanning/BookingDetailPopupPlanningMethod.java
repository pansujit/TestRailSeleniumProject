package glide.backoffice.method.vehicleplanning;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.vehicleplanning.BookingDetailPopupVehiclePlanning;
import glide.backoffice.utility.SeleniumUtility;

public class BookingDetailPopupPlanningMethod {
	static Logger log = Logger.getLogger(BookingDetailPopupPlanningMethod.class.getName());
	WebDriver driver;
	BookingDetailPopupVehiclePlanning bookingDetailPopupVehiclePlanning;
	public BookingDetailPopupPlanningMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.bookingDetailPopupVehiclePlanning=PageFactory.initElements(driver, BookingDetailPopupVehiclePlanning.class);
	}
	
	void waitUntilPopupIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, bookingDetailPopupVehiclePlanning.divTagBookingDeatailPopupHomepageVehiclePlanning);
	}
	void waitUntilPopupIsNotVisible() {
		SeleniumUtility.waitUntilElementisNotVisible(driver, bookingDetailPopupVehiclePlanning.divTagBookingDeatailPopupHomepageVehiclePlanning);
	}
	void clickOnPlateNumber() {
		SeleniumUtility.clickOnElement(driver, bookingDetailPopupVehiclePlanning.divTagPlateNumberBookingDetailPopupVehiclePlanning);
	}
	void clickOnBookingId() {
		SeleniumUtility.clickOnElement(driver, bookingDetailPopupVehiclePlanning.aTagBookingIDBookingDetailPopupVehiclePlanning);

	}
	
	void clickOnMemberName() {
		SeleniumUtility.clickOnElement(driver, bookingDetailPopupVehiclePlanning.aTagMemberDetailBookingDetailPopupVehiclePlanning);

	}
	
	List<String> assertCreateBookingUsingVehiclePlanning() {
		List<String> assertValue= new ArrayList<>();
		assertValue.add(0, SeleniumUtility.getText(driver, 
				bookingDetailPopupVehiclePlanning.spanTagBookingStatusBookingDetailPopupVehiclePlanning).toLowerCase());
		assertValue.add(1, SeleniumUtility.getText(driver, 
				bookingDetailPopupVehiclePlanning.spanTagUsageTypeBookingDetailPopupVehiclePlanning).toLowerCase());
		assertValue.add(2, SeleniumUtility.getText(driver, 
				bookingDetailPopupVehiclePlanning.aTagMemberDetailBookingDetailPopupVehiclePlanning).toLowerCase());
		clickOnCancelIcon();
		return assertValue;
	}
	
	void clickOnCancelIcon() {
		SeleniumUtility.clickOnElement(driver, bookingDetailPopupVehiclePlanning.buttonTagCloseBookingDetailPopupVehiclePlanning);
		waitUntilPopupIsNotVisible();
		SeleniumUtility.fixedWait(1);
	}
}
