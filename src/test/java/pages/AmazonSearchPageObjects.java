package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchPageObjects {
	
	WebDriver driver = null;
	
	By SearchBox_search  = By.id("twotabsearchtextbox");
	By SearchBtn_search = By.id("nav-search-submit-button");
	By AddToCartBtn = By.xpath("(//input[@id='add-to-cart-button'])[2]");
	
	By BuyNowBtn = By.id("buy-now-button");
    By WishlistBtn = By.id("wishListMainButton");
    By WishlistLink = By.id("WLHUC_viewlist");
    By RemoveFromWishlistBtn = By.xpath("//span[contains(text(),'Delete')]");
	//"(//input[@id='add-to-cart-button'])[2]"
	 public AmazonSearchPageObjects(WebDriver driver) {
		 this.driver = driver;
	 }
	//testcase 1
	public void setTextInsearchbox(String text) {
		driver.findElement(SearchBox_search).sendKeys(text);;
	}
	//testcase 2
	public void clicksearchButton() {
		driver.findElement(SearchBtn_search).click();
	}
	
	//testCase 3
	public void addToCart(String productUrl) {
        driver.get(productUrl);
        driver.findElement(AddToCartBtn).click();
    }
	//testcase 4
	public void selectMiniTV(String partialLinkText) {
        driver.findElement(By.partialLinkText(partialLinkText)).click();
    }
	
    //testcase 5
    public void goToSettings() {
    	driver.findElement(By.cssSelector("[data-testid='appnavbar_menuitem_settingsicon']")).click();
    }
    //testcase 6
    public void goToDeleteDataPage() {
    	driver.findElement(By.cssSelector("[data-testid='appnavbar_menuitem_accountdeletion']")).click();
    }
    //testCase 7
    public void clickYesButton() {
        driver.findElement(By.cssSelector(".Button_button__PjVhE.Button_primary___XGO6")).click();
    }
    //testcase 8
    public void clickHmIcon() {
        driver.findElement(By.cssSelector(".hm-icon.nav-sprite")).click();
    }
    //testcase 9
    public void clickSignInButton() {
        driver.findElement(By.id("hmenu-customer-name")).click();
    }
    //testcase 10
    public void enterEmail(String email) {
        driver.findElement(By.id("ap_email")).sendKeys(email);
    }
}
