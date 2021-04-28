package inheritance;

public class CorporateCustomer extends Customer {
	String companyName;
	String taxNumber;
	
	public CorporateCustomer() {
	}
	
	public CorporateCustomer (int id, String customerNumber,  String companyName, String taxNumber){
		super(id,customerNumber);
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}
}
