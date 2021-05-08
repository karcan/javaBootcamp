package homework.business.adapters;

import homework.business.abstracts.BaseSignUpManager;
import homework.business.abstracts.UserService;
import homework.core.utils.consts.ValidationMessage;
import homework.entity.concretes.User;
import homework.googleAuth.GoogleSignUpManager;

public class GoogleSignUpManagerAdapter extends BaseSignUpManager {
	
	

	public GoogleSignUpManagerAdapter(UserService userService) {
		super(userService);
	}

	@Override
	public void register(User user) {
		GoogleSignUpManager googleSignUpManager = new GoogleSignUpManager();
		boolean result = googleSignUpManager.login(user.getEmail());
		if(result) {
			super.register(user);
			System.out.println(ValidationMessage.googleSignUpSuccessful);
		}else {
			System.out.println(ValidationMessage.googleSignUpFailed);
		}
	}

}
