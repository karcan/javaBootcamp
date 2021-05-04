package homework3.Concrete;

import homework3.Abstract.BaseUserManager;
import homework3.Abstract.UserCheckService;
import homework3.Entity.User;
import homework3.Utils.ServiceUtils;
import homework3.Utils.Result.Result;

public class PlayerManager extends BaseUserManager {
	private UserCheckService userCheckService;
	
	public PlayerManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		Result result = ServiceUtils.runChecks(
				userCheckService.checkIsRealUser(user)
				);
		
		if(!result.isSuccess()) {
			System.out.println(result.getMessage());
			return;
		}
		
		super.add(user);
	}
	
	@Override
	public void addBulk(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

}
