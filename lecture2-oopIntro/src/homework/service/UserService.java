package homework.service;

import java.util.ArrayList;
import java.util.List;

import homework.constant.Message;
import homework.constant.Validation;
import homework.model.User;

public class UserService {
	
	private List<User> _users;
	
	public UserService() { 
		this._users =  new ArrayList<User>();
	}
	
	public void add(User user) {
		
		if(!this.checkNameLength(user)) {
			System.out.println("\"" + user.name + "\" " + Validation.nameLengthExceeded);
			return;
		}
		
		this._users.add(user);
		System.out.println(user.name + " " + Message.Added);
	}
	
	public void add(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}
	
	public void update(User user) {
		
		if(!this.checkNameLength(user)) {
			System.out.println("\"" + user.name + "\" " + Validation.nameLengthExceeded);
			return;
		}
		
		int userIndex = this._users.indexOf(user);
		
		this._users.set(userIndex, user);
		System.out.println(user.name + " " + Message.Updated);
	}
	
	public void delete(User user) {
		
		int userIndex = this._users.indexOf(user);
		
		this._users.remove(userIndex);
		System.out.println(user.name + " " + Message.Deleted);
	}
	
	public User getById(int id) {
		
		return _users.stream().filter(u -> u.id == id).findFirst().get();
	}
	
	public List<User> getAll() {
		return _users;
	}
	
	private boolean checkNameLength(User user) {
		
		if(user.name.length() > 25) {
			return false;
		}
		
		return true;
	}
}
