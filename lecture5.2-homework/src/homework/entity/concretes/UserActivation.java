package homework.entity.concretes;

import homework.core.dataAccess.abstracts.Entity;

public class UserActivation implements Entity {
	private int id;
	private int userId;
	private String activationCode;
	
	public UserActivation() {
		
	}
	
	public UserActivation(int id, int userId, String activationCode) {
		super();
		this.id = id;
		this.userId = userId;
		this.activationCode = activationCode;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getActivationCode() {
		return activationCode;
	}
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}
	
	
}
