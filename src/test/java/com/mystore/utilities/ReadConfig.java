package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	String path = "C:\\Users\\abhis\\eclipse-workspace-selenium\\MyStore\\Configuration\\Config.properties";
	
	public ReadConfig() {
		try {
		properties = new Properties();
		
		FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		}
			
	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getBaseURL() {
		String value = properties.getProperty("baseURL");
		if (value!= null)
			return value;
		else
			throw new RuntimeException("url not specified in config file");
	}
	
	public String getBrowser() {
	String value =	properties.getProperty("browser");
	
	if (value!= null)
		return value;
	else
		throw new RuntimeException("browser not specified in config file");
	
	}
	

}
