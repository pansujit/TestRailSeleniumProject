package glide.backoffice.test.supercompaniestest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import glide.backoffice.method.supercompanies.SuperCompanies;
import glide.backoffice.test.baseclass.BaseClassExtended;

public class SuperCompanyHomepageTest extends BaseClassExtended {
	
	@Test
	public void homepageValidationTest() {
		SuperCompanies superCompanies=PageFactory.initElements(driver, SuperCompanies.class);
		superCompanies.checkSuperCompanyHomePage();

	}

}
