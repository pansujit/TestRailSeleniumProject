package glide.backoffice.utility;


import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class StringSplitter {
	static Logger log = Logger.getLogger(StringSplitter.class.getName());
	private StringSplitter() {
		throw new IllegalStateException("Utility class");
	}
	public static String splitStyle(String style) {
		log.info("Running 'splitStyle' method from 'StringSplitter' class");
		String backgroundColor="";
		for(String mydata:style.split(";")){
			if(mydata.contains("background-color")) {
				backgroundColor=mydata.split(":")[1];
			}
		}
		log.info("Return the background color of the booking in vehicle planning");
		return backgroundColor;
	}
	private void stringMatcher(String input) {
		String regex = "^rgb(.*)";
		Pattern pattern = Pattern.compile(regex);
		//String input="0\n" + 
		//	"Booking in progress"
		pattern.matcher(input).matches();
	}
	
	
	public static String rgbToHEX(String rgb) {

		//String regex ="^rgb(.*)";
		//Pattern pattern = Pattern.compile(regex);
		//System.out.println(pattern.matcher(rgb).matches());
		String[] mydata=rgb.replaceAll("[\\[\\](){}]","").replaceAll("rgb", "").trim().split(",");
		return String.format("#%02x%02x%02x", 
				Integer.parseInt(mydata[0].trim()),Integer.parseInt(mydata[1].trim()),Integer.parseInt(mydata[2].trim()));

	}


}
