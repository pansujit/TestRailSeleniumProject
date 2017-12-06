package glide.backoffice.locators.users;

import org.openqa.selenium.By;

public class BackUsersCreateErrors {
	
	public final By spanTagEmailBackUsersCreateErrors=By.xpath(".//label[@class='boxedInput_label' and @for='email']/../div/span/span");
	public final By spanTagPhoneNOBackUsersCreateErrors=By.xpath(".//label[@class='boxedInput_label' and @for='phoneNumber']/../../div[2]/span/span");
	public final By spanTagFirstnameBackUsersCreateErrors=By.xpath("..//label[@class='boxedInput_label' and @for='firstName']/../div/span/span");
	public final By spanTagLastnameBackUsersCreateErrors=By.xpath(".//label[@class='boxedInput_label' and @for='lastName']/../div/span/span");
	public final By spanTagAddressBackUsersCreateErrors=By.xpath(".//div[@class='geosuggest backUserForm_AddressAutocomplete']/../div[2]/span/span");
	public final By spanTagCompanyIDBackUsersCreateErrors=By.xpath(".//select[@name='companyId']/../../div/span/span");
	public final By spanTagRoleBackUsersCreateErrors=By.xpath(".//span[contains(@class,'ekRadio_title')]/../div[2]/span/span");
}
