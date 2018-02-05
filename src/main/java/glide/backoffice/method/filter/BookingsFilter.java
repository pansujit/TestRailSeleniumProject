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

   

}
