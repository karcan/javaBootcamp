package homework.Abstract;

import homework.Entity.User;

public interface UserCheckService {
	boolean isRealPerson(User user); 
	<T extends User, I extends User> boolean instanceOf(T entity, Class<I> _class);
	<T extends User, I extends User> I boxing(T entity, Class<I> _class);
}
