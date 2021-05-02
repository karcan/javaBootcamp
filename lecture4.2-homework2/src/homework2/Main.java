package homework2;

import java.util.GregorianCalendar;

import homework2.abstracts.CustomerCheckManager;
import homework2.entities.Customer;
import homework2.interfaces.CustomerService;
import homework2.services.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {

		Customer enginCustomer = new Customer();
		enginCustomer.setId(1);
		enginCustomer.setFirstName("Engin");
		enginCustomer.setLastName("Demiroğ");
		enginCustomer.setBirthDate(new GregorianCalendar(1986, 5 , 1).getTime());
		
		CustomerService customerService = new StarbucksCustomerManager(new CustomerCheckManager());
		customerService.add(enginCustomer);
	}

}
