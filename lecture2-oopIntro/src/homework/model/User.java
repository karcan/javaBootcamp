package homework.model;

public class User {
	
	public User() {}
	
	public User(int id, String name, String surname, String mail, String username, String password) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.username = username;
		this.password = password;
	}
	
	public int id;
	public String name;
	public String surname;
	public String mail;
	public String username;
	public String password;
}