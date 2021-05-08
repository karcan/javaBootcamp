package homework.business.abstracts;

import homework.entity.concretes.User;

public interface UserValidationService  {
	public void validateForAdd(User user) throws Exception;
}
