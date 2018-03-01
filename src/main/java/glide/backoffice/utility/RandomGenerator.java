package glide.backoffice.utility;

import java.util.Random;

public class RandomGenerator {
	  private RandomGenerator() {
		    throw new IllegalStateException("Utility class");
		  }
	/**
	 * this public static helper method generates the 9 digit number starting always from 6
	 * @return String
	 */
	public static String  randomPhoneNumber() {
		return String.valueOf((long)(Math.random()*100000 + 600000000L));
	}
	/**
	 * This public static helper method generates the random number between 0 and 1.
	 * @return String
	 */
	public static String randomNumberGenerator()
	{
	    double rangeMin = 0.0f;
	    double rangeMax = 1.0f;
	    Random r = new Random();
	    double createdRanNum = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	    return(String.valueOf(createdRanNum));
	}
	/**
	 * this public static helper method generates the random boolean value
	 * @return boolean
	 */
	public static boolean getRandomBoolean() {
	    Random random = new Random();
	    return random.nextBoolean();
	}

}
