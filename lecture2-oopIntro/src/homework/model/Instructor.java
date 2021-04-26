package homework.model;

public class Instructor extends User {
	
	public Instructor() {}
	 
	public Instructor(int id, String name, String surname, String mail, String username, String password, String about) {
		super(id, name, surname, mail, username, password);
		this.setAbout(about);
	}
	
	public String about;

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	
}
