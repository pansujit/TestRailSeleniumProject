package glide.backoffice.utility;

import java.util.Random;

public class RandomGenerator {
	  private RandomGenerator() {
		    throw new IllegalStateException("Utility class");
		  }
	
	public static String  randomPhoneNumber() {
		return String.valueOf((long)(Math.random()*100000 + 600000000L));
	}
	
	public static String randomNumberGenerator()
	{
	    double rangeMin = 0.0f;
	    double rangeMax = 1.0f;
	    Random r = new Random();
	    double createdRanNum = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	    return(String.valueOf(createdRanNum));
	}
	
	public static boolean getRandomBoolean() {
	    Random random = new Random();
	    return random.nextBoolean();
	}

}
