package homework2;

import java.util.GregorianCalendar;

import homework2.abstracts.CustomerCheckManager;
import homework2.adapters.MernisAdapter;
import homework2.entities.Customer;
import homework2.interfaces.CustomerService;
import homework2.services.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {

		Customer enginCustomer = new Customer();
		enginCustomer.setId(1);
		enginCustomer.setIdentityNumber("000000000");
		enginCustomer.setFirstName("Karcan");
		enginCustomer.setLastName("Özbal");
		enginCustomer.setBirthDate(new GregorianCalendar(1993, 11 , 16).getTime());
		
		CustomerService customerService = new StarbucksCustomerManager(new MernisAdapter());
		customerService.add(enginCustomer);
	}

}
