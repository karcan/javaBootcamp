package homework.model;

public class UserAddress {
	
	public UserAddress() {} 
	
	public UserAddress(int id, int userId, int countryId, String street1, String street2, String city, int stateId, String zipCode) {
		this.id = id;
		this.userId = userId;
		this.countryId = countryId;
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.stateId = stateId;
		this.zipCode = zipCode;
	}
	
	public int id;
	public int userId;
	public int countryId;
	public String street1;
	public String street2;
	public String city;
	public int stateId;
	public String zipCode;
	
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
