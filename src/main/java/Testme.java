



import org.json.simple.parser.ParseException;

import glide.backoffice.method.common.ApiCallsMethod;

import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;


public class Testme {

	public static void main(String[] args) throws FileNotFoundException,  ParseException {

		String text=	"width:calc( ((100% - 150px) / 1) / 30 );left:calc( (((100% - 150px) / 1) / 1440 * 615) + 150px);background-color:#54AD59;\" data-reactid=\".0.1.$page.0.2.3:$adc0265e-5246-4fd5-aa88-4efb7cbb2d4d.1:$63cd52c1-b31d-4398-80e0-6bcc1457037c.1:$1e114246-d33a-46f4-b47d-5d6bfbfeaf21.2:$f0bc3cdb-d0af-47a7-a171-db927cce0bd8.$f0bc3cdb-d0af-47a7-a171-db927cce0bd8";
		List<String> backgroundColor=new ArrayList<>();	
		for(String mydata:text.split(";")){
			if(mydata.contains("background-color")) {
				backgroundColor.add(mydata.split(":")[1]);
			}
		}
		//String test="rgb(247, 140, 53)";
		String test="rgb(247, 140, 53)";

		String regex ="^rgb(.*)";
		Pattern pattern = Pattern.compile(regex);
		System.out.println(pattern.matcher(test).matches());
		System.out.println(test.replaceAll("[\\[\\](){}]","").replaceAll("rgb", "").trim());
		String[] mydata=test.replaceAll("[\\[\\](){}]","").replaceAll("rgb", "").trim().split(",");
		System.out.println(String.format("#%02x%02x%02x", Integer.parseInt(mydata[0].trim()),Integer.parseInt(mydata[1].trim()),Integer.parseInt(mydata[2].trim())));
	}	
	
	
	


}
