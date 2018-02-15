package glide.backoffice.utility;

import java.util.regex.Pattern;

public class RegExpression {
	private RegExpression() {
		
	}
	/**
	 * This regular expression returns true when given string input matches with regular expression otherwise return false
	 * @param input - Should be String
	 * @return {@code boolean}
	 */
	public static boolean matchDashBoardData(String input) {
		// This regular expression will check for alphanumeric as well and number 0-9 as well as white space
		// return and new line. but failes with "-" or "_".
		String regex = "^[a-zA-Z0-9\\r\\n\\s]+$";
		Pattern pattern = Pattern.compile(regex);
		//String input="0\n" + 
		//	"Booking in progress"
	  return pattern.matcher(input).matches();
	}

}