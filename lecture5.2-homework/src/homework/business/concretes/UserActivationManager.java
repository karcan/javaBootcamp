package homework.business.concretes;

import java.util.UUID;


import homework.business.abstracts.UserActivationService;
import homework.business.abstracts.UserService;
import homework.core.utils.consts.ValidationMessage;
import homework.core.utils.sendable.Sendable;
import homework.core.utils.sendable.SendableUtils;
import homework.core.utils.sendable.mail.Mail;
import homework.core.utils.sendable.mail.MailService;
import homework.core.utils.sendable.sms.Sms;
import homework.core.utils.sendable.sms.SmsService;
import homework.dataAccess.abstracts.UserActivationDao;
import homework.entity.concretes.User;
import homework.entity.concretes.UserActivation;

public class UserActivationManager implements UserActivationService {
	
	private UserService userService;
	private UserActivationDao userActivationDao;
	private Sendable[] sendables;
	
	public UserActivationManager(UserService userService, UserActivationDao userActivationDao , Sendable[] sendables) {
		this.userService = userService;
		this.sendables = sendables;
		this.userActivationDao = userActivationDao;
	}

	@Override
	public void add(User user) {
		UUID uuid = UUID.randomUUID();
		String activationCode = uuid.toString();
		
		this.userActivationDao.add(new UserActivation(1, user.getId(), activationCode));
		
		this.runSandables(user, activationCode);
	}

	@Override
	public void check(String activationCode) {
		UserActivation userActivation = this.userActivationDao.get(u -> u.getActivationCode() == activationCode);
		if(userActivation != null) {
			int userId = userActivation.getUserId();
			User user = this.userService.get(u -> u.getId() == userId);
			user.setActive(true);
			this.userService.update(user);
			System.out.println(ValidationMessage.userActivated);
		}else {
			System.out.println(ValidationMessage.activationCodeNotFound);
		}
		
	}
	
	private void runSandables(User user, String message) {
		for (Sendable sendable : sendables) {
			if(sendable.getClass().getAnnotatedInterfaces()[0].getType() == MailService.class) {
				Mail mail = new Mail(user.getEmail(), message);
				SendableUtils.run(sendable,mail);
			}else if(sendable.getClass().getAnnotatedInterfaces()[0].getType() == SmsService.class) {
				Sms sms = new Sms(user.getPhoneNumber(), message);
				SendableUtils.run(sendable, sms);
			}
		}
	}
	

}
