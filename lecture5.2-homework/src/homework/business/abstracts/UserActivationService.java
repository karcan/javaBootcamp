package homework.business.abstracts;

import homework.entity.concretes.User;

public interface UserActivationService {
	public void add(User user);
	public void check(String activationCode); 
}
