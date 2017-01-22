package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.Utils;
public class Home_Page extends BaseClass{
	private static WebElement element = null;
	   
	public Home_Page(WebDriver driver){
		super(driver);
	}
    
	public static WebElement loginLink(){
    	try{
        	element = driver.findElement(By.xpath("//a[text()=\"Log in\"]"));
            Log.info("Login Link is found on the Home Page");
    	} catch (Exception e) {
    		Log.error("Login Link is not found on the Home Page");
       		throw(e);
		}
    	return element;
    }
}
