package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.setCustomerNumber("12345");
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.setCustomerNumber("78910");
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(engin);
		customerManager.add(hepsiBurada);
		
	}
}
