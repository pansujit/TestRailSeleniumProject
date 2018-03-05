package glide.backoffice.method.accounts.contracts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import glide.backoffice.dataprovider.SuccessMessages;
import glide.backoffice.locators.accounts.contract.HomepageContract;
import glide.backoffice.method.common.CommonMethods;
import glide.backoffice.utility.SeleniumUtility;

public class ContractMethod {
	WebDriver driver;
	HomepageContract homepageContract;
	CommonMethods commonMethods;
	public ContractMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.homepageContract=PageFactory.initElements(driver, HomepageContract.class);
		this.commonMethods=PageFactory.initElements(driver, CommonMethods.class);
	}
	
	void inputContractData(ContractDto contractDto) {
		
		SeleniumUtility.clearTextAndSendText(driver, homepageContract.inputTagReferenceHomepageContract, contractDto.getReference());
	}
	

	void clickOnSaveButton() {
		SeleniumUtility.clickOnElement(driver, homepageContract.buttonTagSaveHomepageContract);
		SeleniumUtility.fixedWait(2);
	}
	
	private void assertEditContract(String successMessage) {
		Assert.assertTrue(commonMethods.assertErrorSuccessMessage(successMessage), "The success Message may be not displayed");
		
	}
	
	public void editContract(ContractDto contractDto) {
		inputContractData(contractDto);
		clickOnSaveButton();
		assertEditContract(SuccessMessages.EDIT_CONTRACT_UPDATE_MESSAGE);
	}

}
