package appModules;
import org.testng.Reporter;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
     
      
public class SignIn_Action {
	

    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	// navigate to login screen
    	Home_Page.loginLink().click();
        Log.info("Click action is performed on Login link");
        Thread.sleep(3000);
        
    	// input email address
    	String userName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
        LogIn_Page.emailAddressTextField().sendKeys(userName);
        Log.info(userName + " is entered in UserName text box");
        
        // input password
        String password = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
        LogIn_Page.passwordTextField().sendKeys(password);
        Log.info(password + " is entered in Password text box");
        
        // click login button
        LogIn_Page.loginButton().click();
        Log.info("Click action is performed on Login button");
        
        
        Thread.sleep(3000);
        Reporter.log("SignIn Action is successfully perfomred");
        
    }
}
