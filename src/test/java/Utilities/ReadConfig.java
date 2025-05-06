package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties p;
	
	//Constructor 
	public ReadConfig () throws IOException
	{
		String path = "Config.properties";
		FileInputStream file = new FileInputStream(path);
		p = new Properties();
		p.load(file);
		
	}
	
	public String getBrowser()
	{
		String value = p.getProperty("browser");
		return value;		
	}
	
	
}
