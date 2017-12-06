package glide.backoffice.locators.fleets;

import org.openqa.selenium.By;

/**
 * This class contains all locators in fleet management menu
 * @author sujitpandey
 *
 */
public class FleetManagement {
	/**
	 * This locator will find the Vehicle Management tag  in Fleet management menu  page in the backOffice menu
	 */
	final public By aTagFleetManagementVehicleMgmt= By.xpath(".//li[@class='sideMenu_section sideMenu_section--vehicle']/a");
	/**
	 * This locator will find the Fines tag  in Fleet management menu  page in the backOffice menu
	 */
	final public By aTagFleetManagementFines= By.xpath(".//li[@class='sideMenu_section sideMenu_section--fines']/a");
	/**
	 * This locator will find the Usage tag  in Fleet management menu  page in the backOffice menu
	 */
	final public By aTagFleetManagementUsage= By.xpath(".//li[@class='sideMenu_section sideMenu_section--usages']/a");
	/**
	 * This locator will find the Feedback tag  in Fleet management menu  page in the backOffice menu
	 */
	final public By aTagFleetManagementFeedback= By.xpath(".//li[@class='sideMenu_section sideMenu_section--feedbacks']/a");
	/**
	 * This locator will find the Incident tag  in Fleet management menu  page in the backOffice menu
	 */
	final public By aTagFleetManagementIncident= By.xpath(".//li[@class='sideMenu_section sideMenu_section--incidents']/a");
	/**
	 * This locator will find the Vehicle Damage tag  in Fleet management menu  page in the backOffice menu
	 */
	final public By aTagFleetManagementVehicleDamage= By.xpath(".//li[@class='sideMenu_section sideMenu_section--vehicleDamages']/a");

}
