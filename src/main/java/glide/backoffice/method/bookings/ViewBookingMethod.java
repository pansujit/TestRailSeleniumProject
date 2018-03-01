package glide.backoffice.method.bookings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.bookings.ViewBooking;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;

public class ViewBookingMethod {
	WebDriver driver;
	ViewBooking viewBooking;
	CommonMethods commonMethods; 
	SoftAssert softAssert;
	public ViewBookingMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.viewBooking=PageFactory.initElements(driver, ViewBooking.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);
		this.softAssert= new SoftAssert();

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
	
	void assertScheduledBooking(String bookingID, String vehiclePlateNumber,String usageType,String memberName,String companyName,String status) {
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, viewBooking.spanTagBookingIdOnViewBooking(bookingID)));
		softAssert.assertTrue(SeleniumUtility.checkElementIsVisible(driver, viewBooking.spanTagVehiclePlateOnViewBooking(vehiclePlateNumber)));
		softAssert.assertTrue(SeleniumUtility.containsText(driver, viewBooking.spanTagUsageTypeOnViewBooking(bookingID), 
				usageType));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,viewBooking.spanTagMemberNameOnViewBooking(bookingID) ,
				memberName));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,viewBooking.spanTagCompanyNameOnViewBooking(bookingID) ,
				companyName));
		softAssert.assertTrue(SeleniumUtility.compareIgnoreCaseText(driver,viewBooking.spanTagStatusOnViewBooking(bookingID) ,
				status));
		softAssert.assertAll();
		
	}
	

}
