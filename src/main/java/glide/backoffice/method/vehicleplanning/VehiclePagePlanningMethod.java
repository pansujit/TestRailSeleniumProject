package glide.backoffice.method.vehicleplanning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.bookings.FindVehicleBookingMethod;

public class VehiclePagePlanningMethod {
	WebDriver driver;
	FindVehicleBookingMethod findVehicleBookingMethod;

	public VehiclePagePlanningMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.findVehicleBookingMethod=PageFactory.initElements(driver, FindVehicleBookingMethod.class);
	}
	

}
