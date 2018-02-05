package glide.backoffice.enums;

import java.util.Random;

public enum CarBrands {
	BMV,TESLA,Animals;

	public static String getBrands(){
		CarBrands[] carBrands = CarBrands.values();
		Random generator = new Random();
		return carBrands[generator.nextInt(carBrands.length)].toString();
	}
}
