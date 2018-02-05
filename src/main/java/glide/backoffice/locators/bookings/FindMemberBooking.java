package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;

public class FindMemberBooking {
	/**
	 * This will find Book button element in Bookings-->Create Booking-->Find member
	 * @param replacementText - Should be String
	 * @return Selenium By
	 */
	public final By buttonTagBookFindMemberBooking(String replacementText) {
		String text=	".//table//tr/td[3]/span/span[contains(text(),'xxxx')]/../../../td[7]/button";
		 
		return  By.xpath(text.replace("xxxx", replacementText));
	}
	
	/**
	 * This will find Name element in Bookings-->Create Booking-->Find member
	 */
	public final By inputTagNameFindMemberBooking= By.xpath(".//input[@id='memberName']");
	
	/**
	 * This will find Email element in Bookings-->Create Booking-->Find member
	 */
	public final By inputTagEmailFindMemberBooking= By.xpath(".//input[@id='email']");
	
	/**
	 * This will find Professional element in Bookings-->Create Booking-->Find member
	 */
	public final By selectTagProfessionalFindMemberBooking= 
			By.xpath(".//div[@class='boxedSelectBlockInner']//select[@name='professional']");
	
	/**
	 * This will find  Search button element in Bookings-->Create Booking-->Find member
	 */
	public final By buttonTagSearchFindMemberBooking= 
			By.xpath(".//button[@class='ekButton searchMembersForm_actionsButton']");
	
	/**
	 * This will find Reset button element in Bookings-->Create Booking-->Find member
	 */
	public final By buttonTagResetFindMemberBooking= 
			By.xpath(".//button[@class='ekButton ekButton--reverse searchMembersForm_actionsButton']");
	
}
