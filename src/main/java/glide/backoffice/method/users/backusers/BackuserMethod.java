package glide.backoffice.method.users.backusers;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.dataprovider.ErrorMessages;
import glide.backoffice.enums.BackuserRoles;
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
	HomepageBackuserMethod homepageBackuserMethod;
	ViewBackuserMethod viewBackuserMethod;
	AddEditBackuserMethod addEditBackuserMethod;
	FilterBackusersMethod filterBackusersMethod;
	CommonMethods commonMethods;
	private static final String EDIT_BACK_USER=Config.getProperty("EDIT_BACK_USER");
	public BackuserMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		this.homepageBackuserMethod=PageFactory.initElements(driver, HomepageBackuserMethod.class);
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
		homepageBackuserMethod.clickOnAddABackuserButton();
		addEditBackuserMethod.waitUntilSaveButtonIsVisible();
		addEditBackuserMethod.inputBackuserData(backuserDto);
		addEditBackuserMethod.clickOnSaveButton();
		homepageBackuserMethod.waitUntilAddBackuesrButtonIsVisible();
		filterBackusersMethod.clickOnFilter();
		filterBackusersMethod.clickOnEmail();
		filterBackusersMethod.inputEmail(backuserDto.getEmail());
		filterBackusersMethod.clickOnConfirmButton();
		commonMethods.waitUntilTableContentVisible();
		return homepageBackuserMethod.assertAddEditBackuser(backuserDto.getEmail(), backuserDto.getLastName(), 
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
		homepageBackuserMethod.moveToBackUser(EDIT_BACK_USER);
		homepageBackuserMethod.clickOnViewButton(EDIT_BACK_USER);
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
		homepageBackuserMethod.moveToBackUser(EDIT_BACK_USER);
		homepageBackuserMethod.clickOnViewButton(EDIT_BACK_USER);
		viewBackuserMethod.waitUntilEditButtonIsVisible();	
		viewBackuserMethod.clickOnEditButton();
		addEditBackuserMethod.waitUntilSaveButtonIsVisible();
		addEditBackuserMethod.inputBackuserData(backuserDto);
		addEditBackuserMethod.clickOnSaveButtonOnEditBackuser();
		viewBackuserMethod.waitUntilEditButtonIsVisible();
		clickOnBackButton();
		return homepageBackuserMethod.assertAddEditBackuser(EDIT_BACK_USER, backuserDto.getLastName(), 
				backuserDto.getFirstName(), backuserDto.getRole());
		
	}
	/**
	 * This method  verifies the missing mandatory fields error message in the add a backuser page
	 * @return - Should be {@code List<Boolean>}
	 */
	public List<Boolean> mandatoryMissingFieldValidation() {
		homepageBackuserMethod.clickOnAddABackuserButton();
		addEditBackuserMethod.waitUntilSaveButtonIsVisible();
		addEditBackuserMethod.clickOnSaveButton();
		return addEditBackuserMethod.assertMissingMandatoryFields(ErrorMessages.FIELD_IS_REQUIRED);
	}
	
	/**
	 * This public method filters the backuser using the roles and checks only filtered roles are displayed in table
	 * @return {@code List<Boolean>}
	 */
	public List<Boolean> filterBackuserUsingRole() {
		List<Boolean> assertValue = new ArrayList<>();
		BackuserRoles[] backuserRole=BackuserRoles.values();
		String[] testRole = new String[5];
		for (int i=0; i<BackuserRoles.values().length;i++) {
			filterBackusersMethod.clickOnFilter();
			filterBackusersMethod.clickOnRole();
			testRole[i]=BackuserRoles.getBackUserValue(backuserRole[i].toString());
			filterBackusersMethod.clickOnFilterToShowFilterValueDropdown();
			filterBackusersMethod.selectRole(BackuserRoles.values()[i].toString());
			assertValue.add(i,  homepageBackuserMethod.assertRolesfilter(testRole[i]));
		}
		
		return assertValue;
		
	}
	
	/**
	 * This public method check the filtering property on backuser for filters which has input field value.
	 * @param email - Should be String
	 * @param firstname - Should be String
	 * @param lastname - Should be String
	 * @return {@code List<Boolean>}
	 */
	public List<Boolean> filterBackuserUsingFilterTypeInput(String email, String firstname, String lastname) {
		List<Boolean> assertValue = new ArrayList<>();
		filterBackusersMethod.clickOnFilter();
		if(!email.isEmpty() &&  firstname.isEmpty() && lastname.isEmpty()) {
			filterBackusersMethod.clickOnEmail();
			filterBackusersMethod.inputEmail(email);
			filterBackusersMethod.clickOnConfirmButton();
			return homepageBackuserMethod.assertBackuserFilterInputTypeValue(email, firstname, lastname);
		}
		else if(email.isEmpty() &&  !firstname.isEmpty() && lastname.isEmpty()) {
			filterBackusersMethod.clickOnFirstname();
			filterBackusersMethod.inputFirstname(firstname);
			filterBackusersMethod.clickOnConfirmButton();
			return homepageBackuserMethod.assertBackuserFilterInputTypeValue(email, firstname, lastname);
		}
		else if (email.isEmpty() &&  firstname.isEmpty() && !lastname.isEmpty()) {
			filterBackusersMethod.clickOnLastname();
			filterBackusersMethod.inputLastname(lastname);
			filterBackusersMethod.clickOnConfirmButton();
			return homepageBackuserMethod.assertBackuserFilterInputTypeValue(email, firstname, lastname);
		}
		else {
			 return assertValue;
		}

	}



}
