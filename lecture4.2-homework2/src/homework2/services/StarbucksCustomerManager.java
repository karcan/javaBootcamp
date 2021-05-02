package homework2.services;

import homework2.abstracts.CustomerManager;
import homework2.entities.Customer;
import homework2.interfaces.CustomerCheckService;
import homework2.interfaces.Result;
import homework2.utils.CheckServiceUtils;

public class StarbucksCustomerManager extends CustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void add(Customer customer) {

		Result result =  CheckServiceUtils.runCheckServices(new Result[] {
				customerCheckService.CheckIfRealPerson(customer), 
				customerCheckService.CheckIfYoungerAgeThan(customer, 15)
				});
		
		if(!result.isSuccess()) {
			System.out.println(result.getMessage());
			return;
		}
		
		super.add(customer);
	}
}
