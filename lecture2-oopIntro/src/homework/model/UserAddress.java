package homework.model;

public class UserAddress {
	
	private int id;
	private int userId;
	private int countryId;
	private String street1;
	private String street2;
	private String city;
	private int stateId;
	private String zipCode;
	
	public UserAddress() {} 
	
	public UserAddress(int id, int userId, int countryId, String street1, String street2, String city, int stateId, String zipCode) {
		this.setId(id);
		this.setUserId(userId);
		this.setCountryId(countryId);
		this.setStreet1(street1);
		this.setStreet2(street2);
		this.setCity(city);
		this.setStateId(stateId);
		this.setZipCode(zipCode);
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

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
