package glide.backoffice.method.bookings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.bookings.ViewBooking;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;

public class ViewBookingMethod {
	WebDriver driver;
	ViewBooking viewBooking;
	CommonMethods commonMethods; 
	public ViewBookingMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.viewBooking=PageFactory.initElements(driver, ViewBooking.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);

	}
	
	void clickOnCancelButton() {
		SeleniumUtility.clickOnElement(driver, viewBooking.buttonTagCancelViewBooking);
		SeleniumUtility.waitElementToBeVisible(driver, viewBooking.buttonTagConfirmPopupViewBooking);
	}
	void confirmCancelBooking() {
		SeleniumUtility.clickOnElement(driver, viewBooking.buttonTagConfirmPopupViewBooking);
		commonMethods.waitUntilElementToBeInvisible();
	}
	void rejectCancelBooking() {
		SeleniumUtility.clickOnElement(driver, viewBooking.buttonTagCancelPopViewBooking);
		commonMethods.waitUntilElementToBeInvisible();

	}
	

}
