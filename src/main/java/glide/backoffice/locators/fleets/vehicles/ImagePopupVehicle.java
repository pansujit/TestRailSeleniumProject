package glide.backoffice.locators.fleets.vehicles;

import org.openqa.selenium.By;

public class ImagePopupVehicle {
	/**
	 * This method locator will find Image url link
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle-->image
	 */
	public final By inputTagURLImagePopupVehicle=By.xpath(".//input[contains(@id,'-Image-')]");
	/**
	 * This method locator will find Cancel Button
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle-->image
	 */
	public final By buttonTagCancelImagePopupVehicle=By.xpath(".//button[@class='flatButton'][1]");
	
	/**
	 * This method locator will find Ok button  
	 * element in the Fleet management->Vehicle-->Homepage-->View Vehicle-->Edit Vehicle-->image
	 */
	public final By buttonTagOKImagePopupVehicle=By.xpath(".//button[@class='flatButton'][2]");
	
	
}
