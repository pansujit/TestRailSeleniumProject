package glide.backoffice.test.users;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.BackuserDataProvider;
import glide.backoffice.method.header.HeaderMethod;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.users.BackuserDto;
import glide.backoffice.method.users.BackuserMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class BackuserTest extends BaseClassExtended {
	
	@BeforeClass(description="This runs once which will select the super company and click on Backuser bar menu")
	public void selectSuperCompany() {
		HeaderMethod headerMethod=PageFactory.initElements(driver, HeaderMethod.class);
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		headerMethod.selectSuperCompany();
		siteMenuItems.clickOnBackusers();
	}
	
	@Test(dataProvider="addBackuser",dataProviderClass = BackuserDataProvider.class,
			description="This test verifies the Addition of the backuser in the back office")
	public void addBackuserTest(BackuserDto backuserDto) {
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		backuser.addABackuser(backuserDto);	
	}
	@Test(dataProvider="editBackuser",dataProviderClass = BackuserDataProvider.class,
			description="This test verifies the edit of backuser from the back office")
	public void editBackuserTest(BackuserDto backuserDto) {
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		backuser.editABackuser(backuserDto);	
	}

	@Test(description="This test verifies the view of any backuser from the back office")
	public void createNewCompanyTest() {
		BackuserMethod backuser= PageFactory.initElements(driver, BackuserMethod.class);
		backuser.viewABackuser();	
	}


}
