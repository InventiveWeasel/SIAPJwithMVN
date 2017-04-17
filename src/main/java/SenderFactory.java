
public class SenderFactory {
	public final static int MAIL = 1;
	public final static int EMAIL = 2;
	
	public static ServiceMail getServiceMail(int service){
		switch(service){
			case MAIL:
				return new MailSender();
			default:
				return new DefaultSender();
		}
		
	}
}
