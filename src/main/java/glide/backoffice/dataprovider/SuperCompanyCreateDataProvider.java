package glide.backoffice.dataprovider;

import java.util.Locale;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.method.common.Config;

public class SuperCompanyCreateDataProvider {
	SuperCompanyDto superCompanyDto;
	@DataProvider
	public void companyCreateDataProvider() {
		//intentionally make void for later use
	}

	@DataProvider
	public Object[][] nonInteDataForIntFieldTest() {
		
			Faker faker = new Faker(new Locale("fr"));
			superCompanyDto=SuperCompanyDto.builder()
				//.companyName(faker.company().name())
				.companyAddress(faker.address().fullAddress())
				.phoneNumber(faker.name().lastName())
				.email(faker.name().lastName())
				.taxNumber(faker.name().lastName())
				.capital(faker.name().firstName())
				.subscriptionURL(faker.name().lastName())
				.termsURL(faker.name().lastName())
				.build();
			return new Object[][] {{superCompanyDto}};
	}
	
	@DataProvider
	public Object[][] createCompanyData() {
		
			Faker faker = new Faker(new Locale("fr"));
			superCompanyDto=SuperCompanyDto.builder()
				.companyName(faker.company().name())
				.companyAddress(faker.address().fullAddress())
				.phoneNumber("0"+faker.number().digits(9))
				.email(faker.internet().emailAddress())
				.taxNumber(faker.number().digits(5))
				.capital(faker.number().digits(6))
				.subscriptionURL("http://www"+faker.name().lastName()+faker.number().digits(3)+".com")
				.termsURL("http://www"+faker.name().lastName()+faker.number().digits(3)+".com")
				.lockUnlockTime(faker.number().digits(2))
				.invoiceNumberSuffix(faker.company().name()+"-"+faker.company().suffix())
				.emailTemplate(Config.getProperty("SUPER_COMPANY_EMAIL_TEMPLATE"))
				.configuration(Config.getProperty("SUPER_COMPANY_CONFIGURATION"))
				.companyLegalForm(faker.company().suffix().toUpperCase())
				.build();
			return new Object[][] {{superCompanyDto}};
	}
	@DataProvider
	public Object[][] returnEmptyData() {
		
			superCompanyDto=SuperCompanyDto.builder()
				.build();
			return new Object[][] {{superCompanyDto}};
	}
	
	@DataProvider
	public Object[][] editSuperCompany() {
		
			Faker faker = new Faker(new Locale("fr"));
			superCompanyDto=SuperCompanyDto.builder()
				.companyAddress(faker.address().fullAddress())
				.phoneNumber("06"+faker.number().digits(8))
				.email(faker.internet().emailAddress())
				.taxNumber(faker.number().digits(5))
				.capital(faker.number().digits(6))
				.lockUnlockTime(faker.number().digits(2))
				.invoiceNumberSuffix(faker.company().name()+"-"+faker.company().suffix())
				.emailTemplate(Config.getProperty("SUPER_COMPANY_EMAIL_TEMPLATE"))
				.configuration(Config.getProperty("SUPER_COMPANY_CONFIGURATION"))
				.companyLegalForm(faker.company().suffix().toUpperCase())
				.build();
			return new Object[][] {{superCompanyDto}};
	}
	
	
}
