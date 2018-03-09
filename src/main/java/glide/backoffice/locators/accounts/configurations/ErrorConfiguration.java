package glide.backoffice.locators.accounts.configurations;

import org.openqa.selenium.By;

public class ErrorConfiguration {
		/**
		 * This will find Configuration name Error text element in configuration in  Account-->Configuration-->Edit
		 */
		public final By inputTagConfigurationNameErrorConfiguration= By.xpath(".//input[@id='name']/../../../div/span/span");
		
		/**
		 * This will find Vat Number Error text element in configuration in  Account-->Configuration-->Edit
		 */
		public final By inputTagVatNumberErrorConfiguration= By.xpath(".//input[@id='vatCode']/../../../div/span/span");
		
		/**
		 * This will find Vat Rate Error text element in configuration in  Account-->Configuration-->Edit
		 */
		public final By inputTagVatRateErrorConfiguration= By.xpath(".//input[@id='vatRate']/../../../div/span/span");
		

}
