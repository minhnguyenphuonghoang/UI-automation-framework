package appModules;
import org.testng.Reporter;
import pageObjects.Purchasing_Page;
import utility.Log;
     
      
public class Purchase_Action {
	

    public static void Execute(int iTestCaseRow) throws Exception{
    	
    	// click on purchase button   
    	Purchasing_Page.purchaseButton().click();
        Log.info("Click action is performed on purchase button");
        Thread.sleep(1000);
        
        // navigate to the shopping cart
        Purchasing_Page.shoppingCartLink().click();
        Log.info("Click action is performed on shopping cart button");
        Thread.sleep(3000);
        
        // click on purchase button   
    	Purchasing_Page.termOfServiceCheckBox().click();
        Log.info("Check action is performed on termOfService checkbox");
    	
        // click on checkout button   
    	Purchasing_Page.checkoutButton().click();
        Log.info("Click action is performed on checkout button");
        Thread.sleep(3000);
    	
        // click on checkout as guest button   
    	Purchasing_Page.checkoutAsGuestButton().click();
        Log.info("Click action is performed on Checkout As Guest button");
    	
        Thread.sleep(3000);
        Reporter.log("Purchase Action is successfully perfomred");
        
    }
}
