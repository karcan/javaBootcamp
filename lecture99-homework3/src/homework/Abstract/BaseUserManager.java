package homework.Abstract;

import homework.Entity.User;

public abstract class BaseUserManager implements UserService {
	
	
	
	public void add(User user){
		System.out.println("kullanıcı oluşturuldu : ");
	}
	public void update(User user) {
		System.out.println("kullanıcı güncellendi : ");
	}
	public void delete(User user) {
		System.out.println("kullanıcı silindi : ");
	}
}
