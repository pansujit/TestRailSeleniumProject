package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;

public class FindVehicleBooking {
	
	public final By divTagCheckRoundTrip= By.xpath(".//input[@id='tripType_roundTrip']/..");
	public final By inputTagStartAddress= By.xpath(".//div[@class='searchVehicle_col searchVehicle_col--left']/div[1]//input");
	public final By inputTagStartAddressPopup= By.xpath(".//*[@class='geosuggest__suggests']//li[text()='testCompanySite']");
	public final By divTagStartDatePopup= By.xpath("html/body/div[2]/div/div[1]/div/div/div/div");
	public final By divTagStartDate= By.xpath(".//input[contains(@id,'pickupDate-undefined-undefined-')]");

	public final By divTagStartHour= By.xpath(".//div[@class='boxedSelectBlock']//select[@name='pickupDateHour']");
	public final By divTagStartMinute= By.xpath(".//div[@class='boxedSelectBlock']//select[@name='pickupDateMin']");
	public final By divTagEndDatePopup= By.xpath("html/body/div[3]/div/div[1]/div/div/div");
	public final By divTagEndDate= By.xpath(".//input[contains(@id,'returnDate-undefined-undefined-')]");

	public final By divTagEndHour= By.xpath(".//div[@class='boxedSelectBlock']//select[@name='returnDateHour']");
	public final By divTagEndMinute= By.xpath(".//div[@class='boxedSelectBlock']//select[@name='returnDateMin']");
	
	public final By buttonTagSearch= By.xpath(".//button[@class='ekButton ekButton--variant3 ekButton--fullWidth submit']");
	public final By buttonTagBookingConfirmButton= 
			By.xpath(".//table/tbody/tr/td//span[contains(text(),'kkkkkkkkk')]/../../../td/span/span[contains(text(),'PRIVATE')]/../../../td[10]/button");
	public final By divTagPaidBooking= By.xpath(".//div[@class='checkboxMaterial']/div/div/div[1]");
	
	public final By inputTagCustomField= By.xpath(".//input[@class='boxedInput boxedInput--text']");
	public final By buttonTagSave= By.xpath(".//button[@class='ekButton addBookingConfirmationForm_button']");
	public final By buttonTagCancel= By.xpath("//button[@class='ekButton ekButton--reverse addBookingConfirmationForm_button']");

}
