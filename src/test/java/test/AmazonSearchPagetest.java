package test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pages.AmazonSearchPageObjects;
import pages.initialisedriver;

public class AmazonSearchPagetest {
	
//	static Logger loggerObj = LogManager.getLogger(AmazonSearchPagetest.class);
	private static WebDriver driver= null;
	
	public static void main(String[] args) {

		driver = new initialisedriver().initializeDriver();
		driver.get(new ReadConfigFile().getUrl());
		new initialisedriver().globalWait(new ReadConfigFile().getGlobalWaitTime());

		AmazonSearchTest();
		System.out.println("logger demo");
		//loggerObj.info("Printing to logger");
	}
	
	public static void AmazonSearchTest() {
		ReadConfigFile ConfigFile = new ReadConfigFile();
		driver.get(ConfigFile.getUrl());
		AmazonSearchPageObjects searchpageobj = new AmazonSearchPageObjects(driver);
		driver.manage().window().maximize();
		searchpageobj.setTextInsearchbox(ConfigFile.SearchItem());
		searchpageobj.clicksearchButton();
		
		searchpageobj.addToCart("https://www.amazon.in/dp/B0CHX7STQQ");
		searchpageobj.selectMiniTV("Amazon miniTV");
		searchpageobj.goToSettings();
		searchpageobj.goToDeleteDataPage();
		searchpageobj.clickYesButton();
		searchpageobj.clickHmIcon();
		searchpageobj.clickSignInButton();
		searchpageobj.enterEmail("abc@gmail.com");
		
		
	}
}
