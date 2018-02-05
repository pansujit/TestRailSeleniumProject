package glide.backoffice.enums;

import java.util.Random;

public enum FuelType {
 DIESEL,PETROL,LPG,ELECTRIC,HYBRID;
	public static String getFuelType(){
		FuelType[] vias = FuelType.values();
		Random generator = new Random();
		return vias[generator.nextInt(vias.length)].toString();
	}

}
