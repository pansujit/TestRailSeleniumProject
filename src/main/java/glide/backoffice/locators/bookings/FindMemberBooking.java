package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;

public class FindMemberBooking {
	final public By inputTagSearchMemberByName= By.xpath(".//input[@id='memberName']");
	final public By inputTagSearchMemberByEmail= By.xpath(".//input[@id='email']");
	final public By selectTagProfessional= By.xpath(".//*[@class='boxedSelectBlockInner']//select[@name='professional']");
	final public By ButtonTagSearch= By.xpath(".//button[@class='ekButton searchMembersForm_actionsButton']");
	final public By ButtonTagReset= By.xpath(".//button[@class='ekButton ekButton--reverse searchMembersForm_actionsButton']");
	
	public final By bookOncreateBooking(String replacementText) {
		String text=	".//table//tr/td[3]/span/span[contains(text(),'xxxx')]/../../../td[7]/button";
		 
		return  By.xpath(text.replace("xxxx", replacementText));
	}
	
}
