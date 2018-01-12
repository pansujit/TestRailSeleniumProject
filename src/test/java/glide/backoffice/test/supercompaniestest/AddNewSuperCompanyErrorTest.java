package glide.backoffice.test.supercompaniestest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import glide.backoffice.dataprovider.SuperCompanyCreateDataProvider;
import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.method.supercompanies.SuperCompanies;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class AddNewSuperCompanyErrorTest extends BaseClassExtended {
	
	@Test(dataProvider="nonInteDataForIntFieldTest",dataProviderClass = SuperCompanyCreateDataProvider.class)
	public void ValidateIntegerFieldTest(SuperCompanyDto superCompanyDto) {
		SuperCompanies superCompanies=PageFactory.initElements(driver, SuperCompanies.class);
		superCompanies.integerToStringError(superCompanyDto);

	}
	@Test(dataProvider="returnEmptyData",dataProviderClass = SuperCompanyCreateDataProvider.class)
	public void homepageValidationTest(SuperCompanyDto superCompanyDto) {
		SuperCompanies superCompanies=PageFactory.initElements(driver, SuperCompanies.class);
		superCompanies.checkAllErrorInCreateSuperCompany(superCompanyDto);

	}

}
