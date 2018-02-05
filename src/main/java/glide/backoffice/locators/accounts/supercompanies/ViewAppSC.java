package glide.backoffice.locators.accounts.supercompanies;

import org.openqa.selenium.By;

public class ViewAppSC {
	
	/**
	 * This will find "Unauthorized applications" element in Account-->super companies-->View 
	 */
	public final  By selectTagUnauthorizedApplicationsViewAppSC= By.xpath(".//select[@id='unauthorizedApplications']");
	
	/**
	 * This will find "Authorized applications" element in Account-->super companies-->View 
	 */
	public final  By selectTagViewAppSC= By.xpath(".//select[@id='usedApplications']");
	
	/**
	 * This will find "Arrow to move toward authorised application" element in Account-->super companies-->View 
	 */
	public final  By buttonTagArrowTowardAuthAppViewAppSC= 
			By.xpath(".//button[@class='companyDetail_assignButton companyDetail_assignButton--left']");
	

	/**
	 * This will find "Arrow to move toward unauthorised application" element in Account-->super companies-->View 
	 */
	public final  By buttonTagArrowTowardUnauthAppViewAppSC= 
			By.xpath(".//button[@class='companyDetail_assignButton companyDetail_assignButton--right']");
	
	/**
	 * This will find "Save" element in Account-->super companies-->View 
	 */
	public final  By buttonTagSaveViewAppSC= By.xpath(".//button[@class='ekButton companyForm_actionsButton']");
	

	
}
