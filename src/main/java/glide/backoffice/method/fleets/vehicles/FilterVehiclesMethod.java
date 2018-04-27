package glide.backoffice.method.fleets.vehicles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.fleets.vehicles.FilterVehicles;
import glide.backoffice.locators.fleets.vehicles.ResultFiltersVehicles;
import glide.backoffice.utility.SeleniumUtility;

public class FilterVehiclesMethod {
	WebDriver driver;
	
	FilterVehicles filterVehicle;
	ResultFiltersVehicles resultFiltersVehicles;
	public FilterVehiclesMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.filterVehicle=PageFactory.initElements(driver, FilterVehicles.class);
		this.resultFiltersVehicles=PageFactory.initElements(driver, ResultFiltersVehicles.class);
	}
	
	
	void clickOnBrand() {
		clickOnFilterToDisplayKey();
		waitUntilElementToBeClickableForFilterKey();
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagBrandFilterVehicles);
		waitFilterDropdownMenuIsInvisible();
	}
	void clickOnModel() {
		clickOnFilterToDisplayKey();
		waitUntilElementToBeClickableForFilterKey();
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagModelFilterVehicles);
		waitFilterDropdownMenuIsInvisible();
	}
	void clickOnVersion() {
		clickOnFilterToDisplayKey();
		waitUntilElementToBeClickableForFilterKey();
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagVersionFilterVehicles);
		waitFilterDropdownMenuIsInvisible();
	}
	void clickOnVehicleCategory() {
		clickOnFilterToDisplayKey();
		waitUntilElementToBeClickableForFilterKey();
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagVehicleCategoryFilterVehicles);
		waitFilterDropdownMenuIsInvisible();
	}
	void clickOnVehicleColor() {
		clickOnFilterToDisplayKey();
		waitUntilElementToBeClickableForFilterKey();
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagColorFilterVehicles);
		waitFilterDropdownMenuIsInvisible();
	}
	void clickOnSystemType() {
		clickOnFilterToDisplayKey();
		waitUntilElementToBeClickableForFilterKey();
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagSystemTypeFilterVehicles);
		waitFilterDropdownMenuIsInvisible();
	}
	void clickOnVehicleStatus() {
		clickOnFilterToDisplayKey();
		waitUntilElementToBeClickableForFilterKey();
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagVehicleStausFilterVehicles);
		waitFilterDropdownMenuIsInvisible();
	}
	void clickOnType() {
		clickOnFilterToDisplayKey();
		waitUntilElementToBeClickableForFilterKey();
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagTypeFilterVehicles);
		waitFilterDropdownMenuIsInvisible();
	}
	void clickOnCleanlinessStatus() {
		clickOnFilterToDisplayKey();
		waitUntilElementToBeClickableForFilterKey();
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagCleanlinessStatusFilterVehicles);
		waitFilterDropdownMenuIsInvisible();
	}
	void clickOnPlateNumber() {
		clickOnFilterToDisplayKey();
		waitUntilElementToBeClickableForFilterKey();
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagPlateNumberFilterVehicles);
		waitFilterDropdownMenuIsInvisible();
	}

	
	void waitFilterDropdownMenuIsVisible(){
		SeleniumUtility.waitElementToBeVisible(driver, filterVehicle.divTagFilterDropdownFilterVehicles);
		SeleniumUtility.fixedMilliSecondWait();
	}
	void waitUntilElementToBeClickableForFilterKey() {
		SeleniumUtility.waitElementToBeClickableByLocator(driver, filterVehicle.divTagCleanlinessStatusFilterVehicles);

	}
	
	void waitUntilElementToBeClickableForFilterValue(String data) {
		SeleniumUtility.waitElementToBeClickableByLocator(driver, filterVehicle.divTagSelectKeyAndValueFilterVehicles(data));

	}
	void waitFilterDropdownMenuIsInvisible(){
		SeleniumUtility.waitUntilElementisNotVisible(driver, filterVehicle.divTagFilterDropdownFilterVehicles);
		SeleniumUtility.fixedMilliSecondWait();
	}

	void clickOnFilterToDisplayValue() {
		SeleniumUtility.clickOnElement(driver, filterVehicle.buttonTagSelectValueFilterVehicles);
		waitFilterDropdownMenuIsVisible();
	}
	void clickOnFilterToDisplayKey() {
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagFilterTagFilterVehicles);
		waitFilterDropdownMenuIsVisible();
	}
	void selectFilterKeyAndValue(String data) {
		clickOnFilterToDisplayValue();
		waitFilterDropdownMenuIsVisible();
		waitUntilElementToBeClickableForFilterValue(data);
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagSelectKeyAndValueFilterVehicles(data));
		waitFilterDropdownMenuIsInvisible();
	}
	
	void inputFilterPlateNumber(String plateNumber) {
		SeleniumUtility.clearTextAndSendText(driver, filterVehicle.inputTagPlateNumberFilterVehicles, plateNumber);
	}
	void clickOnConfirmButtonToPreserveInputField() {
		SeleniumUtility.clickOnElement(driver, filterVehicle.divTagFilterConfirmFilterVehicles);
	}
	
	void clickOnBrandDeleteIcon() {
		SeleniumUtility.clickOnElement(driver, resultFiltersVehicles.svgTagBrandResultFiltersVehicles);
	}
	

}
