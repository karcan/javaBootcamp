package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger logger) {
		this.loggers = new Logger[] {logger};
	}
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	//loosely - tightly coupled
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi " + customer.getFirstName());	
		
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
	}
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi " + customer.getFirstName());
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
	}
}
