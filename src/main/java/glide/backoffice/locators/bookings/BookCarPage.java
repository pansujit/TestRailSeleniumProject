package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;

public class BookCarPage {
	
	final public By divTagCheckRoundTrip= By.xpath(".//input[@id='tripType_roundTrip']/..");
	final public By inputTagStartAddress= By.xpath(".//div[@class='searchVehicle_col searchVehicle_col--left']/div[1]//input");
	final public By inputTagStartAddressPopup= By.xpath(".//*[@class='geosuggest__suggests']//li[text()='testCompanySite']");
	final public By divTagStartDatePopup= By.xpath("html/body/div[2]/div/div[1]/div/div/div/div");
	final public By divTagStartDate= By.xpath(".//input[contains(@id,'pickupDate-undefined-undefined-')]");

	final public By divTagStartHour= By.xpath(".//div[@class='boxedSelectBlock']//select[@name='pickupDateHour']");
	final public By divTagStartMinute= By.xpath(".//div[@class='boxedSelectBlock']//select[@name='pickupDateMin']");
	final public By divTagEndDatePopup= By.xpath("html/body/div[3]/div/div[1]/div/div/div");
	final public By divTagEndDate= By.xpath(".//input[contains(@id,'returnDate-undefined-undefined-')]");

	final public By divTagEndHour= By.xpath(".//div[@class='boxedSelectBlock']//select[@name='returnDateHour']");
	final public By divTagEndMinute= By.xpath(".//div[@class='boxedSelectBlock']//select[@name='returnDateMin']");
	
	final public By buttonTagSearch= By.xpath(".//button[@class='ekButton ekButton--variant3 ekButton--fullWidth submit']");
	final public By buttonTagBookingConfirmButton= 
			By.xpath(".//table/tbody/tr/td//span[contains(text(),'kkkkkkkkk')]/../../../td/span/span[contains(text(),'PRIVATE')]/../../../td[10]/button");
	final public By divTagPaidBooking= By.xpath(".//div[@class='checkboxMaterial']/div/div/div[1]");
	
	final public By inputTagCustomField= By.xpath(".//input[@class='boxedInput boxedInput--text']");
	final public By buttonTagSave= By.xpath(".//button[@class='ekButton addBookingConfirmationForm_button']");
	final public By buttonTagCancel= By.xpath("//button[@class='ekButton ekButton--reverse addBookingConfirmationForm_button']");


	

	
	
	


	
	

	

}
