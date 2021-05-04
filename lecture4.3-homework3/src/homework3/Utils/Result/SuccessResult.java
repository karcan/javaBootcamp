package homework3.Utils.Result;

public class SuccessResult implements Result {
	private boolean success;
	private String message;
	
	public SuccessResult() {
		this.success = true;
	}
	
	public SuccessResult(Boolean success, String message) {
		this();
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getMessage() {
		return message;
	}
	
}
