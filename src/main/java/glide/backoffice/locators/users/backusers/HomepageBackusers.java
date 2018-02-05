package glide.backoffice.locators.users.backusers;

import org.openqa.selenium.By;

public class HomepageBackusers {
	
	/**
	 * This locator will find the LastName header tag element in table in the User Management-->BackUsers-->Homepage
	 */
	public final By aTagAddABackuserHomepageBackusers= By.xpath(".//div[@class='pageManagementHeader_actionButton']/a");
	
	/**
	 * This locator will find the LastName header tag element in table in the User Management-->BackUsers-->Homepage
	 */
	public final By spanTagLastnameHeaderHomepageBackusers= By.xpath(".//table[@class='tableView']/thead/tr/th[1]/span");
	/**
	 * This locator will find the FirstName header tag element in table in the User Management-->BackUsers-->Homepage
	 */
	public final By spanTagFirstnameHeaderHomepageBackusers= By.xpath(".//table[@class='tableView']/thead/tr/th[2]/span");

	/**
	 * This locator will find the Email header tag element in table in the User Management-->BackUsers-->Homepage
	 */
	public final By spanTagEmailHeaderHomepageBackusers= By.xpath(".//table[@class='tableView']/thead/tr/th[3]/span");
	/**
	 * This locator will find the Role header tag element in table in the User Management-->BackUsers-->Homepage		
	 */
	public final By spanTagRoleHeaderHomepageBackusers= By.xpath(".//table[@class='tableView']/thead/tr/th[5]/span");
	/**
	 * This locators will find the Status header tag element in table in the User Management-->BackUsers-->Homepage
	 */
	public final By spanTagStatusHeaderHomepageBackusers= By.xpath(".//table[@class='tableView']/thead/tr/th[6]/span");
	/**
	 * This locator method find the view Tag element in table in the User Management-->BackUsers-->Homepage
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium public final By}
	 */
	public final By buttonTagViewHomepageBackusers(String replacementText) {
		String text=".//table[@class='tableView']/tbody/tr/td[3]/span/span[text()='xxxx']/../../../td[8]/button";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator method will find the Status tag element in table in the User Management-->BackUsers-->Homepage
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagStatusHomepageBackusers(String replacementText) {
		String text=".//table[@class='tableView']/tbody/tr/td[3]/span/span[text()='xxxx']/../../../td[6]/span/span/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator method will find the Email tag element in table in the User Management-->BackUsers-->Homepage
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagEmailHomepageBackusers(String replacementText) {
		String text=".//table[@class='tableView']/tbody/tr/td[3]/span/span[text()='xxxx']";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	


}
