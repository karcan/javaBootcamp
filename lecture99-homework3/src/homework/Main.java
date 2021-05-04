package homework;

import homework.Abstract.UserService;
import homework.Concrete.PlayerUserCheckManager;
import homework.Concrete.PlayerUserManager;
import homework.Entity.Player;
import homework.Entity.User;


public class Main {

	public static void main(String[] args) throws Exception {
		
		UserService userService = new PlayerUserManager(new PlayerUserCheckManager());
		Player player = new Player();
		player.firstName = "ad";
		player.lastName = "soyad";
		User user = new User();
		userService.add(user);
	}

}
