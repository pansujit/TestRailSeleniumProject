package glide.backoffice.enums;

import java.util.Random;

public enum VehicleStatus {
	
	Cleaning,Intervention,Inactive,Maintenance;
	
	public static String getVehicleStatus(){
		VehicleStatus[] vehicleStatus = VehicleStatus.values();
		Random generator = new Random();
		return vehicleStatus[generator.nextInt(vehicleStatus.length)].toString();
	}

}
