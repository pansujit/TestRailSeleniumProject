package glide.backoffice.method.users.backusers;

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
	 */
	public void addABackuser(BackuserDto backuserDto) {
		backuserHomepageMethod.clickOnAddABackuserButton();
		addEditBackuserMethod.waitUntilSaveButtonIsVisible();
		addEditBackuserMethod.inputBackuserData(backuserDto);
		addEditBackuserMethod.clickOnSaveButton();
		backuserHomepageMethod.waitUntilAddBackuesrButtonIsVisible();
		backuserHomepageMethod.assertAddEditBackuser("sujit.pandey+test@glidemobility.com", backuserDto.getLastName(), 
				backuserDto.getFirstName(), backuserDto.getRole());
	}
	
	/**
	 * This public method redirect to the view page of any given backuser
	 */
	public void viewABackuser() {
		// click on filter and search by email
		filterBackusersMethod.clickOnFilter();
		filterBackusersMethod.inputEmailInEmailField(EDIT_BACK_USER);
		filterBackusersMethod.clickOnSearchButton();
		commonMethods.waitUntilTableContentVisible();
		
		backuserHomepageMethod.clickOnViewButton(EDIT_BACK_USER);
		viewBackuserMethod.waitUntilEditButtonIsVisible();
		viewBackuserMethod.assertViewBackuser();
		clickOnBackButton();
	}
	/**
	 * This public method Edit the existing backuser with given information.
	 * @param backuserDto - Should be BackuserDto
	 */
	public void editABackuser(BackuserDto backuserDto) {
		// click on filter and search by email
		filterBackusersMethod.clickOnFilter();
		filterBackusersMethod.inputEmailInEmailField(EDIT_BACK_USER);
		filterBackusersMethod.clickOnSearchButton();
		commonMethods.waitUntilTableContentVisible();
		//Click on the view button of the given member
		backuserHomepageMethod.clickOnViewButton(EDIT_BACK_USER);
		viewBackuserMethod.waitUntilEditButtonIsVisible();	
		viewBackuserMethod.clickOnEditButton();
		addEditBackuserMethod.waitUntilSaveButtonIsVisible();
		addEditBackuserMethod.inputBackuserData(backuserDto);
		addEditBackuserMethod.clickOnSaveButtonOnEditBackuser();
		viewBackuserMethod.waitUntilEditButtonIsVisible();
		clickOnBackButton();
		backuserHomepageMethod.assertAddEditBackuser(EDIT_BACK_USER, backuserDto.getLastName(), 
				backuserDto.getFirstName(), backuserDto.getRole());
		
	}
	
	public void mandatoryMissingFieldValidation() {
		backuserHomepageMethod.clickOnAddABackuserButton();
		addEditBackuserMethod.waitUntilSaveButtonIsVisible();
		addEditBackuserMethod.clickOnSaveButton();
		addEditBackuserMethod.assertMissingMandatoryFields(ErrorMessages.FIELD_IS_REQUIRED);
	}



}
