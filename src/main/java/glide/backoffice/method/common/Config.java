package glide.backoffice.method.common;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.TestNG;
import org.testng.TestRunner;

import glide.backoffice.logger.Logging;

import java.io.File;
public class Config {
	private Config() {

	}

	private static String fileCheck(){
		String fileTranslateFile=null;
		File file= new File("src/main/resources/conf/"+System.getProperty("TestFile"));
		if(file.exists()){
			fileTranslateFile=file.getAbsolutePath();
		}

		else
		{
			Logging.log.error("Property file NOT FOUND");
		}

		return fileTranslateFile;
	}

	private static Properties defaultProps = new Properties();
	static {
		try {
			FileInputStream in = new FileInputStream(fileCheck());
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
