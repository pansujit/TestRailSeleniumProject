package glide.backoffice.method.users.members;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import glide.backoffice.method.filter.MembersFilter;
/**
 * This member method class contains all the methods related to the members in the back office. Primarily
 * Adding members, updating members, viewing and filtering members.
 * @author sujitpandey
 *
 */
public class MembersMethod {
	WebDriver driver;
	MembersFilter membersFilter;
	
	public MembersMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.membersFilter=PageFactory.initElements(driver, MembersFilter.class);
	}
	
	
	
	
	
	
	
	
	/**
	 * This public method, filter the member by given name, The input should be MembersFilterDto and it will extract the member's name
	 * @param memberFilterDto - Should be {@code MembersFilterDto}
	 */
	public void filterMemberByName(MembersFilterDto memberFilterDto) {
		membersFilter.inputMemberNameOnMembersFilter(memberFilterDto.getName());
		membersFilter.clickOnSearchButton();
		membersFilter.clickOnResetButton();
	}
	/**
	 * This public method, filter the member by given name, The input should be MembersFilterDto and it will extract the member's Email
	 * @param memberFilterDto - Should be {@code MembersFilterDto}
	 */
	public void filterMemberByEmail(MembersFilterDto memberFilterDto) {
		membersFilter.inputEmailOnMembersFilter(memberFilterDto.getEmail());
		membersFilter.clickOnSearchButton();
		membersFilter.clickOnResetButton();
	}
	/**
	 * This public method, filter the member by given name, The input should be MembersFilterDto and it will extract the member's name and Email
	 * @param memberFilterDto - Should be {@code MembersFilterDto}
	 */
	public void filterMemberByNameAndEmail(MembersFilterDto memberFilterDto) {
		membersFilter.inputMemberNameOnMembersFilter(memberFilterDto.getName());
		membersFilter.inputEmailOnMembersFilter(memberFilterDto.getEmail());
		membersFilter.clickOnSearchButton();
		membersFilter.clickOnResetButton();

	}
	
	/**
	 * This public method select  VIP  from the member filter
	 * @param memberFilterDto - Should be {@code MembersFilterDto}
	 */
	public void filterMemberByVIP(MembersFilterDto memberFilterDto) {
		membersFilter.selectVIPOnMembersFilter(memberFilterDto.isVip());
		membersFilter.clickOnSearchButton();
		membersFilter.clickOnResetButton();
	}
	
	

}
