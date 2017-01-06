package pageObjects;
        import org.openqa.selenium.*;

import utility.Log;
    public class LogIn_Page extends BaseClass {
           private static WebElement element = null;
        
        public LogIn_Page(WebDriver driver){
            	super(driver);
        }     
        
        public static WebElement emailAddressTextField(){
        	try{
	        	element = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
	            Log.info("Email Address text field is found on the Login Page");
        	} catch (Exception e) {
        		Log.error("Email Address text field is not found on the Login Page");
           		throw(e);
			}
        	return element;
        }
        
        public static WebElement passwordTextField(){
        	try{
	        	element = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
	            Log.info("Password text field is found on the Login Page");
        	} catch (Exception e) {
        		Log.error("Password text field is not found on the Login Page");
           		throw(e);
			}
        	return element;
        }
        
        public static WebElement LoginButton(){
        	try{
	        	element = driver.findElement(By.xpath(" //input[@value=\"Log in\"]"));
	            Log.info("Login button is found on the Login Page");
        	} catch (Exception e) {
        		Log.error("Login button is not found on the Login Page");
           		throw(e);
			}
        	return element;
        }
        
        
//        public static WebElement txtbx_UserName() throws Exception{
//        	try{
//	            element = driver.findElement(By.id("log"));
//	            Log.info("Username text box is found on the Login Page");
//        	}catch (Exception e){
//           		Log.error("UserName text box is not found on the Login Page");
//           		throw(e);
//           		}
//           	return element;
//            }
//        
//        public static WebElement txtbx_Password() throws Exception{
//        	try{
//	        	element = driver.findElement(By.id("pwd"));
//	            Log.info("Password text box is found on the Login page");
//        	}catch (Exception e){
//        		Log.error("Password text box is not found on the Login Page");
//           		throw(e);
//           		}
//           	return element;
//        }
//        
//        public static WebElement btn_LogIn() throws Exception{
//        	try{
//	        	element = driver.findElement(By.id("login"));
//	            Log.info("Submit button is found on the Login page");
//        	}catch (Exception e){
//        		Log.error("Submit button is not found on the Login Page");
//           		throw(e);
//           		}
//           	return element;
//        }
    }
