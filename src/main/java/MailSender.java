import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender implements ServiceMail{
	private String subject;
	private String content;
	private String sender;
	private String password;
	
	@Override
	public String defineSubject(String subject) {
		this.subject = subject;
		return this.subject;
	}

	@Override
	public String defineContent(String content) {
		this.content = content;
		return this.content;
	}
	
	@Override
	public String defineSender(String sender) {
		this.sender= sender;
		return this.sender;
	}
	
	@Override
	public String definePassword(String password) {
		this.password= password;
		return this.password;
	}
	
	@Override
	public boolean send(String address){
		//Apenas retorna true;
		return true;
	}
}
