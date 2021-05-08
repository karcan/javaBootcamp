package homework.business.concretes;

import homework.business.abstracts.AuthCheckService;
import homework.business.abstracts.UserService;
import homework.core.utils.ServiceUtils;
import homework.core.utils.consts.ValidationMessage;
import homework.core.utils.result.ErrorResult;
import homework.core.utils.result.Result;
import homework.core.utils.result.SuccessResult;
import homework.entity.concretes.User;

public class AuthCheckManager implements AuthCheckService {
	
	private UserService userService;
	
	public AuthCheckManager(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void checkForRegister(String email, String password) throws Exception{
		Result[] results = ServiceUtils.runChecks(
				checkUserIsExists(email,password), 
				checkUserIsActive(email)
				);
		this.check(results);
	}
	
	
	private void check(Result[] results) throws Exception{

		for (Result result : results) {
			if (!result.isSuccess()) {
				throw new Exception(result.getMessage());
			}
		}
	}
	
	private Result checkUserIsExists(String email, String password) {
		User user = this.userService.get(u -> u.getEmail() == email && u.getPassword() == password);
		if(user != null & !user.isActive()) {
			return new ErrorResult(ValidationMessage.needActivateUser);
		}
		
		return new SuccessResult();
	}
	
	private Result checkUserIsActive(String email) {
		if(this.userService.get(u -> u.getEmail() == email) != null) {
			return new ErrorResult(ValidationMessage.emailAlreadyExists);
		}
		
		return new SuccessResult();
	}

}
