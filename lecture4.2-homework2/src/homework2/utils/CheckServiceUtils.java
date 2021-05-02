package homework2.utils;

import homework2.interfaces.Result;

public class CheckServiceUtils {
	public static Result runCheckServices(Result[] customerCheckServices) {
		for (Result customerCheckService : customerCheckServices) {
			if(!customerCheckService.isSuccess()) {
				return customerCheckService;
			}
		}
		return new homework2.models.Result(true);
	}
}
