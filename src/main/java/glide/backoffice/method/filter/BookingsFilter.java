package glide.backoffice.method.filter;

import glide.backoffice.utility.SeleniumUtility;
import org.openqa.selenium.WebDriver;
import glide.backoffice.locators.bookings.FilterBookings;
import glide.backoffice.locators.bookings.HomepageBookings;

import org.openqa.selenium.support.PageFactory;

public class BookingsFilter {
    WebDriver driver;
    HomepageBookings homepageBookings;
    FilterBookings filterBookings;
    public BookingsFilter(WebDriver ldriver){
        this.driver=ldriver;
        this.homepageBookings= PageFactory.initElements(driver,HomepageBookings.class);
        this.filterBookings=PageFactory.initElements(driver,FilterBookings.class);
    }

    public void filterBookings(String firstname, String lastname,String email, String plateNumber, String vehicleBrand,
                              String bookingId, String startDate, String endDate, String vehicleModel, String invoiceError,
                              String status, String delayed){



        if(SeleniumUtility.checkElementIsVisible(driver,homepageBookings.buttonTagFilterClosed)){
            SeleniumUtility.clickOnElement(driver,homepageBookings.buttonTagFilterClosed);
        }
        if(firstname!=null){
            SeleniumUtility.clearText(driver, filterBookings.inputTagFirstnameFilterBookings);
            SeleniumUtility.sendText(driver,filterBookings.inputTagFirstnameFilterBookings,firstname);

        }
        if(lastname!=null){
            SeleniumUtility.clearText(driver, filterBookings.inputTagLastnameFilterBookings);
            SeleniumUtility.sendText(driver,filterBookings.inputTagLastnameFilterBookings,lastname);
        }
        if(email!=null){
            SeleniumUtility.clearText(driver, filterBookings.inputTagEmailFilterBookings);
            SeleniumUtility.sendText(driver,filterBookings.inputTagEmailFilterBookings,email);
        }
        if(plateNumber!=null){
            SeleniumUtility.clearText(driver, filterBookings.inputTagPlateNumberFilterBookings);
            SeleniumUtility.sendText(driver,filterBookings.inputTagPlateNumberFilterBookings,plateNumber);
        }
        if(bookingId!=null){
            SeleniumUtility.clearText(driver, filterBookings.inputTagBookingIdFilterBookings);
            SeleniumUtility.sendText(driver,filterBookings.inputTagBookingIdFilterBookings,bookingId);
        }
        if(startDate!=null){

        }
        if(endDate!=null){

        }
       if(vehicleBrand!=null){
            SeleniumUtility.selectByVisibleText(driver,filterBookings.selectTagVehicleBrandFilterBookings,vehicleBrand);

        }
        if(vehicleModel!=null){
            SeleniumUtility.selectByVisibleText(driver,filterBookings.selectTagVehicleModelFilterBookings,vehicleModel);

        }
        if(invoiceError!=null){
            SeleniumUtility.selectByvalue(driver,filterBookings.selectTagInvoiceErrorFilterBookings,invoiceError);

        }
        if(status!=null){
        	
            SeleniumUtility.selectByvalue(driver,filterBookings.selectTagStatusFilterBookings,status.toUpperCase());

        }
        if(delayed!=null){
            SeleniumUtility.selectByvalue(driver,filterBookings.selectTagDelayedFilterBookings,delayed);


        }




    }

}
