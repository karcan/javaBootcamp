package homework.service;

import homework.model.Course;
import homework.model.User;

public class UserManager {
	
	public void add(User user) {
		
		if(!this.checkEmailCorrect(user)) {
			return;
		}
		
		System.out.println(user.getFirstName()+" "+user.getLastName() + " added.");
	}
	
	public void update(User user) {
		
		if(!this.checkEmailCorrect(user)) {
			return;
		}
		
		System.out.println(user.getFirstName()+" "+user.getLastName() + " updated.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + " deleted.");
	}
	
	public Course[] getCourses(int userId) {
		System.out.println("user courses listed.");
		return new Course[] {};
	}
	
	public User[] getAll() {
		System.out.println("all users brought");
		return new User[] {};
	}
	
	public User getById(int id) {
		System.out.println("user brought");
		return new User();
	}
	
	public User[] getByCourseId(int courseId) {
		System.out.println("users brought");
		return new User[] {};
	}
	
	public User getByMail(String mail) {
		System.out.println("user brought");
		return new User();
	}
	
	private boolean checkEmailCorrect(User user) {
		if(user.getEmail().length() <= 15) {
			System.out.println("Mail adress is incorrect.");
			return false;
		}
		return true;
	}

}
