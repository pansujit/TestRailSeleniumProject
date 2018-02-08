package glide.backoffice.method.users;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.users.backusers.AddBackuser;
import glide.backoffice.locators.users.backusers.FilterBackusers;
import glide.backoffice.locators.users.backusers.HomepageBackusers;
import glide.backoffice.locators.users.backusers.ViewBackuser;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.utility.SeleniumUtility;

public class BackuserMethod {
	
	WebDriver driver;
	HomepageBackusers homepageBackusers;
	AddBackuser addBackuser;
	FilterBackusers filterBackusers;
	SideMenuItemsMethod sideMenuItemsMethod;
	HeaderMethod headerMethod;
	ViewBackuser viewBackuser;
	public BackuserMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageBackusers=PageFactory.initElements(driver, HomepageBackusers.class);
		this.addBackuser=PageFactory.initElements(driver, AddBackuser.class);
		this.filterBackusers=PageFactory.initElements(driver, FilterBackusers.class);
		this.sideMenuItemsMethod=PageFactory.initElements(driver, SideMenuItemsMethod.class);
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		this.viewBackuser=PageFactory.initElements(driver, ViewBackuser.class);
	}
	/**
	 * This method clicks on Add a backuser button in backuser page
	 */
	private void clickOnAddABackuserButton() {
		SeleniumUtility.clickOnElement(driver,homepageBackusers.aTagAddABackuserHomepageBackusers );
		SeleniumUtility.waitElementToBeVisible(driver,addBackuser.buttonTagSaveEditBackuser);
		SeleniumUtility.fixedWait(1);
	}
	
	private void selectSuperCompany(String role,String superCompanyName) {
		if(role.equalsIgnoreCase("ADMIN")||role.equalsIgnoreCase("FLEET_MANAGER")||role.equalsIgnoreCase("CALL_CENTER_OPERATOR")) {
			SeleniumUtility.selectByVisibleText(driver, addBackuser.selectTagSuperCompanyEditBackuser, superCompanyName);
		}
		else {
			return;
		}
	}
	private void selectCompany(String role,String companyName) {
		if(role.equalsIgnoreCase("FLEET_MANAGER")) {
			SeleniumUtility.selectByVisibleText(driver, addBackuser.selectTagCompanyEditBackuser, companyName);
		}
		else {
			return;
		}
	}
	private void inputBackuserData(BackuserDto backuserDto) {
		SeleniumUtility.clearTextAndSendText(driver, addBackuser.inputTagEmailEditBackuser, backuserDto.getEmail());
		
		SeleniumUtility.clickOnElement(driver, addBackuser.inputTagEmailCheckerBackuser);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.clickOnElement(driver, addBackuser.labelTagRoleEditBackuser(backuserDto.getRole()));
		selectSuperCompany(backuserDto.getRole(),backuserDto.getSuperCompanyName());
		SeleniumUtility.fixedWait(1);
		selectCompany(backuserDto.getRole(),backuserDto.getCompanyName());
		SeleniumUtility.clearTextAndSendText(driver, addBackuser.inputTagFirstnameEditBackuser, backuserDto.getFirstName());
		SeleniumUtility.clearTextAndSendText(driver, addBackuser.inputTagLastnameEditBackuser, backuserDto.getLastName());
		
		SeleniumUtility.clearTextAndSendText(driver, addBackuser.inputTagPhoneEditBackuser, backuserDto.getPhoneNumber());
		SeleniumUtility.clearTextAndSendText(driver, addBackuser.inputTagAddressEditBackuser, backuserDto.getAddress());
	}
	
	private void clickOnSaveButton() {
		SeleniumUtility.clickOnElement(driver, addBackuser.buttonTagSaveEditBackuser);
		SeleniumUtility.waitElementToBeVisible(driver, homepageBackusers.aTagAddABackuserHomepageBackusers);
		SeleniumUtility.fixedWait(1);
	}
	
	private void clickOnSaveButtonOnEditBackuser() {
		SeleniumUtility.clickOnElement(driver, addBackuser.buttonTagSaveEditBackuser);
		SeleniumUtility.waitElementToBeVisible(driver, viewBackuser.aTagBackUserViewEdit);
		SeleniumUtility.fixedWait(1);
	}
	private void clickOnEditButton() {
		SeleniumUtility.clickOnElement(driver,viewBackuser.aTagBackUserViewEdit);
		SeleniumUtility.waitElementToBeVisible(driver, addBackuser.buttonTagSaveEditBackuser);
		SeleniumUtility.fixedWait(1);
	}
	private void clickOnViewButton(String testBackuser) {
		SeleniumUtility.clickOnElement(driver, homepageBackusers.buttonTagViewHomepageBackusers(testBackuser));
		SeleniumUtility.waitElementToBeVisible(driver, viewBackuser.aTagBackUserViewEdit);
		SeleniumUtility.fixedWait(1);

	}
	private void clickOnBackButton() {
		headerMethod.clickOnHeaderBackButton();
	}
	
	

	public void addABackuser(BackuserDto backuserDto) {
		clickOnAddABackuserButton();
		inputBackuserData(backuserDto);
		clickOnSaveButton();
	}
	public void viewABackuser() {
		clickOnViewButton("sujit.pandey+1a@glidemobility.com");
		clickOnBackButton();
	}
	public void editABackuser(BackuserDto backuserDto) {
		clickOnViewButton("sujit.pandey+1a@glidemobility.com");
		clickOnEditButton();
		inputBackuserData(backuserDto);
		clickOnSaveButtonOnEditBackuser();
		clickOnBackButton();
	}
	
	

}
