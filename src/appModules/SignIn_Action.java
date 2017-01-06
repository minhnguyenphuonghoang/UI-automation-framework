package appModules;
import org.testng.Reporter;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
     
      
    public class SignIn_Action {
    	
    	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
    	// iTestcaseRow is passed as an Argument to this method, so that it can used inside this method
    	// For use of Functions & Parameters, please see http://www.toolsqa.com/function-parameters/
        public static void Execute(int iTestCaseRow) throws Exception{
        	
        	// Clicking on the My Account link on the Home Page
//        	Home_Page.lnk_MyAccount().click();
//        	Log.info("Click action is perfromed on My Account link" );
        	
        	// Storing the UserName in to a String variable and Getting the UserName from Test Data Excel sheet
        	// iTestcaseRow is the row number of our Testcase name in the Test Data sheet
        	// Constant.Col_UserName is the column number for UserName column in the Test Data sheet
        	// Please see the Constant class in the Utility Package
        	// For Use of Constant Variables, please see http://www.toolsqa.com/constant-variables/
        	String userName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
        	// Here we are sending the UserName string to the UserName Textbox on the LogIN Page
        	// This is call Page Object Model (POM)
        	// For use of POM, please see http://www.toolsqa.com/page-object-model/
            LogIn_Page.emailAddressTextField().sendKeys(userName);
            // Printing the logs for what we have just performed
            Log.info(userName + " is entered in UserName text box");
            
            String password = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
            LogIn_Page.passwordTextField().sendKeys(password);
            Log.info(password + " is entered in Password text box");
            
            LogIn_Page.LoginButton().click();
            Log.info("Click action is performed on Submit button");
            
            
            Thread.sleep(3000);
            // I noticed in few runs that Selenium is trying to perform the next action before the complete Page load
            // So I have decided to put a wait on the Logout link element
            // Now it will wait 10 secs separately before jumping out to next step
//            Utils.waitForElement(Home_Page.lnk_LogOut());
            
            // This is another type of logging, with the help of TestNg Reporter log
            // This has to be very carefully used, you should only print the very important message in to this
            // This will populate the logs in the TestNG HTML reports
            // I have used this Reporter log just once in this whole module 
            Reporter.log("SignIn Action is successfully perfomred");
            
        }
    }
