package glide.backoffice.method.users.backusers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
/**
 * This Class contains all common and public methods for Backuser page of back office.
 * @author sujitpandey
 * @created on Feb 19, 2018 3:12:21 PM
 */
public class BackuserMethod {

	WebDriver driver;
	SideMenuItemsMethod sideMenuItemsMethod;
	HeaderMethod headerMethod;
	BackuserHomepageMethod backuserHomepageMethod;
	ViewBackuserMethod viewBackuserMethod;
	AddEditBackuserMethod addEditBackuserMethod;
	
	public BackuserMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.sideMenuItemsMethod=PageFactory.initElements(driver, SideMenuItemsMethod.class);
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		this.backuserHomepageMethod=PageFactory.initElements(driver, BackuserHomepageMethod.class);
		this.viewBackuserMethod=PageFactory.initElements(driver, ViewBackuserMethod.class);
		this.addEditBackuserMethod=PageFactory.initElements(driver, AddEditBackuserMethod.class);


	}
	/**
	 * This private method click on the back button in left side of the big search box.
	 */
	private void clickOnBackButton() {
		headerMethod.clickOnHeaderBackButton();
	}
	/**
	 * This public method create a new backuser to the super company with given permission and super company and company if applicable
	 * @param backuserDto - Should be BackuserDto
	 */
	public void addABackuser(BackuserDto backuserDto) {
		backuserHomepageMethod.clickOnAddABackuserButton();
		addEditBackuserMethod.inputBackuserData(backuserDto);
		addEditBackuserMethod.clickOnSaveButton();
	}
	/**
	 * This public method redirect to the view page of any given backuser
	 */
	public void viewABackuser() {
		backuserHomepageMethod.clickOnViewButton(Config.getProperty("EDIT_BACK_USER"));
		clickOnBackButton();
	}
	/**
	 * This public method Edit the existing backuser with given information.
	 * @param backuserDto - Should be BackuserDto
	 */
	public void editABackuser(BackuserDto backuserDto) {
		backuserHomepageMethod.clickOnViewButton(Config.getProperty("EDIT_BACK_USER"));
		viewBackuserMethod.clickOnEditButton();
		addEditBackuserMethod.inputBackuserData(backuserDto);
		addEditBackuserMethod.clickOnSaveButtonOnEditBackuser();
		clickOnBackButton();
	}



}
