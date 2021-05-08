package homework.core.utils.sendable.sms;

public class CustomSmsManager implements SmsService{

	@Override
	public void send(String to, String message) {
		System.out.println("SMS  --> `" + message + "` sended to : " + to);	
	}

}
