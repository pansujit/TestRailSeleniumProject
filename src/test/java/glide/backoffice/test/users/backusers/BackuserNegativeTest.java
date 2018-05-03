package glide.backoffice.test.users.backusers;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import glide.backoffice.dataprovider.ErrorMessages;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.users.backusers.BackuserMethod;
import glide.backoffice.test.baseclass.BaseClassExtended3;

public class BackuserNegativeTest extends BaseClassExtended3{
	SoftAssert softAssert;
	
	@BeforeMethod(alwaysRun=true,description="This runs on every test method which will select the super company and click on Backuser bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		openBrowser();
		login();
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		siteMenuItems.clickOnBackusers();
	}
	
	@Test
	public void missingMandatoryBackuserTest() {
		softAssert= new SoftAssert();
		List<Boolean> assertValue= new ArrayList<>();
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		assertValue=backuser.mandatoryMissingFieldValidation();
		softAssert.assertTrue(assertValue.get(0),"'"+ErrorMessages.FIELD_IS_REQUIRED +"'" +" "+ "is not displayed in email field" );
		softAssert.assertTrue(assertValue.get(1),"'"+ErrorMessages.FIELD_IS_REQUIRED +"'" +" "+ "is not displayed in phone no field");
		softAssert.assertTrue(assertValue.get(2),"'"+ErrorMessages.FIELD_IS_REQUIRED +"'" +" "+ "is not displayed in first name field");
		softAssert.assertTrue(assertValue.get(3),"'"+ErrorMessages.FIELD_IS_REQUIRED +"'" +" "+ "is not displayed in last name field");
		softAssert.assertTrue(assertValue.get(4),"'"+ErrorMessages.FIELD_IS_REQUIRED +"'" +" "+ "is not displayed in Address field");
		softAssert.assertTrue(assertValue.get(5),"'"+ErrorMessages.FIELD_IS_REQUIRED +"'" +" "+ "is not displayed in Role field");
		softAssert.assertAll();
	}
	


	
}
