package homework2.services;

import homework2.abstracts.CustomerCheckManager;
import homework2.entities.Customer;
import homework2.interfaces.RealPersonService;
import homework2.interfaces.Result;

public class StarbucksCustomerCheckManager extends CustomerCheckManager{
	
	private RealPersonService realPersonService;
	
	public StarbucksCustomerCheckManager(RealPersonService realPersonService){
		this.realPersonService = realPersonService;
	}
	
	@Override
	public Result CheckIfRealPerson(Customer customer) {
		
		return realPersonService.CheckIfRealPerson(customer);
	}
}
