package homework3.Concrete;

import homework3.Abstract.BaseUserCheckManager;
import homework3.Abstract.IdentityValidationService;
import homework3.Entity.Player;
import homework3.Entity.User;
import homework3.Utils.Result.Result;

public class PlayerCheckManager extends BaseUserCheckManager {
	private IdentityValidationService identityValidationService;
	
	public PlayerCheckManager(IdentityValidationService identityValidationService){
		this.identityValidationService = identityValidationService;
	}
	
	@Override
	public Result checkIsRealUser(User user) {
		Player player = (Player)user;
		return this.identityValidationService.CheckIfRealPerson(
				player.getIdentityNumber(), 
				player.getFirstName(), 
				player.getLastName(), 
				player.getBirthDate()
				);
	}
}
