package glide.backoffice.logger;

import org.apache.log4j.Logger;
/**
 * This is static logger class to log the events
 * @author sujitpandey
 * @created on Mar 1, 2018 5:54:12 PM
 */
public class Logging {
	

	private Logging() {
		super();	
	}

	public static final Logger log = Logger.getLogger(Logging.class);


}
