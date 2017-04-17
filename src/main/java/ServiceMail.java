
public interface ServiceMail {
	boolean send(String address);
	String defineSubject(String subject);
	String defineContent(String content);
	String defineSender(String sender);
	String definePassword(String password);
}
