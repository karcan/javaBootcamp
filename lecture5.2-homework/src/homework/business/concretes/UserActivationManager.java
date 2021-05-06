package homework.business.concretes;

import java.util.UUID;

import homework.business.abstracts.UserActivationService;
import homework.business.consts.Environment;
import homework.core.utils.consts.ValidationMessage;
import homework.core.utils.mail.MailService;
import homework.dataAccess.abstracts.UserActivationDao;
import homework.dataAccess.abstracts.UserDao;
import homework.entity.concretes.User;
import homework.entity.concretes.UserActivation;

public class UserActivationManager implements UserActivationService {
	
	private UserDao userDao;
	private UserActivationDao userActivationDao;
	private MailService mailService;
	
	public UserActivationManager(UserDao userDao, UserActivationDao userActivationDao , MailService mailService) {
		this.userDao = userDao;
		this.mailService = mailService;
		this.userActivationDao = userActivationDao;
	}

	@Override
	public void add(User user) {
		UUID uuid = UUID.randomUUID();
		String activationCode = uuid.toString();
		
		this.userActivationDao.add(new UserActivation(1, user.getId(), activationCode));
		this.mailService.sendMail(user.getEmail(), Environment.url + Environment.activationPath + activationCode);
	}

	@Override
	public void check(String activationCode) {
		UserActivation userActivation = this.userActivationDao.get(u -> u.getActivationCode() == activationCode);
		if(userActivation != null) {
			int userId = userActivation.getUserId();
			User user = this.userDao.get(u -> u.getId() == userId);
			user.setActive(true);
			this.userDao.update(user);
			System.out.println(ValidationMessage.userActivated);
		}else {
			System.out.println(ValidationMessage.activationCodeNotFound);
		}
		
	}

}
