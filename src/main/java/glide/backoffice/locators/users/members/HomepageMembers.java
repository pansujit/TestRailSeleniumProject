package glide.backoffice.locators.users.members;

import org.openqa.selenium.By;

public class HomepageMembers {	
	
	////////**************TABLE CONTENT*******************//////////////////
	/**
	 * This locator finds the LastName header tag element in member table in the User Management->Member-->Homepage
	 */
	public final By buttonTagLastNameHeaderHomepageMembers= By.xpath(".//table/thead/tr/th[1]//button");
	
	/**
	 * This locator finds the FirstName header tag element in member table in the User Management->Member-->Homepage
	 */
	public final By buttonTagFirstnameHeaderHomepageMembers= By.xpath(".//table/thead/tr/th[2]//button");
	
	/**
	 *  This locator finds the Email header tag element in member table in the User Management->Member-->Homepage
	 */
	public final By spanTagEmailHeaderHomepageMembers= By.xpath(".//table/thead/tr/th[3]//button");
	
	/**
	 *  This locator finds the Company header tag element in member table in the User Management->Member-->Homepage	
	 */
	public final By spanTagCompanyHeaderHomepageMembers= By.xpath(".//table/thead/tr/th[4]/span/span/span");

	/**
	 *  This locator finds the Phone header tag element in member table in the User Management->Member-->Homepage 	
	 */
	public final By spanTagPhoneHeaderHomepageMembers= By.xpath(".//table/thead/tr/th[5]/span/span/span");
	
	/**
	 * This locator finds the Professional header tag element in member table in the User Management->Member-->Homepage 	 	
	 */
	public final By spanTagProfessionalHeaderHomepageMembers= By.xpath(".//table/thead/tr/th[6]/span/span/span");
	
	/**
	 * This locator finds the VIP header tag element in member table in the User Management->Member-->Homepage 		
	 */
	public final By buttonTagVIPHeaderHomepageMembers= By.xpath(".//table/thead/tr/th[7]//button");
	
	/**
	 * This locator finds the Technician header tag element in member table in the User Management->Member-->Homepage 	 	
	 */
	public final By spanTagTechnicialHeaderHomepageMembers= By.xpath(".//table/thead/tr/th[8]/span/span/span");
	
	/**
	 * This locator finds the Status header tag element in member table in the User Management->Member-->Homepage 	
	 */
	public final By spanTagStatusHeaderHomepageMembers= By.xpath(".//table/thead/tr/th[9]/span/span/span");
	
	/**
	 * This locator method finds the view link element in member table in the User Management->Member-->Homepage 	
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium By}
	 */
	public final By buttonTagViewHomepageMembers(String replacementText) {
		String text=".//table/tbody/tr/td[3]/span/span[text()='xxxx']/../../../td[10]/button";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator method finds the status element in member table in the User Management->Member-->Homepage
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagMemberStatusHomepageMembers(String replacementText) {
		String text=".//table[@class='tableView']/tbody/tr/td[3]/span/span[text()='xxxx']/../../../td[9]//span/span/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	
	/**
	 * This locator method finds FirstName element in member table in the User Management->Member-->Homepage
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagFirstnameHomepageMembers(String replacementText) {
		String text=".//table[@class='tableView']/tbody/tr/td[3]/span/span[text()='xxxx']/../../../td[1]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	/**
	 * This locator method finds LastName element in member table in the User Management->Member-->Homepage
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagLastnameHomepageMembers(String replacementText) {
		String text=".//table[@class='tableView']/tbody/tr/td[3]/span/span[text()='xxxx']/../../../td[2]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	/**
	 * This locator method finds Email element in member table in the User Management->Member-->Homepage
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagEmailHomepageMembers(String replacementText) {
		String text=".//table[@class='tableView']/tbody/tr/td[3]/span/span[text()='xxxx']";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	/**
	 * This locators find all the WebElements for FirstName in member table in User Management->Member-->Homepage
	 */
	public final By  spanTagAllFirstnameHomepageMembers=By.xpath(".//table[@class='tableView']/tbody/tr/td[1]/span/span");
	
	/**
	 * This locators find all the WebElements for LastName in member table in User Management->Member-->Homepage
	 */
	public final By  spanTagAllLastnameHomepageMembers=By.xpath(".//table[@class='tableView']/tbody/tr/td[2]/span/span");

	/**
	 * This locators find all the WebElements for Email in member table in User Management->Member-->Homepage
	 */
	public final By  spanTagAllEmailnameHomepageMembers=By.xpath(".//table[@class='tableView']/tbody/tr/td[3]/span/span");



}
