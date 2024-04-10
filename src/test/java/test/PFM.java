package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFM {

    private static WebDriver driver = null;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saumyapatel\\Desktop\\selenium\\Browser drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        
        AmazonSearchPageObjects searchpageobj = new AmazonSearchPageObjects(driver);
        PageFactory.initElements(driver, searchpageobj);

        searchpageobj.setTextInsearchbox("maggi");
        searchpageobj.clicksearchButton();

//        driver.quit();
    }
}
class AmazonSearchPageObjects {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(xpath = "//input[@value='Go']")
    private WebElement searchButton;

	private WebDriver driver;

    public AmazonSearchPageObjects(WebDriver driver) {
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTextInsearchbox(String text) {
        searchBox.sendKeys(text);
    }

    public void clicksearchButton() {
        searchButton.click();
    }
}

