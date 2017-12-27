package glide.backoffice.locators.users.backusers;

import org.openqa.selenium.By;

public class EditBackuser {
	/**
	 * This locator will find the Email tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By inputTagBackUserEditEmail= By.xpath(".//input[@id='email']");
	/**
	 * This locator will find the Country code tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By selectTagBackUserEditCountryCode= By.xpath(".//*[@class='boxedSelectBlock']//select[@name='mobilePhonePrefix']");
	/**
	 * This locator will find the Phone number tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By inputTagBackUserEditPhone= By.xpath(".//input[@id='phoneNumber']");
	/**
	 * This locator will find the Firstname tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By inputTagBackUserEditFirstname= By.xpath(".//input[@id='firstName']");
	/**
	 * This locator will find the Lastname tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By inputTagBackUserEditLastname= By.xpath(".//input[@id='lastName']");
	/**
	 * This locator will find the Address tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By inputTagBackUserEditAddress= By.xpath(".//span[@class='boxedInput_labelText']/../div/input");
	/**
	 * This locator will find the Super Admin tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By radioTagBackUserEditSuperAdmin= By.xpath(".//input[@id='userRole_ROLE_SUPER_ADMIN']/../label");
	/**
	 * This locator will find the Admin tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By radioTagBackUserEditAdmin= By.xpath(".//input[@id='userRole_ROLE_ADMIN']/../label");	
	/**
	 * This locator will find the Fleet Manager  tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By radioTagBackUserEditFleetManager= By.xpath("userRole_ROLE_FLEET_MANAGER");
	/**
	 * This locator will find the Call center office tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By radioTagBackUserEditCallCenterOffice= By.xpath(".//input[@id='userRole_ROLE_CALL_CENTER_OPERATOR']/../label");
	/**
	 * This locator will find the Super company tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By selectTagBackUserEditSuperCompany= By.xpath(".//form[@class='backUserForm']/div[1]//div[@class='boxedSelectBlock backUserForm_boxedSelectBlock']//select[@name='companyId']");
	/**
	 * This locator will find the Company tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By selectTagBackUserEditCompany= By.xpath(".//form[@class='backUserForm']/div[1]//div[@class='boxedSelectBlock backUserForm_boxedSelectBlock']//select[@name='subCompanyId']");
	/**
	 * This locator will find the Save tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By buttonTagBackUserEditSave= By.xpath(".//div[@class='backUserForm_actions']/button");	
	/**
	 * This locator will find the Cancel tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	final public By radioTagBackUserEditCancel= By.xpath(".//div[@class='backUserForm_actions']/a");


}
