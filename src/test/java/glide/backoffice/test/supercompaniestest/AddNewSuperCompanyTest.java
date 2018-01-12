package glide.backoffice.test.supercompaniestest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.SuperCompanyCreateDataProvider;
import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.method.supercompanies.SuperCompanies;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class AddNewSuperCompanyTest extends BaseClassExtended {

	@Test(dataProvider="createCompanyData",dataProviderClass = SuperCompanyCreateDataProvider.class)
	public void createSuperCompanyTest(SuperCompanyDto superCompanyDto) {
		SuperCompanies superCompanies=PageFactory.initElements(driver, SuperCompanies.class);
		superCompanies.createSuperCompany(superCompanyDto);

	}



}
