package homework3.Entity;

public class GameProducer extends User {
	private String name;
	private String description;
	
	public GameProducer(int id, String userCode, String name, String description) {
		super(id, userCode);
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
