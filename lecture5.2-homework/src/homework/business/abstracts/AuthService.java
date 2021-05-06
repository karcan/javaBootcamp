package homework.business.abstracts;

import homework.entity.concretes.User;

public interface AuthService {
	public void login(String email, String password);
	public void register(User user);
}
