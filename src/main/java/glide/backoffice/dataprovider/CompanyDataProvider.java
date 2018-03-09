package glide.backoffice.dataprovider;

import java.util.Locale;
import java.util.UUID;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import glide.backoffice.method.accounts.companies.CompanyDto;
import glide.backoffice.method.common.Config;
import glide.backoffice.utility.RandomGenerator;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CompanyDataProvider {
	CompanyDto companyDto;

	
	@DataProvider
	public Object[][] createCompany() {
		
			Faker faker = new Faker(new Locale("fr"));
			companyDto=CompanyDto.builder()
					.companyName(faker.company().name())
					.address(faker.address().fullAddress())
					.companyLegalForm(faker.company().suffix())
					.phoneNumber(RandomGenerator.randomPhoneNumber())
					.logoURL("https://"+faker.company().url())
					.taxNumber(RandomGenerator.randomPhoneNumber().substring(0, 7))
					.capital(RandomGenerator.randomPhoneNumber().substring(0, 5))
					.email(faker.internet().emailAddress("t"+UUID.randomUUID().toString().substring(1, 4)))
					.appliedConfiguration(Config.getProperty("SUB_COMPANY_CONFIGURATION"))
					.build();
	
			return new Object[][] {{companyDto}};
	}
	
	@DataProvider
	public Object[][] editCompany() {
		
			Faker faker = new Faker(new Locale("fr"));
			companyDto=CompanyDto.builder()
					.address(faker.address().fullAddress())
					.companyLegalForm(faker.company().suffix())
					.phoneNumber(RandomGenerator.randomPhoneNumber())
					.logoURL("https://"+faker.company().url())
					.taxNumber(RandomGenerator.randomPhoneNumber().substring(0, 7))
					.capital(RandomGenerator.randomPhoneNumber().substring(0, 5))
					.email(faker.internet().emailAddress("t"+UUID.randomUUID().toString().substring(1, 4)))
					.appliedConfiguration(Config.getProperty("SUB_COMPANY_CONFIGURATION"))
					.build();
	
			return new Object[][] {{companyDto}};
	}
	
	@DataProvider
	public Object[][] fieldValidationErrorCompany() {
		
			Faker faker = new Faker(new Locale("fr"));
			companyDto=CompanyDto.builder()
					.companyName((faker.name().firstName()+faker.name().lastName()+faker.address().cityName()).substring(0,9))
					.address(faker.address().fullAddress())
					.phoneNumber((faker.name().firstName()+faker.name().lastName()+faker.address().cityName()).substring(0,9))
					.logoURL(faker.company().url())
					.taxNumber(faker.name().firstName())
					.capital(faker.name().firstName())
					.email(faker.name().firstName())
					.build();
	
			return new Object[][] {{companyDto}};
	}
	
	
	
	

	
	

}
