package glide.backoffice.test.accounts.contracts;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.ContractDataProvider;
import glide.backoffice.method.accounts.contracts.ContractDto;
import glide.backoffice.method.accounts.contracts.ContractMethod;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class ContractTest extends BaseClassExtended {
	
	@BeforeClass
	public void clickOnContractMenu() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		siteMenuItems.clickOnContracts();
	}
	@Test(dataProvider="editContract", dataProviderClass=ContractDataProvider.class)
	public void editContractTest(ContractDto contractDto) {
		ContractMethod contractMethod= PageFactory.initElements(driver, ContractMethod.class);
		contractMethod.editContract(contractDto);
		
	}
	@AfterClass(alwaysRun=true)
	public void quitBrowser() {
		closeBrowser();
	}

}
