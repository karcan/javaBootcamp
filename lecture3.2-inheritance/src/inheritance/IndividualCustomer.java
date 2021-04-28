package inheritance;

public class IndividualCustomer extends Customer {
	
	String firstName;
	String lastName;
	String nationalIdentity;
	
	public IndividualCustomer() {
		
	}

	public IndividualCustomer(int id, String customerNumber, String firstName, String lastName, String nationalIdentity) {
		super(id,customerNumber);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
	}
}
