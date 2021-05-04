package homework.Concrete;

import homework.Abstract.BaseUserManager;
import homework.Abstract.UserCheckService;
import homework.Entity.Player;
import homework.Entity.User;

public class PlayerUserManager extends BaseUserManager{
	
	private UserCheckService userCheckService;
	
	public PlayerUserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user){

		user = userCheckService.boxing(user, Player.class);
		
		if(user != null) {
			super.add(user);
		}
		
	}
	
	public <T extends User, I extends User> void instanceOf(T entity, Class<I> instance) {
		System.out.println(instance.isInstance(entity));
	}
}
