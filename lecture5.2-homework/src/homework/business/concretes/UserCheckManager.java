package homework.business.concretes;

import homework.business.abstracts.UserCheckService;
import homework.core.utils.ServiceUtils;
import homework.core.utils.consts.ValidationMessage;
import homework.core.utils.result.ErrorResult;
import homework.core.utils.result.Result;
import homework.core.utils.result.SuccessResult;
import homework.dataAccess.abstracts.UserDao;
import homework.entity.concretes.User;

public class UserCheckManager implements UserCheckService {

	private UserDao userDao;
	
	public UserCheckManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public void check(User user) throws Exception {
		Result[] results = ServiceUtils.runChecks(this.checkDuplicateEmail(user.getEmail()));
		
		for (Result result : results) {
			if (!result.isSuccess()) {
				throw new Exception(result.getMessage());
			}
		}
	}
	
	private Result checkDuplicateEmail(String email) {
		if(this.userDao.get(u -> u.getEmail() == email) != null) {
			return new ErrorResult(ValidationMessage.emailAlreadyExists);
		}
		
		return new SuccessResult();
	}
	
}
