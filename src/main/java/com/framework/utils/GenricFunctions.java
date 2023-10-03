package com.framework.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenricFunctions {
	
	static FileInputStream fis = null;
	static Properties properties = new Properties();

	public static String getPropertyValue(String args) {
		// TODO Auto-generated method stub
		
		try {
			fis = new FileInputStream("./src/main/resources/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value=properties.getProperty(args);
		return value;

	}
	public static void main(String args[]){
		System.out.println("temp" +getPropertyValue("qa_server_url"));
	}
}


