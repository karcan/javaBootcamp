package homework.business.abstracts;

import homework.core.utils.security.signUp.SignUpService;
import homework.entity.concretes.User;

public abstract class BaseSignUpManager implements SignUpService{

	private UserService userService;
	
	public BaseSignUpManager(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public void register(User user) {
		this.userService.add(user);
	}
	
}
