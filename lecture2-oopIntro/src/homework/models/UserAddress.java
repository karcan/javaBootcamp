package homework.models;

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
}
