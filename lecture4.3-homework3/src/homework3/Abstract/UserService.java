package homework3.Abstract;

import homework3.Entity.User;

public interface UserService {
	void add(User user);
	void addBulk(User[] users);
	void update(User user);
	void delete(User user);
}
