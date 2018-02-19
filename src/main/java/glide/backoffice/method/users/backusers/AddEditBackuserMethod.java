package glide.backoffice.method.users.backusers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.users.backusers.AddBackuser;
import glide.backoffice.locators.users.backusers.HomepageBackusers;
import glide.backoffice.locators.users.backusers.ViewBackuser;
import glide.backoffice.utility.SeleniumUtility;

public class AddEditBackuserMethod {

	WebDriver driver;
	AddBackuser addBackuser;
	HomepageBackusers homepageBackusers;
	ViewBackuser viewBackuser;
	public AddEditBackuserMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addBackuser=PageFactory.initElements(driver, AddBackuser.class);
		this.homepageBackusers=PageFactory.initElements(driver, HomepageBackusers.class);
		this.viewBackuser=PageFactory.initElements(driver, ViewBackuser.class);

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
	void inputBackuserData(BackuserDto backuserDto) {
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
	
	void clickOnSaveButton() {
		SeleniumUtility.clickOnElement(driver, addBackuser.buttonTagSaveEditBackuser);
		SeleniumUtility.waitElementToBeVisible(driver, homepageBackusers.aTagAddABackuserHomepageBackusers);
		SeleniumUtility.fixedWait(1);
	}
	
	void clickOnSaveButtonOnEditBackuser() {
		SeleniumUtility.clickOnElement(driver, addBackuser.buttonTagSaveEditBackuser);
		SeleniumUtility.waitElementToBeVisible(driver, viewBackuser.aTagBackUserViewEdit);
		SeleniumUtility.fixedWait(1);
	}
}
