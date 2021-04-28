package camp;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram",10);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setUnitPrice(16000);
		product2.setDetail("32 GB Ram");
		product2.setDiscount(10);
		
		Product product3 = new Product();
		product2.setId(3);
		product2.setName("HP 5");
		product2.setUnitPrice(17000);
		product2.setDetail("32 GB Ram");
		product2.setDiscount(10);
		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

	}

}
