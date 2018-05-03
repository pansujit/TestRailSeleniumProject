package glide.backoffice.method.users.backusers;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.users.backusers.AddBackuser;
import glide.backoffice.locators.users.backusers.BackuserCreateErrors;
import glide.backoffice.locators.users.backusers.HomepageBackusers;
import glide.backoffice.locators.users.backusers.ViewBackuser;
import glide.backoffice.utility.SeleniumUtility;

public class AddEditBackuserMethod {

	WebDriver driver;
	AddBackuser addBackuser;
	HomepageBackusers homepageBackusers;
	ViewBackuser viewBackuser;
	BackuserCreateErrors backuserCreateErrors;
	SoftAssert softAssert;
	public AddEditBackuserMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.addBackuser=PageFactory.initElements(driver, AddBackuser.class);
		this.homepageBackusers=PageFactory.initElements(driver, HomepageBackusers.class);
		this.viewBackuser=PageFactory.initElements(driver, ViewBackuser.class);
		this.backuserCreateErrors=PageFactory.initElements(driver, BackuserCreateErrors.class);
		this.softAssert= new SoftAssert();
	}

	private void selectSuperCompanies(String superCompanyName) {
		SeleniumUtility.clickOnElement(driver, addBackuser.selectTagAvailableSuperCompanyEditBackuser);
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.selectByVisibleText(driver, addBackuser.selectTagAvailableSuperCompanyEditBackuser, superCompanyName);
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.selectByVisibleText(driver, addBackuser.selectTagAvailableSuperCompanyEditBackuser, superCompanyName);
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.clickOnElement(driver, addBackuser.buttonTagMoveCompanyRightEditBackuser);
	}

	private void selectCompanies(String companyName) {
		SeleniumUtility.clickOnElement(driver, addBackuser.selectTagAvailableCompanyEditBackuser);
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.selectByVisibleText(driver, addBackuser.selectTagAvailableCompanyEditBackuser, companyName);
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.selectByVisibleText(driver, addBackuser.selectTagAvailableCompanyEditBackuser, companyName);
		SeleniumUtility.fixedWait(3);
		SeleniumUtility.clickOnElement(driver, addBackuser.buttonTagMoveCompanyRightEditBackuser);
	}
	private void selectSuperCompany(String role,String superCompanyName) {
		if(role.equalsIgnoreCase("ADMIN")||role.equalsIgnoreCase("CALL_CENTER_OPERATOR")) {
			if(SeleniumUtility.getSizeofOptionsInSelect(driver, addBackuser.selectTagSelectedSuperCompanyEditBackuser)<=1)
			{
				selectSuperCompanies(superCompanyName);
			}
		}
		else if(role.equalsIgnoreCase("FLEET_MANAGER")) {
			SeleniumUtility.selectByVisibleText(driver, addBackuser.selectagSuperCompanyForFleetMGREditBackuser, "-");
			SeleniumUtility.fixedWait(2);
			SeleniumUtility.selectByVisibleText(driver, addBackuser.selectagSuperCompanyForFleetMGREditBackuser, superCompanyName);
			SeleniumUtility.fixedWait(2);

		}
		else {
			return;
		}

	}
	private void selectCompany(String role,String companyName) {
		if(role.equalsIgnoreCase("FLEET_MANAGER")) {

			if(SeleniumUtility.getSizeofOptionsInSelect(driver, addBackuser.selectTagSelectedCompanyEditBackuser)<=1)
			{

				selectCompanies(companyName);
			}
			else {
				return;
			}
		}
	}
	/**
	 * This method waits until the SAVE button is displayed on ADD/Edit Backuser in back office
	 */
	void waitUntilSaveButtonIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, addBackuser.buttonTagSaveEditBackuser);
		SeleniumUtility.fixedWait(1);
	}

	void inputBackuserData(BackuserDto backuserDto) {
		SeleniumUtility.clearTextAndSendText(driver, addBackuser.inputTagEmailEditBackuser, backuserDto.getEmail());

		SeleniumUtility.clickOnElement(driver, addBackuser.inputTagEmailCheckerBackuser);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.clickOnElement(driver, addBackuser.labelTagRoleEditBackuser(backuserDto.getRole()));
		selectSuperCompany(backuserDto.getRole(),backuserDto.getSuperCompanyName().toLowerCase());
		SeleniumUtility.fixedWait(1);
		selectCompany(backuserDto.getRole(),backuserDto.getCompanyName());
		SeleniumUtility.clearTextAndSendText(driver, addBackuser.inputTagFirstnameEditBackuser, backuserDto.getFirstName());
		SeleniumUtility.clearTextAndSendText(driver, addBackuser.inputTagLastnameEditBackuser, backuserDto.getLastName());

		SeleniumUtility.clearTextAndSendText(driver, addBackuser.inputTagPhoneEditBackuser, backuserDto.getPhoneNumber());
		SeleniumUtility.clearTextAndSendText(driver, addBackuser.inputTagAddressEditBackuser, backuserDto.getAddress());
	}

	void clickOnSaveButton() {
		SeleniumUtility.clickOnElement(driver, addBackuser.buttonTagSaveEditBackuser);
	}

	void clickOnSaveButtonOnEditBackuser() {
		SeleniumUtility.clickOnElement(driver, addBackuser.buttonTagSaveEditBackuser);

	}
	
	List<Boolean> assertMissingMandatoryFields(String assertionText) {
		List<Boolean> assertValue= new ArrayList<>();
		assertValue.add(0,SeleniumUtility.compareIgnoreCaseText(driver, 
				backuserCreateErrors.spanTagEmailBackUsersCreateErrors, assertionText));
		assertValue.add(1,SeleniumUtility.compareIgnoreCaseText(driver, 
				backuserCreateErrors.spanTagPhoneNOBackUsersCreateErrors, assertionText));
		assertValue.add(2,SeleniumUtility.compareIgnoreCaseText(driver, 
				backuserCreateErrors.spanTagFirstnameBackUsersCreateErrors, assertionText));
		assertValue.add(3,SeleniumUtility.compareIgnoreCaseText(driver, 
				backuserCreateErrors.spanTagLastnameBackUsersCreateErrors, assertionText));
		assertValue.add(4,SeleniumUtility.compareIgnoreCaseText(driver, 
				backuserCreateErrors.spanTagAddressBackUsersCreateErrors, assertionText));
		assertValue.add(5,SeleniumUtility.compareIgnoreCaseText(driver, 
				backuserCreateErrors.spanTagRoleBackUsersCreateErrors, assertionText));
		return assertValue;
	}
}
