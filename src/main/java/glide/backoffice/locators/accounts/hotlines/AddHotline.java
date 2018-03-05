package glide.backoffice.locators.accounts.hotlines;
/**
 *  This contains all the elements from edit hotline 
 * @author sujitpandey
 *
 */

import org.openqa.selenium.By;

public class AddHotline extends EditHotline {

	/**
	 * This locator will find Error message text element in Name  in Account-->Hotlines--> Add a Hotline
	 */
	public final By spanTagErrorMessageNameAddHotline= 
			By.xpath(".//div[@class='fieldErrorMsg fieldErrorMsg--vehiclesColorForm']/span/span");
	
	/**
	 *  This locator will find Error message text element in "Email of the customer service"  
	 *  in Account-->Hotlines--> Add a Hotline
	 */
	public final By spanTagNameCompanyEmailAddHotline= 
			By.xpath(".//div[@class='fieldErrorMsg fieldErrorMsg--companyForm']/span/span");

	

}
