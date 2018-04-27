package glide.backoffice.locators.users.backusers;

import org.openqa.selenium.By;

public class HomepageBackusers {
	
	/**
	 * This locator will find Add a Back user button element in table in the User Management-->BackUsers-->Homepage
	 */
	public final By aTagAddABackuserHomepageBackusers= By.xpath(".//button[@id='backUsers_create_button']");
	
	/**
	 * This locator will find the LastName header tag element in table in the User Management-->BackUsers-->Homepage
	 */
	public final By divTagLastnameHeaderHomepageBackusers= By.xpath(".//div[@class='advancedList_header row']/div[1]/div");
	/**
	 * This locator will find the Role header tag element in table in the User Management-->BackUsers-->Homepage		
	 */
	public final By divTagRoleHeaderHomepageBackusers= By.xpath(".//div[@class='advancedList_header row']/div[3]/div");
	/**
	 * This locators will find the Company name header tag element in table in the User Management-->BackUsers-->Homepage
	 */
	public final By divTagCompanyNameHeaderHomepageBackusers= By.xpath(".//div[@class='advancedList_header row']/div[2]/div");
	/**
	 * This locator method find the view Tag element in table in the User Management-->BackUsers-->Homepage
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium public final By}
	 */
	public final By buttonTagViewHomepageBackusers(String replacementText) {
		String text=".//div[starts-with(@id,'backUsers_list_row_')]/div[1]/div[2]/span[2 and text()='xxxx']"
				+ "/../../..//div[@class='advancedList_detailIcon']/button";
		return By.xpath(text.replace("xxxx", replacementText));
	}

	/**
	 * This locator method will find the Email tag element in table in the User Management-->BackUsers-->Homepage
	 * @param replacementText should be String ({@code email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagEmailHomepageBackusers(String replacementText) {
		String text=".//div[starts-with(@id,'backUsers_list_row_')]/div[1]/div[2]/span[2 and text()='xxxx']";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator method will find the Full name tag element in table in the User Management-->BackUsers-->Homepage
	 * @param replacementText should be String ({@code Email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagFullnameHomepageBackusers(String replacementText) {
		String text=".//div[starts-with(@id,'backUsers_list_row_')]/div[1]/div[2]/span[2 and text()='xxxx']/../span[1]";
		return By.xpath(text.replace("xxxx", replacementText));
	}

	/**
	 * This locator method will find the Role tag element in table in the User Management-->BackUsers-->Homepage
	 * @param replacementText should be String ({@code Email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagRoleHomepageBackusers(String replacementText) {
		String text=".//div[starts-with(@id,'backUsers_list_row_')]/div[1]/div[2]/span[2 and text()='xxxx']/../../../div[3]/span/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	/**
	 * This locator method will find the Company name tag element in table in the User Management-->BackUsers-->Homepage
	 * @param replacementText should be String ({@code Email})
	 * @return {@code Selenium By}
	 */
	public final By spanTagCompanyNameHomepageBackusers(String replacementText) {
		String text=".//div[starts-with(@id,'backUsers_list_row_')]/div[1]/div[2]/span[2 and text()='xxxx']/../../../div[2]/span";
		return By.xpath(text.replace("xxxx", replacementText));
	}

}
