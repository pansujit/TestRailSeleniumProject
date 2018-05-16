package glide.backoffice.method.users.smartcards;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.locators.users.smartcards.DetailPageSmartcard;
import glide.backoffice.utility.RegExpression;
import glide.backoffice.utility.SeleniumUtility;

public class DetailPageSmartcardMethod {

	WebDriver driver;
	DetailPageSmartcard detailPageSmartcard;
	public DetailPageSmartcardMethod(WebDriver ldriver) {
		this.driver= ldriver;
		this.detailPageSmartcard=PageFactory.initElements(driver, DetailPageSmartcard.class);
	}

	/**
	 * This method wait until the remove button or Assign User to Smartcard is visible in member detail page
	 */
	void waitUntilElementIsVisible() {
		SeleniumUtility.waitElementToBeVisible(driver, detailPageSmartcard.buttonTagRemoveDetailPageSmartcard);
		SeleniumUtility.fixedMilliSecondWait();
	}
	
	void clickOnRemoveAssignButton() {
		SeleniumUtility.clickOnElement(driver, detailPageSmartcard.buttonTagRemoveDetailPageSmartcard);
	}
	
	boolean isActivationDisplayed() {
		return SeleniumUtility.checkElementIsVisible(driver, detailPageSmartcard.spanTagActivationTextDetailPageSmartcard);
	}
	boolean isDeactivationDisplayed() {
		return SeleniumUtility.checkElementIsVisible(driver, detailPageSmartcard.spanTagDeactivationTextDetailPageSmartcard);
	}
	boolean isSmartcardStatusDisplayed() {
		return SeleniumUtility.checkElementIsVisible(driver, detailPageSmartcard.spanTagStatusDetailPageSmartcard);
	}
	
	String getEmailInSmartcardDetailPage() {
		return SeleniumUtility.getText(driver, detailPageSmartcard.spanTagEmailDetailPageSmartcard);
	}
	
	String getFullnameInSmartcardDetailPage() {
		return SeleniumUtility.getText(driver, detailPageSmartcard.spanTagFullnameDetailPageSmartcard);
	}
	String getSuperCompanyInSmartcardDetailPage() {
		return SeleniumUtility.getText(driver, detailPageSmartcard.spanTagSuperCompanyNameDetailPageSmartcard);
	}	
	
	List<Boolean> assertDetailSmartcardPage(String email, String firstname, String lastname,String company) {
		List<Boolean> assertValue= new ArrayList<>();
		if(isActivationDisplayed()) {
			assertValue.add(0, RegExpression.matcherDetailSmartcard
					(SeleniumUtility.getText(driver, detailPageSmartcard.spanTagActivationDateDetailPageSmartcard)));
		}
		else {
			assertValue.add(0,false);
		}
		if(isDeactivationDisplayed()) {
		assertValue.add(1, RegExpression.matcherDetailSmartcard(
				SeleniumUtility.getText(driver, detailPageSmartcard.spanTagDeactivationDateDetailPageSmartcard)));
		}
		else
		{
			assertValue.add(1,false);
		}
		assertValue.add(2, isSmartcardStatusDisplayed());
		assertValue.add(3, SeleniumUtility.compareIgnoreCaseText(getEmailInSmartcardDetailPage(),email));
		assertValue.add(4, SeleniumUtility.compareIgnoreCaseText(getFullnameInSmartcardDetailPage(),firstname+" "+lastname));
		assertValue.add(5, SeleniumUtility.compareIgnoreCaseText(getSuperCompanyInSmartcardDetailPage(),company));
		return assertValue;
	}
	
	
	
}
