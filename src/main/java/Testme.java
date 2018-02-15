
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;


public class Testme {

	
	public static void main(String[] args) {
		Date date = new Date();
		String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
		System.out.println(modifiedDate);
		 Pattern pattern;
		String DATE_PATTERN="([A-Z])([a-z]*)(\\s*)((19|20)\\d\\d)";
		pattern = Pattern.compile(DATE_PATTERN);
		System.out.println(pattern.matcher("january 1800").matches());

	}	
}
