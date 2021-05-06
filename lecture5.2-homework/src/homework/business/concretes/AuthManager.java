package homework.business.concretes;

import homework.business.abstracts.AuthService;
import homework.core.utils.consts.ValidationMessage;
import homework.core.utils.security.signUp.SignUpService;
import homework.dataAccess.abstracts.UserDao;
import homework.entity.concretes.User;

public class AuthManager implements AuthService {
	
	private UserDao userDao;
	private SignUpService signUpService;
	
	public AuthManager(UserDao userDao, SignUpService signUpService) {
		this.userDao = userDao;
		this.signUpService = signUpService;
	}

	@Override
	public void login(String email, String password) {

		if(this.userDao.get(u -> u.getEmail() == email && u.getPassword() == password) != null) {
			System.out.println(ValidationMessage.userLoggedIn);
		}else {
			System.out.println(ValidationMessage.userEmailOrPasswordNotFound);
		}
	}

	@Override
	public void register(User user) {
		this.signUpService.register(user);
	}
	
}
