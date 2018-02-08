package glide.backoffice.dataprovider;

import java.util.Locale;
import java.util.UUID;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import glide.backoffice.locators.accounts.supercompanies.SuperCompanyDto;
import glide.backoffice.method.companies.CompanyDto;
import glide.backoffice.utility.RandomGenerator;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CompanyDataProvider {
	CompanyDto companyDto;
	@DataProvider
	public void CompanyDataProvider() {
		//intentionally make void for later use
	}
	
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
					.appliedConfiguration("asasd")
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
					.appliedConfiguration("asasd")
					.build();
	
			return new Object[][] {{companyDto}};
	}
	
	

	
	

}