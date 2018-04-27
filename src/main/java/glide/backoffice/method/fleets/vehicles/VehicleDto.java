package glide.backoffice.method.fleets.vehicles;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDto {
	String imageURL;
	String gearBox;
	String carBrand;
	String carModel;
	String carVersion;
	String vehicleClass;
	String seatNumber;
	String vehicleColor;
	String vehicleType;
	String numberOfDoors;
	String fuelType;
	String vehicleVIN;
	String plateNumber;
	String ownerOfVehicle;
	String siteLocation;
	String parkingLocation;
	String serviceLevel;
	String systemInUse;
	String deviceSerialNumber;
	String installationDate;
	String type;
	String fileName;
	
}
