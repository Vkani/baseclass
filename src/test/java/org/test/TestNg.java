package org.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class TestNg extends TestBase{
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileReader reader=new FileReader(new File(System.getProperty("user.dir") + "\\config.properties"));
		prop.load(reader);
		String url = prop.getProperty("url").toString();
		String browser = prop.getProperty("browser");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		prop.get(browser);
		prop.get(username);
		prop.get(password);
		
		
	}
	
	
	
	
	
}	

