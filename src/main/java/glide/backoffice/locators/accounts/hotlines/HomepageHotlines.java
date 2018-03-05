package glide.backoffice.locators.accounts.hotlines;

import org.openqa.selenium.By;

public class HomepageHotlines {
	
	/**
	 * This locator will find Add a Hotline element in Account-->Hotlines--> Homepage
	 */
	public final By aTagAddAHotlineHomepageHotlines= 
			By.xpath(".//div[@class='pageManagementHeader_actionButton']/a[contains(@href,'/#/add-hotline')]");
	
	/**
	 * This locator will find Table "Name" header element in Account-->Hotlines--> Homepage
	 */
	public final By thTagTableNameHeaderHomepageHotlines= 
			By.xpath(".//*[@id='mainContainer']//table/thead/tr/th[1]/span/span/Span");
	

	/**
	 * This locator will find Table "Email" header element in Account-->Hotlines--> Homepage
	 */
	public final By thTagTableEmailHeaderHomepageHotlines= 
			By.xpath(".//*[@id='mainContainer']//table/thead/tr/th[2]/span/span/Span");
	

	/**
	 * This locator will find Table "Phone" header element in Account-->Hotlines--> Homepage
	 */
	public final By thTagTablePhoneHeaderHomepageHotlines= 
			By.xpath(".//*[@id='mainContainer']//table/thead/tr/th[3]/span/span/Span");
	

	/**
	 * This locator will find Table "Action" header element in Account-->Hotlines--> Homepage
	 */
	public final By thTagTableActionHeaderHomepageHotlines= 
			By.xpath(".//*[@id='mainContainer']//table/thead/tr/th[4]/span/span/Span");
	

	/**
	 * This locator will find Email element in Account-->Hotlines--> Homepage
	 */
	public final By spanTagTableEmailHomepageHotlines(String replacementText) {
		String myText= ".//div[@id='mainContainer']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[2]/span/span";
		return By.xpath(myText.replace("xxxx", replacementText));
		
	}
	
	/**
	 * This locator will find Name element in Account-->Hotlines--> Homepage
	 */
	public final By spanTagTableNameHomepageHotlines(String replacementText) {
		String myText= ".//div[@id='mainContainer']//table/tbody/tr/td[1]/span/span[text()='xxxx']";
		return By.xpath(myText.replace("xxxx", replacementText));
		
	}
	/**
	 * This locator will find Phone element in Account-->Hotlines--> Homepage
	 */
	public final By spanTagTablePhoneHomepageHotlines(String replacementText) {
		String myText= ".//div[@id='mainContainer']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[3]/span/span";
		return By.xpath(myText.replace("xxxx", replacementText));
		
	}
	/**
	 * This locator will find Edit element in Account-->Hotlines--> Homepage
	 */
	public final By buttonTagTableEditHomepageHotlines(String replacementText) {
		String myText= ".//div[@id='mainContainer']//table/tbody/tr/td[1]/span/span[text()='xxxx']/../../../td[4]/button";
		return By.xpath(myText.replace("xxxx", replacementText));
		
	}

}
