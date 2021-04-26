package homework.model;

public class User {
	
	public User() {} 
	
	public User(int id, String name, String surname, String mail, String username, String password) {
		this.setId(id);
		this.setName(name);
		this.setSurname(surname);
		this.setMail(mail);
		this.setUsername(username);
		this.setPassword(password);
	}
	
	private int id;
	private String name;
	private String surname;
	private String mail;
	private String username;
	private String password;
	
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
