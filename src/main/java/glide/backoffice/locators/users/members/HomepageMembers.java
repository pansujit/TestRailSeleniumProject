package glide.backoffice.locators.users.members;

import org.openqa.selenium.By;

public class HomepageMembers {
	
	/**
	 * This locator will find filter tag in the User Management->Member
	 */
	public final By buttonTagFilterMember= By.xpath(".//div[@id='mainContainer']/div/div/div/div[2]/section/div[1]/button");
	/**
	 * This locator find the filter member Validation status in the User Management->Member
	 */
	public final By selectTagFilterValidationStatus= By.xpath(".//div[@id='mainContainer']/div/div/div/div[2]/section/div[1]/div/section/form/div[2]/div/div/div[1]/div/span/select");
	/**
	 * This locator will find filter member VIP status in the User Management->Member 
	 */
	public final By selectTagFilterVIP= By.xpath(".//div[@id='mainContainer']/div/div/div/div[2]/section/div[1]/div/section/form/div[2]/div/div/div[2]/div/span/select");
	/**
	 * This locators will find filter member technician in the User Management->Member
	 */
	public final By selectTagFilterTechnician= By.xpath(".//div[@id='mainContainer']/div/div/div/div[2]/section/div[1]/div/section/form/div[2]/div/div/div[3]/div/span/select");
	/**
	 * This locators will find filter member Professional in the User Management->Member
	 */
	public final By selectTagFilterProfessional= By.xpath(".//*[@id='mainContainer']/div/div/div/div[2]/section/div[1]/div/section/form/div[2]/div/div/div[4]/div/span/select");
	/**
	 * This locator will find filter member Search button in the User Management->Member
	 */
	public final By buttonTagFilterSearch= By.xpath(".//div[@id='mainContainer']/div/div/div/div[2]/section/div[1]/div/section/form/div[3]/button[2]");
	/**
	 * This locator will find filter member Reset button in the User Management->Member
	 */
	public final By buttonTagFilterReset= By.xpath(".//*[@id='mainContainer']/div/div/div/div[2]/section/div[1]/div/section/form/div[3]/button[1]");
	
	/**
	 * This locator will find filter loading logo while searching in the User Management->Member
	 */
	public final By divTagFilterLoadingLogo= By.xpath(".//*[@id='mainContainer']/div/div[1]/div/div/div[12]");
	
	/**
	 * This locator will find the Export Tag in the User Management->Member
	 */
	public final By aTagMemberExport= By.xpath(".//div[@id='mainContainer']/div/div/div/div[2]/section/div[1]/a");
	
	////////**************TABLE CONTENT*******************//////////////////
	/**
	 * This locator will find the LastName header tag in member table in the User Management->Member
	 */
	public final By buttonTagLastNameMember= By.xpath(".//table/thead/tr/th[1]//button");
	
	/**
	 * This locator will find the FirstName header tag in member table in the User Management->Member
	 */
	public final By buttonTagFirstnameMember= By.xpath(".//table/thead/tr/th[2]//button");
	
	/**
	 * This locator will find the Email header tag in member table in the User Management->Member
	 */
	public final By spanTagEmailMember= By.xpath(".//table/thead/tr/th[3]//button");
	
	/**
	 * This locator will find the Company Header tag in member table in the Users 	
	 */
	public final By spanTagCompanyNameMember= By.xpath(".//table/thead/tr/th[4]/span/span/span");

	/**
	 * This locator will find the Phone number Header tag in member table in the Users 	
	 */
	public final By spanTagPhoneMember= By.xpath(".//table/thead/tr/th[5]/span/span/span");
	
	/**
	 * This locator will find the Professional Header tag in member table in the Users 	
	 */
	public final By spanTagProfessionalMember= By.xpath(".//table/thead/tr/th[6]/span/span/span");
	
	/**
	 * This locator will find the VIP header tag in member table in the Users		
	 */
	public final By buttonTagVIPMember= By.xpath(".//table/thead/tr/th[7]//button");
	
	/**
	 * This locator will find the Technician tag in member table in the Users 	
	 */
	public final By spanTagTechnicialMember= By.xpath(".//table/thead/tr/th[8]/span/span/span");
	
	/**
	 * This locators will find the Status header tag in member table in the Users
	 */
	public final By spanTagStatusMember= By.xpath(".//table/thead/tr/th[9]/span/span/span");
	
	/**
	 * This locator method find the view Tag in member table in the Users
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium By}
	 */
	public final By buttonTagMemberView(String replacementText) {
		String text=".//table/tbody/tr/td[3]/span/span[text()='xxxx']/../../../td[10]/button";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator method will find the Status tag in member table in the User Management->Member
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagMemberStatus(String replacementText) {
		String text=".//table[@class='tableView']/tbody/tr/td[3]/span/span[text()='xxxx']/../../../td[9]//span/span/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}

}
