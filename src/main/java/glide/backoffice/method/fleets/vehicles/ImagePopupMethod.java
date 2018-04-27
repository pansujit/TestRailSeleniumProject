package glide.backoffice.method.fleets.vehicles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.fleets.vehicles.ImagePopupVehicle;
import glide.backoffice.utility.SeleniumUtility;

public class ImagePopupMethod {

	ImagePopupVehicle imagePopupVehicle;
	WebDriver driver;
	public ImagePopupMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.imagePopupVehicle=PageFactory.initElements(driver, ImagePopupVehicle.class);
	}

	void waitUntilImageURLIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, imagePopupVehicle.inputTagURLImagePopupVehicle);
	}

	void inputURLInImageField(String url) {
		SeleniumUtility.clearTextAndSendText(driver, imagePopupVehicle.inputTagURLImagePopupVehicle, url+"/xx.jpg");
	}
	void clickOnCancelButton() {
		SeleniumUtility.clickOnElement(driver, imagePopupVehicle.buttonTagCancelImagePopupVehicle);
	}
	void clickOnOkButton() {
		SeleniumUtility.clickOnElement(driver, imagePopupVehicle.buttonTagOKImagePopupVehicle);
	}
	void waitUntilImageURLNotIsVisible() {
		SeleniumUtility.waitUntilElementisNotVisible(driver, imagePopupVehicle.inputTagURLImagePopupVehicle);
	}
}
