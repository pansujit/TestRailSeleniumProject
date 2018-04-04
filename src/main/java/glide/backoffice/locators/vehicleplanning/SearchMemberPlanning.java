package glide.backoffice.locators.vehicleplanning;

import org.openqa.selenium.By;

public class SearchMemberPlanning {
	/**
	 * This locator will find Input for search name element in search Member popup in the Vehicle Planing->homepage->Search member
	 */
	public final By inputTagSearchNameSearchMemberPlanning= By.xpath(".//input[contains(@id,'Searchbyfirstnameorlastname')]");
	/**
	 * This locator will find  drop-down member result element in search Member popup in the Vehicle Planing->homepage->Search member
	 */
	public final By divTagResultNameSearchMemberPlanning(String replacementText) {
		String text= ".//div[@role='menu']/div//span/div/div/div[contains(text(),'xxxx')]";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	

	
	
	
}
