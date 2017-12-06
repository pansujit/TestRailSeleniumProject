package glide.backoffice.locators.users;

import org.openqa.selenium.By;

public class BackUsers {
	
	/**
	 * This locator will find the LastName header tag in BackUsers table in the User Management->BackUsers
	 */
	final public By aTagBackUsersHeaderAddBackUser= By.xpath(".//div[@class='pageManagementHeader_actionButton']/a");
	
	/**
	 * This locator will find the LastName header tag in BackUsers table in the User Management->BackUsers
	 */
	final public By spanTagBackUsersTableLastName= By.xpath(".//table[@class='tableView']/thead/tr/th[1]/span");
	/**
	 * This locator will find the FirstName header tag in BackUsers table in the User Management->BackUsers
	 */
	final public By spanTagBackUserTableFirstName= By.xpath(".//table[@class='tableView']/thead/tr/th[2]/span");

	/**
	 * This locator will find the Email header tag in BackUsers table in the User Management->BackUsers
	 */
	final public By spanTagBackUsersTableEmail= By.xpath(".//table[@class='tableView']/thead/tr/th[3]/span");
	/**
	 * This locator will find the Role header tag in BackUsers table in the User Management->BackUsers		
	 */
	final public By spanTagBackUsersTableRole= By.xpath(".//table[@class='tableView']/thead/tr/th[5]/span");
	/**
	 * This locators will find the Status header tag in BackUsers table in the User Management->BackUsers
	 */
	final public By spanTagBackUsersTableStatus= By.xpath(".//table[@class='tableView']/thead/tr/th[6]/span");
	/**
	 * This locator method find the view Tag in BackUsers table in the User Management->BackUsers
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium final public By}
	 */
	public final By buttonTagBackUsersView(String replacementText) {
		String text=".//table[@class='tableView']/tbody/tr/td[3]/span/span[text()='xxxx']/../../../td[8]/button";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator method will find the Status tag in BackUsers table in the User Management->BackUsers
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagBackUsersStatus(String replacementText) {
		String text=".//table[@class='tableView']/tbody/tr/td[3]/span/span[text()='xxxx']/../../../td[6]/span/span/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	// This filter part in the BackUsers in user Management
	/**
	 * This locator will find filter tag in the User Management->BackUsers
	 */
	final public By buttonTagBackUsersFilter= By.xpath(".//div[@class='membersPage_filters']/button");
	/**
	 * This locator find the Firstname tag in the filter in the User Management->BackUsers
	 */
	final public By inputTagBackUserFilterFirstname= By.xpath(".//input[@id='firstName']");
	/**
	 * This locator find the Lastname tag in the filter in the User Management->BackUsers 
	 */
	final public By inputTagBackUserFilterLastname= By.xpath(".//input[@id='lastName']");
	/**
	 * This locator find the Email tag in the filter in the User Management->BackUsers
	 */
	final public By inputTagBackUserFilterEmail= By.xpath(".//input[@id='email']");
	/**
	 * This locator find the Role tag in the filter in the User Management->BackUsers
	 */
	final public By SelectTagBackUserFilterRole= By.xpath(".//div[@class='boxedSelectBlock']//span[@class='searchBackUsersForm_boxedSelectBlock boxedSelectWrapper']/select");
	/**
	 * This locator find the Search button tag in the filter in the User Management->BackUsers
	 */
	final public By buttonTagBackUserFilterSearch= By.xpath(".//form[@class='searchBackUsersForm']/div[2]/button[2]");
	/**
	 * This locator find the Reset Button tag in the filter in the User Management->BackUsers
	 */
	final public By buttonTagBackUserFilterReset= By.xpath(".//form[@class='searchBackUsersForm']/div[2]/button[1]");
	
	
	

}
