package homework.model;

public class State {
	
	public State() {} 
	
	public State(int id, String name) {
		this.setId(id);
		this.setName(name);
	}
	
	public int id;
	public String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
