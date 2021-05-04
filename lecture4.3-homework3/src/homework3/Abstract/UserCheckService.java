package homework3.Abstract;

import homework3.Entity.User;
import homework3.Utils.Result.Result;

public interface UserCheckService {
	public Result checkIsRealUser(User user);
}
