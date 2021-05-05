package homework3.Abstract;

import java.util.ArrayList;

import homework3.Entity.User;

public abstract class BaseUserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getId() + " : eklenmiştir.");		
	}
	
	@Override 
	public void addBulk(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}

	@Override
	public void update(User user) {
		System.out.println(user.getId() + " : güncellenmiştir.");		
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getId() + " : silinmiştir.");		
		
	}
	
	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
