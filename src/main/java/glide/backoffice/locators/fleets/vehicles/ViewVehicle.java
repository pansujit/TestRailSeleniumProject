package glide.backoffice.locators.fleets.vehicles;

import org.openqa.selenium.By;

public class ViewVehicle {
	
	/**
	 * This method locator will find Edit Vehicle element in the Fleet management->Vehicle-->Homapage-->View Vehicle
	 */
	public final By buttonTagEditVehicleViewVehicle=By.xpath(".//div[@class='vehicleDetailPage_actions']/a");
	
	/**
	 * This method locator will find Add Status button element in the Fleet management->Vehicle-->Homapage-->View Vehicle
	 */
	public final By buttonTagAddStatusViewVehicle=
			By.xpath(".//button[@class='ekButton ekButton--reverse vehicleDetailPage_actionButton vehicleDetailPage_actionButton--header']");
	
	/**
	 * This method locator will find element in the Fleet management->Vehicle-->Homapage-->View Vehicle
	 */
	public final By buttonTagViewVehicle=By.xpath("");
	
	

}
