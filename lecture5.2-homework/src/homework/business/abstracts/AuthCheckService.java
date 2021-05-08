package homework.business.abstracts;


public interface AuthCheckService {
	void checkForRegister(String email, String password) throws Exception ;
}
