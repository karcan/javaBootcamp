package homework.core.utils.mail;

public class CustomMailManager implements MailService{
	
	@Override
	public void sendMail(String to, String message) {
		System.out.println("Mail `" + message + "` sended to : " + to);
	}
}
