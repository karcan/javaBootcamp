package homework.service;

import homework.model.Student;

public class StudentManager extends UserManager{


	public void add(Student student) {
		if(!this.checkUsernameLength(student)) {
			return;
		}
		
		super.add(student);
	}
	
	public void update(Student student) {
		if(!this.checkUsernameLength(student)) {
			return;
		}
		
		super.update(student); 
	}
	
	private boolean checkUsernameLength(Student student) {
		if(student.getUsername().length() <= 3) {
			System.out.println("username cannot be less then 3 characters.");
			return false;
		}
		
		return true;
	}
}
