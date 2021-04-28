package inheritance;

public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxNumber;
	
	public CorporateCustomer() {
	}
	
	public CorporateCustomer (int id, String customerNumber,  String companyName, String taxNumber){
		super(id,customerNumber);
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
