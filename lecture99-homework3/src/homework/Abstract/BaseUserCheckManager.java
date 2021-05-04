package homework.Abstract;


import homework.Entity.User;
import homework.Utils.ServiceUtils;

public abstract class BaseUserCheckManager implements UserCheckService {

	@Override
	public abstract boolean isRealPerson(User user);
	
	
	@Override
	public <T extends User, I extends User> boolean instanceOf(T entity, Class<I> _class) {
		if(!ServiceUtils.instanceOf(entity, _class)) {
			System.out.println(entity.getClass().getSimpleName() + " is not instance of " + _class.getSimpleName());
			return false;
		}		
		
		return true;
	}

	@Override
	public <T extends User, I extends User> I boxing(T entity, Class<I> _class) {
		return this.instanceOf(entity, _class) ? _class.cast(entity) : null;
	}


	
	
}
