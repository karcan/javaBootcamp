package homework3.Entity;

public class Salesman extends User {
	private String firstName;
	private String lastName;
	
	public Salesman(int id, String userCode, String firstName, String lastName) {
		super(id, userCode);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
