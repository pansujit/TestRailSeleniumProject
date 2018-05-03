package glide.backoffice.method.users.backusers;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.dataprovider.ErrorMessages;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
/**
 * This Class contains all common and public methods for Backuser page of back office.
 * @author sujitpandey
 * @created on Feb 19, 2018 3:12:21 PM
 */
public class BackuserMethod {

	WebDriver driver;
	HeaderMethod headerMethod;
	BackuserHomepageMethod backuserHomepageMethod;
	ViewBackuserMethod viewBackuserMethod;
	AddEditBackuserMethod addEditBackuserMethod;
	FilterBackusersMethod filterBackusersMethod;
	CommonMethods commonMethods;
	private static final String EDIT_BACK_USER=Config.getProperty("EDIT_BACK_USER");
	public BackuserMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		this.backuserHomepageMethod=PageFactory.initElements(driver, BackuserHomepageMethod.class);
		this.viewBackuserMethod=PageFactory.initElements(driver, ViewBackuserMethod.class);
		this.addEditBackuserMethod=PageFactory.initElements(driver, AddEditBackuserMethod.class);
		this.filterBackusersMethod=PageFactory.initElements(driver, FilterBackusersMethod.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);

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
	 * @return 
	 */
	public List<Boolean> addABackuser(BackuserDto backuserDto) {
		backuserHomepageMethod.clickOnAddABackuserButton();
		addEditBackuserMethod.waitUntilSaveButtonIsVisible();
		addEditBackuserMethod.inputBackuserData(backuserDto);
		addEditBackuserMethod.clickOnSaveButton();
		backuserHomepageMethod.waitUntilAddBackuesrButtonIsVisible();
		filterBackusersMethod.clickOnFilter();
		filterBackusersMethod.clickOnEmail();
		filterBackusersMethod.inputEmail(backuserDto.getEmail());
		filterBackusersMethod.clickOnConfirmButton();
		commonMethods.waitUntilTableContentVisible();
		return backuserHomepageMethod.assertAddEditBackuser(backuserDto.getEmail(), backuserDto.getLastName(), 
				backuserDto.getFirstName(), backuserDto.getRole());
	}
	
	/**
	 * This public method redirect to the view page of any given backuser
	 * @return 
	 */
	public List<Boolean> viewABackuser() {
		// click on filter and search by email
		filterBackusersMethod.clickOnFilter();
		filterBackusersMethod.clickOnEmail();
		filterBackusersMethod.inputEmail(EDIT_BACK_USER);
		filterBackusersMethod.clickOnConfirmButton();
		commonMethods.waitUntilTableContentVisible();
		backuserHomepageMethod.moveToBackUser(EDIT_BACK_USER);
		backuserHomepageMethod.clickOnViewButton(EDIT_BACK_USER);
		viewBackuserMethod.waitUntilEditButtonIsVisible();
		return viewBackuserMethod.assertViewBackuser(EDIT_BACK_USER);
	}
	/**
	 * This public method Edit the existing backuser with given information.
	 * @param backuserDto - Should be BackuserDto
	 * @return 
	 */
	public List<Boolean> editABackuser(BackuserDto backuserDto) {
		// click on filter and search by email
		filterBackusersMethod.clickOnFilter();
		filterBackusersMethod.clickOnEmail();
		filterBackusersMethod.inputEmail(EDIT_BACK_USER);
		filterBackusersMethod.clickOnConfirmButton();
		commonMethods.waitUntilTableContentVisible();
		//Click on the view button of the given member
		backuserHomepageMethod.moveToBackUser(EDIT_BACK_USER);
		backuserHomepageMethod.clickOnViewButton(EDIT_BACK_USER);
		viewBackuserMethod.waitUntilEditButtonIsVisible();	
		viewBackuserMethod.clickOnEditButton();
		addEditBackuserMethod.waitUntilSaveButtonIsVisible();
		addEditBackuserMethod.inputBackuserData(backuserDto);
		addEditBackuserMethod.clickOnSaveButtonOnEditBackuser();
		viewBackuserMethod.waitUntilEditButtonIsVisible();
		clickOnBackButton();
		return backuserHomepageMethod.assertAddEditBackuser(EDIT_BACK_USER, backuserDto.getLastName(), 
				backuserDto.getFirstName(), backuserDto.getRole());
		
	}
	
	public List<Boolean> mandatoryMissingFieldValidation() {
		backuserHomepageMethod.clickOnAddABackuserButton();
		addEditBackuserMethod.waitUntilSaveButtonIsVisible();
		addEditBackuserMethod.clickOnSaveButton();
		return addEditBackuserMethod.assertMissingMandatoryFields(ErrorMessages.FIELD_IS_REQUIRED);
	}



}
