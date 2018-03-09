package glide.backoffice.locators.accounts.hotlines;

import org.openqa.selenium.By;

public class ErrorHotline {
	
	/**
	 * This locator will find error name element in Account-->Hotlines--> Add/edit
	 */
	public final By inputTagNameErrorHotline= By.xpath(".//input[@id='name']/../../../div/span/span");

	/**
	 * This locator will find customer service email element in Account-->Hotlines-->  Add/edit
	 */
	public final By inputTagCustServiceEmailErrorHotline= By.xpath(".//input[@id='customerServiceEmail']/../../../div/span/span");
	
}
