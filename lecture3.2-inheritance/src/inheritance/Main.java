package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.setCustomerNumber("12345");
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.setCustomerNumber("78910");
		
		SyndicateCustomer syndicateCustomer = new SyndicateCustomer();
		syndicateCustomer.setCustomerNumber("99999");
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.addMultiple(new Customer[] {engin,hepsiBurada,syndicateCustomer});
		
	}
}
