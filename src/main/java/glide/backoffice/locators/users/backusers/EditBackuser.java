package glide.backoffice.locators.users.backusers;

import org.openqa.selenium.By;

public class EditBackuser {
	
	/**
	 * THIS LOCATOR IS USED FOR EMAIL VERIFICATION, WHEN, AFTER EMAIL IS TYPED, NEED TO REFRESH THAT WILL DESTROY ALL 
	 * DATA, WILL DO NOTHING AND REMOVED IN FUTURE.
	 */
	public final By inputTagEmailCheckerBackuser= By.xpath(".//input[@id='firstName']/../../span[1]/span");

	/**
	 * This locator will find the Email tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By inputTagEmailEditBackuser= By.xpath(".//input[@id='email']");
	/**
	 * This locator will find the Country code tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By selectTagCountryCodeEditBackuser= By.xpath(".//*[@class='boxedSelectBlock']//select[@name='mobilePhonePrefix']");
	/**
	 * This locator will find the Phone number tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By inputTagPhoneEditBackuser= By.xpath(".//input[@id='phoneNumber']");
	/**
	 * This locator will find the Firstname tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By inputTagFirstnameEditBackuser= By.xpath(".//input[@id='firstName']");
	/**
	 * This locator will find the Lastname tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By inputTagLastnameEditBackuser= By.xpath(".//input[@id='lastName']");
	/**
	 * This locator will find the Address tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By inputTagAddressEditBackuser= By.xpath(".//span[@class='boxedInput_labelText']/../div/input");
	
	/**
	 * This locator will find the ROLE in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By labelTagRoleEditBackuser(String replacementText) {
		String text=".//input[@id='userRole_option_ROLE_xxxx']/../label";
		return By.xpath(text.replace("xxxx", replacementText));
		
	}


	/**
	 * This locator will find the avilable Super company tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By selectTagAvailableSuperCompanyEditBackuser= By.xpath(".//select[@id='availableCompaniesSelect']");
	
	/**
	 * This locator will find the Selected Super company tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By selectTagSelectedSuperCompanyEditBackuser= By.xpath(".//select[@id='selectedCompaniesSelect']");
	
	/**
	 * This locator will find the Arrow tag that move the super company to the right in 
	 * BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By buttonTagMoveCompanyRightEditBackuser= 
			By.xpath(".//button[@class='fleetUsagesForm_assignButton fleetUsagesForm_assignButton--right']");
	
	/**
	  * This locator will find the super company tag element in Fleet manager role in  
	 * BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By selectagSuperCompanyForFleetMGREditBackuser= By.xpath(".//select[@name='companyId']");
	
	
	/**
	 * This locator will find the Available Company tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By selectTagAvailableCompanyEditBackuser=By.xpath(".//select[@id='availableSubCompaniesSelect']");
	/**
	 * This locator will find the Selected sub Company tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By selectTagSelectedCompanyEditBackuser=By.xpath(".//select[@id='selectedSubCompaniesSelect']");
	
	/**
	 * This locator will find the Save tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By buttonTagSaveEditBackuser= By.xpath(".//div[@class='backUserForm_actions']/button");	
	/**
	 * This locator will find the Cancel tag in BackUsers Edit page in the User Management->BackUsers->View->Edit
	 */
	public final By aTagCancelEditBackuser= By.xpath(".//div[@class='backUserForm_actions']/a");


}
