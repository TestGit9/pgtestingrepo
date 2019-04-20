package SendEmail;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class MyTest1WithtestNG2WithTestResult2 {
  @Test
  public void myTest() {
	  
	  int a=90;
	  
	  int b=90;
	  
	  Assert.assertEquals(a, b);
	  
	  System.out.println("========================Testdone===============");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("=====================Starting the Test================");
  }

  @AfterMethod
  public void afterClass(ITestResult result) throws EmailException  
    {
	  if(result.getStatus()==ITestResult.FAILURE){
		  
		  SendEmailJava2.sendEmail();  //ClassName.MethodName()
		  
		  System.out.println("Test Failed and Email Sent");	  
	  }
	  
  }

}


 