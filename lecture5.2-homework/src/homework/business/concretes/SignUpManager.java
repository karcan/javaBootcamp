package homework.business.concretes;

import homework.business.abstracts.BaseSignUpManager;
import homework.business.abstracts.UserService;

public class SignUpManager extends BaseSignUpManager {
	
	
	public SignUpManager(UserService userService) {
		super(userService);
	}


}
