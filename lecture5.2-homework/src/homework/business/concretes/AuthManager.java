package homework.business.concretes;

import homework.business.abstracts.AuthCheckService;
import homework.business.abstracts.AuthService;
import homework.core.utils.consts.ValidationMessage;
import homework.core.utils.security.signUp.SignUpService;
import homework.entity.concretes.User;

public class AuthManager implements AuthService {
	
	private AuthCheckService authCheckService;
	private SignUpService signUpService;
	
	public AuthManager(AuthCheckService authCheckService, SignUpService signUpService) {
		this.authCheckService = authCheckService;
		this.signUpService = signUpService;
	}

	@Override
	public void login(String email, String password) {
		boolean thrown = false;
		try {
			this.authCheckService.checkForRegister(email,password);
		} catch (Exception e) {
			thrown = true;
			e.printStackTrace();
		} finally {

			if(!thrown) {
				System.out.println(ValidationMessage.userEmailOrPasswordNotFound);
			}	
		}	
		
	
		
	}

	@Override
	public void register(User user) {
		this.signUpService.register(user);
	}
	
}
