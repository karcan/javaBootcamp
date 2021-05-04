package homework3.Entity;

public class Product {
	private int id;
	private String name;
	private String description;
	private double sellingPrice;
	private int categoryId;
	
	public Product(int id, String name, String description, double sellingPrice, int categoryId) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.sellingPrice = sellingPrice;
		this.categoryId = categoryId;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
}
