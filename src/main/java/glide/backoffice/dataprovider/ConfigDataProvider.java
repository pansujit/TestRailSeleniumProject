package glide.backoffice.dataprovider;

import java.util.Locale;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import glide.backoffice.method.accounts.configurations.ConfigDto;
import glide.backoffice.utility.RandomGenerator;

public class ConfigDataProvider {
	ConfigDto configDto;

	@DataProvider
	public Object[][] createConfig() {

		Faker faker = new Faker(new Locale("fr"));
		configDto=ConfigDto.builder()
				.configName(faker.name().username())
				.vatNumber(RandomGenerator.randomPhoneNumber().substring(2, 5))
				.vatPercentage(RandomGenerator.randomNumberGenerator())
				.build();

		return new Object[][] {{configDto}};
	}

	@DataProvider
	public Object[][] editConfig() {
		configDto=null;
		configDto=ConfigDto.builder()
				.vatNumber("1"+RandomGenerator.randomPhoneNumber().substring(2, 5))
				.vatPercentage(RandomGenerator.randomNumberGenerator().substring(0,5))
				.build();

		return new Object[][] {{configDto}};
	}

	@DataProvider
	public Object[][] inputDataTypeCheck() {
		configDto=null;
		Faker faker = new Faker(new Locale("fr"));
		configDto=ConfigDto.builder()
				.configName(faker.name().firstName().substring(0, 3))
				.vatNumber(RandomGenerator.randomPhoneNumber().substring(2, 5))
				.vatPercentage(faker.name().firstName().substring(0, 3))
				.build();

		return new Object[][] {{configDto}};
	}

}
