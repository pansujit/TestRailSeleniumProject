package glide.backoffice.method.fleets.vehicles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleFilterDto {
	String brand;
	String model;
	String version;
	String vehicleCategory;
	String color;
	String systemType;
	String vehicleStatus;
	String type;
	String cleanlinessStatus;
	String plateNumber;

}
