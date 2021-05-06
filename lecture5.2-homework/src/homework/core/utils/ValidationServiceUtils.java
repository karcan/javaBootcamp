package homework.core.utils;

import java.util.ArrayList;
import java.util.List;

import homework.core.utils.result.Result;

public class ValidationServiceUtils {
	public static Result[] runValidates(Result... results) {
		List<Result> resultList = new ArrayList<Result>();
		for (Result result : results) {
			if(!result.isSuccess()) {
				resultList.add(result);
			}
		}
		return resultList.toArray(new Result[resultList.size()]);
	}
}
