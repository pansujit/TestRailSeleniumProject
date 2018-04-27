package glide.backoffice.dataprovider;



import org.testng.annotations.DataProvider;

import glide.backoffice.method.fleets.vehicles.VehicleFilterDto;

public class VehicleFilterDataProvider {
	VehicleFilterDto vehicleFilterDto;
	@DataProvider
	public Object[][] filterVehicle() {
		
			vehicleFilterDto=VehicleFilterDto.builder()
				.brand("Renault")
				.model("Captur")
				.version("Intens")
				.vehicleCategory("A")
				.color("Red")
				.systemType("INVERSE")
				.vehicleStatus("READY")
				.type("PASSENGER")
				.cleanlinessStatus("CLEAN")	
				.plateNumber("kkkkkkkkk")
				.build();
			return new Object[][] {{vehicleFilterDto}};
	}
	

}
