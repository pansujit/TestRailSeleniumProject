package glide.backoffice.method.accounts.hotlines;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.common.Config;

public class HotlineMethod {
	WebDriver driver;
	AddEditHotlineMethod addEditHotlineMethod;
	HomepageHotlineMethod homepageHotlineMethod;
	
	public HotlineMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageHotlineMethod=PageFactory.initElements(driver, HomepageHotlineMethod.class);
		this.addEditHotlineMethod=PageFactory.initElements(driver, AddEditHotlineMethod.class);
	}
	/**
	 * This public method create a new hotline in the system and check its value on the hotline table
	 * @param hotlineDto - Should be HotlineDto
	 */
	public void addAHotline(HotlineDto hotlineDto) {
		homepageHotlineMethod.addANewHotline();
		addEditHotlineMethod.inputDataForhotline(hotlineDto);
		addEditHotlineMethod.clickOnSaveButtonHotline();
		homepageHotlineMethod.assertAddEditHotline(hotlineDto.getHotlineName(),hotlineDto.getHotlineEmail(), hotlineDto.getPhoneNumber());		
	}
	/**
	 * This public method Edit a given hotline in the system and check its modification on the hotline table
	 * @param hotlineDto - Should be HotlineDto
	 */
	public void editAHotline(HotlineDto hotlineDto) {
		homepageHotlineMethod.clickOnEditButton(Config.getProperty("EDIT_HOTLINE"));
		addEditHotlineMethod.inputDataForhotline(hotlineDto);
		addEditHotlineMethod.clickOnSaveButtonHotline();
		homepageHotlineMethod.assertAddEditHotline(Config.getProperty("EDIT_HOTLINE"), hotlineDto.getHotlineEmail(), "+33"+hotlineDto.getPhoneNumber());
	}
}
