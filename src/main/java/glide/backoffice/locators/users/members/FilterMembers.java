package glide.backoffice.locators.users.members;

import org.openqa.selenium.By;

public class FilterMembers {

	/**
	 * TThis locator finds  Filters Button element in the User Management->members-->Homepage-->Filters
	 */
	public final By buttonTagFiltersFilterMembers= By.xpath(".//div[@class='membersPage_filters']/button");

	/**
	 * This locator finds Validation status element in the User Management->members-->Homepage-->Filters
	 */
	public final By selectTagValidationStatusFilterMembers= By.xpath(".//form[@class='searchMembersForm']//select[@name='status']");
	/**
	 * This locator finds VIP status element in the User Management->members-->Homepage-->Filters
	 */
	public final By selectTagVIPStatusFilterMembers= By.xpath(".//form[@class='searchMembersForm']//select[@name='vip']");
	/**
	 * This locator finds Technician status element in the User Management->members-->Homepage-->Filters
	 */
	public final By selectTagTechnicianStatusFilterMembers= By.xpath(".//form[@class='searchMembersForm']//select[@name='technician']");
	/**
	 * This locator finds Professional status element in the User Management->members-->Homepage-->Filters
	 */
	public final By selectTagProfessionalStatusFilterMembers= By.xpath(".//form[@class='searchMembersForm']//select[@name='professional']");
	/**
	 * This locator finds Search Button element in the User Management->members-->Homepage-->Filters
	 */
	public final By buttonTagSearchFilterMembers= 
			By.xpath(".//div[@class='searchMembersForm_actions']/button[@class='ekButton searchMembersForm_actionsButton']");
	/**
	 * This locator finds Reset Button element in the User Management->members-->Homepage-->Filters
	 */
	public final By buttonTagResetFilterMembers= 
			By.xpath(".//div[@class='searchMembersForm_actions']/button[@class='ekButton ekButton--reverse searchMembersForm_actionsButton']");

	/**
	 * This locator finds member name element in the User Management->members-->Homepage-->Filters
	 */
	public final By inputTagMemberNameFilterMembers= By.xpath(".//input[@id='memberName']");
	/**
	 * This locator finds Email element in the User Management->members-->Homepage-->Filters
	 */
	public final By inputTagEmailFilterMembers= By.xpath(".//input[@id='email']");

	/**
	 * This locator finds Expedite Review Status element in the User Management->members-->Homepage-->Filters
	 */
	public final By selectTagExpediteReviewFilterMembers= By.xpath(".//form[@class='searchMembersForm']//select[@name='expediteReview']");


	



}
