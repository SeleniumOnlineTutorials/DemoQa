package com.cucumber.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {


	public Properties props=null;
	public String configFilePath="D:\\Vyshnavi\\Cucumber_Framework\\src\test\\resources\\config.properties";

	public void readConfigFile(){

		BufferedReader reader;

		try{
			reader= new BufferedReader(new FileReader(configFilePath));
			props=new Properties();

			try {
				props.load(reader);
				
				reader.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
		catch(FileNotFoundException e){

			e.printStackTrace();
			throw new RuntimeException("config file "+configFilePath+"not found");
		}

	}
	
	public String getDriverPath(){
		String driverPath= props.getProperty("driverPath");
		if(driverPath!=null)
			return driverPath;
		else throw new RuntimeException("diver path is not specified in the config file");
			
	}
	public String getAppliationUrl(){
		String app= props.getProperty("appUrl");
		if(app!=null)
			return app;
		else throw new RuntimeException("application address is not specified in the config file");
			
	}
	
	public String getBrowserType(){
		
		String browser= props.getProperty("appUrl");
		if(browser!=null)
			return browser;
		else throw new RuntimeException("browser type is not specified in the config file");
			
		
	}
	

}
