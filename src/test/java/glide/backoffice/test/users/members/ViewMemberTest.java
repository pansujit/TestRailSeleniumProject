package glide.backoffice.test.users.members;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.method.common.Config;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.users.members.MembersMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class ViewMemberTest extends BaseClassExtended{

	@BeforeClass(description="This runs once which will select the super company and click on company side bar menu")
	public void clickOnMembersSideMenu() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		siteMenuItems.clickOnMembers();
	}

	@Test
	public void AddCommentOnMemberTest() {
		MembersMethod membersMethod=PageFactory.initElements(driver, MembersMethod.class);
		membersMethod.addCommentOnMember(Config.getProperty("EDIT_MEMBER"));
	}
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}

}
