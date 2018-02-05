package glide.backoffice.enums;

import java.util.Random;

public enum CarVersions {
	A, B,a,bx,y,e,erer;

	public static String getBrands(){
		CarVersions[] carBrands = CarVersions.values();
		Random generator = new Random();
		return carBrands[generator.nextInt(carBrands.length)].toString();
	}
}
