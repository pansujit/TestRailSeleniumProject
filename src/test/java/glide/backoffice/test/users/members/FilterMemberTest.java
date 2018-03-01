package glide.backoffice.test.users.members;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.MembersDataProvider;
import glide.backoffice.method.sidemenuitems.SideMenuItemsMethod;
import glide.backoffice.method.users.members.MembersFilterDto;
import glide.backoffice.method.users.members.MembersMethod;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class FilterMemberTest extends BaseClassExtended {
	
	@BeforeClass(description="This runs once which will select the super company and click on company side bar menu")
	public void selectSuperCompany() throws MalformedURLException, InterruptedException {
		OpenBrowser();
		SideMenuItemsMethod siteMenuItems= PageFactory.initElements(driver, SideMenuItemsMethod.class); 
		siteMenuItems.clickOnMembers();
	}
	@Test(dataProvider="filterByName",dataProviderClass = MembersDataProvider.class)
	public void filterMemberByLastnameTest(MembersFilterDto memberFilterDto) {
		MembersMethod memberMethod=PageFactory.initElements(driver, MembersMethod.class);
		memberMethod.filterMemberByName(memberFilterDto);
	}
	
	@Test(dataProvider="filterByLastName",dataProviderClass = MembersDataProvider.class)
	public void filterMemberByNameTest(MembersFilterDto memberFilterDto) {
		MembersMethod memberMethod=PageFactory.initElements(driver, MembersMethod.class);
		memberMethod.filterMemberByLastname(memberFilterDto);
	}
	@Test(dataProvider="filterByEmail",dataProviderClass = MembersDataProvider.class)
	public void filterMemberByEmailTest(MembersFilterDto memberFilterDto) {
		MembersMethod memberMethod=PageFactory.initElements(driver, MembersMethod.class);
		memberMethod.filterMemberByEmail(memberFilterDto);
	}
	@Test(dataProvider="filterByNameAndEmail",dataProviderClass = MembersDataProvider.class)
	public void filterMemberByNameAndEmailTest(MembersFilterDto memberFilterDto) {
		MembersMethod memberMethod=PageFactory.initElements(driver, MembersMethod.class);
		memberMethod.filterMemberByNameAndEmail(memberFilterDto);
	}
	
	@Test(dataProvider="filterByVIP",dataProviderClass = MembersDataProvider.class)
	public void filterMemberByVIPTest(MembersFilterDto memberFilterDto) {
		MembersMethod memberMethod=PageFactory.initElements(driver, MembersMethod.class);
		memberMethod.filterMemberByVIP(memberFilterDto);
	}
	
	@AfterClass(alwaysRun=true)
	public void closeAllBrowser() {
		closeBrowser();
	}

}
