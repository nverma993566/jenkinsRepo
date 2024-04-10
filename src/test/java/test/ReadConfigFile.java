package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	
	Properties properties;
	String path ="C:\\Users\\saumyapatel\\eclipse-workspace\\maven\\src\\test\\java\\test\\config.properties";
	
	public ReadConfigFile(){
		
		properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getUrl() {
		String url = properties.getProperty("url");
		if(url != null)
			return url;
		else
			throw new RuntimeException("url not found");
					
	}
	public String SearchItem() {
		String SI = properties.getProperty("searchitem");
		if(SI != null)
			return SI;
		else
			throw new RuntimeException("search item not found in config file");
					
	}
	
	public String getBrowserName() {
	    String browserName = properties.getProperty("browserName");
	    if (browserName != null)
	        return browserName;
	    else
	        throw new RuntimeException("Browser name not found in config file");
	}

	public int getGlobalWaitTime() {
	    String waitTime = properties.getProperty("globalWaitTime");
	    if (waitTime != null)
	        return Integer.parseInt(waitTime);
	    else
	        throw new RuntimeException("Global wait time not found in config file");
	}

}
