package glide.backoffice.method.common;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	private Config() {
		
	}
	
	 private static Properties defaultProps = new Properties();
	  static {
	    try {
	        FileInputStream in = new FileInputStream("src/main/resources/conf/dev2.properties");
	        defaultProps.load(in);
	        in.close();
	    } catch (Exception e) {
	        e.getMessage();
	    }
	  }
	  public static String getProperty(String key) {
	    return defaultProps.getProperty(key);
	  }

}
