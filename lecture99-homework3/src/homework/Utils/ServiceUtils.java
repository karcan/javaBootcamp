package homework.Utils;

import homework.Abstract.Entity;

public class ServiceUtils {
	
	public static <T extends Entity, I extends Entity> boolean instanceOf(T entity, Class<I> instance) {
		return instance.isInstance(entity) ? true : false;
	}
	
	public static boolean runRules(boolean[] rules) {
		for (boolean rule : rules) {
			if(!rule)
				return false;
		}
		return true;
	}
}
