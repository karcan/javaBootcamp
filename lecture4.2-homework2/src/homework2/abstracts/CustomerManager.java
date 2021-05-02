package homework2.abstracts;

import homework2.entities.Customer;
import homework2.interfaces.CustomerService;

public abstract class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " başarılı bir şekilde kaydedildi.");
	}

}
