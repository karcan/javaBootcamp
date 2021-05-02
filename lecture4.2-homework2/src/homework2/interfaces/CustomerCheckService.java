package homework2.interfaces;

import homework2.entities.Customer;

public interface CustomerCheckService {
	Result CheckPersonIdentity(Customer customer);
	Result CheckIfSmallerAgeThan(Customer customer, int age);
}
