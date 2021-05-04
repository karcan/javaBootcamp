package homework3.Entity;

public class User {
	private int id;
	private String userCode;

	public User(int id, String userCode) {
		this.id = id;
		this.userCode = userCode;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	
}
