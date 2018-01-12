package glide.backoffice.utility;

import java.util.regex.Pattern;

public class RegExpression {
	private RegExpression() {
		
	}
	
	public static boolean matchDashBoardData(String input) {
		// This regular expression will check for alphanumeric as well and number 0-9 as well as white space
		// return and new line. but failes with "-" or "_".
		String regex = "^[a-zA-Z0-9\\r\\n\\s]+$";
		Pattern pattern = Pattern.compile(regex);
		//String input="0\n" + 
		//	"Booking in progress"
	 //System.out.println(pattern.matcher(input).matches())
	  return pattern.matcher(input).matches();
	}

}