package SendEmail;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class MyTest1WithtestNG {
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

  @AfterClass
  public void afterClass() throws EmailException {
	  
	  SendEmailJava2.sendEmail();  //ClassName.MethodName()
	  
  }

}

/*Right  Click on the SendEmail Package
 * click on New
 * Click on Other
 * Type testNG and Select testNG  Class
 * Give a Suitable ClassName and Select the CheckBoxes as per Your Requirement
 * click on Finish
 */
 