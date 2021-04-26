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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
