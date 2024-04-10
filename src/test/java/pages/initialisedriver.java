package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.ReadConfigFile;

public class initialisedriver {
	private static WebDriver driver= null;
//	public WebDriver initializeDriver() {
//		driver = new ChromeDriver();
//		return driver;
//	}
	
	public WebDriver initializeDriver() {
	    String browserName = new ReadConfigFile().getBrowserName();
	    if (browserName.equals("chrome")) {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saumyapatel\\Desktop\\selenium\\Browser drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
	    } else {
	        throw new IllegalArgumentException("Invalid browser name provided in config file");
	    }
	    return driver;
	}

	public void globalWait(int globalWaitTime) {
		driver.manage().timeouts().implicitlyWait(globalWaitTime, TimeUnit.SECONDS);
	}
}

