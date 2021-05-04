package homework.Concrete;

import homework.Abstract.BaseUserCheckManager;
import homework.Entity.User;

public class PlayerUserCheckManager extends BaseUserCheckManager {
	
	@Override
	public boolean isRealPerson(User user) {
		
		return false;
	}

}
