package homework;

import homework.business.abstracts.UserService;
import homework.business.concretes.UserManager;
import homework.business.concretes.UserValidationManager;
import homework.dataAccess.concretes.inMemory.InMemoryUserDao;
import homework.entity.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new InMemoryUserDao(), new UserValidationManager());
		User user = new User
				(1,
				"Karcan",
				"Özbal",
				"karcanozbal@outlook.com.tr",
				"123456"
				);
		userService.add(user);
		
		userService.getAll().forEach(u -> {
			System.out.println(u.toString());
		});
	}

}
