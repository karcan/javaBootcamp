package homework.core.utils.sendable.mail;

public class Mail {
	private String mailAddress;
	private String message;
	
	public Mail() {
		
	}

	public Mail(String mailAddress, String message) {
		super();
		this.mailAddress = mailAddress;
		this.message = message;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	
}
