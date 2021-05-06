package homework.business.concretes;

import java.util.regex.Pattern;

import homework.business.abstracts.UserValidationService;
import homework.core.utils.ValidationServiceUtils;
import homework.core.utils.consts.ValidationMessage;
import homework.core.utils.result.ErrorResult;
import homework.core.utils.result.Result;
import homework.core.utils.result.SuccessResult;
import homework.entity.concretes.User;

public class UserValidationManager implements UserValidationService {

	public UserValidationManager() {

	}

	@Override
	public void validate(User user) throws Exception {
		Result[] results = ValidationServiceUtils.runValidates(this.checkFirstNameNotNull(user.getFirstName()),
				this.checkLastNameNotNull(user.getLastName()), this.checkEmailNotNull(user.getEmail()),
				this.checkPasswordNotNull(user.getPassword()), this.checkPasswordMinLength(user.getPassword()),
				this.checkEmailIsValid(user.getEmail()), this.checkFirstNameMinLength(user.getFirstName()),
				this.checkLastNameMinLength(user.getLastName()));
		for (Result result : results) {
			if (!result.isSuccess()) {
				throw new Exception(result.getMessage());
			}
		}
	}

	private Result checkFirstNameNotNull(String firstName) {
		if (firstName.isEmpty() || firstName == null) {
			return new ErrorResult(ValidationMessage.firstNameCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}

	private Result checkLastNameNotNull(String lastName) {
		if (lastName.isEmpty() || lastName == null) {
			return new ErrorResult(ValidationMessage.lastNameCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}

	private Result checkEmailNotNull(String email) {
		if (email.isEmpty() || email == null) {
			return new ErrorResult(ValidationMessage.emailCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}

	private Result checkPasswordNotNull(String password) {
		if (password.isEmpty() || password == null) {
			return new ErrorResult(ValidationMessage.passwordCanNotBeNullOrEmpty);
		}
		return new SuccessResult();
	}

	private Result checkPasswordMinLength(String password) {
		if (password.length() < 6) {
			return new ErrorResult(ValidationMessage.passwordLeastCharacter.replace("`n`", "6"));
		}
		return new SuccessResult();
	}

	private Result checkEmailIsValid(String email) {
		String regexString = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		if (!Pattern.compile(regexString).matcher(email).matches()) {
			return new ErrorResult(ValidationMessage.emailNotValid);
		}
		return new SuccessResult();
	}

	private Result checkFirstNameMinLength(String firstName) {
		if (firstName.length() < 2) {
			return new ErrorResult(ValidationMessage.firstNameLeastCharacter);
		}
		return new SuccessResult();
	}

	private Result checkLastNameMinLength(String lastName) {
		if (lastName.length() < 2) {
			return new ErrorResult(ValidationMessage.lastNameLeastCharacter);
		}
		return new SuccessResult();
	}

}
