package homework.core.utils.sendable;

import homework.core.utils.sendable.mail.Mail;
import homework.core.utils.sendable.sms.Sms;

public class SendableUtils {
	
	public static void run(Sendable sendable, Mail mail) {
		sendable.send(mail.getMailAddress(), mail.getMessage());
	}
	public static void run(Sendable sendable, Sms sms) {
		sendable.send(sms.getPhoneNumber(), sms.getMessage());
	}
}
