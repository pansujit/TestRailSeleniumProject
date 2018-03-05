package glide.backoffice.dataprovider;


import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import glide.backoffice.method.accounts.contracts.ContractDto;

public class ContractDataProvider {


	ContractDto contractDto;
	@DataProvider
	public Object[][] editContract() {
		Faker faker = new Faker();
		contractDto=ContractDto.builder()
		.reference(faker.name().firstName().substring(0, 3)+faker.address().cityName().substring(0, 3))
		.build();
		
		return new Object [][] {
		{contractDto}
		};
		
	}
}
