package glide.backoffice.test.users.backusers;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import glide.backoffice.dataprovider.BackuserDataProvider;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.users.backusers.BackuserDto;
import glide.backoffice.method.users.backusers.BackuserMethod;
import glide.backoffice.test.baseclass.BaseClassExtended3;

public class BackuserTest extends BaseClassExtended3 {
	SoftAssert softAssert;
	@BeforeMethod(alwaysRun=true,description="This runs once which will select the super company and click on Backuser bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException{
		openBrowser();
		login();
		//HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		//headerMethod.selectSuperCompany(Config.getProperty("SUPER_COMPANY_NAME"));
		siteMenuItems.clickOnBackusers();
	}
	// the edit back user is more or less same as creating back user
	/*@Test(dataProvider="addBackuser",dataProviderClass = BackuserDataProvider.class,
			description="This test verifies the Addition of the backuser in the back office")
	public void addBackuserTest(BackuserDto backuserDto) {
		softAssert= new SoftAssert();
		List<Boolean> assertValue= new ArrayList<>();
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		assertValue=backuser.addABackuser(backuserDto);
		softAssert.assertTrue(assertValue.get(0),"The firstname and lastname is not match :");
		softAssert.assertTrue(assertValue.get(1),"The Given Role is not match :");
		softAssert.assertAll();
	}*/
	@Test(dataProvider="editBackuser",dataProviderClass = BackuserDataProvider.class,
			description="This test verifies the edit of backuser from the back office")
	public void editBackuserTest(BackuserDto backuserDto) {
		softAssert= new SoftAssert();
		List<Boolean> assertValue= new ArrayList<>();
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		assertValue=backuser.editABackuser(backuserDto);	
		softAssert.assertTrue(assertValue.get(0),"The firstname and lastname is not match :");
		softAssert.assertTrue(assertValue.get(1),"The Given Role is not match :");
		softAssert.assertAll();
	}

	@Test(description="This test verifies the view of any backuser from the back office")
	public void viewBackuserTest() {
		softAssert= new SoftAssert();
		List<Boolean> assertValue= new ArrayList<>();
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		assertValue=backuser.viewABackuser();	
		softAssert.assertTrue(assertValue.get(0),"The Edit button is not displayed");
		softAssert.assertTrue(assertValue.get(1),"The suspend button is not displayed");
		softAssert.assertTrue(assertValue.get(2),"The email address is not visible");
		softAssert.assertAll();
	}
	@Test
	public void filterBackuserUsingRolesTest() {
		softAssert= new SoftAssert();
		List<Boolean> assertValue= new ArrayList<>();
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		assertValue=backuser.filterBackuserUsingRole();
		softAssert.assertTrue(assertValue.get(0),"The role is not filter by Admin");
		softAssert.assertTrue(assertValue.get(1),"The role is not filter by Fleet Manager");
		softAssert.assertTrue(assertValue.get(2),"The role is not filter by Call center");
		softAssert.assertAll();
	}
	@Test
	public void filterBackuserEmailTest() {
		softAssert= new SoftAssert();
		List<Boolean> assertValue= new ArrayList<>();
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		assertValue=backuser.filterBackuserUsingFilterTypeInput("sujit.pandey+asc@glidemobility.com","","");
		softAssert.assertTrue(assertValue.get(0),"The row with given email address is not displayed");
		softAssert.assertAll();
	}
	@Test
	public void filterBackuserFirstnameTest() {
		softAssert= new SoftAssert();
		List<Boolean> assertValue= new ArrayList<>();
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		assertValue=backuser.filterBackuserUsingFilterTypeInput("","ascAdmin", "");
		softAssert.assertTrue(assertValue.get(0),"Nothing has been displayed for the given firstname");
		softAssert.assertTrue(assertValue.get(1),"The filtered content doesnot contains the given name");
		softAssert.assertAll();
	}
	@Test
	public void filterBackuserLastnameTest() {
		softAssert= new SoftAssert();
		List<Boolean> assertValue= new ArrayList<>();
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		assertValue=backuser.filterBackuserUsingFilterTypeInput("","","ascAdmin");
		softAssert.assertTrue(assertValue.get(0),"Nothing has been displayed for the given lastname");
		softAssert.assertTrue(assertValue.get(1),"The filtered content doesnot contains the given name");
		softAssert.assertAll();
	}


}
