package homework.business.concretes;

import java.util.List;
import java.util.function.Predicate;

import homework.business.abstracts.UserService;
import homework.business.abstracts.UserValidationService;
import homework.dataAccess.abstracts.UserDao;
import homework.entity.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private UserValidationService userValidationService;
	
	public UserManager(UserDao userDao, UserValidationService userValidationService) {
		this.userDao = userDao;
		this.userValidationService = userValidationService;
	}
	
	@Override
	public void add(User user) {
		try {
			this.userValidationService.validate(user);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		this.userDao.add(user);
	}

	@Override
	public void update(User user) {
		try {
			this.userValidationService.validate(user);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		this.userDao.update(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public User get(Predicate<User> predicate) {
		return this.userDao.get(predicate);
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

	@Override
	public List<User> getAll(Predicate<User> predicate) {
		return this.userDao.getAll(predicate);
	}

}
