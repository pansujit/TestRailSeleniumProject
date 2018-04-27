package glide.backoffice.enums;

import java.util.Random;

public enum Gearbox {
	
	 Automatic,Manual;
		public static String getGearbox(){
			Gearbox[] vias = Gearbox.values();
			Random generator = new Random();
			return vias[generator.nextInt(vias.length)].toString();
		}

}
