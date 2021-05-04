package homework3.Utils;


import homework3.Utils.Result.Result;
import homework3.Utils.Result.SuccessResult;

public class ServiceUtils {
	public static Result runChecks(Result... results) {
		for (Result result : results) {
			if(!result.isSuccess()) {
				return result;
			}
		}
		return new SuccessResult();
	}

}
