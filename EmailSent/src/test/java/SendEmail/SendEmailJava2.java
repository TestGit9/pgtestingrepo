package SendEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailJava2 {


	public static void sendEmail() throws EmailException {
		Email email = new SimpleEmail();
		
		email.setHostName("smtp.gmail.com");
		
		email.setSmtpPort(465);
		
		email.setAuthenticator(new DefaultAuthenticator("demoemailtesting7@gmail.com", "Testing@123"));
		email.setSSLOnConnect(true);
		email.setFrom("pgpitabash@gmail.com");
		email.setSubject("Selenium Test Report");
		email.setMsg("This is a test mail from Selenium");
		email.addTo("pgpitabash@gmail.com");
		email.send();
	}

}
