package glide.backoffice.dataprovider;

import java.util.Locale;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import glide.backoffice.enums.BackuserRoles;
import glide.backoffice.method.users.backusers.BackuserDto;
import glide.backoffice.utility.RandomGenerator;

public class BackuserDataProvider {
	BackuserDto backuserDto;
	
	
	@DataProvider
	public Object[][] addBackuser() {
		
			Faker faker = new Faker(new Locale("fr"));
			backuserDto=BackuserDto.builder()
					.firstName(faker.name().firstName())
					.lastName(faker.name().lastName())
					.email(faker.internet().emailAddress())
					.address(faker.address().fullAddress())
					.phoneNumber(RandomGenerator.randomPhoneNumber())
					.role(BackuserRoles.getBackuserRoles())
					.superCompanyName("AirStone")
					.companyName("test_company")
					.build();
	
			return new Object[][] {{backuserDto}};
	}
	
	@DataProvider
	public Object[][] editBackuser() {
		
			Faker faker = new Faker(new Locale("fr"));
			backuserDto=BackuserDto.builder()
					.firstName(faker.name().firstName())
					.lastName(faker.name().lastName())
					.address(faker.address().fullAddress())
					.email(null)
					.phoneNumber(RandomGenerator.randomPhoneNumber())
					.role(BackuserRoles.getBackuserRoles())
					.superCompanyName("AirStone")
					.companyName("test_company")
					.build();
	
			return new Object[][] {{backuserDto}};
	}

}
