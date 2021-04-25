package camp;

public class Product {

	public Product() {

	}

	public Product(int id, String name, String shortDescription, double unitPrice) {
		this.id = id;
		this.name = name;
		this.shortDescription = shortDescription;
		this.unitPrice = unitPrice;
	}

	int id;
	String name;
	String shortDescription;
	double unitPrice;

}
