package glide.backoffice.locators.common;

import org.openqa.selenium.By;

public class DatePicker {
	
	/**
	 * This locator finds date in the  calendar element in date picker.
	 */
	public final By spanTagSelectDateDatePicker(String replacementText) {
		String text= ".//button[@type='button']//span[text()='xxxx']";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	/**
	 * This locator finds Arrow link that will select month in descending order  in date picker.
	 */
	public final By buttonTagLeftMonthMoverDatePicker= 
			By.xpath(".//div/div[1]/div/div/div/div/div[2]/div[1]/div[1]/button[1]");
	/**
	 * This locator finds Arrow link that will select month in Ascending order  in date picker.
	 */
	public final By buttonTagRightMonthMoverDatePicker= 
			By.xpath(".//div/div[1]/div/div/div/div/div[2]/div[1]/div[1]/button[2]");
	/**
	 * This locator finds Month and Year text in date picker.
	 */
	public final By divTagMonthAndYearDatePicker= 
			By.xpath(".//div/div[1]/div/div/div/div/div[2]/div[1]/div[1]/div/div/div");
	
	/**
	 * This locator finds Year element on the top of calendar  in date picker.
	 */
	public final By divTagTopYearSelectorDatePicker= 
			By.xpath("//div/div[1]/div/div/div/div/div[1]/div[1]/div/div");
	
	
	/**
	 * This locator finds Year in the  calendar element in date picker.
	 */
	public final By spanTagSelectYearDatePicker(String replacementText) {
		String text= ".//div/div[1]/div/div/div/div/div[2]/div[1]/div/div//button/span[text()='xxxx']";
		return By.xpath(text.replace("xxxx", replacementText));
	}
	
	
	/**
	 * This locator finds Cancel Button on calendar in date picker.
	 */
	public final By buttonTagCancelDatePicker= 
			By.xpath(".//div/div[1]/div/div/div/div/div[2]/div[2]/button");
	
	
	

}
