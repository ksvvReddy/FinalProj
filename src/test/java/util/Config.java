package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Config {
	private static final String DEFAULT_PROPERTIES = "resources/config/default.properties";
	private static Properties properties;

	public static void initialize() throws IOException {

		// load default properties
		properties = readPropertiesFile(DEFAULT_PROPERTIES);

		// check for any override
		for (String key : properties.stringPropertyNames()) {
			if (System.getProperties().containsKey(key)) {
				properties.setProperty(key, System.getProperty(key));
			}
		}

	}

	public static String get(String key) {
		return properties.getProperty(key);
	}

	public static Properties readPropertiesFile(String fileName) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			fis.close();
		}
		return prop;
	}
}
