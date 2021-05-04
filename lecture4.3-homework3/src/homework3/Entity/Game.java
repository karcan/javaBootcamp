package homework3.Entity;

public class Game extends Product {
	private int gameProducerId;

	public Game(int id, String name, String description, double sellingPrice, int categoryId, int gameProducerId) {
		super(id, name, description, sellingPrice, categoryId);
		this.gameProducerId = gameProducerId;
	}

	public int getGameProducerId() {
		return gameProducerId;
	}

	public void setGameProducerId(int gameProducerId) {
		this.gameProducerId = gameProducerId;
	}
	
	
	
}
