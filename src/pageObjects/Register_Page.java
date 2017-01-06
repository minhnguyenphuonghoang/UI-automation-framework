package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Register_Page extends BaseClass{
	
	private static WebElement element = null;
	
	public Register_Page(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement genderMale(){
    	try{
        	element = driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
            Log.info("Gender: Male single selection is found on the Register Page");
    	} catch (Exception e) {
    		Log.error("Gender: Male single selection is not found on the Register Page");
       		throw(e);
		}
    	return element;
    }
    
	public static WebElement genderFemale(){
    	try{
        	element = driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
            Log.info("Gender: Female single selection is found on the Register Page");
    	} catch (Exception e) {
    		Log.error("Gender: Female single selection is not found on the Register Page");
       		throw(e);
		}
    	return element;
    }
	
	
	
	
	public static WebElement firstNameTextField(){
    	try{
        	element = driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
            Log.info("First Name text field is found on the Register Page");
    	} catch (Exception e) {
    		Log.error("First Name text field is not found on the Register Page");
       		throw(e);
		}
    	return element;
    }
	
	public static WebElement lastNameTextField(){
    	try{
        	element = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
            Log.info("Last Name text field is found on the Register Page");
    	} catch (Exception e) {
    		Log.error("Last Name text field is not found on the Register Page");
       		throw(e);
		}
    	return element;
    }
	
	/*
		dayOfBirth
	
	
	
	*/

    public static WebElement passwordTextField(){
    	try{
        	element = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
            Log.info("Password text field is found on the Register Page");
    	} catch (Exception e) {
    		Log.error("Password text field is not found on the Register Page");
       		throw(e);
		}
    	return element;
    }
    
    public static WebElement confirmPasswordTextField(){
    	try{
        	element = driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
            Log.info("Confirm password text field is found on the Register Page");
    	} catch (Exception e) {
    		Log.error("Confirm password text field is not found on the Register Page");
       		throw(e);
		}
    	return element;
    }
    
    public static WebElement registerButton(){
    	try{
        	element = driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
            Log.info("Register button is found on the Register Page");
    	} catch (Exception e) {
    		Log.error("Register button is not found on the Register Page");
       		throw(e);
		}
    	return element;
    }
    
}
