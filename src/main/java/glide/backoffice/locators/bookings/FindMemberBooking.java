package glide.backoffice.locators.bookings;

import org.openqa.selenium.By;

public class FindMemberBooking {
	public final By inputTagSearchMemberByName= By.xpath(".//input[@id='memberName']");
	public final By inputTagSearchMemberByEmail= By.xpath(".//input[@id='email']");
	public final By selectTagProfessional= By.xpath(".//*[@class='boxedSelectBlockInner']//select[@name='professional']");
	public final By buttonTagSearch= By.xpath(".//button[@class='ekButton searchMembersForm_actionsButton']");
	public final By buttonTagReset= By.xpath(".//button[@class='ekButton ekButton--reverse searchMembersForm_actionsButton']");
	
	public final By bookOncreateBooking(String replacementText) {
		String text=	".//table//tr/td[3]/span/span[contains(text(),'xxxx')]/../../../td[7]/button";
		 
		return  By.xpath(text.replace("xxxx", replacementText));
	}
	
}
