package glide.backoffice.method.header;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.headers.HeaderItem;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.method.common.Config;
import glide.backoffice.utility.SeleniumUtility;

public class HeaderMethod {
	WebDriver driver;
	HeaderItem headerItem;
	HeaderSearchResult headerSearchResult;
	CommonMethods commonMethods;
	public HeaderMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.headerItem=PageFactory.initElements(driver, HeaderItem.class);
		this.headerSearchResult=PageFactory.initElements(driver, HeaderSearchResult.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);

	}


	public void selectSuperCompany(String superCompanyName) {
		if(superCompanyName==null) {
			return;
		}
		SeleniumUtility.clickOnElement(driver, headerItem.buttonTagSuperCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.moveToElementAction(driver, headerItem.inputTagSuperCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionClickAndSendKeys(driver, headerItem.inputTagSuperCompaniesHeaderItem, superCompanyName);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		commonMethods.waitUntilElementToBeInvisible();
		SeleniumUtility.fixedWait(1);
	}
	public void selectSuperCompany() {
		SeleniumUtility.clickOnElement(driver, headerItem.buttonTagSuperCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.moveToElementAction(driver, headerItem.inputTagSuperCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionClickAndSendKeys(driver, headerItem.inputTagSuperCompaniesHeaderItem, "AirStone");
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		commonMethods.waitUntilElementToBeInvisible();
		SeleniumUtility.fixedWait(1);
	}
	public void selectCompany(String companyName) {
		if(companyName==null) {
			return;
		}
		SeleniumUtility.clickOnElement(driver, headerItem.buttonTagCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.moveToElementAction(driver, headerItem.inputTagCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionClickAndSendKeys(driver, headerItem.inputTagCompaniesHeaderItem, companyName);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		commonMethods.waitUntilElementToBeInvisible();
		SeleniumUtility.fixedWait(1);
	}
	public void selectCompany() {
		SeleniumUtility.clickOnElement(driver, headerItem.buttonTagCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.moveToElementAction(driver, headerItem.inputTagCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionClickAndSendKeys(driver, headerItem.inputTagCompaniesHeaderItem, "testingCompany");
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		commonMethods.waitUntilElementToBeInvisible();
		SeleniumUtility.fixedWait(1);
	}
	/**
	 * This private method input text on the big search box
	 * @param inputText - should be String
	 */
	private void inputTextInBigSearchBox(String inputText) {
		SeleniumUtility.clickOnElement(driver, headerItem.inputTagBigSearchBoxHeaderItem);
		SeleniumUtility.clearText(driver, headerItem.inputTagBigSearchBoxHeaderItem);
		SeleniumUtility.sendText(driver, headerItem.inputTagBigSearchBoxHeaderItem, inputText);
		SeleniumUtility.sendEnter(driver, headerItem.inputTagBigSearchBoxHeaderItem);
		SeleniumUtility.waitElementToBeVisible(driver,headerSearchResult.divTagSearchResultHeaderSearchResult);
	}
	/**
	 * This private method All text from the element to the list of String
	 * @param elements - should be {@code List<WebElement>}
	 * @return {@code List<String>}
	 */
	private List<String> newTextList(List<WebElement> elements) {
		List<String> data= new ArrayList<>();
		for(WebElement element:elements) {
			data.add(element.getText());
		}
		return data;
	}

	/**
	 * This public method checks the popup header on super company and sub-companu search box.
	 * @return 
	 */
	public List<Boolean> checkAllPopUpInHeader() {
		List<Boolean> assertValue = new ArrayList<>();
		selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		SeleniumUtility.moveToElementAction(driver, headerItem.buttonTagSuperCompaniesHeaderItem);
		assertValue.add(0, SeleniumUtility.compareIgnoreCaseText("Super-company", SeleniumUtility.getText(driver, headerItem.divTagSuperCompanyPopupHeaderItem)));
		SeleniumUtility.moveToElementAction(driver, headerItem.buttonTagCompaniesHeaderItem);
		assertValue.add(0, SeleniumUtility.compareIgnoreCaseText("Company", SeleniumUtility.getText(driver, headerItem.divTagSuperCompanyPopupHeaderItem)));
		return assertValue;
	}

	/**
	 * This method click on header back button and wait until 2 second
	 */
	public void clickOnHeaderBackButton() {
		SeleniumUtility.clickUsingAction(driver, headerItem.aTagBackButtonHeaderItem);
		SeleniumUtility.fixedWait(2);
	}

	/**
	 * This public method verifies that big search box is working as expected.
	 * @return 
	 */
	public List<Boolean> bigSearchBoxVerification() {
		List<Boolean> assertValue = new ArrayList<>();
		inputTextInBigSearchBox(Config.getProperty("MEMBER_FIRSTNAME"));
		assertValue.add(0, !SeleniumUtility.returnWebElements(driver, headerSearchResult.divTagSearchResultHeaderSearchResult).isEmpty());
		inputTextInBigSearchBox("dfhjdhfj");
		assertValue.add(1, SeleniumUtility.returnWebElements(driver, headerSearchResult.divTagSearchResultHeaderSearchResult).isEmpty());
		return assertValue;
	}

	/**
	 * This public method verifies the back and forth of the back button and navigation to the page from big search result page
	 * @return 
	 */
	public List<Boolean> bigsearchBoxResultNavigate() {
		List<Boolean> assertValue = new ArrayList<>();
		
		inputTextInBigSearchBox("mobility");
		SeleniumUtility.waitElementToBeVisible(driver, headerSearchResult.divTagSearchResultHeaderSearchResult);
		SeleniumUtility.fixedWait(1);
		List<String> data=newTextList(SeleniumUtility.returnWebElements(driver, headerSearchResult.divTagSearchResultHeaderSearchResult));
		SeleniumUtility.
		clickOnElement(driver, headerSearchResult.divTagFirstResultOfHeaderSearchResult(data.get(0)));
		assertValue.add(0,driver.getCurrentUrl().contains("detail"));
		SeleniumUtility.fixedWait(1);
		driver.navigate().back();
		SeleniumUtility.waitUntilElementisNotVisible(driver, By.xpath(".//div[@class='sk-circle']"));
		inputTextInBigSearchBox("mobility");
		SeleniumUtility.waitElementToBeVisible(driver, headerSearchResult.divTagSearchResultHeaderSearchResult);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.
		clickOnElement(driver, headerSearchResult.divTagFirstResultOfHeaderSearchResult(data.get(1)));
		SeleniumUtility.fixedWait(1);
		assertValue.add(1,driver.getCurrentUrl().contains("detail"));
		return assertValue;
	}


}
