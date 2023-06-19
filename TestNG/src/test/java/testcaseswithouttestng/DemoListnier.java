package testcaseswithouttestng;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class DemoListnier implements ITestListener{
    
   public void onTestFailure(ITestResult itestresult){
    System.out.println("Test Failed : " + itestresult.getName() + " Taking Screenshot ! ");
   }
    
}
