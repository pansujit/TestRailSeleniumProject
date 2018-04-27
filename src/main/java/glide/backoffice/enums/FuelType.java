package glide.backoffice.enums;

import java.util.Random;

public enum FuelType {
 Diesel,Petrol,LPG,Electric,Hybrid;
	public static String getFuelType(){
		FuelType[] vias = FuelType.values();
		Random generator = new Random();
		return vias[generator.nextInt(vias.length)].toString();
	}

}
