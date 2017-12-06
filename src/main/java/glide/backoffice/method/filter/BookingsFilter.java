package glide.backoffice.method.filter;

import glide.backoffice.locators.bookings.BookingFilter;
import glide.backoffice.utility.SeleniumUtility;
import org.openqa.selenium.WebDriver;
import glide.backoffice.locators.bookings.BookingHomepage;
import org.openqa.selenium.support.PageFactory;

public class BookingsFilter {
    WebDriver driver;
    BookingHomepage bookingHomepage;
    BookingFilter bookingFilter;
    public BookingsFilter(WebDriver ldriver){
        this.driver=ldriver;
        this.bookingHomepage= PageFactory.initElements(driver,BookingHomepage.class);
        this.bookingFilter=PageFactory.initElements(driver,BookingFilter.class);
    }

    public void bookingFilter(String firstname, String lastname,String email, String plateNumber, String vehicleBrand,
                              String bookingId, String startDate, String endDate, String vehicleModel, String invoiceError,
                              String status, String delayed,String search, String reset){

        if((search==null && reset==null)||(search!=null && reset!=null)){
            System.out.println("Both cannot be null or have value at the same time");
            return;
        }

        if(SeleniumUtility.checkElementIsVisible(driver,bookingHomepage.buttonTagFilterClosed)){
            SeleniumUtility.clickOnElement(driver,bookingHomepage.buttonTagFilterClosed);
        }
        if(firstname!=null){
            SeleniumUtility.clearText(driver, bookingFilter.inputTagFirstnameBookingFilter);
            SeleniumUtility.sendText(driver,bookingFilter.inputTagFirstnameBookingFilter,firstname);

        }
        if(lastname!=null){
            SeleniumUtility.clearText(driver, bookingFilter.inputTagLastnameBookingFilter);
            SeleniumUtility.sendText(driver,bookingFilter.inputTagLastnameBookingFilter,lastname);
        }
        if(email!=null){
            SeleniumUtility.clearText(driver, bookingFilter.inputTagEmailBookingFilter);
            SeleniumUtility.sendText(driver,bookingFilter.inputTagEmailBookingFilter,email);
        }
        if(plateNumber!=null){
            SeleniumUtility.clearText(driver, bookingFilter.inputTagPlateNumberBookingFilter);
            SeleniumUtility.sendText(driver,bookingFilter.inputTagPlateNumberBookingFilter,plateNumber);
        }
        if(bookingId!=null){
            SeleniumUtility.clearText(driver, bookingFilter.inputTagBookingIdBookingFilter);
            SeleniumUtility.sendText(driver,bookingFilter.inputTagBookingIdBookingFilter,bookingId);
        }
        if(startDate!=null){

        }
        if(endDate!=null){

        }
        if(vehicleBrand!=null){
            SeleniumUtility.selectByVisibleText(driver,bookingFilter.selectTagVehicleBrandBookingFilter,vehicleBrand);

        }
        if(vehicleModel!=null){
            SeleniumUtility.selectByVisibleText(driver,bookingFilter.selectTagVehicleModelBookingFilter,vehicleModel);

        }
        if(invoiceError!=null){
            SeleniumUtility.selectByvalue(driver,bookingFilter.selectTagInvoiceErrorBookingFilter,invoiceError);

        }
        if(status!=null){
        	
            SeleniumUtility.selectByvalue(driver,bookingFilter.selectTagStatusBookingFilter,status.toUpperCase());

        }
        if(delayed!=null){
            SeleniumUtility.selectByvalue(driver,bookingFilter.selectTagDelayedBookingFilter,delayed);


        }
        if(search!=null){
            SeleniumUtility.clickOnElement(driver,bookingFilter.buttonTagSearchBookingFilter);
        }

        if(reset!=null){
            SeleniumUtility.clickOnElement(driver,bookingFilter.buttonTagResetBookingFilter);
        }




    }

}
