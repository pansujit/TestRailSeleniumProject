package glide.backoffice.dataprovider;

import java.util.Locale;

import org.testng.annotations.DataProvider;

import com.github.javafaker.Faker;

import glide.backoffice.enums.CarBrands;
import glide.backoffice.enums.CarModels;
import glide.backoffice.enums.CarVersions;
import glide.backoffice.enums.FuelType;
import glide.backoffice.method.common.Config;
import glide.backoffice.method.fleets.vehicles.VehicleDto;
import glide.backoffice.utility.RandomGenerator;

public class VehicleDataProvider {
	
	VehicleDto vehicleDto;
	@DataProvider
	public void VehicleDataProvider() {
		//intentionally make void for later use
	}
	
	@DataProvider
	public Object[][] addVehicle() {
		
			Faker faker = new Faker(new Locale("fr"));
		vehicleDto=VehicleDto.builder()
				.carBrand("Renault")
				.carModel("Captur")
				.carVersion("Intens")
				.fuelType(FuelType.getFuelType())
				.imageURL("https://"+faker.internet().url())
				.deviceSerialNumber(faker.number().digits(10))
				.gearBox(RandomGenerator.getRandomBoolean())
				.numberOfDoors(faker.number().digits(1))
				.ownerOfVehicle(true)
				.siteLocation("ss")
				.parkingLocation("dd")
				.vehicleType("Private car")
				.vehicleColor("Red")
				.systemInUse("INVERSE")
				.seatNumber(faker.number().digits(1))
				.plateNumber(faker.number().digits(11))
				.vehicleVIN(faker.number().digits(17))
				.vehicleClass("A")
				.serviceLevel("Basic")
					.build();
	
			return new Object[][] {{vehicleDto}};
	}
	
	
	@DataProvider
	public Object[][] editVehicle() {
		
			Faker faker = new Faker(new Locale("fr"));
		vehicleDto=VehicleDto.builder()
				.carBrand(Config.getProperty("VEHICLE_BRAND"))
				.carModel(Config.getProperty("VEHICLE_MODEL"))
				.carVersion(Config.getProperty("VEHICLE_VERSION"))
				.fuelType(FuelType.getFuelType())
				.imageURL("https://"+faker.internet().url())
				.deviceSerialNumber(faker.number().digits(10))
				.gearBox(RandomGenerator.getRandomBoolean())
				.numberOfDoors(faker.number().digits(1))
				.ownerOfVehicle(true)
				.siteLocation("ss")
				.parkingLocation("dd")
				.vehicleType("Private car")
				.vehicleColor(Config.getProperty("VEHICLE_COLOR"))
				.systemInUse("INVERSE")
				.seatNumber(faker.number().digits(1))
				.vehicleVIN(faker.number().digits(17))
				.vehicleClass("A")
				.serviceLevel("Basic")
					.build();
	
			return new Object[][] {{vehicleDto}};
	}
	
	

}
