package glide.backoffice.dataprovider;

import java.util.Locale;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import glide.backoffice.method.sitesandparkings.ParkingDto;
import glide.backoffice.method.sitesandparkings.SiteDto;
import glide.backoffice.utility.RandomGenerator;

public class SiteDataProvider {
	
	 SiteDto siteDto;
	 ParkingDto parkingDto;
	
	@DataProvider
	public Object[][] createSite() {
		
			Faker faker = new Faker(new Locale("fr"));
			siteDto=SiteDto.builder()
					.siteName(faker.name().name())
					.siteAddress(faker.address().fullAddress())
					.enableSmartcard(true)
					.automaticExtendingBooing(RandomGenerator.getRandomBoolean())
					.automaticShorteningBooing(RandomGenerator.getRandomBoolean())
					.penaltyOnExpiredBooing(RandomGenerator.getRandomBoolean())
					.phisingSmartcard(RandomGenerator.getRandomBoolean())
					.selectCompany("test_company")
					.selectTimeZone("Europe/Paris")
					.spontaneousBooking(true)
					.spontaneousBookingType(RandomGenerator.getRandomBoolean())
					.build();
	
			return new Object[][] {{siteDto}};
	}
	
	@DataProvider
	public Object[][] editSite() {
		Faker faker = new Faker(new Locale("fr"));
		siteDto=SiteDto.builder()
				.siteAddress(faker.address().fullAddress())
				.enableSmartcard(true)
				.automaticExtendingBooing(RandomGenerator.getRandomBoolean())
				.automaticShorteningBooing(RandomGenerator.getRandomBoolean())
				.penaltyOnExpiredBooing(RandomGenerator.getRandomBoolean())
				.phisingSmartcard(RandomGenerator.getRandomBoolean())
				
				.spontaneousBooking(RandomGenerator.getRandomBoolean())
				.spontaneousBookingType(RandomGenerator.getRandomBoolean())
				.selectTimeZone("Europe/Paris")
				.build();		
			return new Object[][] {{siteDto}};
	}
	
	@DataProvider
	public Object[][] createParking() {
		
			Faker faker = new Faker(new Locale("fr"));
			parkingDto=ParkingDto.builder()
					.parkingName(faker.name().firstName())
					.additionalInformation(faker.demographic().demonym())
					.latitude(faker.address().latitude())
					.longitude(faker.address().longitude())
					.allTimeOpen(true)
					.privateAccess(RandomGenerator.getRandomBoolean())
					.gsmConnection(RandomGenerator.getRandomBoolean())
					.electricCharge(RandomGenerator.getRandomBoolean())
					.disableAccess(RandomGenerator.getRandomBoolean())
					.radius(Integer.toString(faker.number().numberBetween(100, 1000)))
					.build();
	
			return new Object[][] {{parkingDto}};
	}
	
	@DataProvider
	public Object[][] editParking() {
		
			Faker faker = new Faker(new Locale("fr"));
			parkingDto=ParkingDto.builder()
					.additionalInformation(faker.demographic().demonym())
					.latitude(faker.address().latitude())
					.longitude(faker.address().longitude())
					.allTimeOpen(true)
					.privateAccess(RandomGenerator.getRandomBoolean())
					.gsmConnection(RandomGenerator.getRandomBoolean())
					.electricCharge(RandomGenerator.getRandomBoolean())
					.disableAccess(RandomGenerator.getRandomBoolean())
					.radius(Integer.toString(faker.number().numberBetween(100, 1000)))
					.build();
	
			return new Object[][] {{parkingDto}};
	}

}
