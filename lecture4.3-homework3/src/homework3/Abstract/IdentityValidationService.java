package homework3.Abstract;

import java.util.Date;

import homework3.Utils.Result.Result;

public interface IdentityValidationService {
	Result CheckIfRealPerson(Long identityNumber, String firstName, String lastName, int birthYear);
	Result CheckIfRealPerson(String identityNumber, String firstName, String lastName, Date birthDate);
	Result CheckIfRealPerson(Long identityNumber, String firstName, String lastName, Date birthDate);
}
