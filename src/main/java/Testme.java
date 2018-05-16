



import org.json.simple.parser.ParseException;

import glide.backoffice.method.common.ApiCallsMethod;

import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.regex.Pattern;


public class Testme {

	public static void main(String[] args) throws FileNotFoundException,  ParseException {

		String match="orčpžsíáýdéèö";
		String text = Normalizer.normalize("orčpžsíáýdéèö", Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		//match = match.replaceAll("[^\\p{ASCII}]", "");
	}	
	
	
}
