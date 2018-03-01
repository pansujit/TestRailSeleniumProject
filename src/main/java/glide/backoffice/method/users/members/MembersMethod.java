package glide.backoffice.method.users.members;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * This member method class contains all the methods related to the members in the back office. Primarily
 * Adding members, updating members, viewing and filtering members.
 * @author sujitpandey
 *
 */
public class MembersMethod {
	WebDriver driver;
	MembersFilterMethod membersFilter;
	MemberViewMethod memberViewMethod;
	HomepageMethod homepageMethod;
	MemberActionMenuMethod memberActionMenuMethod;
	public MembersMethod(WebDriver ldriver) {
		this.driver=ldriver;
		this.membersFilter=PageFactory.initElements(driver, MembersFilterMethod.class);
		this.memberViewMethod=PageFactory.initElements(driver, MemberViewMethod.class);
		this.homepageMethod=PageFactory.initElements(driver, HomepageMethod.class);
		this.memberActionMenuMethod=PageFactory.initElements(driver, MemberActionMenuMethod.class);

	}
	
	
	/**
	 * This public method, filter the member by given  first name, The input should be MembersFilterDto and it will extract the member's name
	 * @param memberFilterDto - Should be {@code MembersFilterDto}
	 */
	public void filterMemberByName(MembersFilterDto memberFilterDto) {
		membersFilter.inputMemberNameOnMembersFilter(memberFilterDto.getName());
		membersFilter.clickOnSearchButton();
		// this is assert method where the email is unique.
		homepageMethod.assertFilterMemberMethod(null, null, memberFilterDto.getName(),null);
		membersFilter.clickOnResetButton();
	}
	/**
	 * This public method, filter the member by given lastname, The input should be MembersFilterDto and it will extract the member's lastname
	 * @param memberFilterDto - Should be {@code MembersFilterDto}
	 */
	public void filterMemberByLastname(MembersFilterDto memberFilterDto) {
		membersFilter.inputMemberNameOnMembersFilter(memberFilterDto.getName());
		membersFilter.clickOnSearchButton();
		// this is assert method where the email is unique.
		homepageMethod.assertFilterMemberMethod(null, null,null, memberFilterDto.getName());
		membersFilter.clickOnResetButton();
	}
	
	/**
	 * This public method, filter the member by given name, The input should be MembersFilterDto and it will extract the member's Email
	 * @param memberFilterDto - Should be {@code MembersFilterDto}
	 */
	public void filterMemberByEmail(MembersFilterDto memberFilterDto) {
		membersFilter.inputEmailOnMembersFilter(memberFilterDto.getEmail());
		membersFilter.clickOnSearchButton();
		// this is assert method where the email is unique.
		homepageMethod.assertFilterMemberMethod(memberFilterDto.getEmail(), null, null,null);
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
		// this is assert method where the email is unique.
		homepageMethod.assertFilterMemberMethod(memberFilterDto.getEmail(), null, memberFilterDto.getName(),null);
		membersFilter.clickOnResetButton();

	}
	
	/**
	 * This public method select  VIP  from the member filter
	 * @param memberFilterDto - Should be {@code MembersFilterDto}
	 */
	public void filterMemberByVIP(MembersFilterDto memberFilterDto) {
		membersFilter.selectVIPOnMembersFilter(memberFilterDto.isVip());
		membersFilter.clickOnSearchButton();
		homepageMethod.assertFilterMemberMethod(null, memberFilterDto.isVip()?"Yes":"No", null,null);
		membersFilter.clickOnResetButton();
	}
	/**
	 * This public method click on the view link of the given member and verify the attributes of the view page of the member
	 * @param text - Should be String
	 */
	public void viewMember(String text) {
		homepageMethod.clickOnViewLinkOfMember(text);
	}
	/**
	 * This public method add a comment on the member page and verify the comment on comment box
	 * @param text - Should be String
	 */
	public void addCommentOnMember(String text) {
		membersFilter.inputEmailOnMembersFilter(text);
		membersFilter.clickOnSearchButton();
		homepageMethod.clickOnViewLinkOfMember(text);
		memberViewMethod.clickOnActionMenuIcon();
		memberActionMenuMethod.addTextOnCommentBox();
		
	}
	
	

}
