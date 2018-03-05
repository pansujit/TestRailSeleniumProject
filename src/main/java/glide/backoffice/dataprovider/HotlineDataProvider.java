package glide.backoffice.dataprovider;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import glide.backoffice.method.accounts.hotlines.HotlineDto;
import glide.backoffice.utility.RandomGenerator;

public class HotlineDataProvider {

	HotlineDto hotlineDto;
	
	@DataProvider
	public Object[][] editHotline() {
		Faker faker= new Faker();
		hotlineDto=HotlineDto.builder()
		.hotlineEmail(faker.name().firstName().substring(0, 3)+faker.number().digits(3)+faker.educator().campus().substring(0, 2)+"@yahoo.com")
		.phoneNumber(RandomGenerator.randomPhoneNumber())
		.build();
		return new Object [][] {
			{hotlineDto}
		};
	}
	
	@DataProvider
	public Object[][] addHotline() {
		Faker faker= new Faker();
		HotlineDto.builder()
		.hotlineName(faker.name().firstName().substring(0, 3)+faker.number().digits(3)+faker.educator().campus().substring(0, 2))
		.hotlineEmail(faker.name().firstName().substring(0, 3)+faker.number().digits(3)+faker.educator().campus().substring(0, 2)+"@yahoo.com")
		.phoneNumber(RandomGenerator.randomPhoneNumber())
		.build();
		return new Object [][] {
			{hotlineDto}
		};
	}
	
}
