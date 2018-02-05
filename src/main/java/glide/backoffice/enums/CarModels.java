package glide.backoffice.enums;

import java.util.Random;

public enum CarModels {
	A, B,a,bx,y,e,erer;

	public static String getModels(){
		CarModels[] carBrands = CarModels.values();
		Random generator = new Random();
		return carBrands[generator.nextInt(carBrands.length)].toString();
	}
}
