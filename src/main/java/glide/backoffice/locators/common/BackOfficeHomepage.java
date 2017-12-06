package glide.backoffice.locators.common;

import org.openqa.selenium.By;
/**
 * This class contains all the locators in back office homepage except dashboard items
 * @author sujitpandey
 *
 */
public class BackOfficeHomepage {
	
	/**
	 * This locator will find menuBar tag in the back Office homepage
	 */
	public final By buttonTagMenuIconBackOfficeHomepage= By.xpath("//*[@id='mainContainer']/div/div[1]/header/div[1]/div/button[2]");
	
	
	/**
	 * This locator will find DashBoard tag in the back Office homepage
	 */
	public final By aTagBackOfficeHomepageDashboard= By.xpath(".//ul[@class='sideMenu_sections']//li/a[@href='#/dashboard']");
	

	
	/**
	 * This locator will find General Settings tag in the back Office homepage
	 */
	public final By buttonTagGeneralSettingsBackOfficeHomepage= By.xpath(".//li[@class='sideMenu_section sideMenu_section--settings']/button");
	
	/**
	 * This locator will find Account Management tag in the back Office homepage
	 */
	public final By buttonTagAccountsBackOfficeHomepage= By.xpath(".//li[@class='sideMenu_section sideMenu_section--accountManagement']/button");
	
	/**
	 * This locator will find Fleet Management tag in the back Office homepage
	 */
	public final By buttonTagFleetsBackOfficeHomepage= By.xpath(".//li[@class='sideMenu_section sideMenu_section--fleet']/button");
	
	/**
	 * This locator will find User Management tag in the back Office homepage
	 */
	public final By buttonTagUsersBackOfficeHomepage= By.xpath(".//li[@class='sideMenu_section sideMenu_section--membersManagement']/button");
	
	/**
	 * This locator will find Booking Management tag in the back Office homepage
	 */
	public final By aTagBookingsBackOfficeHomepage= By.xpath(".//li[@class='sideMenu_section sideMenu_section--booking']/a");
	
	/**
	 * This locator will find Invoice Management tag in the back Office homepage
	 */
	public final By aTagInvoicesBackOfficeHomepage= By.xpath(".//li[@class='sideMenu_section sideMenu_section--invoice']/a");
	
	/**
	 * This locator will find Voucher Management tag in the back Office homepage
	 */
	public final By aTagVoucherBackOfficeHomepage= By.xpath(".//li[@class='sideMenu_section sideMenu_section--invoice']/a");
	
	
	
	
	
	
	
	
	

}
