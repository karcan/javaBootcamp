package homework.business.abstracts;

import homework.entity.concretes.User;

public interface UserValidationService  {
	public void validate(User user) throws Exception;
}
