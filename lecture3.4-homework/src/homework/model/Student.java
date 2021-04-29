package homework.model;

public class Student extends User{
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String email, String username, String password, String avatarUrl) {
		super(id, firstName, lastName, email, username, password, avatarUrl);
	}
	
	
}
