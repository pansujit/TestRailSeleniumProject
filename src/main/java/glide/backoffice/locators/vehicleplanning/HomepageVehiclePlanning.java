package glide.backoffice.locators.vehicleplanning;

import org.openqa.selenium.By;

public class HomepageVehiclePlanning {

	/**
	 * This locator will find Error text element in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By divTagErrorCompanyNotSelectedHomepageVehiclePlanning= 
			By.xpath(".//div[@class='vehiclePlanning_selectCompany']/span/span");
	/**
	 * This locator will find Select Days element in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By divTagSelectDaysHomepageVehiclePlanning= 
			By.xpath(".//div[@class='vehiclePlanningSetup_container_inline']/div/div[2]/div/div/div[2]");
	/**
	 * This locator will find Select Sites element in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By divTagSelectSitesHomepageVehiclePlanning= 
			By.xpath(".//div[@class='vehiclePlanningSetup_container_inline']/div/div[4]/div/div/div[2]");
	/**
	 * This locator will find Date element in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By inputTagSelectDateHomepageVehiclePlanning= 
			By.xpath(".//input[@id='vehiclePlanningSetup_startDate']/../..");
	/**
	 * This locator will find Add status in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By buttonTagAddStatusHomepageVehiclePlanning= 
			By.xpath(".//div[@class='vehiclePlanningSetup_buttonWrap']/button[1]");
	/**
	 * This locator will find  in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By buttonTagRefreshButtonHomepageVehiclePlanning= 
			By.xpath(".//div[@class='vehiclePlanningSetup_buttonWrap']/button[2]");
	/**
	 * This locator will find Vehicle in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By aTagVehiclePlateNumberHomepageVehiclePlanning(String replacementText) {
		String text=".//div[@class='vehiclePlanning_vehicleRow_registrationNumber']/a[text()='xxxx']";		
		return By.xpath(text.replace("xxxx", replacementText));	
	}
			
	/**
	 * This locator will find All time element in one day slots in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By divTagGetAllTimesHomepageVehiclePlanning(String replacementText) {
		String text=".//div[@class='vehiclePlanning_vehicleRow_registrationNumber']/a[text()='xxxx']/../../../div[2]/div";
			return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find All Date in 3 and 7 days slots in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By divTagAllDaysSlotsHomepageVehiclePlanning(String replacementText) {
		String text=	".//div[@class='vehiclePlanning_vehicleRow_registrationNumber']/a[text()='xxxx']/../../../div[contains(@class,'vehiclePlanning_vehicleRow_field')]";
				return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find Vehicle status of the given vehicle in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By divTagVehicleStatusHomepageVehiclePlanning(String replacementText) {
		String text=	".//div[@class='vehiclePlanning_vehicleRow_registrationNumber']/a[text()='xxxx']/../../..//div[@class='vehiclePlanning_status']/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator will find booking status of the of that vehicle in Vehicle Planning page in the Vehicle Planing->homepage
	 */
	public final By divTagBookingStatusHomepageVehiclePlanning(String replacementText) {
		String text=	".//div[@class='vehiclePlanning_vehicleRow_registrationNumber']/a[text()='xxxx']/../../..//div[@class='vehiclePlanning_booking']";	
		return By.xpath(text.replace("xxxx", replacementText));
	}

}
