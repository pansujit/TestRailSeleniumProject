package glide.backoffice.locators.users.smartcards;

import org.openqa.selenium.By;

public class HomepageSmartcards {
	/**
	 * This locator will find the Filter tag in Smart Card  page in the User Management->SmartCard
	 */
	public final By divTagSmartCardsFilter= By.xpath(".//div[@class='smartcardsPage_filters']/button");
	/**
	 * This locator will find the Email tag in Smart Card  filter page in the User Management->SmartCard
	 */
	public final By inputTagSmartCardsFilterEmail= By.xpath(".//input[@id='userLogin']");
	/**
	 * This locator will find the Reset tag in Smart Card filter  page in the User Management->SmartCard
	 */
	public final By buttonTagSmartCardsFilterReset= By.xpath(".//div[@class='searchSmartcardsForm_actions']/button[@class='ekButton ekButton--reverse searchSmartcardsForm_actionsButton']");
	/**
	 * This locator will find the Search tag in Smart Card filter page in the User Management->SmartCard
	 */
	public final By buttonTagSmartCardsFilterSearch= By.xpath(".//div[@class='searchSmartcardsForm_actions']/button[@class='ekButton searchSmartcardsForm_actionsButton']");
	/**
	 * This method locator will find the view tag in Smart Card table page in the User Management->SmartCard
	 * @param replacementTextFirstname should be String
	 * @param replacementTextSurname should be String
	 * @return By should be Selenium By
	 */
	public final By buttonTagSmartCardsTableView(String replacementTextFirstname,String replacementTextSurname) {
		String text=".//table[@class='tableView']/tbody/tr/td/span/span[text()='xxxx']/../../../td/span/span[text()='yyyy']/../../../td[5]/button";
		return By.xpath(text.replace("xxxx", replacementTextFirstname).replace("yyyy", replacementTextSurname));
	}
}
