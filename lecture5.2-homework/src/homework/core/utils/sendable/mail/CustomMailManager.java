package homework.core.utils.sendable.mail;

public class CustomMailManager implements MailService{

	@Override
	public void send(String to, String message) {
		System.out.println("MAIL --> `" + message + "` sended to : " + to);
	}

}
