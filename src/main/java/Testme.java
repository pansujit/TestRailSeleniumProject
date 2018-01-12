import java.util.Locale;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class Testme {
	   static {
	         System.out.println("hello");
	   }
	
	public static void main(String[] Args) {
		
		Faker faker = new Faker(new Locale("fr"));

		String name = faker.name().fullName(); // Miss Samanta Schmidt
		String firstName = faker.name().firstName(); // Emory
		String lastName = faker.name().lastName(); // Barton
		String number=faker.phoneNumber().cellPhone();
		String companyURL=("https://").concat(faker.company().url());
		Address streetAddress = faker.address(); 
		System.out.println(name+" "+ firstName+ " "+ lastName + " "+ streetAddress+ " "+ companyURL);
		
		
		
	}
	

}
