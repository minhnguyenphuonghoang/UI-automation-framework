package pageObjects;
import org.openqa.selenium.*;
import utility.Log;
public class Purchasing_Page extends BaseClass {
   private static WebElement element = null;
    public Purchasing_Page(WebDriver driver){
        	super(driver);
    }     
    
    public static WebElement purchaseButton(){
    	try{
        	element = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button-25\"]"));
            Log.info("ADD TO CART button is found on the Product Page");
    	} catch (Exception e) {
    		Log.error("ADD TO CART button is found on the Product Page");
       		throw(e);
		}
    	return element;
    }
    
    public static WebElement shoppingCartLink(){
    	try{
        	element = driver.findElement(By.xpath("//div[@id=\"bar-notification\"]/p/a"));
            Log.info("Shopping cart link is found on the notification of the Product Page");
    	} catch (Exception e) {
    		Log.error("Shopping cart link is found on the notification of the Product Page");
       		throw(e);
		}
    	return element;
    }
    
    public static WebElement termOfServiceCheckBox(){
    	try{
        	element = driver.findElement(By.xpath("//input[@id=\"termsofservice\"]"));
            Log.info("Term of Service check box is found on the Cart Page");
    	} catch (Exception e) {
    		Log.error("Term of Service check box is found on the Cart Page");
       		throw(e);
		}
    	return element;
    }
    
    public static WebElement checkoutButton(){
    	try{
        	element = driver.findElement(By.xpath("//button[@id=\"checkout\"]"));
            Log.info("Checkout button is found on the Cart Page");
    	} catch (Exception e) {
    		Log.error("Checkout button is found on the Cart Page");
       		throw(e);
		}
    	return element;
    }
    
    public static WebElement checkoutAsGuestButton(){
    	try{
        	element = driver.findElement(By.xpath("//input[@value=\"Checkout as Guest\"]"));
            Log.info("Checkout As Guest button is found on the Check Out Page");
    	} catch (Exception e) {
    		Log.error("Checkout As Guest button is found on the Check Out Page");
       		throw(e);
		}
    	return element;
    }
    
}
