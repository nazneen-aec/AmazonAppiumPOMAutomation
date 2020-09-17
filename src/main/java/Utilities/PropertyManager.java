package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import settings.Base;

public class PropertyManager  {

	// **********************************************************************************************************
	// Author: Onur Baskirt
	// Description: PropertyManager class reads global configurations and use them
	// during test execution.
	// **********************************************************************************************************

	private static PropertyManager instance;
	private static final Object lock = new Object();
	private static String propertyFilePath = System.getProperty("user.dir")
			+ "src\\main\\java\\Configuration.properties";
	private static String url;
	private static String wrongUsername;
	private static String wrongPassword;
	
	

	// Create a Singleton instance. We need only one instance of Property Manager.
	public static PropertyManager getInstance() {
		if (instance == null) {
			synchronized (lock) {
				instance = new PropertyManager();
				
				instance.loadData();
			}
		}
		return instance;
	}

	// Get all configuration data and assign to related fields.
	private void loadData() {
		// Declare a properties object
		Properties prop = new Properties();

		// Read configuration.properties file
		try {
			prop.load(new FileInputStream(propertyFilePath));
			// prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
		} catch (IOException e) {
			System.out.println("Configuration properties file cannot be found");
		}

		// Get properties from configuration.properties
		url = prop.getProperty("url");
		wrongUsername = prop.getProperty("wrongUsername");
		wrongPassword = prop.getProperty("wrongPassword");
	}

	public String getURL() {
		return url;
	}

	public String getWrongUsername() {
		return wrongUsername;
	}

	public String getWrongPassword() {
		return wrongPassword;
	}
}