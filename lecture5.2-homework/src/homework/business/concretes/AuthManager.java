package homework.business.concretes;

import homework.business.abstracts.AuthService;
import homework.business.abstracts.UserService;
import homework.core.utils.consts.ValidationMessage;
import homework.core.utils.security.signUp.SignUpService;
import homework.entity.concretes.User;

public class AuthManager implements AuthService {
	
	private UserService userService;
	private SignUpService signUpService;
	
	public AuthManager(UserService userService, SignUpService signUpService) {
		this.userService = userService;
		this.signUpService = signUpService;
	}

	@Override
	public void login(String email, String password) {

		if(this.userService.get(u -> u.getEmail() == email && u.getPassword() == password) != null) {
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
