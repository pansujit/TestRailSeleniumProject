package glide.backoffice.method.header;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import glide.backoffice.locators.headers.HeaderItem;
import glide.backoffice.method.common.Config;
import glide.backoffice.utility.SeleniumUtility;

public class HeaderMethod {
	SoftAssert softAssert;
	WebDriver driver;
	HeaderItem headerItem;
	HeaderSearchResult headerSearchResult;
	public HeaderMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.headerItem=PageFactory.initElements(driver, HeaderItem.class);
		this.softAssert= new SoftAssert();
		this.headerSearchResult=PageFactory.initElements(driver, HeaderSearchResult.class);
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
		SeleniumUtility.fixedWait(5);
	}
	public void selectSuperCompany() {
		SeleniumUtility.clickOnElement(driver, headerItem.buttonTagSuperCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.moveToElementAction(driver, headerItem.inputTagSuperCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionClickAndSendKeys(driver, headerItem.inputTagSuperCompaniesHeaderItem, "AirStone");
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		SeleniumUtility.fixedWait(5);
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
		SeleniumUtility.fixedWait(5);
	}
	public void selectCompany() {
		SeleniumUtility.clickOnElement(driver, headerItem.buttonTagCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.moveToElementAction(driver, headerItem.inputTagCompaniesHeaderItem);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionClickAndSendKeys(driver, headerItem.inputTagCompaniesHeaderItem, "testingCompany");
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.actionSendKeys(driver, Keys.ENTER);
		SeleniumUtility.fixedWait(5);
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
	 */
	public void checkAllPopUpInHeader() {
		selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		SeleniumUtility.moveToElementAction(driver, headerItem.buttonTagSuperCompaniesHeaderItem);
		softAssert.assertEquals("Super-company", SeleniumUtility.getText(driver, headerItem.divTagSuperCompanyPopupHeaderItem));
		SeleniumUtility.moveToElementAction(driver, headerItem.buttonTagCompaniesHeaderItem);
		softAssert.assertEquals("Company", SeleniumUtility.getText(driver, headerItem.divTagSuperCompanyPopupHeaderItem));	
		softAssert.assertAll();
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
	 */
	public void bigSearchBoxVerification() {
		inputTextInBigSearchBox(Config.getProperty("MEMBER_FIRSTNAME"));
		softAssert.assertTrue(!SeleniumUtility.returnWebElements(driver, headerSearchResult.divTagSearchResultHeaderSearchResult).isEmpty());
		inputTextInBigSearchBox("dfhjdhfj");
		softAssert.assertTrue(SeleniumUtility.returnWebElements(driver, headerSearchResult.divTagSearchResultHeaderSearchResult).isEmpty());
		softAssert.assertAll();
	}

	/**
	 * This public method verifies the back and forth of the back button and navigation to the page from big search result page
	 */
	public void bigsearchBoxResultNavigate() {
		inputTextInBigSearchBox("mobility");
		SeleniumUtility.waitElementToBeVisible(driver, headerSearchResult.divTagSearchResultHeaderSearchResult);
		SeleniumUtility.fixedWait(1);
		List<String> data=newTextList(SeleniumUtility.returnWebElements(driver, headerSearchResult.divTagSearchResultHeaderSearchResult));
		SeleniumUtility.
		clickOnElement(driver, headerSearchResult.divTagFirstResultOfHeaderSearchResult(data.get(0)));
		softAssert.assertTrue(driver.getCurrentUrl().contains("detail"));
		SeleniumUtility.fixedWait(1);
		driver.navigate().back();
		SeleniumUtility.waitUntilElementisNotVisible(driver, By.xpath(".//div[@class='sk-circle']"));
		inputTextInBigSearchBox("mobility");
		SeleniumUtility.waitElementToBeVisible(driver, headerSearchResult.divTagSearchResultHeaderSearchResult);
		SeleniumUtility.fixedWait(2);
		SeleniumUtility.
		clickOnElement(driver, headerSearchResult.divTagFirstResultOfHeaderSearchResult(data.get(1)));
		SeleniumUtility.fixedWait(1);
		softAssert.assertTrue(driver.getCurrentUrl().contains("detail"));
		driver.navigate().back();
		SeleniumUtility.waitUntilElementisNotVisible(driver, By.xpath(".//div[@class='sk-circle']"));
		SeleniumUtility.fixedWait(1);
		softAssert.assertAll();
	}


}
