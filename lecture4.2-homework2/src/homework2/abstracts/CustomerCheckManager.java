package homework2.abstracts;


import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;


import homework2.entities.Customer;
import homework2.interfaces.CustomerCheckService;
import homework2.interfaces.Result;

public abstract class CustomerCheckManager implements CustomerCheckService {

	@Override
	public Result CheckIfRealPerson(Customer customer) {
		
		return new homework2.utils.Result(true);
	}

	@Override
	public final Result CheckIfYoungerAgeThan(Customer customer, int age) {
		LocalDate todayDateTime = LocalDate.now();
		LocalDate birthDate = customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int yearDifference = Period.between(birthDate, todayDateTime).getYears();
		if(yearDifference < age) {
			return new homework2.utils.Result(false, age + " yaşından küçük olamaz.");
		}
		return new homework2.utils.Result(true);
	}

}
