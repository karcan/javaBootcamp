package homework.model;

public class Instructor extends User {
	
	private String preface;
	private String about;
	
	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName, String email, String username, String password, String avatarUrl) {
		super(id, firstName, lastName, email, username, password, avatarUrl);
	}
	
	public Instructor(int id, String firstName, String lastName, String email, String username, String password, String avatarUrl, String preface, String about) {
		this(id, firstName, lastName, email, username, password, avatarUrl);
		this.setPreface(preface);
		this.setAbout(about);
	}

	public String getPreface() {
		return preface;
	}

	public void setPreface(String preface) {
		this.preface = preface;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
}
