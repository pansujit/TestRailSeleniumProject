
import java.time.Month;

import glide.backoffice.utility.DateHelper;

public class Testme {

	
	public static void main(String[] args) {
		String name="january";
		System.out.println(Month.valueOf(name.toUpperCase()).getValue());
	}
	
}
